/* 7ff70c832c20 FUN_7ff70c832c20 */

/* WARNING: Type propagation algorithm not settling */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

ulonglong FUN_7ff70c832c20(void)

{
  short *psVar1;
  int *piVar2;
  undefined4 *puVar3;
  byte bVar4;
  undefined1 uVar5;
  code *pcVar6;
  longlong lVar7;
  float fVar8;
  float fVar9;
  undefined4 uVar10;
  undefined4 uVar11;
  undefined4 uVar12;
  undefined4 uVar13;
  undefined4 uVar14;
  undefined4 uVar15;
  undefined4 uVar16;
  undefined4 uVar17;
  undefined4 uVar18;
  undefined4 uVar19;
  undefined4 uVar20;
  undefined4 uVar21;
  undefined4 uVar22;
  undefined4 uVar23;
  undefined8 uVar24;
  ulonglong uVar25;
  char cVar26;
  uint uVar27;
  longlong lVar28;
  longlong lVar29;
  longlong lVar30;
  ulonglong uVar31;
  short sVar32;
  int iVar33;
  undefined4 uVar34;
  uint *puVar35;
  undefined *puVar36;
  bool bVar37;
  int iVar38;
  char *pcVar39;
  uint *puVar40;
  longlong lVar41;
  longlong *plVar42;
  int iVar43;
  longlong lVar44;
  longlong lVar45;
  longlong lVar46;
  longlong lVar47;
  float fVar48;
  float fVar49;
  float fVar50;
  float fVar51;
  float fVar52;
  undefined8 uStack_68;
  undefined4 uStack_60;
  undefined4 uStack_5c;
  undefined8 uStack_58;
  longlong lStack_50;
  undefined1 auStack_48 [8];
  undefined8 uStack_40;
  undefined1 auStack_38 [8];
  
  lVar7 = _DAT_7ff70cc1a3c0;
  uVar31 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_38;
  if (*(int *)(_DAT_7ff70cc1a3c0 + 0x1494) != 0) {
    if (*(char *)(_DAT_7ff70cc1a3c0 + 0xfc) == '\0') {
      *(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x27b0) = *(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x14a4);
      cVar26 = *(char *)(lVar7 + 0x27f1);
    }
    else {
      cVar26 = *(char *)(_DAT_7ff70cc1a3c0 + 0x27f1);
    }
    if (cVar26 == '\0') {
      uStack_40 = 0x7ff70c832c7e;
      cVar26 = FUN_7ff70c849860();
      if (cVar26 != '\0') {
        uStack_40 = 0x7ff70c832c98;
        FUN_7ff70c876e30(&UNK_7ff70cb905e7,*(undefined4 *)(lVar7 + 0x27b0));
        uStack_40 = 0x7ff70c832ca4;
        FUN_7ff70c877ed0(&UNK_7ff70cb8ffcd);
        uStack_40 = 0x7ff70c832cb0;
        FUN_7ff70c877ed0(&UNK_7ff70cb90573);
        uStack_40 = 0x7ff70c832cbc;
        FUN_7ff70c877ed0(&UNK_7ff70cb8c8da);
        uStack_40 = 0x7ff70c832cc1;
        FUN_7ff70c87d690();
        if (*(char *)(lVar7 + 0x82) == '\x01') {
          uStack_40 = 0x7ff70c832cda;
          FUN_7ff70c876e30(&UNK_7ff70cb908bc);
          lVar45 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
          if (*(char *)(lVar45 + 0xd1) == '\0') {
            *(ulonglong *)(lVar45 + 0x118) =
                 CONCAT44((float)((ulonglong)*(undefined8 *)(lVar45 + 0x120) >> 0x20) +
                          _UNK_7ff70cb1d8a4,
                          (float)*(undefined8 *)(lVar45 + 0x120) + _DAT_7ff70cb1d8a0);
            *(undefined8 *)(lVar45 + 0x140) = *(undefined8 *)(lVar45 + 0x148);
            *(undefined4 *)(lVar45 + 0x150) = *(undefined4 *)(lVar45 + 0x154);
            *(undefined1 *)(lVar45 + 0x158) = 1;
          }
          uStack_40 = 0x7ff70c832d38;
          cVar26 = FUN_7ff70c878fb0(&UNK_7ff70cb83803);
          lVar45 = _DAT_7ff70cc1a3c0;
          if (cVar26 != '\0') {
            *(undefined1 *)(_DAT_7ff70cc1a3c0 + 0x27f1) = 1;
          }
          lVar45 = *(longlong *)(lVar45 + 0x1440);
          puVar36 = &UNK_7ff70cb907b1;
          if (*(char *)(lVar45 + 0xd1) == '\0') {
            *(ulonglong *)(lVar45 + 0x118) =
                 CONCAT44((float)((ulonglong)*(undefined8 *)(lVar45 + 0x120) >> 0x20) +
                          _UNK_7ff70cb1d8a4,
                          (float)*(undefined8 *)(lVar45 + 0x120) + _DAT_7ff70cb1d8a0);
            *(undefined8 *)(lVar45 + 0x140) = *(undefined8 *)(lVar45 + 0x148);
            *(undefined4 *)(lVar45 + 0x150) = *(undefined4 *)(lVar45 + 0x154);
            *(undefined1 *)(lVar45 + 0x158) = 1;
          }
        }
        else {
          puVar36 = &UNK_7ff70cb907e3;
        }
        uStack_40 = 0x7ff70c832daa;
        FUN_7ff70c876e30(puVar36);
        lVar45 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
        if (*(char *)(lVar45 + 0xd1) == '\0') {
          *(ulonglong *)(lVar45 + 0x118) =
               CONCAT44((float)((ulonglong)*(undefined8 *)(lVar45 + 0x120) >> 0x20) +
                        _UNK_7ff70cb1d8a4,(float)*(undefined8 *)(lVar45 + 0x120) + _DAT_7ff70cb1d8a0
                       );
          *(undefined8 *)(lVar45 + 0x140) = *(undefined8 *)(lVar45 + 0x148);
          *(undefined4 *)(lVar45 + 0x150) = *(undefined4 *)(lVar45 + 0x154);
          *(undefined1 *)(lVar45 + 0x158) = 1;
        }
        uStack_40 = 0x7ff70c832e08;
        cVar26 = FUN_7ff70c878fb0(&UNK_7ff70cb84a4a);
        if ((cVar26 != '\0') && (*(code **)(lVar7 + 0xbf8) != (code *)0x0)) {
          uStack_40 = 0x7ff70c832e24;
          (**(code **)(lVar7 + 0xbf8))(lVar7,&UNK_7ff70cb8730a);
        }
        lVar45 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
        if (*(char *)(lVar45 + 0xd1) == '\0') {
          *(ulonglong *)(lVar45 + 0x118) =
               CONCAT44((float)((ulonglong)*(undefined8 *)(lVar45 + 0x120) >> 0x20) +
                        _UNK_7ff70cb1d8a4,(float)*(undefined8 *)(lVar45 + 0x120) + _DAT_7ff70cb1d8a0
                       );
          *(undefined8 *)(lVar45 + 0x140) = *(undefined8 *)(lVar45 + 0x148);
          *(undefined4 *)(lVar45 + 0x150) = *(undefined4 *)(lVar45 + 0x154);
          *(undefined1 *)(lVar45 + 0x158) = 1;
        }
        uStack_40 = 0x7ff70c832e82;
        FUN_7ff70c876e30(&UNK_7ff70cb8f76e);
        uStack_40 = 0x7ff70c832e87;
        FUN_7ff70c84a8c0();
      }
    }
  }
  if (0 < *(int *)(lVar7 + 0x278c)) {
    uStack_40 = 0x7ff70c832e99;
    cVar26 = FUN_7ff70c849860();
    if (cVar26 != '\0') {
      uStack_40 = 0x7ff70c832ea6;
      FUN_7ff70c87d690();
      uStack_40 = 0x7ff70c832eb2;
      FUN_7ff70c876e30(&UNK_7ff70cb8afeb);
      lVar45 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
      if (*(char *)(lVar45 + 0xd1) == '\0') {
        *(float *)(lVar45 + 0x118) =
             *(float *)(_DAT_7ff70cc1a3c0 + 0xc9c) + *(float *)(lVar45 + 0x120);
        *(undefined4 *)(lVar45 + 0x11c) = *(undefined4 *)(lVar45 + 0x124);
        *(undefined8 *)(lVar45 + 0x140) = *(undefined8 *)(lVar45 + 0x148);
        *(undefined4 *)(lVar45 + 0x150) = *(undefined4 *)(lVar45 + 0x154);
        *(undefined1 *)(lVar45 + 0x158) = 1;
        uStack_40 = 0x7ff70c832fd8;
        cVar26 = FUN_7ff70c878fb0(&UNK_7ff70cb81899);
        if (cVar26 != '\0') goto LAB_7ff70c832fe0;
LAB_7ff70c832ee1:
        lVar7 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
        cVar26 = *(char *)(lVar7 + 0xd1);
      }
      else {
        uStack_40 = 0x7ff70c832ed9;
        cVar26 = FUN_7ff70c878fb0(&UNK_7ff70cb81899);
        if (cVar26 == '\0') goto LAB_7ff70c832ee1;
LAB_7ff70c832fe0:
        *(undefined1 *)(lVar7 + 0x7d) = 1;
        lVar7 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
        cVar26 = *(char *)(lVar7 + 0xd1);
      }
      if (cVar26 == '\0') {
        *(ulonglong *)(lVar7 + 0x118) =
             CONCAT44((float)((ulonglong)*(undefined8 *)(lVar7 + 0x120) >> 0x20) + _UNK_7ff70cb1d8a4
                      ,(float)*(undefined8 *)(lVar7 + 0x120) + _DAT_7ff70cb1d8a0);
        *(undefined8 *)(lVar7 + 0x140) = *(undefined8 *)(lVar7 + 0x148);
        *(undefined4 *)(lVar7 + 0x150) = *(undefined4 *)(lVar7 + 0x154);
        *(undefined1 *)(lVar7 + 0x158) = 1;
      }
      uStack_40 = 0x7ff70c832f3f;
      FUN_7ff70c876e30(&UNK_7ff70cb8f76e);
      lVar7 = _DAT_7ff70cc1a3c0;
      if (_DAT_7ff70cbebd80 != (uVar31 ^ (ulonglong)auStack_38)) goto LAB_7ff70c833004;
      plVar42 = (longlong *)auStack_48;
      lVar45 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
      if (((longlong)*(int *)(_DAT_7ff70cc1a3c0 + 0x1410) < 2) &&
         (*(char *)(_DAT_7ff70cc1a3c0 + 0x1399) == '\x01')) {
        if (_DAT_7ff70cbebd80 != (_DAT_7ff70cbebd80 ^ (ulonglong)auStack_48 ^ (ulonglong)auStack_48)
           ) goto LAB_7ff70c84afc8;
        lVar45 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
        if (*(char *)(_DAT_7ff70cc1a3c0 + 0x7e) == '\x01') {
          if (*(char *)(_DAT_7ff70cc1a3c0 + 0x2788) == '\x01') {
            if ((*(byte *)(_DAT_7ff70cc1a3c0 + 0x27b4) & 1) == 0) {
              *(int *)(_DAT_7ff70cc1a3c0 + 0x27e0) = *(int *)(_DAT_7ff70cc1a3c0 + 0x27e0) + 1;
              goto LAB_7ff70c80aff6;
            }
            FUN_7ff70c800cf0(&UNK_7ff70cb9198a,*(undefined1 *)(_DAT_7ff70cc1a3c0 + 0x7d),1,
                             *(undefined1 *)(_DAT_7ff70cc1a3c0 + 0x7f));
            bVar4 = *(byte *)(lVar7 + 0x27b4);
          }
          else {
LAB_7ff70c80aff6:
            bVar4 = *(byte *)(lVar7 + 0x27b4);
          }
          if ((bVar4 & 1) == 0) {
            *(int *)(lVar7 + 0x27e0) = *(int *)(lVar7 + 0x27e0) + 1;
            *(undefined1 *)(lVar7 + 0x2788) = 0;
            cVar26 = *(char *)(lVar7 + 0x7f);
            lVar44 = _DAT_7ff70cc1a3c0;
          }
          else {
            if (lVar45 == 0) {
              puVar36 = &UNK_7ff70cb8a129;
            }
            else {
              puVar36 = *(undefined **)(lVar45 + 8);
            }
            FUN_7ff70c800cf0(&UNK_7ff70cb90f26,puVar36,&UNK_7ff70cb9015c);
            *(undefined1 *)(lVar7 + 0x2788) = 0;
            cVar26 = *(char *)(lVar7 + 0x7f);
            lVar44 = _DAT_7ff70cc1a3c0;
          }
        }
        else {
          *(undefined1 *)(_DAT_7ff70cc1a3c0 + 0x2788) = 0;
          cVar26 = *(char *)(lVar7 + 0x7f);
          lVar44 = _DAT_7ff70cc1a3c0;
        }
        _DAT_7ff70cc1a3c0 = lVar44;
        if (cVar26 != '\x01') {
          pcVar6 = *(code **)(lVar7 + 0x2770);
          goto joined_r0x7ff70c80b41a;
        }
        if (*(char *)(lVar7 + 0x1398) == '\x01') {
          pcVar39 = "Tooltip_Error";
          uVar27 = 0xffffffff;
          do {
            cVar26 = pcVar39[-2];
            if (cVar26 == '#') {
              if ((pcVar39[-1] == '#') && (*pcVar39 == '#')) {
                uVar27 = 0xffffffff;
              }
            }
            else if (cVar26 == '\0') goto LAB_7ff70c80b0c7;
            uVar27 = crc32(uVar27,cVar26);
            pcVar39 = pcVar39 + 1;
          } while( true );
        }
        goto LAB_7ff70c80b40a;
      }
      lVar44 = (longlong)*(int *)(_DAT_7ff70cc1a3c0 + 0x1410) * 0x78 +
               *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1418);
      if (((*(byte *)(lVar45 + 0x17) & 1) != 0) &&
         (*(int *)(_DAT_7ff70cc1a3c0 + 0x1394) != *(int *)(lVar45 + 0x10))) {
        lStack_50 = 0x7ff70c84a951;
        FUN_7ff70c80af70(&UNK_7ff70cb9067f);
      }
      if (*(longlong *)(lVar45 + 0x1c8) != 0) {
        lStack_50 = 0x7ff70c84a960;
        FUN_7ff70c912b60();
      }
      lVar30 = _DAT_7ff70cc1a3c0;
      if (*(char *)(lVar45 + 0xd2) == '\0') {
        *(undefined1 *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440) + 0xce) = 1;
        lVar30 = *(longlong *)(lVar30 + 0x1440);
        lStack_50 = 0x7ff70c84a991;
        FUN_7ff70c7b8130(*(undefined8 *)(lVar30 + 0x2c8));
        puVar3 = (undefined4 *)
                 (*(longlong *)(*(longlong *)(lVar30 + 0x2c8) + 0xa8) + -0x10 +
                 (longlong)*(int *)(*(longlong *)(lVar30 + 0x2c8) + 0xa0) * 0x10);
        uVar34 = puVar3[1];
        uVar10 = puVar3[2];
        uVar11 = puVar3[3];
        *(undefined4 *)(lVar30 + 0x260) = *puVar3;
        *(undefined4 *)(lVar30 + 0x264) = uVar34;
        *(undefined4 *)(lVar30 + 0x268) = uVar10;
        *(undefined4 *)(lVar30 + 0x26c) = uVar11;
      }
      lVar30 = _DAT_7ff70cc1a3c0;
      iVar38 = *(int *)(_DAT_7ff70cc1a3c0 + 0x1f20);
      if (*(short *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x27a8) + 0xc) < iVar38) {
        *(int *)(_DAT_7ff70cc1a3c0 + 0x1f20) = iVar38 + -1;
        if (iVar38 + -1 == 0) {
          uVar34 = 0;
        }
        else {
          uVar34 = *(undefined4 *)(*(longlong *)(lVar30 + 0x1f28) + -0x10 + (longlong)iVar38 * 8);
        }
        *(undefined4 *)(lVar30 + 0x1ddc) = uVar34;
        if (*(char *)(lVar44 + -10) != '\x01') goto LAB_7ff70c84aa1c;
LAB_7ff70c84aa0f:
        lVar30 = _DAT_7ff70cc1a3c0;
        if (*(longlong *)(lVar45 + 0x3c0) != lVar45) goto LAB_7ff70c84aa1c;
        *(short *)(_DAT_7ff70cc1a3c0 + 0x25a0) = *(short *)(_DAT_7ff70cc1a3c0 + 0x25a0) + -1;
        iVar38 = *(int *)(lVar30 + 0x1f30);
        *(int *)(lVar30 + 0x1f30) = iVar38 + -1;
        *(undefined4 *)(lVar30 + 0x1de0) =
             *(undefined4 *)(*(longlong *)(lVar30 + 0x1f38) + -8 + (longlong)iVar38 * 4);
        *(undefined4 *)(lVar30 + 0xc4c) =
             *(undefined4 *)
              (*(longlong *)(lVar30 + 0x1418) + -8 + (longlong)*(int *)(lVar30 + 0x1410) * 0x78);
        cVar26 = *(char *)(lVar45 + 0xd2);
      }
      else {
        lStack_50 = 0x7ff70c84a9f9;
        FUN_7ff70c80af70(&UNK_7ff70cb90134);
        if (*(char *)(lVar44 + -10) == '\x01') goto LAB_7ff70c84aa0f;
LAB_7ff70c84aa1c:
        cVar26 = *(char *)(lVar45 + 0xd2);
      }
      if (cVar26 == '\x01') {
        *(longlong *)(lVar45 + 0x2c8) = lVar45 + 0x2d0;
      }
      lVar30 = _DAT_7ff70cc1a3c0;
      plVar42 = (longlong *)auStack_48;
      if ((*(longlong *)(lVar7 + 0x2728) == lVar45) &&
         (plVar42 = (longlong *)auStack_48, *(char *)(_DAT_7ff70cc1a3c0 + 0x2720) == '\x01')) {
        lStack_50 = 0x7ff70c84aa61;
        FUN_7ff70c856f00(&UNK_7ff70cb922d3);
        uVar27 = *(uint *)(lVar30 + 0x2724) & 0xf;
        plVar42 = (longlong *)auStack_48;
        if (POPCOUNT(uVar27) == 1) {
          iVar38 = 0;
          for (; (uVar27 & 1) == 0; uVar27 = uVar27 >> 1 | 0x80000000) {
            iVar38 = iVar38 + 1;
          }
          if (iVar38 == 3) {
            plVar42 = (longlong *)auStack_48;
            if ((1 < *(int *)(lVar30 + 0x2738)) &&
               (plVar42 = (longlong *)auStack_48,
               *(code **)(_DAT_7ff70cc1a3c0 + 0xbe8) != (code *)0x0)) {
              lVar29 = 0x7ff70cc1a3c8;
              if (*(longlong *)(lVar30 + 0x2740) != 0) {
                lVar29 = *(longlong *)(lVar30 + 0x2740);
              }
              lStack_50 = 0x7ff70c84ab4b;
              (**(code **)(_DAT_7ff70cc1a3c0 + 0xbe8))(_DAT_7ff70cc1a3c0,lVar29);
              plVar42 = (longlong *)auStack_48;
            }
          }
          else if (iVar38 == 1) {
            uStack_58 = 0x7ff70c84ab15;
            lStack_50 = lVar44;
            func_0x7ff70d8b0830(*(undefined8 *)(lVar30 + 0x2730));
            plVar42 = &lStack_50;
          }
          else {
            plVar42 = (longlong *)auStack_48;
            if (iVar38 == 0) {
              lStack_50 = *(longlong *)(lVar30 + 0x2730);
              uStack_58 = 0x7ff70c84aaa1;
              func_0x7ff70d9df013();
              plVar42 = &lStack_50;
            }
          }
        }
        *(undefined1 *)(lVar30 + 0x14b2) = 0;
        *(undefined1 *)(lVar30 + 0x2720) = 0;
        *(undefined4 *)(lVar30 + 0x2724) = 0;
        *(undefined8 *)(lVar30 + 0x2730) = 0;
        lVar29 = *(longlong *)(lVar30 + 0x2740);
        if (lVar29 != 0) {
          *(undefined8 *)(lVar30 + 0x2738) = 0;
          lVar41 = _DAT_7ff70cc1a3c0;
          if (_DAT_7ff70cc1a3c0 != 0) {
            piVar2 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
            lVar47 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
            if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar47 * 8) == *piVar2) {
              sVar32 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar47 * 8) + 1;
            }
            else {
              iVar38 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
              *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar38;
              lVar47 = (longlong)iVar38;
              *(int *)(lVar41 + 0x2874 + lVar47 * 8) = *piVar2;
              *(undefined4 *)(lVar41 + 0x2878 + lVar47 * 8) = 0;
              sVar32 = 1;
            }
            *(short *)(lVar41 + 0x287a + lVar47 * 8) = sVar32;
            *(int *)(lVar41 + 0x286c) = *(int *)(lVar41 + 0x286c) + 1;
          }
          *(undefined8 *)((longlong)plVar42 + -8) = 0x7ff70c84ac21;
          (*_DAT_7ff70cbe9468)(lVar29,_DAT_7ff70cc1a3d0);
          *(undefined8 *)(lVar30 + 0x2740) = 0;
        }
      }
      if (*(char *)(lVar45 + 0x159) == '\x01') {
        lVar30 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440);
        *(undefined1 *)(lVar30 + 0x159) = 0;
        if (((*(float *)(lVar30 + 0x130) < *(float *)(lVar30 + 0x118)) ||
            (*(float *)(lVar30 + 0x134) < *(float *)(lVar30 + 0x11c))) &&
           (*(char *)(lVar30 + 0xd1) == '\0')) {
          *(undefined8 *)((longlong)plVar42 + -8) = 0x7ff70c84ac81;
          FUN_7ff70c80af70(&UNK_7ff70cb8c7e7);
        }
      }
      uVar24 = *(undefined8 *)(lVar44 + -0x28);
      *(undefined8 *)(lVar7 + 0x1e60) = *(undefined8 *)(lVar44 + -0x30);
      *(undefined8 *)(lVar7 + 0x1e68) = uVar24;
      uVar34 = *(undefined4 *)(lVar44 + -0x70);
      uVar10 = *(undefined4 *)(lVar44 + -0x6c);
      uVar11 = *(undefined4 *)(lVar44 + -0x68);
      uVar12 = *(undefined4 *)(lVar44 + -100);
      uVar13 = *(undefined4 *)(lVar44 + -0x60);
      uVar14 = *(undefined4 *)(lVar44 + -0x5c);
      uVar15 = *(undefined4 *)(lVar44 + -0x58);
      uVar16 = *(undefined4 *)(lVar44 + -0x54);
      uVar17 = *(undefined4 *)(lVar44 + -0x50);
      uVar18 = *(undefined4 *)(lVar44 + -0x4c);
      uVar19 = *(undefined4 *)(lVar44 + -0x48);
      uVar20 = *(undefined4 *)(lVar44 + -0x44);
      uVar21 = *(undefined4 *)(lVar44 + -0x3c);
      uVar22 = *(undefined4 *)(lVar44 + -0x38);
      uVar23 = *(undefined4 *)(lVar44 + -0x34);
      *(undefined4 *)(lVar7 + 0x1e50) = *(undefined4 *)(lVar44 + -0x40);
      *(undefined4 *)(lVar7 + 0x1e54) = uVar21;
      *(undefined4 *)(lVar7 + 0x1e58) = uVar22;
      *(undefined4 *)(lVar7 + 0x1e5c) = uVar23;
      *(undefined4 *)(lVar7 + 0x1e40) = uVar17;
      *(undefined4 *)(lVar7 + 0x1e44) = uVar18;
      *(undefined4 *)(lVar7 + 0x1e48) = uVar19;
      *(undefined4 *)(lVar7 + 0x1e4c) = uVar20;
      *(undefined4 *)(lVar7 + 0x1e30) = uVar13;
      *(undefined4 *)(lVar7 + 0x1e34) = uVar14;
      *(undefined4 *)(lVar7 + 0x1e38) = uVar15;
      *(undefined4 *)(lVar7 + 0x1e3c) = uVar16;
      *(undefined4 *)(lVar7 + 0x1e20) = uVar34;
      *(undefined4 *)(lVar7 + 0x1e24) = uVar10;
      *(undefined4 *)(lVar7 + 0x1e28) = uVar11;
      *(undefined4 *)(lVar7 + 0x1e2c) = uVar12;
      if ((*(uint *)(lVar45 + 0x14) & 0x10000000) == 0) {
        if ((*(uint *)(lVar45 + 0x14) & 0x4000000) == 0) goto LAB_7ff70c84acd1;
LAB_7ff70c84ad6f:
        *(int *)(lVar7 + 0x1f60) = *(int *)(lVar7 + 0x1f60) + -1;
        cVar26 = *(char *)(lVar7 + 0x7c);
      }
      else {
        *(int *)(lVar7 + 0x2510) = *(int *)(lVar7 + 0x2510) + -1;
        if ((*(uint *)(lVar45 + 0x14) & 0x4000000) != 0) goto LAB_7ff70c84ad6f;
LAB_7ff70c84acd1:
        cVar26 = *(char *)(lVar7 + 0x7c);
      }
      if (cVar26 == '\x01') {
        *(undefined8 *)((longlong)plVar42 + -8) = 0x7ff70c84ace3;
        FUN_7ff70c83b170(lVar44 + -0x20);
      }
      lVar44 = (longlong)*(int *)(lVar7 + 0x1410) + -1;
      iVar38 = (int)lVar44;
      *(int *)(lVar7 + 0x1410) = iVar38;
      lVar45 = _DAT_7ff70cc1a3c0;
      if (iVar38 == 0) {
        *(undefined8 *)(_DAT_7ff70cc1a3c0 + 0x1440) = 0;
LAB_7ff70c84ad96:
        *(undefined8 *)(lVar45 + 0x27a8) = 0;
        *(undefined8 *)(lVar45 + 0x2278) = 0;
        *(undefined4 *)(lVar45 + 0x1140) = 0x3f800000;
      }
      else {
        lVar7 = *(longlong *)(*(longlong *)(lVar7 + 0x1418) + -0x78 + lVar44 * 0x78);
        *(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440) = lVar7;
        if (lVar7 == 0) goto LAB_7ff70c84ad96;
        *(longlong *)(lVar45 + 0x27a8) =
             *(longlong *)(lVar45 + 0x1418) + (longlong)*(int *)(lVar45 + 0x1410) * 0x78 + -0x20;
        if ((longlong)*(int *)(lVar7 + 0x1d0) == -1) {
          lVar44 = 0;
        }
        else {
          lVar44 = (longlong)*(int *)(lVar7 + 0x1d0) * 0x250 + *(longlong *)(lVar45 + 0x22a0);
        }
        *(longlong *)(lVar45 + 0x2278) = lVar44;
        *(undefined4 *)(lVar45 + 0x1140) = 0x3f800000;
        uVar5 = *(undefined1 *)(lVar7 + 0xd1);
        *(undefined1 *)(lVar7 + 0xd1) = 0;
        if ((*(uint *)(lVar45 + 0xc) & 0x10) != 0) {
          fVar48 = *(float *)(*(longlong *)(lVar7 + 0x20) + 0x18);
          if ((fVar48 == 0.0) && (!NAN(fVar48))) {
            fVar48 = *(float *)(lVar45 + 0x18);
          }
          *(float *)(lVar45 + 0x113c) = fVar48;
        }
        lVar44 = *(longlong *)(lVar45 + 0x1440);
        fVar48 = *(float *)(lVar45 + 0x1134);
        *(float *)(lVar45 + 0xc40) = fVar48;
        if (lVar44 == 0) {
          fVar48 = fVar48 * *(float *)(lVar45 + 0xc44) * *(float *)(lVar45 + 0xc48) *
                   *(float *)(lVar45 + 0xbc0);
          lVar30 = *(longlong *)(lVar45 + 0x1120);
joined_r0x7ff70c84af36:
          if (lVar30 != 0) {
            fVar48 = fVar48 * *(float *)(lVar30 + 0x48);
          }
          iVar38 = (int)(fVar48 + _DAT_7ff70cb1ba70);
          if (iVar38 < 1) {
            fVar48 = _DAT_7ff70cb1ba2c;
            if (lVar30 == 0) goto LAB_7ff70c84aefc;
LAB_7ff70c84aea1:
            if ((*(uint *)(lVar45 + 0xc) & 0x10) != 0) {
              *(undefined4 *)(lVar30 + 0x14) = *(undefined4 *)(lVar45 + 0x113c);
              lVar30 = *(longlong *)(lVar45 + 0x1120);
            }
            *(float *)(lVar45 + 0x1130) = fVar48;
            bVar37 = lVar30 == 0 || lVar44 == 0;
            if (bVar37) {
              lVar29 = 0;
            }
            else {
              *(undefined8 *)((longlong)plVar42 + -8) = 0x7ff70c84aede;
              lVar29 = FUN_7ff70c7e5630(lVar30,CONCAT31((int3)((uint)iVar38 >> 8),bVar37),
                                        _DAT_7ff70cb1bae8);
              lVar30 = *(longlong *)(lVar45 + 0x1120);
              fVar48 = *(float *)(lVar45 + 0x1130);
            }
            *(longlong *)(lVar45 + 0x1128) = lVar29;
            fVar49 = 0.0;
            if ((lVar44 != 0) && (lVar30 != 0)) {
              fVar49 = fVar48 / *(float *)(lVar29 + 0x14);
            }
          }
          else {
            fVar49 = (float)(int)(fVar48 + _DAT_7ff70cb1ba70);
            fVar48 = _DAT_7ff70cb1d620;
            if (fVar49 <= _DAT_7ff70cb1d620) {
              fVar48 = fVar49;
            }
            if (lVar30 != 0) goto LAB_7ff70c84aea1;
LAB_7ff70c84aefc:
            *(float *)(lVar45 + 0x1130) = fVar48;
            *(undefined8 *)(lVar45 + 0x1128) = 0;
            fVar49 = 0.0;
          }
          *(float *)(lVar45 + 0x1138) = fVar49;
          *(float *)(lVar45 + 0x1168) = fVar48;
          *(float *)(lVar45 + 0x116c) = fVar49;
          lVar45 = _DAT_7ff70cc1a3c0;
        }
        else if ((*(char *)(lVar44 + 0xd1) != '\x01') ||
                ((*(longlong *)(lVar45 + 0x2278) != 0 &&
                 (*(int *)(*(longlong *)(lVar45 + 0x2278) + 0x74) == -1)))) {
          fVar48 = fVar48 * *(float *)(lVar45 + 0xc44) * *(float *)(lVar45 + 0xc48) *
                   *(float *)(lVar44 + 0x2b8) * *(float *)(lVar45 + 0xbc0);
          lVar30 = *(longlong *)(lVar45 + 0x1120);
          goto joined_r0x7ff70c84af36;
        }
        *(undefined1 *)(lVar7 + 0xd1) = uVar5;
        if (*(longlong *)(lVar45 + 0x2278) == 0) {
          bVar37 = *(longlong *)(*(longlong *)(lVar45 + 0x1440) + 0x1c8) == 0;
        }
        else {
          bVar37 = false;
        }
        *(bool *)(*(longlong *)(lVar45 + 0x1440) + 0x178) = bVar37;
      }
      if (_DAT_7ff70cbebd80 == (*(ulonglong *)((longlong)plVar42 + 0x20) ^ (ulonglong)plVar42)) {
        return *(ulonglong *)((longlong)plVar42 + 0x20) ^ (ulonglong)plVar42;
      }
