/* 7ff70c8f2b60 FUN_7ff70c8f2b60 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

longlong * FUN_7ff70c8f2b60(longlong *param_1,undefined8 param_2)

{
  longlong *plVar1;
  longlong lVar2;
  longlong *plVar3;
  longlong *plVar4;
  
  lVar2 = (*_DAT_7ff70cbebae8)(param_2);
  if (lVar2 != 0) {
    plVar3 = (longlong *)(*_DAT_7ff70cbebad0)(0x10);
    if (plVar3 != (longlong *)0x0) {
      plVar3[1] = 0;
      *plVar3 = lVar2;
      plVar1 = param_1;
      if (param_1 == (longlong *)0x0) {
        return plVar3;
      }
      do {
        plVar4 = plVar1;
        plVar1 = (longlong *)plVar4[1];
      } while (plVar1 != (longlong *)0x0);
      plVar4[1] = (longlong)plVar3;
      return param_1;
    }
    (*_DAT_7ff70cbebad8)(lVar2);
  }
  return (longlong *)0x0;
}


