/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bce800
 */

/* std::__ndk1::basic_streambuf<char, std::__ndk1::char_traits<char> >::pubsync() */

void __thiscall
std::__ndk1::basic_streambuf<char,std::__ndk1::char_traits<char>>::pubsync
          (basic_streambuf<char,std::__ndk1::char_traits<char>> *this)

{
                    /* WARNING: Could not recover jumptable at 0x00bce80c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*(long *)this + 0x30))();
  return;
}

