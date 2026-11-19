/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008de29c
 */

void FUN_008de29c(logic_error *param_1,char *param_2)

{
  std::logic_error::logic_error(param_1,param_2);
  *(undefined ***)param_1 = &PTR__domain_error_00cb05f0;
  return;
}

