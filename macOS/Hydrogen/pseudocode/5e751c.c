
void FUN_005e751c(long param_1)

{
  code *pcVar1;
  long lVar2;
  undefined8 uVar3;
  undefined8 unaff_x19;
  undefined8 *unaff_x20;
  long *unaff_x21;
  long unaff_x22;
  
  uVar3 = (**(code **)(unaff_x22 + 0x38))
                    ((long)unaff_x21 + (param_1 - 1U & 0xfffffffffffffff0) + 0x10);
  lVar2 = *unaff_x21;
  *unaff_x21 = lVar2 + 1;
  if (lVar2 < 0) {
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x5e7544);
    (*pcVar1)();
  }
  *unaff_x20 = 1;
  unaff_x20[1] = unaff_x21;
  unaff_x20[2] = unaff_x22;
  unaff_x20[3] = uVar3;
  unaff_x20[4] = unaff_x19;
  return;
}

