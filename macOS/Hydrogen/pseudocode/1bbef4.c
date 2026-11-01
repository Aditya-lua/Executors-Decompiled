
void FUN_001bbef4(void)

{
  undefined8 uVar1;
  ulong uVar2;
  undefined1 uVar3;
  ushort uVar4;
  undefined8 extraout_x1;
  long *plVar5;
  long lVar6;
  undefined8 extraout_x10;
  long lVar7;
  uint uVar8;
  long lVar9;
  long lVar10;
  undefined1 auVar11 [16];
  undefined8 uStack_60;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  
  func_0x007a28bc();
  auVar11 = func_0x007a28b0(extraout_x10,extraout_x1,&UNK_009c9a78);
  plVar5 = auVar11._8_8_;
  lVar9 = auVar11._0_8_;
  uVar3 = *(undefined1 *)(lVar9 + 0x34);
  lVar10 = plVar5[2];
  if (lVar10 == *plVar5) {
    func_0x00458a18(plVar5,&UNK_009c9a90);
  }
  *(undefined1 *)(plVar5[1] + lVar10) = uVar3;
  lVar10 = lVar10 + 1;
  plVar5[2] = lVar10;
  uVar4 = *(ushort *)(lVar9 + 0x30);
  if (uVar4 < 3) {
    if (uVar4 == 0) {
      uVar8 = 0x10;
    }
    else if (uVar4 == 1) {
      uVar8 = 0x11;
    }
    else {
      uVar8 = 0x12;
    }
  }
  else if (uVar4 == 3) {
    uVar8 = 0x20;
  }
  else if (uVar4 == 4) {
    uVar8 = 0x21;
  }
  else {
    uVar8 = (uint)*(ushort *)(lVar9 + 0x32);
  }
  if ((ulong)(*plVar5 - lVar10) < 2) {
    func_0x0079b61c(plVar5,lVar10,2,1,1);
    lVar10 = plVar5[2];
  }
  *(ushort *)(plVar5[1] + lVar10) = (ushort)(uVar8 >> 8) | (ushort)((uVar8 & 0xff00ff) << 8);
  lVar10 = lVar10 + 2;
  plVar5[2] = lVar10;
  uVar1 = *(undefined8 *)(lVar9 + 8);
  uVar2 = *(ulong *)(lVar9 + 0x10);
  lVar6 = *plVar5;
  if ((ulong)(lVar6 - lVar10) < 2) {
    func_0x0079b61c(plVar5,lVar10,2,1,1);
    lVar10 = plVar5[2];
    lVar6 = *plVar5;
  }
  lVar7 = plVar5[1];
  *(ushort *)(lVar7 + lVar10) =
       (ushort)(uVar2 >> 8) & 0xff | (ushort)(((uint)uVar2 & 0xff00ff) << 8);
  lVar10 = lVar10 + 2;
  plVar5[2] = lVar10;
  if ((ulong)(lVar6 - lVar10) < uVar2) {
    func_0x0079b61c(plVar5,lVar10,uVar2,1,1);
    lVar7 = plVar5[1];
    lVar10 = plVar5[2];
  }
  _memcpy(lVar7 + lVar10,uVar1,uVar2);
  plVar5[2] = lVar10 + uVar2;
  lVar10 = plVar5[2];
  if ((ulong)(*plVar5 - lVar10) < 2) {
    func_0x0079b61c(plVar5,lVar10,2,1,1);
    lVar10 = plVar5[2];
  }
  *(undefined2 *)(plVar5[1] + lVar10) = 0xffff;
  plVar5[2] = lVar10 + 2;
  uStack_58 = 0x1616161616161616;
  uStack_60 = 0x1616161616161616;
  uStack_48 = 0x1616161616161616;
  uStack_50 = 0x1616161616161616;
  if (*(long *)(lVar9 + 0x28) != 0) {
    lVar10 = *(long *)(lVar9 + 0x20);
    lVar9 = *(long *)(lVar9 + 0x28) << 3;
    do {
      func_0x001bbc94(lVar10,plVar5);
      lVar10 = lVar10 + 8;
      lVar9 = lVar9 + -8;
    } while (lVar9 != 0);
  }
  func_0x0024031c(&uStack_60);
  return;
}

