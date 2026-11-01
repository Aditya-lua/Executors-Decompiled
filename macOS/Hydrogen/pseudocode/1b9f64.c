
void FUN_001b9f64(void)

{
  undefined8 uVar1;
  ulong uVar2;
  ushort uVar3;
  uint uVar4;
  long lVar5;
  long *plVar6;
  long lVar7;
  long lVar8;
  long lVar9;
  uint uVar10;
  undefined1 auVar11 [16];
  
  auVar11 = func_0x007a1f00();
  plVar6 = auVar11._8_8_;
  lVar5 = auVar11._0_8_;
  uVar3 = *(ushort *)(lVar5 + 0x18);
  if (uVar3 < 2) {
    if (uVar3 == 0) {
      uVar10 = 1;
    }
    else {
      uVar10 = 2;
    }
  }
  else if (uVar3 == 2) {
    uVar10 = 3;
  }
  else {
    uVar10 = (uint)*(ushort *)(lVar5 + 0x1a);
  }
  lVar7 = plVar6[2];
  lVar8 = *plVar6;
  if ((ulong)(lVar8 - lVar7) < 2) {
    func_0x0079b61c(plVar6,lVar7,2,1,1);
    lVar7 = plVar6[2];
    lVar8 = *plVar6;
  }
  lVar9 = plVar6[1];
  *(ushort *)(lVar9 + lVar7) = (ushort)(uVar10 >> 8) | (ushort)((uVar10 & 0xff00ff) << 8);
  lVar7 = lVar7 + 2;
  plVar6[2] = lVar7;
  uVar10 = *(uint *)(lVar5 + 0x1c);
  if ((ulong)(lVar8 - lVar7) < 3) {
    func_0x0079b61c(plVar6,lVar7,3,1,1);
    lVar9 = plVar6[1];
    lVar7 = plVar6[2];
    lVar8 = *plVar6;
  }
  uVar4 = uVar10 & 0xff00ff;
  *(char *)((ushort *)(lVar9 + lVar7) + 1) = (char)uVar4;
  *(ushort *)(lVar9 + lVar7) =
       (ushort)(byte)(uVar4 >> 0x10) | (ushort)((((uVar10 & 0xff00ff00) >> 8) << 0x10) >> 8);
  lVar7 = lVar7 + 3;
  plVar6[2] = lVar7;
  uVar1 = *(undefined8 *)(lVar5 + 8);
  uVar2 = *(ulong *)(lVar5 + 0x10);
  if ((ulong)(lVar8 - lVar7) < 3) {
    func_0x0079b61c(plVar6,lVar7,3,1,1);
    lVar9 = plVar6[1];
    lVar7 = plVar6[2];
    lVar8 = *plVar6;
  }
  uVar10 = (uint)uVar2 & 0xff00ff;
  *(char *)((ushort *)(lVar9 + lVar7) + 1) = (char)uVar10;
  *(ushort *)(lVar9 + lVar7) =
       (ushort)(byte)(uVar10 >> 0x10) | (ushort)(((((uint)uVar2 & 0xff00ff00) >> 8) << 0x10) >> 8);
  lVar7 = lVar7 + 3;
  plVar6[2] = lVar7;
  if ((ulong)(lVar8 - lVar7) < uVar2) {
    func_0x0079b61c(plVar6,lVar7,uVar2,1,1);
    lVar9 = plVar6[1];
    lVar7 = plVar6[2];
  }
  _memcpy(lVar9 + lVar7,uVar1,uVar2);
  plVar6[2] = lVar7 + uVar2;
  return;
}

