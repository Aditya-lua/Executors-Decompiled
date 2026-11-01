
void FUN_0057f000(void)

{
  undefined1 auVar1 [16];
  code *pcVar2;
  long lVar3;
  undefined8 *unaff_x19;
  ulong unaff_x20;
  ulong uVar4;
  undefined8 uVar5;
  
  func_0x007a1f00();
  uVar5 = 0;
  auVar1._8_8_ = 0;
  auVar1._0_8_ = unaff_x20;
  uVar4 = unaff_x20 * 0x30;
  if ((SUB168(auVar1 * ZEXT816(0x30),8) != 0) || (0x7ffffffffffffff8 < uVar4)) {
LAB_0057f060:
    func_0x007a1f00(uVar5,uVar4,&UNK_009f0558);
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x57f078);
    (*pcVar2)();
  }
  if (uVar4 == 0) {
    unaff_x20 = 0;
    lVar3 = 8;
  }
  else {
    uVar5 = 8;
    lVar3 = func_0x00187bd0(uVar4,8);
    if (lVar3 == 0) goto LAB_0057f060;
  }
  unaff_x19[1] = 8;
  *unaff_x19 = 0;
  unaff_x19[2] = 0;
  unaff_x19[3] = unaff_x20;
  unaff_x19[4] = lVar3;
  unaff_x19[5] = 0;
  return;
}

