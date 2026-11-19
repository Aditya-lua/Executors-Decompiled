/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b4aec
 */

void FUN_008b4aec(bad_exception *param_1)

{
  std::bad_exception::~bad_exception(param_1);
  operator_delete(param_1,0x18);
  return;
}

