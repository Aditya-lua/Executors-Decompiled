/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c2b9bc
 */

void FUN_00c2b9bc(ulong param_1,long param_2)

{
  ulong uVar1;
  ulong uVar2;
  undefined1 auVar3 [16];
  undefined1 auVar4 [16];
  undefined1 auVar5 [16];
  undefined1 auVar6 [16];
  undefined1 auVar7 [16];
  undefined1 auVar8 [16];
  byte bVar10;
  undefined1 auVar9 [16];
  
  if ((param_1 >> 0x3e & 1) == 0) {
    uVar1 = 0;
  }
  else {
    uVar1 = *(ulong *)(param_2 + 0x10);
  }
  auVar8._8_8_ = uVar1;
  auVar8._0_8_ = uVar1;
  auVar3._8_8_ = 0x17;
  auVar3._0_8_ = 0x21;
  auVar5._8_8_ = 0x1e;
  auVar5._0_8_ = 0x20;
  auVar7._8_8_ = 0x18;
  auVar7._0_8_ = 0x10;
  auVar9 = NEON_ushl(auVar8,auVar3,8);
  auVar5 = NEON_ushl(auVar8,auVar5,8);
  auVar3 = NEON_ushl(auVar8,auVar7,8);
  auVar4[8] = 0x14;
  auVar4._0_8_ = 0x13;
  auVar4._9_7_ = 0;
  auVar4 = NEON_ushl(auVar8,auVar4,8);
  bVar10 = auVar3[3] & 1;
  auVar6[0xe] = auVar9[0xe] & 0x40 | auVar5[0xe] & 0x80;
  auVar6._0_8_ = CONCAT17(auVar5[7],CONCAT16(auVar9[6],CONCAT15(auVar4[5],(uint5)bVar10 << 0x18))) &
                 0x10404ffffffffff;
  auVar6._8_4_ = 0;
  auVar6[0xc] = auVar3[0xc] & 0xc;
  auVar6[0xd] = 0;
  auVar6[0xf] = auVar4[0xf] & 2;
  auVar8 = NEON_ext(auVar6,auVar6,8,1);
  uVar2 = CONCAT17(auVar5[7] & 1 | auVar8[7],
                   CONCAT16(auVar9[6] & 4 | auVar8[6],
                            CONCAT15(auVar4[5] & 4 | auVar8[5],
                                     CONCAT14(auVar8[4],CONCAT13(bVar10 | auVar8[3],auVar8._0_3_))))
                  ) | (param_1 & 0x80) << 3 |
          param_1 >> 0x1a & 2 | (param_1 >> 4 & 1) << 0xf |
          param_1 >> 0xe & 0x20 | param_1 >> 0x10 & 0x10 |
          param_1 >> 0x14 & 8 | (param_1 >> 9 & 1) << 0x10 |
          param_1 >> 7 & 0x20000 | param_1 >> 6 & 0x40 |
          param_1 << 7 & 0x300000 | (param_1 >> 6 & 1) << 0xc |
          (param_1 & 0x10000000) << 0x15 | (param_1 >> 0x1d & 1) << 0x2e |
          param_1 >> 1 & 0x80 | uVar1 >> 5 & 4 |
          uVar1 << 0x23 & 0x3c000000000 | (uVar1 >> 0x12 & 1) << 0x2c |
          auVar4._0_8_ & 0x80000 | uVar1 >> 0x10 & 1 |
          auVar3._0_8_ & 0x800000000000000 | (uVar1 >> 0xd & 1) << 0x1a;
  if ((param_1 & 1) != 0) {
    uVar2 = uVar2 | 0x300;
  }
  DAT_00d280e8 = (param_1 >> 0x16 & 1) << 0x1e | (uVar1 >> 0x2e & 1) << 0x3a |
                 param_1 << 7 & 0x400000 | (param_1 >> 0x10 & 1) << 0x12 | param_1 >> 3 & 0x800000 |
                 param_1 >> 4 & 0x2000 | (uVar1 >> 0xe & 1) << 0x1b | uVar1 << 0x23 & 0x1000000000 |
                 uVar2 | 0x8000000000000000;
  return;
}

