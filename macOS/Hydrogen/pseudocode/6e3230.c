
undefined8 FUN_006e3230(ulong param_1,long param_2)

{
  long *plVar1;
  int iVar2;
  long lVar3;
  
  plVar1 = (long *)(*(long *)(param_2 + 0x10) + (param_1 & 0xffffffff) * 0x10);
  if (plVar1 < *(long **)(param_2 + 8)) {
    iVar2 = *(int *)((long)plVar1 + 0xc);
  }
  else {
    lVar3 = __dyld_get_image_header(0);
    plVar1 = (long *)(lVar3 + 0x4e8dd08);
    iVar2 = *(int *)(lVar3 + 0x4e8dd14);
  }
  if ((iVar2 == 7) && (*(char *)(*plVar1 + 3) != '\0')) {
    return *(undefined8 *)(*plVar1 + 0x18);
  }
  return 0;
}

