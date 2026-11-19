/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfcf50
 */

/* std::__ndk1::ctype<char>::do_narrow(char, char) const */

char __thiscall std::__ndk1::ctype<char>::do_narrow(ctype<char> *this,char param_1,char param_2)

{
  if (-1 < param_1) {
    param_2 = param_1;
  }
  return param_2;
}

