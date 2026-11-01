
char * FUN_006e5908(long param_1)

{
  char *pcVar1;
  long *plVar2;
  long *plVar3;
  long lVar4;
  long unaff_x19;
  uint unaff_w20;
  
  if (*(char *)(param_1 + 3) == '\0') {
    if ((int)unaff_w20 < 1) {
      return (char *)0x0;
    }
    lVar4 = *(long *)(param_1 + 0x18);
    if (*(byte *)(lVar4 + 3) < unaff_w20) {
      return (char *)0x0;
    }
    param_1 = param_1 + (ulong)(unaff_w20 - 1) * 0x10;
    plVar2 = (long *)(param_1 + 0x20);
    if (*(int *)(param_1 + 0x2c) == 0xc) {
      plVar2 = *(long **)(*plVar2 + 8);
    }
    if (*(int *)(lVar4 + 0x94) < (int)unaff_w20) {
      pcVar1 = "";
    }
    else {
      pcVar1 = (char *)(*(long *)(lVar4 + 0x50 +
                                 ((ulong)(unaff_w20 - 1) * 8 - *(long *)(lVar4 + 0x50))) + 0x18);
    }
  }
  else {
    if ((int)unaff_w20 < 1) {
      return (char *)0x0;
    }
    if (*(byte *)(param_1 + 4) < unaff_w20) {
      return (char *)0x0;
    }
    plVar2 = (long *)(param_1 + (ulong)(unaff_w20 - 1) * 0x10 + 0x30);
    pcVar1 = "";
  }
  plVar3 = *(long **)(unaff_x19 + 8);
  lVar4 = *plVar2;
  plVar3[1] = plVar2[1];
  *plVar3 = lVar4;
  *(long *)(unaff_x19 + 8) = *(long *)(unaff_x19 + 8) + 0x10;
  return pcVar1;
}

