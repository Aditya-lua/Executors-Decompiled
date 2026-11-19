/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a612e4
 */

void FUN_00a612e4(long param_1,undefined8 *param_2)

{
  long lVar1;
  
  if (param_1 == 0) {
    lVar1 = ossl_lib_ctx_get_data(*param_2,10,&DAT_00c5d818);
    if (lVar1 == 0) {
      return;
    }
  }
  ossl_method_lock_store();
  return;
}

