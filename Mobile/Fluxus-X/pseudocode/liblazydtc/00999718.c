/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00999718
 */

/* ix::WebSocketTransport::getMergedChunks() const */

void ix::WebSocketTransport::getMergedChunks(void)

{
  char *pcVar1;
  long in_x0;
  ulong uVar2;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *in_x8;
  ulong uVar3;
  long lVar4;
  
  uVar2 = 0;
  for (lVar4 = *(long *)(in_x0 + 0x98); in_x0 + 0x90 != lVar4; lVar4 = *(long *)(lVar4 + 8)) {
    if ((*(byte *)(lVar4 + 0x10) & 1) == 0) {
      uVar3 = (ulong)(*(byte *)(lVar4 + 0x10) >> 1);
    }
    else {
      uVar3 = *(ulong *)(lVar4 + 0x18);
    }
    uVar2 = uVar3 + uVar2;
  }
  *(undefined8 *)in_x8 = 0;
  *(undefined8 *)(in_x8 + 8) = 0;
  *(undefined8 *)(in_x8 + 0x10) = 0;
                    /* try { // try from 00999770 to 00999777 has its CatchHandler @ 009997cc */
  std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
  reserve(in_x8,uVar2);
  for (lVar4 = *(long *)(in_x0 + 0x98); in_x0 + 0x90 != lVar4; lVar4 = *(long *)(lVar4 + 8)) {
    uVar2 = (ulong)(*(byte *)(lVar4 + 0x10) >> 1);
    pcVar1 = (char *)(lVar4 + 0x11);
    if ((*(byte *)(lVar4 + 0x10) & 1) != 0) {
      uVar2 = *(ulong *)(lVar4 + 0x18);
      pcVar1 = *(char **)(lVar4 + 0x20);
    }
                    /* try { // try from 009997b0 to 009997b7 has its CatchHandler @ 009997d0 */
    std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
    append(in_x8,pcVar1,uVar2);
  }
  return;
}

