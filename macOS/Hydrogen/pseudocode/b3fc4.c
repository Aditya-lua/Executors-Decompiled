
/* WARNING: Removing unreachable block (ram,0x000b3ea0) */
/* WARNING: Removing unreachable block (ram,0x000b1f8c) */
/* WARNING: Removing unreachable block (ram,0x000b34ec) */
/* WARNING: Type propagation algorithm not settling */

int FUN_000b3fc4(uint *param_1,uint param_2,uint *param_3,ulong param_4,uint *param_5,ulong *param_6
                ,int param_7,uint *param_8,ulong param_9,ulong *param_10,ulong *param_11,
                undefined8 param_12,undefined8 param_13,ulong param_14,ulong param_15,ulong param_16
                ,ulong param_17,undefined8 param_18,int *param_19,uint *param_20,long param_21,
                long param_22,long param_23,long param_24,ulong param_25,undefined8 param_26,
                ulong param_27,ulong param_28,ulong param_29,uint param_30,ulong param_31,
                ulong param_32,int param_33,long param_34,int param_35,long param_36,ulong *param_37
                ,ulong *param_38,char *param_39,int *param_40,uint param_41,long *param_42,
                int *param_43,char *param_44,int param_45,ulong param_46,int *param_47,
                ulong *param_48,ulong *param_49,long param_50,ulong *param_51,ulong *param_52,
                int param_53,int param_54,undefined8 param_55)

