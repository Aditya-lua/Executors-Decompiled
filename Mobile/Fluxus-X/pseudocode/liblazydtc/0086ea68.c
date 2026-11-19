/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0086ea68
 */

void FUN_0086ea68(bad_exception *param_1)

{
  *(undefined ***)param_1 = &PTR_LAB_00c4a5f8;
  if (((byte)param_1[0x18] & 1) != 0) {
    operator_delete(*(void **)(param_1 + 0x28),*(ulong *)(param_1 + 0x18) & 0xfffffffffffffffe);
  }
  std::bad_exception::~bad_exception(param_1);
  operator_delete(param_1,0x30);
  return;
}

