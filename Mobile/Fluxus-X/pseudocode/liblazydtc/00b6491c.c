/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b6491c
 */

ulong ossl_DER_w_algorithmIdentifier_X448(undefined8 param_1,undefined4 param_2)

{
  int iVar1;
  ulong uVar2;
  
  uVar2 = ossl_DER_w_begin_sequence();
  if (((int)uVar2 != 0) &&
     (uVar2 = ossl_DER_w_precompiled(param_1,0xffffffff,&ossl_der_oid_id_X448,5), (int)uVar2 != 0))
  {
    iVar1 = ossl_DER_w_end_sequence(param_1,param_2);
    uVar2 = (ulong)(iVar1 != 0);
  }
  return uVar2;
}

