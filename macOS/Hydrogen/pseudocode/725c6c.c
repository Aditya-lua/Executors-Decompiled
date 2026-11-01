
/* WARNING: Removing unreachable block (ram,0x00725d08) */

undefined8 * FUN_00725c6c(long param_1,undefined1 param_2 [16])

{
  undefined8 *puVar1;
  long lVar2;
  undefined8 *in_x9;
  long lVar3;
  long *unaff_x19;
  long unaff_x20;
  long lVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  
  in_x9[1] = param_2._8_8_;
  *in_x9 = param_2._0_8_;
  *(undefined4 *)(in_x9 + 2) = *(undefined4 *)(unaff_x20 + 0x10);
  uVar5 = *(undefined8 *)(unaff_x20 + 0x18);
  in_x9[4] = *(undefined8 *)(unaff_x20 + 0x20);
  in_x9[3] = uVar5;
  in_x9[5] = *(undefined8 *)(unaff_x20 + 0x28);
  *(undefined8 *)(unaff_x20 + 0x20) = 0;
  *(undefined8 *)(unaff_x20 + 0x28) = 0;
  *(undefined8 *)(unaff_x20 + 0x18) = 0;
  puVar1 = in_x9 + 6;
  lVar2 = *unaff_x19;
  lVar3 = unaff_x19[1];
  if (lVar3 == lVar2) {
    *unaff_x19 = (long)in_x9;
    unaff_x19[1] = (long)puVar1;
    unaff_x19[2] = param_1;
  }
  else {
    do {
      uVar6 = *(undefined8 *)(lVar3 + -0x28);
      uVar5 = *(undefined8 *)(lVar3 + -0x30);
      *(undefined4 *)(in_x9 + -4) = *(undefined4 *)(lVar3 + -0x20);
      in_x9[-5] = uVar6;
      in_x9[-6] = uVar5;
      uVar6 = *(undefined8 *)(lVar3 + -0x10);
      uVar5 = *(undefined8 *)(lVar3 + -0x18);
      in_x9[-1] = *(undefined8 *)(lVar3 + -8);
      in_x9[-2] = uVar6;
      in_x9[-3] = uVar5;
      in_x9 = in_x9 + -6;
      *(undefined8 *)(lVar3 + -0x10) = 0;
      *(undefined8 *)(lVar3 + -8) = 0;
      *(undefined8 *)(lVar3 + -0x18) = 0;
      lVar3 = lVar3 + -0x30;
    } while (lVar3 != lVar2);
    lVar2 = *unaff_x19;
    lVar4 = unaff_x19[1];
    *unaff_x19 = (long)in_x9;
    unaff_x19[1] = (long)puVar1;
    unaff_x19[2] = param_1;
    lVar3 = lVar4;
    for (; lVar4 != lVar2; lVar4 = lVar4 + -0x30) {
      lVar3 = lVar2;
    }
  }
  if (lVar3 != 0) {
    __ZdlPv(lVar3);
  }
  return puVar1;
}

