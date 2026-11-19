/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc90d8
 */

/* std::__ndk1::to_string(unsigned int) */

void __thiscall std::__ndk1::to_string(__ndk1 *this,uint param_1)

{
  ulong uVar1;
  undefined1 *puVar2;
  ulong *in_x8;
  undefined1 *__dest;
  ulong __n;
  undefined1 auStack_3b [11];
  
  puVar2 = (undefined1 *)FUN_00bcac54(auStack_3b,(ulong)this & 0xffffffff);
  __n = (long)puVar2 - (long)auStack_3b;
  if (0xfffffffffffffff7 < __n) {
                    /* WARNING: Subroutine does not return */
    FUN_007fe124();
  }
  if (__n < 0x17) {
    __dest = (undefined1 *)((long)in_x8 + 1);
    *(char *)in_x8 = (char)((int)__n << 1);
  }
  else {
    uVar1 = 0x1a;
    if ((__n | 7) != 0x17) {
      uVar1 = (__n | 7) + 1;
    }
    __dest = operator_new(uVar1);
    in_x8[1] = __n;
    in_x8[2] = (ulong)__dest;
    *in_x8 = uVar1 | 1;
  }
  if (puVar2 != auStack_3b) {
    memcpy(__dest,auStack_3b,__n);
  }
  __dest[__n] = 0;
  return;
}

