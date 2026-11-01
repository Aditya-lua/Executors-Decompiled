
undefined8 FUN_006e4b74(long param_1,int param_2)

{
  int iVar1;
  byte bVar2;
  long lVar3;
  long *plVar4;
  
  if (param_2 < 1) {
    if (param_2 < -9999) {
      plVar4 = (long *)func_0x006e60a0(param_1);
      iVar1 = *(int *)((long)plVar4 + 0xc);
      goto joined_r0x006e4c2c;
    }
    plVar4 = (long *)(*(long *)(param_1 + 8) + (long)param_2 * 0x10);
  }
  else {
    plVar4 = (long *)(*(long *)(param_1 + 0x10) + (ulong)(param_2 - 1) * 0x10);
    if (*(long **)(param_1 + 8) <= plVar4) {
      lVar3 = __dyld_get_image_header(0);
      plVar4 = (long *)(lVar3 + 0x4e8dd08);
      iVar1 = *(int *)(lVar3 + 0x4e8dd14);
      goto joined_r0x006e4c2c;
    }
  }
  iVar1 = *(int *)((long)plVar4 + 0xc);
joined_r0x006e4c2c:
  if (iVar1 == 9) {
    lVar3 = *(long *)(param_1 + 8);
    *(undefined8 *)(*plVar4 + 0x58) = *(undefined8 *)(lVar3 + -0x10);
    bVar2 = *(byte *)(*plVar4 + 1);
  }
  else {
    if (iVar1 != 7) {
      *(long *)(param_1 + 8) = *(long *)(param_1 + 8) + -0x10;
      return 0;
    }
    lVar3 = *(long *)(param_1 + 8);
    *(undefined8 *)(*plVar4 + 0x10) = *(undefined8 *)(lVar3 + -0x10);
    bVar2 = *(byte *)(*plVar4 + 1);
  }
  if (((bVar2 >> 2 & 1) != 0) && ((*(byte *)(*(long *)(lVar3 + -0x10) + 1) & 3) != 0)) {
    func_0x006f0d48(param_1);
  }
  *(long *)(param_1 + 8) = *(long *)(param_1 + 8) + -0x10;
  return 1;
}

