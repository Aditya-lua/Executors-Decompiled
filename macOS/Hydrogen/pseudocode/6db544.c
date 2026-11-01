
undefined8 FUN_006db544(long param_1,long param_2,long param_3)

{
  int iVar1;
  int iVar2;
  long *plVar3;
  long lVar4;
  long lVar5;
  
  iVar1 = iRam0000000000a27b08;
  if ((param_1 == 1) && (*(long *)(param_3 + 0x38) == 1)) {
    lVar5 = **(long **)(param_3 + 0x30);
    if (((lVar5 != 0 && *(int *)(lVar5 + 8) == iRam0000000000a27b08) ||
        ((((*(int *)(lVar5 + 8) == iRam0000000000a27ac8 && (*(char *)(lVar5 + 0x48) == '\0')) &&
          (*(long *)(lVar5 + 0x40) == 2)) &&
         (((lVar4 = *(long *)(lVar5 + 0x20),
           lVar4 != 0 && *(int *)(lVar4 + 8) == iRam0000000000a27aa8 &&
           (*(long *)(lVar4 + 0x20) != 0)) &&
          ((iVar2 = _strcmp(*(long *)(lVar4 + 0x20),"setmetatable"), iVar2 == 0 &&
           (lVar5 = **(long **)(lVar5 + 0x38), lVar5 != 0 && *(int *)(lVar5 + 8) == iVar1)))))))) &&
       (*(long *)(lVar5 + 0x28) == 0)) {
      plVar3 = (long *)func_0x006db828(param_2 + 0x10,*(undefined8 *)(param_3 + 0x20));
      *plVar3 = lVar5;
      return 1;
    }
  }
  return 1;
}

