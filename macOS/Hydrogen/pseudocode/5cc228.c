
ulong FUN_005cc228(undefined8 *param_1,long *param_2)

{
  char *pcVar1;
  long lVar2;
  ulong uVar3;
  ulong extraout_x1;
  ulong uVar4;
  ulong extraout_x1_00;
  ulong extraout_x1_01;
  long extraout_x8;
  long lVar5;
  long *plVar6;
  ulong uVar7;
  undefined8 *puVar8;
  char in_wzr;
  
  plVar6 = (long *)*param_1;
  uVar3 = func_0x005ccc50(plVar6);
  if (((uVar3 & 1) == 0) && (*plVar6 == 10)) {
    lVar5 = *param_2;
    lVar2 = plVar6[2];
    uVar7 = plVar6[3];
    uVar4 = uVar7;
    if (*(long *)(lVar5 + 0x18) != 0) {
      uVar4 = uVar7 + 1 >> 1;
    }
    if (*(ulong *)(lVar5 + 0x10) < uVar4) goto LAB_005cc300;
    while (uVar7 != 0) {
      puVar8 = (undefined8 *)(lVar2 + 8);
      while (lVar2 = *(long *)*puVar8, *(long *)*puVar8 = lVar2 + 1, -1 < lVar2) {
        func_0x005c5458(lVar5);
        puVar8 = puVar8 + 2;
        uVar7 = uVar7 - 1;
        uVar4 = extraout_x1;
        if (uVar7 == 0) goto LAB_005cc2ac;
      }
      func_0x007a05dc();
      uVar4 = extraout_x1_00;
      lVar2 = extraout_x8;
LAB_005cc300:
      func_0x007ae680(lVar5,uVar4,lVar5 + 0x20,1);
      uVar4 = extraout_x1_01;
    }
LAB_005cc2ac:
    lVar2 = plVar6[4];
    pcVar1 = (char *)(lVar2 + 8);
    if (*pcVar1 == '\0') {
      *pcVar1 = '\x01';
    }
    else {
      func_0x007aff64(pcVar1,uVar4,1000000000);
    }
    func_0x005d6b94(lVar5,lVar2 + 0x28);
    if (*pcVar1 == '\x01') {
      *pcVar1 = in_wzr;
    }
    else {
      func_0x007b05dc(pcVar1,0);
    }
  }
  return uVar3;
}

