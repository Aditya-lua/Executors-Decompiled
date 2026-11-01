
char * FUN_006e5a2c(void)

{
  long lVar1;
  long lVar2;
  long *plVar3;
  long lVar4;
  long unaff_x19;
  uint unaff_w20;
  char *pcVar5;
  
  lVar1 = __dyld_get_image_header(0);
  if (*(int *)(lVar1 + 0x4e8dd14) != 7) {
    return (char *)0x0;
  }
  lVar2 = *(long *)(lVar1 + 0x4e8dd08);
  if (*(char *)(lVar2 + 3) == '\0') {
    if ((int)unaff_w20 < 1) {
      return (char *)0x0;
    }
    lVar4 = *(long *)(lVar2 + 0x18);
    if (*(byte *)(lVar4 + 3) < unaff_w20) {
      return (char *)0x0;
    }
    lVar2 = lVar2 + (ulong)(unaff_w20 - 1) * 0x10;
    plVar3 = (long *)(lVar2 + 0x20);
    if (*(int *)(lVar2 + 0x2c) == 0xc) {
      plVar3 = *(long **)(*plVar3 + 8);
    }
    if (*(int *)(lVar4 + 0x94) < (int)unaff_w20) {
      pcVar5 = "";
    }
    else {
      pcVar5 = (char *)(*(long *)(lVar4 + 0x50 +
                                 ((ulong)(unaff_w20 - 1) * 8 - *(long *)(lVar4 + 0x50))) + 0x18);
    }
  }
  else {
    if ((int)unaff_w20 < 1) {
      return (char *)0x0;
    }
    if (*(byte *)(lVar2 + 4) < unaff_w20) {
      return (char *)0x0;
    }
    plVar3 = (long *)(lVar2 + (ulong)(unaff_w20 - 1) * 0x10 + 0x30);
    pcVar5 = "";
  }
  lVar2 = *(long *)(unaff_x19 + 8);
  *(long *)(unaff_x19 + 8) = lVar2 + -0x10;
  lVar4 = *(long *)(lVar2 + -0x10);
  plVar3[1] = *(long *)(lVar2 + -8);
  *plVar3 = lVar4;
  if (((*(int *)((long)*(long **)(unaff_x19 + 8) + 0xc) < 5) ||
      ((*(byte *)(*(long *)(lVar1 + 0x4e8dd08) + 1) >> 2 & 1) == 0)) ||
     ((*(byte *)(**(long **)(unaff_x19 + 8) + 1) & 3) == 0)) {
    return pcVar5;
  }
  func_0x006f0d48();
  return pcVar5;
}

