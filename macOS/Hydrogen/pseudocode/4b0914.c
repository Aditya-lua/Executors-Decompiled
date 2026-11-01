
void FUN_004b0914(undefined8 param_1,undefined8 param_2)

{
  char *pcVar1;
  ulong uVar2;
  long lVar3;
  long unaff_x20;
  ulong unaff_x21;
  char in_wzr;
  long in_stack_00000010;
  long in_stack_00000020;
  
  lVar3 = *(long *)(unaff_x20 + 0xe8);
  pcVar1 = (char *)(lVar3 + 8);
  if (*pcVar1 == '\0') {
    *pcVar1 = '\x01';
  }
  else {
    func_0x007aff64(pcVar1,param_2,1000000000);
  }
  func_0x004b023c(lVar3 + 0x10);
  if (*pcVar1 == '\x01') {
    *pcVar1 = in_wzr;
  }
  else {
    func_0x007b05dc(pcVar1,0);
  }
  if (in_stack_00000020 == in_stack_00000010) {
    return;
  }
  uVar2 = *(long *)(in_stack_00000020 + 0x18) - 0xc;
  if (0x14 < uVar2) {
    uVar2 = unaff_x21;
  }
                    /* WARNING: Could not recover jumptable at 0x004b0324. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&UNK_004b0328 + (ulong)(byte)(&UNK_008a1488)[uVar2] * 4))();
  return;
}

