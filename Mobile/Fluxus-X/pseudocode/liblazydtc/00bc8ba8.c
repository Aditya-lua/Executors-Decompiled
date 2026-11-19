/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc8ba8
 */

/* std::__ndk1::to_string(int) */

void __thiscall std::__ndk1::to_string(__ndk1 *this,int param_1)

{
  ulong uVar1;
  uint uVar2;
  undefined1 *puVar3;
  undefined1 *puVar4;
  uint uVar5;
  ulong *in_x8;
  ulong __n;
  undefined1 local_3c [11];
  undefined1 uStack_31;
  
  uVar5 = (uint)this;
  puVar3 = local_3c;
  puVar4 = &uStack_31;
  if ((int)uVar5 < 0) {
    puVar3 = (undefined1 *)((ulong)puVar3 | 1);
    uVar5 = -uVar5;
    local_3c[0] = 0x2d;
  }
  if ((9 < (long)puVar4 - (long)puVar3) ||
     (uVar2 = (uint)((0x20 - (int)LZCOUNT(uVar5 | 1)) * 0x4d1) >> 0xc,
     (long)(ulong)((uVar2 - (uVar5 < *(uint *)(&DAT_0078a158 + (ulong)uVar2 * 4))) + 1) <=
     (long)puVar4 - (long)puVar3)) {
    puVar4 = (undefined1 *)FUN_00bcac54();
  }
  __n = (long)puVar4 - (long)local_3c;
  if (0xfffffffffffffff7 < __n) {
                    /* WARNING: Subroutine does not return */
    FUN_007fe124();
  }
  if (__n < 0x17) {
    puVar3 = (undefined1 *)((long)in_x8 + 1);
    *(char *)in_x8 = (char)((int)__n << 1);
  }
  else {
    uVar1 = 0x1a;
    if ((__n | 7) != 0x17) {
      uVar1 = (__n | 7) + 1;
    }
    puVar3 = operator_new(uVar1);
    in_x8[1] = __n;
    in_x8[2] = (ulong)puVar3;
    *in_x8 = uVar1 | 1;
  }
  if (local_3c != puVar4) {
    memcpy(puVar3,local_3c,__n);
  }
  puVar3[__n] = 0;
  return;
}

