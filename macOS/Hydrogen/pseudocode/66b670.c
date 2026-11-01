
void FUN_0066b670(void)

{
  code *pcVar1;
  undefined8 uVar2;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long unaff_x22;
  undefined1 uStack0000000000000008;
  
  if ((unaff_x22 == 0) || (unaff_x21 == -1)) {
    uVar2 = ___cxa_allocate_exception(0x28);
    func_0x0000a968(&uStack0000000000000008,"FilterWithBufferedInput: invalid buffer size");
    func_0x0002703c(uVar2,&uStack0000000000000008);
    ___cxa_throw(uVar2,&DAT_009b2ee0,&DAT_000270bc);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x66b710);
    (*pcVar1)();
  }
  if (unaff_x20 == 0) {
    uVar2 = 0;
  }
  else {
    uVar2 = func_0x006115d0();
  }
  *(undefined8 *)(unaff_x19 + 0x58) = 0xffffffffffffffff;
  *(long *)(unaff_x19 + 0x60) = unaff_x20;
  *(undefined8 *)(unaff_x19 + 0x68) = uVar2;
  *(undefined8 *)(unaff_x19 + 0x70) = 1;
  *(long *)(unaff_x19 + 0x78) = unaff_x20;
  *(undefined8 *)(unaff_x19 + 0x80) = 0;
  *(undefined8 *)(unaff_x19 + 0x88) = uVar2;
  return;
}

