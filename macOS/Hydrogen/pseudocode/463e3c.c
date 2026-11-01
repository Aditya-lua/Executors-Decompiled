
/* WARNING: Possible PIC construction at 0x00463e54: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00463e58) */
/* WARNING: Removing unreachable block (ram,0x00463e70) */
/* WARNING: Removing unreachable block (ram,0x00463e74) */
/* WARNING: Removing unreachable block (ram,0x00463e7c) */
/* WARNING: Removing unreachable block (ram,0x00463e88) */
/* WARNING: Removing unreachable block (ram,0x00463e8c) */
/* WARNING: Removing unreachable block (ram,0x00463eb4) */
/* WARNING: Removing unreachable block (ram,0x00463ecc) */
/* WARNING: Removing unreachable block (ram,0x00463f24) */
/* WARNING: Removing unreachable block (ram,0x00463ee4) */
/* WARNING: Removing unreachable block (ram,0x00463f3c) */
/* WARNING: Removing unreachable block (ram,0x00463f04) */
/* WARNING: Removing unreachable block (ram,0x00463f4c) */
/* WARNING: Removing unreachable block (ram,0x00463f0c) */
/* WARNING: Removing unreachable block (ram,0x00463e90) */
/* WARNING: Removing unreachable block (ram,0x00463e60) */
/* WARNING: Removing unreachable block (ram,0x00463e98) */
/* WARNING: Removing unreachable block (ram,0x00464020) */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined1  [16] FUN_00463e3c(void)

{
  char *pcVar1;
  long lVar2;
  char cVar3;
  undefined8 uVar4;
  ushort uVar5;
  ulong uVar6;
  undefined2 extraout_w1;
  undefined2 extraout_w1_00;
  undefined8 uVar7;
  uint uVar8;
  long *unaff_x20;
  ulong uVar9;
  long lVar10;
  undefined1 auVar11 [16];
  undefined1 uStack0000000000000000;
  undefined6 uStack0000000000000002;
  undefined8 uStack0000000000000008;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined4 uStack_70;
  undefined1 uStack_6c;
  
  _uStack0000000000000000 = 0;
  uStack0000000000000008 = 0;
  lVar10 = *unaff_x20;
  lVar2 = unaff_x20[1];
  uVar6 = func_0x00463a84();
  if ((uVar6 & 1) == 0) {
    *unaff_x20 = lVar10;
    unaff_x20[1] = lVar2;
    uVar4 = _UNK_00814e98;
    uVar7 = _UNK_00814e90;
    uStack_78 = _UNK_00814e98;
    uStack_80 = _UNK_00814e90;
    uStack_70 = 0x10;
    uStack_6c = 1;
    uVar5 = func_0x004637fc(&uStack_80);
    if (uVar5 != 1) {
      *unaff_x20 = lVar10;
      unaff_x20[1] = lVar2;
      if ((uVar5 & 1) == 0) {
        uVar7 = 0;
        uVar9 = 0;
        goto LAB_00464034;
      }
    }
    _uStack0000000000000000 = CONCAT62(uStack0000000000000002,extraout_w1);
    lVar10 = 0xe;
    uVar9 = 1;
    do {
      pcVar1 = (char *)*unaff_x20;
      lVar2 = unaff_x20[1];
      if ((uVar9 < 7) && (lVar2 != 0)) {
        cVar3 = *pcVar1;
        *unaff_x20 = (long)(pcVar1 + 1);
        unaff_x20[1] = lVar2 + -1;
        if ((cVar3 == ':') && (uVar6 = func_0x00463a84(), (uVar6 & 1) != 0)) {
          uVar8 = (uint)(uVar6 >> 8);
          goto LAB_00463fb0;
        }
      }
      if (lVar2 == 0) {
LAB_00464104:
        uVar7 = 0;
        *unaff_x20 = (long)pcVar1;
        unaff_x20[1] = lVar2;
        goto LAB_00464034;
      }
      cVar3 = *pcVar1;
      *unaff_x20 = (long)(pcVar1 + 1);
      unaff_x20[1] = lVar2 + -1;
      if (cVar3 != ':') goto LAB_00464104;
      uStack_78 = uVar4;
      uStack_80 = uVar7;
      uStack_70 = 0x10;
      uStack_6c = 1;
      uVar5 = func_0x004637fc(&uStack_80);
      if (uVar5 != 1) {
        *unaff_x20 = (long)pcVar1;
        unaff_x20[1] = lVar2;
        if ((uVar5 & 1) == 0) {
          uVar7 = 0;
          goto LAB_00464034;
        }
      }
      *(undefined2 *)(&uStack0000000000000000 + uVar9 * 2) = extraout_w1_00;
      uVar9 = uVar9 + 1;
      lVar10 = lVar10 + -2;
    } while (lVar10 != 0);
    uVar7 = 0;
    uVar9 = 8;
  }
  else {
    uVar9 = 0;
    uVar8 = (uint)(uVar6 >> 8);
LAB_00463fb0:
    uVar8 = (uVar8 & 0xff00ff00) >> 8 | (uVar8 & 0xff00ff) << 8;
    *(short *)(&uStack0000000000000000 + uVar9 * 2) = (short)uVar8;
    *(short *)((long)(&uStack0000000000000000 + uVar9 * 2) + 2) = (short)(uVar8 >> 0x10);
    uVar9 = uVar9 + 2;
    uVar7 = 1;
  }
LAB_00464034:
  auVar11._8_8_ = uVar7;
  auVar11._0_8_ = uVar9;
  return auVar11;
}

