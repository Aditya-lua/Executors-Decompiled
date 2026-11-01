
void FUN_007106b0(long *param_1)

{
  long lVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  long unaff_x19;
  long unaff_x20;
  long unaff_x22;
  long lVar5;
  long *unaff_x27;
  long unaff_x28;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  long *in_stack_00000018;
  
  if (param_1 != unaff_x27) {
    uVar8 = *(undefined8 *)(unaff_x22 + 0x20);
    uVar6 = *(undefined8 *)(unaff_x22 + 0x18);
    if (*(long *)(unaff_x22 + 0x10) == 0) {
      lVar5 = 0;
      lVar1 = 0;
      lVar2 = *in_stack_00000018;
    }
    else {
      lVar1 = __Znwm(*(long *)(unaff_x22 + 0x10) << 4);
      lVar5 = *(long *)(unaff_x22 + 0x10);
      if (lVar5 != 0) {
        lVar2 = 0;
        lVar3 = *unaff_x27;
        lVar4 = lVar5;
        do {
          uVar7 = *(undefined8 *)(lVar3 + lVar2);
          ((undefined8 *)(lVar1 + lVar2))[1] = ((undefined8 *)(lVar3 + lVar2))[1];
          *(undefined8 *)(lVar1 + lVar2) = uVar7;
          lVar2 = lVar2 + 0x10;
          lVar4 = lVar4 + -1;
        } while (lVar4 != 0);
      }
      lVar2 = *in_stack_00000018;
    }
    if (lVar2 != 0) {
      __ZdlPv();
    }
    *(long *)(unaff_x19 + 0x168) = lVar1;
    *(long *)(unaff_x19 + 0x170) = lVar5;
    *(undefined8 *)(unaff_x28 + 0x44) = uVar8;
    *(undefined8 *)(unaff_x28 + 0x3c) = uVar6;
  }
  if (unaff_x20 != unaff_x22 + 0x30) {
    func_0x006d0234();
  }
  return;
}

