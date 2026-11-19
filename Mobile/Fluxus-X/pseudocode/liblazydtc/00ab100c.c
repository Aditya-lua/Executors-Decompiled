/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab100c
 */

bool FUN_00ab100c(stack_st_X509_EXTENSION **param_1,void *param_2,int param_3)

{
  int iVar1;
  bool bVar2;
  int local_48 [2];
  uchar *local_40;
  uchar *local_28;
  
  iVar1 = 0x10;
  if (0 < param_3) {
    iVar1 = param_3;
  }
  local_48[0] = ASN1_object_size(0,iVar1,4);
  if (local_48[0] < 0) {
    return false;
  }
  local_40 = CRYPTO_malloc(local_48[0],"crypto/ocsp/ocsp_ext.c",0x106);
  if (local_40 == (uchar *)0x0) {
LAB_00ab10d8:
    bVar2 = false;
  }
  else {
    local_28 = local_40;
    ASN1_put_object(&local_28,0,iVar1,4,0);
    if (param_2 == (void *)0x0) {
      iVar1 = RAND_bytes(local_28,iVar1);
      if (iVar1 < 1) goto LAB_00ab10d8;
    }
    else {
      memcpy(local_28,param_2,(long)iVar1);
    }
    iVar1 = X509V3_add1_i2d(param_1,0x16e,local_48,0,2);
    bVar2 = 0 < iVar1;
  }
  CRYPTO_free(local_40);
  return bVar2;
}

