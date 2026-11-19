/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a73c8c
 */

undefined4 ossl_dh_gen_type_name2id(char *param_1,int param_2)

{
  int iVar1;
  long lVar2;
  
  iVar1 = strcmp("group",param_1);
  if (iVar1 == 0) {
    lVar2 = 0;
  }
  else if (param_2 == 0x1000) {
    iVar1 = strcmp("fips186_4",param_1);
    if (iVar1 == 0) {
      lVar2 = 2;
    }
    else {
      iVar1 = strcmp("fips186_2",param_1);
      if (iVar1 != 0) {
        return 0xffffffff;
      }
      lVar2 = 3;
    }
  }
  else {
    if ((param_2 != 0) || (iVar1 = strcmp("generator",param_1), iVar1 != 0)) {
      return 0xffffffff;
    }
    lVar2 = 1;
  }
  return (&DAT_00c60cd0)[lVar2 * 4];
}

