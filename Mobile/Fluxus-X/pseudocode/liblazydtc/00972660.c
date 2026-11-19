/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00972660
 */

/* ix::SocketTLSOptions::TEMPNAMEPLACEHOLDERVALUE(ix::SocketTLSOptions const&) */

SocketTLSOptions * __thiscall
ix::SocketTLSOptions::operator=(SocketTLSOptions *this,SocketTLSOptions *param_1)

{
  ulong uVar1;
  SocketTLSOptions *pSVar2;
  
  if (this == param_1) {
    *(undefined2 *)(this + 0x60) = *(undefined2 *)(param_1 + 0x60);
  }
  else {
    uVar1 = *(ulong *)(param_1 + 8);
    pSVar2 = *(SocketTLSOptions **)(param_1 + 0x10);
    if (((byte)*param_1 & 1) == 0) {
      pSVar2 = param_1 + 1;
      uVar1 = (ulong)((byte)*param_1 >> 1);
    }
    std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
    assign((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)this,
           (char *)pSVar2,uVar1);
    uVar1 = (ulong)((byte)param_1[0x18] >> 1);
    pSVar2 = param_1 + 0x19;
    if (((byte)param_1[0x18] & 1) != 0) {
      uVar1 = *(ulong *)(param_1 + 0x20);
      pSVar2 = *(SocketTLSOptions **)(param_1 + 0x28);
    }
    std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
    assign((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
           (this + 0x18),(char *)pSVar2,uVar1);
    uVar1 = (ulong)((byte)param_1[0x30] >> 1);
    pSVar2 = param_1 + 0x31;
    if (((byte)param_1[0x30] & 1) != 0) {
      uVar1 = *(ulong *)(param_1 + 0x38);
      pSVar2 = *(SocketTLSOptions **)(param_1 + 0x40);
    }
    std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
    assign((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
           (this + 0x30),(char *)pSVar2,uVar1);
    uVar1 = (ulong)((byte)param_1[0x48] >> 1);
    pSVar2 = param_1 + 0x49;
    if (((byte)param_1[0x48] & 1) != 0) {
      uVar1 = *(ulong *)(param_1 + 0x50);
      pSVar2 = *(SocketTLSOptions **)(param_1 + 0x58);
    }
    std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
    assign((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
           (this + 0x48),(char *)pSVar2,uVar1);
    *(undefined2 *)(this + 0x60) = *(undefined2 *)(param_1 + 0x60);
    uVar1 = (ulong)((byte)param_1[0x68] >> 1);
    pSVar2 = param_1 + 0x69;
    if (((byte)param_1[0x68] & 1) != 0) {
      uVar1 = *(ulong *)(param_1 + 0x70);
      pSVar2 = *(SocketTLSOptions **)(param_1 + 0x78);
    }
    std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
    assign((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
           (this + 0x68),(char *)pSVar2,uVar1);
  }
  this[0x80] = param_1[0x80];
  return this;
}

