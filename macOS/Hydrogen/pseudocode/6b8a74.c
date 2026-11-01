
void FUN_006b8a74(void)

{
  undefined4 uVar1;
  ulong uVar2;
  ulong uVar3;
  undefined8 *puVar4;
  ulong uVar5;
  long unaff_x19;
  undefined4 *unaff_x21;
  long unaff_x22;
  undefined4 *unaff_x23;
  undefined4 *puVar6;
  undefined4 *puVar7;
  undefined4 *unaff_x24;
  
  puVar7 = unaff_x23;
  if (unaff_x22 != 0) {
    puVar7 = unaff_x24 + unaff_x22;
    uVar2 = unaff_x22 - 1U & 0x3fffffffffffffff;
    if ((0xe < uVar2) && ((unaff_x21 + 1 <= unaff_x24 || (unaff_x24 + unaff_x22 <= unaff_x21)))) {
      uVar2 = uVar2 + 1;
      uVar3 = uVar2 & 0x7ffffffffffffff0;
      uVar1 = *unaff_x21;
      puVar4 = (undefined8 *)(unaff_x24 + 8);
      uVar5 = uVar3;
      do {
        puVar4[-3] = CONCAT44(uVar1,uVar1);
        puVar4[-4] = CONCAT44(uVar1,uVar1);
        puVar4[-1] = CONCAT44(uVar1,uVar1);
        puVar4[-2] = CONCAT44(uVar1,uVar1);
        puVar4[1] = CONCAT44(uVar1,uVar1);
        *puVar4 = CONCAT44(uVar1,uVar1);
        puVar4[3] = CONCAT44(uVar1,uVar1);
        puVar4[2] = CONCAT44(uVar1,uVar1);
        uVar5 = uVar5 - 0x10;
        puVar4 = puVar4 + 8;
      } while (uVar5 != 0);
      unaff_x23 = unaff_x24 + uVar3;
      if (uVar2 == uVar3) goto LAB_006b8ae8;
    }
    do {
      puVar6 = unaff_x23 + 1;
      *unaff_x23 = *unaff_x21;
      unaff_x23 = puVar6;
    } while (puVar6 != puVar7);
  }
LAB_006b8ae8:
  *(undefined4 **)(unaff_x19 + 8) = puVar7;
  return;
}

