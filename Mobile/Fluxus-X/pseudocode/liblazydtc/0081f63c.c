/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0081f63c
 */

void FUN_0081f63c(basic_ostream<char,std::__ndk1::char_traits<char>> *param_1)

{
  *(undefined ***)param_1 = &PTR_FUN_00cad200;
  *(undefined ***)(param_1 + 0xb0) = &PTR_FUN_00cad228;
  std::__ndk1::basic_filebuf<char,std::__ndk1::char_traits<char>>::~basic_filebuf
            ((basic_filebuf<char,std::__ndk1::char_traits<char>> *)(param_1 + 8));
  std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::~basic_ostream(param_1);
  std::__ndk1::basic_ios<char,std::__ndk1::char_traits<char>>::~basic_ios
            ((basic_ios<char,std::__ndk1::char_traits<char>> *)(param_1 + 0xb0));
  return;
}

