/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5debc
 */

bool evp_is_a(long param_1,int param_2,undefined8 param_3,undefined8 param_4)

{
  int iVar1;
  undefined8 uVar2;
  
  ossl_provider_libctx();
  uVar2 = ossl_namemap_stored();
  if (param_1 == 0) {
    param_2 = ossl_namemap_name2num(uVar2,param_3);
  }
  iVar1 = ossl_namemap_name2num(uVar2,param_4);
  return iVar1 == param_2;
}

