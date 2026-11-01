
ulong FUN_00283790(undefined8 param_1,long param_2,long param_3)

{
  uint uVar1;
  int iVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  undefined8 uVar6;
  long lVar7;
  undefined8 uVar8;
  int in_w8;
  uint uVar9;
  ulong uVar10;
  ulong uVar11;
  long *unaff_x20;
  long lVar12;
  ulong uVar13;
  long *plVar14;
  long lVar15;
  undefined1 auVar16 [16];
  
  if ((in_w8 == 0) || (param_3 + (ulong)*(byte *)(unaff_x20 + 4) <= *(ulong *)(param_2 + 8))) {
    func_0x00283a8c();
    lVar3 = func_0x00283ac4();
    if (lVar3 == 0) {
      return 1;
    }
    uVar11 = 0;
    do {
      iVar2 = func_0x00284390();
      if (iVar2 == 0) {
        func_0x0028f83c(0xe,0,0x42,"/aws-lc/crypto/bytestring/cbb.c",0x2ae);
        return 0;
      }
      uVar11 = uVar11 + 1;
      lVar3 = func_0x00283ac4();
    } while (lVar3 != 0);
    if (uVar11 < 2) {
      return 1;
    }
    if (*unaff_x20 != 0) goto LAB_002839a8;
    lVar3 = unaff_x20[3];
    if ((char)unaff_x20[1] != '\0') {
      uVar10 = ((long *)unaff_x20[2])[1];
      uVar13 = lVar3 + (ulong)*(byte *)(unaff_x20 + 4);
      lVar3 = uVar10 - uVar13;
      if (uVar13 <= uVar10) {
        lVar4 = *(long *)unaff_x20[2] + uVar13;
        goto LAB_00283868;
      }
      goto LAB_002839ac;
    }
    lVar4 = unaff_x20[2];
LAB_00283868:
    lVar4 = func_0x0036effc(lVar4,lVar3);
    lVar5 = func_0x0036e358(uVar11,0x10);
    uVar13 = 0;
    if ((lVar4 == 0) || (lVar5 == 0)) {
LAB_00283970:
      func_0x0036e3d8(lVar4);
      func_0x0036e3d8(lVar5);
      return uVar13;
    }
    func_0x00283a8c();
    uVar13 = uVar11;
    do {
      iVar2 = func_0x00284390();
      if (iVar2 == 0) {
        uVar13 = 0;
        goto LAB_00283970;
      }
      uVar13 = uVar13 - 1;
    } while (uVar13 != 0);
    _qsort(lVar5,uVar11,0x10,0x2839b8);
    if (*unaff_x20 == 0) {
      plVar14 = (long *)unaff_x20[2];
      if ((char)unaff_x20[1] != '\0') {
        plVar14 = (long *)(*plVar14 + unaff_x20[3] + (ulong)*(byte *)(unaff_x20 + 4));
      }
      lVar15 = 0;
      lVar12 = lVar5;
      do {
        uVar6 = func_0x00283abc(lVar12);
        lVar7 = func_0x00283ac4(lVar12);
        if (lVar7 != 0) {
          _memcpy((long)plVar14 + lVar15,uVar6,lVar7);
        }
        lVar7 = func_0x00283ac4(lVar12);
        lVar15 = lVar7 + lVar15;
        lVar12 = lVar12 + 0x10;
        uVar11 = uVar11 - 1;
      } while (uVar11 != 0);
      if (lVar15 == lVar3) {
        uVar13 = 1;
        goto LAB_00283970;
      }
      goto LAB_002839b4;
    }
  }
  else {
    func_0x0079d2c0(param_1,param_2,
                    *(ulong *)(param_2 + 8) - (param_3 + (ulong)*(byte *)(unaff_x20 + 4)));
LAB_002839a8:
    func_0x0079d2e4();
LAB_002839ac:
    func_0x0079d2c0();
  }
  func_0x0079d29c();
LAB_002839b4:
  auVar16 = func_0x0079d384();
  uVar13 = func_0x00283ac4();
  uVar10 = func_0x00283ac4(auVar16._8_8_);
  uVar11 = uVar13;
  if (uVar10 <= uVar13) {
    uVar11 = uVar10;
  }
  uVar6 = func_0x00283abc(auVar16._0_8_);
  uVar8 = func_0x00283abc(auVar16._8_8_);
  if (uVar11 == 0) {
    uVar9 = 1;
    if (uVar13 < uVar10) {
      uVar9 = 0xffffffff;
    }
    uVar1 = 0;
    if (uVar13 != uVar10) {
      uVar1 = uVar9;
    }
    return (ulong)uVar1;
  }
  uVar11 = _memcmp(uVar6,uVar8,uVar11);
  uVar9 = 1;
  if (uVar13 < uVar10) {
    uVar9 = 0xffffffff;
  }
  uVar1 = 0;
  if (uVar13 != uVar10) {
    uVar1 = uVar9;
  }
  if ((int)uVar11 == 0) {
    return (ulong)uVar1;
  }
  return uVar11;
}

