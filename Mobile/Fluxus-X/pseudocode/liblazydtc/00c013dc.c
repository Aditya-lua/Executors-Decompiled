/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c013dc
 */

/* std::__ndk1::__codecvt_utf16<char32_t, true>::do_max_length() const */

undefined4 __thiscall
std::__ndk1::__codecvt_utf16<char32_t,true>::do_max_length(__codecvt_utf16<char32_t,true> *this)

{
  undefined4 uVar1;
  
  uVar1 = 4;
  if (((byte)this[0x18] & 4) != 0) {
    uVar1 = 6;
  }
  return uVar1;
}

