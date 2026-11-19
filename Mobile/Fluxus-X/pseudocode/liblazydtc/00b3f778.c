/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b3f778
 */

int FUN_00b3f778(BIO *param_1,undefined8 param_2,undefined4 param_3,undefined8 param_4,code *param_5
                ,undefined8 param_6,long param_7)

{
  int iVar1;
  X509_SIG *p8;
  PKCS8_PRIV_KEY_INFO *p8inf;
  int local_54;
  ASN1_OBJECT *local_50;
  undefined4 local_44;
  undefined8 local_38;
  
  local_50 = (ASN1_OBJECT *)0x0;
  local_54 = -1;
  if (*(int *)(param_7 + 0xc) == 0) {
    if ((param_5 == (code *)0x0) ||
       (iVar1 = (*param_5)(param_2,param_3,*(undefined4 *)(param_7 + 8),&local_50,&local_54),
       iVar1 != 0)) {
      p8inf = (PKCS8_PRIV_KEY_INFO *)FUN_00b3f5b8(param_2,param_3,local_50,local_54,param_6);
      if (p8inf == (PKCS8_PRIV_KEY_INFO *)0x0) {
        if (local_54 == 0x10) {
          ASN1_STRING_free((ASN1_STRING *)local_50);
        }
        else {
          iVar1 = 0;
          if (local_54 != 6) goto LAB_00b3f8c8;
          ASN1_OBJECT_free(local_50);
        }
        iVar1 = 0;
      }
      else {
        iVar1 = i2d_PKCS8_PRIV_KEY_INFO_bio(param_1,p8inf);
      }
LAB_00b3f8c8:
      PKCS8_PRIV_KEY_INFO_free(p8inf);
      return iVar1;
    }
  }
  else {
    local_38 = 0;
    local_44 = 0xffffffff;
    if ((param_5 == (code *)0x0) ||
       (iVar1 = (*param_5)(param_2,param_3,*(undefined4 *)(param_7 + 8),&local_38,&local_44),
       iVar1 != 0)) {
      p8 = (X509_SIG *)FUN_00b3f48c(param_2,param_3,local_38,local_44,param_6,param_7);
      if (p8 == (X509_SIG *)0x0) {
        iVar1 = 0;
      }
      else {
        iVar1 = i2d_PKCS8_bio(param_1,p8);
      }
      X509_SIG_free(p8);
      return iVar1;
    }
  }
  return 0;
}

