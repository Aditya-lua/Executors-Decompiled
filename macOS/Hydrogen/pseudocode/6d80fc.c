
void FUN_006d80fc(long param_1)

{
  undefined8 *puVar1;
  long lVar2;
  undefined1 auVar3 [16];
  undefined1 auVar4 [16];
  ulong in_x9;
  long *unaff_x19;
  long unaff_x20;
  long unaff_x22;
  long unaff_x23;
  long unaff_x24;
  ulong unaff_x25;
  undefined8 uVar5;
  undefined8 uVar6;
  
  auVar3._8_8_ = 0;
  auVar3._0_8_ = in_x9;
  auVar4._8_8_ = 0;
  auVar4._0_8_ = unaff_x25;
  _bzero();
  lVar2 = unaff_x22 + (SUB168(auVar3 * auVar4,8) >> 4) * param_1 + 0x18;
  if (unaff_x20 != unaff_x23) {
    do {
      uVar6 = *(undefined8 *)(unaff_x20 + -0x10);
      uVar5 = *(undefined8 *)(unaff_x20 + -0x18);
      puVar1 = (undefined8 *)(unaff_x20 + -8);
      unaff_x20 = unaff_x20 + -0x18;
      *(undefined8 *)(unaff_x22 + -8) = *puVar1;
      *(undefined8 *)(unaff_x22 + -0x10) = uVar6;
      *(undefined8 *)(unaff_x22 + -0x18) = uVar5;
      unaff_x22 = unaff_x22 + -0x18;
    } while (unaff_x20 != unaff_x23);
    unaff_x20 = *unaff_x19;
  }
  *unaff_x19 = unaff_x22;
  unaff_x19[1] = lVar2;
  unaff_x19[2] = unaff_x24;
  if (unaff_x20 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR___ZdlPv_009b01b8)(unaff_x20);
  return;
}

