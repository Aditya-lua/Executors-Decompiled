
void FUN_0022424c(undefined8 *param_1,long *param_2)

{
  ulong uVar1;
  undefined1 *puVar2;
  byte bVar3;
  long lVar4;
  long *plVar5;
  ulong extraout_x1;
  ulong extraout_x1_00;
  ulong uVar6;
  undefined8 uVar7;
  ulong extraout_x9;
  ulong uVar8;
  ulong extraout_x9_00;
  undefined1 *puVar9;
  ulong unaff_x20;
  long lVar10;
  
  uVar6 = param_2[1];
  uVar8 = param_2[2];
  if (uVar6 == uVar8) {
    param_1[2] = &UNK_008298d8;
    param_1[3] = 2;
    *(undefined1 *)(param_1 + 1) = 0xc;
    uVar7 = 1;
LAB_0022431c:
    *param_1 = uVar7;
    return;
  }
  uVar1 = uVar8 + 1;
  param_2[2] = uVar1;
  if (uVar8 < 0xffffffffffffffff) {
    if (uVar6 < uVar1) goto LAB_00224348;
    lVar10 = *param_2;
    bVar3 = *(byte *)(lVar10 + uVar8);
    unaff_x20 = (ulong)bVar3;
    if (uVar6 - uVar1 < unaff_x20) {
      param_1[1] = 0xb;
      param_1[2] = unaff_x20;
      param_1[3] = 0;
      uVar7 = 1;
      goto LAB_0022431c;
    }
    uVar8 = uVar1 + unaff_x20;
    param_2[2] = uVar8;
    if (CARRY8(uVar1,unaff_x20)) goto LAB_00224358;
    if (uVar8 <= uVar6) {
      if (bVar3 == 0) {
        lVar4 = 1;
      }
      else {
        lVar4 = func_0x00187bd0(unaff_x20,1);
        if (lVar4 == 0) goto LAB_0022437c;
      }
      _memcpy(lVar4,lVar10 + uVar1,unaff_x20);
      uVar7 = 0;
      param_1[1] = unaff_x20;
      param_1[2] = lVar4;
      param_1[3] = unaff_x20;
      goto LAB_0022431c;
    }
  }
  else {
    func_0x007a28bc(0xffffffffffffffff,uVar1,&UNK_009c9a78);
    uVar6 = extraout_x1;
LAB_00224348:
    func_0x007a28b0(uVar1,uVar6,&UNK_009c9a78);
    uVar8 = extraout_x9;
LAB_00224358:
    func_0x007a28bc(uVar1,uVar8,&UNK_009c9a78);
    uVar6 = extraout_x1_00;
    uVar8 = extraout_x9_00;
  }
  func_0x007a28b0(uVar8,uVar6,&UNK_009c9a78);
LAB_0022437c:
  plVar5 = (long *)func_0x007a1f00(1,unaff_x20,&UNK_009c6fd0);
  puVar2 = (undefined1 *)plVar5[1];
  lVar10 = plVar5[2];
  if (lVar10 != 0) {
    puVar9 = puVar2;
    do {
      *puVar9 = 0;
      lVar10 = lVar10 + -1;
      puVar9 = puVar9 + 1;
    } while (lVar10 != 0);
  }
  plVar5[2] = 0;
  for (lVar10 = *plVar5; lVar10 != 0; lVar10 = lVar10 + -1) {
    *puVar2 = 0;
    puVar2 = puVar2 + 1;
  }
  return;
}

