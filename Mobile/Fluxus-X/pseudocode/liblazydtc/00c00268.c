/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c00268
 */

/* std::__ndk1::__codecvt_utf8<char16_t>::do_max_length() const */

undefined4 __thiscall
std::__ndk1::__codecvt_utf8<char16_t>::do_max_length(__codecvt_utf8<char16_t> *this)

{
  undefined4 uVar1;
  
  uVar1 = 3;
  if (((byte)this[0x18] & 4) != 0) {
    uVar1 = 6;
  }
  return uVar1;
}

