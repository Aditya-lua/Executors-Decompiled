
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_0069def0(long param_1,uint param_2,uint param_3,uint param_4,uint param_5)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  uint uVar5;
  uint uVar6;
  uint uVar7;
  uint uVar8;
  uint uVar9;
  byte bVar10;
  byte bVar11;
  undefined1 uVar12;
  byte bVar13;
  undefined1 uVar14;
  byte bVar15;
  byte bVar16;
  undefined1 uVar17;
  byte bVar18;
  undefined1 uVar19;
  byte bVar20;
  byte bVar21;
  long lVar22;
  uint in_w10;
  uint in_w11;
  uint in_w12;
  int iVar23;
  uint in_w13;
  uint *puVar24;
  uint in_w14;
  uint uVar25;
  uint uVar26;
  uint in_w16;
  uint uVar27;
  uint uVar28;
  uint *unaff_x19;
  uint *unaff_x20;
  long unaff_x21;
  
  param_3 = param_3 ^ param_2;
  uVar25 = *(uint *)((ulong)(param_3 >> 8 & 0xff) * 4 + 0xa3e0f0);
  uVar1 = *(uint *)((ulong)(param_3 >> 0x10 & 0xff) * 4 + 0xa3e0f0);
  uVar2 = *(uint *)((ulong)(param_3 >> 0x18) * 4 + 0xa3e0f0);
  uVar28 = in_w16 ^ in_w14;
  uVar3 = *(uint *)((ulong)(uVar28 >> 8 & 0xff) * 4 + 0xa3e0f0);
  uVar4 = *(uint *)((ulong)(uVar28 >> 0x10 & 0xff) * 4 + 0xa3e0f0);
  uVar5 = *(uint *)((ulong)(uVar28 >> 0x18) * 4 + 0xa3e0f0);
  uVar26 = in_w13 ^ in_w12;
  uVar6 = *(uint *)((ulong)(uVar26 >> 8 & 0xff) * 4 + 0xa3e0f0);
  uVar7 = *(uint *)((ulong)(uVar26 >> 0x10 & 0xff) * 4 + 0xa3e0f0);
  uVar27 = in_w11 ^ in_w10;
  uVar8 = *(uint *)((ulong)(uVar26 >> 0x18) * 4 + 0xa3e0f0);
  uVar9 = *(uint *)((ulong)(uVar27 >> 8 & 0xff) * 4 + 0xa3e0f0);
  uVar25 = param_4 ^ (uVar25 >> 8 | uVar25 << 0x18) ^ (uVar4 >> 0x10 | uVar4 << 0x10) ^
           (uVar8 >> 0x18 | uVar8 << 8) ^ *(uint *)((ulong)(uVar27 & 0xff) * 4 + 0xa3e0f0);
  uVar26 = param_5 ^ (uVar1 >> 0x10 | uVar1 << 0x10) ^ (uVar5 >> 0x18 | uVar5 << 8) ^
           *(uint *)((ulong)(uVar26 & 0xff) * 4 + 0xa3e0f0) ^ (uVar9 >> 8 | uVar9 << 0x18);
  uVar1 = *(uint *)((ulong)(uVar27 >> 0x10 & 0xff) * 4 + 0xa3e0f0);
  uVar28 = *(uint *)(param_1 + 0x18) ^ (uVar2 >> 0x18 | uVar2 << 8) ^
           *(uint *)((ulong)(uVar28 & 0xff) * 4 + 0xa3e0f0) ^ (uVar6 >> 8 | uVar6 << 0x18) ^
           (uVar1 >> 0x10 | uVar1 << 0x10);
  uVar27 = *(uint *)((ulong)(uVar27 >> 0x18) * 4 + 0xa3e0f0);
  uVar27 = *(uint *)((ulong)(param_3 & 0xff) * 4 + 0xa3e0f0) ^ *(uint *)(param_1 + 0x1c) ^
           (uVar3 >> 8 | uVar3 << 0x18) ^ (uVar7 >> 0x10 | uVar7 << 0x10) ^
           (uVar27 >> 0x18 | uVar27 << 8);
  uVar1 = *(uint *)(unaff_x21 + 0x10) >> 1;
  iVar23 = uVar1 - 1;
  lVar22 = (ulong)(uVar1 - 2) * 0x20;
  puVar24 = (uint *)(param_1 + 0x3c);
  do {
    uVar1 = *(uint *)((ulong)(uVar27 >> 0x18) * 4 + 0xa3e0f0) ^ puVar24[-4] ^
            *(uint *)((ulong)(uVar28 >> 0x10 & 0xff | 0x100) * 4 + 0xa3e0f0) ^
            *(uint *)((ulong)(uVar26 >> 8 & 0xff | 0x200) * 4 + 0xa3e0f0) ^
            *(uint *)((ulong)(uVar25 & 0xff | 0x300) * 4 + 0xa3e0f0);
    uVar2 = *(uint *)((ulong)(uVar27 & 0xff | 0x300) * 4 + 0xa3e0f0) ^
            puVar24[-5] ^ *(uint *)((ulong)(uVar28 >> 0x18) * 4 + 0xa3e0f0) ^
            *(uint *)((ulong)(uVar26 >> 0x10 & 0xff | 0x100) * 4 + 0xa3e0f0) ^
            *(uint *)((ulong)(uVar25 >> 8 & 0xff | 0x200) * 4 + 0xa3e0f0);
    uVar3 = *(uint *)((ulong)(uVar27 >> 8 & 0xff | 0x200) * 4 + 0xa3e0f0) ^ puVar24[-6] ^
            *(uint *)((ulong)(uVar28 & 0xff | 0x300) * 4 + 0xa3e0f0) ^
            *(uint *)((ulong)(uVar26 >> 0x18) * 4 + 0xa3e0f0) ^
            *(uint *)((ulong)(uVar25 >> 0x10 & 0xff | 0x100) * 4 + 0xa3e0f0);
    uVar25 = *(uint *)((ulong)(uVar27 >> 0x10 & 0xff | 0x100) * 4 + 0xa3e0f0) ^ puVar24[-7] ^
             *(uint *)((ulong)(uVar28 >> 8 & 0xff | 0x200) * 4 + 0xa3e0f0) ^
             *(uint *)((ulong)(uVar26 & 0xff | 0x300) * 4 + 0xa3e0f0) ^
             *(uint *)((ulong)(uVar25 >> 0x18) * 4 + 0xa3e0f0);
    uVar27 = *(uint *)((ulong)(uVar1 >> 0x18) * 4 + 0xa3e0f0) ^ *puVar24 ^
             *(uint *)((ulong)(uVar2 >> 0x10 & 0xff | 0x100) * 4 + 0xa3e0f0) ^
             *(uint *)((ulong)(uVar3 >> 8 & 0xff | 0x200) * 4 + 0xa3e0f0) ^
             *(uint *)((ulong)(uVar25 & 0xff | 0x300) * 4 + 0xa3e0f0);
    uVar28 = *(uint *)((ulong)(uVar1 & 0xff | 0x300) * 4 + 0xa3e0f0) ^ puVar24[-1] ^
             *(uint *)((ulong)(uVar2 >> 0x18) * 4 + 0xa3e0f0) ^
             *(uint *)((ulong)(uVar3 >> 0x10 & 0xff | 0x100) * 4 + 0xa3e0f0) ^
             *(uint *)((ulong)(uVar25 >> 8 & 0xff | 0x200) * 4 + 0xa3e0f0);
    uVar26 = *(uint *)((ulong)(uVar1 >> 8 & 0xff | 0x200) * 4 + 0xa3e0f0) ^ puVar24[-2] ^
             *(uint *)((ulong)(uVar2 & 0xff | 0x300) * 4 + 0xa3e0f0) ^
             *(uint *)((ulong)(uVar3 >> 0x18) * 4 + 0xa3e0f0) ^
             *(uint *)((ulong)(uVar25 >> 0x10 & 0xff | 0x100) * 4 + 0xa3e0f0);
    uVar25 = *(uint *)((ulong)(uVar1 >> 0x10 & 0xff | 0x100) * 4 + 0xa3e0f0) ^ puVar24[-3] ^
             *(uint *)((ulong)(uVar2 >> 8 & 0xff | 0x200) * 4 + 0xa3e0f0) ^
             *(uint *)((ulong)(uVar3 & 0xff | 0x300) * 4 + 0xa3e0f0) ^
             *(uint *)((ulong)(uVar25 >> 0x18) * 4 + 0xa3e0f0);
    puVar24 = puVar24 + 8;
    iVar23 = iVar23 + -1;
  } while (iVar23 != 0);
  bVar10 = (&UNK_008c51c0)[(ulong)uVar28 & 0xff];
  bVar11 = (&UNK_008c51c0)[(ulong)(uVar28 >> 0x10) & 0xff];
  uVar12 = (&UNK_008c51c0)[uVar28 >> 0x18];
  bVar13 = (&UNK_008c51c0)[(ulong)(uVar26 >> 8) & 0xff];
  uVar14 = (&UNK_008c51c0)[(ulong)(uVar26 >> 0x10) & 0xff];
  bVar15 = (&UNK_008c51c0)[uVar26 >> 0x18];
  bVar16 = (&UNK_008c51c0)[(ulong)uVar25 & 0xff];
  uVar17 = (&UNK_008c51c0)[(ulong)(uVar25 >> 8) & 0xff];
  bVar18 = (&UNK_008c51c0)[(ulong)(uVar25 >> 0x10) & 0xff];
  uVar28 = ((uint)(byte)(&UNK_008c51c0)[(ulong)(uVar28 >> 8) & 0xff] << 0x10 |
            (uint)(byte)(&UNK_008c51c0)[(ulong)uVar26 & 0xff] << 0x18 |
            (uint)(byte)(&UNK_008c51c0)[uVar25 >> 0x18] |
           (uint)(byte)(&UNK_008c51c0)[(ulong)(uVar27 >> 0x10) & 0xff] << 8) ^
           *(uint *)(param_1 + lVar22 + 0x40);
  if (unaff_x20 != (uint *)0x0) {
    uVar28 = *unaff_x20 ^ uVar28;
  }
  param_1 = param_1 + lVar22 + 0x20;
  uVar19 = (&UNK_008c51c0)[(ulong)uVar27 & 0xff];
  bVar20 = (&UNK_008c51c0)[(ulong)(uVar27 >> 8) & 0xff];
  bVar21 = (&UNK_008c51c0)[uVar27 >> 0x18];
  if (unaff_x19 != (uint *)0x0) {
    *unaff_x19 = uVar28;
  }
  uVar28 = CONCAT13(uVar19,CONCAT12(uVar17,CONCAT11(uVar14,uVar12)));
  uVar26 = (uint)bVar15 | (uint)bVar10 << 0x18 | (uint)bVar18 << 8 | (uint)bVar20 << 0x10;
  if (unaff_x20 == (uint *)0x0) {
    unaff_x19[1] = *(uint *)(param_1 + 0x24) ^ uVar26;
    unaff_x19[2] = *(uint *)(param_1 + 0x28) ^ uVar28;
    uVar28 = *(uint *)(param_1 + 0x2c);
  }
  else {
    unaff_x19[1] = *(uint *)(param_1 + 0x24) ^ unaff_x20[1] ^ uVar26;
    unaff_x19[2] = *(uint *)(param_1 + 0x28) ^ unaff_x20[2] ^ uVar28;
    uVar28 = *(uint *)(param_1 + 0x2c) ^ unaff_x20[3];
  }
  unaff_x19[3] = uVar28 ^ ((uint)bVar11 << 8 | (uint)bVar13 << 0x10 | (uint)bVar16 << 0x18 |
                          (uint)bVar21);
  return;
}

