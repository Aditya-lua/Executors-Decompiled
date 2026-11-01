
undefined8 FUN_0066bf80(long param_1)

{
  int iVar1;
  ulong uVar2;
  bool in_ZR;
  long lVar3;
  long *plVar4;
  long lVar5;
  ulong uVar6;
  long in_x9;
  long in_x10;
  long *unaff_x19;
  int unaff_w20;
  long unaff_x21;
  long lVar7;
  long lVar8;
  long unaff_x23;
  ulong uVar9;
  long unaff_x24;
  long lStack0000000000000018;
  
  if (in_ZR) {
    in_x10 = in_x9;
  }
  (**(code **)(param_1 + in_x10))();
  lVar7 = unaff_x21 + unaff_x23;
  uVar6 = unaff_x19[0x10];
  uVar2 = (unaff_x24 - unaff_x23) - uVar6;
  if ((lVar7 != 0) && (uVar2 != 0)) {
    lVar5 = unaff_x19[0xd] + unaff_x19[0xc];
    lVar3 = 0;
    if ((ulong)(lVar5 - unaff_x19[0x11]) <= uVar6) {
      lVar3 = unaff_x19[0xc];
    }
    lVar3 = unaff_x19[0x11] + (uVar6 - lVar3);
    uVar9 = lVar5 - lVar3;
    uVar6 = uVar9;
    if (uVar2 <= uVar9) {
      uVar6 = uVar2;
    }
    _memcpy(lVar3,lVar7,uVar6);
    if (uVar9 <= uVar2 && uVar2 - uVar9 != 0) {
      _memcpy(unaff_x19[0xd],lVar7 + uVar9,uVar2 - uVar9);
    }
    unaff_x19[0x10] = unaff_x19[0x10] + uVar2;
  }
  if (unaff_w20 == 0) {
    return 0;
  }
  if (((char)unaff_x19[9] == '\0') && (unaff_x19[6] == 0)) {
    (**(code **)(*unaff_x19 + 0x1c8))();
    lVar7 = unaff_x19[0x10];
  }
  else {
    lVar7 = unaff_x19[0x10];
  }
  if (lVar7 == 0) {
    lStack0000000000000018 = 0;
  }
  else {
    lStack0000000000000018 = func_0x006115d0(lVar7);
    if (lStack0000000000000018 != 0) {
      uVar6 = unaff_x19[0x10];
      lVar3 = unaff_x19[0x11];
      lVar5 = unaff_x19[0xd] + unaff_x19[0xc];
      uVar9 = lVar5 - lVar3;
      uVar2 = uVar6;
      if (uVar9 <= uVar6) {
        uVar2 = uVar9;
      }
      if ((ulong)(unaff_x19[0xe] * unaff_x19[0xf]) <= uVar2) {
        uVar2 = unaff_x19[0xe] * unaff_x19[0xf];
      }
      unaff_x19[0x10] = uVar6 - uVar2;
      unaff_x19[0x11] = lVar3 + uVar2;
      if (uVar6 - uVar2 == 0 || lVar3 + uVar2 == lVar5) {
        unaff_x19[0x11] = unaff_x19[0xd];
      }
      _memcpy(lStack0000000000000018,lVar3,uVar2);
      _memcpy(lStack0000000000000018 + uVar2,unaff_x19[0x11],unaff_x19[0x10]);
      unaff_x19[0x10] = 0;
    }
  }
  (**(code **)(*unaff_x19 + 0x1e8))();
  *(undefined1 *)(unaff_x19 + 9) = 0;
  lVar8 = unaff_x19[6];
  lVar5 = unaff_x19[0xc];
  lVar3 = unaff_x19[0xd];
  if (lVar5 != lVar8) {
    if (lVar3 != 0) {
      if (lVar5 != 0) {
        do {
          *(undefined1 *)(lVar3 + -1 + lVar5) = 0;
          lVar5 = lVar5 + -1;
        } while (lVar5 != 0);
      }
      func_0x00611644();
    }
    if (lVar8 == 0) {
      lVar3 = 0;
    }
    else {
      lVar3 = func_0x006115d0(lVar8);
    }
  }
  unaff_x19[0xb] = -1;
  unaff_x19[0xc] = lVar8;
  unaff_x19[0xd] = lVar3;
  unaff_x19[0xe] = 1;
  unaff_x19[0xf] = lVar8;
  unaff_x19[0x10] = 0;
  unaff_x19[0x11] = lVar3;
  plVar4 = (long *)(**(code **)(*unaff_x19 + 0x160))();
  iVar1 = 0;
  if (unaff_w20 != 0) {
    iVar1 = unaff_w20 + -1;
  }
  lVar5 = (**(code **)(*plVar4 + 0x130))(plVar4,&UNK_008ba5c8,0,0,iVar1,1);
  *(uint *)(unaff_x19 + 5) = (uint)(lVar5 != 0);
  if (lStack0000000000000018 != 0) {
    if (lVar7 != 0) {
      do {
        *(undefined1 *)(lStack0000000000000018 + -1 + lVar7) = 0;
        lVar7 = lVar7 + -1;
      } while (lVar7 != 0);
    }
    func_0x00611644();
  }
  return 0;
}

