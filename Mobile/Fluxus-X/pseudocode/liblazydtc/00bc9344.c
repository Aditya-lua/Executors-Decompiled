/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc9344
 */

/* std::__ndk1::to_string(unsigned long long) */

void __thiscall std::__ndk1::to_string(__ndk1 *this,ulonglong param_1)

{
  ulong uVar1;
  uint uVar2;
  uint uVar3;
  undefined2 *puVar4;
  ulong *in_x8;
  undefined1 *__dest;
  ulong uVar5;
  undefined2 *puVar6;
  undefined1 auVar7 [16];
  undefined2 auStack_45 [10];
  
  if ((ulong)this >> 0x20 == 0) {
    auVar7 = FUN_00bcac54(auStack_45,(ulong)this & 0xffffffff);
    puVar6 = auVar7._0_8_;
  }
  else {
    if (this < (__ndk1 *)0x2540be400) {
      puVar4 = auStack_45;
    }
    else {
      auVar7 = FUN_00bcac54(auStack_45,(ulong)this / 10000000000);
      param_1 = auVar7._8_8_;
      puVar4 = auVar7._0_8_;
      this = (__ndk1 *)((ulong)this % 10000000000);
    }
    auVar7._8_8_ = param_1;
    auVar7._0_8_ = puVar4;
    puVar6 = puVar4 + 5;
    uVar5 = (ulong)this % 100000000;
    uVar2 = (int)uVar5 + (int)(uVar5 / 1000000) * -1000000;
    uVar3 = uVar2 % 10000;
    *puVar4 = *(undefined2 *)(&DAT_0078a180 + ((ulong)this / 100000000) * 2);
    puVar4[1] = *(undefined2 *)(&DAT_0078a180 + (uVar5 / 1000000) * 2);
    puVar4[2] = *(undefined2 *)(&DAT_0078a180 + ((ulong)uVar2 / 10000) * 2);
    puVar4[3] = *(undefined2 *)(&DAT_0078a180 + (ulong)(uVar3 / 100) * 2);
    puVar4[4] = *(undefined2 *)(&DAT_0078a180 + (ulong)(uVar3 % 100) * 2);
  }
  uVar5 = (long)puVar6 - (long)auStack_45;
  if (0xfffffffffffffff7 < uVar5) {
                    /* WARNING: Subroutine does not return */
    FUN_007fe124(auVar7._0_8_,auVar7._8_8_);
  }
  if (uVar5 < 0x17) {
    __dest = (undefined1 *)((long)in_x8 + 1);
    *(char *)in_x8 = (char)((int)uVar5 << 1);
  }
  else {
    uVar1 = 0x1a;
    if ((uVar5 | 7) != 0x17) {
      uVar1 = (uVar5 | 7) + 1;
    }
    __dest = operator_new(uVar1);
    in_x8[1] = uVar5;
    in_x8[2] = (ulong)__dest;
    *in_x8 = uVar1 | 1;
  }
  if (puVar6 != auStack_45) {
    memcpy(__dest,auStack_45,uVar5);
  }
  __dest[uVar5] = 0;
  return;
}

