/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00978d38
 */

void FUN_00978d38(long *param_1)

{
  undefined8 *puVar1;
  
  puVar1 = (undefined8 *)((long)param_1 + *(long *)(*param_1 + -0x18));
  *puVar1 = &PTR_FUN_00c51770;
  *(undefined ***)(puVar1 + 0xe) = &PTR_FUN_00c51798;
  puVar1[1] = &PTR_LAB_00c4e678;
  if ((*(byte *)(puVar1 + 9) & 1) != 0) {
    operator_delete((void *)puVar1[0xb]);
  }
  puVar1[1] = &PTR__basic_streambuf_00c4e728;
  std::__ndk1::locale::~locale((locale *)(puVar1 + 2));
  std::__ndk1::ios_base::~ios_base((ios_base *)(puVar1 + 0xe));
  return;
}

