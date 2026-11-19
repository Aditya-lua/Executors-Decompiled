/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd2848
 */

/* std::__ndk1::basic_streambuf<wchar_t, std::__ndk1::char_traits<wchar_t> >::sputn(wchar_t const*,
   long) */

void std::__ndk1::basic_streambuf<wchar_t,std::__ndk1::char_traits<wchar_t>>::sputn
               (wchar_t *param_1,long param_2)

{
                    /* WARNING: Could not recover jumptable at 0x00bd2854. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*(long *)param_1 + 0x60))();
  return;
}

