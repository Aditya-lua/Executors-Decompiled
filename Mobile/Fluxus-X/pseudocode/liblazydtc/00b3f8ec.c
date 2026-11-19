/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b3f8ec
 */

int FUN_00b3f8ec(BIO *param_1,undefined8 param_2,undefined4 param_3,undefined8 param_4,code *param_5
                ,undefined8 param_6,long param_7)

{
  int iVar1;
  X509_SIG *x;
  PKCS8_PRIV_KEY_INFO *x_00;
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
      x_00 = (PKCS8_PRIV_KEY_INFO *)FUN_00b3f5b8(param_2,param_3,local_50,local_54,param_6);
      if (x_00 == (PKCS8_PRIV_KEY_INFO *)0x0) {
        if (local_54 == 0x10) {
          ASN1_STRING_free((ASN1_STRING *)local_50);
        }
        else {
          iVar1 = 0;
          if (local_54 != 6) goto LAB_00b3fa3c;
          ASN1_OBJECT_free(local_50);
        }
        iVar1 = 0;
      }
      else {
        iVar1 = PEM_write_bio_PKCS8_PRIV_KEY_INFO(param_1,x_00);
      }
LAB_00b3fa3c:
      PKCS8_PRIV_KEY_INFO_free(x_00);
      return iVar1;
    }
  }
  else {
    local_38 = 0;
    local_44 = 0xffffffff;
    if ((param_5 == (code *)0x0) ||
       (iVar1 = (*param_5)(param_2,param_3,*(undefined4 *)(param_7 + 8),&local_38,&local_44),
       iVar1 != 0)) {
      x = (X509_SIG *)FUN_00b3f48c(param_2,param_3,local_38,local_44,param_6,param_7);
      if (x == (X509_SIG *)0x0) {
        iVar1 = 0;
      }
      else {
        iVar1 = PEM_write_bio_PKCS8(param_1,x);
      }
      X509_SIG_free(x);
      return iVar1;
    }
  }
  return 0;
}

