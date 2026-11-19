/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00becee0
 */

/* std::__ndk1::moneypunct_byname<char, false>::do_neg_format() const */

undefined4 __thiscall
std::__ndk1::moneypunct_byname<char,false>::do_neg_format(moneypunct_byname<char,false> *this)

{
  return *(undefined4 *)(this + 0x80);
}

