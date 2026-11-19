/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00acfc74
 */

undefined8 ossl_rsa_param_decode(long param_1,X509_ALGOR *param_2)

{
  int iVar1;
  undefined4 uVar2;
  undefined4 uVar3;
  undefined8 uVar4;
  RSA_PSS_PARAMS *a;
  X509_ALGOR *pXVar5;
  long lVar6;
  undefined8 *puVar7;
  int local_6c;
  void *pvStack_68;
  ASN1_OBJECT *local_60;
  undefined8 local_58;
  undefined8 uStack_50;
  undefined4 local_48;
  undefined4 local_40;
  undefined4 local_3c;
  undefined8 local_38;
  undefined8 local_28;
  
  X509_ALGOR_get0(&local_60,&local_6c,&pvStack_68,param_2);
  iVar1 = OBJ_obj2nid(local_60);
  if (iVar1 != 0x390) {
    return 1;
  }
  if (local_6c == -1) {
    return 1;
  }
  if (local_6c != 0x10) {
    ERR_new();
    ERR_set_debug("crypto/rsa/rsa_backend.c",0x217,"ossl_rsa_param_decode");
    ERR_set_error(4,0x95,0);
    return 0;
  }
  uVar4 = RSA_PSS_PARAMS_it();
  a = (RSA_PSS_PARAMS *)ASN1_TYPE_unpack_sequence(uVar4,param_2->parameter);
  if (a != (RSA_PSS_PARAMS *)0x0) {
    if (a->maskGenAlgorithm != (X509_ALGOR *)0x0) {
      pXVar5 = (X509_ALGOR *)ossl_x509_algor_mgf1_decode();
      a[1].hashAlgorithm = pXVar5;
      if (pXVar5 == (X509_ALGOR *)0x0) {
        RSA_PSS_PARAMS_free(a);
        a = (RSA_PSS_PARAMS *)0x0;
        goto LAB_00acfe18;
      }
    }
    iVar1 = ossl_rsa_set0_pss_params(param_1,a);
    if (iVar1 != 0) {
      if (((param_1 == 0) || (lVar6 = RSA_get0_pss_params(param_1), lVar6 == 0)) ||
         (puVar7 = (undefined8 *)ossl_rsa_get0_pss_params_30(param_1), puVar7 == (undefined8 *)0x0))
      {
        return 1;
      }
      local_28 = 0;
      local_38 = 0;
      iVar1 = ossl_rsa_pss_get_param_unverified(lVar6,&local_28,&local_38,&local_3c,&local_40);
      if (iVar1 == 0) {
        return 0;
      }
      uVar2 = EVP_MD_get_type(local_28);
      uVar3 = EVP_MD_get_type(local_38);
      iVar1 = ossl_rsa_pss_params_30_set_defaults(&local_58);
      if (iVar1 == 0) {
        return 0;
      }
      iVar1 = ossl_rsa_pss_params_30_set_hashalg(&local_58,uVar2);
      if (iVar1 == 0) {
        return 0;
      }
      iVar1 = ossl_rsa_pss_params_30_set_maskgenhashalg(&local_58,uVar3);
      if (iVar1 == 0) {
        return 0;
      }
      iVar1 = ossl_rsa_pss_params_30_set_saltlen(&local_58,local_3c);
      if (iVar1 == 0) {
        return 0;
      }
      iVar1 = ossl_rsa_pss_params_30_set_trailerfield(&local_58,local_40);
      if (iVar1 == 0) {
        return 0;
      }
      *(undefined4 *)(puVar7 + 2) = local_48;
      puVar7[1] = uStack_50;
      *puVar7 = local_58;
      return 1;
    }
  }
LAB_00acfe18:
  RSA_PSS_PARAMS_free(a);
  return 0;
}

