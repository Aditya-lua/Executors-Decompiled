/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a26868
 */

undefined4 ossl_ec_encoding_name2id(long param_1)

{
  int iVar1;
  undefined4 uVar2;
  long lVar3;
  
  if (param_1 == 0) {
    uVar2 = 1;
  }
  else {
    iVar1 = OPENSSL_strcasecmp(param_1,"explicit");
    if (iVar1 == 0) {
      lVar3 = 0;
    }
    else {
      iVar1 = OPENSSL_strcasecmp(param_1,"named_curve");
      if (iVar1 != 0) {
        return 0xffffffff;
      }
      lVar3 = 1;
    }
    uVar2 = (&DAT_00c5b3b8)[lVar3 * 4];
  }
  return uVar2;
}

