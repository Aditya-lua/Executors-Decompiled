/* 7ff70c9241b0 FUN_7ff70c9241b0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

longlong FUN_7ff70c9241b0(void)

{
  code *pcVar1;
  int iVar2;
  longlong lVar3;
  longlong lVar4;
  bool bVar5;
  
  iVar2 = FUN_7ff70cb12570(0x7ff70cbec440);
  if (iVar2 == 0) {
    if (_DAT_7ff70cbec48c != 0x7fffffff) {
      if (_DAT_7ff70cc1ab08 == 0) {
        lVar3 = FUN_7ff70ca8ff40(0x200);
        FUN_7ff70cb0dc76(lVar3);
        lVar4 = _DAT_7ff70cc1ab08;
        bVar5 = _DAT_7ff70cc1ab08 != 0;
        _DAT_7ff70cc1ab08 = lVar3;
        if (bVar5) {
          FUN_7ff70c925030(lVar4);
          thunk_FUN_7ff70ca90250(lVar4,0x200);
        }
      }
      lVar4 = _DAT_7ff70cc1ab08;
      FUN_7ff70cb12580(0x7ff70cbec440);
      return lVar4;
    }
  }
  else {
    FUN_7ff70cb124d0(5);
  }
  _DAT_7ff70cbec48c = 0x7ffffffe;
  FUN_7ff70cb124d0(6);
  pcVar1 = (code *)swi(3);
  lVar4 = (*pcVar1)();
  return lVar4;
}


