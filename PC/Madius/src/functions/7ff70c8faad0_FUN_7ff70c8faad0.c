/* 7ff70c8faad0 FUN_7ff70c8faad0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

longlong * FUN_7ff70c8faad0(longlong param_1)

{
  longlong *plVar1;
  longlong lVar2;
  
  if (param_1 != 0) {
    plVar1 = (longlong *)(*_DAT_7ff70cbebad0)(0x1b8);
    if (plVar1 != (longlong *)0x0) {
      FUN_7ff70cb12b80(plVar1 + 1,0,0x1a8);
      plVar1[0x36] = 1;
      plVar1[0x10] = 0;
      plVar1[0x11] = 0;
      *plVar1 = param_1;
      lVar2 = *(longlong *)(param_1 + 0x10);
      if (*(longlong *)(param_1 + 0x10) == 0) {
        lVar2 = param_1;
      }
      *(longlong **)(lVar2 + 8) = plVar1;
      *(longlong **)(param_1 + 0x10) = plVar1;
      return plVar1;
    }
  }
  return (longlong *)0x0;
}


