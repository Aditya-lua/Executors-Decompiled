/* 7ff70c8782e0 FUN_7ff70c8782e0 */

/* WARNING: Type propagation algorithm not settling */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

ulonglong FUN_7ff70c8782e0(undefined8 *param_1,int param_2,byte *param_3,undefined1 *param_4,
                          uint param_5)

{
  bool bVar1;
  code *pcVar2;
  uint uVar3;
  longlong lVar4;
  char cVar5;
  byte bVar6;
  int iVar7;
  longlong lVar8;
  longlong lVar9;
  longlong lVar10;
  ulonglong uVar11;
  undefined1 uVar12;
  uint uVar13;
  undefined8 uVar14;
  uint uVar15;
  uint uVar16;
  ulonglong uVar17;
  uint *puVar18;
  uint uVar19;
  int iVar20;
  ulonglong uVar21;
  bool bVar22;
  undefined1 auVar23 [16];
  undefined1 auStack_a8 [47];
  byte bStack_79;
  int iStack_78;
  uint uStack_74;
  longlong lStack_70;
  byte *pbStack_68;
  uint uStack_5c;
  undefined8 *puStack_58;
  undefined1 *puStack_50;
  ulonglong uStack_48;
  
  lVar4 = _DAT_7ff70cc1a3c0;
  uStack_48 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_a8;
  *(undefined1 *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440) + 0xce) = 1;
  lStack_70 = *(longlong *)(lVar4 + 0x1440);
  lVar8 = *(longlong *)(lVar4 + 0x1448);
  puVar18 = (uint *)(lVar4 + 0x1de0);
  if (*(int *)(lVar4 + 0x1e20) == param_2) {
    puVar18 = (uint *)(lVar4 + 0x1e24);
  }
  uStack_74 = *puVar18;
  uVar3 = param_5 | 0x440000;
  if ((uStack_74 & 0x20000) == 0) {
    uVar3 = param_5;
  }
  bVar22 = false;
  uVar15 = (uint)((uStack_74 & 8) == 0) * 0x10 + 0x10;
  if ((uVar3 & 0x3f0) != 0) {
    uVar15 = 0;
  }
  if (((uVar3 & 0x800) != 0) && (lVar8 != 0)) {
    if (*(longlong *)(lVar8 + 0x3c0) == *(longlong *)(lStack_70 + 0x3c0)) {
      *(longlong *)(lVar4 + 0x1448) = lStack_70;
      bVar22 = true;
    }
    else {
      bVar22 = false;
    }
  }
  pbStack_68 = param_3;
  puStack_58 = param_1;
  puStack_50 = param_4;
  bStack_79 = FUN_7ff70c8187a0(param_1,param_2,param_5 * 4 & 0x4000 | uStack_74);
  if ((((uVar3 & 0x200) == 0) || (*(char *)(lVar4 + 0x21b0) == '\0')) ||
     ((*(byte *)(lVar4 + 0x21b4) & 4) != 0)) {
LAB_7ff70c87846f:
    uVar11 = 0;
  }
  else {
    cVar5 = FUN_7ff70c8183c0();
    if (cVar5 == '\0') {
      uVar11 = 0;
    }
    else {
      FUN_7ff70c818160();
      bStack_79 = 1;
      if ((*(float *)(lVar4 + 0x14a8) < _DAT_7ff70cb1d7c4) ||
         (_DAT_7ff70cb1d7c4 < *(float *)(lVar4 + 0x14a8) - *(float *)(lVar4 + 0x20)))
      goto LAB_7ff70c87846f;
      *(int *)(lVar4 + 0x2238) = param_2;
      FUN_7ff70c819c70(lStack_70,0);
      bStack_79 = 1;
      uVar11 = 1;
    }
  }
  if (bVar22) {
    *(longlong *)(lVar4 + 0x1448) = lVar8;
  }
  uVar15 = uVar15 | (uVar3 & 7) == 0 | uVar3;
  iVar20 = 0;
  if ((uVar3 & 0x200000) == 0) {
    iVar20 = param_2;
  }
  iStack_78 = iVar20;
  if (bStack_79 != 0) {
    uVar17 = 0xffffffff;
    uVar16 = 0xffffffff;
    uVar21 = 0xffffffff;
    uVar19 = 0xffffffff;
    uStack_5c = (uint)uVar11;
    if ((uVar15 & 1) == 0) {
      if ((uVar3 & 2) == 0) goto LAB_7ff70c8784b8;
LAB_7ff70c878509:
      iVar20 = iStack_78;
      cVar5 = FUN_7ff70c847630(1,0,iStack_78);
      uVar13 = uVar19;
      if (uVar19 == 0xffffffff) {
        uVar13 = 1;
      }
      if (cVar5 != '\0') {
        uVar19 = uVar13;
      }
      uVar21 = (ulonglong)uVar19;
      cVar5 = FUN_7ff70c847900(1,iVar20);
      uVar13 = 1;
      if (uVar16 != 0xffffffff) {
        uVar13 = uVar16;
      }
      if (cVar5 != '\0') {
        uVar16 = uVar13;
      }
      uVar17 = (ulonglong)uVar16;
      if ((uVar3 & 4) != 0) goto LAB_7ff70c878558;
LAB_7ff70c8784c2:
      if ((uVar3 & 0x10000) == 0) goto LAB_7ff70c8785ab;
LAB_7ff70c87861f:
      uVar11 = (ulonglong)uStack_5c;
      if (((*(char *)(lVar4 + 0xfc) == '\0') && (*(char *)(lVar4 + 0xfd) == '\0')) &&
         (*(char *)(lVar4 + 0xfe) == '\0')) goto LAB_7ff70c8785ab;
      bVar6 = (byte)uStack_5c;
    }
    else {
      bVar6 = FUN_7ff70c847630(0,0,iVar20);
      uVar19 = bVar6 - 1;
      uVar21 = (ulonglong)uVar19;
      bVar6 = FUN_7ff70c847900(0,iVar20);
      uVar16 = bVar6 - 1;
      uVar17 = (ulonglong)uVar16;
      if ((uVar3 & 2) != 0) goto LAB_7ff70c878509;
LAB_7ff70c8784b8:
      uVar16 = (uint)uVar17;
      uVar19 = (uint)uVar21;
      if ((uVar3 & 4) == 0) goto LAB_7ff70c8784c2;
LAB_7ff70c878558:
      iVar20 = iStack_78;
      cVar5 = FUN_7ff70c847630(2,0,iStack_78);
      uVar13 = uVar19;
      if (uVar19 == 0xffffffff) {
        uVar13 = 2;
      }
      if (cVar5 != '\0') {
        uVar19 = uVar13;
      }
      uVar21 = (ulonglong)uVar19;
      cVar5 = FUN_7ff70c847900(2,iVar20);
      uVar19 = 2;
      if (uVar16 != 0xffffffff) {
        uVar19 = uVar16;
      }
      if (cVar5 != '\0') {
        uVar16 = uVar19;
      }
      uVar17 = (ulonglong)uVar16;
      if ((uVar3 & 0x10000) != 0) goto LAB_7ff70c87861f;
LAB_7ff70c8785ab:
      uVar19 = uStack_5c;
      uVar16 = (uint)uVar21;
      if ((uVar16 != 0xffffffff) && (*(int *)(lVar4 + 0x14b4) != param_2)) {
        if ((uVar3 & 0x100000) == 0) {
          FUN_7ff70c848280(uVar16 + 0x290,param_2,0);
        }
        lVar8 = lStack_70;
        if ((uVar15 & 0x60) != 0) {
          FUN_7ff70c817e10(param_2,lStack_70);
          *(uint *)(lVar4 + 0x14c8) = *(uint *)(lVar4 + 0x14c8) & 0xffffff00 | uVar16;
          if ((uVar3 & 0x40000) == 0) {
            FUN_7ff70c854590(param_2,lVar8);
            uVar14 = 0;
          }
          else {
            uVar14 = 1;
            if ((uVar3 & 0x400000) != 0) goto LAB_7ff70c87868c;
          }
          FUN_7ff70c819c70(lStack_70,uVar14);
        }
LAB_7ff70c87868c:
        lVar8 = lStack_70;
        if (((uVar15 & 0x10) != 0) ||
           (((uVar3 & 0x100) != 0 && (*(short *)(lVar4 + 0xb1a + uVar21 * 2) == 2)))) {
          if ((uVar3 & 0x20000) == 0) {
            FUN_7ff70c817e10(param_2,lStack_70);
          }
          else {
            FUN_7ff70c817fe0();
            lVar8 = lStack_70;
          }
          *(uint *)(lVar4 + 0x14c8) = *(uint *)(lVar4 + 0x14c8) & 0xffffff00 | uVar16;
          if ((uVar3 & 0x40000) == 0) {
            FUN_7ff70c854590(param_2,lVar8);
            uVar14 = 0;
          }
          else {
            lVar8 = CONCAT71((int7)((ulonglong)lVar8 >> 8),1);
            uVar19 = (uint)lVar8;
            uVar14 = 1;
            if ((uVar3 & 0x400000) != 0) goto LAB_7ff70c878716;
          }
          FUN_7ff70c819c70(lStack_70,uVar14);
          uVar19 = (uint)CONCAT71((int7)((ulonglong)lVar8 >> 8),1);
        }
      }
LAB_7ff70c878716:
      if (((char)uVar3 < '\0') && ((int)uVar17 != -1)) {
        uVar16 = (uint)CONCAT71((int7)(uVar21 >> 8),1);
        if ((uStack_74 & 8) != 0) {
          uVar16 = 1;
          if (*(float *)(lVar4 + 0x74) <= *(float *)(lVar4 + 0xb80 + uVar17 * 4)) {
            uVar16 = uVar19 & 0xff;
          }
        }
        uVar19 = uVar16;
        if ((uVar3 & 0x40000) == 0) {
          FUN_7ff70c854590(param_2,lStack_70);
        }
        FUN_7ff70c817fe0();
        if ((uStack_74 & 8) == 0) goto LAB_7ff70c878768;
LAB_7ff70c878780:
        bVar6 = (byte)uVar19;
        if ((*(int *)(lVar4 + 0x14b4) == param_2) &&
           (0.0 < *(float *)(lVar4 + 0xb6c + (longlong)(int)*(char *)(lVar4 + 0x14c8) * 4))) {
          cVar5 = FUN_7ff70c847630((int)*(char *)(lVar4 + 0x14c8),1,iStack_78);
          uVar11 = (ulonglong)bVar6;
          if (cVar5 != '\0') {
            uVar11 = 1;
          }
          bVar6 = (byte)uVar11;
          goto joined_r0x7ff70c8787c4;
        }
      }
      else {
        if ((uStack_74 & 8) != 0) goto LAB_7ff70c878780;
LAB_7ff70c878768:
        bVar6 = (byte)uVar19;
      }
      uVar11 = (ulonglong)uVar19;
    }
joined_r0x7ff70c8787c4:
    if (bVar6 == 0) {
      uVar11 = 0;
    }
    else {
      uVar11 = CONCAT71((int7)(uVar11 >> 8),1);
      if (*(char *)(lVar4 + 0x56) == '\x01') {
        *(undefined1 *)(lVar4 + 0x1f90) = 0;
      }
    }
  }
  if ((*(int *)(lVar4 + 0x1f94) == param_2) && (*(char *)(lVar4 + 0x1f90) == '\x01')) {
    bStack_79 = bStack_79 | (uVar3 & 0x80000) == 0 & *(byte *)(lVar4 + 0x1f91);
  }
  if (*(int *)(lVar4 + 0x1fac) == param_2) {
    iVar20 = *(int *)(lVar4 + 0x1fa8);
    bVar22 = *(int *)(lVar4 + 0x1fb0) == param_2;
    if (((uStack_74 & 8) != 0) && (*(int *)(lVar4 + 0x1fb0) != param_2)) {
      lVar8 = FUN_7ff70c7fffc0(_DAT_7ff70cc1a3c0,0x20c);
      lVar9 = FUN_7ff70c7fffc0(_DAT_7ff70cc1a3c0,0x20d);
      lVar10 = FUN_7ff70c7fffc0(_DAT_7ff70cc1a3c0,(*(byte *)(lVar4 + 0x51) ^ 1) * 2 + 0x27b);
      auVar23 = blendvps(ZEXT416((uint)*(float *)(lVar9 + 4)),ZEXT416((uint)*(float *)(lVar8 + 4)),
                         ZEXT416(-(uint)(*(float *)(lVar9 + 4) <= *(float *)(lVar8 + 4))));
      auVar23 = blendvps(ZEXT416((uint)*(float *)(lVar10 + 4)),auVar23,
                         ZEXT416(-(uint)(*(float *)(lVar10 + 4) <= auVar23._0_4_)));
      iVar7 = FUN_7ff70c845770(auVar23._0_4_ - *(float *)(lVar4 + 0x20));
      bVar22 = 0 < iVar7;
    }
    lVar8 = lStack_70;
    if ((iVar20 == param_2) || (bVar22)) {
      FUN_7ff70c817e10(param_2,lStack_70);
      *(undefined4 *)(lVar4 + 0x14e0) = *(undefined4 *)(lVar4 + 0x1fd8);
      if (((uVar3 & 0x40000) == 0) && ((*(byte *)(lVar4 + 0x1fb4) & 0x10) == 0)) {
        FUN_7ff70c854590(param_2,lVar8);
      }
      uVar11 = CONCAT71((int7)(uVar11 >> 8),1);
      if ((*(byte *)(lVar4 + 0x1fb4) & 0x10) != 0) {
        *(undefined1 *)(lVar4 + 0x14c6) = 1;
      }
    }
  }
  if (*(int *)(lVar4 + 0x14b4) != param_2) {
    uVar12 = 0;
    goto joined_r0x7ff70c878943;
  }
  if (*(int *)(lVar4 + 0x14e0) - 2U < 2) {
    uVar12 = 1;
    if (*(int *)(lVar4 + 0x1fac) != param_2) {
      FUN_7ff70c817fe0();
LAB_7ff70c8789d3:
      uVar12 = 0;
    }
  }
  else {
    if (*(int *)(lVar4 + 0x14e0) != 1) goto LAB_7ff70c8789d3;
    if (*(char *)(lVar4 + 0x14c0) == '\x01') {
      *(ulonglong *)(lVar4 + 0x14cc) =
           CONCAT44((float)((ulonglong)*(undefined8 *)(lVar4 + 0xe0) >> 0x20) -
                    (float)((ulonglong)*puStack_58 >> 0x20),
                    (float)*(undefined8 *)(lVar4 + 0xe0) - (float)*puStack_58);
    }
    if ((*(uint *)(lVar4 + 0x14c8) & 0xff) == 0xff) {
LAB_7ff70c8789ca:
      FUN_7ff70c817fe0();
      uVar12 = 0;
    }
    else {
      iVar20 = (int)(char)*(uint *)(lVar4 + 0x14c8);
      cVar5 = FUN_7ff70c847500(iVar20,iStack_78);
      uVar12 = 1;
      if (cVar5 == '\0') {
        if ((((uVar3 & 0x40) != 0) || (((byte)uVar15 >> 5 & bStack_79) != 0)) &&
           (*(char *)(lVar4 + 0x21b0) == '\0')) {
          lVar8 = (longlong)iVar20;
          if (((uVar3 & 0x100) == 0) || (*(char *)(lVar4 + 0xb2e + lVar8) != '\x01')) {
            bVar22 = false;
          }
          else {
            bVar22 = *(short *)(lVar4 + 0xb24 + lVar8 * 2) == 2;
          }
          if ((uStack_74 & 8) == 0) {
            bVar1 = false;
          }
          else {
            bVar1 = *(float *)(lVar4 + 0x74) <= *(float *)(lVar4 + 0xb80 + lVar8 * 4);
          }
          cVar5 = FUN_7ff70c846c80(iVar20 + 0x290,iStack_78);
          uVar17 = uVar11 & 0xff;
          uVar11 = 1;
          if ((bool)(bVar22 | bVar1)) {
            uVar11 = uVar17;
          }
          if (cVar5 == '\0') {
            uVar11 = uVar17;
          }
        }
        goto LAB_7ff70c8789ca;
      }
    }
    if (((uVar3 & 0x40000) == 0) && (*(char *)(lVar4 + 0x56) == '\x01')) {
      *(undefined1 *)(lVar4 + 0x1f90) = 0;
    }
  }
  if ((char)uVar11 == '\0') {
    uVar11 = 0;
  }
  else {
    *(undefined1 *)(lVar4 + 0x14c3) = 1;
    uVar11 = CONCAT71((int7)(uVar11 >> 8),1);
  }
joined_r0x7ff70c878943:
  if (pbStack_68 != (byte *)0x0) {
    *pbStack_68 = *(int *)(lVar4 + 0x1fc8) == param_2 | bStack_79 & 1;
  }
  if (puStack_50 != (undefined1 *)0x0) {
    *puStack_50 = uVar12;
  }
  if (_DAT_7ff70cbebd80 == (uStack_48 ^ (ulonglong)auStack_a8)) {
    return uVar11;
  }
  FUN_7ff70caa97e0(uStack_48 ^ (ulonglong)auStack_a8);
  pcVar2 = (code *)swi(3);
  uVar11 = (*pcVar2)();
  return uVar11;
}


