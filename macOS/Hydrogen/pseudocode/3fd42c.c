
void FUN_003fd42c(long param_1)

{
  code *pcVar1;
  bool in_CY;
  long in_x9;
  long in_x10;
  undefined8 *in_x11;
  long in_x12;
  undefined8 *in_x13;
  long in_x14;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  
  uVar2 = *in_x13;
  uVar4 = in_x13[3];
  uVar3 = in_x13[2];
  in_x11[1] = in_x13[1];
  *in_x11 = uVar2;
  in_x11[3] = uVar4;
  in_x11[2] = uVar3;
  if (in_x9 + (ulong)!in_CY * 0x20 != param_1 || in_x10 + in_x14 * 0x20 != in_x12) {
    func_0x007a286c();
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x3fd4a0);
    (*pcVar1)();
  }
  return;
}

