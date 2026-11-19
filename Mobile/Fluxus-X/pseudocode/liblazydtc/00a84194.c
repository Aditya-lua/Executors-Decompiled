/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a84194
 */

undefined8 CRYPTO_alloc_ex_data(undefined4 param_1,undefined8 param_2,long param_3,int param_4)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  
  if (((*(long *)(param_3 + 8) == 0) ||
      (iVar1 = OPENSSL_sk_num(*(long *)(param_3 + 8)), iVar1 <= param_4)) ||
     (lVar2 = OPENSSL_sk_value(*(undefined8 *)(param_3 + 8),param_4), lVar2 == 0)) {
    uVar3 = ossl_crypto_alloc_ex_data_intern(param_1,param_2,param_3,param_4);
    return uVar3;
  }
  return 1;
}

