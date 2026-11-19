/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e8e70
 */

void FUN_008e8e70(undefined8 *param_1)

{
  param_1[-2] = &PTR_LAB_00c4e4e0;
  *(undefined ***)(param_1 + 0xe) = &PTR_FUN_00c4e530;
  *param_1 = &PTR_FUN_00c4e508;
  param_1[1] = &PTR_LAB_00c4e678;
  if ((*(byte *)(param_1 + 9) & 1) != 0) {
    operator_delete((void *)param_1[0xb]);
  }
  param_1[1] = &PTR__basic_streambuf_00c4e728;
  std::__ndk1::locale::~locale((locale *)(param_1 + 2));
  std::__ndk1::ios_base::~ios_base((ios_base *)(param_1 + 0xe));
  return;
}

