
void FUN_0019b8c0(void)

{
  code *pcVar1;
  long lVar2;
  long lVar3;
  long *unaff_x19;
  undefined8 uVar4;
  undefined1 uStack0000000000000008;
  
  lVar2 = _CFDataGetLength();
  if (lVar2 < 0) {
    uVar4 = 0;
LAB_0019b95c:
    func_0x007a1f00(uVar4,lVar2,&UNK_009c1ca0);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x19b974);
    (*pcVar1)();
  }
  if (lVar2 == 0) {
    lVar3 = 1;
  }
  else {
    uVar4 = 1;
    lVar3 = func_0x00187bd0(lVar2,1);
    if (lVar3 == 0) goto LAB_0019b95c;
  }
  _memcpy(lVar3);
  *unaff_x19 = lVar2;
  unaff_x19[1] = lVar3;
  unaff_x19[2] = lVar2;
  func_0x0019fb28(&uStack0000000000000008);
  return;
}

