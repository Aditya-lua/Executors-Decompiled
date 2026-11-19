/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a8191c
 */

void FUN_00a8191c(undefined8 param_1,undefined8 param_2,CRYPTO_EX_DATA *param_3,int param_4,
                 undefined8 param_5,long param_6)

{
  int iVar1;
  undefined8 *puVar2;
  void *val;
  
  puVar2 = (undefined8 *)ossl_crypto_ex_data_get_ossl_lib_ctx(param_3);
  val = (void *)(**(code **)(param_6 + 8))();
  if ((val == (void *)0x0) || (iVar1 = CRYPTO_THREAD_write_lock(*puVar2), iVar1 == 0)) {
    return;
  }
  CRYPTO_set_ex_data(param_3,param_4,val);
  CRYPTO_THREAD_unlock(*puVar2);
  return;
}

