
void FUN_00783dac(long param_1)

{
  int iVar1;
  undefined4 uVar2;
  uint uVar3;
  uint uVar4;
  uint uVar5;
  uint uVar6;
  uint uVar7;
  long unaff_x19;
  int unaff_w20;
  int unaff_w21;
  long unaff_x22;
  uint unaff_w23;
  int unaff_w24;
  int unaff_w25;
  long unaff_x26;
  uint *puVar8;
  int unaff_w27;
  
  uVar2 = *(undefined4 *)(param_1 + 0x238);
  *(undefined4 *)(unaff_x26 + 0x3c0) = uVar2;
  *(undefined4 *)(unaff_x26 + 0x3c4) = uVar2;
  iVar1 = 0;
  if (unaff_w27 == 0) {
    iVar1 = unaff_w20;
  }
  *(long *)(unaff_x19 + 0xe8) = unaff_x22;
  puVar8 = (uint *)(unaff_x19 + 0x1c1);
  uVar3 = *puVar8;
  uVar5 = 0x10000;
  if (unaff_w23 == 0) {
    uVar5 = 0;
  }
  uVar6 = 0x100000;
  if (unaff_w25 == 0) {
    uVar6 = 0;
  }
  uVar7 = 0x200000;
  if (unaff_w24 == 0) {
    uVar7 = 0;
  }
  uVar4 = uVar7 | uVar6 | uVar3 & 0xffceffff | uVar5;
  *puVar8 = uVar4;
  if ((unaff_w23 & 1) == 0) {
    uVar4 = uVar7 | uVar6 | uVar3 & 0xffcefffe | uVar5;
    *puVar8 = uVar4;
    if (0 < unaff_x22) {
      func_0x00770554();
      uVar4 = *puVar8;
    }
  }
  if ((uVar4 & 0x30000) != 0x20000) {
    if (unaff_w21 != -1) {
      *(uint *)(unaff_x19 + 0x134) = *(uint *)(unaff_x19 + 0x134) | 1;
    }
    if (iVar1 != -1) {
      *(uint *)(unaff_x19 + 0x134) = *(uint *)(unaff_x19 + 0x134) | 2;
    }
  }
  return;
}

