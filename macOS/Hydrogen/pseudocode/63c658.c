
void FUN_0063c658(void)

{
  code *pcVar1;
  undefined8 uVar2;
  undefined1 uStack0000000000000008;
  
  uVar2 = ___cxa_allocate_exception(0x28);
  func_0x0000a968(&uStack0000000000000008,
                  "DL_GroupParameters_EC<EC>: curve generation is not implemented yet");
  func_0x005ef2f0(uVar2,&uStack0000000000000008);
  ___cxa_throw(uVar2,&UNK_009b2e78,&DAT_00026d7c);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x63c6a4);
  (*pcVar1)();
}

