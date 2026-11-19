/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00becfe8
 */

/* std::__ndk1::moneypunct_byname<wchar_t, false>::do_decimal_point() const */

undefined4 __thiscall
std::__ndk1::moneypunct_byname<wchar_t,false>::do_decimal_point
          (moneypunct_byname<wchar_t,false> *this)

{
  return *(undefined4 *)(this + 0x10);
}

