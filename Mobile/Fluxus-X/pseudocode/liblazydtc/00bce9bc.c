/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bce9bc
 */

/* std::__ndk1::basic_streambuf<char, std::__ndk1::char_traits<char> >::sputn(char const*, long) */

void std::__ndk1::basic_streambuf<char,std::__ndk1::char_traits<char>>::sputn
               (char *param_1,long param_2)

{
                    /* WARNING: Could not recover jumptable at 0x00bce9c8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*(long *)param_1 + 0x60))();
  return;
}

