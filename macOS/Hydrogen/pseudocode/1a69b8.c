
void FUN_001a69b8(void)

{
  ulong uVar1;
  ulong uVar2;
  long *plVar3;
  long lVar4;
  long lVar5;
  long lVar6;
  long lVar7;
  ulong *puVar8;
  undefined1 auVar9 [16];
  undefined8 uStack_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  long *plStack_50;
  long lStack_48;
  
  __Unwind_Resume();
  auVar9 = func_0x007a2668();
  plVar3 = auVar9._8_8_;
  lStack_48 = plVar3[2];
  lVar4 = lStack_48;
  if ((ulong)(*plVar3 - lStack_48) < 2) {
    func_0x0079b61c(plVar3,lStack_48,2,1,1);
    lVar4 = plVar3[2];
  }
  *(undefined2 *)(plVar3[1] + lVar4) = 0xffff;
  lVar4 = lVar4 + 2;
  plVar3[2] = lVar4;
  uStack_68 = 0x1616161616161616;
  uStack_70 = 0x1616161616161616;
  uStack_58 = 0x1616161616161616;
  uStack_60 = 0x1616161616161616;
  lVar5 = *(long *)(auVar9._0_8_ + 0x10);
  plStack_50 = plVar3;
  if (lVar5 != 0) {
    puVar8 = (ulong *)(*(long *)(auVar9._0_8_ + 8) + 0x10);
    lVar5 = lVar5 * 0x18;
    do {
      uVar1 = puVar8[-1];
      uVar2 = *puVar8;
      lVar6 = *plVar3;
      if ((ulong)(lVar6 - lVar4) < 2) {
        func_0x0079b61c(plVar3,lVar4,2,1,1);
        lVar4 = plVar3[2];
        lVar6 = *plVar3;
      }
      lVar7 = plVar3[1];
      *(ushort *)(lVar7 + lVar4) =
           (ushort)(uVar2 >> 8) & 0xff | (ushort)(((uint)uVar2 & 0xff00ff) << 8);
      lVar4 = lVar4 + 2;
      plVar3[2] = lVar4;
      if ((ulong)(lVar6 - lVar4) < uVar2) {
        func_0x0079b61c(plVar3,lVar4,uVar2,1,1);
        lVar7 = plVar3[1];
        lVar4 = plVar3[2];
      }
      puVar8 = puVar8 + 3;
      _memcpy(lVar7 + lVar4,uVar1,uVar2);
      lVar4 = lVar4 + uVar2;
      plVar3[2] = lVar4;
      lVar5 = lVar5 + -0x18;
    } while (lVar5 != 0);
  }
  func_0x0024031c(&uStack_70);
  return;
}

