
void FUN_00072af8(undefined1 param_1 [16])

{
  ulong uVar1;
  undefined8 *puVar2;
  code *pcVar3;
  long lVar4;
  long unaff_x19;
  undefined8 *unaff_x20;
  
  *(long *)(unaff_x19 + 0x34) = param_1._8_8_;
  *(long *)(unaff_x19 + 0x2c) = param_1._0_8_;
  *(undefined4 *)(unaff_x19 + 0x3c) = 0;
  uVar1 = unaff_x20[1];
  puVar2 = (undefined8 *)*unaff_x20;
  if (-1 < (char)*(byte *)((long)unaff_x20 + 0x17)) {
    uVar1 = (ulong)*(byte *)((long)unaff_x20 + 0x17);
    puVar2 = unaff_x20;
  }
  lVar4 = func_0x00072b7c();
  if ((long)puVar2 + uVar1 != lVar4) {
    func_0x0002b104();
                    /* WARNING: Does not return */
    pcVar3 = (code *)SoftwareBreakpoint(1,0x72b4c);
    (*pcVar3)();
  }
  return;
}

