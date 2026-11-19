/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0081ee8c
 */

void FUN_0081ee8c(basic_ostream<char,std::__ndk1::char_traits<char>> *param_1)

{
  *(undefined ***)param_1 = &PTR_FUN_00c51770;
  *(undefined ***)(param_1 + 0x70) = &PTR_FUN_00c51798;
  *(undefined ***)(param_1 + 8) = &PTR_LAB_00c4e678;
  if (((byte)param_1[0x48] & 1) != 0) {
    operator_delete(*(void **)(param_1 + 0x58),*(ulong *)(param_1 + 0x48) & 0xfffffffffffffffe);
  }
  *(undefined ***)(param_1 + 8) = &PTR__basic_streambuf_00c4e728;
  std::__ndk1::locale::~locale((locale *)(param_1 + 0x10));
  std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::~basic_ostream(param_1);
  std::__ndk1::basic_ios<char,std::__ndk1::char_traits<char>>::~basic_ios
            ((basic_ios<char,std::__ndk1::char_traits<char>> *)(param_1 + 0x70));
  return;
}

