
void FUN_0019b890(void)

{
  code *pcVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  long *unaff_x19;
  long unaff_x20;
  undefined8 uVar5;
  long in_stack_00000000;
  undefined8 uStack0000000000000008;
  
  func_0x0019fb28();
  if (in_stack_00000000 != 0) {
    *unaff_x19 = -0x8000000000000000;
    unaff_x19[1] = in_stack_00000000;
    return;
  }
  if (unaff_x20 == 0) {
    func_0x007a11c0(&UNK_0081c6e6,0x22,&UNK_009c1c88);
    lVar3 = 0;
code_r0x0019b958:
    uVar5 = 0;
code_r0x0019b95c:
    func_0x007a1f00(uVar5,lVar3,&UNK_009c1ca0);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x19b974);
    (*pcVar1)();
  }
  uStack0000000000000008 = unaff_x20;
  lVar2 = _CFDataGetBytePtr();
  if (lVar2 == 0) {
    lVar3 = 0;
    lVar2 = 1;
  }
  else {
    lVar3 = _CFDataGetLength();
    if (lVar3 < 0) goto code_r0x0019b958;
    if (lVar3 != 0) {
      uVar5 = 1;
      lVar4 = func_0x00187bd0(lVar3,1);
      if (lVar4 == 0) goto code_r0x0019b95c;
      goto code_r0x0019b908;
    }
  }
  lVar4 = 1;
code_r0x0019b908:
  _memcpy(lVar4,lVar2,lVar3);
  *unaff_x19 = lVar3;
  unaff_x19[1] = lVar4;
  unaff_x19[2] = lVar3;
  func_0x0019fb28(&uStack0000000000000008);
  return;
}

