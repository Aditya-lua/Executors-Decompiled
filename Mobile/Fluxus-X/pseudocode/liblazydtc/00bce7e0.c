/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bce7e0
 */

/* std::__ndk1::basic_streambuf<char, std::__ndk1::char_traits<char> >::pubseekoff(long long,
   std::__ndk1::ios_base::seekdir, unsigned int) */

void std::__ndk1::basic_streambuf<char,std::__ndk1::char_traits<char>>::pubseekoff(long *param_1)

{
                    /* WARNING: Could not recover jumptable at 0x00bce7ec. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*param_1 + 0x20))();
  return;
}

