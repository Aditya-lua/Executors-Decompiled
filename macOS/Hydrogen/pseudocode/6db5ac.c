
undefined8 FUN_006db5ac(long param_1)

{
  int iVar1;
  long *plVar2;
  int in_w9;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long lVar3;
  int unaff_w22;
  
  if ((((param_1 == 0 || in_w9 != iRam0000000000a27aa8) || (*(long *)(param_1 + 0x20) == 0)) ||
      (iVar1 = _strcmp(*(long *)(param_1 + 0x20),"setmetatable"), iVar1 != 0)) ||
     ((lVar3 = **(long **)(unaff_x21 + 0x38), lVar3 == 0 || *(int *)(lVar3 + 8) != unaff_w22 ||
      (*(long *)(lVar3 + 0x28) != 0)))) {
    return 1;
  }
  plVar2 = (long *)func_0x006db828(unaff_x20 + 0x10,*(undefined8 *)(unaff_x19 + 0x20));
  *plVar2 = lVar3;
  return 1;
}

