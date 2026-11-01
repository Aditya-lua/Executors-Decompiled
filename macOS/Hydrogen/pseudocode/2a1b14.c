
ulong FUN_002a1b14(void)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  uint uVar4;
  undefined4 uVar5;
  ulong uVar6;
  uint uVar7;
  long lVar8;
  long lVar9;
  ulong uVar10;
  uint uVar11;
  int iVar12;
  ulong uVar13;
  ulong uVar14;
  long unaff_x19;
  long *unaff_x20;
  long *unaff_x21;
  long *unaff_x22;
  long *unaff_x23;
  long *unaff_x24;
  undefined1 auVar15 [12];
  
  *(int *)(unaff_x23 + 1) = (int)unaff_x24[1];
  *(int *)(unaff_x23 + 2) = (int)unaff_x24[2];
  uVar4 = *(uint *)(unaff_x21 + 1);
  uVar6 = (ulong)uVar4;
  uVar7 = uVar4 & (int)uVar4 >> 0x1f;
  lVar8 = uVar6 * 8;
  do {
    lVar8 = lVar8 + -8;
    uVar11 = (uint)uVar6;
    uVar6 = (ulong)(uVar11 - 1);
    if ((int)uVar11 < 1) {
      if (-1 < (int)uVar4) {
        uVar7 = 0;
        goto joined_r0x002a1b64;
      }
      lVar9 = *unaff_x21;
      goto LAB_002a1b84;
    }
    lVar9 = *unaff_x21;
  } while (*(long *)(lVar9 + lVar8) == 0);
  uVar7 = uVar11;
LAB_002a1b84:
  uVar10 = *(ulong *)(lVar9 + (long)(int)(uVar7 - 1) * 8);
  uVar13 = uVar10 >> 0x20;
  uVar6 = uVar13;
  if (uVar13 == 0) {
    uVar6 = uVar10;
  }
  uVar14 = uVar6 >> 0x10;
  uVar1 = uVar14;
  if (uVar14 == 0) {
    uVar1 = uVar6;
  }
  uVar6 = uVar1 >> 8;
  if (uVar1 < 0x100) {
    uVar6 = uVar1;
  }
  uVar2 = uVar6 >> 4;
  if (uVar6 < 0x10) {
    uVar2 = uVar6;
  }
  uVar3 = uVar2 >> 2;
  if (uVar2 < 4) {
    uVar3 = uVar2;
  }
  uVar7 = (uint)(uVar10 != 0) | (uVar7 - 1) * 0x40 | (uint)(uVar13 != 0) << 5 |
          (uint)(uVar14 != 0) << 4 | (uint)(0xff < uVar1) << 3 | (uint)(0xf < uVar6) << 2 |
          (uint)(3 < uVar2) << 1;
  if (1 < uVar3) {
    uVar7 = uVar7 + 1;
  }
joined_r0x002a1b64:
  if (((int)uVar4 < 1) || ((*(byte *)*unaff_x21 & 1) == 0)) {
    uVar6 = func_0x0029c0b0();
    if ((int)uVar6 == 0) goto LAB_002a1da4;
  }
  else if (unaff_x22 != unaff_x24) {
    uVar6 = func_0x0029afb8();
    if ((int)uVar6 == 0) goto LAB_002a1da4;
    uVar5 = 0;
    if ((int)unaff_x24[1] != 0) {
      _memcpy(*unaff_x22,*unaff_x24,(long)(int)unaff_x24[1] << 3);
      uVar5 = (undefined4)unaff_x24[1];
    }
    *(undefined4 *)(unaff_x22 + 1) = uVar5;
    *(int *)(unaff_x22 + 2) = (int)unaff_x24[2];
  }
  if (1 < (int)uVar7) {
    uVar10 = 1;
    do {
      uVar6 = func_0x002ac168();
      if ((int)uVar6 == 0) goto LAB_002a1da4;
      uVar4 = *(uint *)(unaff_x23 + 1);
      uVar6 = (ulong)uVar4;
      lVar8 = uVar6 * 8;
      do {
        lVar8 = lVar8 + -8;
        iVar12 = (int)uVar6;
        uVar6 = (ulong)(iVar12 - 1);
        if (iVar12 < 1) {
          *(uint *)(unaff_x23 + 1) = uVar4 & (int)uVar4 >> 0x1f;
          if (-1 < (int)uVar4) {
            *(undefined4 *)(unaff_x23 + 2) = 0;
          }
          goto LAB_002a1ce0;
        }
      } while (*(long *)(*unaff_x23 + lVar8) == 0);
      *(int *)(unaff_x23 + 1) = iVar12;
LAB_002a1ce0:
      if ((uVar10 >> 6 < (ulong)(long)(int)unaff_x21[1]) &&
         ((*(ulong *)(*unaff_x21 + (uVar10 >> 6) * 8) >> (uVar10 & 0x3f) & 1) != 0)) {
        uVar6 = func_0x002ab9dc();
        if ((int)uVar6 == 0) goto LAB_002a1da4;
        uVar4 = *(uint *)(unaff_x22 + 1);
        uVar6 = (ulong)uVar4;
        lVar8 = uVar6 * 8;
        do {
          lVar8 = lVar8 + -8;
          iVar12 = (int)uVar6;
          uVar6 = (ulong)(iVar12 - 1);
          if (iVar12 < 1) {
            *(uint *)(unaff_x22 + 1) = uVar4 & (int)uVar4 >> 0x1f;
            if (-1 < (int)uVar4) {
              *(undefined4 *)(unaff_x22 + 2) = 0;
            }
            goto LAB_002a1c7c;
          }
        } while (*(long *)(*unaff_x22 + lVar8) == 0);
        *(int *)(unaff_x22 + 1) = iVar12;
      }
LAB_002a1c7c:
      uVar10 = uVar10 + 1;
    } while (uVar10 != uVar7);
  }
  if (unaff_x22 != unaff_x20) {
    uVar6 = func_0x0029afb8();
    if ((int)uVar6 == 0) goto LAB_002a1da4;
    uVar5 = 0;
    if ((int)unaff_x22[1] != 0) {
      _memcpy(*unaff_x20,*unaff_x22,(long)(int)unaff_x22[1] << 3);
      uVar5 = (undefined4)unaff_x22[1];
    }
    *(undefined4 *)(unaff_x20 + 1) = uVar5;
    *(int *)(unaff_x20 + 2) = (int)unaff_x22[2];
  }
  uVar6 = 1;
LAB_002a1da4:
  if (*(char *)(unaff_x19 + 0x28) != '\0') {
    return uVar6;
  }
  if (*(long *)(unaff_x19 + 0x10) != 0) {
    lVar8 = *(long *)(unaff_x19 + 0x10) + -1;
    *(long *)(unaff_x19 + 0x10) = lVar8;
    *(undefined8 *)(unaff_x19 + 0x20) = *(undefined8 *)(*(long *)(unaff_x19 + 8) + lVar8 * 8);
    return uVar6;
  }
  auVar15 = func_0x0079db4c(uVar6);
  uVar7 = auVar15._8_4_;
  if (-1 < (int)uVar7) {
    if ((ulong)(uVar7 >> 6) < (ulong)(long)(int)auVar15._0_8_[1]) {
      return (ulong)((uint)(*(ulong *)(*auVar15._0_8_ + (ulong)(uVar7 >> 6) * 8) >>
                           ((ulong)uVar7 & 0x3f)) & 1);
    }
  }
  return 0;
}

