
/* WARNING: Removing unreachable block (ram,0x00143f40) */

void FUN_00143edc(long param_1,long param_2)

{
  long lVar1;
  bool in_ZR;
  long in_x9;
  long in_x10;
  long lVar2;
  long unaff_x19;
  long lVar3;
  long *unaff_x20;
  long unaff_x22;
  undefined8 uVar4;
  undefined8 uVar5;
  
  param_2 = param_2 + in_x9 * in_x10;
  if (in_ZR) {
    *unaff_x20 = param_2;
    unaff_x20[1] = param_2;
    unaff_x20[2] = param_1;
  }
  else {
    lVar2 = param_2;
    do {
      uVar5 = *(undefined8 *)(unaff_x22 + -0x10);
      uVar4 = *(undefined8 *)(unaff_x22 + -0x18);
      *(undefined8 *)(lVar2 + -8) = *(undefined8 *)(unaff_x22 + -8);
      *(undefined8 *)(lVar2 + -0x10) = uVar5;
      *(undefined8 *)(lVar2 + -0x18) = uVar4;
      lVar2 = lVar2 + -0x18;
      *(undefined8 *)(unaff_x22 + -0x10) = 0;
      *(undefined8 *)(unaff_x22 + -8) = 0;
      *(undefined8 *)(unaff_x22 + -0x18) = 0;
      unaff_x22 = unaff_x22 + -0x18;
    } while (unaff_x22 != unaff_x19);
    lVar1 = *unaff_x20;
    lVar3 = unaff_x20[1];
    *unaff_x20 = lVar2;
    unaff_x20[1] = param_2;
    unaff_x20[2] = param_1;
    unaff_x19 = lVar3;
    for (; lVar3 != lVar1; lVar3 = lVar3 + -0x18) {
      unaff_x19 = lVar1;
    }
  }
  if (unaff_x19 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR___ZdlPv_009b01b8)(unaff_x19);
  return;
}

