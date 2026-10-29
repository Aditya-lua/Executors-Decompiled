/* 7ff70c97f1a0 FUN_7ff70c97f1a0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

longlong FUN_7ff70c97f1a0(undefined8 param_1)

{
  code *pcVar1;
  uint uVar2;
  longlong lVar3;
  uint uVar4;
  longlong lVar5;
  bool bVar6;
  
  pcVar1 = _DAT_7ff70cb957c8;
  lVar5 = 0;
  uVar4 = 1;
  while ((((lVar3 = (*_DAT_7ff70cbebae0)(lVar5,uVar4), lVar3 != 0 &&
           (uVar2 = (*pcVar1)(param_1,lVar3,uVar4), lVar5 = lVar3, uVar2 != 0)) && (uVar2 != uVar4))
         && (uVar2 < 0x8001))) {
    bVar6 = uVar2 < uVar4;
    uVar4 = uVar2;
    if (bVar6) {
      return lVar3;
    }
  }
  (*_DAT_7ff70cbebad8)(lVar5);
  return 0;
}