LAB_7ff70c84afc8:
      *(undefined8 *)((longlong)plVar42 + -8) = 0x7ff70c84afd5;
      FUN_7ff70caa97e0(*(ulonglong *)((longlong)plVar42 + 0x20) ^ (ulonglong)plVar42);
      pcVar6 = (code *)swi(3);
      uVar31 = (*pcVar6)();
      return uVar31;
    }
  }
  if (_DAT_7ff70cbebd80 == (uVar31 ^ (ulonglong)auStack_38)) {
    return uVar31 ^ (ulonglong)auStack_38;
  }
LAB_7ff70c833004:
  uStack_40 = 0x7ff70c833011;
  FUN_7ff70caa97e0(uVar31 ^ (ulonglong)auStack_38);
  pcVar6 = (code *)swi(3);
  uVar31 = (*pcVar6)();
  return uVar31;
LAB_7ff70c80b0c7:
  puVar35 = *(uint **)(lVar44 + 0x1428);
  puVar40 = puVar35 + (longlong)*(int *)(lVar44 + 0x1420) * 4;
  uVar31 = (longlong)*(int *)(lVar44 + 0x1420);
  while (uVar25 = uVar31, uVar25 != 0) {
    uVar31 = uVar25 >> 1;
    if (puVar35[uVar31 * 4] < ~uVar27) {
      puVar35 = puVar35 + uVar31 * 4 + 4;
      uVar31 = ~uVar31 + uVar25;
    }
  }
  if ((((puVar35 == puVar40) || (*puVar35 != ~uVar27)) || (*(longlong *)(puVar35 + 2) == 0)) ||
     (*(char *)(lVar44 + 0xfc) == '\0')) {
    fVar48 = *(float *)(lVar44 + 0xd94);
    fVar49 = *(float *)(lVar44 + 0xd98);
    fVar8 = *(float *)(lVar44 + 0xd9c);
    fVar9 = *(float *)(lVar44 + 0xda0);
    uStack_68 = *(undefined8 *)(lVar44 + 0xd94);
    uStack_60 = *(undefined4 *)(lVar44 + 0xd9c);
    uStack_5c = *(undefined4 *)(lVar44 + 0xda0);
    iVar38 = *(int *)(lVar44 + 0x1ef0);
    if (iVar38 == *(int *)(lVar44 + 0x1ef4)) {
      if (iVar38 == 0) {
        iVar33 = 8;
      }
      else {
        iVar33 = iVar38 / 2 + iVar38;
      }
      iVar43 = iVar38 + 1;
      if (iVar38 + 1 < iVar33) {
        iVar43 = iVar33;
      }
      lVar30 = (*_DAT_7ff70cbe9460)((longlong)iVar43 * 0x14,_DAT_7ff70cc1a3d0);
      lVar29 = _DAT_7ff70cc1a3c0;
      if (_DAT_7ff70cc1a3c0 != 0) {
        piVar2 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar41 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar41 * 8) == *piVar2) {
          sVar32 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar41 * 8) + 1;
        }
        else {
          iVar38 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar38;
          lVar41 = (longlong)iVar38;
          *(int *)(lVar29 + 0x2874 + lVar41 * 8) = *piVar2;
          *(undefined4 *)(lVar29 + 0x2878 + lVar41 * 8) = 0;
          sVar32 = 1;
        }
        *(short *)(lVar29 + 0x2878 + lVar41 * 8) = sVar32;
        *(int *)(lVar29 + 0x2868) = *(int *)(lVar29 + 0x2868) + 1;
      }
      if (*(longlong *)(lVar44 + 0x1ef8) != 0) {
        FUN_7ff70cb12b60(lVar30,*(longlong *)(lVar44 + 0x1ef8),
                         (longlong)*(int *)(lVar44 + 0x1ef0) * 0x14);
        lVar41 = _DAT_7ff70cc1a3c0;
        lVar29 = *(longlong *)(lVar44 + 0x1ef8);
        if ((lVar29 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
          piVar2 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
          lVar47 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
          if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar47 * 8) == *piVar2) {
            sVar32 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar47 * 8) + 1;
          }
          else {
            iVar38 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
            *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar38;
            lVar47 = (longlong)iVar38;
            *(int *)(lVar41 + 0x2874 + lVar47 * 8) = *piVar2;
            *(undefined4 *)(lVar41 + 0x2878 + lVar47 * 8) = 0;
            sVar32 = 1;
          }
          *(short *)(lVar41 + 0x287a + lVar47 * 8) = sVar32;
          *(int *)(lVar41 + 0x286c) = *(int *)(lVar41 + 0x286c) + 1;
        }
        (*_DAT_7ff70cbe9468)(lVar29,_DAT_7ff70cc1a3d0);
      }
      *(longlong *)(lVar44 + 0x1ef8) = lVar30;
      *(int *)(lVar44 + 0x1ef4) = iVar43;
      iVar38 = *(int *)(lVar44 + 0x1ef0);
    }
    else {
      lVar30 = *(longlong *)(lVar44 + 0x1ef8);
    }
    *(undefined4 *)(lVar30 + (longlong)iVar38 * 0x14) = 4;
    puVar3 = (undefined4 *)(lVar30 + 4 + (longlong)iVar38 * 0x14);
    *puVar3 = (undefined4)uStack_68;
    puVar3[1] = uStack_68._4_4_;
    puVar3[2] = uStack_60;
    puVar3[3] = uStack_5c;
    *(int *)(lVar44 + 0x1ef0) = *(int *)(lVar44 + 0x1ef0) + 1;
    if (*(int *)(lVar44 + 0x1eec) != 4) {
      fVar50 = (_UNK_7ff70cb1d634 - fVar49) * _UNK_7ff70cb1d644;
      fVar51 = (_UNK_7ff70cb1d638 - fVar8) * _UNK_7ff70cb1d648;
      fVar52 = (_UNK_7ff70cb1d63c - fVar9) * _UNK_7ff70cb1d64c;
      *(float *)(lVar44 + 0xd94) = (_DAT_7ff70cb1d630 - fVar48) * _DAT_7ff70cb1d640 + fVar48;
      *(float *)(lVar44 + 0xd98) = fVar50 + fVar49;
      *(float *)(lVar44 + 0xd9c) = fVar51 + fVar8;
      *(float *)(lVar44 + 0xda0) = fVar52 + fVar9;
    }
  }
  else {
    cVar26 = *(char *)(*(longlong *)(puVar35 + 2) + 0xcd);
    fVar48 = *(float *)(lVar44 + 0xd94);
    fVar49 = *(float *)(lVar44 + 0xd98);
    fVar8 = *(float *)(lVar44 + 0xd9c);
    fVar9 = *(float *)(lVar44 + 0xda0);
    uStack_68 = *(undefined8 *)(lVar44 + 0xd94);
    uStack_60 = *(undefined4 *)(lVar44 + 0xd9c);
    uStack_5c = *(undefined4 *)(lVar44 + 0xda0);
    iVar38 = *(int *)(lVar44 + 0x1ef0);
    if (iVar38 == *(int *)(lVar44 + 0x1ef4)) {
      if (iVar38 == 0) {
        iVar33 = 8;
      }
      else {
        iVar33 = iVar38 / 2 + iVar38;
      }
      iVar43 = iVar38 + 1;
      if (iVar38 + 1 < iVar33) {
        iVar43 = iVar33;
      }
      lVar30 = (*_DAT_7ff70cbe9460)((longlong)iVar43 * 0x14,_DAT_7ff70cc1a3d0);
      lVar29 = _DAT_7ff70cc1a3c0;
      if (_DAT_7ff70cc1a3c0 != 0) {
        piVar2 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
        lVar41 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
        if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar41 * 8) == *piVar2) {
          sVar32 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar41 * 8) + 1;
        }
        else {
          iVar38 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
          *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar38;
          lVar41 = (longlong)iVar38;
          *(int *)(lVar29 + 0x2874 + lVar41 * 8) = *piVar2;
          *(undefined4 *)(lVar29 + 0x2878 + lVar41 * 8) = 0;
          sVar32 = 1;
        }
        *(short *)(lVar29 + 0x2878 + lVar41 * 8) = sVar32;
        *(int *)(lVar29 + 0x2868) = *(int *)(lVar29 + 0x2868) + 1;
      }
      if (*(longlong *)(lVar44 + 0x1ef8) != 0) {
        FUN_7ff70cb12b60(lVar30,*(longlong *)(lVar44 + 0x1ef8),
                         (longlong)*(int *)(lVar44 + 0x1ef0) * 0x14);
        lVar41 = _DAT_7ff70cc1a3c0;
        lVar29 = *(longlong *)(lVar44 + 0x1ef8);
        if ((lVar29 != 0) && (_DAT_7ff70cc1a3c0 != 0)) {
          piVar2 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
          lVar47 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
          if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar47 * 8) == *piVar2) {
            sVar32 = *(short *)(_DAT_7ff70cc1a3c0 + 0x287a + lVar47 * 8) + 1;
          }
          else {
            iVar38 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
            *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar38;
            lVar47 = (longlong)iVar38;
            *(int *)(lVar41 + 0x2874 + lVar47 * 8) = *piVar2;
            *(undefined4 *)(lVar41 + 0x2878 + lVar47 * 8) = 0;
            sVar32 = 1;
          }
          *(short *)(lVar41 + 0x287a + lVar47 * 8) = sVar32;
          *(int *)(lVar41 + 0x286c) = *(int *)(lVar41 + 0x286c) + 1;
        }
        (*_DAT_7ff70cbe9468)(lVar29,_DAT_7ff70cc1a3d0);
      }
      *(longlong *)(lVar44 + 0x1ef8) = lVar30;
      *(int *)(lVar44 + 0x1ef4) = iVar43;
      iVar38 = *(int *)(lVar44 + 0x1ef0);
    }
    else {
      lVar30 = *(longlong *)(lVar44 + 0x1ef8);
    }
    *(undefined4 *)(lVar30 + (longlong)iVar38 * 0x14) = 4;
    puVar3 = (undefined4 *)(lVar30 + 4 + (longlong)iVar38 * 0x14);
    *puVar3 = (undefined4)uStack_68;
    puVar3[1] = uStack_68._4_4_;
    puVar3[2] = uStack_60;
    puVar3[3] = uStack_5c;
    *(int *)(lVar44 + 0x1ef0) = *(int *)(lVar44 + 0x1ef0) + 1;
    if (*(int *)(lVar44 + 0x1eec) != 4) {
      fVar50 = (_UNK_7ff70cb1d634 - fVar49) * _UNK_7ff70cb1d644;
      fVar51 = (_UNK_7ff70cb1d638 - fVar8) * _UNK_7ff70cb1d648;
      fVar52 = (_UNK_7ff70cb1d63c - fVar9) * _UNK_7ff70cb1d64c;
      *(float *)(lVar44 + 0xd94) = (_DAT_7ff70cb1d630 - fVar48) * _DAT_7ff70cb1d640 + fVar48;
      *(float *)(lVar44 + 0xd98) = fVar50 + fVar49;
      *(float *)(lVar44 + 0xd9c) = fVar51 + fVar8;
      *(float *)(lVar44 + 0xda0) = fVar52 + fVar9;
    }
    lVar30 = _DAT_7ff70cc1a3c0;
    if (cVar26 != '\0') {
      *(uint *)(_DAT_7ff70cc1a3c0 + 0x1e70) = *(uint *)(_DAT_7ff70cc1a3c0 + 0x1e70) | 1;
      *(undefined8 *)(lVar30 + 0x1e80) = *(undefined8 *)(lVar44 + 0x2780);
      *(undefined8 *)(lVar30 + 0x1e88) = 0;
      *(undefined4 *)(lVar30 + 0x1e74) = 1;
    }
  }
  cVar26 = FUN_7ff70c826d00(&UNK_7ff70cb834df,0,0x200016f);
  FUN_7ff70c80a7b0(1);
  if (cVar26 != '\0') {
    if (*(short *)(*(longlong *)(lVar44 + 0x1440) + 0xda) == 1) {
      FUN_7ff70c87dd50(&UNK_7ff70cb8a1ee);
      lVar47 = _DAT_7ff70cc1a3c0;
      lVar30 = *(longlong *)(lVar44 + 0x1440);
      lVar29 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x13e8);
      iVar38 = *(int *)(_DAT_7ff70cc1a3c0 + 0x13e0);
      lVar41 = *(longlong *)(lVar29 + -8 + (longlong)iVar38 * 8);
      if (((lVar41 != lVar30) && (1 < iVar38)) && (*(longlong *)(lVar41 + 0x3c0) != lVar30)) {
        uVar31 = (ulonglong)(iVar38 - 1);
        iVar38 = 1;
        do {
          uVar27 = (int)uVar31 - 1;
          uVar31 = (ulonglong)uVar27;
          if (*(longlong *)(lVar29 + uVar31 * 8) == lVar30) {
            FUN_7ff70cb12b70(lVar29 + uVar31 * 8,lVar29 + uVar31 * 8 + 8,(longlong)iVar38 << 3);
            *(longlong *)
             (*(longlong *)(lVar47 + 0x13e8) + -8 + (longlong)*(int *)(lVar47 + 0x13e0) * 8) =
                 lVar30;
            lVar30 = *(longlong *)(lVar44 + 0x1440);
            break;
          }
          iVar38 = iVar38 + 1;
        } while (0 < (int)uVar27);
      }
      lVar41 = _DAT_7ff70cc1a3c0;
      lVar29 = *(longlong *)(_DAT_7ff70cc1a3c0 + 0x13f8);
      if (*(longlong *)(lVar29 + -8 + (longlong)*(int *)(_DAT_7ff70cc1a3c0 + 0x13f0) * 8) != lVar30)
      {
        iVar33 = (int)*(short *)(lVar30 + 0xe2);
        lVar28 = (longlong)*(int *)(_DAT_7ff70cc1a3c0 + 0x13f0) + -1;
        iVar38 = (int)lVar28;
        lVar47 = lVar28;
        if (iVar38 - iVar33 != 0 && iVar33 <= iVar38) {
          lVar46 = (longlong)iVar33;
          lVar47 = (longlong)iVar38;
          lVar29 = lVar46;
          if ((iVar38 - iVar33 & 1U) != 0) {
            lVar29 = lVar46 + 1;
            *(undefined8 *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x13f8) + lVar46 * 8) =
                 *(undefined8 *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x13f8) + 8 + lVar46 * 8);
            psVar1 = (short *)(*(longlong *)(*(longlong *)(lVar41 + 0x13f8) + lVar46 * 8) + 0xe2);
            *psVar1 = *psVar1 + -1;
          }
          if (lVar47 + -1 != lVar46) {
            do {
              *(undefined8 *)(*(longlong *)(lVar41 + 0x13f8) + lVar29 * 8) =
                   *(undefined8 *)(*(longlong *)(lVar41 + 0x13f8) + 8 + lVar29 * 8);
              psVar1 = (short *)(*(longlong *)(*(longlong *)(lVar41 + 0x13f8) + lVar29 * 8) + 0xe2);
              *psVar1 = *psVar1 + -1;
              *(undefined8 *)(*(longlong *)(lVar41 + 0x13f8) + 8 + lVar29 * 8) =
                   *(undefined8 *)(*(longlong *)(lVar41 + 0x13f8) + 0x10 + lVar29 * 8);
              psVar1 = (short *)(*(longlong *)(*(longlong *)(lVar41 + 0x13f8) + 8 + lVar29 * 8) +
                                0xe2);
              *psVar1 = *psVar1 + -1;
              lVar29 = lVar29 + 2;
            } while (lVar47 != lVar29);
          }
          lVar29 = *(longlong *)(lVar41 + 0x13f8);
        }
        *(longlong *)(lVar29 + lVar47 * 8) = lVar30;
        *(short *)(lVar30 + 0xe2) = (short)lVar28;
      }
      *(undefined8 *)(lVar44 + 0x2780) =
           *(undefined8 *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440) + 0x28);
      iVar38 = *(int *)(lVar7 + 0x278c);
    }
    else {
      iVar38 = *(int *)(lVar7 + 0x278c);
    }
    if (iVar38 < 0x14) {
      if (lVar45 == 0) {
        FUN_7ff70c876e30(&UNK_7ff70cb8306a,&UNK_7ff70cb8a129,&UNK_7ff70cb9015c);
      }
      else {
        FUN_7ff70c876e30(&UNK_7ff70cb8306a,*(undefined8 *)(lVar45 + 8),&UNK_7ff70cb9015c);
        lVar44 = _DAT_7ff70cc1a3c0;
        if ((*(char *)(lVar45 + 0xd5) != '\x01') || (*(char *)(lVar45 + 0xcd) == '\x01')) {
          lVar30 = **(longlong **)(_DAT_7ff70cc1a3c0 + 0x1f88);
          lVar29 = *(longlong *)(lVar30 + 0x50);
          if (lVar29 == 0) {
            lVar29 = (*_DAT_7ff70cbe9460)(0xe0,_DAT_7ff70cc1a3d0);
            lVar41 = _DAT_7ff70cc1a3c0;
            if (_DAT_7ff70cc1a3c0 != 0) {
              piVar2 = (int *)(_DAT_7ff70cc1a3c0 + 5000);
              lVar47 = (longlong)*(short *)(_DAT_7ff70cc1a3c0 + 0x2870);
              if (*(int *)(_DAT_7ff70cc1a3c0 + 0x2874 + lVar47 * 8) == *piVar2) {
                sVar32 = (short)*(undefined4 *)(_DAT_7ff70cc1a3c0 + 0x2878 + lVar47 * 8) + 1;
              }
              else {
                iVar38 = (*(short *)(_DAT_7ff70cc1a3c0 + 0x2870) + 1) % 6;
                *(short *)(_DAT_7ff70cc1a3c0 + 0x2870) = (short)iVar38;
                lVar47 = (longlong)iVar38;
                *(int *)(lVar41 + 0x2874 + lVar47 * 8) = *piVar2;
                *(undefined4 *)(lVar41 + 0x2878 + lVar47 * 8) = 0;
                sVar32 = 1;
              }
              *(short *)(lVar41 + 0x2878 + lVar47 * 8) = sVar32;
              *(int *)(lVar41 + 0x2868) = *(int *)(lVar41 + 0x2868) + 1;
            }
            FUN_7ff70c7b5780(lVar29,lVar44 + 0x1148);
            *(undefined **)(lVar29 + 0xd8) = &UNK_7ff70cb875f7;
            *(longlong *)(lVar30 + 0x50) = lVar29;
          }
          if (*(int *)(lVar30 + 0x44) != *(int *)(lVar44 + 5000)) {
            FUN_7ff70c7b6160(lVar29);
            lVar41 = *(longlong *)(lVar44 + 0x40);
            uStack_68 = *(undefined8 *)(lVar41 + 0x28);
            uStack_60 = *(undefined4 *)(lVar41 + 0x30);
            uStack_5c = *(undefined4 *)(lVar41 + 0x34);
            FUN_7ff70c7b8300(lVar29,&uStack_68);
            lStack_50 = CONCAT44((float)((ulonglong)*(undefined8 *)(lVar30 + 0x10) >> 0x20) +
                                 (float)((ulonglong)*(undefined8 *)(lVar30 + 8) >> 0x20),
                                 (float)*(undefined8 *)(lVar30 + 0x10) +
                                 (float)*(undefined8 *)(lVar30 + 8));
            FUN_7ff70c7b7c50(lVar29,lVar30 + 8,&lStack_50,0);
            *(undefined4 *)(lVar30 + 0x44) = *(undefined4 *)(lVar44 + 5000);
          }
          uStack_68 = CONCAT44((float)((ulonglong)*(undefined8 *)(lVar45 + 0x30) >> 0x20) +
                               (float)((ulonglong)*(undefined8 *)(lVar45 + 0x28) >> 0x20),
                               (float)*(undefined8 *)(lVar45 + 0x30) +
                               (float)*(undefined8 *)(lVar45 + 0x28));
          FUN_7ff70c7bd870(lVar29,lVar45 + 0x28,&uStack_68,0xff0000ff,0,0,0x3f800000);
          iVar38 = *(int *)(lVar7 + 0x278c);
          goto joined_r0x7ff70c80b695;
        }
      }
      iVar38 = *(int *)(lVar7 + 0x278c);
    }
joined_r0x7ff70c80b695:
    if (iVar38 == 0x14) {
      FUN_7ff70c876e30(&UNK_7ff70cb8e4b9);
    }
  }
  FUN_7ff70c833070();
LAB_7ff70c80b40a:
  *(int *)(lVar7 + 0x278c) = *(int *)(lVar7 + 0x278c) + 1;
  pcVar6 = *(code **)(lVar7 + 0x2770);
joined_r0x7ff70c80b41a:
  if (pcVar6 != (code *)0x0) {
    (*pcVar6)(lVar7,*(undefined8 *)(lVar7 + 0x2778),&UNK_7ff70cb9015c);
  }
  return (ulonglong)*(byte *)(lVar7 + 0x7d);
}


