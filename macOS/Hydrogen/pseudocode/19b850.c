
void FUN_0019b850(undefined8 *param_1,undefined8 param_2)

{
  code *pcVar1;
  undefined8 uVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  long *unaff_x19;
  undefined8 uVar6;
  long lStack0000000000000000;
  undefined8 uStack0000000000000008;
  
  lStack0000000000000000 = 0;
  uVar6 = *param_1;
  uVar2 = func_0x0019dae4(param_2);
  uStack0000000000000008 = func_0x0019f0a4();
  lVar3 = _SecKeyCreateDecryptedData(uVar6,uVar2,uStack0000000000000008);
  func_0x0019fb28(&uStack0000000000000008);
  if (lStack0000000000000000 != 0) {
    *unaff_x19 = -0x8000000000000000;
    unaff_x19[1] = lStack0000000000000000;
    return;
  }
  if (lVar3 == 0) {
    func_0x007a11c0(&UNK_0081c6e6,0x22,&UNK_009c1c88);
    lVar3 = 0;
code_r0x0019b958:
    uVar2 = 0;
code_r0x0019b95c:
    func_0x007a1f00(uVar2,lVar3,&UNK_009c1ca0);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x19b974);
    (*pcVar1)();
  }
  uStack0000000000000008 = lVar3;
  lVar4 = _CFDataGetBytePtr(lVar3);
  if (lVar4 == 0) {
    lVar3 = 0;
    lVar4 = 1;
  }
  else {
    lVar3 = _CFDataGetLength(lVar3);
    if (lVar3 < 0) goto code_r0x0019b958;
    if (lVar3 != 0) {
      uVar2 = 1;
      lVar5 = func_0x00187bd0(lVar3,1);
      if (lVar5 == 0) goto code_r0x0019b95c;
      goto code_r0x0019b908;
    }
  }
  lVar5 = 1;
code_r0x0019b908:
  _memcpy(lVar5,lVar4,lVar3);
  *unaff_x19 = lVar3;
  unaff_x19[1] = lVar5;
  unaff_x19[2] = lVar3;
  func_0x0019fb28(&uStack0000000000000008);
  return;
}

