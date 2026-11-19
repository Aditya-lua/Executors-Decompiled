/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a530f0
 */

void engine_table_doall(long param_1,undefined8 param_2,undefined8 param_3)

{
  undefined8 local_20;
  undefined8 uStack_18;
  
  if (param_1 != 0) {
    local_20 = param_2;
    uStack_18 = param_3;
    OPENSSL_LH_doall_arg(param_1,&LAB_00a53120,&local_20);
  }
  return;
}

