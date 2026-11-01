
bool FUN_006e431c(long param_1,undefined8 param_2)

{
  long lVar1;
  long *plVar2;
  int iVar3;
  
  if ((*(byte *)(param_1 + 1) >> 2 & 1) != 0) {
    func_0x006f0ed4(param_1,param_1,param_1 + 0x68);
  }
  iVar3 = (int)param_2;
  if (iVar3 < 1) {
    if (iVar3 < -9999) {
      plVar2 = (long *)func_0x006e60a0(param_1,param_2);
      iVar3 = *(int *)((long)plVar2 + 0xc);
      goto joined_r0x006e43dc;
    }
    plVar2 = (long *)(*(long *)(param_1 + 8) + (long)iVar3 * 0x10);
  }
  else {
    plVar2 = (long *)(*(long *)(param_1 + 0x10) + (ulong)(iVar3 - 1) * 0x10);
    if (*(long **)(param_1 + 8) <= plVar2) {
      lVar1 = __dyld_get_image_header(0);
      plVar2 = (long *)(lVar1 + 0x4e8dd08);
      iVar3 = *(int *)(lVar1 + 0x4e8dd14);
      goto joined_r0x006e43dc;
    }
  }
  iVar3 = *(int *)((long)plVar2 + 0xc);
joined_r0x006e43dc:
  if (iVar3 == 8) {
    lVar1 = (*plVar2 + 8) - *(long *)(*plVar2 + 8);
  }
  else if (iVar3 == 6) {
    lVar1 = *(long *)(*plVar2 + 0x10);
  }
  else {
    lVar1 = *(long *)(*(long *)(param_1 + 0x18) + (long)iVar3 * 8 + 0x328);
  }
  if (lVar1 != 0) {
    plVar2 = *(long **)(param_1 + 8);
    *plVar2 = lVar1;
    *(undefined4 *)((long)plVar2 + 0xc) = 6;
    *(long *)(param_1 + 8) = *(long *)(param_1 + 8) + 0x10;
  }
  return lVar1 != 0;
}

