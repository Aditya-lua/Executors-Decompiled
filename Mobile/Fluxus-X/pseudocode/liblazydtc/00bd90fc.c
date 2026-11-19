/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd90fc
 */

void FUN_00bd90fc(undefined8 *param_1)

{
  *param_1 = &PTR__basic_streambuf_00c4e728;
  std::__ndk1::locale::~locale((locale *)(param_1 + 1));
  operator_delete(param_1,0x68);
  return;
}

