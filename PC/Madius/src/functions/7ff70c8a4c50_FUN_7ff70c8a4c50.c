/* 7ff70c8a4c50 FUN_7ff70c8a4c50 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

ulonglong FUN_7ff70c8a4c50(undefined8 param_1,char *param_2,char *param_3,undefined4 param_4,
                          char param_5)

{
  float fVar1;
  float fVar2;
  longlong lVar3;
  longlong lVar4;
  code *pcVar5;
  longlong lVar6;
  char cVar7;
  ushort uVar8;
  int iVar9;
  uint uVar10;
  uint uVar11;
  undefined4 uVar12;
  ulonglong uVar13;
  longlong lVar14;
  int iVar15;
  int iVar16;
  undefined8 uVar17;
  ushort uVar18;
  ushort uVar21;
  ushort uVar22;
  ushort uVar23;
  undefined1 auVar19 [16];
  undefined1 auVar20 [16];
  float fVar24;
  float fVar25;
  float fVar26;
  float fVar27;
  undefined1 auStack_108 [32];
  undefined4 uStack_e8;
  char cStack_d9;
  undefined8 uStack_d8;
  undefined8 uStack_d0;
  uint uStack_c8;
  undefined4 uStack_c4;
  ulonglong uStack_c0;
  
  lVar6 = _DAT_7ff70cc1a3c0;
  uStack_c0 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_108;
  *(undefined1 *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440) + 0xce) = 1;
  lVar3 = *(longlong *)(lVar6 + 0x1440);
  if (*(char *)(lVar3 + 0xd1) != '\0') {
    uVar13 = 0;
    goto LAB_7ff70c8a51e2;
  }
  fVar1 = *(float *)(lVar3 + 0x118);
  fVar2 = *(float *)(lVar3 + 0x11c);
  uStack_e8 = 0xbf800000;
  uVar17 = 0;
  FUN_7ff70c80cf40(&uStack_c8,param_1,0);
  if (*(int *)(_DAT_7ff70cc1a3c0 + 0x1f60) < *(int *)(_DAT_7ff70cc1a3c0 + 0x1f50)) {
    lVar4 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
    if ((*(byte *)(lVar4 + 0x17) & 0x10) == 0) {
      lVar14 = (longlong)*(int *)(_DAT_7ff70cc1a3c0 + 0x1f60) * 0x38;
      if (((*(int *)(lVar4 + 0x170) ==
            *(int *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1f58) + 0x18 + lVar14)) &&
          (lVar14 = *(longlong *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1f58) + lVar14 + 8),
          lVar14 != 0)) && ((*(byte *)(lVar14 + 0x17) & 0x10) != 0)) {
        uVar17 = 1;
        cVar7 = FUN_7ff70c83cc20(lVar14,lVar4,
                                 CONCAT71((uint7)(uint3)((uint)*(int *)(lVar4 + 0x170) >> 8),1));
        if (cVar7 != '\0') {
          FUN_7ff70c83c390(0x2000,1);
          FUN_7ff70c841a90(param_1);
          goto joined_r0x7ff70c8a4db2;
        }
      }
    }
    uVar17 = 0;
    FUN_7ff70c841a90(param_1);
    if (param_5 != '\0') goto LAB_7ff70c8a4db8;
LAB_7ff70c8a4f7e:
    FUN_7ff70c83c640(1);
    if (*(int *)(lVar3 + 0x1d4) != 0) goto LAB_7ff70c8a4dc7;
LAB_7ff70c8a4f94:
    cVar7 = (char)uVar17;
    fVar26 = (float)(int)(*(float *)(lVar6 + 0xc9c) * _DAT_7ff70cb1ba70) + *(float *)(lVar3 + 0x118)
    ;
    *(float *)(lVar3 + 0x118) = fVar26;
    fVar1 = *(float *)(lVar3 + 0x11c);
    fVar2 = *(float *)(lVar3 + 0x150);
    uVar23 = *(ushort *)(lVar3 + 400);
    FUN_7ff70c80bcf0(0xe,*(float *)(lVar6 + 0xc9c) + *(float *)(lVar6 + 0xc9c));
    uStack_d0 = (ulonglong)uStack_c8;
    uVar11 = FUN_7ff70c87f8e0(&UNK_7ff70cb923a7,param_4,0xa800000,&uStack_d0);
    uVar13 = (ulonglong)uVar11;
    FUN_7ff70c80c4c0(1);
    if ((*(byte *)(lVar6 + 0x1e29) & 1) != 0) {
      FUN_7ff70c80c6b0(CONCAT44(fVar1 + fVar2,fVar26 + (float)uVar23),param_1,0,1);
    }
    *(float *)(lVar3 + 0x118) =
         (float)(int)(*(float *)(lVar6 + 0xc9c) * _DAT_7ff70cb1bb40) + *(float *)(lVar3 + 0x118);
  }
  else {
    FUN_7ff70c841a90(param_1);
joined_r0x7ff70c8a4db2:
    if (param_5 == '\0') goto LAB_7ff70c8a4f7e;
LAB_7ff70c8a4db8:
    if (*(int *)(lVar3 + 0x1d4) == 0) goto LAB_7ff70c8a4f94;
LAB_7ff70c8a4dc7:
    fVar26 = 0.0;
    if ((param_2 != (char *)0x0) && (*param_2 != '\0')) {
      uStack_e8 = 0xbf800000;
      FUN_7ff70c80cf40(&uStack_d0,param_2,0);
      fVar26 = (float)uStack_d0;
    }
    cStack_d9 = (char)param_4;
    fVar25 = 0.0;
    uStack_d8 = uVar17;
    if ((param_3 != (char *)0x0) && (*param_3 != '\0')) {
      uStack_e8 = 0xbf800000;
      FUN_7ff70c80cf40(&uStack_d0,param_3,0);
      fVar25 = (float)uStack_d0;
    }
    auVar19 = insertps(ZEXT416((uint)fVar26),uStack_c8,0x10);
    auVar20._0_4_ = (int)auVar19._0_4_;
    auVar20._4_4_ = (int)auVar19._4_4_;
    auVar20._8_4_ = (int)auVar19._8_4_;
    auVar20._12_4_ = (int)auVar19._12_4_;
    auVar19 = packusdw(auVar20,auVar20);
    uVar22 = (ushort)(int)fVar25;
    uVar8 = (ushort)(int)(*(float *)(lVar6 + 0x1130) * _DAT_7ff70cb1e924);
    uVar13 = auVar19._0_8_ & 0xffffffff;
    uVar17 = *(undefined8 *)(lVar3 + 0x196);
    uVar23 = (ushort)uVar17;
    uVar18 = (ushort)uVar13;
    uVar18 = (uVar18 < uVar23) * uVar23 | (uVar18 >= uVar23) * uVar18;
    uVar23 = (ushort)((ulonglong)uVar17 >> 0x10);
    uVar21 = (ushort)(uVar13 >> 0x10);
    uVar21 = (uVar21 < uVar23) * uVar23 | (uVar21 >= uVar23) * uVar21;
    uVar23 = (ushort)((ulonglong)uVar17 >> 0x20);
    uVar22 = (uVar22 < uVar23) * uVar23 | (uVar22 >= uVar23) * uVar22;
    uVar23 = (ushort)((ulonglong)uVar17 >> 0x30);
    uVar23 = (uVar8 < uVar23) * uVar23 | (uVar8 >= uVar23) * uVar8;
    *(ulonglong *)(lVar3 + 0x196) = CONCAT26(uVar23,CONCAT24(uVar22,CONCAT22(uVar21,uVar18)));
    iVar9 = *(int *)(lVar3 + 0x18c);
    iVar16 = iVar9;
    if (uVar21 == 0) {
      iVar16 = 0;
    }
    if (uVar18 == 0) {
      iVar16 = 0;
    }
    iVar15 = iVar9;
    if (uVar22 == 0) {
      iVar15 = 0;
    }
    if (uVar21 == 0 && uVar18 == 0) {
      iVar15 = 0;
    }
    if (uVar23 == 0) {
      iVar9 = 0;
    }
    if ((uVar21 == 0 && uVar18 == 0) && uVar22 == 0) {
      iVar9 = 0;
    }
    uVar11 = iVar9 + iVar15 +
             (uint)uVar22 + (uint)uVar23 + (uint)uVar21 + CONCAT22(uVar21,uVar18) + iVar16 & 0xffff;
    *(uint *)(lVar3 + 0x188) = uVar11;
    if (uVar11 < *(uint *)(lVar3 + 0x184)) {
      uVar11 = *(uint *)(lVar3 + 0x184);
    }
    FUN_7ff70c836be0(&uStack_d0);
    fVar27 = (float)uStack_d0;
    uStack_d0 = CONCAT44(uStack_c4,(float)uVar11);
    uVar10 = FUN_7ff70c87f8e0(&UNK_7ff70cb923a7,0,0xb800000,&uStack_d0);
    uVar13 = (ulonglong)uVar10;
    if ((*(byte *)(lVar6 + 0x1e29) & 1) == 0) {
      cVar7 = (char)uStack_d8;
    }
    else {
      fVar27 = fVar27 - (float)uVar11;
      fVar27 = (float)(~-(uint)(fVar27 <= 0.0) & (uint)fVar27);
      fVar24 = fVar2 + 0.0;
      FUN_7ff70c80c6b0(CONCAT44(fVar24,(float)*(ushort *)(lVar3 + 400) + fVar1),param_1,0,1);
      if (0.0 < fVar26) {
        FUN_7ff70c80c6b0(CONCAT44(fVar24,(float)*(ushort *)(lVar3 + 0x18e) + fVar1),param_2,0,1);
      }
      if (0.0 < fVar25) {
        FUN_7ff70c80a550(0,lVar6 + 0xd64);
        FUN_7ff70c8574b0(&UNK_7ff70cb8f774,&UNK_7ff70cb8f76e);
        FUN_7ff70c80c6b0(CONCAT44(fVar24,(float)*(ushort *)(lVar3 + 0x192) + fVar27 + fVar1),param_3
                         ,0,0);
        FUN_7ff70c80a7b0(1);
      }
      if (cStack_d9 != '\0') {
        fVar26 = *(float *)(lVar6 + 0x1130) * _DAT_7ff70cb1c64c;
        uVar12 = FUN_7ff70c80a070(0);
        FUN_7ff70c7fabb0(*(undefined8 *)(lVar3 + 0x2c8),
                         CONCAT44(fVar2 + _DAT_7ff70cb1eae4 * *(float *)(lVar6 + 0x1130) *
                                          _DAT_7ff70cb1ba70,
                                  fVar1 + *(float *)(lVar6 + 0x1130) * _DAT_7ff70cb1c644 +
                                          fVar27 + (float)*(ushort *)(lVar3 + 0x194)),uVar12,fVar26)
        ;
      }
      cVar7 = (char)uStack_d8;
    }
  }
  if (param_5 == '\0') {
    FUN_7ff70c83c8a0();
  }
  FUN_7ff70c844300();
  if (cVar7 != '\0') {
    FUN_7ff70c83c5b0();
  }
LAB_7ff70c8a51e2:
  if (_DAT_7ff70cbebd80 != (uStack_c0 ^ (ulonglong)auStack_108)) {
    FUN_7ff70caa97e0(uStack_c0 ^ (ulonglong)auStack_108);
    pcVar5 = (code *)swi(3);
    uVar13 = (*pcVar5)();
    return uVar13;
  }
  return uVar13;
}


