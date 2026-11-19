/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc9c18
 */

/* std::__ndk1::to_wstring(unsigned int) */

void __thiscall std::__ndk1::to_wstring(__ndk1 *this,uint param_1)

{
  undefined1 auVar1 [16];
  undefined1 auVar2 [16];
  byte *pbVar3;
  ulong *in_x8;
  uint *puVar4;
  byte *pbVar6;
  byte *pbVar5;
  ulong uVar7;
  undefined1 (*pauVar8) [16];
  ulong uVar9;
  uint *puVar10;
  ulong uVar11;
  undefined1 auVar12 [16];
  undefined1 auVar13 [16];
  undefined1 auVar14 [16];
  undefined1 auVar15 [16];
  undefined1 auVar16 [16];
  undefined1 auVar17 [16];
  undefined1 auVar18 [16];
  byte local_3b [11];
  
  pbVar3 = (byte *)FUN_00bcac54(local_3b,(ulong)this & 0xffffffff);
  uVar11 = (long)pbVar3 - (long)local_3b;
  if (0x3ffffffffffffff7 < uVar11) {
                    /* WARNING: Subroutine does not return */
    FUN_00bc5610();
  }
  if (uVar11 < 5) {
    puVar10 = (uint *)((long)in_x8 + 4);
    *(char *)in_x8 = (char)((int)uVar11 << 1);
  }
  else {
    uVar9 = 8;
    if ((uVar11 | 1) != 5) {
      uVar9 = (uVar11 | 1) + 1;
    }
    puVar10 = operator_new(uVar9 << 2);
    in_x8[1] = uVar11;
    in_x8[2] = (ulong)puVar10;
    *in_x8 = uVar9 | 1;
  }
  if (local_3b != pbVar3) {
    if (uVar11 < 0x20) {
      puVar4 = puVar10;
      pbVar6 = local_3b;
    }
    else {
      uVar7 = uVar11 & 0x3fffffffffffffe0;
      puVar4 = puVar10 + uVar7;
      pbVar6 = local_3b + uVar7;
      pauVar8 = (undefined1 (*) [16])(local_3b + 0x10);
      puVar10 = puVar10 + 0x10;
      uVar9 = uVar7;
      do {
        auVar13 = pauVar8[-1];
        auVar2 = *pauVar8;
        uVar9 = uVar9 - 0x20;
        pauVar8 = pauVar8 + 2;
        auVar17._8_8_ = 0xffffff0fffffff0e;
        auVar17._0_8_ = 0xffffff0dffffff0c;
        auVar14 = a64_TBL(ZEXT816(0),auVar13,auVar17);
        auVar16._8_8_ = 0xffffff0bffffff0a;
        auVar16._0_8_ = 0xffffff09ffffff08;
        auVar16 = a64_TBL(ZEXT816(0),auVar13,auVar16);
        auVar15._8_8_ = 0xffffff07ffffff06;
        auVar15._0_8_ = 0xffffff05ffffff04;
        auVar17 = a64_TBL(ZEXT816(0),auVar13,auVar15);
        auVar12._8_8_ = 0xffffff03ffffff02;
        auVar12._0_8_ = 0xffffff01ffffff00;
        auVar12 = a64_TBL(ZEXT816(0),auVar13,auVar12);
        auVar18._8_8_ = 0xffffff0fffffff0e;
        auVar18._0_8_ = 0xffffff0dffffff0c;
        auVar18 = a64_TBL(ZEXT816(0),auVar2,auVar18);
        *(long *)(puVar10 + -6) = auVar16._8_8_;
        *(long *)(puVar10 + -8) = auVar16._0_8_;
        *(long *)(puVar10 + -2) = auVar14._8_8_;
        *(long *)(puVar10 + -4) = auVar14._0_8_;
        auVar1._8_8_ = 0xffffff0bffffff0a;
        auVar1._0_8_ = 0xffffff09ffffff08;
        auVar15 = a64_TBL(ZEXT816(0),auVar2,auVar1);
        auVar14._8_8_ = 0xffffff07ffffff06;
        auVar14._0_8_ = 0xffffff05ffffff04;
        auVar14 = a64_TBL(ZEXT816(0),auVar2,auVar14);
        auVar13._8_8_ = 0xffffff03ffffff02;
        auVar13._0_8_ = 0xffffff01ffffff00;
        auVar13 = a64_TBL(ZEXT816(0),auVar2,auVar13);
        *(long *)(puVar10 + -0xe) = auVar12._8_8_;
        *(long *)(puVar10 + -0x10) = auVar12._0_8_;
        *(long *)(puVar10 + -10) = auVar17._8_8_;
        *(long *)(puVar10 + -0xc) = auVar17._0_8_;
        *(long *)(puVar10 + 10) = auVar15._8_8_;
        *(long *)(puVar10 + 8) = auVar15._0_8_;
        *(long *)(puVar10 + 0xe) = auVar18._8_8_;
        *(long *)(puVar10 + 0xc) = auVar18._0_8_;
        *(long *)(puVar10 + 2) = auVar13._8_8_;
        *(long *)puVar10 = auVar13._0_8_;
        *(long *)(puVar10 + 6) = auVar14._8_8_;
        *(long *)(puVar10 + 4) = auVar14._0_8_;
        puVar10 = puVar10 + 0x20;
      } while (uVar9 != 0);
      puVar10 = puVar4;
      if (uVar11 == uVar7) goto LAB_00bc9d50;
    }
    do {
      pbVar5 = pbVar6 + 1;
      *puVar4 = (uint)*pbVar6;
      puVar10 = puVar4 + 1;
      puVar4 = puVar4 + 1;
      pbVar6 = pbVar5;
    } while (pbVar5 != pbVar3);
  }
LAB_00bc9d50:
  *puVar10 = 0;
  return;
}

