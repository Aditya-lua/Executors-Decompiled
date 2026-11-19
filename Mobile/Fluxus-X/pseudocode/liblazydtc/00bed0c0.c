/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bed0c0
 */

/* std::__ndk1::moneypunct_byname<wchar_t, false>::do_frac_digits() const */

undefined4 __thiscall
std::__ndk1::moneypunct_byname<wchar_t,false>::do_frac_digits
          (moneypunct_byname<wchar_t,false> *this)

{
  return *(undefined4 *)(this + 0x78);
}

