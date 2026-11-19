/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0097f110
 */

/* std::__ndk1::basic_filebuf<char, std::__ndk1::char_traits<char> >::pbackfail(int) */

int __thiscall
std::__ndk1::basic_filebuf<char,std::__ndk1::char_traits<char>>::pbackfail
          (basic_filebuf<char,std::__ndk1::char_traits<char>> *this,int param_1)

{
  ulong uVar1;
  
  if ((*(long *)(this + 0x78) != 0) &&
     (uVar1 = *(ulong *)(this + 0x18), *(ulong *)(this + 0x10) < uVar1)) {
    if (param_1 == -1) {
      *(ulong *)(this + 0x18) = uVar1 - 1;
      return 0;
    }
    if ((((byte)this[0x98] >> 4 & 1) != 0) || ((uint)*(byte *)(uVar1 - 1) == (param_1 & 0xffU))) {
      *(undefined1 **)(this + 0x18) = (undefined1 *)(uVar1 - 1);
      *(undefined1 *)(uVar1 - 1) = (char)param_1;
      return param_1;
    }
  }
  return -1;
}

