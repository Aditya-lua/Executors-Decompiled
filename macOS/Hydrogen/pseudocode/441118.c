
void FUN_00441118(long param_1)

{
  uint uVar1;
  undefined *puVar2;
  long in_x9;
  undefined8 uVar3;
  long in_x10;
  long lVar4;
  uint in_w11;
  byte *pbVar5;
  byte *pbVar6;
  undefined4 uVar7;
  uint uVar8;
  undefined4 *unaff_x19;
  uint unaff_w20;
  ulong uVar9;
  
  while (in_w11 != 0x2e) {
    in_x9 = in_x9 + 1;
    if (in_x10 == in_x9) {
      puVar2 = &UNK_008888c4;
      uVar3 = 0x25;
      goto code_r0x00441138;
    }
    in_w11 = (uint)*(byte *)(param_1 + in_x9);
  }
  if (in_x10 + -1 == in_x9) {
    puVar2 = &UNK_00888917;
    uVar3 = 0x20;
code_r0x00441138:
    *(undefined **)(unaff_x19 + 2) = puVar2;
    *(undefined8 *)(unaff_x19 + 4) = uVar3;
    *unaff_x19 = 3;
  }
  else {
    pbVar5 = (byte *)(param_1 + in_x9 + 1);
    if (*pbVar5 == 0x23) {
      if (in_x10 + -2 == in_x9) {
code_r0x004411a4:
        puVar2 = &UNK_00888937;
        uVar3 = 0x23;
        goto code_r0x00441138;
      }
      uVar9 = 0;
      lVar4 = (in_x10 - in_x9) + -2;
      pbVar6 = (byte *)(param_1 + in_x9 + 2);
      do {
        pbVar5 = pbVar6 + 1;
        uVar1 = *pbVar6 - 0x30;
        if (((9 < uVar1) || ((uVar9 * 10 & 0xffffffff00000000) != 0)) ||
           (uVar8 = (uint)(uVar9 * 10), CARRY4(uVar8,uVar1))) goto code_r0x004411a4;
        unaff_w20 = uVar1 + uVar8;
        uVar9 = (ulong)unaff_w20;
        uVar7 = 1;
        lVar4 = lVar4 + -1;
        pbVar6 = pbVar5;
      } while (lVar4 != 0);
      lVar4 = 0;
    }
    else {
      lVar4 = (in_x10 - in_x9) + -1;
      uVar7 = 2;
    }
    *unaff_x19 = uVar7;
    unaff_x19[1] = unaff_w20;
    *(long *)(unaff_x19 + 2) = param_1;
    *(long *)(unaff_x19 + 4) = in_x9;
    *(byte **)(unaff_x19 + 6) = pbVar5;
    *(long *)(unaff_x19 + 8) = lVar4;
  }
  return;
}

