
void FUN_001b71bc(void)

{
  long lVar1;
  ulong uVar2;
  byte bVar3;
  long *plVar4;
  long *plVar5;
  undefined1 uVar6;
  long lVar7;
  long lVar8;
  long lVar9;
  undefined1 auVar10 [16];
  
  func_0x00187bd4();
  auVar10 = __Unwind_Resume();
  plVar5 = auVar10._8_8_;
  plVar4 = auVar10._0_8_;
  if (*plVar4 != -0x8000000000000000) {
    lVar1 = plVar4[1];
    uVar2 = plVar4[2];
    lVar7 = plVar5[2];
    lVar8 = *plVar5;
    if ((ulong)(lVar8 - lVar7) < 2) {
      func_0x0079b61c(plVar5,lVar7,2,1,1);
      lVar7 = plVar5[2];
      lVar8 = *plVar5;
    }
    lVar9 = plVar5[1];
    *(ushort *)(lVar9 + lVar7) =
         (ushort)(uVar2 >> 8) & 0xff | (ushort)(((uint)uVar2 & 0xff00ff) << 8);
    lVar7 = lVar7 + 2;
    plVar5[2] = lVar7;
    if ((ulong)(lVar8 - lVar7) < uVar2) {
      func_0x0079b61c(plVar5,lVar7,uVar2,1,1);
      lVar9 = plVar5[1];
      lVar7 = plVar5[2];
      lVar8 = *plVar5;
    }
    _memcpy(lVar9 + lVar7,lVar1,uVar2);
    lVar7 = lVar7 + uVar2;
    plVar5[2] = lVar7;
    lVar1 = plVar4[4];
    uVar2 = plVar4[5];
    if ((ulong)(lVar8 - lVar7) < 2) {
      func_0x0079b61c(plVar5,lVar7,2,1,1);
      lVar9 = plVar5[1];
      lVar7 = plVar5[2];
      lVar8 = *plVar5;
    }
    *(ushort *)(lVar9 + lVar7) =
         (ushort)(uVar2 >> 8) & 0xff | (ushort)(((uint)uVar2 & 0xff00ff) << 8);
    lVar7 = lVar7 + 2;
    plVar5[2] = lVar7;
    if ((ulong)(lVar8 - lVar7) < uVar2) {
      func_0x0079b61c(plVar5,lVar7,uVar2,1,1);
      lVar9 = plVar5[1];
      lVar7 = plVar5[2];
    }
    _memcpy(lVar9 + lVar7,lVar1,uVar2);
    lVar8 = *plVar5;
    lVar7 = lVar7 + uVar2;
    plVar5[2] = lVar7;
    lVar1 = plVar4[7];
    uVar2 = plVar4[8];
    if ((ulong)(lVar8 - lVar7) < 2) {
      func_0x0079b61c(plVar5,lVar7,2,1,1);
      lVar7 = plVar5[2];
      lVar8 = *plVar5;
    }
    lVar9 = plVar5[1];
    *(ushort *)(lVar9 + lVar7) =
         (ushort)(uVar2 >> 8) & 0xff | (ushort)(((uint)uVar2 & 0xff00ff) << 8);
    lVar7 = lVar7 + 2;
    plVar5[2] = lVar7;
    if ((ulong)(lVar8 - lVar7) < uVar2) {
      func_0x0079b61c(plVar5,lVar7,uVar2,1,1);
      lVar9 = plVar5[1];
      lVar7 = plVar5[2];
    }
    _memcpy(lVar9 + lVar7,lVar1,uVar2);
    plVar5[2] = lVar7 + uVar2;
    return;
  }
  bVar3 = *(byte *)((long)plVar4 + 0x24);
  if (bVar3 < 2) {
    if (bVar3 == 0) {
      uVar6 = 1;
      lVar7 = plVar5[2];
      if (lVar7 != *plVar5) goto LAB_001b7358;
    }
    else {
      uVar6 = 2;
      lVar7 = plVar5[2];
      if (lVar7 != *plVar5) goto LAB_001b7358;
    }
  }
  else if (bVar3 == 2) {
    uVar6 = 3;
    lVar7 = plVar5[2];
    if (lVar7 != *plVar5) goto LAB_001b7358;
  }
  else {
    uVar6 = *(undefined1 *)((long)plVar4 + 0x25);
    lVar7 = plVar5[2];
    if (lVar7 != *plVar5) goto LAB_001b7358;
  }
  func_0x00458a18(plVar5,&UNK_009c9a90);
LAB_001b7358:
  *(undefined1 *)(plVar5[1] + lVar7) = uVar6;
  plVar5[2] = lVar7 + 1;
                    /* WARNING: Could not recover jumptable at 0x001b7384. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)(&UNK_001b7388 + (ulong)(byte)(&UNK_0081dadf)[*(ushort *)(plVar4 + 4)] * 4))();
  return;
}

