
undefined8 FUN_001b809c(undefined8 param_1,undefined8 param_2,uint param_3)

{
  long lVar1;
  undefined8 uVar2;
  undefined1 uStack0000000000000008;
  
  func_0x001e189c(&uStack0000000000000008);
  __Unwind_Resume();
  lVar1 = func_0x007a2668();
  if (*(long *)(lVar1 + 0x10) == 0) {
    return 0;
  }
                    /* WARNING: Could not recover jumptable at 0x001b80f8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar2 = (*(code *)(&UNK_001b80fc + (ulong)(byte)(&UNK_0081db3b)[**(byte **)(lVar1 + 8)] * 4))
                    (param_3 & 0xffff,*(byte **)(lVar1 + 8));
  return uVar2;
}

