
void FUN_0071067c(undefined8 param_1)

{
  undefined8 *puVar1;
  long lVar2;
  long lVar3;
  undefined8 in_x9;
  long lVar4;
  long lVar5;
  long in_x11;
  long in_x13;
  long unaff_x19;
  long unaff_x20;
  long unaff_x22;
  long unaff_x23;
  long unaff_x24;
  long lVar6;
  long unaff_x28;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  long *in_stack_00000018;
  
  while (in_x13 != unaff_x23) {
    uVar9 = *(undefined8 *)(unaff_x24 + -0x20);
    uVar7 = *(undefined8 *)(unaff_x24 + -0x28);
    uVar10 = *(undefined8 *)(unaff_x24 + -0x10);
    uVar8 = *(undefined8 *)(unaff_x24 + -0x18);
    *(undefined8 *)(in_x11 + -8) = *(undefined8 *)(unaff_x24 + -8);
    *(undefined8 *)(in_x11 + -0x10) = uVar10;
    *(undefined8 *)(in_x11 + -0x18) = uVar8;
    *(undefined8 *)(in_x11 + -0x20) = uVar9;
    *(undefined8 *)(in_x11 + -0x28) = uVar7;
    in_x13 = unaff_x24 + -0x28;
    in_x11 = in_x11 + -0x28;
    unaff_x24 = in_x13;
  }
  *(long *)(unaff_x19 + 0x298) = in_x11;
  *(undefined8 *)(unaff_x19 + 0x2a0) = in_x9;
  *(undefined8 *)(unaff_x19 + 0x2a8) = param_1;
  if (unaff_x23 != 0) {
    __ZdlPv();
  }
  if (*(char *)(unaff_x22 + 0x50) != '\0') {
    if (in_stack_00000018 != (long *)(unaff_x22 + 8)) {
      uVar9 = *(undefined8 *)(unaff_x22 + 0x20);
      uVar7 = *(undefined8 *)(unaff_x22 + 0x18);
      if (*(long *)(unaff_x22 + 0x10) == 0) {
        lVar6 = 0;
        lVar2 = 0;
        lVar3 = *in_stack_00000018;
      }
      else {
        lVar2 = __Znwm(*(long *)(unaff_x22 + 0x10) << 4);
        lVar6 = *(long *)(unaff_x22 + 0x10);
        if (lVar6 != 0) {
          lVar3 = 0;
          lVar4 = *(long *)(unaff_x22 + 8);
          lVar5 = lVar6;
          do {
            puVar1 = (undefined8 *)(lVar4 + lVar3);
            uVar8 = *puVar1;
            ((undefined8 *)(lVar2 + lVar3))[1] = puVar1[1];
            *(undefined8 *)(lVar2 + lVar3) = uVar8;
            lVar3 = lVar3 + 0x10;
            lVar5 = lVar5 + -1;
          } while (lVar5 != 0);
        }
        lVar3 = *in_stack_00000018;
      }
      if (lVar3 != 0) {
        __ZdlPv();
      }
      *(long *)(unaff_x19 + 0x168) = lVar2;
      *(long *)(unaff_x19 + 0x170) = lVar6;
      *(undefined8 *)(unaff_x28 + 0x44) = uVar9;
      *(undefined8 *)(unaff_x28 + 0x3c) = uVar7;
    }
    if (unaff_x20 != unaff_x22 + 0x30) {
      func_0x006d0234();
    }
  }
  return;
}

