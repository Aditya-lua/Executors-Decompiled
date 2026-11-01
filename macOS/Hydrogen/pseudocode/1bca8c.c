
void FUN_001bca8c(void)

{
  ulong uVar1;
  undefined8 uVar2;
  long *plVar3;
  long *plVar4;
  long lVar5;
  long lVar6;
  long lVar7;
  long lVar8;
  ushort uVar9;
  undefined1 auVar10 [16];
  undefined1 uStack0000000000000068;
  undefined1 auStack_70 [32];
  long *plStack_50;
  long lStack_48;
  
  uVar2 = __Unwind_Resume();
  func_0x001acddc(&uStack0000000000000068);
  auVar10 = __Unwind_Resume(uVar2);
  plVar4 = auVar10._8_8_;
  plVar3 = auVar10._0_8_;
  if (*plVar3 == -0x8000000000000000) {
    lVar7 = plVar3[4];
    uVar9 = *(ushort *)((long)plVar3 + 0x22);
    lVar5 = plVar4[2];
    lVar6 = *plVar4;
    if ((ulong)(lVar6 - lVar5) < 2) {
      func_0x0079b61c(plVar4,lVar5,2,1,1);
      lVar5 = plVar4[2];
      lVar6 = *plVar4;
    }
    uVar9 = uVar9 >> 8 | uVar9 << 8;
    if ((short)lVar7 == 0) {
      uVar9 = 0xdfe;
    }
    lVar8 = plVar4[1];
    *(ushort *)(lVar8 + lVar5) = uVar9;
    lVar5 = lVar5 + 2;
    plVar4[2] = lVar5;
    lVar7 = plVar3[2];
    uVar1 = plVar3[3];
    if ((ulong)(lVar6 - lVar5) < 2) {
      func_0x0079b61c(plVar4,lVar5,2,1,1);
      lVar8 = plVar4[1];
      lVar5 = plVar4[2];
      lVar6 = *plVar4;
    }
    *(ushort *)(lVar8 + lVar5) =
         (ushort)(uVar1 >> 8) & 0xff | (ushort)(((uint)uVar1 & 0xff00ff) << 8);
    lVar5 = lVar5 + 2;
    plVar4[2] = lVar5;
    if ((ulong)(lVar6 - lVar5) < uVar1) {
      func_0x0079b61c(plVar4,lVar5,uVar1,1,1);
      lVar8 = plVar4[1];
      lVar5 = plVar4[2];
    }
    _memcpy(lVar8 + lVar5,lVar7,uVar1);
    plVar4[2] = lVar5 + uVar1;
  }
  else {
    lVar5 = plVar4[2];
    lVar7 = *plVar4;
    if ((ulong)(lVar7 - lVar5) < 2) {
      func_0x0079b61c(plVar4,lVar5,2,1,1);
      lVar5 = plVar4[2];
      lVar7 = *plVar4;
    }
    lVar6 = plVar4[1];
    *(undefined2 *)(lVar6 + lVar5) = 0xdfe;
    lVar5 = lVar5 + 2;
    plVar4[2] = lVar5;
    lVar8 = lVar5;
    if ((ulong)(lVar7 - lVar5) < 2) {
      func_0x0079b61c(plVar4,lVar5,2,1,1);
      lVar6 = plVar4[1];
      lVar8 = plVar4[2];
    }
    *(undefined2 *)(lVar6 + lVar8) = 0xffff;
    plVar4[2] = lVar8 + 2;
    auStack_70[0] = 0x16;
    plStack_50 = plVar4;
    lStack_48 = lVar5;
    func_0x001bc4a4(plVar3);
    func_0x0024031c(auStack_70);
  }
  return;
}

