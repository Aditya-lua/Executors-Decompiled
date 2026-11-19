/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a82764
 */

undefined4 ossl_namemap_add_name_n(long param_1,undefined4 param_2,long param_3,long param_4)

{
  int iVar1;
  undefined4 uVar2;
  
  if (param_1 == 0) {
    param_1 = ossl_namemap_stored();
  }
  if ((((param_3 == 0) || (param_4 == 0)) || (param_1 == 0)) ||
     (iVar1 = CRYPTO_THREAD_write_lock(*(undefined8 *)(param_1 + 8)), iVar1 == 0)) {
    uVar2 = 0;
  }
  else {
    uVar2 = FUN_00a827e8(param_1,param_2,param_3,param_4);
    CRYPTO_THREAD_unlock(*(undefined8 *)(param_1 + 8));
  }
  return uVar2;
}

