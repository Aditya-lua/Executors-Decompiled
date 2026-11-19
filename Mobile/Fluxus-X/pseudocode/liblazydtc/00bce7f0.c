/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bce7f0
 */

/* std::__ndk1::basic_streambuf<char, std::__ndk1::char_traits<char>
   >::pubseekpos(std::__ndk1::fpos<mbstate_t>, unsigned int) */

void std::__ndk1::basic_streambuf<char,std::__ndk1::char_traits<char>>::pubseekpos(long *param_1)

{
                    /* WARNING: Could not recover jumptable at 0x00bce7fc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*param_1 + 0x28))();
  return;
}

