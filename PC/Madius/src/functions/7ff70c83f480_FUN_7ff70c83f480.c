/* 7ff70c83f480 FUN_7ff70c83f480 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 * FUN_7ff70c83f480(undefined8 *param_1,longlong param_2,float *param_3,uint param_4)

{
  code *pcVar1;
  undefined1 auVar2 [16];
  undefined1 auVar3 [16];
  undefined1 auVar4 [16];
  longlong lVar5;
  uint uVar6;
  undefined8 *puVar7;
  byte bVar8;
  byte bVar9;
  uint uVar10;
  byte bVar11;
  byte bVar12;
  undefined4 unaff_R14D;
  undefined4 uVar13;
  int iVar14;
  float fVar15;
  float fVar16;
  float fVar17;
  float fVar18;
  float fVar19;
  float fVar20;
  float fVar21;
  float fVar24;
  undefined1 auVar23 [16];
  float fVar25;
  float fVar26;
  undefined1 auStack_a8 [32];
  float fStack_88;
  float fStack_84;
  float fStack_80;
  float fStack_7c;
  undefined1 auStack_78 [8];
  ulonglong uStack_70;
  undefined8 uVar22;
  
  lVar5 = _DAT_7ff70cc1a3c0;
  uStack_70 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_a8;
  fVar19 = (float)*(undefined8 *)(param_2 + 0x228) + _DAT_7ff70cb1bb60;
  fVar20 = (float)((ulonglong)*(undefined8 *)(param_2 + 0x228) >> 0x20) + _UNK_7ff70cb1bb64;
  fVar17 = (float)*(undefined8 *)(param_2 + 0x80);
  auVar23._0_4_ = (float)*(undefined8 *)(param_2 + 0x220) + _DAT_7ff70cb1d550 + fVar17;
  fVar16 = (float)((ulonglong)*(undefined8 *)(param_2 + 0x80) >> 0x20);
  auVar23._4_4_ =
       (float)((ulonglong)*(undefined8 *)(param_2 + 0x220) >> 0x20) + _UNK_7ff70cb1d554 + fVar16;
  auVar23._8_4_ = _UNK_7ff70cb1d558 + 0.0 + 0.0;
  auVar23._12_4_ = _UNK_7ff70cb1d55c + 0.0 + 0.0;
  if ((param_4 & 0x15) == 0) {
    auVar4._4_4_ = fVar20;
    auVar4._0_4_ = fVar19;
    auVar4._8_4_ = _UNK_7ff70cb1bb68 + 0.0;
    auVar4._12_4_ = _UNK_7ff70cb1bb6c + 0.0;
    auVar23 = minps(auVar23,auVar4);
    uVar22 = auVar23._0_8_;
    uVar6 = *(byte *)(param_2 + 200) | param_4;
  }
  else {
    auVar3._4_4_ = fVar20;
    auVar3._0_4_ = fVar19;
    auVar3._8_4_ = _UNK_7ff70cb1bb68 + 0.0;
    auVar3._12_4_ = _UNK_7ff70cb1bb6c + 0.0;
    auVar23 = minps(auVar23,auVar3);
    uVar22 = auVar23._0_8_;
    uVar6 = param_4;
  }
  if ((uVar6 & 0x2a) == 0) {
    uVar10 = 2;
    if (*(char *)(param_2 + 0xd3) != '\0') {
      uVar10 = 0x20;
    }
    uVar6 = uVar6 | uVar10;
  }
  fVar21 = param_3[2];
  fVar15 = (float)*(undefined8 *)param_3;
  fVar26 = (float)((ulonglong)*(undefined8 *)param_3 >> 0x20);
  fVar25 = (float)uVar22;
  fVar24 = (float)((ulonglong)uVar22 >> 0x20);
  iVar14 = -(uint)(fVar24 <= fVar26);
  auVar2._4_4_ = -(uint)(fVar25 <= fVar15);
  auVar2._0_4_ = -(uint)(fVar25 <= fVar15);
  auVar2._8_4_ = iVar14;
  auVar2._12_4_ = iVar14;
  uVar13 = movmskpd(unaff_R14D,auVar2);
  fVar18 = *(float *)(_DAT_7ff70cc1a3c0 + 0xc9c);
  bVar12 = 1;
  bVar11 = 1;
  if ((fVar19 - fVar25 < fVar18 + fVar18 + (fVar21 - fVar15)) &&
     (*(char *)(param_2 + 0xe4) < '\x01')) {
    bVar11 = (*(byte *)(param_2 + 0x14) & 0x40) >> 6;
  }
  bVar9 = fVar21 <= fVar19 & (byte)uVar13;
  if ((fVar20 - fVar24 <
       *(float *)(_DAT_7ff70cc1a3c0 + 0xca0) + *(float *)(_DAT_7ff70cc1a3c0 + 0xca0) +
       (param_3[3] - fVar26)) && (*(char *)(param_2 + 0xe5) < '\x01')) {
    bVar12 = (*(byte *)(param_2 + 0x14) & 0x40) >> 6;
  }
  bVar8 = (byte)uVar13 >> 1 & param_3[3] <= fVar20;
  if ((uVar6 & 1) == 0 || bVar9 != 0) {
    if ((((uVar6 & 4) == 0 | bVar9) & (uVar6 & 0x10) == 0) == 0) {
      if (bVar11 == 0) goto LAB_7ff70c83f66f;
      fVar15 = (float)(int)((fVar21 + fVar15) * _DAT_7ff70cb1ba70);
      fVar19 = _DAT_7ff70cb1ba70;
LAB_7ff70c83f672:
      *(float *)(param_2 + 0xa8) =
           (float)(int)((((fVar15 - *(float *)(param_2 + 0x28)) - *(float *)(param_2 + 0x70)) -
                        fVar17) + *(float *)(param_2 + 0x98));
      *(float *)(param_2 + 0xb0) = fVar19;
      *(undefined4 *)(param_2 + 0xb8) = 0;
    }
  }
  else {
    if ((fVar25 <= fVar15 & bVar11) == 0) {
      fVar15 = fVar15 - fVar18;
LAB_7ff70c83f66f:
      fVar19 = 0.0;
      goto LAB_7ff70c83f672;
    }
    if (fVar19 <= fVar21) {
      fVar15 = fVar21 + fVar18;
      fVar19 = _DAT_7ff70cb1ba2c;
      goto LAB_7ff70c83f672;
    }
  }
  if ((uVar6 & 2) == 0 || bVar8 != 0) {
    if ((((uVar6 & 8) == 0 | bVar8) & (uVar6 & 0x20) == 0) == 0) {
      fVar19 = param_3[1];
      fVar20 = 0.0;
      if (bVar12 != 0) {
        fVar19 = (float)(int)((fVar19 + param_3[3]) * _DAT_7ff70cb1ba70);
        fVar20 = _DAT_7ff70cb1ba70;
      }
      goto LAB_7ff70c83f737;
    }
  }
  else {
    if ((fVar24 <= param_3[1] & bVar12) == 0) {
      fVar19 = param_3[1] - *(float *)(lVar5 + 0xca0);
      fVar20 = 0.0;
    }
    else {
      if (param_3[3] < fVar20) goto LAB_7ff70c83f76e;
      fVar19 = param_3[3] + *(float *)(lVar5 + 0xca0);
      fVar20 = _DAT_7ff70cb1ba2c;
    }
LAB_7ff70c83f737:
    *(float *)(param_2 + 0xac) =
         (float)(int)((((fVar19 - *(float *)(param_2 + 0x2c)) - *(float *)(param_2 + 0x74)) - fVar16
                      ) + *(float *)(param_2 + 0x9c));
    *(float *)(param_2 + 0xb4) = fVar20;
    *(undefined4 *)(param_2 + 0xbc) = 0;
  }
LAB_7ff70c83f76e:
  fVar19 = *(float *)(param_2 + 0x98);
  fVar20 = *(float *)(param_2 + 0x9c);
  fVar16 = fVar16 + *(float *)(param_2 + 0x74) + *(float *)(param_2 + 0x7c);
  fVar17 = fVar17 + *(float *)(param_2 + 0x70) + *(float *)(param_2 + 0x78);
  if (*(char *)(param_2 + 0xcf) == '\x01') {
    fVar21 = *(float *)(param_2 + 0xa8);
    fVar18 = fVar19;
    if (fVar21 < _DAT_7ff70cb1c5d8) {
      fVar18 = *(float *)(param_2 + 0xb0);
      fVar15 = *(float *)(param_2 + 0xb8);
      if (0.0 < fVar15) {
        if (fVar21 <= fVar15) {
          fVar21 = fVar21 * fVar18 + 0.0;
        }
        else {
          fVar26 = (*(float *)(param_2 + 0xa0) + *(float *)(param_2 + 0x38)) - fVar17;
          if (fVar26 - fVar15 <= fVar21) {
            fVar21 = fVar21 + (fVar26 - fVar21) * fVar18;
          }
        }
      }
      fVar18 = fVar21 - fVar18 * (*(float *)(param_2 + 0x38) - fVar17);
    }
    fVar18 = (float)(-(uint)(0.0 <= fVar18) & (uint)fVar18);
    fVar17 = *(float *)(param_2 + 0xac);
    fVar21 = fVar20;
    if (fVar17 < _DAT_7ff70cb1c5d8) {
      fVar21 = *(float *)(param_2 + 0xb4);
      fVar15 = *(float *)(param_2 + 0xbc);
      if (fVar15 <= 0.0) {
        fVar26 = *(float *)(param_2 + 0x3c);
      }
      else {
        fVar26 = *(float *)(param_2 + 0x3c);
        if (fVar17 <= fVar15) {
          fVar17 = fVar17 * fVar21 + 0.0;
        }
        else {
          fVar25 = (*(float *)(param_2 + 0xa4) + fVar26) - fVar16;
          if (fVar25 - fVar15 <= fVar17) {
            fVar17 = fVar17 + (fVar25 - fVar17) * fVar21;
          }
        }
      }
      fVar21 = fVar17 - fVar21 * (fVar26 - fVar16);
    }
    fVar21 = (float)(-(uint)(0.0 <= fVar21) & (uint)fVar21);
  }
  else {
    fVar21 = *(float *)(param_2 + 0xa8);
    if (*(char *)(param_2 + 0xd1) == '\0') {
      fVar18 = fVar19;
      if (fVar21 < _DAT_7ff70cb1c5d8) {
        fVar18 = *(float *)(param_2 + 0xb0);
        fVar15 = *(float *)(param_2 + 0xb8);
        if (0.0 < fVar15) {
          if (fVar21 <= fVar15) {
            fVar21 = fVar21 * fVar18 + 0.0;
          }
          else {
            fVar26 = (*(float *)(param_2 + 0xa0) + *(float *)(param_2 + 0x38)) - fVar17;
            if (fVar26 - fVar15 <= fVar21) {
              fVar21 = fVar21 + (fVar26 - fVar21) * fVar18;
            }
          }
        }
        fVar18 = fVar21 - fVar18 * (*(float *)(param_2 + 0x38) - fVar17);
      }
      fVar21 = (float)(longlong)((float)(-(uint)(0.0 <= fVar18) & (uint)fVar18) + _DAT_7ff70cb1ba70)
      ;
      fVar17 = *(float *)(param_2 + 0xac);
      fVar18 = fVar20;
      if (fVar17 < _DAT_7ff70cb1c5d8) {
        fVar18 = *(float *)(param_2 + 0xb4);
        fVar15 = *(float *)(param_2 + 0xbc);
        if (fVar15 <= 0.0) {
          fVar26 = *(float *)(param_2 + 0x3c);
        }
        else {
          fVar26 = *(float *)(param_2 + 0x3c);
          if (fVar17 <= fVar15) {
            fVar17 = fVar17 * fVar18 + 0.0;
          }
          else {
            fVar25 = (*(float *)(param_2 + 0xa4) + fVar26) - fVar16;
            if (fVar25 - fVar15 <= fVar17) {
              fVar17 = fVar17 + (fVar25 - fVar17) * fVar18;
            }
          }
        }
        fVar18 = fVar17 - fVar18 * (fVar26 - fVar16);
      }
      fVar17 = (float)(longlong)((float)(-(uint)(0.0 <= fVar18) & (uint)fVar18) + _DAT_7ff70cb1ba70)
      ;
      if (*(float *)(param_2 + 0xa0) <= fVar21) {
        fVar21 = *(float *)(param_2 + 0xa0);
      }
      auVar23 = ZEXT416((uint)fVar21);
      if (*(float *)(param_2 + 0xa4) <= fVar17) {
        fVar17 = *(float *)(param_2 + 0xa4);
      }
      goto LAB_7ff70c83fbc7;
    }
    fVar18 = fVar19;
    if (fVar21 < _DAT_7ff70cb1c5d8) {
      fVar18 = *(float *)(param_2 + 0xb0);
      fVar15 = *(float *)(param_2 + 0xb8);
      if (0.0 < fVar15) {
        if (fVar21 <= fVar15) {
          fVar21 = fVar21 * fVar18 + 0.0;
        }
        else {
          fVar26 = (*(float *)(param_2 + 0xa0) + *(float *)(param_2 + 0x38)) - fVar17;
          if (fVar26 - fVar15 <= fVar21) {
            fVar21 = fVar21 + (fVar26 - fVar21) * fVar18;
          }
        }
      }
      fVar18 = fVar21 - fVar18 * (*(float *)(param_2 + 0x38) - fVar17);
    }
    fVar18 = (float)(-(uint)(0.0 <= fVar18) & (uint)fVar18);
    fVar17 = *(float *)(param_2 + 0xac);
    fVar21 = fVar20;
    if (fVar17 < _DAT_7ff70cb1c5d8) {
      fVar21 = *(float *)(param_2 + 0xb4);
      fVar15 = *(float *)(param_2 + 0xbc);
      if (fVar15 <= 0.0) {
        fVar26 = *(float *)(param_2 + 0x3c);
      }
      else {
        fVar26 = *(float *)(param_2 + 0x3c);
        if (fVar17 <= fVar15) {
          fVar17 = fVar17 * fVar21 + 0.0;
        }
        else {
          fVar25 = (*(float *)(param_2 + 0xa4) + fVar26) - fVar16;
          if (fVar25 - fVar15 <= fVar17) {
            fVar17 = fVar17 + (fVar25 - fVar17) * fVar21;
          }
        }
      }
      fVar21 = fVar17 - fVar21 * (fVar26 - fVar16);
    }
    fVar21 = (float)(-(uint)(0.0 <= fVar21) & (uint)fVar21);
  }
  auVar23 = ZEXT416((uint)(float)(longlong)(fVar18 + _DAT_7ff70cb1ba70));
  fVar17 = (float)(longlong)(fVar21 + _DAT_7ff70cb1ba70);
LAB_7ff70c83fbc7:
  auVar23 = insertps(auVar23,ZEXT416((uint)fVar17),0x10);
  fVar19 = auVar23._0_4_ - fVar19;
  fVar20 = auVar23._4_4_ - fVar20;
  *param_1 = CONCAT44(fVar20,fVar19);
  if (((uVar6 & 0x40) == 0) && ((*(byte *)(param_2 + 0x17) & 1) != 0)) {
    uVar6 = (param_4 & 0xffffffea) + 1;
    if ((param_4 & 0x14) == 0) {
      uVar6 = param_4;
    }
    uVar10 = uVar6 & 0xffffffc1 | 2;
    if ((uVar6 & 0x28) == 0) {
      uVar10 = uVar6;
    }
    fStack_88 = *param_3 - fVar19;
    fStack_84 = param_3[1] - fVar20;
    fStack_80 = param_3[2] - fVar19;
    fStack_7c = param_3[3] - fVar20;
    FUN_7ff70c83f480(auStack_78,*(undefined8 *)(param_2 + 0x3b0),&fStack_88,uVar10);
    *param_1 = CONCAT44(auStack_78._4_4_ + fVar20,auStack_78._0_4_ + fVar19);
  }
  if (_DAT_7ff70cbebd80 == (uStack_70 ^ (ulonglong)auStack_a8)) {
    return param_1;
  }
  FUN_7ff70caa97e0(uStack_70 ^ (ulonglong)auStack_a8);
  pcVar1 = (code *)swi(3);
  puVar7 = (undefined8 *)(*pcVar1)();
  return puVar7;
}