{
  ushort uVar1;
  undefined1 in_ZR;
  bool bVar2;
  int iVar3;
  char *pcVar4;
  char *pcVar5;
  uint uVar6;
  uint *puVar7;
  long lVar8;
  long lVar9;
  int iVar10;
  ulong *puVar11;
  int iVar12;
  uint uVar13;
  ulong *puVar14;
  char *pcVar15;
  int *piVar16;
  int iVar17;
  int iVar18;
  ulong *puVar19;
  ulong *puVar20;
  ulong *puVar21;
  ulong *puVar22;
  uint *puVar23;
  ulong *puVar24;
  uint *puVar25;
  uint uVar26;
  uint uVar27;
  uint uVar28;
  uint *puVar29;
  ulong uVar30;
  ulong uVar31;
  ulong in_x9;
  int in_w10;
  int iVar32;
  ulong uVar33;
  uint uVar34;
  uint uVar35;
  undefined4 *puVar36;
  ulong *puVar37;
  ulong uVar38;
  ulong in_x12;
  long lVar39;
  uint *in_x13;
  uint in_w14;
  ulong uVar40;
  uint in_w15;
  int iVar41;
  int iVar42;
  int iVar43;
  long lVar44;
  uint uVar45;
  ulong in_x17;
  ulong unaff_x19;
  int unaff_w20;
  uint unaff_w21;
  uint unaff_w22;
  ulong *puVar46;
  ulong uVar47;
  uint *unaff_x23;
  int iVar48;
  ulong *unaff_x24;
  ulong *unaff_x25;
  long unaff_x26;
  ulong *unaff_x27;
  ulong *unaff_x28;
  long unaff_x29;
  int iVar49;
  ulong unaff_x30;
  ulong uVar50;
  ulong uVar51;
  ulong uVar52;
  ulong uVar53;
  ulong uVar54;
  ulong uVar55;
  undefined8 unaff_d8;
  undefined8 uVar56;
  undefined8 uVar57;
  undefined1 auVar58 [16];
  undefined1 auVar59 [16];
  uint uVar60;
  uint uVar61;
  uint uVar62;
  uint uVar63;
  ulong in_d20;
  ulong in_register_00005288;
  int in_s21;
  int in_register_000052a4;
  int in_register_000052a8;
  int in_register_000052ac;
  undefined8 in_d22;
  ulong in_register_000052c8;
  int in_s23;
  int in_register_000052e4;
  int in_register_000052e8;
  int in_register_000052ec;
  
code_r0x000b3fc4:
  if ((bool)in_ZR) goto LAB_000b3fac;
code_r0x000b3fc8:
  puVar7 = param_5;
  if (param_1 < param_5) {
    lVar9 = 0;
    do {
      puVar7 = (uint *)((long)param_5 + lVar9);
      if (*(char *)((long)puVar7 + -1) != *(char *)(*(long *)(unaff_x29 + -0x80) + lVar9))
      goto LAB_000b4008;
      lVar9 = lVar9 + -1;
    } while (param_1 < (uint *)((long)param_5 + lVar9));
    puVar7 = param_1;
  }
LAB_000b4008:
  iVar32 = (int)((long)unaff_x23 - (long)puVar7);
  uVar6 = (uint)in_x9;
  lVar9 = *(long *)(unaff_x29 + -0x98);
  if (((uVar6 <= unaff_w21) &&
      ((long)unaff_x23 - ((long)unaff_x23 - (long)puVar7 & 0xffffffffU) ==
       *(long *)(unaff_x29 + -0x90))) && ((uint)*(undefined8 *)(unaff_x29 + -0xa8) < uVar6)) {
    uVar27 = iVar32 * 8 & 0x1f;
    uVar28 = param_2;
    if ((-iVar32 & 3U) != 0) {
      uVar28 = param_2 >> uVar27 | param_2 << 0x20 - uVar27;
    }
    *(uint *)(unaff_x29 + -0x6c) = uVar28;
    lVar9 = param_36;
    do {
      lVar8 = lVar9;
      if (lVar8 < 4) {
        puVar7 = (uint *)((long)in_x13 + lVar8);
        if (lVar8 < 1) goto LAB_000b40a0;
        break;
      }
      lVar9 = lVar8 + -4;
    } while (*(uint *)((long)in_x13 + lVar8 + -4) == uVar28);
    pcVar15 = *(char **)(unaff_x29 + -0x80);
    puVar7 = (uint *)((long)in_x13 + lVar8);
    do {
      puVar25 = (uint *)((long)puVar7 + -1);
      if (*(char *)puVar25 != *pcVar15) goto LAB_000b40a0;
      pcVar15 = pcVar15 + -1;
      puVar7 = puVar25;
    } while (in_x13 < puVar25);
    puVar7 = in_x13;
LAB_000b40a0:
    iVar32 = ((int)param_52 - (int)puVar7) + iVar32;
    lVar9 = *(long *)(unaff_x29 + -0x98);
  }
  uVar28 = unaff_w21 - iVar32;
  if (unaff_w21 - iVar32 <= in_w14) {
    uVar28 = in_w14;
  }
  uVar47 = param_4 + (unaff_w21 - uVar28);
  if ((param_9 < param_4) || (uVar47 < param_9)) {
    if (uVar6 + ~uVar28 < 3) {
      iVar32 = 0;
      iVar48 = 2;
      uVar47 = in_x9;
    }
    else {
      if (param_9 <= uVar47) {
        uVar47 = param_9;
      }
      if ((ulong)(long)(int)unaff_x19 < uVar47) {
        if (param_21 - (ulong)uVar28 >> 0x10 != 0) goto LAB_000b2994;
        in_w15 = unaff_w22 - uVar28;
        unaff_x19 = uVar47;
      }
      uVar6 = (uint)*(ushort *)(unaff_x26 + (ulong)(uVar28 & 0xffff) * 2);
      uVar47 = (ulong)(uVar28 - uVar6);
      if (uVar28 < uVar6) goto LAB_000b2994;
      iVar32 = 0;
      iVar48 = 2;
    }
  }
  else {
    iVar32 = 0;
    uVar28 = (unaff_w21 - (int)param_9) + (int)param_4;
    if (2 < uVar6 + ~uVar28) {
      uVar6 = uVar28;
    }
    iVar48 = 2;
    uVar47 = (ulong)uVar6;
  }
LAB_000b38d4:
  bVar2 = param_7 < 2;
  param_7 = in_w10;
  if ((uint)uVar47 < in_w14 || bVar2) goto LAB_000b2994;
code_r0x000b38e0:
  uVar6 = (uint)uVar47;
  uVar28 = (uint)in_x9;
  uVar27 = (uint)unaff_x19;
  iVar3 = (int)unaff_x27;
  if ((*(int *)(unaff_x29 + -0x88) == 0) || (7 < unaff_w22 - uVar6)) {
    uVar35 = uVar28 - uVar6;
    if (uVar28 < uVar6 || uVar35 == 0) {
      puVar7 = (uint *)(*(long *)(unaff_x29 + -0x90) + (ulong)(uVar6 - uVar28));
      if ((*(short *)(param_50 + (int)uVar27) != *(short *)((long)puVar7 + (long)(int)uVar27 + -1))
         || (*puVar7 != param_2)) goto code_r0x000b39d0;
      puVar14 = (ulong *)(puVar7 + 1);
      puVar46 = unaff_x27;
      if (unaff_x27 < unaff_x28) {
        uVar47 = *unaff_x27 ^ *puVar14;
        if (uVar47 == 0) {
          puVar14 = (ulong *)(puVar7 + 3);
          puVar46 = param_38;
          goto joined_r0x000b423c;
        }
        uVar47 = (uVar47 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar47 & 0x5555555555555555) << 1;
        uVar47 = (uVar47 & 0xcccccccccccccccc) >> 2 | (uVar47 & 0x3333333333333333) << 2;
        uVar47 = (uVar47 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar47 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar47 = (uVar47 & 0xff00ff00ff00ff00) >> 8 | (uVar47 & 0xff00ff00ff00ff) << 8;
        uVar47 = (uVar47 & 0xffff0000ffff0000) >> 0x10 | (uVar47 & 0xffff0000ffff) << 0x10;
        unaff_x19 = (ulong)((int)((ulong)LZCOUNT(uVar47 >> 0x20 | uVar47 << 0x20) >> 3) + 4);
      }
      else {
joined_r0x000b423c:
        if (puVar46 < unaff_x28) {
          iVar12 = *(int *)(unaff_x29 + -0xe0) + (int)puVar46;
          do {
            uVar47 = *puVar46 ^ *puVar14;
            if (uVar47 != 0) {
              uVar47 = (uVar47 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar47 & 0x5555555555555555) << 1;
              uVar47 = (uVar47 & 0xcccccccccccccccc) >> 2 | (uVar47 & 0x3333333333333333) << 2;
              uVar47 = (uVar47 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar47 & 0xf0f0f0f0f0f0f0f) << 4;
              uVar47 = (uVar47 & 0xff00ff00ff00ff00) >> 8 | (uVar47 & 0xff00ff00ff00ff) << 8;
              uVar47 = (uVar47 & 0xffff0000ffff0000) >> 0x10 | (uVar47 & 0xffff0000ffff) << 0x10;
              lVar9 = *(long *)(unaff_x29 + -0x98);
              unaff_x19 = (ulong)((int)((ulong)LZCOUNT(uVar47 >> 0x20 | uVar47 << 0x20) >> 3) +
                                  iVar12 + 4);
              goto code_r0x000b3cf8;
            }
            puVar46 = puVar46 + 1;
            puVar14 = puVar14 + 1;
            iVar12 = iVar12 + 8;
          } while (puVar46 < unaff_x28);
        }
        if (puVar46 < param_11) {
          if ((uint)*puVar14 == (uint)*puVar46) {
            puVar46 = (ulong *)((long)puVar46 + 4);
            puVar14 = (ulong *)((long)puVar14 + 4);
          }
          lVar9 = *(long *)(unaff_x29 + -0x98);
          if (puVar46 < param_10) goto code_r0x000b41a8;
code_r0x000b3be0:
          if (puVar46 < *(ulong **)(unaff_x29 + -200)) {
code_r0x000b3bec:
            if ((char)*puVar14 == (char)*puVar46) {
              puVar46 = (ulong *)((long)puVar46 + 1);
            }
          }
        }
        else {
          lVar9 = *(long *)(unaff_x29 + -0x98);
          if (param_10 <= puVar46) goto code_r0x000b3be0;
code_r0x000b41a8:
          if ((short)*puVar14 == (short)*puVar46) {
            puVar46 = (ulong *)((long)puVar46 + 2);
            puVar14 = (ulong *)((long)puVar14 + 2);
          }
          if (puVar46 < *(ulong **)(unaff_x29 + -200)) goto code_r0x000b3bec;
        }
        unaff_x19 = (ulong)(((int)puVar46 - iVar3) + 4);
      }
    }
    else {
      if ((*(uint *)(unaff_x29 + -0xd0) < uVar6) ||
         (puVar7 = (uint *)((long)in_x13 + (ulong)(uVar6 - (int)*(undefined8 *)(unaff_x29 + -0xa8)))
         , *puVar7 != param_2)) goto code_r0x000b39d0;
      puVar46 = (ulong *)((long)unaff_x25 + (ulong)uVar35);
      puVar14 = *(ulong **)(unaff_x29 + -200);
      if (puVar46 <= *(ulong **)(unaff_x29 + -200)) {
        puVar14 = puVar46;
      }
      puVar21 = (ulong *)(puVar7 + 1);
      puVar24 = (ulong *)((long)puVar14 - 7);
      puVar37 = unaff_x27;
      if (unaff_x27 < puVar24) {
        uVar47 = *unaff_x27 ^ *puVar21;
        if (uVar47 == 0) {
          puVar21 = (ulong *)(puVar7 + 3);
          puVar37 = param_38;
          goto code_r0x000b3a68;
        }
        uVar47 = (uVar47 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar47 & 0x5555555555555555) << 1;
        uVar47 = (uVar47 & 0xcccccccccccccccc) >> 2 | (uVar47 & 0x3333333333333333) << 2;
        uVar47 = (uVar47 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar47 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar47 = (uVar47 & 0xff00ff00ff00ff00) >> 8 | (uVar47 & 0xff00ff00ff00ff) << 8;
        uVar47 = (uVar47 & 0xffff0000ffff0000) >> 0x10 | (uVar47 & 0xffff0000ffff) << 0x10;
        iVar12 = (int)((ulong)LZCOUNT(uVar47 >> 0x20 | uVar47 << 0x20) >> 3);
code_r0x000b3b0c:
        lVar9 = *(long *)(unaff_x29 + -0x98);
        unaff_x24 = *(ulong **)(unaff_x29 + -0xd8);
      }
      else {
code_r0x000b3a68:
        if (puVar37 < puVar24) {
          iVar12 = *(int *)(unaff_x29 + -0xe0) + (int)puVar37;
          do {
            uVar47 = *puVar37 ^ *puVar21;
            if (uVar47 != 0) {
              uVar47 = (uVar47 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar47 & 0x5555555555555555) << 1;
              uVar47 = (uVar47 & 0xcccccccccccccccc) >> 2 | (uVar47 & 0x3333333333333333) << 2;
              uVar47 = (uVar47 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar47 & 0xf0f0f0f0f0f0f0f) << 4;
              uVar47 = (uVar47 & 0xff00ff00ff00ff00) >> 8 | (uVar47 & 0xff00ff00ff00ff) << 8;
              uVar47 = (uVar47 & 0xffff0000ffff0000) >> 0x10 | (uVar47 & 0xffff0000ffff) << 0x10;
              iVar12 = (int)((ulong)LZCOUNT(uVar47 >> 0x20 | uVar47 << 0x20) >> 3) + iVar12;
              goto code_r0x000b3b0c;
            }
            puVar37 = puVar37 + 1;
            puVar21 = puVar21 + 1;
            iVar12 = iVar12 + 8;
          } while (puVar37 < puVar24);
        }
        if (puVar37 < (ulong *)((long)puVar14 - 3U)) {
          if ((uint)*puVar21 == (uint)*puVar37) {
            puVar37 = (ulong *)((long)puVar37 + 4);
            puVar21 = (ulong *)((long)puVar21 + 4);
          }
          lVar9 = *(long *)(unaff_x29 + -0x98);
          if (puVar37 < (ulong *)((long)puVar14 - 1U)) goto code_r0x000b4170;
        }
        else {
          lVar9 = *(long *)(unaff_x29 + -0x98);
          if (puVar37 < (ulong *)((long)puVar14 - 1U)) {
code_r0x000b4170:
            if ((short)*puVar21 == (short)*puVar37) {
              puVar37 = (ulong *)((long)puVar37 + 2);
              puVar21 = (ulong *)((long)puVar21 + 2);
            }
          }
        }
        if (puVar37 < puVar14) {
          if ((char)*puVar21 == (char)*puVar37) {
            puVar37 = (ulong *)((long)puVar37 + 1);
          }
        }
        unaff_x24 = *(ulong **)(unaff_x29 + -0xd8);
        iVar12 = (int)puVar37 - iVar3;
      }
      uVar13 = iVar12 + 4;
      unaff_x19 = (ulong)uVar13;
      if (puVar46 < *(ulong **)(unaff_x29 + -200)) {
        unaff_x28 = *(ulong **)(unaff_x29 + -0x78);
        if ((ulong *)((long)unaff_x25 + (long)(int)uVar13) != puVar14) goto code_r0x000b3cf8;
        puVar37 = *(ulong **)(unaff_x29 + -0x90);
        puVar46 = puVar14;
        if (puVar14 < unaff_x28) {
          uVar47 = *puVar14 ^ **(ulong **)(unaff_x29 + -0x90);
          if (uVar47 == 0) {
            puVar46 = puVar14 + 1;
            puVar37 = param_37;
            goto code_r0x000b3c14;
          }
          uVar47 = (uVar47 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar47 & 0x5555555555555555) << 1;
          uVar47 = (uVar47 & 0xcccccccccccccccc) >> 2 | (uVar47 & 0x3333333333333333) << 2;
          uVar47 = (uVar47 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar47 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar47 = (uVar47 & 0xff00ff00ff00ff00) >> 8 | (uVar47 & 0xff00ff00ff00ff) << 8;
          uVar47 = (uVar47 & 0xffff0000ffff0000) >> 0x10 | (uVar47 & 0xffff0000ffff) << 0x10;
          iVar12 = (int)((ulong)LZCOUNT(uVar47 >> 0x20 | uVar47 << 0x20) >> 3);
code_r0x000b3cec:
          unaff_x24 = *(ulong **)(unaff_x29 + -0xd8);
        }
        else {
code_r0x000b3c14:
          if (puVar46 < *(ulong **)(unaff_x29 + -0x78)) {
            uVar47 = (long)param_48 + (ulong)uVar35;
            uVar31 = param_25;
            if (uVar47 <= param_25) {
              uVar31 = uVar47;
            }
            iVar12 = (int)puVar46 - (int)uVar31;
            do {
              uVar47 = *puVar46 ^ *puVar37;
              if (uVar47 != 0) {
                uVar47 = (uVar47 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar47 & 0x5555555555555555) << 1;
                uVar47 = (uVar47 & 0xcccccccccccccccc) >> 2 | (uVar47 & 0x3333333333333333) << 2;
                uVar47 = (uVar47 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar47 & 0xf0f0f0f0f0f0f0f) << 4;
                uVar47 = (uVar47 & 0xff00ff00ff00ff00) >> 8 | (uVar47 & 0xff00ff00ff00ff) << 8;
                uVar47 = (uVar47 & 0xffff0000ffff0000) >> 0x10 | (uVar47 & 0xffff0000ffff) << 0x10;
                iVar12 = (int)((ulong)LZCOUNT(uVar47 >> 0x20 | uVar47 << 0x20) >> 3) + iVar12;
                goto code_r0x000b3cec;
              }
              puVar46 = puVar46 + 1;
              puVar37 = puVar37 + 1;
              iVar12 = iVar12 + 8;
            } while (puVar46 < *(ulong **)(unaff_x29 + -0x78));
          }
          if (puVar46 < param_11) {
            if ((uint)*puVar37 == (uint)*puVar46) {
              puVar46 = (ulong *)((long)puVar46 + 4);
              puVar37 = (ulong *)((long)puVar37 + 4);
            }
            if (puVar46 < param_10) goto code_r0x000b41e0;
code_r0x000b3c94:
            if (puVar46 < *(ulong **)(unaff_x29 + -200)) {
code_r0x000b3ca0:
              if ((char)*puVar37 == (char)*puVar46) {
                puVar46 = (ulong *)((long)puVar46 + 1);
              }
            }
          }
          else {
            if (param_10 <= puVar46) goto code_r0x000b3c94;
code_r0x000b41e0:
            if ((short)*puVar37 == (short)*puVar46) {
              puVar46 = (ulong *)((long)puVar46 + 2);
              puVar37 = (ulong *)((long)puVar37 + 2);
            }
            if (puVar46 < *(ulong **)(unaff_x29 + -200)) goto code_r0x000b3ca0;
          }
          unaff_x24 = *(ulong **)(unaff_x29 + -0xd8);
          iVar12 = (int)puVar46 - (int)puVar14;
        }
        unaff_x19 = (ulong)(iVar12 + uVar13);
      }
      unaff_x28 = *(ulong **)(unaff_x29 + -0x78);
    }
code_r0x000b3cf8:
    uVar34 = (uint)unaff_x19;
    uVar35 = uVar34;
    uVar13 = unaff_w22 - uVar6;
    if ((int)uVar34 <= (int)uVar27) {
      uVar35 = uVar27;
      uVar13 = in_w15;
    }
    in_w15 = uVar13;
    uVar47 = (ulong)uVar35;
    if (uVar34 == uVar35) goto code_r0x000b39e0;
  }
  else {
code_r0x000b39d0:
    uVar47 = unaff_x19;
    unaff_x19 = 0;
    if (uVar27 == 0) {
code_r0x000b39e0:
      in_w10 = param_7 + -1;
      if ((int)uVar47 + uVar6 <= unaff_w22) {
        if (3 < (int)unaff_x19) {
          iVar12 = 0;
          uVar27 = 1;
          iVar17 = iVar32;
          iVar41 = 0x10;
          do {
            uVar1 = *(ushort *)(unaff_x26 + (ulong)(iVar12 + uVar6 & 0xffff) * 2);
            uVar35 = (uint)uVar1;
            bVar2 = uVar35 <= uVar27;
            if (uVar27 <= uVar35) {
              uVar27 = (uint)uVar1;
            }
            iVar32 = iVar12;
            if (bVar2) {
              iVar32 = iVar17;
            }
            iVar12 = iVar12 + (iVar41 >> 4);
            iVar43 = 0x10;
            if (bVar2) {
              iVar43 = iVar41 + 1;
            }
            iVar17 = iVar32;
            iVar41 = iVar43;
          } while (iVar12 < (int)unaff_x19 + -3);
          if (1 < uVar27) {
            uVar28 = 0;
            if (uVar27 <= uVar6) {
              uVar28 = uVar27;
            }
            lVar9 = *(long *)(unaff_x29 + -0x98);
            if (uVar6 < uVar27) {
LAB_000b2994:
              do {
                if (((unaff_w22 < *(uint *)(unaff_x29 + -0xf0)) &&
                    (*(int *)(unaff_x29 + -0xe4) == 1)) && (0 < in_w10)) {
                  lVar8 = (*param_42 - param_42[1]) + (ulong)*(uint *)(param_42 + 3);
                  uVar6 = *(uint *)(*(long *)(unaff_x29 + -0xb0) +
                                   (ulong)((uint)*unaff_x25 * -0x61c8864f >> 0x11) * 4);
                  iVar32 = (uVar6 + in_w14) - (int)lVar8;
                  uVar28 = unaff_w22 - iVar32;
                  if (uVar28 >> 0x10 == 0) {
                    do {
                      if (in_w10 == 0) break;
                      puVar7 = (uint *)((param_42[1] - (ulong)*(uint *)(param_42 + 3)) +
                                       (ulong)uVar6);
                      if (*puVar7 == param_2) {
                        puVar46 = (ulong *)((long)unaff_x25 + (lVar8 - (ulong)uVar6));
                        puVar14 = *(ulong **)(unaff_x29 + -200);
                        if (puVar46 <= *(ulong **)(unaff_x29 + -200)) {
                          puVar14 = puVar46;
                        }
                        puVar37 = (ulong *)(puVar7 + 1);
                        puVar21 = (ulong *)((long)puVar14 - 7);
                        puVar46 = unaff_x27;
                        if (unaff_x27 < puVar21) {
                          uVar47 = *unaff_x27 ^ *puVar37;
                          if (uVar47 == 0) {
                            puVar37 = (ulong *)(puVar7 + 3);
                            puVar46 = param_38;
                            goto joined_r0x000b2ed4;
                          }
                          uVar47 = (uVar47 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                                   (uVar47 & 0x5555555555555555) << 1;
                          uVar47 = (uVar47 & 0xcccccccccccccccc) >> 2 |
                                   (uVar47 & 0x3333333333333333) << 2;
                          uVar47 = (uVar47 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                                   (uVar47 & 0xf0f0f0f0f0f0f0f) << 4;
                          uVar47 = (uVar47 & 0xff00ff00ff00ff00) >> 8 |
                                   (uVar47 & 0xff00ff00ff00ff) << 8;
                          uVar47 = (uVar47 & 0xffff0000ffff0000) >> 0x10 |
                                   (uVar47 & 0xffff0000ffff) << 0x10;
                          iVar48 = (int)((ulong)LZCOUNT(uVar47 >> 0x20 | uVar47 << 0x20) >> 3);
                          lVar9 = *(long *)(unaff_x29 + -0x98);
                        }
                        else {
joined_r0x000b2ed4:
                          if (puVar46 < puVar21) {
                            iVar48 = *(int *)(unaff_x29 + -0xe0) + (int)puVar46;
                            do {
                              uVar47 = *puVar46 ^ *puVar37;
                              if (uVar47 != 0) {
                                uVar47 = (uVar47 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                                         (uVar47 & 0x5555555555555555) << 1;
                                uVar47 = (uVar47 & 0xcccccccccccccccc) >> 2 |
                                         (uVar47 & 0x3333333333333333) << 2;
                                uVar47 = (uVar47 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                                         (uVar47 & 0xf0f0f0f0f0f0f0f) << 4;
                                uVar47 = (uVar47 & 0xff00ff00ff00ff00) >> 8 |
                                         (uVar47 & 0xff00ff00ff00ff) << 8;
                                uVar47 = (uVar47 & 0xffff0000ffff0000) >> 0x10 |
                                         (uVar47 & 0xffff0000ffff) << 0x10;
                                iVar48 = (int)((ulong)LZCOUNT(uVar47 >> 0x20 | uVar47 << 0x20) >> 3)
                                         + iVar48;
                                lVar9 = *(long *)(unaff_x29 + -0x98);
                                goto code_r0x000b2e80;
                              }
                              puVar46 = puVar46 + 1;
                              puVar37 = puVar37 + 1;
                              iVar48 = iVar48 + 8;
                            } while (puVar46 < puVar21);
                          }
                          if (puVar46 < (ulong *)((long)puVar14 - 3U)) {
                            if ((uint)*puVar37 == (uint)*puVar46) {
                              puVar46 = (ulong *)((long)puVar46 + 4);
                              puVar37 = (ulong *)((long)puVar37 + 4);
                            }
                            lVar9 = *(long *)(unaff_x29 + -0x98);
                            if (puVar46 < (ulong *)((long)puVar14 - 1U)) goto code_r0x000b2ea4;
                          }
                          else {
                            lVar9 = *(long *)(unaff_x29 + -0x98);
                            if (puVar46 < (ulong *)((long)puVar14 - 1U)) {
code_r0x000b2ea4:
                              if ((short)*puVar37 == (short)*puVar46) {
                                puVar46 = (ulong *)((long)puVar46 + 2);
                                puVar37 = (ulong *)((long)puVar37 + 2);
                              }
                            }
                          }
                          if (puVar46 < puVar14) {
                            if ((char)*puVar37 == (char)*puVar46) {
                              puVar46 = (ulong *)((long)puVar46 + 1);
                            }
                          }
                          iVar48 = (int)puVar46 - (int)unaff_x27;
                        }
code_r0x000b2e80:
                        uVar27 = iVar48 + 4U;
                        if ((int)(iVar48 + 4U) <= (int)(uint)unaff_x19) {
                          uVar27 = (uint)unaff_x19;
                          uVar28 = in_w15;
                        }
                        in_w15 = uVar28;
                        unaff_x19 = (ulong)uVar27;
                      }
                      in_w10 = in_w10 + -1;
                      uVar28 = (uint)*(ushort *)
                                      (*(long *)(unaff_x29 + -0xb0) + (ulong)(uVar6 & 0xffff) * 2 +
                                      0x20000);
                      uVar6 = uVar6 - uVar28;
                      iVar32 = iVar32 - uVar28;
                      uVar28 = unaff_w22 - iVar32;
                    } while (uVar28 < 0x10000);
                  }
                }
                uVar47 = *(ulong *)(unaff_x29 + -0xf8);
                if ((int)unaff_x19 <= (int)param_30) goto code_r0x000b2814;
code_r0x000b4270:
                uVar31 = 0x1200000000;
                if (0x11 < (int)unaff_x19 - 0x13U || *(int *)(unaff_x29 + -0x88) == 0) {
                  uVar31 = unaff_x19 << 0x20;
                }
                uVar33 = uVar31 >> 0x20;
                puVar46 = *(ulong **)(unaff_x29 + -200);
                iVar32 = (int)(uVar31 >> 0x20);
                lVar8 = param_34;
                if (iVar32 == 0) {
                  lVar39 = *(long *)(unaff_x29 + -0x90);
                }
                else {
                  iVar48 = (int)unaff_x30;
                  if ((param_31 < (ulong)((long)uVar31 >> 0x20)) || (0xfff < iVar32 + iVar48)) {
                    uVar31 = (ulong)(iVar48 + 1);
                    goto code_r0x000b45c4;
                  }
                  iVar17 = *(int *)(*(long *)(unaff_x29 + -0xa0) + unaff_x30 * 0x10 + 0xc);
                  iVar3 = iVar17 + 1;
                  iVar12 = (iVar17 - 0xfU) / 0xff + iVar3;
                  if (iVar17 - 0xeU == 0 || iVar17 < 0xe) {
                    iVar12 = iVar17;
                  }
                  if (iVar17 < 0xe) {
                    iVar43 = unaff_w20 - iVar12;
                    iVar41 = iVar3 + iVar43;
                  }
                  else {
                    iVar43 = unaff_w20 - iVar12;
                    iVar41 = iVar17 + (iVar17 - 0xeU) / 0xff + 2 + iVar43;
                  }
                  if (iVar41 < param_33) {
                    lVar39 = *(long *)(unaff_x29 + -0xa0) + param_46 * 0x10;
                    *(undefined8 *)(lVar39 + 4) = unaff_d8;
                    *(int *)(lVar39 + 0xc) = iVar3;
                    *param_43 = iVar41;
                  }
                  iVar3 = iVar17 + 2;
                  if (0xc < iVar17) {
                    iVar3 = iVar17 + (iVar17 - 0xdU) / 0xff + 3;
                  }
                  piVar16 = (int *)(*(long *)(unaff_x29 + -0xa0) + (unaff_x30 + 2) * 0x10);
                  if (iVar3 + iVar43 < *piVar16) {
                    *(undefined8 *)(piVar16 + 1) = unaff_d8;
                    piVar16[3] = iVar17 + 2;
                    *piVar16 = iVar3 + iVar43;
                  }
                  iVar3 = iVar17 + 3;
                  if (0xb < iVar17) {
                    iVar3 = iVar17 + (iVar17 - 0xcU) / 0xff + 4;
                  }
                  piVar16 = (int *)(*(long *)(unaff_x29 + -0xa0) + (unaff_x30 + 3) * 0x10);
                  if (iVar3 + iVar43 < *piVar16) {
                    *(undefined8 *)(piVar16 + 1) = unaff_d8;
                    piVar16[3] = iVar17 + 3;
                    *piVar16 = iVar3 + iVar43;
                  }
                  if (3 < iVar32) {
                    lVar39 = *(long *)(unaff_x29 + -0xa0);
                    iVar3 = *(int *)(lVar39 + unaff_x30 * 0x10 + 8);
                    uVar31 = 4;
                    piVar16 = param_47;
                    do {
                      while( true ) {
                        iVar41 = (int)uVar31;
                        if (iVar3 == 1) {
                          if ((long)iVar17 < (long)unaff_x30) {
                            iVar10 = *(int *)(lVar39 + (long)(iVar48 - iVar17) * 0x10);
                          }
                          else {
                            iVar10 = 0;
                          }
                          iVar43 = iVar12 + 3;
                          if (0x12 < uVar31) {
                            iVar43 = iVar12 + 4 + (iVar41 - 0x13U) / 0xff;
                          }
                          iVar43 = iVar43 + iVar10;
                          iVar10 = iVar17;
                        }
                        else {
                          iVar10 = 0;
                          iVar43 = 3;
                          if (0x12 < uVar31) {
                            iVar43 = (iVar41 - 0x13U) / 0xff + 4;
                          }
                          iVar43 = iVar43 + unaff_w20;
                        }
                        uVar28 = (uint)uVar47;
                        uVar6 = ((int)*(undefined8 *)(unaff_x29 + -0xc0) + iVar41) - 4;
                        if (((int)(uVar28 + 3) < (int)uVar6) || (iVar43 <= *piVar16 + param_53))
                        break;
                        lVar9 = *(long *)(unaff_x29 + -0x98);
                        uVar31 = uVar31 + 1;
                        piVar16 = piVar16 + 4;
                        if (iVar32 + 1 == uVar31) goto code_r0x000b43c4;
                      }
                      if ((int)uVar6 <= (int)uVar28 || uVar33 != uVar31) {
                        uVar6 = uVar28;
                      }
                      uVar47 = (ulong)uVar6;
                      piVar16[2] = iVar41;
                      piVar16[3] = iVar10;
                      *piVar16 = iVar43;
                      piVar16[1] = in_w15;
                      lVar9 = *(long *)(unaff_x29 + -0x98);
                      uVar31 = uVar31 + 1;
                      piVar16 = piVar16 + 4;
                    } while (iVar32 + 1 != uVar31);
                  }
code_r0x000b43c4:
                  piVar16 = (int *)(*(long *)(unaff_x29 + -0xa0) + (long)(int)uVar47 * 0x10);
                  *(undefined8 *)(piVar16 + 5) = unaff_d8;
                  iVar32 = *piVar16;
                  piVar16[4] = iVar32 + 1;
                  *(undefined8 *)(piVar16 + 9) = unaff_d8;
                  piVar16[7] = 1;
                  piVar16[8] = iVar32 + 2;
                  *(undefined8 *)(piVar16 + 0xd) = unaff_d8;
                  piVar16[0xf] = 3;
                  piVar16[0xb] = 2;
                  piVar16[0xc] = iVar32 + 3;
                  lVar39 = *(long *)(unaff_x29 + -0x90);
                }
code_r0x000b2834:
                iVar32 = (int)in_x17;
                *(int *)(unaff_x29 + -0xe0) = *(int *)(unaff_x29 + -0xe0) + -1;
                param_51 = (ulong *)((long)param_51 + 1);
                *(long *)(unaff_x29 + -0xc0) = *(long *)(unaff_x29 + -0xc0) + 1;
                param_6 = (ulong *)((long)param_6 + 1);
                param_47 = param_47 + 4;
                uVar31 = (long)(int)uVar47;
                unaff_x30 = param_46;
                if ((long)(int)uVar47 <= (long)param_46) goto code_r0x000b45a8;
code_r0x000b2870:
                param_48 = (ulong *)((long)param_48 + 1);
                unaff_x25 = (ulong *)((long)unaff_x24 + unaff_x30);
                if (unaff_x28 < unaff_x25) {
                  uVar31 = (long)(int)uVar47;
code_r0x000b45a8:
                  do {
                    lVar8 = *(long *)(unaff_x29 + -0xa0) + uVar31 * 0x10;
                    in_w15 = *(uint *)(lVar8 + 4);
                    uVar6 = *(uint *)(lVar8 + 8);
                    uVar33 = (ulong)uVar6;
                    unaff_x30 = (ulong)((int)uVar47 - uVar6);
                    uVar31 = uVar47;
code_r0x000b45c4:
                    do {
                      iVar32 = (int)unaff_x30;
                      lVar8 = *(long *)(unaff_x29 + -0xa0) + (long)iVar32 * 0x10;
                      uVar6 = *(uint *)(lVar8 + 4);
                      uVar28 = *(uint *)(lVar8 + 8);
                      *(uint *)(lVar8 + 4) = in_w15;
                      *(int *)(lVar8 + 8) = (int)uVar33;
                      unaff_x30 = (ulong)(iVar32 - uVar28);
                      uVar33 = (ulong)uVar28;
                      in_w15 = uVar6;
                    } while ((int)uVar28 <= iVar32);
                    if ((int)uVar31 < 1) {
                      puVar14 = unaff_x24;
                    }
                    else {
                      iVar32 = 0;
                      *(ulong *)(unaff_x29 + -0xf8) = uVar31;
                      pcVar15 = param_44;
                      do {
                        while( true ) {
                          lVar8 = *(long *)(unaff_x29 + -0xa0) + (long)iVar32 * 0x10;
                          uVar6 = *(uint *)(lVar8 + 8);
                          uVar47 = (ulong)uVar6;
                          if (uVar6 == 1) break;
                          uVar28 = *(uint *)(lVar8 + 4);
                          puVar14 = (ulong *)(pcVar15 + 1);
                          uVar31 = (long)unaff_x24 - (long)param_49;
                          if ((param_55._4_4_ != 0) &&
                             (param_39 < (char *)((long)puVar14 + uVar31 + uVar31 / 0xff + 8)))
                          goto code_r0x000b49e4;
                          uVar33 = uVar31 - 0xf;
                          if (uVar31 < 0xf) {
                            *pcVar15 = (char)((int)uVar31 << 4);
                          }
                          else {
                            *pcVar15 = -0x10;
                            puVar37 = puVar14;
                            if (0xfe < uVar33) {
                              uVar33 = (uVar31 - 0x10e) / 0xff;
                              _memset(puVar14,0xff,uVar33 + 1);
                              in_s23 = 4;
                              in_register_000052e4 = 4;
                              in_register_000052e8 = 4;
                              in_register_000052ec = 4;
                              in_s21 = -0x13;
                              in_register_000052a4 = -0x13;
                              in_register_000052a8 = -0x13;
                              in_register_000052ac = -0x13;
                              puVar46 = *(ulong **)(unaff_x29 + -200);
                              lVar9 = *(long *)(unaff_x29 + -0x98);
                              puVar37 = (ulong *)(pcVar15 + uVar33 + 2);
                              uVar33 = (uVar31 - 0x10e) % 0xff;
                              in_d20 = param_28;
                              in_register_00005288 = param_29;
                              in_d22 = param_26;
                              in_register_000052c8 = param_27;
                            }
                            puVar14 = (ulong *)((long)puVar37 + 1);
                            *(char *)puVar37 = (char)uVar33;
                          }
                          puVar37 = (ulong *)((long)puVar14 + uVar31);
                          puVar21 = (ulong *)((char *)((long)puVar14 + (long)unaff_x24) +
                                             -(long)param_49);
                          if ((char *)((long)puVar14 + (long)unaff_x24) + -(long)param_49 <=
                              puVar14 + 1) {
                            puVar21 = puVar14 + 1;
                          }
                          puVar24 = param_49;
                          puVar20 = puVar14;
                          if (((char *)((long)puVar21 + ~(ulong)puVar14) <
                               &segment_command_00000020.vmaddr) ||
                             ((ulong)((long)puVar14 - (long)param_49) < 0x40)) {
code_r0x000b4794:
                            do {
                              puVar21 = puVar20 + 1;
                              *puVar20 = *puVar24;
                              puVar24 = puVar24 + 1;
                              puVar20 = puVar21;
                            } while (puVar21 < puVar37);
                          }
                          else {
                            uVar33 = ((long)puVar21 + ~(ulong)puVar14 >> 3) + 1;
                            uVar38 = uVar33 & 0x3ffffffffffffff8;
                            puVar21 = param_49 + 4;
                            puVar24 = puVar14 + 4;
                            uVar30 = uVar38;
                            do {
                              uVar50 = puVar21[-4];
                              uVar54 = puVar21[-1];
                              uVar53 = puVar21[-2];
                              uVar55 = *puVar21;
                              uVar27 = *(uint *)((long)puVar21 + 4);
                              uVar40 = puVar21[1];
                              uVar35 = *(uint *)((long)puVar21 + 0xc);
                              uVar52 = puVar21[3];
                              uVar51 = puVar21[2];
                              puVar24[-3] = puVar21[-3];
                              puVar24[-4] = uVar50;
                              puVar24[-1] = uVar54;
                              puVar24[-2] = uVar53;
                              *(uint *)(puVar24 + 1) = (uint)uVar40;
                              *(uint *)((long)puVar24 + 0xc) = uVar35;
                              *(uint *)puVar24 = (uint)uVar55;
                              *(uint *)((long)puVar24 + 4) = uVar27;
                              puVar24[3] = uVar52;
                              puVar24[2] = uVar51;
                              uVar30 = uVar30 - 8;
                              puVar21 = puVar21 + 8;
                              puVar24 = puVar24 + 8;
                            } while (uVar30 != 0);
                            puVar24 = param_49 + uVar38;
                            puVar20 = puVar14 + uVar38;
                            if (uVar33 != uVar38) goto code_r0x000b4794;
                          }
                          lVar8 = (long)(int)uVar6;
                          param_44 = (char *)((long)puVar37 + 2);
                          *(short *)puVar37 = (short)uVar28;
                          uVar33 = lVar8 - 4;
                          if ((param_55._4_4_ != 0) && (param_39 < param_44 + uVar33 / 0xff + 6))
                          goto code_r0x000b49e4;
                          if (uVar33 < 0xf) {
                            *pcVar15 = *pcVar15 + (char)uVar33;
                            unaff_x28 = *(ulong **)(unaff_x29 + -0x78);
                            uVar31 = *(ulong *)(unaff_x29 + -0xf8);
                          }
                          else {
                            *pcVar15 = *pcVar15 + '\x0f';
                            uVar47 = lVar8 - 0x13;
                            if (0x1fd < uVar47) {
                              lVar39 = ((lVar8 - 0x211U) / 0x1fe) * 2;
                              _memset(param_44,0xff,lVar39 + 2);
                              in_s23 = 4;
                              in_register_000052e4 = 4;
                              in_register_000052e8 = 4;
                              in_register_000052ec = 4;
                              in_s21 = -0x13;
                              in_register_000052a4 = -0x13;
                              in_register_000052a8 = -0x13;
                              in_register_000052ac = -0x13;
                              lVar9 = *(long *)(unaff_x29 + -0x98);
                              param_44 = (char *)((long)puVar14 + lVar39 + uVar31 + 4);
                              uVar47 = (lVar8 - 0x211U) % 0x1fe;
                              puVar46 = *(ulong **)(unaff_x29 + -200);
                              in_d20 = param_28;
                              in_register_00005288 = param_29;
                              in_d22 = param_26;
                              in_register_000052c8 = param_27;
                            }
                            unaff_x28 = *(ulong **)(unaff_x29 + -0x78);
                            uVar31 = *(ulong *)(unaff_x29 + -0xf8);
                            pcVar15 = param_44;
                            if (0xfe < uVar47) {
                              pcVar15 = param_44 + 1;
                              *param_44 = -1;
                              uVar47 = uVar47 - 0xff;
                            }
                            param_44 = pcVar15 + 1;
                            *pcVar15 = (char)uVar47;
                          }
                          iVar32 = uVar6 + iVar32;
                          param_49 = (ulong *)((long)unaff_x24 + lVar8);
                          pcVar15 = param_44;
                          puVar14 = param_49;
                          unaff_x24 = param_49;
                          if ((int)uVar31 <= iVar32) goto code_r0x000b1698;
                        }
                        unaff_x24 = (ulong *)((long)unaff_x24 + 1);
                        iVar32 = iVar32 + 1;
                        param_44 = pcVar15;
                        puVar14 = unaff_x24;
                      } while (iVar32 < (int)uVar31);
                    }
code_r0x000b1698:
                    if (unaff_x28 < puVar14) goto code_r0x000b087c;
                    lVar39 = *(long *)(unaff_x29 + -0xb8);
                    lVar44 = *(long *)(lVar39 + 8);
                    uVar35 = *(uint *)(lVar39 + 0x18);
                    in_x9 = (ulong)uVar35;
                    uVar27 = *(uint *)(lVar39 + 0x1c);
                    lVar8 = (long)puVar14 - lVar44;
                    uVar6 = uVar35 + (int)lVar8;
                    *(uint *)(unaff_x29 + -0xf0) = uVar27 + 0x10000;
                    *(ulong *)(unaff_x29 + -0xa8) = (ulong)uVar27;
                    if (uVar27 + 0x10000 <= uVar6) {
                      uVar27 = uVar6 - 0xffff;
                    }
                    uVar13 = (uint)*puVar14;
                    uVar28 = *(uint *)(lVar39 + 0x20);
                    uVar47 = (ulong)uVar28;
                    *(long *)(unaff_x29 + -0x90) = lVar44;
                    uVar34 = uVar13;
                    if (uVar28 < uVar6) {
                      do {
                        lVar39 = (ulong)((uint)(*(int *)((lVar44 - in_x9) + uVar47) * -0x61c8864f)
                                        >> 0x11) * 4;
                        uVar28 = (int)uVar47 - *(int *)(lVar9 + lVar39);
                        if (0xfffe < uVar28) {
                          uVar28 = 0xffff;
                        }
                        *(short *)(unaff_x26 + (uVar47 & 0xffff) * 2) = (short)uVar28;
                        *(int *)(lVar9 + lVar39) = (int)uVar47;
                        uVar47 = uVar47 + 1;
                      } while (uVar6 != uVar47);
                      uVar34 = (uint)*puVar14;
                      lVar44 = *(long *)(unaff_x29 + -0x90);
                    }
                    lVar39 = *(long *)(unaff_x29 + -0xb8);
                    *(undefined8 *)(unaff_x29 + -0xb0) = *(undefined8 *)(lVar39 + 0x28);
                    in_x13 = *(uint **)(lVar39 + 0x10);
                    param_36 = in_x9 - *(long *)(unaff_x29 + -0xa8);
                    param_52 = (ulong *)((long)in_x13 + param_36);
                    *(uint *)(lVar39 + 0x20) = uVar6;
                    uVar28 = *(uint *)(lVar9 + (ulong)(uVar34 * -0x61c8864f >> 0x11) * 4);
                    uVar47 = (ulong)uVar28;
                    puVar37 = (ulong *)((long)puVar14 + 4);
                    puVar21 = (ulong *)((long)puVar14 + 0xc);
                    *(uint *)(unaff_x29 + -0xd0) = uVar35 - 4;
                    param_37 = (ulong *)(lVar44 + 8);
                    *(ulong **)(unaff_x29 + -0xd8) = puVar14;
                    iVar32 = (int)puVar37;
                    unaff_x24 = puVar14;
                    if (uVar28 < uVar27 || param_45 < 1) {
                      uVar28 = 0;
                      uVar38 = 3;
                      iVar17 = param_45;
                    }
                    else {
                      iVar48 = 0;
                      iVar12 = 0;
                      uVar31 = 0;
                      uVar28 = 0;
                      *(ulong *)(unaff_x29 + -0xe0) = lVar8 + in_x9;
                      *(int *)(unaff_x29 + -0xc0) = -4 - (int)puVar14;
                      uVar33 = 3;
                      uVar30 = CONCAT44(uVar13,uVar13);
                      iVar3 = param_45;
                      do {
                        uVar26 = (uint)uVar47;
                        uVar34 = uVar6 - uVar26;
                        if ((*(int *)(unaff_x29 + -0x88) == 0) || (7 < uVar34)) {
                          uVar45 = uVar35 - uVar26;
                          uVar60 = (uint)uVar33;
                          if (uVar35 < uVar26 || uVar45 == 0) {
                            puVar7 = (uint *)(*(long *)(unaff_x29 + -0x90) +
                                             (ulong)(uVar26 - uVar35));
                            if (*(short *)((long)puVar14 + (long)(int)uVar60 + -1) !=
                                *(short *)((long)puVar7 + (long)(int)uVar60 + -1))
                            goto code_r0x000b1b0c;
                            if (*puVar7 != uVar13) goto code_r0x000b1a3c;
                            puVar20 = (ulong *)(puVar7 + 1);
                            puVar24 = puVar37;
                            if (puVar37 < unaff_x28) {
                              uVar47 = *puVar37 ^ *puVar20;
                              if (uVar47 == 0) {
                                puVar20 = (ulong *)(puVar7 + 3);
                                puVar24 = puVar21;
                                goto joined_r0x000b22e8;
                              }
                              uVar47 = (uVar47 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                                       (uVar47 & 0x5555555555555555) << 1;
                              uVar47 = (uVar47 & 0xcccccccccccccccc) >> 2 |
                                       (uVar47 & 0x3333333333333333) << 2;
                              uVar47 = (uVar47 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                                       (uVar47 & 0xf0f0f0f0f0f0f0f) << 4;
                              uVar47 = (uVar47 & 0xff00ff00ff00ff00) >> 8 |
                                       (uVar47 & 0xff00ff00ff00ff) << 8;
                              uVar47 = (uVar47 & 0xffff0000ffff0000) >> 0x10 |
                                       (uVar47 & 0xffff0000ffff) << 0x10;
                              iVar17 = (int)((ulong)LZCOUNT(uVar47 >> 0x20 | uVar47 << 0x20) >> 3);
                            }
                            else {
joined_r0x000b22e8:
                              if (puVar24 < unaff_x28) {
                                iVar17 = *(int *)(unaff_x29 + -0xc0) + (int)puVar24;
                                do {
                                  uVar47 = *puVar24 ^ *puVar20;
                                  if (uVar47 != 0) {
                                    uVar47 = (uVar47 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                                             (uVar47 & 0x5555555555555555) << 1;
                                    uVar47 = (uVar47 & 0xcccccccccccccccc) >> 2 |
                                             (uVar47 & 0x3333333333333333) << 2;
                                    uVar47 = (uVar47 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                                             (uVar47 & 0xf0f0f0f0f0f0f0f) << 4;
                                    uVar47 = (uVar47 & 0xff00ff00ff00ff00) >> 8 |
                                             (uVar47 & 0xff00ff00ff00ff) << 8;
                                    uVar47 = (uVar47 & 0xffff0000ffff0000) >> 0x10 |
                                             (uVar47 & 0xffff0000ffff) << 0x10;
                                    iVar17 = (int)((ulong)LZCOUNT(uVar47 >> 0x20 | uVar47 << 0x20)
                                                  >> 3) + iVar17;
                                    goto code_r0x000b1d64;
                                  }
                                  puVar24 = puVar24 + 1;
                                  puVar20 = puVar20 + 1;
                                  iVar17 = iVar17 + 8;
                                } while (puVar24 < unaff_x28);
                              }
                              if (puVar24 < param_11) {
                                if ((uint)*puVar20 == (uint)*puVar24) {
                                  puVar24 = (ulong *)((long)puVar24 + 4);
                                  puVar20 = (ulong *)((long)puVar20 + 4);
                                }
                              }
                              if (puVar24 < param_10) {
                                if ((short)*puVar20 == (short)*puVar24) {
                                  puVar24 = (ulong *)((long)puVar24 + 2);
                                  puVar20 = (ulong *)((long)puVar20 + 2);
                                }
                              }
                              if (puVar24 < puVar46) {
                                if ((char)*puVar20 == (char)*puVar24) {
                                  puVar24 = (ulong *)((long)puVar24 + 1);
                                }
                              }
                              iVar17 = (int)puVar24 - iVar32;
                            }
code_r0x000b1d64:
                            uVar45 = iVar17 + 4;
                            uVar38 = (ulong)uVar45;
                            if ((int)uVar45 <= (int)uVar60) {
                              uVar45 = uVar60;
                              uVar34 = uVar28;
                            }
                            uVar28 = uVar34;
                            uVar33 = (ulong)uVar45;
                          }
                          else {
                            if ((*(uint *)(unaff_x29 + -0xd0) < uVar26) ||
                               (puVar7 = (uint *)((long)in_x13 +
                                                 (ulong)(uVar26 - (int)*(undefined8 *)
                                                                        (unaff_x29 + -0xa8))),
                               *puVar7 != uVar13)) {
code_r0x000b1b0c:
                              uVar38 = 0;
                              goto code_r0x000b1da0;
                            }
                            puVar24 = (ulong *)((long)unaff_x24 + (ulong)uVar45);
                            puVar20 = puVar46;
                            if (puVar24 <= puVar46) {
                              puVar20 = puVar24;
                            }
                            puVar19 = (ulong *)(puVar7 + 1);
                            puVar11 = (ulong *)((long)puVar20 - 7);
                            puVar22 = puVar37;
                            if (puVar37 < puVar11) {
                              uVar47 = *puVar37 ^ *puVar19;
                              if (uVar47 == 0) {
                                puVar19 = (ulong *)(puVar7 + 3);
                                puVar22 = puVar21;
                                goto joined_r0x000b22d8;
                              }
                              uVar47 = (uVar47 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                                       (uVar47 & 0x5555555555555555) << 1;
                              uVar47 = (uVar47 & 0xcccccccccccccccc) >> 2 |
                                       (uVar47 & 0x3333333333333333) << 2;
                              uVar47 = (uVar47 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                                       (uVar47 & 0xf0f0f0f0f0f0f0f) << 4;
                              uVar47 = (uVar47 & 0xff00ff00ff00ff00) >> 8 |
                                       (uVar47 & 0xff00ff00ff00ff) << 8;
                              uVar47 = (uVar47 & 0xffff0000ffff0000) >> 0x10 |
                                       (uVar47 & 0xffff0000ffff) << 0x10;
                              iVar17 = (int)((ulong)LZCOUNT(uVar47 >> 0x20 | uVar47 << 0x20) >> 3);
code_r0x000b1bbc:
                              unaff_x24 = *(ulong **)(unaff_x29 + -0xd8);
                            }
                            else {
joined_r0x000b22d8:
                              if (puVar22 < puVar11) {
                                iVar17 = *(int *)(unaff_x29 + -0xc0) + (int)puVar22;
                                do {
                                  uVar47 = *puVar22 ^ *puVar19;
                                  if (uVar47 != 0) {
                                    uVar47 = (uVar47 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                                             (uVar47 & 0x5555555555555555) << 1;
                                    uVar47 = (uVar47 & 0xcccccccccccccccc) >> 2 |
                                             (uVar47 & 0x3333333333333333) << 2;
                                    uVar47 = (uVar47 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                                             (uVar47 & 0xf0f0f0f0f0f0f0f) << 4;
                                    uVar47 = (uVar47 & 0xff00ff00ff00ff00) >> 8 |
                                             (uVar47 & 0xff00ff00ff00ff) << 8;
                                    uVar47 = (uVar47 & 0xffff0000ffff0000) >> 0x10 |
                                             (uVar47 & 0xffff0000ffff) << 0x10;
                                    iVar17 = (int)((ulong)LZCOUNT(uVar47 >> 0x20 | uVar47 << 0x20)
                                                  >> 3) + iVar17;
                                    goto code_r0x000b1bbc;
                                  }
                                  puVar22 = puVar22 + 1;
                                  puVar19 = puVar19 + 1;
                                  iVar17 = iVar17 + 8;
                                } while (puVar22 < puVar11);
                              }
                              if (puVar22 < (ulong *)((long)puVar20 - 3U)) {
                                if ((uint)*puVar19 == (uint)*puVar22) {
                                  puVar22 = (ulong *)((long)puVar22 + 4);
                                  puVar19 = (ulong *)((long)puVar19 + 4);
                                }
                                if (puVar22 < (ulong *)((long)puVar20 - 1U)) goto code_r0x000b2230;
                              }
                              else if (puVar22 < (ulong *)((long)puVar20 - 1U)) {
code_r0x000b2230:
                                if ((short)*puVar19 == (short)*puVar22) {
                                  puVar22 = (ulong *)((long)puVar22 + 2);
                                  puVar19 = (ulong *)((long)puVar19 + 2);
                                }
                              }
                              if (puVar22 < puVar20) {
                                if ((char)*puVar19 == (char)*puVar22) {
                                  puVar22 = (ulong *)((long)puVar22 + 1);
                                }
                              }
                              unaff_x24 = *(ulong **)(unaff_x29 + -0xd8);
                              iVar17 = (int)puVar22 - iVar32;
                            }
                            uVar61 = iVar17 + 4;
                            uVar38 = (ulong)uVar61;
                            if ((puVar24 < puVar46) &&
                               ((ulong *)((long)unaff_x24 + (long)(int)uVar61) == puVar20)) {
                              puVar24 = puVar20;
                              puVar22 = *(ulong **)(unaff_x29 + -0x90);
                              if (puVar20 < *(ulong **)(unaff_x29 + -0x78)) {
                                uVar47 = *puVar20 ^ **(ulong **)(unaff_x29 + -0x90);
                                if (uVar47 == 0) {
                                  puVar24 = puVar20 + 1;
                                  puVar22 = param_37;
                                  goto code_r0x000b1cac;
                                }
                                uVar47 = (uVar47 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                                         (uVar47 & 0x5555555555555555) << 1;
                                uVar47 = (uVar47 & 0xcccccccccccccccc) >> 2 |
                                         (uVar47 & 0x3333333333333333) << 2;
                                uVar47 = (uVar47 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                                         (uVar47 & 0xf0f0f0f0f0f0f0f) << 4;
                                uVar47 = (uVar47 & 0xff00ff00ff00ff00) >> 8 |
                                         (uVar47 & 0xff00ff00ff00ff) << 8;
                                uVar47 = (uVar47 & 0xffff0000ffff0000) >> 0x10 |
                                         (uVar47 & 0xffff0000ffff) << 0x10;
                                iVar17 = (int)((ulong)LZCOUNT(uVar47 >> 0x20 | uVar47 << 0x20) >> 3)
                                ;
code_r0x000b1d88:
                                unaff_x24 = *(ulong **)(unaff_x29 + -0xd8);
                              }
                              else {
code_r0x000b1cac:
                                if (puVar24 < *(ulong **)(unaff_x29 + -0x78)) {
                                  uVar47 = *(long *)(unaff_x29 + -0xd8) + (ulong)uVar45;
                                  uVar33 = param_25;
                                  if (uVar47 <= param_25) {
                                    uVar33 = uVar47;
                                  }
                                  iVar17 = (int)puVar24 - (int)uVar33;
                                  do {
                                    uVar47 = *puVar24 ^ *puVar22;
                                    if (uVar47 != 0) {
                                      uVar47 = (uVar47 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                                               (uVar47 & 0x5555555555555555) << 1;
                                      uVar47 = (uVar47 & 0xcccccccccccccccc) >> 2 |
                                               (uVar47 & 0x3333333333333333) << 2;
                                      uVar47 = (uVar47 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                                               (uVar47 & 0xf0f0f0f0f0f0f0f) << 4;
                                      uVar47 = (uVar47 & 0xff00ff00ff00ff00) >> 8 |
                                               (uVar47 & 0xff00ff00ff00ff) << 8;
                                      uVar47 = (uVar47 & 0xffff0000ffff0000) >> 0x10 |
                                               (uVar47 & 0xffff0000ffff) << 0x10;
                                      iVar17 = (int)((ulong)LZCOUNT(uVar47 >> 0x20 | uVar47 << 0x20)
                                                    >> 3) + iVar17;
                                      goto code_r0x000b1d88;
                                    }
                                    puVar24 = puVar24 + 1;
                                    puVar22 = puVar22 + 1;
                                    iVar17 = iVar17 + 8;
                                  } while (puVar24 < *(ulong **)(unaff_x29 + -0x78));
                                }
                                if (puVar24 < param_11) {
                                  if ((uint)*puVar22 == (uint)*puVar24) {
                                    puVar24 = (ulong *)((long)puVar24 + 4);
                                    puVar22 = (ulong *)((long)puVar22 + 4);
                                  }
                                }
                                if (puVar24 < param_10) {
                                  if ((short)*puVar22 == (short)*puVar24) {
                                    puVar24 = (ulong *)((long)puVar24 + 2);
                                    puVar22 = (ulong *)((long)puVar22 + 2);
                                  }
                                }
                                if (puVar24 < puVar46) {
                                  if ((char)*puVar22 == (char)*puVar24) {
                                    puVar24 = (ulong *)((long)puVar24 + 1);
                                  }
                                }
                                unaff_x24 = *(ulong **)(unaff_x29 + -0xd8);
                                iVar17 = (int)puVar24 - (int)puVar20;
                              }
                              uVar38 = (ulong)(iVar17 + uVar61);
                            }
                            uVar45 = (uint)uVar38;
                            if ((int)(uint)uVar38 <= (int)uVar60) {
                              uVar45 = uVar60;
                              uVar34 = uVar28;
                            }
                            uVar28 = uVar34;
                            uVar33 = (ulong)uVar45;
                          }
                        }
                        else {
code_r0x000b1a3c:
                          uVar38 = 0;
                        }
code_r0x000b1da0:
                        iVar17 = iVar3 + -1;
                        iVar41 = (int)uVar33;
                        iVar43 = (int)uVar38;
                        if (((iVar43 == iVar41) && (iVar41 + uVar26 <= uVar6)) && (3 < iVar43)) {
                          iVar10 = 0;
                          uVar34 = 1;
                          iVar42 = iVar48;
                          iVar18 = 0x10;
                          do {
                            uVar1 = *(ushort *)(unaff_x26 + (ulong)(iVar10 + uVar26 & 0xffff) * 2);
                            uVar45 = (uint)uVar1;
                            bVar2 = uVar45 <= uVar34;
                            if (uVar34 <= uVar45) {
                              uVar34 = (uint)uVar1;
                            }
                            iVar48 = iVar10;
                            if (bVar2) {
                              iVar48 = iVar42;
                            }
                            iVar10 = iVar10 + (iVar18 >> 4);
                            iVar49 = 0x10;
                            if (bVar2) {
                              iVar49 = iVar18 + 1;
                            }
                            iVar42 = iVar48;
                            iVar18 = iVar49;
                          } while (iVar10 < iVar43 + -3);
                          if (uVar34 < 2) goto code_r0x000b1e00;
                          if (uVar34 <= uVar26) {
                            uVar47 = (ulong)(uVar26 - uVar34);
                            goto code_r0x000b1f5c;
                          }
                          unaff_x28 = *(ulong **)(unaff_x29 + -0x78);
                          break;
                        }
code_r0x000b1e00:
                        unaff_x28 = *(ulong **)(unaff_x29 + -0x78);
                        if (*(short *)(unaff_x26 + (ulong)(uVar26 & 0xffff) * 2) == 1 && iVar48 == 0
                           ) {
                          if (iVar12 == 0) {
                            puVar24 = puVar37;
                            puVar20 = puVar37;
                            if ((uVar13 & 0xffff) == uVar13 >> 0x10 &&
                                (uVar13 & 0xff) == uVar13 >> 0x18) {
                              for (; puVar24 < unaff_x28; puVar24 = puVar24 + 1) {
                                uVar47 = *puVar24 ^ uVar30;
                                if (uVar47 != 0) {
                                  uVar47 = (uVar47 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                                           (uVar47 & 0x5555555555555555) << 1;
                                  uVar47 = (uVar47 & 0xcccccccccccccccc) >> 2 |
                                           (uVar47 & 0x3333333333333333) << 2;
                                  uVar47 = (uVar47 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                                           (uVar47 & 0xf0f0f0f0f0f0f0f) << 4;
                                  uVar47 = (uVar47 & 0xff00ff00ff00ff00) >> 8 |
                                           (uVar47 & 0xff00ff00ff00ff) << 8;
                                  uVar47 = (uVar47 & 0xffff0000ffff0000) >> 0x10 |
                                           (uVar47 & 0xffff0000ffff) << 0x10;
                                  puVar20 = (ulong *)((long)puVar20 +
                                                     ((ulong)LZCOUNT(uVar47 >> 0x20 | uVar47 << 0x20
                                                                    ) >> 3));
                                  goto code_r0x000b1f78;
                                }
                                puVar20 = puVar20 + 1;
                              }
                              if (puVar24 < puVar46) {
                                lVar9 = (long)puVar46 - (long)puVar20;
                                puVar22 = (ulong *)((long)puVar24 + lVar9);
                                uVar47 = uVar30;
                                do {
                                  puVar20 = puVar24;
                                  if ((uint)(byte)*puVar24 != ((uint)uVar47 & 0xff))
                                  goto code_r0x000b1f78;
                                  puVar24 = (ulong *)((long)puVar24 + 1);
                                  uVar47 = uVar47 >> 8;
                                  lVar9 = lVar9 + -1;
                                } while (lVar9 != 0);
                                puVar20 = puVar22;
                              }
code_r0x000b1f78:
                              uVar31 = (ulong)(uint)((int)puVar20 - iVar32) + 4;
                              iVar12 = 2;
                              goto code_r0x000b1e24;
                            }
                            iVar12 = 1;
                            goto code_r0x000b1a08;
                          }
                          if (iVar12 != 2) goto code_r0x000b1a08;
code_r0x000b1e24:
                          uVar34 = uVar26 - 1;
                          if (uVar34 < uVar27) {
code_r0x000b1a04:
                            unaff_x28 = *(ulong **)(unaff_x29 + -0x78);
                            goto code_r0x000b1a08;
                          }
                          if (uVar35 - uVar26 < 3) {
code_r0x000b1a00:
                            iVar12 = 2;
                            goto code_r0x000b1a04;
                          }
                          puVar7 = (uint *)((long)in_x13 +
                                           (ulong)(uVar34 - (int)*(undefined8 *)(unaff_x29 + -0xa8))
                                           );
                          puVar25 = (uint *)(*(long *)(unaff_x29 + -0x90) + (ulong)(uVar34 - uVar35)
                                            );
                          if (uVar34 < uVar35) {
                            puVar25 = puVar7;
                          }
                          if (*puVar25 != uVar13) goto code_r0x000b1a00;
                          puVar24 = puVar46;
                          if (uVar34 < uVar35) {
                            puVar24 = param_52;
                          }
                          puVar20 = (ulong *)(puVar25 + 1);
                          puVar22 = puVar20;
                          if (puVar20 < (ulong *)((long)puVar24 - 7U)) {
                            puVar19 = puVar20;
                            do {
                              uVar47 = *puVar22 ^ uVar30;
                              if (uVar47 != 0) {
                                uVar47 = (uVar47 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                                         (uVar47 & 0x5555555555555555) << 1;
                                uVar47 = (uVar47 & 0xcccccccccccccccc) >> 2 |
                                         (uVar47 & 0x3333333333333333) << 2;
                                uVar47 = (uVar47 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                                         (uVar47 & 0xf0f0f0f0f0f0f0f) << 4;
                                uVar47 = (uVar47 & 0xff00ff00ff00ff00) >> 8 |
                                         (uVar47 & 0xff00ff00ff00ff) << 8;
                                uVar47 = (uVar47 & 0xffff0000ffff0000) >> 0x10 |
                                         (uVar47 & 0xffff0000ffff) << 0x10;
                                puVar22 = (ulong *)((long)puVar19 +
                                                   ((ulong)LZCOUNT(uVar47 >> 0x20 | uVar47 << 0x20)
                                                   >> 3));
                                goto code_r0x000b1f9c;
                              }
                              puVar22 = puVar22 + 1;
                              puVar19 = puVar19 + 1;
                            } while (puVar22 < (ulong *)((long)puVar24 - 7U));
                          }
                          if (puVar22 < puVar24) {
                            lVar9 = (long)puVar24 - (long)puVar22;
                            uVar47 = uVar30;
                            do {
                              if ((uint)(byte)*puVar22 != ((uint)uVar47 & 0xff))
                              goto code_r0x000b1f9c;
                              puVar22 = (ulong *)((long)puVar22 + 1);
                              uVar47 = uVar47 >> 8;
                              lVar9 = lVar9 + -1;
                            } while (lVar9 != 0);
                            puVar22 = puVar24;
                          }
code_r0x000b1f9c:
                          uVar38 = (long)puVar22 - (long)puVar20;
                          uVar47 = (uVar38 & 0xffffffff) + 4;
                          if (uVar34 < uVar35) {
                            puVar29 = in_x13;
                            if ((ulong *)((long)puVar7 + uVar47) == param_52) {
                              uVar53 = uVar30;
                              if ((uVar38 & 3) != 0) {
                                uVar26 = (int)uVar38 * -8 & 0x1f;
                                uVar26 = uVar13 >> uVar26 | uVar13 << 0x20 - uVar26;
                                uVar53 = CONCAT44(uVar26,uVar26);
                              }
                              puVar24 = *(ulong **)(unaff_x29 + -0x90);
                              puVar20 = puVar24;
                              if (puVar24 < *(ulong **)(unaff_x29 + -0x78)) {
                                do {
                                  uVar38 = *puVar20 ^ uVar53;
                                  if (uVar38 != 0) {
                                    uVar38 = (uVar38 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                                             (uVar38 & 0x5555555555555555) << 1;
                                    uVar38 = (uVar38 & 0xcccccccccccccccc) >> 2 |
                                             (uVar38 & 0x3333333333333333) << 2;
                                    uVar38 = (uVar38 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                                             (uVar38 & 0xf0f0f0f0f0f0f0f) << 4;
                                    uVar38 = (uVar38 & 0xff00ff00ff00ff00) >> 8 |
                                             (uVar38 & 0xff00ff00ff00ff) << 8;
                                    uVar38 = (uVar38 & 0xffff0000ffff0000) >> 0x10 |
                                             (uVar38 & 0xffff0000ffff) << 0x10;
                                    puVar24 = (ulong *)((long)puVar24 +
                                                       ((ulong)LZCOUNT(uVar38 >> 0x20 |
                                                                       uVar38 << 0x20) >> 3));
                                    goto code_r0x000b205c;
                                  }
                                  puVar20 = puVar20 + 1;
                                  puVar24 = puVar24 + 1;
                                } while (puVar20 < *(ulong **)(unaff_x29 + -0x78));
                              }
                              if (puVar20 < puVar46) {
                                lVar9 = (long)puVar46 - (long)puVar24;
                                puVar22 = (ulong *)((long)puVar20 + lVar9);
                                do {
                                  puVar24 = puVar20;
                                  if ((uint)(byte)*puVar20 != ((uint)uVar53 & 0xff))
                                  goto code_r0x000b205c;
                                  puVar20 = (ulong *)((long)puVar20 + 1);
                                  uVar53 = uVar53 >> 8;
                                  lVar9 = lVar9 + -1;
                                } while (lVar9 != 0);
                                puVar24 = puVar22;
                              }
code_r0x000b205c:
                              uVar47 = (uint)((int)puVar24 - (int)*(undefined8 *)(unaff_x29 + -0x90)
                                             ) + uVar47;
                            }
                          }
                          else {
                            puVar29 = *(uint **)(unaff_x29 + -0x90);
                          }
                          *(uint *)(unaff_x29 + -0x6c) = uVar13;
                          puVar7 = puVar25;
                          do {
                            puVar23 = puVar7;
                            if (puVar23 < puVar29 + 1) break;
                            puVar7 = puVar23 + -1;
                          } while (puVar23[-1] == uVar13);
                          puVar7 = puVar23;
                          if (puVar29 < puVar23) {
                            lVar9 = 0;
                            do {
                              puVar7 = (uint *)((long)puVar23 + lVar9);
                              if (*(char *)((long)puVar7 + -1) !=
                                  *(char *)(*(long *)(unaff_x29 + -0x80) + lVar9))
                              goto code_r0x000b20d4;
                              lVar9 = lVar9 + -1;
                            } while (puVar29 < (uint *)((long)puVar23 + lVar9));
                            puVar7 = puVar29;
                          }
code_r0x000b20d4:
                          iVar48 = (int)((long)puVar25 - (long)puVar7);
                          if (((uVar35 <= uVar34) &&
                              ((long)puVar25 - ((long)puVar25 - (long)puVar7 & 0xffffffffU) ==
                               *(long *)(unaff_x29 + -0x90))) &&
                             ((uint)*(undefined8 *)(unaff_x29 + -0xa8) < uVar35)) {
                            uVar45 = iVar48 * 8 & 0x1f;
                            uVar26 = uVar13;
                            if ((-iVar48 & 3U) != 0) {
                              uVar26 = uVar13 >> uVar45 | uVar13 << 0x20 - uVar45;
                            }
                            *(uint *)(unaff_x29 + -0x6c) = uVar26;
                            lVar9 = param_36;
                            do {
                              lVar8 = lVar9;
                              if (lVar8 < 4) {
                                puVar7 = (uint *)((long)in_x13 + lVar8);
                                if (lVar8 < 1) goto code_r0x000b2168;
                                break;
                              }
                              lVar9 = lVar8 + -4;
                            } while (*(uint *)((long)in_x13 + lVar8 + -4) == uVar26);
                            pcVar15 = *(char **)(unaff_x29 + -0x80);
                            puVar7 = (uint *)((long)in_x13 + lVar8);
                            do {
                              puVar25 = (uint *)((long)puVar7 + -1);
                              if (*(char *)puVar25 != *pcVar15) goto code_r0x000b2168;
                              pcVar15 = pcVar15 + -1;
                              puVar7 = puVar25;
                            } while (in_x13 < puVar25);
                            puVar7 = in_x13;
code_r0x000b2168:
                            iVar48 = ((int)param_52 - (int)puVar7) + iVar48;
                          }
                          uVar26 = uVar34 - iVar48;
                          if (uVar34 - iVar48 <= uVar27) {
                            uVar26 = uVar27;
                          }
                          uVar53 = uVar47 + (uVar34 - uVar26);
                          uVar38 = uVar33;
                          if ((uVar31 < uVar47) || (uVar53 < uVar31)) {
                            if (uVar35 + ~uVar26 < 3) {
                              iVar48 = 0;
                              iVar12 = 2;
                              uVar47 = in_x9;
                              goto code_r0x000b1f5c;
                            }
                            if (uVar31 <= uVar53) {
                              uVar53 = uVar31;
                            }
                            unaff_x28 = *(ulong **)(unaff_x29 + -0x78);
                            if ((ulong)(long)iVar41 < uVar53) {
                              if (*(long *)(unaff_x29 + -0xe0) - (ulong)uVar26 >> 0x10 != 0) break;
                              uVar28 = uVar6 - uVar26;
                              uVar38 = uVar53;
                            }
                            uVar34 = (uint)*(ushort *)(unaff_x26 + (ulong)(uVar26 & 0xffff) * 2);
                            uVar47 = (ulong)(uVar26 - uVar34);
                            if (uVar26 < uVar34) break;
                            iVar48 = 0;
                            iVar12 = 2;
                            uVar33 = uVar38;
                          }
                          else {
                            iVar48 = 0;
                            uVar34 = (uVar34 - (int)uVar31) + (int)uVar47;
                            uVar26 = uVar35;
                            if (2 < uVar35 + ~uVar34) {
                              uVar26 = uVar34;
                            }
                            iVar12 = 2;
                            uVar47 = (ulong)uVar26;
code_r0x000b1f5c:
                            unaff_x28 = *(ulong **)(unaff_x29 + -0x78);
                            uVar33 = uVar38;
                          }
                        }
                        else {
code_r0x000b1a08:
                          uVar47 = (ulong)(uVar26 - *(ushort *)
                                                     (unaff_x26 +
                                                     (ulong)(iVar48 + uVar26 & 0xffff) * 2));
                        }
                        bVar2 = 1 < iVar3;
                        uVar38 = uVar33;
                        iVar3 = iVar17;
                      } while (uVar27 <= (uint)uVar47 && bVar2);
                    }
                    uVar34 = (uint)uVar38;
                    lVar9 = *(long *)(unaff_x29 + -0xb0);
                    param_42 = (long *)(lVar9 + 0x40000);
                    iVar48 = (int)unaff_x24;
                    if (((uVar6 < *(uint *)(unaff_x29 + -0xf0)) &&
                        (*(int *)(unaff_x29 + -0xe4) == 1)) && (0 < iVar17)) {
                      lVar8 = (*param_42 - *(long *)(&UNK_00040008 + lVar9)) +
                              (ulong)*(uint *)(&UNK_00040018 + lVar9);
                      uVar26 = *(uint *)(*(long *)(unaff_x29 + -0xb0) +
                                        (ulong)((uint)*unaff_x24 * -0x61c8864f >> 0x11) * 4);
                      iVar3 = (uVar26 + uVar27) - (int)lVar8;
                      uVar27 = uVar6 - iVar3;
                      if (uVar27 >> 0x10 == 0) {
                        do {
                          uVar34 = (uint)uVar38;
                          if (iVar17 == 0) break;
                          puVar7 = (uint *)((*(long *)(&UNK_00040008 + lVar9) -
                                            (ulong)*(uint *)(&UNK_00040018 + lVar9)) + (ulong)uVar26
                                           );
                          if (*puVar7 == uVar13) {
                            puVar14 = (ulong *)((long)unaff_x24 + (lVar8 - (ulong)uVar26));
                            puVar24 = puVar46;
                            if (puVar14 <= puVar46) {
                              puVar24 = puVar14;
                            }
                            puVar20 = (ulong *)(puVar7 + 1);
                            puVar22 = (ulong *)((long)puVar24 - 7);
                            puVar14 = puVar37;
                            if (puVar37 < puVar22) {
                              uVar47 = *puVar37 ^ *puVar20;
                              if (uVar47 == 0) {
                                puVar20 = (ulong *)(puVar7 + 3);
                                puVar14 = puVar21;
                                goto joined_r0x000b19c0;
                              }
                              uVar47 = (uVar47 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                                       (uVar47 & 0x5555555555555555) << 1;
                              uVar47 = (uVar47 & 0xcccccccccccccccc) >> 2 |
                                       (uVar47 & 0x3333333333333333) << 2;
                              uVar47 = (uVar47 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                                       (uVar47 & 0xf0f0f0f0f0f0f0f) << 4;
                              uVar47 = (uVar47 & 0xff00ff00ff00ff00) >> 8 |
                                       (uVar47 & 0xff00ff00ff00ff) << 8;
                              uVar47 = (uVar47 & 0xffff0000ffff0000) >> 0x10 |
                                       (uVar47 & 0xffff0000ffff) << 0x10;
                              iVar12 = (int)((ulong)LZCOUNT(uVar47 >> 0x20 | uVar47 << 0x20) >> 3);
                            }
                            else {
joined_r0x000b19c0:
                              if (puVar14 < puVar22) {
                                iVar12 = (-4 - iVar48) + (int)puVar14;
                                do {
                                  uVar47 = *puVar14 ^ *puVar20;
                                  if (uVar47 != 0) {
                                    uVar47 = (uVar47 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                                             (uVar47 & 0x5555555555555555) << 1;
                                    uVar47 = (uVar47 & 0xcccccccccccccccc) >> 2 |
                                             (uVar47 & 0x3333333333333333) << 2;
                                    uVar47 = (uVar47 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                                             (uVar47 & 0xf0f0f0f0f0f0f0f) << 4;
                                    uVar47 = (uVar47 & 0xff00ff00ff00ff00) >> 8 |
                                             (uVar47 & 0xff00ff00ff00ff) << 8;
                                    uVar47 = (uVar47 & 0xffff0000ffff0000) >> 0x10 |
                                             (uVar47 & 0xffff0000ffff) << 0x10;
                                    iVar12 = (int)((ulong)LZCOUNT(uVar47 >> 0x20 | uVar47 << 0x20)
                                                  >> 3) + iVar12;
                                    goto code_r0x000b1850;
                                  }
                                  puVar14 = puVar14 + 1;
                                  puVar20 = puVar20 + 1;
                                  iVar12 = iVar12 + 8;
                                } while (puVar14 < puVar22);
                              }
                              if (puVar14 < (ulong *)((long)puVar24 - 3U)) {
                                if ((uint)*puVar20 == (uint)*puVar14) {
                                  puVar14 = (ulong *)((long)puVar14 + 4);
                                  puVar20 = (ulong *)((long)puVar20 + 4);
                                }
                                if (puVar14 < (ulong *)((long)puVar24 - 1U)) goto code_r0x000b1990;
                              }
                              else if (puVar14 < (ulong *)((long)puVar24 - 1U)) {
code_r0x000b1990:
                                if ((short)*puVar20 == (short)*puVar14) {
                                  puVar14 = (ulong *)((long)puVar14 + 2);
                                  puVar20 = (ulong *)((long)puVar20 + 2);
                                }
                              }
                              if (puVar14 < puVar24) {
                                if ((char)*puVar20 == (char)*puVar14) {
                                  puVar14 = (ulong *)((long)puVar14 + 1);
                                }
                              }
                              iVar12 = (int)puVar14 - iVar32;
                            }
code_r0x000b1850:
                            uVar45 = iVar12 + 4U;
                            if ((int)(iVar12 + 4U) <= (int)uVar34) {
                              uVar45 = uVar34;
                              uVar27 = uVar28;
                            }
                            uVar28 = uVar27;
                            uVar38 = (ulong)uVar45;
                          }
                          uVar34 = (uint)uVar38;
                          iVar17 = iVar17 + -1;
                          uVar27 = (uint)*(ushort *)
                                          (*(long *)(unaff_x29 + -0xb0) +
                                           (ulong)(uVar26 & 0xffff) * 2 + 0x20000);
                          uVar26 = uVar26 - uVar27;
                          iVar3 = iVar3 - uVar27;
                          uVar27 = uVar6 - iVar3;
                        } while (uVar27 < 0x10000);
                      }
                    }
                    if ((int)uVar34 < 4) {
                      lVar9 = *(long *)(unaff_x29 + -0x98);
                      puVar14 = (ulong *)((long)unaff_x24 + 1);
                      goto code_r0x000b1698;
                    }
                    uVar31 = (long)unaff_x24 - (long)param_49;
                    uVar47 = 0x12;
                    if (0x11 < uVar34 - 0x13 || *(int *)(unaff_x29 + -0x88) == 0) {
                      uVar47 = (ulong)uVar34;
                    }
                    lVar9 = *(long *)(unaff_x29 + -0x98);
                    uVar6 = (uint)uVar31;
                    if (param_31 < uVar47) {
                      puVar14 = (ulong *)(param_44 + 1);
                      pcVar15 = param_44;
                      if ((param_55._4_4_ != 0) &&
                         (param_39 < (char *)((long)puVar14 + uVar31 + uVar31 / 0xff + 8)))
                      goto code_r0x000b49e4;
                      uVar33 = uVar31 - 0xf;
                      if (uVar31 < 0xf) {
                        *param_44 = (char)(uVar6 << 4);
                      }
                      else {
                        *param_44 = -0x10;
                        puVar37 = puVar14;
                        if (0xfe < uVar33) {
                          uVar33 = (uVar31 - 0x10e) / 0xff;
                          _memset(puVar14,0xff,uVar33 + 1);
                          in_s23 = 4;
                          in_register_000052e4 = 4;
                          in_register_000052e8 = 4;
                          in_register_000052ec = 4;
                          in_s21 = -0x13;
                          in_register_000052a4 = -0x13;
                          in_register_000052a8 = -0x13;
                          in_register_000052ac = -0x13;
                          lVar9 = *(long *)(unaff_x29 + -0x98);
                          unaff_x24 = *(ulong **)(unaff_x29 + -0xd8);
                          puVar37 = (ulong *)(param_44 + uVar33 + 2);
                          uVar33 = (uVar31 - 0x10e) % 0xff;
                          in_d20 = param_28;
                          in_register_00005288 = param_29;
                          in_d22 = param_26;
                          in_register_000052c8 = param_27;
                        }
                        puVar14 = (ulong *)((long)puVar37 + 1);
                        *(char *)puVar37 = (char)uVar33;
                      }
                      puVar37 = (ulong *)((long)puVar14 + uVar31);
                      puVar21 = (ulong *)((char *)((long)puVar14 + (long)unaff_x24) +
                                         -(long)param_49);
                      if ((char *)((long)puVar14 + (long)unaff_x24) + -(long)param_49 <= puVar14 + 1
                         ) {
                        puVar21 = puVar14 + 1;
                      }
                      puVar24 = param_49;
                      puVar20 = puVar14;
                      if (((char *)((long)puVar21 + ~(ulong)puVar14) <
                           &segment_command_00000020.vmaddr) ||
                         ((ulong)((long)puVar14 - (long)param_49) < 0x40)) {
code_r0x000b2570:
                        do {
                          puVar21 = puVar20 + 1;
                          *puVar20 = *puVar24;
                          puVar24 = puVar24 + 1;
                          puVar20 = puVar21;
                        } while (puVar21 < puVar37);
                      }
                      else {
                        uVar33 = ((long)puVar21 + ~(ulong)puVar14 >> 3) + 1;
                        uVar38 = uVar33 & 0x3ffffffffffffff8;
                        puVar21 = param_49 + 4;
                        puVar24 = puVar14 + 4;
                        uVar30 = uVar38;
                        do {
                          uVar50 = puVar21[-4];
                          uVar54 = puVar21[-1];
                          uVar53 = puVar21[-2];
                          uVar55 = *puVar21;
                          uVar6 = *(uint *)((long)puVar21 + 4);
                          uVar40 = puVar21[1];
                          uVar27 = *(uint *)((long)puVar21 + 0xc);
                          uVar52 = puVar21[3];
                          uVar51 = puVar21[2];
                          puVar24[-3] = puVar21[-3];
                          puVar24[-4] = uVar50;
                          puVar24[-1] = uVar54;
                          puVar24[-2] = uVar53;
                          *(uint *)(puVar24 + 1) = (uint)uVar40;
                          *(uint *)((long)puVar24 + 0xc) = uVar27;
                          *(uint *)puVar24 = (uint)uVar55;
                          *(uint *)((long)puVar24 + 4) = uVar6;
                          puVar24[3] = uVar52;
                          puVar24[2] = uVar51;
                          uVar30 = uVar30 - 8;
                          puVar21 = puVar21 + 8;
                          puVar24 = puVar24 + 8;
                        } while (uVar30 != 0);
                        puVar24 = param_49 + uVar38;
                        puVar20 = puVar14 + uVar38;
                        if (uVar33 != uVar38) goto code_r0x000b2570;
                      }
                      pcVar5 = (char *)((long)puVar37 + 2);
                      *(short *)puVar37 = (short)uVar28;
                      uVar33 = uVar47 - 4;
                      if ((param_55._4_4_ != 0) && (param_39 < pcVar5 + uVar33 / 0xff + 6))
                      goto code_r0x000b49e4;
                      if (uVar33 < 0xf) {
                        *param_44 = *param_44 + (char)uVar33;
                        unaff_x28 = *(ulong **)(unaff_x29 + -0x78);
                      }
                      else {
                        *param_44 = *param_44 + '\x0f';
                        uVar33 = uVar47 - 0x13;
                        if (0x1fd < uVar33) {
                          lVar8 = ((uVar47 - 0x211) / 0x1fe) * 2;
                          _memset(pcVar5,0xff,lVar8 + 2);
                          in_s23 = 4;
                          in_register_000052e4 = 4;
                          in_register_000052e8 = 4;
                          in_register_000052ec = 4;
                          in_s21 = -0x13;
                          in_register_000052a4 = -0x13;
                          in_register_000052a8 = -0x13;
                          in_register_000052ac = -0x13;
                          lVar9 = *(long *)(unaff_x29 + -0x98);
                          unaff_x24 = *(ulong **)(unaff_x29 + -0xd8);
                          pcVar5 = (char *)((long)puVar14 + lVar8 + uVar31 + 4);
                          uVar33 = (uVar47 - 0x211) % 0x1fe;
                          puVar46 = *(ulong **)(unaff_x29 + -200);
                          in_d20 = param_28;
                          in_register_00005288 = param_29;
                          in_d22 = param_26;
                          in_register_000052c8 = param_27;
                        }
                        unaff_x28 = *(ulong **)(unaff_x29 + -0x78);
                        pcVar15 = pcVar5;
                        if (0xfe < uVar33) {
                          pcVar15 = pcVar5 + 1;
                          *pcVar5 = -1;
                          uVar33 = uVar33 - 0xff;
                        }
                        pcVar5 = pcVar15 + 1;
                        *pcVar15 = (char)uVar33;
                      }
                      param_49 = (ulong *)((long)unaff_x24 + uVar47);
                      param_44 = pcVar5;
                      puVar14 = param_49;
                      goto code_r0x000b1698;
                    }
                    if (0xe < (int)uVar6) {
                      uVar31 = (ulong)((uVar6 - 0xf) / 0xff + uVar6 + 1);
                    }
                    iVar3 = uVar6 + 1;
                    puVar36 = *(undefined4 **)(unaff_x29 + -0xa0);
                    *(undefined8 *)(puVar36 + 1) = unaff_d8;
                    puVar36[3] = uVar6;
                    *puVar36 = (int)uVar31;
                    iVar32 = iVar3;
                    if (0xe < iVar3) {
                      iVar32 = iVar3 + (uVar6 - 0xe) / 0xff + 1;
                    }
                    lVar8 = *(long *)(unaff_x29 + -0xa0);
                    *(undefined8 *)(lVar8 + 0x14) = unaff_d8;
                    *(int *)(lVar8 + 0x1c) = iVar3;
                    iVar12 = uVar6 + 2;
                    *(int *)(lVar8 + 0x10) = iVar32;
                    if ((int)uVar6 < 0xd) {
                      lVar8 = *(long *)(unaff_x29 + -0xa0);
                      *(undefined8 *)(lVar8 + 0x24) = unaff_d8;
                      *(int *)(lVar8 + 0x2c) = iVar12;
                      *(int *)(lVar8 + 0x20) = iVar12;
                      if (uVar6 == 0xc) {
                        iVar32 = 0xf;
                        goto code_r0x000b24c0;
                      }
                      iVar32 = uVar6 + 3;
                      iVar12 = iVar32;
                    }
                    else {
                      iVar32 = uVar6 + 3;
                      lVar8 = *(long *)(unaff_x29 + -0xa0);
                      *(undefined8 *)(lVar8 + 0x24) = unaff_d8;
                      *(int *)(lVar8 + 0x2c) = iVar12;
                      *(uint *)(lVar8 + 0x20) = (uVar6 - 0xd) / 0xff + iVar32;
code_r0x000b24c0:
                      iVar12 = uVar6 + (uVar6 - 0xc) / 0xff + 4;
                    }
                    lVar8 = *(long *)(unaff_x29 + -0xa0);
                    *(undefined8 *)(lVar8 + 0x34) = unaff_d8;
                    *(int *)(lVar8 + 0x3c) = iVar32;
                    *(int *)(lVar8 + 0x30) = iVar12;
                    uVar27 = iVar3 + (uVar6 - 0xf) / 0xff;
                    if ((int)uVar6 < 0xf) {
                      uVar27 = uVar6;
                    }
                    uVar13 = uVar27 + 3;
                    iVar32 = uVar27 + 4;
                    uVar31 = uVar47 - 3;
                    if (uVar31 < 4) {
                      uVar33 = 4;
code_r0x000b2740:
                      piVar16 = (int *)(param_22 + uVar33 * 0x10);
                      do {
                        uVar27 = uVar13;
                        if (0x12 < uVar33) {
                          uVar27 = iVar32 + ((int)uVar33 - 0x13U) / 0xff;
                        }
                        *piVar16 = (int)uVar33;
                        piVar16[1] = uVar6;
                        piVar16[-2] = uVar27;
                        piVar16[-1] = uVar28;
                        uVar33 = uVar33 + 1;
                        piVar16 = piVar16 + 4;
                      } while (uVar47 + 1 != uVar33);
                    }
                    else {
                      uVar40 = uVar31 & 0xfffffffffffffffc;
                      uVar33 = uVar40 + 4;
                      puVar7 = param_20;
                      uVar30 = uVar40;
                      uVar38 = param_14;
                      uVar53 = param_15;
                      uVar54 = param_16;
                      uVar55 = param_17;
                      uVar56 = param_12;
                      uVar57 = param_13;
                      do {
                        uVar27 = (uint)uVar56;
                        uVar34 = (uint)((ulong)uVar56 >> 0x20);
                        auVar58._0_8_ = CONCAT44(uVar34 + in_register_000052a4,uVar27 + in_s21);
                        uVar26 = (uint)uVar57;
                        auVar58._8_4_ = uVar26 + in_register_000052a8;
                        uVar45 = (uint)((ulong)uVar57 >> 0x20);
                        auVar58._12_4_ = uVar45 + in_register_000052ac;
                        auVar59 = NEON_umull(auVar58._0_8_,in_d22,4);
                        uVar60 = iVar32 + (auVar59._4_4_ >> 7);
                        uVar61 = iVar32 + (auVar59._12_4_ >> 7);
                        uVar62 = iVar32 + (uint)((auVar58._8_8_ & 0xffffffff) *
                                                 (in_register_000052c8 & 0xffffffff) >> 0x27);
                        uVar63 = iVar32 + (uint)((auVar58._8_8_ >> 0x20) *
                                                 (in_register_000052c8 >> 0x20) >> 0x27);
                        *puVar7 = uVar60 ^ (uVar60 ^ uVar13) & -(uint)(uVar38 < in_d20);
                        puVar7[1] = uVar28;
                        puVar7[2] = uVar27;
                        puVar7[3] = uVar6;
                        puVar7[4] = uVar61 ^ (uVar61 ^ uVar13) &
                                             -(uint)(uVar53 < in_register_00005288);
                        puVar7[5] = uVar28;
                        puVar7[6] = uVar34;
                        puVar7[7] = uVar6;
                        puVar7[8] = uVar62 ^ (uVar62 ^ uVar13) & -(uint)(uVar54 < in_d20);
                        puVar7[9] = uVar28;
                        puVar7[10] = uVar26;
                        puVar7[0xb] = uVar6;
                        puVar7[0xc] = uVar63 ^ (uVar63 ^ uVar13) &
                                               -(uint)(uVar55 < in_register_00005288);
                        puVar7[0xd] = uVar28;
                        puVar7[0xe] = uVar45;
                        puVar7[0xf] = uVar6;
                        puVar7 = puVar7 + 0x10;
                        uVar54 = uVar54 + 4;
                        uVar55 = uVar55 + 4;
                        uVar38 = uVar38 + 4;
                        uVar53 = uVar53 + 4;
                        uVar56 = CONCAT44(uVar34 + in_register_000052e4,uVar27 + in_s23);
                        uVar57 = CONCAT44(uVar45 + in_register_000052ec,
                                          uVar26 + in_register_000052e8);
                        uVar30 = uVar30 - 4;
                      } while (uVar30 != 0);
                      if (uVar31 != uVar40) goto code_r0x000b2740;
                    }
                    piVar16 = (int *)(*(long *)(unaff_x29 + -0xa0) + uVar47 * 0x10);
                    *(undefined8 *)(piVar16 + 5) = unaff_d8;
                    iVar32 = *piVar16;
                    piVar16[4] = iVar32 + 1;
                    *(undefined8 *)(piVar16 + 9) = unaff_d8;
                    piVar16[7] = 1;
                    piVar16[8] = iVar32 + 2;
                    *(undefined8 *)(piVar16 + 0xd) = unaff_d8;
                    piVar16[0xf] = 3;
                    piVar16[0xb] = 2;
                    piVar16[0xc] = iVar32 + 3;
                    if (1 < (uint)uVar47) goto code_r0x000b27c4;
                    unaff_x28 = *(ulong **)(unaff_x29 + -0x78);
                    uVar31 = uVar47;
                  } while( true );
                }
                in_x17 = (ulong)(iVar32 + 1);
                param_46 = unaff_x30 + 1;
                param_43 = (int *)(*(long *)(unaff_x29 + -0xa0) + param_46 * 0x10);
                param_33 = *param_43;
                unaff_w20 = *(int *)(*(long *)(unaff_x29 + -0xa0) + unaff_x30 * 0x10);
                uVar6 = (uint)in_x9;
                if (0xb < param_35) {
                  if ((unaff_w20 < param_33) ||
                     (unaff_w20 + 3 <=
                      *(int *)(*(long *)(unaff_x29 + -0xa0) + unaff_x30 * 0x10 + 0x40))) {
                    *(ulong *)(unaff_x29 + -0xf8) = uVar47;
                    uVar28 = uVar6 + (int)((long)unaff_x25 - lVar39);
                    uVar27 = (uint)*(undefined8 *)(unaff_x29 + -0xa8);
                    if (*(uint *)(unaff_x29 + -0xf0) <= uVar28) {
                      uVar27 = uVar28 - 0xffff;
                    }
                    uVar35 = (uint)*unaff_x25;
                    uVar13 = *(uint *)(*(long *)(unaff_x29 + -0xb8) + 0x20);
                    uVar47 = (ulong)uVar13;
                    uVar34 = uVar35;
                    if (uVar13 < uVar28) {
                      do {
                        lVar44 = (ulong)((uint)(*(int *)(lVar8 + uVar47) * -0x61c8864f) >> 0x11) * 4
                        ;
                        uVar13 = (int)uVar47 - *(int *)(lVar9 + lVar44);
                        if (0xfffe < uVar13) {
                          uVar13 = 0xffff;
                        }
                        *(short *)(unaff_x26 + (uVar47 & 0xffff) * 2) = (short)uVar13;
                        *(int *)(lVar9 + lVar44) = (int)uVar47;
                        uVar47 = uVar47 + 1;
                      } while (in_x17 != uVar47);
                      uVar34 = (uint)*unaff_x25;
                    }
                    *(uint *)(*(long *)(unaff_x29 + -0xb8) + 0x20) = uVar28;
                    uVar13 = *(uint *)(lVar9 + (ulong)(uVar34 * -0x61c8864f >> 0x11) * 4);
                    uVar47 = (ulong)uVar13;
                    puVar46 = (ulong *)((long)unaff_x25 + 4);
                    puVar14 = (ulong *)((long)unaff_x25 + 0xc);
                    iVar32 = (int)puVar46;
                    if (uVar13 < uVar27 || param_45 < 1) {
                      in_w15 = 0;
                      unaff_x19 = 3;
                      iVar17 = param_45;
                    }
                    else {
                      iVar48 = 0;
                      iVar12 = 0;
                      param_32 = 0;
                      in_w15 = 0;
                      uVar33 = CONCAT44(uVar35,uVar35);
                      uVar31 = 3;
                      iVar3 = param_45;
                      do {
                        uVar13 = (uint)uVar47;
                        uVar34 = (uint)uVar31;
                        if ((*(int *)(unaff_x29 + -0x88) == 0) || (7 < uVar28 - uVar13)) {
                          uVar26 = uVar6 - uVar13;
                          if (uVar6 < uVar13 || uVar26 == 0) {
                            puVar7 = (uint *)(*(long *)(unaff_x29 + -0x90) + (ulong)(uVar13 - uVar6)
                                             );
                            if ((*(short *)((long)unaff_x25 + (long)(int)uVar34 + -1) !=
                                 *(short *)((long)puVar7 + (long)(int)uVar34 + -1)) ||
                               (*puVar7 != uVar35)) goto code_r0x000b2f60;
                            puVar21 = (ulong *)(puVar7 + 1);
                            puVar37 = puVar46;
                            if (puVar46 < unaff_x28) {
                              uVar47 = *puVar46 ^ *puVar21;
                              if (uVar47 == 0) {
                                puVar21 = (ulong *)(puVar7 + 3);
                                puVar37 = puVar14;
                                goto joined_r0x000b3878;
                              }
                              uVar47 = (uVar47 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                                       (uVar47 & 0x5555555555555555) << 1;
                              uVar47 = (uVar47 & 0xcccccccccccccccc) >> 2 |
                                       (uVar47 & 0x3333333333333333) << 2;
                              uVar47 = (uVar47 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                                       (uVar47 & 0xf0f0f0f0f0f0f0f) << 4;
                              uVar47 = (uVar47 & 0xff00ff00ff00ff00) >> 8 |
                                       (uVar47 & 0xff00ff00ff00ff) << 8;
                              uVar47 = (uVar47 & 0xffff0000ffff0000) >> 0x10 |
                                       (uVar47 & 0xffff0000ffff) << 0x10;
                              unaff_x19 = (ulong)((int)((ulong)LZCOUNT(uVar47 >> 0x20 |
                                                                       uVar47 << 0x20) >> 3) + 4);
                            }
                            else {
joined_r0x000b3878:
                              if (puVar37 < unaff_x28) {
                                iVar17 = *(int *)(unaff_x29 + -0xe0) + (int)puVar37;
                                do {
                                  uVar47 = *puVar37 ^ *puVar21;
                                  if (uVar47 != 0) {
                                    uVar47 = (uVar47 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                                             (uVar47 & 0x5555555555555555) << 1;
                                    uVar47 = (uVar47 & 0xcccccccccccccccc) >> 2 |
                                             (uVar47 & 0x3333333333333333) << 2;
                                    uVar47 = (uVar47 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                                             (uVar47 & 0xf0f0f0f0f0f0f0f) << 4;
                                    uVar47 = (uVar47 & 0xff00ff00ff00ff00) >> 8 |
                                             (uVar47 & 0xff00ff00ff00ff) << 8;
                                    uVar47 = (uVar47 & 0xffff0000ffff0000) >> 0x10 |
                                             (uVar47 & 0xffff0000ffff) << 0x10;
                                    lVar9 = *(long *)(unaff_x29 + -0x98);
                                    unaff_x19 = (ulong)((int)((ulong)LZCOUNT(uVar47 >> 0x20 |
                                                                             uVar47 << 0x20) >> 3) +
                                                        iVar17 + 4);
                                    goto code_r0x000b3358;
                                  }
                                  puVar37 = puVar37 + 1;
                                  puVar21 = puVar21 + 1;
                                  iVar17 = iVar17 + 8;
                                } while (puVar37 < unaff_x28);
                              }
                              if (puVar37 < param_11) {
                                if ((uint)*puVar21 == (uint)*puVar37) {
                                  puVar37 = (ulong *)((long)puVar37 + 4);
                                  puVar21 = (ulong *)((long)puVar21 + 4);
                                }
                                if (puVar37 < param_10) goto code_r0x000b37d4;
code_r0x000b323c:
                                if (puVar37 < *(ulong **)(unaff_x29 + -200)) {
code_r0x000b3248:
                                  if ((char)*puVar21 == (char)*puVar37) {
                                    puVar37 = (ulong *)((long)puVar37 + 1);
                                  }
                                }
                              }
                              else {
                                if (param_10 <= puVar37) goto code_r0x000b323c;
code_r0x000b37d4:
                                if ((short)*puVar21 == (short)*puVar37) {
                                  puVar37 = (ulong *)((long)puVar37 + 2);
                                  puVar21 = (ulong *)((long)puVar21 + 2);
                                }
                                if (puVar37 < *(ulong **)(unaff_x29 + -200)) goto code_r0x000b3248;
                              }
                              lVar9 = *(long *)(unaff_x29 + -0x98);
                              unaff_x19 = (ulong)(((int)puVar37 - iVar32) + 4);
                            }
                          }
                          else {
                            if ((*(uint *)(unaff_x29 + -0xd0) < uVar13) ||
                               (puVar7 = (uint *)((long)in_x13 +
                                                 (ulong)(uVar13 - (int)*(undefined8 *)
                                                                        (unaff_x29 + -0xa8))),
                               *puVar7 != uVar35)) goto code_r0x000b2f60;
                            puVar37 = (ulong *)((long)unaff_x25 + (ulong)uVar26);
                            puVar21 = *(ulong **)(unaff_x29 + -200);
                            if (puVar37 <= *(ulong **)(unaff_x29 + -200)) {
                              puVar21 = puVar37;
                            }
                            puVar20 = (ulong *)(puVar7 + 1);
                            puVar22 = (ulong *)((long)puVar21 - 7);
                            puVar24 = puVar46;
                            if (puVar46 < puVar22) {
                              uVar47 = *puVar46 ^ *puVar20;
                              if (uVar47 == 0) {
                                puVar20 = (ulong *)(puVar7 + 3);
                                puVar24 = puVar14;
                                goto joined_r0x000b3850;
                              }
                              uVar47 = (uVar47 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                                       (uVar47 & 0x5555555555555555) << 1;
                              uVar47 = (uVar47 & 0xcccccccccccccccc) >> 2 |
                                       (uVar47 & 0x3333333333333333) << 2;
                              uVar47 = (uVar47 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                                       (uVar47 & 0xf0f0f0f0f0f0f0f) << 4;
                              uVar47 = (uVar47 & 0xff00ff00ff00ff00) >> 8 |
                                       (uVar47 & 0xff00ff00ff00ff) << 8;
                              uVar47 = (uVar47 & 0xffff0000ffff0000) >> 0x10 |
                                       (uVar47 & 0xffff0000ffff) << 0x10;
                              iVar17 = (int)((ulong)LZCOUNT(uVar47 >> 0x20 | uVar47 << 0x20) >> 3);
code_r0x000b316c:
                              lVar9 = *(long *)(unaff_x29 + -0x98);
                              unaff_x24 = *(ulong **)(unaff_x29 + -0xd8);
                            }
                            else {
joined_r0x000b3850:
                              if (puVar24 < puVar22) {
                                iVar17 = *(int *)(unaff_x29 + -0xe0) + (int)puVar24;
                                do {
                                  uVar47 = *puVar24 ^ *puVar20;
                                  if (uVar47 != 0) {
                                    uVar47 = (uVar47 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                                             (uVar47 & 0x5555555555555555) << 1;
                                    uVar47 = (uVar47 & 0xcccccccccccccccc) >> 2 |
                                             (uVar47 & 0x3333333333333333) << 2;
                                    uVar47 = (uVar47 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                                             (uVar47 & 0xf0f0f0f0f0f0f0f) << 4;
                                    uVar47 = (uVar47 & 0xff00ff00ff00ff00) >> 8 |
                                             (uVar47 & 0xff00ff00ff00ff) << 8;
                                    uVar47 = (uVar47 & 0xffff0000ffff0000) >> 0x10 |
                                             (uVar47 & 0xffff0000ffff) << 0x10;
                                    iVar17 = (int)((ulong)LZCOUNT(uVar47 >> 0x20 | uVar47 << 0x20)
                                                  >> 3) + iVar17;
                                    goto code_r0x000b316c;
                                  }
                                  puVar24 = puVar24 + 1;
                                  puVar20 = puVar20 + 1;
                                  iVar17 = iVar17 + 8;
                                } while (puVar24 < puVar22);
                              }
                              if (puVar24 < (ulong *)((long)puVar21 - 3U)) {
                                if ((uint)*puVar20 == (uint)*puVar24) {
                                  puVar24 = (ulong *)((long)puVar24 + 4);
                                  puVar20 = (ulong *)((long)puVar20 + 4);
                                }
                                lVar9 = *(long *)(unaff_x29 + -0x98);
                                if (puVar24 < (ulong *)((long)puVar21 - 1U)) goto code_r0x000b37a0;
                              }
                              else {
                                lVar9 = *(long *)(unaff_x29 + -0x98);
                                if (puVar24 < (ulong *)((long)puVar21 - 1U)) {
code_r0x000b37a0:
                                  if ((short)*puVar20 == (short)*puVar24) {
                                    puVar24 = (ulong *)((long)puVar24 + 2);
                                    puVar20 = (ulong *)((long)puVar20 + 2);
                                  }
                                }
                              }
                              if (puVar24 < puVar21) {
                                if ((char)*puVar20 == (char)*puVar24) {
                                  puVar24 = (ulong *)((long)puVar24 + 1);
                                }
                              }
                              unaff_x24 = *(ulong **)(unaff_x29 + -0xd8);
                              iVar17 = (int)puVar24 - iVar32;
                            }
                            uVar45 = iVar17 + 4;
                            unaff_x19 = (ulong)uVar45;
                            if (puVar37 < *(ulong **)(unaff_x29 + -200)) {
                              unaff_x28 = *(ulong **)(unaff_x29 + -0x78);
                              if ((ulong *)((long)unaff_x25 + (long)(int)uVar45) != puVar21)
                              goto code_r0x000b3358;
                              puVar24 = *(ulong **)(unaff_x29 + -0x90);
                              puVar37 = puVar21;
                              if (puVar21 < unaff_x28) {
                                uVar47 = *puVar21 ^ **(ulong **)(unaff_x29 + -0x90);
                                if (uVar47 == 0) {
                                  puVar37 = puVar21 + 1;
                                  puVar24 = param_37;
                                  goto code_r0x000b3274;
                                }
                                uVar47 = (uVar47 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                                         (uVar47 & 0x5555555555555555) << 1;
                                uVar47 = (uVar47 & 0xcccccccccccccccc) >> 2 |
                                         (uVar47 & 0x3333333333333333) << 2;
                                uVar47 = (uVar47 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                                         (uVar47 & 0xf0f0f0f0f0f0f0f) << 4;
                                uVar47 = (uVar47 & 0xff00ff00ff00ff00) >> 8 |
                                         (uVar47 & 0xff00ff00ff00ff) << 8;
                                uVar47 = (uVar47 & 0xffff0000ffff0000) >> 0x10 |
                                         (uVar47 & 0xffff0000ffff) << 0x10;
                                iVar17 = (int)((ulong)LZCOUNT(uVar47 >> 0x20 | uVar47 << 0x20) >> 3)
                                ;
code_r0x000b334c:
                                unaff_x24 = *(ulong **)(unaff_x29 + -0xd8);
                              }
                              else {
code_r0x000b3274:
                                if (puVar37 < *(ulong **)(unaff_x29 + -0x78)) {
                                  uVar47 = (long)param_48 + (ulong)uVar26;
                                  uVar31 = param_25;
                                  if (uVar47 <= param_25) {
                                    uVar31 = uVar47;
                                  }
                                  iVar17 = (int)puVar37 - (int)uVar31;
                                  do {
                                    uVar47 = *puVar37 ^ *puVar24;
                                    if (uVar47 != 0) {
                                      uVar47 = (uVar47 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                                               (uVar47 & 0x5555555555555555) << 1;
                                      uVar47 = (uVar47 & 0xcccccccccccccccc) >> 2 |
                                               (uVar47 & 0x3333333333333333) << 2;
                                      uVar47 = (uVar47 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                                               (uVar47 & 0xf0f0f0f0f0f0f0f) << 4;
                                      uVar47 = (uVar47 & 0xff00ff00ff00ff00) >> 8 |
                                               (uVar47 & 0xff00ff00ff00ff) << 8;
                                      uVar47 = (uVar47 & 0xffff0000ffff0000) >> 0x10 |
                                               (uVar47 & 0xffff0000ffff) << 0x10;
                                      iVar17 = (int)((ulong)LZCOUNT(uVar47 >> 0x20 | uVar47 << 0x20)
                                                    >> 3) + iVar17;
                                      goto code_r0x000b334c;
                                    }
                                    puVar37 = puVar37 + 1;
                                    puVar24 = puVar24 + 1;
                                    iVar17 = iVar17 + 8;
                                  } while (puVar37 < *(ulong **)(unaff_x29 + -0x78));
                                }
                                if (puVar37 < param_11) {
                                  if ((uint)*puVar24 == (uint)*puVar37) {
                                    puVar37 = (ulong *)((long)puVar37 + 4);
                                    puVar24 = (ulong *)((long)puVar24 + 4);
                                  }
                                  if (puVar37 < param_10) goto code_r0x000b380c;
code_r0x000b32f4:
                                  if (puVar37 < *(ulong **)(unaff_x29 + -200)) {
code_r0x000b3300:
                                    if ((char)*puVar24 == (char)*puVar37) {
                                      puVar37 = (ulong *)((long)puVar37 + 1);
                                    }
                                  }
                                }
                                else {
                                  if (param_10 <= puVar37) goto code_r0x000b32f4;
code_r0x000b380c:
                                  if ((short)*puVar24 == (short)*puVar37) {
                                    puVar37 = (ulong *)((long)puVar37 + 2);
                                    puVar24 = (ulong *)((long)puVar24 + 2);
                                  }
                                  if (puVar37 < *(ulong **)(unaff_x29 + -200))
                                  goto code_r0x000b3300;
                                }
                                unaff_x24 = *(ulong **)(unaff_x29 + -0xd8);
                                iVar17 = (int)puVar37 - (int)puVar21;
                              }
                              unaff_x19 = (ulong)(iVar17 + uVar45);
                            }
                            unaff_x28 = *(ulong **)(unaff_x29 + -0x78);
                          }
code_r0x000b3358:
                          uVar60 = (uint)unaff_x19;
                          uVar26 = uVar60;
                          uVar45 = uVar28 - uVar13;
                          if ((int)uVar60 <= (int)uVar34) {
                            uVar26 = uVar34;
                            uVar45 = in_w15;
                          }
                          in_w15 = uVar45;
                          uVar31 = (ulong)uVar26;
                          if (uVar60 == uVar26) goto code_r0x000b2f70;
code_r0x000b3370:
                          unaff_x19 = uVar31;
                          iVar17 = iVar3 + -1;
                          if (*(short *)(unaff_x26 + (ulong)(uVar13 & 0xffff) * 2) == 1 &&
                              iVar48 == 0) {
                            if (iVar12 == 0) {
                              if ((uVar35 & 0xffff) == uVar35 >> 0x10 &&
                                  (uVar35 & 0xff) == uVar35 >> 0x18) {
                                puVar37 = param_51;
                                puVar21 = puVar46;
                                if (puVar46 < unaff_x28) {
                                  do {
                                    uVar47 = *puVar21 ^ uVar33;
                                    if (uVar47 != 0) {
                                      uVar47 = (uVar47 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                                               (uVar47 & 0x5555555555555555) << 1;
                                      uVar47 = (uVar47 & 0xcccccccccccccccc) >> 2 |
                                               (uVar47 & 0x3333333333333333) << 2;
                                      uVar47 = (uVar47 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                                               (uVar47 & 0xf0f0f0f0f0f0f0f) << 4;
                                      uVar47 = (uVar47 & 0xff00ff00ff00ff00) >> 8 |
                                               (uVar47 & 0xff00ff00ff00ff) << 8;
                                      uVar47 = (uVar47 & 0xffff0000ffff0000) >> 0x10 |
                                               (uVar47 & 0xffff0000ffff) << 0x10;
                                      puVar37 = (ulong *)((long)puVar37 +
                                                         ((ulong)LZCOUNT(uVar47 >> 0x20 |
                                                                         uVar47 << 0x20) >> 3));
                                      goto code_r0x000b34d4;
                                    }
                                    puVar21 = puVar21 + 1;
                                    puVar37 = puVar37 + 1;
                                  } while (puVar21 < unaff_x28);
                                  puVar24 = *(ulong **)(unaff_x29 + -200);
                                  if (puVar21 < puVar24) goto code_r0x000b3488;
                                }
                                else {
                                  puVar24 = *(ulong **)(unaff_x29 + -200);
                                  puVar37 = puVar46;
                                  if (puVar46 < puVar24) {
code_r0x000b3488:
                                    lVar9 = (long)puVar24 - (long)puVar37;
                                    puVar37 = (ulong *)((long)puVar21 + lVar9);
                                    uVar47 = uVar33;
                                    do {
                                      if ((uint)(byte)*puVar21 != ((uint)uVar47 & 0xff))
                                      goto code_r0x000b34b4;
                                      puVar21 = (ulong *)((long)puVar21 + 1);
                                      uVar47 = uVar47 >> 8;
                                      lVar9 = lVar9 + -1;
                                    } while (lVar9 != 0);
                                    puVar21 = puVar37;
code_r0x000b34b4:
                                    lVar9 = *(long *)(unaff_x29 + -0x98);
                                    puVar37 = puVar21;
                                  }
                                }
code_r0x000b34d4:
                                param_32 = (ulong)(uint)((int)puVar37 - iVar32) + 4;
                                iVar12 = 2;
                                goto code_r0x000b3390;
                              }
                              iVar12 = 1;
                            }
                            else if (iVar12 == 2) {
code_r0x000b3390:
                              uVar34 = uVar13 - 1;
                              if (uVar27 <= uVar34) {
                                if (2 < uVar6 - uVar13) {
                                  puVar7 = (uint *)((long)in_x13 +
                                                   (ulong)(uVar34 - (int)*(undefined8 *)
                                                                          (unaff_x29 + -0xa8)));
                                  puVar25 = (uint *)(*(long *)(unaff_x29 + -0x90) +
                                                    (ulong)(uVar34 - uVar6));
                                  if (uVar34 < uVar6) {
                                    puVar25 = puVar7;
                                  }
                                  if (*puVar25 == uVar35) {
                                    puVar37 = *(ulong **)(unaff_x29 + -200);
                                    if (uVar34 < uVar6) {
                                      puVar37 = param_52;
                                    }
                                    puVar21 = (ulong *)(puVar25 + 1);
                                    puVar24 = puVar21;
                                    if (puVar21 < (ulong *)((long)puVar37 - 7U)) {
                                      puVar20 = puVar21;
                                      do {
                                        uVar47 = *puVar24 ^ uVar33;
                                        if (uVar47 != 0) {
                                          uVar47 = (uVar47 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                                                   (uVar47 & 0x5555555555555555) << 1;
                                          uVar47 = (uVar47 & 0xcccccccccccccccc) >> 2 |
                                                   (uVar47 & 0x3333333333333333) << 2;
                                          uVar47 = (uVar47 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                                                   (uVar47 & 0xf0f0f0f0f0f0f0f) << 4;
                                          uVar47 = (uVar47 & 0xff00ff00ff00ff00) >> 8 |
                                                   (uVar47 & 0xff00ff00ff00ff) << 8;
                                          uVar47 = (uVar47 & 0xffff0000ffff0000) >> 0x10 |
                                                   (uVar47 & 0xffff0000ffff) << 0x10;
                                          puVar24 = (ulong *)((long)puVar20 +
                                                             ((ulong)LZCOUNT(uVar47 >> 0x20 |
                                                                             uVar47 << 0x20) >> 3));
                                          goto code_r0x000b34fc;
                                        }
                                        puVar24 = puVar24 + 1;
                                        puVar20 = puVar20 + 1;
                                      } while (puVar24 < (ulong *)((long)puVar37 - 7U));
                                    }
                                    if (puVar24 < puVar37) {
                                      lVar9 = (long)puVar37 - (long)puVar24;
                                      uVar47 = uVar33;
                                      do {
                                        if ((uint)(byte)*puVar24 != ((uint)uVar47 & 0xff))
                                        goto code_r0x000b34fc;
                                        puVar24 = (ulong *)((long)puVar24 + 1);
                                        uVar47 = uVar47 >> 8;
                                        lVar9 = lVar9 + -1;
                                      } while (lVar9 != 0);
                                      puVar24 = puVar37;
                                    }
code_r0x000b34fc:
                                    uVar31 = (long)puVar24 - (long)puVar21;
                                    uVar47 = (uVar31 & 0xffffffff) + 4;
                                    if (uVar34 < uVar6) {
                                      puVar29 = in_x13;
                                      if ((ulong *)((long)puVar7 + uVar47) == param_52) {
                                        uVar30 = uVar33;
                                        if ((uVar31 & 3) != 0) {
                                          uVar13 = (int)uVar31 * -8 & 0x1f;
                                          uVar13 = uVar35 >> uVar13 | uVar35 << 0x20 - uVar13;
                                          uVar30 = CONCAT44(uVar13,uVar13);
                                        }
                                        puVar21 = *(ulong **)(unaff_x29 + -0x90);
                                        puVar37 = puVar21;
                                        for (; puVar21 < unaff_x28; puVar21 = puVar21 + 1) {
                                          uVar31 = *puVar21 ^ uVar30;
                                          if (uVar31 != 0) {
                                            uVar31 = (uVar31 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                                                     (uVar31 & 0x5555555555555555) << 1;
                                            uVar31 = (uVar31 & 0xcccccccccccccccc) >> 2 |
                                                     (uVar31 & 0x3333333333333333) << 2;
                                            uVar31 = (uVar31 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                                                     (uVar31 & 0xf0f0f0f0f0f0f0f) << 4;
                                            uVar31 = (uVar31 & 0xff00ff00ff00ff00) >> 8 |
                                                     (uVar31 & 0xff00ff00ff00ff) << 8;
                                            uVar31 = (uVar31 & 0xffff0000ffff0000) >> 0x10 |
                                                     (uVar31 & 0xffff0000ffff) << 0x10;
                                            puVar37 = (ulong *)((long)puVar37 +
                                                               ((ulong)LZCOUNT(uVar31 >> 0x20 |
                                                                               uVar31 << 0x20) >> 3)
                                                               );
                                            goto code_r0x000b35c0;
                                          }
                                          puVar37 = puVar37 + 1;
                                        }
                                        if (puVar21 < *(ulong **)(unaff_x29 + -200)) {
                                          lVar9 = (long)*(ulong **)(unaff_x29 + -200) -
                                                  (long)puVar37;
                                          puVar24 = (ulong *)((long)puVar21 + lVar9);
                                          do {
                                            puVar37 = puVar21;
                                            if ((uint)(byte)*puVar21 != ((uint)uVar30 & 0xff))
                                            goto code_r0x000b35c0;
                                            puVar21 = (ulong *)((long)puVar21 + 1);
                                            uVar30 = uVar30 >> 8;
                                            lVar9 = lVar9 + -1;
                                          } while (lVar9 != 0);
                                          puVar37 = puVar24;
                                        }
code_r0x000b35c0:
                                        uVar47 = (uint)((int)puVar37 -
                                                       (int)*(undefined8 *)(unaff_x29 + -0x90)) +
                                                 uVar47;
                                      }
                                    }
                                    else {
                                      puVar29 = *(uint **)(unaff_x29 + -0x90);
                                    }
                                    *(uint *)(unaff_x29 + -0x6c) = uVar35;
                                    puVar7 = puVar25;
                                    do {
                                      puVar23 = puVar7;
                                      if (puVar23 < puVar29 + 1) break;
                                      puVar7 = puVar23 + -1;
                                    } while (puVar23[-1] == uVar35);
                                    puVar7 = puVar23;
                                    if (puVar29 < puVar23) {
                                      lVar9 = 0;
                                      do {
                                        puVar7 = (uint *)((long)puVar23 + lVar9);
                                        if (*(char *)((long)puVar7 + -1) !=
                                            *(char *)(*(long *)(unaff_x29 + -0x80) + lVar9))
                                        goto code_r0x000b3638;
                                        lVar9 = lVar9 + -1;
                                      } while (puVar29 < (uint *)((long)puVar23 + lVar9));
                                      puVar7 = puVar29;
                                    }
code_r0x000b3638:
                                    iVar48 = (int)((long)puVar25 - (long)puVar7);
                                    lVar9 = *(long *)(unaff_x29 + -0x98);
                                    if (((uVar6 <= uVar34) &&
                                        ((long)puVar25 -
                                         ((long)puVar25 - (long)puVar7 & 0xffffffffU) ==
                                         *(long *)(unaff_x29 + -0x90))) &&
                                       ((uint)*(undefined8 *)(unaff_x29 + -0xa8) < uVar6)) {
                                      uVar26 = iVar48 * 8 & 0x1f;
                                      uVar13 = uVar35;
                                      if ((-iVar48 & 3U) != 0) {
                                        uVar13 = uVar35 >> uVar26 | uVar35 << 0x20 - uVar26;
                                      }
                                      *(uint *)(unaff_x29 + -0x6c) = uVar13;
                                      lVar9 = param_36;
                                      do {
                                        lVar8 = lVar9;
                                        if (lVar8 < 4) {
                                          puVar7 = (uint *)((long)in_x13 + lVar8);
                                          if (lVar8 < 1) goto code_r0x000b36d0;
                                          break;
                                        }
                                        lVar9 = lVar8 + -4;
                                      } while (*(uint *)((long)in_x13 + lVar8 + -4) == uVar13);
                                      pcVar15 = *(char **)(unaff_x29 + -0x80);
                                      puVar7 = (uint *)((long)in_x13 + lVar8);
                                      do {
                                        puVar25 = (uint *)((long)puVar7 + -1);
                                        if (*(char *)puVar25 != *pcVar15) goto code_r0x000b36d0;
                                        pcVar15 = pcVar15 + -1;
                                        puVar7 = puVar25;
                                      } while (in_x13 < puVar25);
                                      puVar7 = in_x13;
code_r0x000b36d0:
                                      iVar48 = ((int)param_52 - (int)puVar7) + iVar48;
                                      lVar9 = *(long *)(unaff_x29 + -0x98);
                                    }
                                    uVar13 = uVar34 - iVar48;
                                    if (uVar34 - iVar48 <= uVar27) {
                                      uVar13 = uVar27;
                                    }
                                    uVar31 = uVar47 + (uVar34 - uVar13);
                                    if ((param_32 < uVar47) || (uVar31 < param_32)) {
                                      if (uVar6 + ~uVar13 < 3) {
                                        iVar48 = 0;
                                        iVar12 = 2;
                                        uVar47 = in_x9;
                                      }
                                      else {
                                        if (param_32 <= uVar31) {
                                          uVar31 = param_32;
                                        }
                                        if ((ulong)(long)(int)unaff_x19 < uVar31) {
                                          if ((((long)unaff_x25 - lVar39) + in_x9) - (ulong)uVar13
                                              >> 0x10 != 0) break;
                                          in_w15 = uVar28 - uVar13;
                                          unaff_x19 = uVar31;
                                        }
                                        uVar34 = (uint)*(ushort *)
                                                        (unaff_x26 + (ulong)(uVar13 & 0xffff) * 2);
                                        uVar47 = (ulong)(uVar13 - uVar34);
                                        if (uVar13 < uVar34) break;
                                        iVar48 = 0;
                                        iVar12 = 2;
                                      }
                                    }
                                    else {
                                      iVar48 = 0;
                                      uVar13 = (uVar34 - (int)param_32) + (int)uVar47;
                                      uVar34 = uVar6;
                                      if (2 < uVar6 + ~uVar13) {
                                        uVar34 = uVar13;
                                      }
                                      iVar12 = 2;
                                      uVar47 = (ulong)uVar34;
                                    }
                                    goto code_r0x000b2f3c;
                                  }
                                }
                                iVar12 = 2;
                              }
                            }
                          }
                          uVar47 = (ulong)(uVar13 - *(ushort *)
                                                     (unaff_x26 +
                                                     (ulong)(iVar48 + uVar13 & 0xffff) * 2));
                        }
                        else {
code_r0x000b2f60:
                          unaff_x19 = 0;
                          if (uVar34 != 0) goto code_r0x000b3370;
code_r0x000b2f70:
                          iVar17 = iVar3 + -1;
                          if (uVar28 < (int)uVar31 + uVar13) goto code_r0x000b3370;
                          if ((int)unaff_x19 < 4) goto code_r0x000b3370;
                          iVar41 = 0;
                          uVar34 = 1;
                          iVar43 = iVar48;
                          iVar10 = 0x10;
                          do {
                            uVar1 = *(ushort *)(unaff_x26 + (ulong)(iVar41 + uVar13 & 0xffff) * 2);
                            uVar26 = (uint)uVar1;
                            bVar2 = uVar26 <= uVar34;
                            if (uVar34 <= uVar26) {
                              uVar34 = (uint)uVar1;
                            }
                            iVar48 = iVar41;
                            if (bVar2) {
                              iVar48 = iVar43;
                            }
                            iVar41 = iVar41 + (iVar10 >> 4);
                            iVar42 = 0x10;
                            if (bVar2) {
                              iVar42 = iVar10 + 1;
                            }
                            iVar43 = iVar48;
                            iVar10 = iVar42;
                          } while (iVar41 < (int)unaff_x19 + -3);
                          if (uVar34 < 2) {
                            lVar9 = *(long *)(unaff_x29 + -0x98);
                            goto code_r0x000b3370;
                          }
                          uVar26 = 0;
                          if (uVar34 <= uVar13) {
                            uVar26 = uVar34;
                          }
                          lVar9 = *(long *)(unaff_x29 + -0x98);
                          if (uVar13 < uVar34) break;
                          uVar47 = (ulong)(uVar13 - uVar26);
                        }
code_r0x000b2f3c:
                        iVar17 = iVar3 + -1;
                        bVar2 = 1 < iVar3;
                        uVar31 = unaff_x19;
                        iVar3 = iVar17;
                      } while (uVar27 <= (uint)uVar47 && bVar2);
                    }
                    if (((uVar28 < *(uint *)(unaff_x29 + -0xf0)) &&
                        (*(int *)(unaff_x29 + -0xe4) == 1)) && (0 < iVar17)) {
                      lVar8 = (*param_42 - param_42[1]) + (ulong)*(uint *)(param_42 + 3);
                      uVar6 = *(uint *)(*(long *)(unaff_x29 + -0xb0) +
                                       (ulong)((uint)*unaff_x25 * -0x61c8864f >> 0x11) * 4);
                      iVar48 = (uVar6 + uVar27) - (int)lVar8;
                      uVar27 = uVar28 - iVar48;
                      if (uVar27 >> 0x10 != 0) goto code_r0x000b2edc;
                      uVar47 = *(ulong *)(unaff_x29 + -0xf8);
                      do {
                        if (iVar17 == 0) break;
                        puVar7 = (uint *)((param_42[1] - (ulong)*(uint *)(param_42 + 3)) +
                                         (ulong)uVar6);
                        if (*puVar7 == uVar35) {
                          puVar37 = (ulong *)((long)unaff_x25 + (lVar8 - (ulong)uVar6));
                          puVar21 = *(ulong **)(unaff_x29 + -200);
                          if (puVar37 <= *(ulong **)(unaff_x29 + -200)) {
                            puVar21 = puVar37;
                          }
                          puVar24 = (ulong *)(puVar7 + 1);
                          puVar20 = (ulong *)((long)puVar21 - 7);
                          puVar37 = puVar46;
                          if (puVar46 < puVar20) {
                            uVar31 = *puVar46 ^ *puVar24;
                            if (uVar31 == 0) {
                              puVar24 = (ulong *)(puVar7 + 3);
                              puVar37 = puVar14;
                              goto joined_r0x000b2d18;
                            }
                            uVar31 = (uVar31 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                                     (uVar31 & 0x5555555555555555) << 1;
                            uVar31 = (uVar31 & 0xcccccccccccccccc) >> 2 |
                                     (uVar31 & 0x3333333333333333) << 2;
                            uVar31 = (uVar31 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                                     (uVar31 & 0xf0f0f0f0f0f0f0f) << 4;
                            uVar31 = (uVar31 & 0xff00ff00ff00ff00) >> 8 |
                                     (uVar31 & 0xff00ff00ff00ff) << 8;
                            uVar31 = (uVar31 & 0xffff0000ffff0000) >> 0x10 |
                                     (uVar31 & 0xffff0000ffff) << 0x10;
                            iVar3 = (int)((ulong)LZCOUNT(uVar31 >> 0x20 | uVar31 << 0x20) >> 3);
                            lVar9 = *(long *)(unaff_x29 + -0x98);
                          }
                          else {
joined_r0x000b2d18:
                            if (puVar37 < puVar20) {
                              iVar3 = *(int *)(unaff_x29 + -0xe0) + (int)puVar37;
                              do {
                                uVar47 = *puVar37 ^ *puVar24;
                                if (uVar47 != 0) {
                                  uVar47 = (uVar47 & 0xaaaaaaaaaaaaaaaa) >> 1 |
                                           (uVar47 & 0x5555555555555555) << 1;
                                  uVar47 = (uVar47 & 0xcccccccccccccccc) >> 2 |
                                           (uVar47 & 0x3333333333333333) << 2;
                                  uVar47 = (uVar47 & 0xf0f0f0f0f0f0f0f0) >> 4 |
                                           (uVar47 & 0xf0f0f0f0f0f0f0f) << 4;
                                  uVar47 = (uVar47 & 0xff00ff00ff00ff00) >> 8 |
                                           (uVar47 & 0xff00ff00ff00ff) << 8;
                                  uVar47 = (uVar47 & 0xffff0000ffff0000) >> 0x10 |
                                           (uVar47 & 0xffff0000ffff) << 0x10;
                                  iVar3 = (int)((ulong)LZCOUNT(uVar47 >> 0x20 | uVar47 << 0x20) >> 3
                                               ) + iVar3;
                                  lVar9 = *(long *)(unaff_x29 + -0x98);
                                  uVar47 = *(ulong *)(unaff_x29 + -0xf8);
                                  goto code_r0x000b2cc4;
                                }
                                puVar37 = puVar37 + 1;
                                puVar24 = puVar24 + 1;
                                iVar3 = iVar3 + 8;
                              } while (puVar37 < puVar20);
                            }
                            if (puVar37 < (ulong *)((long)puVar21 - 3U)) {
                              if ((uint)*puVar24 == (uint)*puVar37) {
                                puVar37 = (ulong *)((long)puVar37 + 4);
                                puVar24 = (ulong *)((long)puVar24 + 4);
                              }
                              lVar9 = *(long *)(unaff_x29 + -0x98);
                              if (puVar37 < (ulong *)((long)puVar21 - 1U)) goto code_r0x000b2ce8;
                            }
                            else {
                              lVar9 = *(long *)(unaff_x29 + -0x98);
                              if (puVar37 < (ulong *)((long)puVar21 - 1U)) {
code_r0x000b2ce8:
                                if ((short)*puVar24 == (short)*puVar37) {
                                  puVar37 = (ulong *)((long)puVar37 + 2);
                                  puVar24 = (ulong *)((long)puVar24 + 2);
                                }
                              }
                            }
                            if (puVar37 < puVar21) {
                              if ((char)*puVar24 == (char)*puVar37) {
                                puVar37 = (ulong *)((long)puVar37 + 1);
                              }
                            }
                            iVar3 = (int)puVar37 - iVar32;
                            uVar47 = *(ulong *)(unaff_x29 + -0xf8);
                          }
code_r0x000b2cc4:
                          uVar13 = iVar3 + 4U;
                          if ((int)(iVar3 + 4U) <= (int)(uint)unaff_x19) {
                            uVar13 = (uint)unaff_x19;
                            uVar27 = in_w15;
                          }
                          in_w15 = uVar27;
                          unaff_x19 = (ulong)uVar13;
                        }
                        else {
                          lVar9 = *(long *)(unaff_x29 + -0x98);
                        }
                        iVar17 = iVar17 + -1;
                        uVar27 = (uint)*(ushort *)
                                        (*(long *)(unaff_x29 + -0xb0) + (ulong)(uVar6 & 0xffff) * 2
                                        + 0x20000);
                        uVar6 = uVar6 - uVar27;
                        iVar48 = iVar48 - uVar27;
                        uVar27 = uVar28 - iVar48;
                      } while (uVar27 < 0x10000);
                    }
                    else {
code_r0x000b2edc:
                      uVar47 = *(ulong *)(unaff_x29 + -0xf8);
                    }
                    if ((int)unaff_x19 < 4) {
code_r0x000b2814:
                      puVar46 = *(ulong **)(unaff_x29 + -200);
                      lVar39 = *(long *)(unaff_x29 + -0x90);
                      lVar8 = param_34;
                      goto code_r0x000b2834;
                    }
                    goto code_r0x000b4270;
                  }
                  goto code_r0x000b2834;
                }
                if (param_33 <= unaff_w20) goto code_r0x000b2834;
                unaff_w22 = uVar6 + (int)((long)unaff_x25 - lVar39);
                in_w14 = (uint)*(undefined8 *)(unaff_x29 + -0xa8);
                if (*(uint *)(unaff_x29 + -0xf0) <= unaff_w22) {
                  in_w14 = unaff_w22 - 0xffff;
                }
                param_2 = (uint)*unaff_x25;
                uVar6 = *(uint *)(*(long *)(unaff_x29 + -0xb8) + 0x20);
                uVar31 = (ulong)uVar6;
                uVar28 = param_2;
                if (uVar6 < unaff_w22) {
                  do {
                    lVar44 = (ulong)((uint)(*(int *)(lVar8 + uVar31) * -0x61c8864f) >> 0x11) * 4;
                    uVar6 = (int)uVar31 - *(int *)(lVar9 + lVar44);
                    if (0xfffe < uVar6) {
                      uVar6 = 0xffff;
                    }
                    *(short *)(unaff_x26 + (uVar31 & 0xffff) * 2) = (short)uVar6;
                    *(int *)(lVar9 + lVar44) = (int)uVar31;
                    uVar31 = uVar31 + 1;
                  } while (in_x17 != uVar31);
                  uVar28 = (uint)*unaff_x25;
                }
                *(ulong *)(unaff_x29 + -0xf8) = uVar47;
                param_30 = (int)uVar47 - (int)unaff_x30;
                unaff_x19 = (ulong)param_30;
                *(uint *)(*(long *)(unaff_x29 + -0xb8) + 0x20) = unaff_w22;
                uVar6 = *(uint *)(lVar9 + (ulong)(uVar28 * -0x61c8864f >> 0x11) * 4);
                uVar47 = (ulong)uVar6;
                unaff_x27 = (ulong *)((long)unaff_x25 + 4);
                param_38 = (ulong *)((long)unaff_x25 + 0xc);
                param_41 = (uint)((param_2 & 0xffff) == param_2 >> 0x10 &&
                                 (param_2 & 0xff) == param_2 >> 0x18);
                if (in_w14 <= uVar6 && 0 < param_45) goto code_r0x000b3890;
                in_w15 = 0;
                in_w10 = param_45;
              } while( true );
            }
            uVar47 = (ulong)(uVar6 - uVar28);
            goto LAB_000b38d4;
          }
          lVar9 = *(long *)(unaff_x29 + -0x98);
        }
      }
    }
  }
  unaff_x19 = uVar47;
  in_w10 = param_7 + -1;
  if (*(short *)(unaff_x26 + (ulong)(uVar6 & 0xffff) * 2) != 1 || iVar32 != 0)
  goto code_r0x000b38c4;
  if (iVar48 != 0) {
    if (iVar48 != 2) goto code_r0x000b38c4;
    goto code_r0x000b3d30;
  }
  if (param_41 == 0) {
    iVar48 = 1;
    goto code_r0x000b38c4;
  }
  if (unaff_x28 <= unaff_x27) {
    puVar37 = *(ulong **)(unaff_x29 + -200);
    puVar14 = unaff_x27;
    puVar46 = unaff_x27;
    if (puVar37 <= unaff_x27) goto code_r0x000b3e88;
    goto code_r0x000b3e30;
  }
  lVar8 = 0;
  goto code_r0x000b3e00;
  while( true ) {
    lVar8 = lVar8 + 8;
    puVar46 = (ulong *)((long)param_6 + lVar8);
    if (unaff_x28 <= puVar46) break;
code_r0x000b3e00:
    uVar47 = *(ulong *)((long)param_6 + lVar8) ^ in_x12;
    if (uVar47 != 0) {
      uVar47 = (uVar47 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar47 & 0x5555555555555555) << 1;
      uVar47 = (uVar47 & 0xcccccccccccccccc) >> 2 | (uVar47 & 0x3333333333333333) << 2;
      uVar47 = (uVar47 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar47 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar47 = (uVar47 & 0xff00ff00ff00ff00) >> 8 | (uVar47 & 0xff00ff00ff00ff) << 8;
      uVar47 = (uVar47 & 0xffff0000ffff0000) >> 0x10 | (uVar47 & 0xffff0000ffff) << 0x10;
      puVar14 = (ulong *)((long)param_51 +
                         lVar8 + ((ulong)LZCOUNT(uVar47 >> 0x20 | uVar47 << 0x20) >> 3));
      goto code_r0x000b3e88;
    }
  }
  puVar37 = *(ulong **)(unaff_x29 + -200);
  puVar14 = (ulong *)((long)param_51 + lVar8);
  if (puVar46 < puVar37) {
code_r0x000b3e30:
    lVar9 = (long)puVar37 - (long)puVar14;
    puVar14 = (ulong *)((long)puVar46 + lVar9);
    uVar47 = in_x12;
    do {
      if ((uint)(byte)*puVar46 != ((uint)uVar47 & 0xff)) goto code_r0x000b3e5c;
      puVar46 = (ulong *)((long)puVar46 + 1);
      uVar47 = uVar47 >> 8;
      lVar9 = lVar9 + -1;
    } while (lVar9 != 0);
    puVar46 = puVar14;
code_r0x000b3e5c:
    lVar9 = *(long *)(unaff_x29 + -0x98);
    puVar14 = puVar46;
  }
code_r0x000b3e88:
  param_32 = (ulong)(uint)((int)puVar14 - iVar3) + 4;
  iVar48 = 2;
code_r0x000b3d30:
  unaff_w21 = uVar6 - 1;
  if (in_w14 <= unaff_w21) {
    if (2 < uVar28 - uVar6) {
      puVar7 = (uint *)((long)in_x13 + (ulong)(unaff_w21 - (int)*(undefined8 *)(unaff_x29 + -0xa8)))
      ;
      unaff_x23 = (uint *)(*(long *)(unaff_x29 + -0x90) + (ulong)(unaff_w21 - uVar28));
      if (unaff_w21 < uVar28) {
        unaff_x23 = puVar7;
      }
      if (*unaff_x23 == param_2) goto code_r0x000b3d70;
    }
    iVar48 = 2;
  }
code_r0x000b38c4:
  uVar47 = (ulong)(uVar6 - *(ushort *)(unaff_x26 + (ulong)(iVar32 + uVar6 & 0xffff) * 2));
  goto LAB_000b38d4;
code_r0x000b3d70:
  puVar46 = *(ulong **)(unaff_x29 + -200);
  if (unaff_w21 < uVar28) {
    puVar46 = param_52;
  }
  puVar14 = (ulong *)(unaff_x23 + 1);
  puVar37 = puVar14;
  if (puVar14 < (ulong *)((long)puVar46 - 7U)) {
    puVar21 = puVar14;
    do {
      uVar47 = *puVar37 ^ in_x12;
      if (uVar47 != 0) {
        uVar47 = (uVar47 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar47 & 0x5555555555555555) << 1;
        uVar47 = (uVar47 & 0xcccccccccccccccc) >> 2 | (uVar47 & 0x3333333333333333) << 2;
        uVar47 = (uVar47 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar47 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar47 = (uVar47 & 0xff00ff00ff00ff00) >> 8 | (uVar47 & 0xff00ff00ff00ff) << 8;
        uVar47 = (uVar47 & 0xffff0000ffff0000) >> 0x10 | (uVar47 & 0xffff0000ffff) << 0x10;
        puVar37 = (ulong *)((long)puVar21 + ((ulong)LZCOUNT(uVar47 >> 0x20 | uVar47 << 0x20) >> 3));
        goto code_r0x000b3eb0;
      }
      puVar37 = puVar37 + 1;
      puVar21 = puVar21 + 1;
    } while (puVar37 < (ulong *)((long)puVar46 - 7U));
  }
  if (puVar37 < puVar46) {
    lVar9 = (long)puVar46 - (long)puVar37;
    uVar47 = in_x12;
    do {
      if ((uint)(byte)*puVar37 != ((uint)uVar47 & 0xff)) goto code_r0x000b3eb0;
      puVar37 = (ulong *)((long)puVar37 + 1);
      uVar47 = uVar47 >> 8;
      lVar9 = lVar9 + -1;
    } while (lVar9 != 0);
    puVar37 = puVar46;
  }
code_r0x000b3eb0:
  uVar47 = (long)puVar37 - (long)puVar14;
  param_4 = (uVar47 & 0xffffffff) + 4;
  if (unaff_w21 < uVar28) {
    param_1 = in_x13;
    if ((ulong *)((long)puVar7 + param_4) == param_52) {
      uVar31 = in_x12;
      if ((uVar47 & 3) != 0) {
        uVar6 = (int)uVar47 * -8 & 0x1f;
        uVar6 = param_2 >> uVar6 | param_2 << 0x20 - uVar6;
        uVar31 = CONCAT44(uVar6,uVar6);
      }
      puVar14 = *(ulong **)(unaff_x29 + -0x90);
      puVar46 = puVar14;
      for (; puVar14 < unaff_x28; puVar14 = puVar14 + 1) {
        uVar47 = *puVar14 ^ uVar31;
        if (uVar47 != 0) {
          uVar47 = (uVar47 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar47 & 0x5555555555555555) << 1;
          uVar47 = (uVar47 & 0xcccccccccccccccc) >> 2 | (uVar47 & 0x3333333333333333) << 2;
          uVar47 = (uVar47 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar47 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar47 = (uVar47 & 0xff00ff00ff00ff00) >> 8 | (uVar47 & 0xff00ff00ff00ff) << 8;
          uVar47 = (uVar47 & 0xffff0000ffff0000) >> 0x10 | (uVar47 & 0xffff0000ffff) << 0x10;
          puVar46 = (ulong *)((long)puVar46 + ((ulong)LZCOUNT(uVar47 >> 0x20 | uVar47 << 0x20) >> 3)
                             );
          goto code_r0x000b3f90;
        }
        puVar46 = puVar46 + 1;
      }
      if (puVar14 < *(ulong **)(unaff_x29 + -200)) {
        lVar9 = *(long *)(unaff_x29 + -200) - (long)puVar46;
        puVar37 = (ulong *)((long)puVar14 + lVar9);
        do {
          puVar46 = puVar14;
          if ((uint)(byte)*puVar14 != ((uint)uVar31 & 0xff)) goto code_r0x000b3f64;
          puVar14 = (ulong *)((long)puVar14 + 1);
          uVar31 = uVar31 >> 8;
          lVar9 = lVar9 + -1;
        } while (lVar9 != 0);
        puVar46 = puVar37;
code_r0x000b3f64:
        unaff_x24 = *(ulong **)(unaff_x29 + -0xd8);
        unaff_x28 = *(ulong **)(unaff_x29 + -0x78);
        in_s21 = -0x13;
        in_register_000052a4 = -0x13;
        in_register_000052a8 = -0x13;
        in_register_000052ac = -0x13;
        in_s23 = 4;
        in_register_000052e4 = 4;
        in_register_000052e8 = 4;
        in_register_000052ec = 4;
        in_d20 = param_28;
        in_register_00005288 = param_29;
        in_d22 = param_26;
        in_register_000052c8 = param_27;
      }
code_r0x000b3f90:
      param_4 = (uint)((int)puVar46 - (int)*(undefined8 *)(unaff_x29 + -0x90)) + param_4;
    }
  }
  else {
    param_1 = *(uint **)(unaff_x29 + -0x90);
  }
  *(uint *)(unaff_x29 + -0x6c) = param_2;
  param_3 = param_1 + 1;
  param_8 = unaff_x23;
  param_9 = param_32;
LAB_000b3fac:
  param_5 = param_8;
  if (param_3 <= param_5) goto code_r0x000b3fb8;
  goto code_r0x000b3fc8;
code_r0x000b3fb8:
  param_8 = param_5 + -1;
  in_ZR = *param_8 == param_2;
  goto code_r0x000b3fc4;
code_r0x000b27c4:
  lVar39 = *(long *)(unaff_x29 + -0x90);
  lVar8 = lVar39 - in_x9;
  iVar32 = (uVar35 + iVar48) - (int)lVar39;
  *(int *)(unaff_x29 + -0xe0) = -5 - iVar48;
  param_51 = (ulong *)((long)unaff_x24 + 5);
  *(undefined8 *)(unaff_x29 + -0xc0) = 5;
  unaff_x30 = 1;
  unaff_x28 = *(ulong **)(unaff_x29 + -0x78);
  param_6 = param_51;
  param_47 = param_19;
  param_48 = unaff_x24;
  param_34 = lVar8;
  goto code_r0x000b2870;
code_r0x000b3890:
  iVar32 = 0;
  iVar48 = 0;
  param_32 = 0;
  in_w15 = 0;
  param_21 = ((long)unaff_x25 - lVar39) + in_x9;
  param_50 = (long)unaff_x25 - 1;
  in_x12 = CONCAT44(param_2,param_2);
  param_7 = param_45;
  goto code_r0x000b38e0;
code_r0x000b49e4:
  if (param_55._4_4_ != 2) goto code_r0x000b4acc;
  uVar31 = (long)unaff_x24 - (long)param_49;
  lVar9 = uVar31 + (uVar31 + 0xf0) / 0xff;
  param_44 = pcVar15;
  if ((char *)(param_23 + -8) < pcVar15 + lVar9 + 1) goto code_r0x000b087c;
  uVar33 = ((param_23 + -8) - (long)(pcVar15 + lVar9 + 1)) * 0xff + 0x12;
  iVar32 = (int)uVar33;
  if ((ulong)(long)(int)uVar47 <= uVar33) {
    iVar32 = (int)uVar47;
  }
  lVar8 = (long)iVar32;
  if ((long)(~(ulong)(pcVar15 + lVar9 + 3) + param_23 + lVar8) < 0xc) goto code_r0x000b087c;
  puVar46 = (ulong *)(pcVar15 + 1);
  uVar47 = uVar31 - 0xf;
  if (uVar31 < 0xf) {
    *pcVar15 = (char)((int)uVar31 << 4);
  }
  else {
    *pcVar15 = -0x10;
    puVar14 = puVar46;
    if (0xfe < uVar47) {
      uVar47 = (uVar31 - 0x10e) / 0xff;
      _memset(puVar46,0xff,uVar47 + 1);
      puVar14 = (ulong *)(pcVar15 + uVar47 + 2);
      uVar47 = (uVar31 - 0x10e) % 0xff;
    }
    puVar46 = (ulong *)((long)puVar14 + 1);
    *(char *)puVar14 = (char)uVar47;
  }
  puVar14 = (ulong *)((long)puVar46 + uVar31);
  puVar37 = (ulong *)((char *)((long)puVar46 + (long)unaff_x24) + -(long)param_49);
  if ((char *)((long)puVar46 + (long)unaff_x24) + -(long)param_49 <= puVar46 + 1) {
    puVar37 = puVar46 + 1;
  }
  if (((char *)((long)puVar37 + ~(ulong)puVar46) <= segment_command_00000020.segname + 0xf) ||
     ((ulong)((long)puVar46 - (long)param_49) < 0x40)) {
    puVar37 = puVar46;
    goto code_r0x000b4dfc;
  }
  uVar47 = ((long)puVar37 + ~(ulong)puVar46 >> 3) + 1;
  uVar30 = uVar47 & 0x3ffffffffffffff8;
  puVar37 = param_49 + 4;
  puVar21 = puVar46 + 4;
  uVar33 = uVar30;
  do {
    uVar40 = puVar37[-4];
    uVar53 = puVar37[-1];
    uVar38 = puVar37[-2];
    uVar54 = *puVar37;
    uVar55 = puVar37[1];
    uVar51 = puVar37[3];
    uVar50 = puVar37[2];
    puVar21[-3] = puVar37[-3];
    puVar21[-4] = uVar40;
    puVar21[-1] = uVar53;
    puVar21[-2] = uVar38;
    puVar21[1] = uVar55;
    *puVar21 = uVar54;
    puVar21[3] = uVar51;
    puVar21[2] = uVar50;
    uVar33 = uVar33 - 8;
    puVar37 = puVar37 + 8;
    puVar21 = puVar21 + 8;
  } while (uVar33 != 0);
  param_49 = param_49 + uVar30;
  puVar37 = puVar46 + uVar30;
  if (uVar47 != uVar30) {
code_r0x000b4dfc:
    do {
      puVar21 = puVar37 + 1;
      *puVar37 = *param_49;
      param_49 = param_49 + 1;
      puVar37 = puVar21;
    } while (puVar21 < puVar14);
  }
  param_44 = (char *)((long)puVar14 + 2);
  *(short *)puVar14 = (short)uVar28;
  if (lVar8 - 4U < 0xf) {
    *pcVar15 = *pcVar15 + (char)(lVar8 - 4U);
  }
  else {
    *pcVar15 = *pcVar15 + '\x0f';
    uVar47 = lVar8 - 0x13;
    if (0x1fd < uVar47) {
      lVar9 = ((lVar8 - 0x211U) / 0x1fe) * 2;
      _memset(param_44,0xff,lVar9 + 2);
      param_44 = (char *)((long)puVar46 + lVar9 + uVar31 + 4);
      uVar47 = (lVar8 - 0x211U) % 0x1fe;
    }
    pcVar15 = param_44;
    if (0xfe < uVar47) {
      pcVar15 = param_44 + 1;
      *param_44 = -1;
      uVar47 = uVar47 - 0xff;
    }
    param_44 = pcVar15 + 1;
    *pcVar15 = (char)uVar47;
  }
  param_49 = (ulong *)((long)unaff_x24 + lVar8);
code_r0x000b087c:
  pcVar15 = (char *)(param_24 - (long)param_49);
  lVar9 = 5;
  if (param_55._4_4_ != 2) {
    lVar9 = 0;
  }
  if ((param_55._4_4_ != 0) &&
     (param_39 = param_39 + lVar9,
     param_39 < param_44 + (long)(pcVar15 + (ulong)(pcVar15 + 0xf0) / 0xff + 1))) {
    if (param_55._4_4_ == 1) {
code_r0x000b4acc:
      iVar32 = 0;
      _free(*(undefined8 *)(unaff_x29 + -0xa0));
      goto code_r0x000b4c80;
    }
    pcVar15 = param_39 + (~(ulong)param_44 - ((ulong)(param_39 + ~(ulong)param_44 + 0xf1) >> 8));
  }
  iVar32 = (int)pcVar15;
  pcVar5 = pcVar15 + -0xf;
  if (pcVar15 < "") {
    *param_44 = (char)(iVar32 << 4);
  }
  else {
    pcVar4 = param_44 + 1;
    *param_44 = -0x10;
    if ("" < pcVar5) {
      uVar47 = (ulong)(pcVar15 + -0x10e) / 0xff;
      _memset(pcVar4,0xff,uVar47 + 1);
      pcVar5 = (char *)((ulong)(pcVar15 + -0x10e) % 0xff);
      pcVar4 = param_44 + uVar47 + 2;
    }
    *pcVar4 = (char)pcVar5;
    param_44 = pcVar4;
  }
  _memcpy(param_44 + 1,param_49,pcVar15);
  *param_40 = ((int)param_49 + iVar32) - param_54;
  iVar32 = ((int)(param_44 + 1) + iVar32) - (int)*(undefined8 *)(unaff_x29 + -0x100);
  _free(*(undefined8 *)(unaff_x29 + -0xa0));
  if (0 < iVar32) {
    return iVar32;
  }
code_r0x000b4c80:
  *(undefined1 *)(*(long *)(unaff_x29 + -0xb8) + 0x27) = 1;
  return iVar32;
}

