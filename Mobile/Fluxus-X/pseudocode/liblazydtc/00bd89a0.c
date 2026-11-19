/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd89a0
 */

/* std::__ndk1::basic_filebuf<char, std::__ndk1::char_traits<char> >::__write_mode() */

void __thiscall
std::__ndk1::basic_filebuf<char,std::__ndk1::char_traits<char>>::__write_mode
          (basic_filebuf<char,std::__ndk1::char_traits<char>> *this)

{
  long lVar1;
  
  if (((byte)this[0x9c] >> 4 & 1) == 0) {
    *(undefined8 *)(this + 0x10) = 0;
    *(undefined8 *)(this + 0x18) = 0;
    *(undefined8 *)(this + 0x20) = 0;
    if (*(ulong *)(this + 0x60) < 9) {
      *(undefined8 *)(this + 0x28) = 0;
      *(undefined8 *)(this + 0x30) = 0;
      *(undefined8 *)(this + 0x38) = 0;
    }
    else if (this[0xa2] == (basic_filebuf<char,std::__ndk1::char_traits<char>>)0x1) {
      lVar1 = *(long *)(this + 0x40);
      *(long *)(this + 0x28) = lVar1;
      *(long *)(this + 0x30) = lVar1;
      *(ulong *)(this + 0x38) = lVar1 + *(ulong *)(this + 0x60) + -1;
    }
    else {
      lVar1 = *(long *)(this + 0x68);
      *(long *)(this + 0x28) = lVar1;
      *(long *)(this + 0x30) = lVar1;
      *(long *)(this + 0x38) = lVar1 + *(long *)(this + 0x70) + -1;
    }
    *(undefined4 *)(this + 0x9c) = 0x10;
  }
  return;
}

