package global.coda.hms.constant;

/**
 * class for Application Constants.
 *
 * @author Chandraleka
 *
 */
public class ApplicationConstant {
  public static final int NUMBER404 = 404;

  public static final String HMSUC001 = "INSERT INTO t_user (user_name, user_password, "
      + "user_age, user_gender, user_mobile_number, " + "user_email_id, user_address_line1, "
      + "user_address_line2, " + "user_address_line3, fk_role_id) VALUES (#{userName}, "
      + "#{userPassword}, #{userAge}, #{userGender}, #{userMobileNumber}, "
      + "#{userEmailId}, #{userAddressLine1}, #{userAddressLine2}, #{userAddressLine3}, 4)";
  public static final String HMSUU001 = "<script>UPDATE t_user SET <if test='userName!=null'>user_name = #{userName}</if> "
      + "<if test='userPassword!=null'>,user_password=#{userPassword}</if> <if test='userAge!=null'>,user_age=#{userAge}</if><if test='userGender!=null'>,user_gender=#{userGender}</if> "
      + "<if test='userMobileNumber!=null'>,user_mobile_number=#{userMobileNumber}</if> <if test='userEmailId!=null'>,user_email_id=#{userEmailId}</if> "
      + "<if test='userAddressLine1!=null'>,user_address_line1=#{userAddressLine1}</if> <if test='userAddressLine2!=null'>,user_address_line2=#{userAddressLine2}</if> "
      + "<if test='userAddressLine2!=null'>,user_address_line3 = #{userAddressLine3}</if> WHERE pk_user_id = #{userId}</script>";

  public static final String HMSPR001 = "SELECT pk_user_id as user_id,user_name,user_password, "
      + "user_age, user_gender, user_mobile_number, user_email_id, "
      + "user_address_line1, user_address_line2, user_address_line3,fk_role_id as user_role_id, "
      + "patient_disease FROM t_user JOIN t_patient ON t_user.pk_user_id=t_patient.fk_user_id "
      + "WHERE t_user.is_delete=0 and t_user.pk_user_id=#{userId}";
  public static final String HMSPAR001 = "SELECT pk_user_id as user_id,user_name,"
      + "user_password, user_age, user_gender, user_mobile_number, user_email_id, "
      + "user_address_line1, user_address_line2, user_address_line3,fk_role_id as user_role_id, "
      + "patient_disease FROM t_user JOIN t_patient ON t_user.pk_user_id=t_patient.fk_user_id "
      + "WHERE t_user.is_delete=0";
  public static final String HMSPC001 = "INSERT INTO t_patient (fk_user_id,patient_disease) "
      + "VALUES (#{userId},#{patientDisease})";
  public static final String HMSPD001 = "UPDATE t_user SET is_delete = 1 "
      + "WHERE pk_user_id = #{userId} AND is_delete= 0";

  public static final String HMSDAR001 = "SELECT pk_user_id,user_name,"
      + "user_password, user_age, user_gender, user_mobile_number, user_email_id, "
      + "user_address_line1, user_address_line2, user_address_line3,fk_role_id as user_role_id, "
      + "doctor_specialization, doctor_experience FROM t_user JOIN t_doctor ON "
      + "t_user.pk_user_id=t_doctor.fk_user_id WHERE t_user.is_delete=0";
  public static final String HMSDR001 = "<script>SELECT pk_user_id,user_name,user_password, user_age, "
      + "user_gender, user_mobile_number, user_email_id, user_address_line1, user_address_line2, "
      + "user_address_line3,fk_role_id, doctor_specialization, doctor_experience "
      + "FROM t_user JOIN t_doctor ON t_user.pk_user_id=t_doctor.fk_user_id WHERE "
      + "t_user.is_delete=0<if test='userId!=0'> and t_user.pk_user_id=#{userId}</if><if test='userId==0'>;</if></script>";
  public static final String HMSDC001 = "INSERT INTO t_doctor (fk_user_id,doctor_specialization,"
      + "doctor_experience) VALUES (#{userId},#{doctorSpecialization},#{doctorExperience})";
  public static final String HMSDD001 = "UPDATE t_doctor SET is_delete = 1 "
      + "WHERE fk_user_id = #{userId} AND is_delete= 0";

  public static final String HMSPUD001 = "SELECT * FROM t_user JOIN  t_patient "
      + "ON t_user.pk_user_id=t_patient.fk_user_id JOIN t_doctor_patient_mapping "
      + "WHERE t_user.pk_user_id=t_doctor_patient_mapping.fk_patient_id and "
      + "t_doctor_patient_mapping.fk_doctor_id=#{userId} and t_user.is_delete=0";
  public static final String HMSPUD002 = "SELECT * FROM t_user JOIN  t_patient "
      + "ON t_user.pk_user_id=t_patient.fk_user_id JOIN t_doctor_patient_mapping "
      + "WHERE t_user.pk_user_id=t_doctor_patient_mapping.fk_patient_id and "
      + "t_doctor_patient_mapping.fk_doctor_id in (select pk_user_id from t_user "
      + "where fk_role_id=3)" + " and t_user.is_delete=0";
}
