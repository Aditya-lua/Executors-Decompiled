/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a138b0
 */

int i2d_SCT_LIST(undefined8 param_1,uchar **param_2)

{
  int iVar1;
  ASN1_OCTET_STRING local_38;
  
  local_38.data = (uchar *)0x0;
  local_38.length = i2o_SCT_LIST(param_1,&local_38.data);
  if (local_38.length == -1) {
    iVar1 = -1;
  }
  else {
    iVar1 = i2d_ASN1_OCTET_STRING(&local_38,param_2);
    CRYPTO_free(local_38.data);
  }
  return iVar1;
}

