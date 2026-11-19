/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00900f00
 */

void FUN_00900f00(long *param_1)

{
  undefined8 *puVar1;
  
  puVar1 = (undefined8 *)((long)param_1 + *(long *)(*param_1 + -0x18));
  *puVar1 = &PTR_LAB_00c4f190;
  *(undefined ***)(puVar1 + 0xf) = &PTR_FUN_00c4f1b8;
  puVar1[2] = &PTR_LAB_00c4e678;
  if ((*(byte *)(puVar1 + 10) & 1) != 0) {
    operator_delete((void *)puVar1[0xc]);
  }
  puVar1[2] = &PTR__basic_streambuf_00c4e728;
  std::__ndk1::locale::~locale((locale *)(puVar1 + 3));
  std::__ndk1::ios_base::~ios_base((ios_base *)(puVar1 + 0xf));
  return;
}

