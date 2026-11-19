/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e8178
 */

/* cpr::Cookie::GetName() const */

void cpr::Cookie::GetName(void)

{
  ulong *in_x0;
  ulong *in_x8;
  void *__dest;
  ulong uVar1;
  void *__src;
  ulong uVar2;
  
  in_x8[1] = 0;
  in_x8[2] = 0;
  *in_x8 = 0;
  if ((*in_x0 & 1) == 0) {
    in_x8[2] = in_x0[2];
    uVar1 = *in_x0;
    in_x8[1] = in_x0[1];
    *in_x8 = uVar1;
    return;
  }
  uVar1 = in_x0[1];
  if (0xffffffffffffffef < uVar1) {
                    /* WARNING: Subroutine does not return */
    std::__ndk1::__basic_string_common<true>::__throw_length_error();
  }
  __src = (void *)in_x0[2];
  if (uVar1 < 0x17) {
    __dest = (void *)((long)in_x8 + 1);
    *(char *)in_x8 = (char)((int)uVar1 << 1);
    if (uVar1 == 0) goto LAB_008e8208;
  }
  else {
    uVar2 = uVar1 + 0x10 & 0xfffffffffffffff0;
    __dest = operator_new(uVar2);
    in_x8[1] = uVar1;
    in_x8[2] = (ulong)__dest;
    *in_x8 = uVar2 | 1;
  }
  memcpy(__dest,__src,uVar1);
LAB_008e8208:
  *(undefined1 *)((long)__dest + uVar1) = 0;
  return;
}

