/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc9d70
 */

/* std::__ndk1::to_wstring(unsigned long) */

void __thiscall std::__ndk1::to_wstring(__ndk1 *this,ulong param_1)

{
  uint uVar1;
  uint uVar2;
  undefined1 auVar3 [16];
  undefined1 auVar4 [16];
  undefined1 auVar5 [16];
  byte *pbVar6;
  ulong *in_x8;
  uint *puVar7;
  byte *pbVar8;
  ulong uVar9;
  undefined1 (*pauVar10) [16];
  ulong uVar11;
  uint *puVar12;
  byte *pbVar13;
  ulong uVar14;
  undefined1 auVar15 [16];
  undefined1 auVar16 [16];
  undefined1 auVar17 [16];
  undefined1 auVar18 [16];
  undefined1 auVar19 [16];
  undefined1 auVar20 [16];
  undefined1 auVar21 [16];
  byte local_45 [16];
  undefined1 auStack_35 [5];
  
  if ((ulong)this >> 0x20 == 0) {
    auVar21 = FUN_00bcac54(local_45,(ulong)this & 0xffffffff);
    pbVar13 = auVar21._0_8_;
  }
  else {
    if (this < (__ndk1 *)0x2540be400) {
      pbVar6 = local_45;
    }
    else {
      auVar21 = FUN_00bcac54(local_45,(ulong)this / 10000000000);
      param_1 = auVar21._8_8_;
      pbVar6 = auVar21._0_8_;
      this = (__ndk1 *)((ulong)this % 10000000000);
    }
    auVar21._8_8_ = param_1;
    auVar21._0_8_ = pbVar6;
    uVar14 = (ulong)this % 100000000;
    pbVar13 = pbVar6 + 10;
    uVar1 = (int)uVar14 + (int)(uVar14 / 1000000) * -1000000;
    uVar2 = uVar1 % 10000;
    *(undefined2 *)pbVar6 = *(undefined2 *)(&DAT_0078a180 + ((ulong)this / 100000000) * 2);
    *(undefined2 *)(pbVar6 + 2) = *(undefined2 *)(&DAT_0078a180 + (uVar14 / 1000000) * 2);
    *(undefined2 *)(pbVar6 + 4) = *(undefined2 *)(&DAT_0078a180 + ((ulong)uVar1 / 10000) * 2);
    *(undefined2 *)(pbVar6 + 6) = *(undefined2 *)(&DAT_0078a180 + (ulong)(uVar2 / 100) * 2);
    *(undefined2 *)(pbVar6 + 8) = *(undefined2 *)(&DAT_0078a180 + (ulong)(uVar2 % 100) * 2);
  }
  uVar14 = (long)pbVar13 - (long)local_45;
  if (0x3ffffffffffffff7 < uVar14) {
                    /* WARNING: Subroutine does not return */
    FUN_00bc5610(auVar21._0_8_,auVar21._8_8_);
  }
  if (uVar14 < 5) {
    puVar12 = (uint *)((long)in_x8 + 4);
    *(char *)in_x8 = (char)((int)uVar14 << 1);
  }
  else {
    uVar11 = 8;
    if ((uVar14 | 1) != 5) {
      uVar11 = (uVar14 | 1) + 1;
    }
    puVar12 = operator_new(uVar11 << 2);
    in_x8[1] = uVar14;
    in_x8[2] = (ulong)puVar12;
    *in_x8 = uVar11 | 1;
  }
  if (local_45 != pbVar13) {
    if (uVar14 < 0x20) {
      puVar7 = puVar12;
      pbVar6 = local_45;
    }
    else {
      uVar9 = uVar14 & 0x3fffffffffffffe0;
      puVar7 = puVar12 + uVar9;
      pbVar6 = local_45 + uVar9;
      pauVar10 = (undefined1 (*) [16])auStack_35;
      puVar12 = puVar12 + 0x10;
      uVar11 = uVar9;
      do {
        auVar21 = pauVar10[-1];
        auVar5 = *pauVar10;
        uVar11 = uVar11 - 0x20;
        pauVar10 = pauVar10 + 2;
        auVar20._8_8_ = 0xffffff0fffffff0e;
        auVar20._0_8_ = 0xffffff0dffffff0c;
        auVar16 = a64_TBL(ZEXT816(0),auVar21,auVar20);
        auVar19._8_8_ = 0xffffff0bffffff0a;
        auVar19._0_8_ = 0xffffff09ffffff08;
        auVar18 = a64_TBL(ZEXT816(0),auVar21,auVar19);
        auVar17._8_8_ = 0xffffff07ffffff06;
        auVar17._0_8_ = 0xffffff05ffffff04;
        auVar19 = a64_TBL(ZEXT816(0),auVar21,auVar17);
        auVar15._8_8_ = 0xffffff03ffffff02;
        auVar15._0_8_ = 0xffffff01ffffff00;
        auVar21 = a64_TBL(ZEXT816(0),auVar21,auVar15);
        auVar4._8_8_ = 0xffffff0fffffff0e;
        auVar4._0_8_ = 0xffffff0dffffff0c;
        auVar20 = a64_TBL(ZEXT816(0),auVar5,auVar4);
        *(long *)(puVar12 + -6) = auVar18._8_8_;
        *(long *)(puVar12 + -8) = auVar18._0_8_;
        *(long *)(puVar12 + -2) = auVar16._8_8_;
        *(long *)(puVar12 + -4) = auVar16._0_8_;
        auVar3._8_8_ = 0xffffff0bffffff0a;
        auVar3._0_8_ = 0xffffff09ffffff08;
        auVar17 = a64_TBL(ZEXT816(0),auVar5,auVar3);
        auVar18._8_8_ = 0xffffff07ffffff06;
        auVar18._0_8_ = 0xffffff05ffffff04;
        auVar18 = a64_TBL(ZEXT816(0),auVar5,auVar18);
        auVar16._8_8_ = 0xffffff03ffffff02;
        auVar16._0_8_ = 0xffffff01ffffff00;
        auVar15 = a64_TBL(ZEXT816(0),auVar5,auVar16);
        *(long *)(puVar12 + -0xe) = auVar21._8_8_;
        *(long *)(puVar12 + -0x10) = auVar21._0_8_;
        *(long *)(puVar12 + -10) = auVar19._8_8_;
        *(long *)(puVar12 + -0xc) = auVar19._0_8_;
        *(long *)(puVar12 + 10) = auVar17._8_8_;
        *(long *)(puVar12 + 8) = auVar17._0_8_;
        *(long *)(puVar12 + 0xe) = auVar20._8_8_;
        *(long *)(puVar12 + 0xc) = auVar20._0_8_;
        *(long *)(puVar12 + 2) = auVar15._8_8_;
        *(long *)puVar12 = auVar15._0_8_;
        *(long *)(puVar12 + 6) = auVar18._8_8_;
        *(long *)(puVar12 + 4) = auVar18._0_8_;
        puVar12 = puVar12 + 0x20;
      } while (uVar11 != 0);
      puVar12 = puVar7;
      if (uVar14 == uVar9) goto LAB_00bc9fac;
    }
    do {
      pbVar8 = pbVar6 + 1;
      *puVar7 = (uint)*pbVar6;
      puVar12 = puVar7 + 1;
      puVar7 = puVar7 + 1;
      pbVar6 = pbVar8;
    } while (pbVar8 != pbVar13);
  }
LAB_00bc9fac:
  *puVar12 = 0;
  return;
}

