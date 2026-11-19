/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098ffcc
 */

/* ix::WebSocket::addSubProtocol(std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > const&) */

void __thiscall ix::WebSocket::addSubProtocol(WebSocket *this,basic_string_conflict *param_1)

{
  ulong *puVar1;
  void *__dest;
  ulong uVar2;
  void *__src;
  ulong uVar3;
  
  std::__ndk1::mutex::lock((mutex *)(this + 0x3a0));
  puVar1 = *(ulong **)(this + 0x4d8);
  if (puVar1 == *(ulong **)(this + 0x4e0)) {
                    /* try { // try from 0099002c to 0099006f has its CatchHandler @ 009900c0 */
    std::__ndk1::
    vector<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::allocator<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>
    ::
    __push_back_slow_path<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const&>
              ((vector<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::allocator<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>
                *)(this + 0x4d0),param_1);
    goto LAB_009900a0;
  }
  puVar1[1] = 0;
  puVar1[2] = 0;
  *puVar1 = 0;
  if (((byte)*param_1 & 1) == 0) {
    puVar1[2] = *(ulong *)(param_1 + 0x10);
    uVar2 = *(ulong *)param_1;
    puVar1[1] = *(ulong *)(param_1 + 8);
    *puVar1 = uVar2;
  }
  else {
    uVar2 = *(ulong *)(param_1 + 8);
    if (0xffffffffffffffef < uVar2) {
                    /* try { // try from 009900b8 to 009900bf has its CatchHandler @ 009900c0 */
                    /* WARNING: Subroutine does not return */
      std::__ndk1::__basic_string_common<true>::__throw_length_error();
    }
    __src = *(void **)(param_1 + 0x10);
    if (uVar2 < 0x17) {
      __dest = (void *)((long)puVar1 + 1);
      *(char *)puVar1 = (char)((int)uVar2 << 1);
      if (uVar2 != 0) goto LAB_00990080;
    }
    else {
      uVar3 = uVar2 + 0x10 & 0xfffffffffffffff0;
      __dest = operator_new(uVar3);
      puVar1[1] = uVar2;
      puVar1[2] = (ulong)__dest;
      *puVar1 = uVar3 | 1;
LAB_00990080:
      memcpy(__dest,__src,uVar2);
    }
    *(undefined1 *)((long)__dest + uVar2) = 0;
  }
  *(long *)(this + 0x4d8) = *(long *)(this + 0x4d8) + 0x18;
LAB_009900a0:
  std::__ndk1::mutex::unlock((mutex *)(this + 0x3a0));
  return;
}

