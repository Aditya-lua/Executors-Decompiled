
void FUN_005d6074(void)

{
  code *pcVar1;
  undefined1 *puVar2;
  long lVar3;
  char *unaff_x19;
  long unaff_x24;
  char in_wzr;
  
  puVar2 = (undefined1 *)func_0x00187bd0();
  if (puVar2 == (undefined1 *)0x0) {
    func_0x007a1f00();
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x5d6334);
    (*pcVar1)();
  }
  *puVar2 = 0x5f;
  lVar3 = *(long *)(unaff_x24 + 0x10);
  if (lVar3 != -0x8000000000000000 && lVar3 != 0) {
    func_0x00187bd4(*(undefined8 *)(unaff_x24 + 0x18),lVar3,1);
  }
  *(undefined8 *)(unaff_x24 + 0x10) = 1;
  *(undefined1 **)(unaff_x24 + 0x18) = puVar2;
  *(undefined8 *)(unaff_x24 + 0x20) = 1;
  if (*unaff_x19 == '\x01') {
    *unaff_x19 = in_wzr;
  }
  else {
    func_0x007b05dc();
  }
  return;
}

