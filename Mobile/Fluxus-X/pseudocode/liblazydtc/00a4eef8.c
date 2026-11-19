/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a4eef8
 */

bool OSSL_DECODER_is_a(long *param_1,undefined8 param_2)

{
  bool bVar1;
  int iVar2;
  undefined8 uVar3;
  
  bVar1 = false;
  if (*param_1 != 0) {
    ossl_provider_libctx();
    uVar3 = ossl_namemap_stored();
    iVar2 = ossl_namemap_name2num(uVar3,param_2);
    bVar1 = iVar2 == (int)param_1[1];
  }
  return bVar1;
}

