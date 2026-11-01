
undefined8 FUN_006db578(void)

{
  bool in_ZR;
  int iVar1;
  long *plVar2;
  int in_w8;
  long lVar3;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  int unaff_w22;
  
  if (((in_ZR || in_w8 != unaff_w22) &&
      ((((in_w8 != iRam0000000000a27ac8 || (*(char *)(unaff_x21 + 0x48) != '\0')) ||
        (*(long *)(unaff_x21 + 0x40) != 2)) ||
       (((lVar3 = *(long *)(unaff_x21 + 0x20),
         lVar3 == 0 || *(int *)(lVar3 + 8) != iRam0000000000a27aa8 || (*(long *)(lVar3 + 0x20) == 0)
         ) || ((iVar1 = _strcmp(*(long *)(lVar3 + 0x20),"setmetatable"), iVar1 != 0 ||
               (unaff_x21 = **(long **)(unaff_x21 + 0x38),
               unaff_x21 == 0 || *(int *)(unaff_x21 + 8) != unaff_w22)))))))) ||
     (*(long *)(unaff_x21 + 0x28) != 0)) {
    return 1;
  }
  plVar2 = (long *)func_0x006db828(unaff_x20 + 0x10,*(undefined8 *)(unaff_x19 + 0x20));
  *plVar2 = unaff_x21;
  return 1;
}

