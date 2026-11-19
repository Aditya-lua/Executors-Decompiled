/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098d4f4
 */

/* ix::WebSocket::getPingMessage() const */

void ix::WebSocket::getPingMessage(void)

{
  long in_x0;
  ulong *in_x8;
  void *__dest;
  ulong uVar1;
  void *__src;
  ulong uVar2;
  
  std::__ndk1::mutex::lock((mutex *)(in_x0 + 0x3a0));
  in_x8[1] = 0;
  in_x8[2] = 0;
  *in_x8 = 0;
  if ((*(byte *)(in_x0 + 0x4b0) & 1) == 0) {
    in_x8[2] = *(ulong *)(in_x0 + 0x4c0);
    uVar1 = *(ulong *)(in_x0 + 0x4b0);
    in_x8[1] = *(ulong *)(in_x0 + 0x4b8);
    *in_x8 = uVar1;
    goto LAB_0098d5a0;
  }
  uVar1 = *(ulong *)(in_x0 + 0x4b8);
  if (0xffffffffffffffef < uVar1) {
                    /* try { // try from 0098d5b8 to 0098d5bf has its CatchHandler @ 0098d5c0 */
                    /* WARNING: Subroutine does not return */
    std::__ndk1::__basic_string_common<true>::__throw_length_error();
  }
  __src = *(void **)(in_x0 + 0x4c0);
  if (uVar1 < 0x17) {
    __dest = (void *)((long)in_x8 + 1);
    *(char *)in_x8 = (char)((int)uVar1 << 1);
    if (uVar1 != 0) goto LAB_0098d58c;
  }
  else {
    uVar2 = uVar1 + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 0098d574 to 0098d57b has its CatchHandler @ 0098d5c0 */
    __dest = operator_new(uVar2);
    in_x8[1] = uVar1;
    in_x8[2] = (ulong)__dest;
    *in_x8 = uVar2 | 1;
LAB_0098d58c:
    memcpy(__dest,__src,uVar1);
  }
  *(undefined1 *)((long)__dest + uVar1) = 0;
LAB_0098d5a0:
  std::__ndk1::mutex::unlock((mutex *)(in_x0 + 0x3a0));
  return;
}

