
bool FUN_0014c804(void)

{
  ulong uVar1;
  long lVar2;
  long lVar3;
  
  uVar1 = _objc_opt_isKindOfClass();
  if ((uVar1 & 1) != 0) {
    lVar2 = func_0x007b73e0();
    lVar3 = func_0x007b73e0();
    if (lVar2 == lVar3) {
      lVar2 = func_0x007b65c0();
      lVar3 = func_0x007b65c0();
      if (lVar2 == lVar3) {
        lVar2 = func_0x007b68a0();
        lVar3 = func_0x007b68a0();
        if (lVar2 == lVar3) {
          lVar2 = func_0x007b7d00();
          lVar3 = func_0x007b7d00();
          return lVar2 == lVar3;
        }
      }
    }
  }
  return false;
}

