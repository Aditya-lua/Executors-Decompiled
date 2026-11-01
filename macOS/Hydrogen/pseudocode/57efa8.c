
void FUN_0057efa8(ulong *param_1,ulong param_2,ulong param_3)

{
  undefined1 auVar1 [16];
  code *pcVar2;
  ulong uVar3;
  ulong uVar4;
  ulong unaff_x20;
  ulong uVar5;
  undefined8 uVar6;
  
  uVar6 = 0;
  uVar5 = param_2 * 0x20;
  if ((param_2 >> 0x3b == 0) && (uVar5 < 0x7ffffffffffffff9)) {
    if (uVar5 == 0) goto LAB_0057f00c;
    uVar6 = 8;
    uVar3 = func_0x00187bd0(uVar5,8);
    unaff_x20 = param_3;
    if (uVar3 == 0) goto LAB_0057eff8;
  }
  else {
LAB_0057eff8:
    param_3 = unaff_x20;
    func_0x007a1f00(uVar6,uVar5,&UNK_009f0540);
LAB_0057f00c:
    param_2 = 0;
    uVar3 = 8;
  }
  uVar6 = 0;
  auVar1._8_8_ = 0;
  auVar1._0_8_ = param_3;
  uVar5 = param_3 * 0x30;
  if ((SUB168(auVar1 * ZEXT816(0x30),8) != 0) || (0x7ffffffffffffff8 < uVar5)) {
LAB_0057f060:
    func_0x007a1f00(uVar6,uVar5,&UNK_009f0558);
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x57f078);
    (*pcVar2)();
  }
  if (uVar5 == 0) {
    param_3 = 0;
    uVar4 = 8;
  }
  else {
    uVar6 = 8;
    uVar4 = func_0x00187bd0(uVar5,8);
    if (uVar4 == 0) goto LAB_0057f060;
  }
  param_1[1] = uVar3;
  *param_1 = param_2;
  param_1[2] = 0;
  param_1[3] = param_3;
  param_1[4] = uVar4;
  param_1[5] = 0;
  return;
}

