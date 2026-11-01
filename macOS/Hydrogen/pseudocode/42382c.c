
void FUN_0042382c(void)

{
  int iVar1;
  undefined8 uVar2;
  int unaff_w21;
  long unaff_x22;
  undefined1 uStack0000000000000008;
  undefined1 uStack0000000000000038;
  undefined1 uStack_11;
  
  uVar2 = func_0x007a2668();
  func_0x003f6fd8(unaff_x22 + 0x10);
  if (unaff_w21 == 0) {
    func_0x003f7050((ulong)&uStack0000000000000038 | 4);
    func_0x003f7b94(&uStack0000000000000008);
    uVar2 = __Unwind_Resume(uVar2);
  }
  func_0x003f7b94(&uStack0000000000000008);
  iVar1 = __Unwind_Resume(uVar2);
  if (iVar1 == 0) {
    func_0x007a2810(&UNK_008865a1,0x48,&uStack_11,&UNK_009d9358,&UNK_009da890);
                    /* WARNING: Could not recover jumptable at 0x007b35b0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR__getppid_00a24f10)();
    return;
  }
  return;
}

