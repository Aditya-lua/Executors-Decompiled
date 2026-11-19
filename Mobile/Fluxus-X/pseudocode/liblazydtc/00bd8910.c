/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd8910
 */

/* std::__ndk1::basic_filebuf<char, std::__ndk1::char_traits<char> >::__read_mode() */

bool __thiscall
std::__ndk1::basic_filebuf<char,std::__ndk1::char_traits<char>>::__read_mode
          (basic_filebuf<char,std::__ndk1::char_traits<char>> *this)

{
  long lVar1;
  long lVar2;
  uint uVar3;
  
  uVar3 = *(uint *)(this + 0x9c);
  if ((uVar3 >> 3 & 1) == 0) {
    *(undefined8 *)(this + 0x30) = 0;
    *(undefined8 *)(this + 0x38) = 0;
    lVar1 = 0x40;
    if (this[0xa2] == (basic_filebuf<char,std::__ndk1::char_traits<char>>)0x0) {
      lVar1 = 0x68;
    }
    lVar2 = 0x60;
    if (this[0xa2] == (basic_filebuf<char,std::__ndk1::char_traits<char>>)0x0) {
      lVar2 = 0x70;
    }
    lVar2 = *(long *)(this + lVar1) + *(long *)(this + lVar2);
    *(long *)(this + 0x10) = *(long *)(this + lVar1);
    *(long *)(this + 0x18) = lVar2;
    *(long *)(this + 0x20) = lVar2;
    *(undefined8 *)(this + 0x28) = 0;
    *(undefined4 *)(this + 0x9c) = 8;
  }
  return (uVar3 & 8) == 0;
}

