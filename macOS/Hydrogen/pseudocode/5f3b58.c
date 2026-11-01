
void FUN_005f3b58(undefined8 param_1)

{
  code *pcVar1;
  long unaff_x19;
  undefined1 uStack0000000000000018;
  
  (**(code **)(*(long *)(*(long *)(unaff_x19 + 0x38) + 8) + 0x18))();
  func_0x0003a638(&uStack0000000000000018);
  func_0x005f3d74(param_1,&uStack0000000000000018);
  ___cxa_throw(param_1,&DAT_009b6548,&DAT_005f3df4);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x5f3bb4);
  (*pcVar1)();
}

