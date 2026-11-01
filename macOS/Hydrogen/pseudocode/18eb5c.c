
void FUN_0018eb5c(long *param_1,undefined8 *param_2)

{
  code *pcVar1;
  int iVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  undefined8 uVar6;
  long lStack0000000000000000;
  undefined8 uStack0000000000000008;
  
  lStack0000000000000000 = 0;
  iVar2 = _CMSDecoderCopyDetachedContent(*param_2);
  lVar4 = lStack0000000000000000;
  if (iVar2 != 0) {
    *(int *)(param_1 + 1) = iVar2;
    *param_1 = -0x8000000000000000;
    return;
  }
  if (lStack0000000000000000 == 0) {
    *param_1 = 0;
    param_1[1] = 1;
    param_1[2] = 0;
    return;
  }
  uStack0000000000000008 = lStack0000000000000000;
  lVar3 = _CFDataGetBytePtr(lStack0000000000000000);
  if (lVar3 == 0) {
    lVar4 = 0;
    lVar3 = 1;
  }
  else {
    lVar4 = _CFDataGetLength(lVar4);
    if (lVar4 < 0) {
      uVar6 = 0;
LAB_0018ec40:
      func_0x007a1f00(uVar6,lVar4,&UNK_009c0858);
                    /* WARNING: Does not return */
      pcVar1 = (code *)SoftwareBreakpoint(1,0x18ec58);
      (*pcVar1)();
    }
    if (lVar4 != 0) {
      uVar6 = 1;
      lVar5 = func_0x00187bd0(lVar4,1);
      if (lVar5 == 0) goto LAB_0018ec40;
      goto LAB_0018ec04;
    }
  }
  lVar5 = 1;
LAB_0018ec04:
  _memcpy(lVar5,lVar3,lVar4);
  *param_1 = lVar4;
  param_1[1] = lVar5;
  param_1[2] = lVar4;
  func_0x0019fb28(&uStack0000000000000008);
  return;
}

