
void FUN_0049a464(undefined8 param_1,undefined8 param_2)

{
  char *pcVar1;
  char cVar2;
  char in_w8;
  ulong uVar3;
  long unaff_x19;
  long lVar4;
  long unaff_x23;
  long unaff_x24;
  ulong unaff_x25;
  long unaff_x26;
  char unaff_w27;
  char in_wzr;
  ulong in_stack_00000008;
  undefined8 in_stack_00000018;
  undefined8 uStack0000000000000060;
  long *in_stack_00000068;
  undefined8 uStack0000000000000078;
  undefined8 in_stack_00000098;
  
  lVar4 = *(long *)(unaff_x19 + 0xe8);
  pcVar1 = (char *)(lVar4 + 8);
  cVar2 = *pcVar1;
  if (cVar2 == in_w8) {
    *pcVar1 = unaff_w27;
  }
  if (cVar2 != '\0') {
    func_0x007aff64(pcVar1,param_2,1000000000);
  }
  func_0x00499fc8(lVar4 + 0x10,in_stack_00000018);
  if (*pcVar1 == '\x01') {
    *pcVar1 = in_wzr;
  }
  else {
    func_0x007b05dc(pcVar1,0);
  }
  if (unaff_x23 != unaff_x24) {
    in_stack_00000098 = in_stack_00000018;
    uVar3 = *(long *)(unaff_x23 + 0x18) - 0xc;
    if (0x14 < uVar3) {
      uVar3 = unaff_x25;
    }
                    /* WARNING: Could not recover jumptable at 0x0049a0f0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)(&UNK_0049a0f4 + (ulong)*(byte *)(unaff_x26 + uVar3) * 4))();
    return;
  }
  if (((in_stack_00000008 < 3 && uStack0000000000000060 != 2) &&
      (func_0x005ec378(&uStack0000000000000060,&uStack0000000000000078),
      lVar4 = uStack0000000000000060, uStack0000000000000060 != 2)) &&
     (func_0x005ec3ac(&uStack0000000000000060,uStack0000000000000078), lVar4 != 0)) {
    lVar4 = *in_stack_00000068;
    *in_stack_00000068 = lVar4 + -1;
    LORelease();
    if (lVar4 == 1) {
      DataMemoryBarrier(2,1);
      func_0x005e80f0((ulong)&uStack0000000000000060 | 8);
    }
  }
  return;
}

