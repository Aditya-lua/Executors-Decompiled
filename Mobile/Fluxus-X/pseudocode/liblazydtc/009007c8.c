/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009007c8
 */

/* cpr::util::writeFunction(char*, unsigned long, unsigned long, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >*) */

ulong cpr::util::writeFunction
                (char *param_1,ulong param_2,ulong param_3,basic_string_conflict *param_4)

{
  std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
  append((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)param_4,
         param_1,param_3 * param_2);
  return param_3 * param_2;
}

