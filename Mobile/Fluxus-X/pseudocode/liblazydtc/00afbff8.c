/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00afbff8
 */

bool FUN_00afbff8(undefined8 param_1,ASN1_STRING *param_2,BIO *param_3,ulong param_4)

{
  bool bVar1;
  int iVar2;
  
  iVar2 = BIO_printf(param_3,"%*s",param_4 & 0xffffffff,&DAT_002ab32c);
  if (iVar2 < 1) {
    bVar1 = false;
  }
  else {
    iVar2 = i2a_ASN1_STRING(param_3,param_2,4);
    bVar1 = 0 < iVar2;
  }
  return bVar1;
}

