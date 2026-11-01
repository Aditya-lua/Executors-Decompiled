
void FUN_0053c670(long param_1)

{
  ulong uVar1;
  ulong uVar2;
  long lVar3;
  bool in_ZR;
  long *unaff_x19;
  ulong unaff_x21;
  ulong uVar4;
  long lVar5;
  undefined1 auVar6 [16];
  
  if (in_ZR) {
    uVar4 = unaff_x21 * param_1;
    uVar1 = unaff_x21 + 8;
    if (CARRY8(uVar4,uVar1)) goto LAB_0053c694;
    uVar2 = uVar4 + uVar1;
    if (0x7ffffffffffffff8 < uVar2) goto LAB_0053c694;
    lVar5 = func_0x00187bd0(uVar2,8);
    if (lVar5 != 0) {
      lVar3 = unaff_x21 - 1;
      if (8 < unaff_x21) {
        lVar3 = (unaff_x21 >> 3) * 7;
      }
      auVar6._8_8_ = lVar3;
      auVar6._0_8_ = unaff_x21 - 1;
      lVar5 = lVar5 + uVar4;
      _memset(lVar5,0xff,uVar1);
      goto LAB_0053c708;
    }
    auVar6 = func_0x004584ec(1,8,uVar2);
  }
  else {
LAB_0053c694:
    auVar6 = func_0x004584a8(1);
  }
  lVar5 = 0;
LAB_0053c708:
  *unaff_x19 = lVar5;
  *(undefined1 (*) [16])(unaff_x19 + 1) = auVar6;
  unaff_x19[3] = 0;
  return;
}

