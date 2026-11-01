
void FUN_00220d60(undefined8 param_1,long param_2)

{
  code *pcVar1;
  long lVar2;
  undefined8 *unaff_x19;
  long unaff_x20;
  undefined8 uVar3;
  undefined8 uVar4;
  
  if (unaff_x20 < 0) {
    uVar4 = 0;
LAB_0022122c:
    func_0x007a1f00(uVar4);
    func_0x007a1f00(0);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x221278);
    (*pcVar1)();
  }
  uVar3 = *(undefined8 *)(param_2 + 0x10);
  if (unaff_x20 == 0) {
    lVar2 = 1;
  }
  else {
    uVar4 = 1;
    lVar2 = func_0x00187bd0();
    if (lVar2 == 0) goto LAB_0022122c;
  }
  _memcpy(lVar2,uVar3);
  unaff_x19[2] = lVar2;
  unaff_x19[3] = unaff_x20;
  unaff_x19[1] = unaff_x20;
  *unaff_x19 = 0x800000000000000b;
  return;
}

