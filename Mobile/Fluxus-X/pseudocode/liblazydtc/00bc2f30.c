/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc2f30
 */

void FUN_00bc2f30(runtime_error *param_1,char *param_2)

{
  std::runtime_error::runtime_error(param_1,param_2);
  *(undefined ***)param_1 = &PTR__underflow_error_00cb0708;
  return;
}

