
void FUN_0065454c(long param_1)

{
  undefined4 uVar1;
  code *pcVar2;
  long lVar3;
  undefined8 uVar4;
  long unaff_x19;
  undefined4 unaff_w20;
  undefined4 unaff_w21;
  undefined4 unaff_w22;
  undefined8 unaff_x23;
  undefined8 unaff_x24;
  undefined8 unaff_x25;
  long unaff_x27;
  long unaff_x29;
  
  param_1 = param_1 - unaff_x27;
  if (param_1 != 0) {
    if (param_1 < 0) {
      func_0x00017f90();
                    /* WARNING: Does not return */
      pcVar2 = (code *)SoftwareBreakpoint(1,0x6545c8);
      (*pcVar2)();
    }
    lVar3 = __Znwm(param_1);
    *(long *)(unaff_x19 + 8) = lVar3;
    *(long *)(unaff_x19 + 0x10) = lVar3;
    lVar3 = lVar3 + (param_1 >> 2) * 4;
    *(long *)(unaff_x19 + 0x18) = lVar3;
    _memcpy();
    *(long *)(unaff_x19 + 0x10) = lVar3;
  }
  uVar1 = *(undefined4 *)(unaff_x29 + 0x18);
  uVar4 = *(undefined8 *)(unaff_x29 + 0x10);
  *(undefined8 *)(unaff_x19 + 0x20) = unaff_x25;
  *(undefined8 *)(unaff_x19 + 0x28) = unaff_x24;
  *(undefined8 *)(unaff_x19 + 0x30) = unaff_x23;
  *(undefined8 *)(unaff_x19 + 0x38) = uVar4;
  *(undefined4 *)(unaff_x19 + 0x40) = uVar1;
  *(undefined4 *)(unaff_x19 + 0x44) = 0;
  *(undefined4 *)(unaff_x19 + 0x48) = 0;
  *(undefined4 *)(unaff_x19 + 0x4c) = unaff_w22;
  *(undefined4 *)(unaff_x19 + 0x50) = unaff_w21;
  *(undefined4 *)(unaff_x19 + 0x54) = unaff_w20;
  return;
}

