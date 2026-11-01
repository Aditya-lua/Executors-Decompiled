
void FUN_006188a0(long *param_1,undefined8 param_2,undefined8 param_3)

{
  code *pcVar1;
  ulong uVar2;
  undefined8 uVar3;
  undefined1 uStack0000000000000018;
  undefined1 uStack0000000000000030;
  undefined1 uStack0000000000000048;
  
  uVar2 = (**(code **)(*param_1 + 0x10))(param_1,param_3,&UNK_009f5d40);
  if ((uVar2 & 1) == 0) {
    uVar3 = ___cxa_allocate_exception(0x28);
    func_0x0000a968();
    func_0x0003a638(&uStack0000000000000018);
    func_0x0003a638(&uStack0000000000000030,&uStack0000000000000018,param_3);
    func_0x0003a638(&uStack0000000000000048,&uStack0000000000000030,"\'");
    func_0x0002703c(uVar3,&uStack0000000000000048);
    ___cxa_throw(uVar3,&DAT_009b2ee0,&DAT_000270bc);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x61895c);
    (*pcVar1)();
  }
  return;
}

