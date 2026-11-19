/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00845ad0
 */

void FUN_00845ad0(undefined8 *param_1)

{
  *param_1 = &PTR_FUN_00c48d10;
  std::__ndk1::locale::~locale((locale *)(param_1 + 2));
  *param_1 = &PTR_LAB_00c48b78;
  if ((long *)param_1[1] != (long *)0x0) {
    (**(code **)(*(long *)param_1[1] + 8))();
  }
  operator_delete(param_1,0x30);
  return;
}

