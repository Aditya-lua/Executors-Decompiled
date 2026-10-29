/* 7ff70c9512c0 FUN_7ff70c9512c0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c9512c0(longlong *param_1)

{
  undefined8 *puVar1;
  longlong *plVar2;
  longlong lVar3;
  
  puVar1 = (undefined8 *)*param_1;
  if (puVar1 != (undefined8 *)0x0) {
    plVar2 = (longlong *)*puVar1;
    while (plVar2 != (longlong *)0x0) {
      lVar3 = *plVar2;
      plVar2 = (longlong *)plVar2[2];
      (*_DAT_7ff70cbebad8)(*(undefined8 *)(lVar3 + 0x18));
      (*_DAT_7ff70cbebad8)(lVar3);
    }
    (*_DAT_7ff70cbebad8)(puVar1[4]);
    (*_DAT_7ff70cbebad8)(puVar1);
    *param_1 = 0;
  }
  return;
}


