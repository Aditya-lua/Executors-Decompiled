
void FUN_006c2950(void)

{
  uint uVar1;
  code *pcVar2;
  uint in_w8;
  long unaff_x19;
  long unaff_x20;
  undefined4 unaff_w21;
  
  if (0xff < in_w8) {
    func_0x006bc388(unaff_x20 + 0xc,
                    "Out of registers when trying to allocate %d registers: exceeded limit %d");
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x6c29dc);
    (*pcVar2)();
  }
  *(uint *)(unaff_x19 + 0x484) = in_w8;
  uVar1 = *(uint *)(unaff_x19 + 0x488);
  if (*(uint *)(unaff_x19 + 0x488) <= in_w8) {
    uVar1 = in_w8;
  }
  *(uint *)(unaff_x19 + 0x488) = uVar1;
  func_0x006c6028();
  *(undefined4 *)(unaff_x19 + 0x484) = unaff_w21;
  return;
}

