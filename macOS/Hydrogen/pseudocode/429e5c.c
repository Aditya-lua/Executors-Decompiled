
void FUN_00429e5c(void)

{
  code *pcVar1;
  undefined8 *puVar2;
  undefined8 *unaff_x19;
  undefined8 unaff_x20;
  undefined8 unaff_x21;
  undefined8 unaff_x23;
  
  _memcpy();
  puVar2 = (undefined8 *)func_0x00187bd0(0x30,8);
  if (puVar2 == (undefined8 *)0x0) {
    func_0x007a1f18(8,0x30);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x429ed4);
    (*pcVar1)();
  }
  puVar2[1] = 1;
  *puVar2 = 1;
  puVar2[3] = unaff_x23;
  puVar2[2] = unaff_x20;
  puVar2[5] = unaff_x21;
  puVar2[4] = unaff_x20;
  *unaff_x19 = puVar2;
  *(undefined1 *)(unaff_x19 + 1) = 0;
  return;
}

