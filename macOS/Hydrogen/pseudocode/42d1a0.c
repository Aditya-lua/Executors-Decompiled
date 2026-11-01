
void FUN_0042d1a0(void)

{
  code *pcVar1;
  undefined8 *puVar2;
  undefined8 unaff_x19;
  undefined8 unaff_x21;
  undefined8 unaff_x22;
  
  puVar2 = (undefined8 *)func_0x00187bd0(0x18,8);
  if (puVar2 == (undefined8 *)0x0) {
    func_0x007a1f18(8,0x18);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x42d1e4);
    (*pcVar1)();
  }
  *puVar2 = unaff_x19;
  puVar2[1] = unaff_x21;
  puVar2[2] = unaff_x22;
  return;
}

