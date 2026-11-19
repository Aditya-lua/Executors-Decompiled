/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac47ec
 */

void ossl_method_store_do_all(long param_1,undefined8 param_2,undefined8 param_3)

{
  undefined8 local_20;
  undefined8 uStack_18;
  
  if (param_1 != 0) {
    local_20 = param_2;
    uStack_18 = param_3;
    ossl_sa_doall_arg(*(undefined8 *)(param_1 + 8),FUN_00ac4820,&local_20);
  }
  return;
}

