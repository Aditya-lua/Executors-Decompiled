
/* WARNING: Possible PIC construction at 0x0028069c: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x002806a0) */
/* WARNING: Removing unreachable block (ram,0x002806ac) */
/* WARNING: Removing unreachable block (ram,0x002806d0) */

void FUN_0028064c(ulong param_1,undefined8 param_2,undefined8 param_3,ulong param_4,int param_5)

{
  uint uVar1;
  bool in_CY;
  ulong *puVar2;
  ulong uVar3;
  ulong uVar4;
  ulong uVar5;
  ulong uVar6;
  ulong uVar7;
  ulong uVar8;
  ulong uVar9;
  uint uVar10;
  uint uVar11;
  ulong in_x9;
  ulong uVar12;
  ulong uVar13;
  ulong uVar14;
  ulong uVar15;
  ulong uVar16;
  ulong uVar17;
  ulong uVar18;
  ulong uVar19;
  ulong *unaff_x19;
  ulong unaff_x20;
  ulong uVar20;
  ulong uVar21;
  ulong uVar22;
  ulong uVar23;
  ulong uVar24;
  ulong uVar25;
  undefined1 auVar26 [16];
  
  if (in_CY) {
    in_x9 = param_4;
  }
  if (in_x9 != 0) {
    param_4 = in_x9;
    _memcpy((long)unaff_x19 + param_1 + 0x50);
    param_1 = unaff_x19[0x1a];
  }
  unaff_x19[0x1a] = param_1 + in_x9;
  if (unaff_x20 == in_x9) {
    return;
  }
  if (param_1 + in_x9 == 0x80) {
    puVar2 = unaff_x19 + 10;
    param_4 = 0x80;
    param_5 = 0;
  }
  else {
    auVar26 = func_0x0079d0e4();
    puVar2 = auVar26._8_8_;
    unaff_x19 = auVar26._0_8_;
  }
  uVar8 = *unaff_x19;
  uVar7 = unaff_x19[1];
  uVar14 = unaff_x19[2];
  uVar15 = unaff_x19[3];
  uVar5 = unaff_x19[4];
  uVar4 = unaff_x19[5];
  uVar16 = unaff_x19[6];
  uVar12 = unaff_x19[7];
  uVar18 = unaff_x19[8];
  uVar6 = unaff_x19[9];
  uVar20 = uVar18 + param_4;
  unaff_x19[8] = uVar20;
  if (CARRY8(uVar18,param_4)) {
    uVar6 = uVar6 + 1;
    unaff_x19[9] = uVar6;
  }
  uVar10 = 0;
  uVar11 = 0;
  uVar20 = uVar20 ^ 0x510e527fade682d1;
  uVar6 = uVar6 ^ 0x9b05688c2b3e6c1f;
  uVar18 = 0x1f83d9abfb41bd6b;
  if (param_5 != 0) {
    uVar18 = 0xe07c265404be4294;
  }
  uVar3 = 0xa54ff53a5f1d36f1;
  uVar13 = 0x5be0cd19137e2179;
  uVar9 = 0x3c6ef372fe94f82b;
  uVar23 = 0xbb67ae8584caa73b;
  uVar22 = 0x6a09e667f3bcc908;
  do {
    uVar1 = uVar10;
    if (9 < uVar11) {
      uVar1 = uVar10 - 0xa0;
    }
    uVar8 = uVar8 + uVar5 + puVar2[(byte)(&UNK_0082e8f0)[uVar1]];
    uVar20 = uVar20 ^ uVar8;
    uVar21 = uVar20 >> 0x20 | uVar20 << 0x20;
    uVar20 = uVar7 + uVar4 + puVar2[(byte)(&UNK_0082e8f2)[uVar1]];
    uVar22 = uVar22 + uVar21;
    uVar5 = uVar22 ^ uVar5;
    uVar6 = uVar6 ^ uVar20;
    uVar7 = uVar6 >> 0x20 | uVar6 << 0x20;
    uVar23 = uVar23 + uVar7;
    uVar24 = uVar5 >> 0x18 | uVar5 << 0x28;
    uVar4 = uVar23 ^ uVar4;
    uVar25 = uVar4 >> 0x18 | uVar4 << 0x28;
    uVar6 = uVar8 + puVar2[(byte)(&UNK_0082e8f1)[uVar1]] + uVar24;
    uVar20 = uVar20 + puVar2[(byte)(&UNK_0082e8f3)[uVar1]] + uVar25;
    uVar21 = uVar6 ^ uVar21;
    uVar8 = uVar14 + uVar16 + puVar2[(byte)(&UNK_0082e8f4)[uVar1]];
    uVar18 = uVar18 ^ uVar8;
    uVar7 = uVar20 ^ uVar7;
    uVar5 = uVar18 >> 0x20 | uVar18 << 0x20;
    uVar9 = uVar9 + uVar5;
    uVar16 = uVar9 ^ uVar16;
    uVar19 = uVar21 >> 0x10 | uVar21 << 0x30;
    uVar16 = uVar16 >> 0x18 | uVar16 << 0x28;
    uVar14 = uVar8 + puVar2[(byte)(&UNK_0082e8f5)[uVar1]] + uVar16;
    uVar21 = uVar7 >> 0x10 | uVar7 << 0x30;
    uVar5 = uVar14 ^ uVar5;
    uVar17 = uVar5 >> 0x10 | uVar5 << 0x30;
    uVar22 = uVar19 + uVar22;
    uVar24 = uVar22 ^ uVar24;
    uVar8 = uVar15 + uVar12 + puVar2[(byte)(&UNK_0082e8f6)[uVar1]];
    uVar13 = uVar13 ^ uVar8;
    uVar7 = uVar13 >> 0x20 | uVar13 << 0x20;
    uVar23 = uVar21 + uVar23;
    uVar25 = uVar23 ^ uVar25;
    uVar3 = uVar3 + uVar7;
    uVar12 = uVar3 ^ uVar12;
    uVar4 = uVar12 >> 0x18 | uVar12 << 0x28;
    uVar18 = uVar24 >> 0x3f | uVar24 << 1;
    uVar9 = uVar17 + uVar9;
    uVar16 = uVar9 ^ uVar16;
    uVar15 = uVar8 + puVar2[(byte)(&UNK_0082e8f7)[uVar1]] + uVar4;
    uVar8 = uVar25 >> 0x3f | uVar25 << 1;
    uVar7 = uVar15 ^ uVar7;
    uVar7 = uVar7 >> 0x10 | uVar7 << 0x30;
    uVar3 = uVar7 + uVar3;
    uVar5 = uVar16 >> 0x3f | uVar16 << 1;
    uVar4 = uVar3 ^ uVar4;
    uVar12 = uVar4 >> 0x3f | uVar4 << 1;
    uVar6 = uVar8 + uVar6 + puVar2[(byte)(&UNK_0082e8f8)[uVar1]];
    uVar7 = uVar6 ^ uVar7;
    uVar4 = uVar7 >> 0x20 | uVar7 << 0x20;
    uVar20 = uVar5 + uVar20 + puVar2[(byte)(&UNK_0082e8fa)[uVar1]];
    uVar9 = uVar4 + uVar9;
    uVar8 = uVar9 ^ uVar8;
    uVar19 = uVar20 ^ uVar19;
    uVar16 = uVar19 >> 0x20 | uVar19 << 0x20;
    uVar3 = uVar16 + uVar3;
    uVar19 = uVar8 >> 0x18 | uVar8 << 0x28;
    uVar5 = uVar3 ^ uVar5;
    uVar24 = uVar5 >> 0x18 | uVar5 << 0x28;
    uVar8 = uVar6 + puVar2[(byte)(&UNK_0082e8f9)[uVar1]] + uVar19;
    uVar7 = uVar20 + puVar2[(byte)(&UNK_0082e8fb)[uVar1]] + uVar24;
    uVar4 = uVar8 ^ uVar4;
    uVar6 = uVar12 + uVar14 + puVar2[(byte)(&UNK_0082e8fc)[uVar1]];
    uVar21 = uVar6 ^ uVar21;
    uVar16 = uVar7 ^ uVar16;
    uVar5 = uVar21 >> 0x20 | uVar21 << 0x20;
    uVar22 = uVar5 + uVar22;
    uVar12 = uVar22 ^ uVar12;
    uVar13 = uVar4 >> 0x10 | uVar4 << 0x30;
    uVar12 = uVar12 >> 0x18 | uVar12 << 0x28;
    uVar14 = uVar6 + puVar2[(byte)(&UNK_0082e8fd)[uVar1]] + uVar12;
    uVar20 = uVar16 >> 0x10 | uVar16 << 0x30;
    uVar5 = uVar14 ^ uVar5;
    uVar6 = uVar5 >> 0x10 | uVar5 << 0x30;
    uVar9 = uVar13 + uVar9;
    uVar19 = uVar9 ^ uVar19;
    uVar3 = uVar20 + uVar3;
    uVar24 = uVar3 ^ uVar24;
    uVar15 = uVar15 + puVar2[(byte)(&UNK_0082e8fe)[uVar1]] + uVar18;
    uVar17 = uVar15 ^ uVar17;
    uVar22 = uVar6 + uVar22;
    uVar12 = uVar22 ^ uVar12;
    uVar21 = uVar17 >> 0x20 | uVar17 << 0x20;
    uVar23 = uVar21 + uVar23;
    uVar18 = uVar23 ^ uVar18;
    uVar4 = uVar19 >> 0x3f | uVar19 << 1;
    uVar5 = uVar18 >> 0x18 | uVar18 << 0x28;
    uVar15 = uVar15 + puVar2[(byte)(&UNK_0082e8ff)[uVar1]] + uVar5;
    uVar16 = uVar24 >> 0x3f | uVar24 << 1;
    uVar21 = uVar15 ^ uVar21;
    uVar18 = uVar21 >> 0x10 | uVar21 << 0x30;
    uVar23 = uVar18 + uVar23;
    uVar12 = uVar12 >> 0x3f | uVar12 << 1;
    uVar5 = uVar23 ^ uVar5;
    uVar5 = uVar5 >> 0x3f | uVar5 << 1;
    uVar11 = uVar11 + 1;
    uVar10 = uVar10 + 0x10;
  } while (uVar11 != 0xc);
  *unaff_x19 = uVar22 ^ *unaff_x19 ^ uVar8;
  unaff_x19[1] = uVar23 ^ unaff_x19[1] ^ uVar7;
  unaff_x19[2] = uVar9 ^ unaff_x19[2] ^ uVar14;
  unaff_x19[3] = uVar3 ^ unaff_x19[3] ^ uVar15;
  unaff_x19[4] = uVar20 ^ unaff_x19[4] ^ uVar5;
  unaff_x19[5] = uVar6 ^ unaff_x19[5] ^ uVar4;
  unaff_x19[6] = uVar18 ^ unaff_x19[6] ^ uVar16;
  unaff_x19[7] = uVar13 ^ unaff_x19[7] ^ uVar12;
  return;
}

