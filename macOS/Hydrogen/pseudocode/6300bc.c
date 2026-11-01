
long * FUN_006300bc(long param_1)

{
  code *pcVar1;
  undefined1 in_ZR;
  long *plVar2;
  long lVar3;
  ulong uVar4;
  long in_x9;
  long lVar5;
  long unaff_x29;
  undefined1 auVar6 [16];
  
  while (!(bool)in_ZR) {
    *(undefined8 *)(in_x9 + param_1 * 8) = 0;
    param_1 = param_1 + -1;
    in_ZR = param_1 == 0;
  }
  func_0x00611644();
  func_0x00621244(unaff_x29 + -0x88);
  func_0x00630268(unaff_x29 + -0x70);
  auVar6 = __Unwind_Resume();
  uVar4 = auVar6._8_8_;
  plVar2 = auVar6._0_8_;
  *plVar2 = 0;
  plVar2[1] = 0;
  plVar2[2] = 0;
  if (uVar4 != 0) {
    if (0xaaaaaaaaaaaaaaa < uVar4) {
      func_0x00017f90(plVar2);
                    /* WARNING: Does not return */
      pcVar1 = (code *)SoftwareBreakpoint(1,0x630248);
      (*pcVar1)();
    }
    lVar3 = __Znwm(uVar4 * 0x18);
    *plVar2 = lVar3;
    plVar2[2] = lVar3 + uVar4 * 0x18;
    lVar5 = ((uVar4 * 0x18 - 0x18) / 0x18) * 0x18 + 0x18;
    _bzero(lVar3,lVar5);
    plVar2[1] = lVar3 + lVar5;
  }
  return plVar2;
}

