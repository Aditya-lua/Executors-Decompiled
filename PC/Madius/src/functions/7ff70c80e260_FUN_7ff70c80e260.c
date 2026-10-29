/* 7ff70c80e260 FUN_7ff70c80e260 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c80e260(undefined8 param_1,float param_2,uint param_3,undefined4 param_4)

{
  int *piVar1;
  undefined1 *puVar2;
  undefined1 *puVar3;
  undefined8 uVar4;
  double dVar5;
  longlong lVar6;
  float fVar7;
  float fVar8;
  float fVar9;
  float fVar10;
  longlong lVar11;
  undefined4 uVar12;
  int iVar13;
  longlong lVar14;
  short sVar15;
  longlong lVar16;
  longlong lVar17;
  undefined1 *puVar18;
  undefined1 *puVar19;
  longlong *plVar20;
  longlong lVar21;
  uint uVar22;
  longlong *plVar23;
  longlong lVar24;
  undefined1 auVar25 [16];
  undefined1 auVar26 [16];
  float fVar27;
  float fVar28;
  float in_XMM1_Dc;
  undefined1 auVar29 [16];
  undefined1 auVar30 [16];
  float fVar31;
  float fVar32;
  float fVar33;
  float fVar34;
  float fVar35;
  longlong alStack_218 [2];
  undefined1 auStack_208 [24];
  float afStack_1f0 [2];
  longlong alStack_1e8 [2];
  float afStack_1d8 [4];
  undefined8 uStack_1c8;
  undefined8 uStack_1c0;
  undefined8 uStack_1b8;
  uint auStack_1b0 [2];
  longlong alStack_1a8 [13];
  longlong lStack_140;
  undefined8 auStack_138 [31];
  
  fVar10 = _UNK_7ff70cb1d68c;
  fVar9 = _UNK_7ff70cb1d688;
  fVar8 = _UNK_7ff70cb1d684;
  fVar7 = _DAT_7ff70cb1d680;
  uVar22 = 0;
  if (param_3 < 0xb) {
    uVar22 = param_3;
  }
  alStack_1a8[3] = _DAT_7ff70cc1a3c0;
  if ((longlong)*(int *)(_DAT_7ff70cc1a3c0 + 0x1f80) != 0) {
    lVar17 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1158);
    lVar14 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1f88);
    lVar21 = (longlong)*(int *)(_DAT_7ff70cc1a3c0 + 0x1f80) << 3;
    plVar23 = alStack_1a8 + 8;
    fVar33 = param_2 * _DAT_7ff70cb1ba2c;
    fVar34 = param_2 * _DAT_7ff70cb1d670;
    auStack_1b0[1] = uVar22 & 0xe;
    fVar31 = _DAT_7ff70cb1d5f4 * param_2;
    fVar35 = _DAT_7ff70cb1d674 * param_2;
    fVar32 = _DAT_7ff70cb1bae0 * param_2;
    plVar20 = alStack_1a8 + 6;
    lVar24 = 0;
    puVar19 = auStack_208;
    auStack_1b0[0] = param_4;
    alStack_1a8[0xb] = lVar21;
    alStack_1a8[0xc] = lVar17;
    lStack_140 = lVar14;
    do {
      lVar6 = *(longlong *)(lVar14 + lVar24);
      *(undefined8 *)(puVar19 + 0x88) = 0;
      *(undefined8 *)(puVar19 + 0x50) = 0;
      *(undefined8 *)(puVar19 + 0xa0) = 0;
      *(undefined8 *)(puVar19 + 0xa8) = 0;
      *(undefined8 *)(puVar19 + 0x90) = 0;
      *(undefined8 *)(puVar19 + 0x98) = 0;
      *(longlong **)(puVar19 + 0x28) = plVar23;
      *(longlong **)(puVar19 + 0x20) = plVar20;
      *(undefined8 *)(puVar19 + -8) = 0x7ff70c80e429;
      uVar12 = FUN_7ff70c7e5fc0(lVar17,uVar22,puVar19 + 0x88,puVar19 + 0x50);
      lVar11 = _DAT_7ff70cc1a3c0;
      puVar18 = puVar19;
      if ((char)uVar12 != '\0') {
        fVar27 = (float)param_1 - (float)*(undefined8 *)(puVar19 + 0x88);
        fVar28 = (float)((ulonglong)param_1 >> 0x20) -
                 (float)((ulonglong)*(undefined8 *)(puVar19 + 0x88) >> 0x20);
        *(ulonglong *)(puVar19 + 0x48) = CONCAT44(fVar28,fVar27);
        uVar4 = *(undefined8 *)(lVar6 + 0xc);
        auVar30._4_4_ = 0;
        auVar30._0_4_ = *(uint *)(lVar6 + 0x14);
        auVar30._8_4_ = *(uint *)(lVar6 + 0x14);
        auVar30._12_4_ = 0;
        auVar29 = insertps(auVar30,ZEXT416(*(uint *)(lVar6 + 8)),0x30);
        auVar25._4_4_ = ((float)*(undefined8 *)(puVar19 + 0x50) + fVar8) * param_2;
        auVar25._0_4_ =
             ((float)((ulonglong)*(undefined8 *)(puVar19 + 0x50) >> 0x20) + fVar7) * param_2;
        auVar25._8_4_ = (fVar9 + 0.0) * in_XMM1_Dc;
        auVar25._12_4_ = (fVar10 + 0.0) * in_XMM1_Dc;
        auVar30 = blendps(auVar29,auVar25,3);
        auVar29._8_4_ = fVar28;
        auVar29._0_8_ = uVar4;
        auVar29._12_4_ = fVar27;
        auVar25 = insertps(auVar29,ZEXT416(*(uint *)(lVar6 + 8)),0x10);
        auVar26._4_4_ = -(uint)(auVar25._4_4_ < auVar30._4_4_ + fVar27);
        auVar26._0_4_ = -(uint)(auVar25._0_4_ < auVar30._0_4_ + fVar28);
        auVar26._8_4_ = -(uint)(auVar25._8_4_ < auVar30._8_4_ + (float)uVar4);
        auVar26._12_4_ =
             -(uint)(auVar25._12_4_ < auVar30._12_4_ + (float)((ulonglong)uVar4 >> 0x20));
        iVar13 = movmskps(uVar12,auVar26);
        if (iVar13 == 0xf) {
          lVar14 = *(longlong *)(lVar6 + 0x50);
          if (lVar14 == 0) {
            *(undefined8 *)(puVar19 + -8) = 0x7ff70c80e795;
            lVar14 = (*_DAT_7ff70cbe9460)(0xe0,_DAT_7ff70cc1a3d0);
            lVar21 = _DAT_7ff70cc1a3c0;
            if (_DAT_7ff70cc1a3c0 != 0) {
              piVar1 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
              lVar16 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
              if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar16 * 8) == *piVar1) {
                sVar15 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar16 * 8) + 1;
              }
              else {
                iVar13 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
                *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar13;
                lVar16 = (longlong)iVar13;
                *(int *)(lVar21 + 0x2874 + lVar16 * 8) = *piVar1;
                *(undefined4 *)(lVar21 + 0x2878 + lVar16 * 8) = 0;
                sVar15 = 1;
              }
              *(short *)(lVar21 + 0x2878 + lVar16 * 8) = sVar15;
              *(int *)(lVar21 + 0x2868) = *(int *)(lVar21 + 0x2868) + 1;
            }
            *(undefined8 *)(puVar19 + -8) = 0x7ff70c80e82f;
            FUN_7ff70c7b5780(lVar14,lVar11 + 0x1148);
            *(undefined **)(lVar14 + 0xd8) = &UNK_7ff70cb875f7;
            *(longlong *)(lVar6 + 0x50) = lVar14;
            if (*(int *)(lVar6 + 0x44) != *(int *)(lVar11 + 5000)) goto LAB_7ff70c80e4bc;
          }
          else if (*(int *)(lVar6 + 0x44) != *(int *)(_DAT_7ff70cc1a3c0 + 5000)) {
LAB_7ff70c80e4bc:
            *(undefined8 *)(puVar19 + -8) = 0x7ff70c80e4c8;
            FUN_7ff70c7b6160(lVar14);
            uVar4 = *(undefined8 *)(*(longlong *)(lVar11 + 0x40) + 0x30);
            *(undefined8 *)(puVar19 + 0x60) = *(undefined8 *)(*(longlong *)(lVar11 + 0x40) + 0x28);
            *(undefined8 *)(puVar19 + 0x68) = uVar4;
            *(undefined8 *)(puVar19 + -8) = 0x7ff70c80e4e2;
            FUN_7ff70c7b8300(lVar14,puVar19 + 0x60);
            *(ulonglong *)(puVar19 + 0x40) =
                 CONCAT44((float)((ulonglong)*(undefined8 *)(lVar6 + 0x10) >> 0x20) +
                          (float)((ulonglong)*(undefined8 *)(lVar6 + 8) >> 0x20),
                          (float)*(undefined8 *)(lVar6 + 0x10) + (float)*(undefined8 *)(lVar6 + 8));
            *(undefined8 *)(puVar19 + -8) = 0x7ff70c80e509;
            FUN_7ff70c7b7c50(lVar14,lVar6 + 8,puVar19 + 0x40,0);
            *(undefined4 *)(lVar6 + 0x44) = *(undefined4 *)(lVar11 + 5000);
          }
          uVar4 = *(undefined8 *)(lVar17 + 0x30);
          *(undefined8 *)(puVar19 + 0x60) = *(undefined8 *)(lVar17 + 0x28);
          *(undefined8 *)(puVar19 + 0x68) = uVar4;
          uVar4 = *(undefined8 *)(lVar17 + 0x30);
          *(undefined8 *)(puVar19 + 0x110) = *(undefined8 *)(lVar17 + 0x28);
          *(undefined8 *)(puVar19 + 0x118) = uVar4;
          *(undefined8 *)(puVar19 + -8) = 0x7ff70c80e53b;
          FUN_7ff70c7b8300(lVar14,puVar19 + 0x110);
          fVar27 = (float)*(undefined8 *)(puVar19 + 0x48);
          fVar28 = (float)((ulonglong)*(undefined8 *)(puVar19 + 0x48) >> 0x20);
          *(ulonglong *)(puVar19 + 0x40) =
               CONCAT44(((float)((ulonglong)*(undefined8 *)(puVar19 + 0x50) >> 0x20) + 0.0) *
                        param_2 + fVar28,
                        ((float)*(undefined8 *)(puVar19 + 0x50) + _DAT_7ff70cb1ba2c) * param_2 +
                        fVar27);
          *(ulonglong *)(puVar19 + 0x80) = CONCAT44(fVar28 + param_2 * 0.0,fVar27 + fVar33);
          *(undefined8 *)(puVar19 + 0x100) = *(undefined8 *)(puVar19 + 0x60);
          *(undefined8 *)(puVar19 + 0x108) = *(undefined8 *)(puVar19 + 0x68);
          uVar12 = *(undefined4 *)(puVar19 + 0x238);
          *(undefined4 *)(puVar19 + 0x30) = uVar12;
          puVar3 = puVar19 + 0xa8;
          *(undefined1 **)(puVar19 + 0x28) = puVar3;
          plVar23 = (longlong *)(puVar19 + 0xa0);
          *(longlong **)(puVar19 + 0x20) = plVar23;
          puVar2 = puVar19 + 0x40;
          *(undefined8 *)(puVar19 + -8) = 0x7ff70c80e5c1;
          FUN_7ff70c7c22e0(lVar14,puVar19 + 0x100,puVar19 + 0x80,puVar2);
          fVar27 = (float)*(undefined8 *)(puVar19 + 0x48);
          fVar28 = (float)((ulonglong)*(undefined8 *)(puVar19 + 0x48) >> 0x20);
          *(ulonglong *)(puVar19 + 0x40) =
               CONCAT44(((float)((ulonglong)*(undefined8 *)(puVar19 + 0x50) >> 0x20) + 0.0) *
                        param_2 + fVar28,
                        ((float)*(undefined8 *)(puVar19 + 0x50) + _DAT_7ff70cb1d670) * param_2 +
                        fVar27);
          *(ulonglong *)(puVar19 + 0x80) = CONCAT44(fVar28 + param_2 * 0.0,fVar27 + fVar34);
          *(undefined8 *)(puVar19 + 0xf0) = *(undefined8 *)(puVar19 + 0x60);
          *(undefined8 *)(puVar19 + 0xf8) = *(undefined8 *)(puVar19 + 0x68);
          *(undefined4 *)(puVar19 + 0x30) = uVar12;
          *(undefined1 **)(puVar19 + 0x28) = puVar3;
          *(longlong **)(puVar19 + 0x20) = plVar23;
          *(undefined8 *)(puVar19 + -8) = 0x7ff70c80e622;
          FUN_7ff70c7c22e0(lVar14,puVar19 + 0xf0,puVar19 + 0x80,puVar2);
          *(ulonglong *)(puVar19 + 0x40) =
               CONCAT44((float)((ulonglong)*(undefined8 *)(puVar19 + 0x48) >> 0x20) +
                        (float)((ulonglong)*(undefined8 *)(puVar19 + 0x50) >> 0x20) * param_2,
                        (float)*(undefined8 *)(puVar19 + 0x48) +
                        (float)*(undefined8 *)(puVar19 + 0x50) * param_2);
          *(undefined8 *)(puVar19 + 0xe0) = *(undefined8 *)(puVar19 + 0x60);
          *(undefined8 *)(puVar19 + 0xe8) = *(undefined8 *)(puVar19 + 0x68);
          *(undefined4 *)(puVar19 + 0x30) = *(undefined4 *)(puVar19 + 0x230);
          *(undefined1 **)(puVar19 + 0x28) = puVar3;
          *(longlong **)(puVar19 + 0x20) = plVar23;
          *(undefined8 *)(puVar19 + -8) = 0x7ff70c80e677;
          FUN_7ff70c7c22e0(lVar14,puVar19 + 0xe0,puVar19 + 0x48,puVar2);
          *(ulonglong *)(puVar19 + 0x40) =
               CONCAT44((float)((ulonglong)*(undefined8 *)(puVar19 + 0x48) >> 0x20) +
                        (float)((ulonglong)*(undefined8 *)(puVar19 + 0x50) >> 0x20) * param_2,
                        (float)*(undefined8 *)(puVar19 + 0x48) +
                        (float)*(undefined8 *)(puVar19 + 0x50) * param_2);
          *(undefined8 *)(puVar19 + 0xd0) = *(undefined8 *)(puVar19 + 0x60);
          *(undefined8 *)(puVar19 + 0xd8) = *(undefined8 *)(puVar19 + 0x68);
          *(undefined4 *)(puVar19 + 0x30) = *(undefined4 *)(puVar19 + 0x58);
          *(undefined1 **)(puVar19 + 0x28) = puVar19 + 0x98;
          *(undefined1 **)(puVar19 + 0x20) = puVar19 + 0x90;
          *(undefined8 *)(puVar19 + -8) = 0x7ff70c80e6d4;
          FUN_7ff70c7c22e0(lVar14,puVar19 + 0xd0,puVar19 + 0x48,puVar2);
          if (*(int *)(puVar19 + 0x5c) == 8) {
            dVar5 = *(double *)(*(longlong *)(puVar19 + 0x78) + 0x1380);
            puVar18 = puVar19 + -8;
            *(longlong *)(puVar19 + -8) = *(longlong *)(puVar19 + 0x78);
            *(undefined8 *)(puVar19 + -0x10) = 0x7ff70c80e706;
            fVar27 = (float)func_0x7ff70cc53afd(CONCAT44((int)((ulonglong)dVar5 >> 0x20),
                                                         (float)dVar5 * _DAT_7ff70cb1c678));
            *(float *)(puVar19 + 0x38) = *(float *)(puVar19 + 0x40) + fVar35;
            *(float *)(puVar19 + 0x3c) = *(float *)(puVar19 + 0x44) - param_2;
            *(float *)(puVar19 + 0x18) = fVar27 + _DAT_7ff70cb1d690;
            *(undefined4 *)(puVar19 + 0x20) = 0;
            *(undefined8 *)(puVar19 + -0x10) = 0x7ff70c80e753;
            FUN_7ff70c7bb0c0(lVar14,puVar19 + 0x38,fVar31,fVar27);
            uVar12 = *(undefined4 *)(lVar14 + 0x50);
            uVar4 = *(undefined8 *)(lVar14 + 0x58);
            *(float *)(puVar19 + 0x20) = fVar32;
            *(undefined4 *)(puVar19 + 0x18) = 0;
            *(undefined8 *)(puVar19 + -0x10) = 0x7ff70c80e777;
            FUN_7ff70c7b8f50(lVar14,uVar4,uVar12,*(undefined4 *)(puVar19 + 0x50));
            *(undefined4 *)(lVar14 + 0x50) = 0;
          }
          *(undefined8 *)(puVar18 + -8) = 0x7ff70c80e3ad;
          FUN_7ff70c7b8530(lVar14);
          lVar14 = *(longlong *)(puVar18 + 200);
          plVar20 = (longlong *)(puVar18 + 0x90);
          lVar17 = *(longlong *)(puVar18 + 0xc0);
          lVar21 = *(longlong *)(puVar18 + 0xb8);
        }
      }
      lVar24 = lVar24 + 8;
      puVar19 = puVar18;
    } while (lVar21 != lVar24);
  }
  return;
}


