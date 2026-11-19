/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b3f3b8
 */

int FUN_00b3f3b8(BIO *param_1,undefined8 param_2,undefined4 param_3,undefined8 param_4,code *param_5
                ,undefined8 param_6,long param_7)

{
  int iVar1;
  X509_SIG *p8;
  undefined4 local_44;
  undefined8 local_38;
  
  local_38 = 0;
  local_44 = 0xffffffff;
  if ((*(int *)(param_7 + 0xc) == 0) ||
     ((param_5 != (code *)0x0 &&
      (iVar1 = (*param_5)(param_2,param_3,*(undefined4 *)(param_7 + 8),&local_38,&local_44),
      iVar1 == 0)))) {
    iVar1 = 0;
  }
  else {
    p8 = (X509_SIG *)FUN_00b3f48c(param_2,param_3,local_38,local_44,param_6,param_7);
    if (p8 == (X509_SIG *)0x0) {
      iVar1 = 0;
    }
    else {
      iVar1 = i2d_PKCS8_bio(param_1,p8);
    }
    X509_SIG_free(p8);
  }
  return iVar1;
}

