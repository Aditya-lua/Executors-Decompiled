/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 007fe624
 */

void FUN_007fe624(basic_istream<char,std::__ndk1::char_traits<char>> *param_1)

{
  *(undefined ***)param_1 = &PTR_FUN_00c51bf0;
  *(undefined ***)(param_1 + 0xb8) = &PTR_LAB_00c51c18;
  std::__ndk1::basic_filebuf<char,std::__ndk1::char_traits<char>>::~basic_filebuf
            ((basic_filebuf<char,std::__ndk1::char_traits<char>> *)(param_1 + 0x10));
  std::__ndk1::basic_istream<char,std::__ndk1::char_traits<char>>::~basic_istream(param_1);
  std::__ndk1::basic_ios<char,std::__ndk1::char_traits<char>>::~basic_ios
            ((basic_ios<char,std::__ndk1::char_traits<char>> *)(param_1 + 0xb8));
  return;
}

