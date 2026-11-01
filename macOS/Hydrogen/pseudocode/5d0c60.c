
ulong FUN_005d0c60(ulong param_1)

{
  char *pcVar1;
  long lVar2;
  ulong extraout_x1;
  ulong uVar3;
  ulong extraout_x1_00;
  ulong extraout_x1_01;
  long extraout_x8;
  long *unaff_x20;
  long lVar4;
  long *unaff_x21;
  ulong uVar5;
  undefined8 *puVar6;
  char in_wzr;
  
  if (((param_1 & 1) == 0) && (*unaff_x21 == 10)) {
    lVar4 = *unaff_x20;
    lVar2 = unaff_x21[2];
    uVar5 = unaff_x21[3];
    uVar3 = uVar5;
    if (*(long *)(lVar4 + 0x18) != 0) {
      uVar3 = uVar5 + 1 >> 1;
    }
    if (*(ulong *)(lVar4 + 0x10) < uVar3) goto LAB_005d0d18;
    while (uVar5 != 0) {
      puVar6 = (undefined8 *)(lVar2 + 8);
      while (lVar2 = *(long *)*puVar6, *(long *)*puVar6 = lVar2 + 1, -1 < lVar2) {
        func_0x005c5458(lVar4);
        puVar6 = puVar6 + 2;
        uVar5 = uVar5 - 1;
        uVar3 = extraout_x1;
        if (uVar5 == 0) goto LAB_005d0cc4;
      }
      func_0x007a05dc();
      uVar3 = extraout_x1_00;
      lVar2 = extraout_x8;
LAB_005d0d18:
      func_0x007ae680(lVar4,uVar3,lVar4 + 0x20,1);
      uVar3 = extraout_x1_01;
    }
LAB_005d0cc4:
    lVar2 = unaff_x21[4];
    pcVar1 = (char *)(lVar2 + 8);
    if (*pcVar1 == '\0') {
      *pcVar1 = '\x01';
    }
    else {
      func_0x007aff64(pcVar1,uVar3,1000000000);
    }
    func_0x005d6b94(lVar4,lVar2 + 0x28);
    if (*pcVar1 == '\x01') {
      *pcVar1 = in_wzr;
    }
    else {
      func_0x007b05dc(pcVar1,0);
    }
  }
  return param_1;
}

