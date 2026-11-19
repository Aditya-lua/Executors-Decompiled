/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 007fe188
 */

void FUN_007fe188(logic_error *param_1,char *param_2)

{
  std::logic_error::logic_error(param_1,param_2);
  *(undefined ***)param_1 = &PTR__domain_error_00cb0630;
  return;
}

