/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc94fc
 */

/* std::__ndk1::to_wstring(int) */

void __thiscall std::__ndk1::to_wstring(__ndk1 *this,int param_1)

{
  uint uVar1;
  undefined1 auVar2 [16];
  undefined1 auVar3 [16];
  byte *pbVar4;
  byte *pbVar5;
  uint uVar6;
  ulong *in_x8;
  uint *puVar7;
  byte *pbVar8;
  ulong uVar9;
  undefined1 (*pauVar10) [16];
  ulong uVar11;
  uint *puVar12;
  ulong uVar13;
  undefined1 auVar14 [16];
  undefined1 auVar15 [16];
  undefined1 auVar16 [16];
  undefined1 auVar17 [16];
  undefined1 auVar18 [16];
  undefined1 auVar19 [16];
  undefined1 auVar20 [16];
  byte local_3c [11];
  byte bStack_31;
  
  uVar6 = (uint)this;
  pbVar4 = local_3c;
  pbVar5 = &bStack_31;
  if ((int)uVar6 < 0) {
    pbVar4 = (byte *)((ulong)pbVar4 | 1);
    uVar6 = -uVar6;
    local_3c[0] = 0x2d;
  }
  if ((9 < (long)pbVar5 - (long)pbVar4) ||
     (uVar1 = (uint)((0x20 - (int)LZCOUNT(uVar6 | 1)) * 0x4d1) >> 0xc,
     (long)(ulong)((uVar1 - (uVar6 < *(uint *)(&DAT_0078a158 + (ulong)uVar1 * 4))) + 1) <=
     (long)pbVar5 - (long)pbVar4)) {
    pbVar5 = (byte *)FUN_00bcac54();
  }
  uVar13 = (long)pbVar5 - (long)local_3c;
  if (0x3ffffffffffffff7 < uVar13) {
                    /* WARNING: Subroutine does not return */
    FUN_00bc5610();
  }
  if (uVar13 < 5) {
    puVar12 = (uint *)((long)in_x8 + 4);
    *(char *)in_x8 = (char)((int)uVar13 << 1);
  }
  else {
    uVar11 = 8;
    if ((uVar13 | 1) != 5) {
      uVar11 = (uVar13 | 1) + 1;
    }
    puVar12 = operator_new(uVar11 << 2);
    in_x8[1] = uVar13;
    in_x8[2] = (ulong)puVar12;
    *in_x8 = uVar11 | 1;
  }
  if (local_3c != pbVar5) {
    uVar13 = (long)pbVar5 - (long)local_3c;
    if (uVar13 < 0x20) {
      puVar7 = puVar12;
      pbVar4 = local_3c;
    }
    else {
      uVar9 = uVar13 & 0xffffffffffffffe0;
      puVar7 = puVar12 + uVar9;
      pbVar4 = local_3c + uVar9;
      pauVar10 = (undefined1 (*) [16])(local_3c + 0x10);
      puVar12 = puVar12 + 0x10;
      uVar11 = uVar9;
      do {
        auVar15 = pauVar10[-1];
        auVar3 = *pauVar10;
        uVar11 = uVar11 - 0x20;
        pauVar10 = pauVar10 + 2;
        auVar19._8_8_ = 0xffffff0fffffff0e;
        auVar19._0_8_ = 0xffffff0dffffff0c;
        auVar16 = a64_TBL(ZEXT816(0),auVar15,auVar19);
        auVar18._8_8_ = 0xffffff0bffffff0a;
        auVar18._0_8_ = 0xffffff09ffffff08;
        auVar18 = a64_TBL(ZEXT816(0),auVar15,auVar18);
        auVar17._8_8_ = 0xffffff07ffffff06;
        auVar17._0_8_ = 0xffffff05ffffff04;
        auVar19 = a64_TBL(ZEXT816(0),auVar15,auVar17);
        auVar14._8_8_ = 0xffffff03ffffff02;
        auVar14._0_8_ = 0xffffff01ffffff00;
        auVar14 = a64_TBL(ZEXT816(0),auVar15,auVar14);
        auVar20._8_8_ = 0xffffff0fffffff0e;
        auVar20._0_8_ = 0xffffff0dffffff0c;
        auVar20 = a64_TBL(ZEXT816(0),auVar3,auVar20);
        *(long *)(puVar12 + -6) = auVar18._8_8_;
        *(long *)(puVar12 + -8) = auVar18._0_8_;
        *(long *)(puVar12 + -2) = auVar16._8_8_;
        *(long *)(puVar12 + -4) = auVar16._0_8_;
        auVar2._8_8_ = 0xffffff0bffffff0a;
        auVar2._0_8_ = 0xffffff09ffffff08;
        auVar17 = a64_TBL(ZEXT816(0),auVar3,auVar2);
        auVar16._8_8_ = 0xffffff07ffffff06;
        auVar16._0_8_ = 0xffffff05ffffff04;
        auVar16 = a64_TBL(ZEXT816(0),auVar3,auVar16);
        auVar15._8_8_ = 0xffffff03ffffff02;
        auVar15._0_8_ = 0xffffff01ffffff00;
        auVar15 = a64_TBL(ZEXT816(0),auVar3,auVar15);
        *(long *)(puVar12 + -0xe) = auVar14._8_8_;
        *(long *)(puVar12 + -0x10) = auVar14._0_8_;
        *(long *)(puVar12 + -10) = auVar19._8_8_;
        *(long *)(puVar12 + -0xc) = auVar19._0_8_;
        *(long *)(puVar12 + 10) = auVar17._8_8_;
        *(long *)(puVar12 + 8) = auVar17._0_8_;
        *(long *)(puVar12 + 0xe) = auVar20._8_8_;
        *(long *)(puVar12 + 0xc) = auVar20._0_8_;
        *(long *)(puVar12 + 2) = auVar15._8_8_;
        *(long *)puVar12 = auVar15._0_8_;
        *(long *)(puVar12 + 6) = auVar16._8_8_;
        *(long *)(puVar12 + 4) = auVar16._0_8_;
        puVar12 = puVar12 + 0x20;
      } while (uVar11 != 0);
      puVar12 = puVar7;
      if (uVar13 == uVar9) goto LAB_00bc9698;
    }
    do {
      pbVar8 = pbVar4 + 1;
      *puVar7 = (uint)*pbVar4;
      puVar12 = puVar7 + 1;
      puVar7 = puVar7 + 1;
      pbVar4 = pbVar8;
    } while (pbVar8 != pbVar5);
  }
LAB_00bc9698:
  *puVar12 = 0;
  return;
}

