/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bffe04
 */

/* std::__ndk1::__codecvt_utf8<wchar_t>::do_max_length() const */

undefined4 __thiscall
std::__ndk1::__codecvt_utf8<wchar_t>::do_max_length(__codecvt_utf8<wchar_t> *this)

{
  undefined4 uVar1;
  
  uVar1 = 4;
  if (((byte)this[0x20] & 4) != 0) {
    uVar1 = 7;
  }
  return uVar1;
}

