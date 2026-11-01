
void FUN_0019366c(undefined8 param_1)

{
  code *pcVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  long *unaff_x19;
  undefined8 uVar5;
  undefined1 uStack0000000000000008;
  
  _uStack0000000000000008 = param_1;
  lVar2 = _CFDataGetBytePtr();
  if (lVar2 == 0) {
    lVar3 = 0;
    lVar2 = 1;
  }
  else {
    lVar3 = _CFDataGetLength(param_1);
    if (lVar3 < 0) {
      uVar5 = 0;
code_r0x0019371c:
      func_0x007a1f00(uVar5,lVar3,&UNK_009c1360);
                    /* WARNING: Does not return */
      pcVar1 = (code *)SoftwareBreakpoint(1,0x193734);
      (*pcVar1)();
    }
    if (lVar3 != 0) {
      uVar5 = 1;
      lVar4 = func_0x00187bd0(lVar3,1);
      if (lVar4 == 0) goto code_r0x0019371c;
      goto code_r0x001936c8;
    }
  }
  lVar4 = 1;
code_r0x001936c8:
  _memcpy(lVar4,lVar2,lVar3);
  *unaff_x19 = lVar3;
  unaff_x19[1] = lVar4;
  unaff_x19[2] = lVar3;
  func_0x0019fb28(&uStack0000000000000008);
  return;
}

