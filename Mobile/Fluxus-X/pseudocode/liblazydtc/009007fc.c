/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009007fc
 */

/* cpr::util::writeFileFunction(char*, unsigned long, unsigned long,
   std::__ndk1::basic_ofstream<char, std::__ndk1::char_traits<char> >*) */

long cpr::util::writeFileFunction(char *param_1,ulong param_2,ulong param_3,basic_ofstream *param_4)

{
  std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::write
            ((basic_ostream<char,std::__ndk1::char_traits<char>> *)param_4,param_1,param_3 * param_2
            );
  return param_3 * param_2;
}

