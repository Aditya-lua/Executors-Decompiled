
void FUN_001bd028(void)

{
  ulong uVar1;
  long lVar2;
  ushort uVar3;
  long *plVar4;
  ulong uVar5;
  ulong extraout_x1;
  ulong extraout_x1_00;
  long *plVar6;
  ulong *extraout_x8;
  ulong extraout_x8_00;
  ulong uVar7;
  ulong extraout_x8_01;
  long lVar8;
  long lVar9;
  uint uVar10;
  ulong unaff_x21;
  long lVar11;
  undefined1 auVar12 [16];
  char cStack_68;
  undefined1 uStack_67;
  undefined4 uStack_66;
  undefined8 uStack_62;
  undefined8 uStack_5a;
  undefined2 uStack_52;
  
  func_0x0024031c();
  __Unwind_Resume();
  plVar4 = (long *)func_0x007a2668();
  func_0x001f10d8(&cStack_68);
  if (cStack_68 != '\x15') {
    *(undefined8 *)((long)extraout_x8 + 0x16) = uStack_5a;
    *(undefined8 *)((long)extraout_x8 + 0xe) = uStack_62;
    *(undefined2 *)((long)extraout_x8 + 0x1e) = uStack_52;
    *(char *)(extraout_x8 + 1) = cStack_68;
    *(undefined1 *)((long)extraout_x8 + 9) = uStack_67;
    *(undefined4 *)((long)extraout_x8 + 10) = uStack_66;
LAB_001bd0c4:
    *extraout_x8 = 0x8000000000000001;
    return;
  }
  uVar5 = plVar4[1];
  uVar7 = plVar4[2];
  if (uVar5 - uVar7 < 2) {
    extraout_x8[2] = (ulong)&UNK_008298da;
    extraout_x8[3] = 3;
    *(undefined1 *)(extraout_x8 + 1) = 0xc;
    goto LAB_001bd0c4;
  }
  uVar1 = uVar7 + 2;
  plVar4[2] = uVar1;
  if (uVar7 < 0xfffffffffffffffe) {
    if (uVar5 < uVar1) goto code_r0x001bd1ac;
    lVar11 = *plVar4;
    uVar3 = *(ushort *)(lVar11 + uVar7);
    unaff_x21 = (ulong)((uint)(uVar3 >> 8) | (uVar3 & 0xff00ff) << 8);
    if (uVar5 - uVar1 < unaff_x21) {
      extraout_x8[2] = unaff_x21;
      extraout_x8[3] = 0;
      *extraout_x8 = 0x8000000000000001;
      extraout_x8[1] = 0xb;
      return;
    }
    uVar7 = uVar1 + unaff_x21;
    plVar4[2] = uVar7;
    if (CARRY8(uVar1,unaff_x21)) goto code_r0x001bd1bc;
    if (uVar7 <= uVar5) {
      if (uVar3 == 0) {
        uVar5 = 1;
code_r0x001bd178:
        _memcpy(uVar5,lVar11 + uVar1,unaff_x21);
        *extraout_x8 = unaff_x21;
        extraout_x8[1] = uVar5;
        extraout_x8[2] = unaff_x21;
        *(undefined2 *)(extraout_x8 + 3) = (undefined2)uStack_66;
        *(undefined2 *)((long)extraout_x8 + 0x1a) = uStack_66._2_2_;
        return;
      }
      uVar5 = func_0x00187bd0(unaff_x21,1);
      if (uVar5 != 0) goto code_r0x001bd178;
      goto code_r0x001bd1e0;
    }
  }
  else {
    func_0x007a28bc(uVar7,uVar1,&UNK_009c9a78);
    uVar5 = extraout_x1;
code_r0x001bd1ac:
    func_0x007a28b0(uVar1,uVar5,&UNK_009c9a78);
    uVar7 = extraout_x8_00;
code_r0x001bd1bc:
    func_0x007a28bc(uVar1,uVar7,&UNK_009c9a78);
    uVar5 = extraout_x1_00;
    uVar7 = extraout_x8_01;
  }
  func_0x007a28b0(uVar7,uVar5,&UNK_009c9a78);
code_r0x001bd1e0:
  auVar12 = func_0x007a1f00(1,unaff_x21,&UNK_009c6fd0);
  plVar6 = auVar12._8_8_;
  plVar4 = auVar12._0_8_;
  lVar11 = plVar6[2];
  if (*plVar4 == -0x8000000000000000) {
    if (lVar11 == *plVar6) {
      func_0x00458a18(plVar6,&UNK_009c9a90);
    }
    *(undefined1 *)(plVar6[1] + lVar11) = 1;
    lVar11 = lVar11 + 1;
  }
  else {
    if (lVar11 == *plVar6) {
      func_0x00458a18(plVar6,&UNK_009c9a90);
    }
    *(undefined1 *)(plVar6[1] + lVar11) = 0;
    lVar11 = lVar11 + 1;
    plVar6[2] = lVar11;
    uVar3 = *(ushort *)(plVar4 + 6);
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
      uVar10 = (uint)*(ushort *)((long)plVar4 + 0x32);
    }
    if ((ulong)(*plVar6 - lVar11) < 2) {
      func_0x0079b61c(plVar6,lVar11,2,1,1);
      lVar11 = plVar6[2];
    }
    *(ushort *)(plVar6[1] + lVar11) = (ushort)(uVar10 >> 8) | (ushort)((uVar10 & 0xff00ff) << 8);
    lVar11 = lVar11 + 2;
    plVar6[2] = lVar11;
    uVar3 = *(ushort *)((long)plVar4 + 0x34);
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
    else if (uVar3 == 3) {
      uVar10 = 0xffff;
    }
    else {
      uVar10 = (uint)*(ushort *)((long)plVar4 + 0x36);
    }
    if ((ulong)(*plVar6 - lVar11) < 2) {
      func_0x0079b61c(plVar6,lVar11,2,1,1);
      lVar11 = plVar6[2];
    }
    *(ushort *)(plVar6[1] + lVar11) = (ushort)(uVar10 >> 8) | (ushort)((uVar10 & 0xff00ff) << 8);
    lVar2 = lVar11 + 2;
    plVar6[2] = lVar2;
    lVar8 = plVar4[7];
    if (lVar2 == *plVar6) {
      func_0x00458a18(plVar6,&UNK_009c9a90);
    }
    *(char *)(plVar6[1] + lVar2) = (char)lVar8;
    lVar11 = lVar11 + 3;
    plVar6[2] = lVar11;
    lVar2 = plVar4[1];
    uVar5 = plVar4[2];
    lVar8 = *plVar6;
    if ((ulong)(lVar8 - lVar11) < 2) {
      func_0x0079b61c(plVar6,lVar11,2,1,1);
      lVar11 = plVar6[2];
      lVar8 = *plVar6;
    }
    lVar9 = plVar6[1];
    *(ushort *)(lVar9 + lVar11) =
         (ushort)(uVar5 >> 8) & 0xff | (ushort)(((uint)uVar5 & 0xff00ff) << 8);
    lVar11 = lVar11 + 2;
    plVar6[2] = lVar11;
    if ((ulong)(lVar8 - lVar11) < uVar5) {
      func_0x0079b61c(plVar6,lVar11,uVar5,1,1);
      lVar9 = plVar6[1];
      lVar11 = plVar6[2];
    }
    _memcpy(lVar9 + lVar11,lVar2,uVar5);
    lVar8 = *plVar6;
    lVar11 = lVar11 + uVar5;
    plVar6[2] = lVar11;
    lVar2 = plVar4[4];
    uVar5 = plVar4[5];
    if ((ulong)(lVar8 - lVar11) < 2) {
      func_0x0079b61c(plVar6,lVar11,2,1,1);
      lVar11 = plVar6[2];
      lVar8 = *plVar6;
    }
    lVar9 = plVar6[1];
    *(ushort *)(lVar9 + lVar11) =
         (ushort)(uVar5 >> 8) & 0xff | (ushort)(((uint)uVar5 & 0xff00ff) << 8);
    lVar11 = lVar11 + 2;
    plVar6[2] = lVar11;
    if ((ulong)(lVar8 - lVar11) < uVar5) {
      func_0x0079b61c(plVar6,lVar11,uVar5,1,1);
      lVar9 = plVar6[1];
      lVar11 = plVar6[2];
    }
    _memcpy(lVar9 + lVar11,lVar2,uVar5);
    lVar11 = lVar11 + uVar5;
  }
  plVar6[2] = lVar11;
  return;
}

