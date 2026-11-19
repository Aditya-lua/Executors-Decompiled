/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bed0d8
 */

/* std::__ndk1::moneypunct_byname<wchar_t, false>::do_neg_format() const */

undefined4 __thiscall
std::__ndk1::moneypunct_byname<wchar_t,false>::do_neg_format(moneypunct_byname<wchar_t,false> *this)

{
  return *(undefined4 *)(this + 0x80);
}

