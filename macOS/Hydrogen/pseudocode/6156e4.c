
void FUN_006156e4(long *param_1)

{
  code *pcVar1;
  ulong uVar2;
  undefined8 uVar3;
  undefined1 uStack0000000000000008;
  
  uVar2 = (**(code **)(*param_1 + 0x20))();
  if ((uVar2 & 1) == 0) {
    uVar3 = ___cxa_allocate_exception(0x28);
    func_0x0000a968(&uStack0000000000000008,"CryptoMaterial: this object contains invalid values");
    func_0x00616068(uVar3,&uStack0000000000000008);
    ___cxa_throw(uVar3,&UNK_009f7598,&DAT_006160e8);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x615758);
    (*pcVar1)();
  }
  return;
}

