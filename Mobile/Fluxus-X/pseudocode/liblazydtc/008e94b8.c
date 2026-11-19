/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e94b8
 */

/* std::__ndk1::basic_stringbuf<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char>
   >::pbackfail(int) */

int __thiscall
std::__ndk1::basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
pbackfail(basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *this,
         int param_1)

{
  ulong uVar1;
  ulong uVar2;
  
  uVar2 = *(ulong *)(this + 0x30);
  uVar1 = *(ulong *)(this + 0x58);
  if (*(ulong *)(this + 0x58) < uVar2) {
    *(ulong *)(this + 0x58) = uVar2;
    uVar1 = uVar2;
  }
  uVar2 = *(ulong *)(this + 0x18);
  if (*(ulong *)(this + 0x10) < uVar2) {
    if (param_1 == -1) {
      *(ulong *)(this + 0x18) = uVar2 - 1;
      *(ulong *)(this + 0x20) = uVar1;
      return 0;
    }
    if ((((byte)this[0x60] >> 4 & 1) != 0) || ((uint)*(byte *)(uVar2 - 1) == (param_1 & 0xffU))) {
      *(undefined1 **)(this + 0x18) = (undefined1 *)(uVar2 - 1);
      *(ulong *)(this + 0x20) = uVar1;
      *(undefined1 *)(uVar2 - 1) = (char)param_1;
      return param_1;
    }
  }
  return -1;
}

