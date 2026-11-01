
void FUN_005cc274(long param_1)

{
  char *pcVar1;
  bool in_ZR;
  long lVar2;
  ulong extraout_x1;
  ulong uVar3;
  ulong extraout_x1_00;
  long extraout_x8;
  ulong in_x9;
  ulong in_x11;
  long unaff_x21;
  ulong unaff_x22;
  undefined8 *puVar4;
  char in_wzr;
  
  uVar3 = unaff_x22;
  if (!in_ZR) {
    uVar3 = in_x9;
  }
  if (in_x11 < uVar3) goto LAB_005cc300;
  while (unaff_x22 != 0) {
    puVar4 = (undefined8 *)(param_1 + 8);
    while (lVar2 = *(long *)*puVar4, *(long *)*puVar4 = lVar2 + 1, -1 < lVar2) {
      func_0x005c5458();
      puVar4 = puVar4 + 2;
      unaff_x22 = unaff_x22 - 1;
      uVar3 = extraout_x1;
      if (unaff_x22 == 0) goto LAB_005cc2ac;
    }
    func_0x007a05dc();
    param_1 = extraout_x8;
LAB_005cc300:
    func_0x007ae680();
    uVar3 = extraout_x1_00;
  }
LAB_005cc2ac:
  pcVar1 = (char *)(*(long *)(unaff_x21 + 0x20) + 8);
  if (*pcVar1 == '\0') {
    *pcVar1 = '\x01';
  }
  else {
    func_0x007aff64(pcVar1,uVar3,1000000000);
  }
  func_0x005d6b94();
  if (*pcVar1 == '\x01') {
    *pcVar1 = in_wzr;
  }
  else {
    func_0x007b05dc(pcVar1,0);
  }
  return;
}

