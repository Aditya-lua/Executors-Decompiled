/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc8cc0
 */

/* WARNING: Type propagation algorithm not settling */
/* std::__ndk1::to_string(long) */

void __thiscall std::__ndk1::to_string(__ndk1 *this,long param_1)

{
  ulong uVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  undefined2 *puVar5;
  ulong *in_x8;
  long lVar6;
  undefined1 *__dest;
  ulong __n;
  undefined2 *puVar7;
  undefined1 auVar8 [16];
  undefined2 local_44 [10];
  
  puVar5 = local_44;
  if ((long)this < 0) {
    puVar5 = (undefined2 *)((ulong)puVar5 | 1);
    this = (__ndk1 *)-(long)this;
    local_44[0]._0_1_ = 0x2d;
  }
  lVar6 = ((long)local_44 + 0x14U) - (long)puVar5;
  if ((0x13 < lVar6) ||
     (uVar2 = (uint)((0x40 - (int)LZCOUNT((ulong)this | 1)) * 0x4d1) >> 0xc,
     puVar7 = (undefined2 *)((long)local_44 + 0x14U),
     (long)(ulong)((uVar2 - (this < *(__ndk1 **)(&DAT_0078a248 + (ulong)uVar2 * 8))) + 1) <= lVar6))
  {
    if ((ulong)this >> 0x20 == 0) {
      auVar8 = FUN_00bcac54(puVar5,(ulong)this & 0xffffffff);
      param_1 = auVar8._8_8_;
      puVar5 = auVar8._0_8_;
      puVar7 = puVar5;
    }
    else {
      if ((__ndk1 *)0x2540be3ff < this) {
        auVar8 = FUN_00bcac54(puVar5,(ulong)this / 10000000000);
        param_1 = auVar8._8_8_;
        puVar5 = auVar8._0_8_;
        this = (__ndk1 *)((ulong)this % 10000000000);
      }
      puVar7 = puVar5 + 5;
      uVar2 = (int)this + (int)((ulong)this / 100000000) * -100000000;
      uVar3 = uVar2 % 1000000;
      uVar4 = uVar3 % 10000;
      *puVar5 = *(undefined2 *)(&DAT_0078a180 + ((ulong)this / 100000000) * 2);
      puVar5[1] = *(undefined2 *)(&DAT_0078a180 + ((ulong)uVar2 / 1000000) * 2);
      puVar5[2] = *(undefined2 *)(&DAT_0078a180 + ((ulong)uVar3 / 10000) * 2);
      puVar5[3] = *(undefined2 *)(&DAT_0078a180 + (ulong)(uVar4 / 100) * 2);
      puVar5[4] = *(undefined2 *)(&DAT_0078a180 + (ulong)(uVar4 % 100) * 2);
    }
  }
  __n = (long)puVar7 - (long)local_44;
  if (0xfffffffffffffff7 < __n) {
                    /* WARNING: Subroutine does not return */
    FUN_007fe124(puVar5,param_1);
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
  if (puVar7 != local_44) {
    memcpy(__dest,local_44,__n);
  }
  __dest[__n] = 0;
  return;
}

