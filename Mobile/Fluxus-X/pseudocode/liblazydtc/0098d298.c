/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098d298
 */

/* ix::WebSocket::getUrl() const */

void ix::WebSocket::getUrl(void)

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
  if ((*(byte *)(in_x0 + 0x2e0) & 1) == 0) {
    in_x8[2] = *(ulong *)(in_x0 + 0x2f0);
    uVar1 = *(ulong *)(in_x0 + 0x2e0);
    in_x8[1] = *(ulong *)(in_x0 + 0x2e8);
    *in_x8 = uVar1;
    goto LAB_0098d344;
  }
  uVar1 = *(ulong *)(in_x0 + 0x2e8);
  if (0xffffffffffffffef < uVar1) {
                    /* try { // try from 0098d35c to 0098d363 has its CatchHandler @ 0098d364 */
                    /* WARNING: Subroutine does not return */
    std::__ndk1::__basic_string_common<true>::__throw_length_error();
  }
  __src = *(void **)(in_x0 + 0x2f0);
  if (uVar1 < 0x17) {
    __dest = (void *)((long)in_x8 + 1);
    *(char *)in_x8 = (char)((int)uVar1 << 1);
    if (uVar1 != 0) goto LAB_0098d330;
  }
  else {
    uVar2 = uVar1 + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 0098d318 to 0098d31f has its CatchHandler @ 0098d364 */
    __dest = operator_new(uVar2);
    in_x8[1] = uVar1;
    in_x8[2] = (ulong)__dest;
    *in_x8 = uVar2 | 1;
LAB_0098d330:
    memcpy(__dest,__src,uVar1);
  }
  *(undefined1 *)((long)__dest + uVar1) = 0;
LAB_0098d344:
  std::__ndk1::mutex::unlock((mutex *)(in_x0 + 0x3a0));
  return;
}

