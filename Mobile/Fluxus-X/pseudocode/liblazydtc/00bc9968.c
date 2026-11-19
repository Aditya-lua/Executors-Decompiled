/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc9968
 */

/* std::__ndk1::to_wstring(long long) */

void __thiscall std::__ndk1::to_wstring(__ndk1 *this,longlong param_1)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  undefined1 auVar4 [16];
  undefined1 auVar5 [16];
  byte *pbVar6;
  ulong *in_x8;
  long lVar7;
  uint *puVar8;
  byte *pbVar9;
  ulong uVar10;
  undefined1 (*pauVar11) [16];
  ulong uVar12;
  uint *puVar13;
  byte *pbVar14;
  ulong uVar15;
  undefined1 auVar16 [16];
  undefined1 auVar17 [16];
  undefined1 auVar18 [16];
  undefined1 auVar19 [16];
  undefined1 auVar20 [16];
  undefined1 auVar21 [16];
  undefined1 auVar22 [16];
  byte local_44 [16];
  undefined1 auStack_34 [4];
  
  pbVar6 = local_44;
  if ((long)this < 0) {
    pbVar6 = (byte *)((ulong)pbVar6 | 1);
    this = (__ndk1 *)-(long)this;
    local_44[0] = 0x2d;
  }
  lVar7 = (long)(auStack_34 + 4) - (long)pbVar6;
  if ((0x13 < lVar7) ||
     (uVar1 = (uint)((0x40 - (int)LZCOUNT((ulong)this | 1)) * 0x4d1) >> 0xc,
     pbVar14 = auStack_34 + 4,
     (long)(ulong)((uVar1 - (this < *(__ndk1 **)(&DAT_0078a248 + (ulong)uVar1 * 8))) + 1) <= lVar7))
  {
    if ((ulong)this >> 0x20 == 0) {
      auVar22 = FUN_00bcac54(pbVar6,(ulong)this & 0xffffffff);
      param_1 = auVar22._8_8_;
      pbVar6 = auVar22._0_8_;
      pbVar14 = pbVar6;
    }
    else {
      if ((__ndk1 *)0x2540be3ff < this) {
        auVar22 = FUN_00bcac54(pbVar6,(ulong)this / 10000000000);
        param_1 = auVar22._8_8_;
        pbVar6 = auVar22._0_8_;
        this = (__ndk1 *)((ulong)this % 10000000000);
      }
      pbVar14 = pbVar6 + 10;
      uVar1 = (int)this + (int)((ulong)this / 100000000) * -100000000;
      uVar2 = uVar1 % 1000000;
      uVar3 = uVar2 % 10000;
      *(undefined2 *)pbVar6 = *(undefined2 *)(&DAT_0078a180 + ((ulong)this / 100000000) * 2);
      *(undefined2 *)(pbVar6 + 2) = *(undefined2 *)(&DAT_0078a180 + ((ulong)uVar1 / 1000000) * 2);
      *(undefined2 *)(pbVar6 + 4) = *(undefined2 *)(&DAT_0078a180 + ((ulong)uVar2 / 10000) * 2);
      *(undefined2 *)(pbVar6 + 6) = *(undefined2 *)(&DAT_0078a180 + (ulong)(uVar3 / 100) * 2);
      *(undefined2 *)(pbVar6 + 8) = *(undefined2 *)(&DAT_0078a180 + (ulong)(uVar3 % 100) * 2);
    }
  }
  uVar15 = (long)pbVar14 - (long)local_44;
  if (0x3ffffffffffffff7 < uVar15) {
                    /* WARNING: Subroutine does not return */
    FUN_00bc5610(pbVar6,param_1);
  }
  if (uVar15 < 5) {
    puVar13 = (uint *)((long)in_x8 + 4);
    *(char *)in_x8 = (char)((int)uVar15 << 1);
  }
  else {
    uVar12 = 8;
    if ((uVar15 | 1) != 5) {
      uVar12 = (uVar15 | 1) + 1;
    }
    puVar13 = operator_new(uVar12 << 2);
    in_x8[1] = uVar15;
    in_x8[2] = (ulong)puVar13;
    *in_x8 = uVar12 | 1;
  }
  if (local_44 != pbVar14) {
    if (uVar15 < 0x20) {
      puVar8 = puVar13;
      pbVar6 = local_44;
    }
    else {
      uVar10 = uVar15 & 0x3fffffffffffffe0;
      puVar8 = puVar13 + uVar10;
      pbVar6 = local_44 + uVar10;
      pauVar11 = (undefined1 (*) [16])auStack_34;
      puVar13 = puVar13 + 0x10;
      uVar12 = uVar10;
      do {
        auVar16 = pauVar11[-1];
        auVar5 = *pauVar11;
        uVar12 = uVar12 - 0x20;
        pauVar11 = pauVar11 + 2;
        auVar20._8_8_ = 0xffffff0fffffff0e;
        auVar20._0_8_ = 0xffffff0dffffff0c;
        auVar17 = a64_TBL(ZEXT816(0),auVar16,auVar20);
        auVar19._8_8_ = 0xffffff0bffffff0a;
        auVar19._0_8_ = 0xffffff09ffffff08;
        auVar19 = a64_TBL(ZEXT816(0),auVar16,auVar19);
        auVar18._8_8_ = 0xffffff07ffffff06;
        auVar18._0_8_ = 0xffffff05ffffff04;
        auVar20 = a64_TBL(ZEXT816(0),auVar16,auVar18);
        auVar22._8_8_ = 0xffffff03ffffff02;
        auVar22._0_8_ = 0xffffff01ffffff00;
        auVar22 = a64_TBL(ZEXT816(0),auVar16,auVar22);
        auVar21._8_8_ = 0xffffff0fffffff0e;
        auVar21._0_8_ = 0xffffff0dffffff0c;
        auVar21 = a64_TBL(ZEXT816(0),auVar5,auVar21);
        *(long *)(puVar13 + -6) = auVar19._8_8_;
        *(long *)(puVar13 + -8) = auVar19._0_8_;
        *(long *)(puVar13 + -2) = auVar17._8_8_;
        *(long *)(puVar13 + -4) = auVar17._0_8_;
        auVar4._8_8_ = 0xffffff0bffffff0a;
        auVar4._0_8_ = 0xffffff09ffffff08;
        auVar18 = a64_TBL(ZEXT816(0),auVar5,auVar4);
        auVar17._8_8_ = 0xffffff07ffffff06;
        auVar17._0_8_ = 0xffffff05ffffff04;
        auVar17 = a64_TBL(ZEXT816(0),auVar5,auVar17);
        auVar16._8_8_ = 0xffffff03ffffff02;
        auVar16._0_8_ = 0xffffff01ffffff00;
        auVar16 = a64_TBL(ZEXT816(0),auVar5,auVar16);
        *(long *)(puVar13 + -0xe) = auVar22._8_8_;
        *(long *)(puVar13 + -0x10) = auVar22._0_8_;
        *(long *)(puVar13 + -10) = auVar20._8_8_;
        *(long *)(puVar13 + -0xc) = auVar20._0_8_;
        *(long *)(puVar13 + 10) = auVar18._8_8_;
        *(long *)(puVar13 + 8) = auVar18._0_8_;
        *(long *)(puVar13 + 0xe) = auVar21._8_8_;
        *(long *)(puVar13 + 0xc) = auVar21._0_8_;
        *(long *)(puVar13 + 2) = auVar16._8_8_;
        *(long *)puVar13 = auVar16._0_8_;
        *(long *)(puVar13 + 6) = auVar17._8_8_;
        *(long *)(puVar13 + 4) = auVar17._0_8_;
        puVar13 = puVar13 + 0x20;
      } while (uVar12 != 0);
      puVar13 = puVar8;
      if (uVar15 == uVar10) goto LAB_00bc9bf8;
    }
    do {
      pbVar9 = pbVar6 + 1;
      *puVar8 = (uint)*pbVar6;
      puVar13 = puVar8 + 1;
      puVar8 = puVar8 + 1;
      pbVar6 = pbVar9;
    } while (pbVar9 != pbVar14);
  }
LAB_00bc9bf8:
  *puVar13 = 0;
  return;
}

