/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e8ee8
 */

void FUN_008e8ee8(long *param_1)

{
  undefined8 *puVar1;
  
  puVar1 = (undefined8 *)((long)param_1 + *(long *)(*param_1 + -0x18));
  *puVar1 = &PTR_LAB_00c4e4e0;
  *(undefined ***)(puVar1 + 0x10) = &PTR_FUN_00c4e530;
  puVar1[2] = &PTR_FUN_00c4e508;
  puVar1[3] = &PTR_LAB_00c4e678;
  if ((*(byte *)(puVar1 + 0xb) & 1) != 0) {
    operator_delete((void *)puVar1[0xd]);
  }
  puVar1[3] = &PTR__basic_streambuf_00c4e728;
  std::__ndk1::locale::~locale((locale *)(puVar1 + 4));
  std::__ndk1::ios_base::~ios_base((ios_base *)(puVar1 + 0x10));
  return;
}

