
long FUN_0027f494(code *param_1)

{
  long lVar1;
  long *plVar2;
  long lVar3;
  code *pcVar4;
  undefined1 auVar5 [12];
  
  lVar1 = (*param_1)();
  if (-1 < lVar1) {
    return lVar1;
  }
  auVar5 = func_0x0079d094();
  plVar2 = auVar5._0_8_;
  if (plVar2 == (long *)0x0) {
    return 0;
  }
  if ((*plVar2 == 0) || (pcVar4 = *(code **)(*plVar2 + 0x30), pcVar4 == (code *)0x0)) {
    func_0x0028f83c(0x11,0,0x73,"/aws-lc/crypto/bio/bio.c",0x16a);
    return -2;
  }
  lVar1 = (long)auVar5._8_4_;
  if ((code *)plVar2[2] != (code *)0x0) {
    lVar3 = (*(code *)plVar2[2])(plVar2,6,0,0,9,lVar1,1,0);
    if (lVar3 < 1) {
      return lVar3;
    }
    pcVar4 = *(code **)(*plVar2 + 0x30);
  }
  lVar3 = (*pcVar4)(plVar2,9,lVar1,0);
  if ((code *)plVar2[2] == (code *)0x0) {
    return lVar3;
  }
  lVar1 = (*(code *)plVar2[2])(plVar2,0x86,0,0,9,lVar1,lVar3,0);
  return lVar1;
}

