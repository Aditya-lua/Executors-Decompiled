/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bed1bc
 */

/* std::__ndk1::moneypunct_byname<wchar_t, true>::do_frac_digits() const */

undefined4 __thiscall
std::__ndk1::moneypunct_byname<wchar_t,true>::do_frac_digits(moneypunct_byname<wchar_t,true> *this)

{
  return *(undefined4 *)(this + 0x78);
}

