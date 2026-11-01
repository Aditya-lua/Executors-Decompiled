
void FUN_006a419c(void)

{
  int iVar1;
  code *pcVar2;
  undefined8 uVar3;
  long unaff_x20;
  undefined1 uStack0000000000000008;
  undefined1 uStack0000000000000020;
  undefined1 uStack0000000000000038;
  
  uVar3 = ___cxa_allocate_exception();
  iVar1 = 0;
  if (*(uint *)(unaff_x20 + 0x20) < 4000) {
    iVar1 = 4000 - *(uint *)(unaff_x20 + 0x20);
  }
  func_0x005eec2c(&uStack0000000000000008,iVar1,10);
  func_0x00049ad4(&uStack0000000000000020,"MaurerRandomnessTest: ",&uStack0000000000000008);
  func_0x0003a638(&uStack0000000000000038,&uStack0000000000000020," more bytes of input needed");
  func_0x006a42b4(uVar3,6,&uStack0000000000000038);
  ___cxa_throw(uVar3,&DAT_009b2e60,&DAT_00026e38);
                    /* WARNING: Does not return */
  pcVar2 = (code *)SoftwareBreakpoint(1,0x6a4220);
  (*pcVar2)();
}

