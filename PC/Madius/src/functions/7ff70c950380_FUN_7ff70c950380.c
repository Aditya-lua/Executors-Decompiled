/* 7ff70c950380 FUN_7ff70c950380 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c950380(longlong *param_1)

{
  undefined8 *puVar1;
  longlong *plVar2;
  undefined8 *puVar3;
  
  puVar1 = (undefined8 *)*param_1;
  if (puVar1 != (undefined8 *)0x0) {
    plVar2 = (longlong *)puVar1[1];
    while (plVar2 != (longlong *)0x0) {
      puVar3 = (undefined8 *)*plVar2;
      plVar2 = (longlong *)plVar2[2];
      (*_DAT_7ff70cbebad8)(*puVar3);
      (*_DAT_7ff70cbebad8)(puVar3[2]);
      (*_DAT_7ff70cbebad8)(puVar3);
    }
    (*_DAT_7ff70cbebad8)(*puVar1);
    (*_DAT_7ff70cbebad8)(puVar1);
    *param_1 = 0;
  }
  return;
}


