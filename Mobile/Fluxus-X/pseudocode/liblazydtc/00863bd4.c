/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00863bd4
 */

/* WARNING: Removing unreachable block (ram,0x00864350) */
/* WARNING: Removing unreachable block (ram,0x00864318) */
/* WARNING: Removing unreachable block (ram,0x00864388) */

void FUN_00863bd4(long *param_1,long param_2,uint param_3,undefined8 *param_4,long *param_5,
                 undefined8 *param_6)

{
  undefined4 uVar1;
  bool bVar2;
  long lVar3;
  undefined8 *puVar4;
  bool bVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 *puVar9;
  ulong uVar10;
  long lVar11;
  int iVar12;
  undefined8 uVar13;
  long lVar14;
  long lVar15;
  long lVar16;
  long lVar17;
  long lVar18;
  long lVar19;
  ulong uVar20;
  long lVar21;
  long lVar22;
  ulong uVar23;
  long lVar24;
  ulong uVar25;
  undefined8 *puVar26;
  undefined8 uVar27;
  undefined8 uVar28;
  undefined1 auVar29 [16];
  ulong local_b0;
  undefined8 local_a8;
  undefined8 local_a0;
  undefined8 uStack_98;
  int local_90;
  undefined4 uStack_8c;
  undefined4 uStack_88;
  undefined4 uStack_84;
  long local_70;
  
  lVar3 = tpidr_el0;
  local_70 = *(long *)(lVar3 + 0x28);
  lVar18 = *(long *)(param_2 + 0x410);
  lVar19 = *(long *)(param_2 + 0x408);
  lVar15 = *(long *)(param_2 + 0x428);
  lVar17 = *(long *)(param_2 + 0x420);
  lVar21 = *(long *)(param_2 + 0x458);
  lVar22 = *(long *)(param_2 + 0x450);
  if (*(int *)(param_2 + 0x90) == 0x3c) {
    puVar26 = (undefined8 *)(param_2 + 0x94);
    uVar13 = *puVar26;
    if (param_4 != (undefined8 *)0x0) {
      *param_4 = uVar13;
    }
                    /* try { // try from 00863c54 to 00863c73 has its CatchHandler @ 0086448c */
    FUN_00858f2c(param_2);
    iVar12 = *(int *)(param_2 + 0x90);
    uVar23 = 0;
    uVar25 = 0;
    bVar5 = false;
    bVar2 = false;
    local_b0 = 0;
    do {
      uStack_98 = *(undefined8 *)(param_2 + 0x9c);
      local_a0 = *puVar26;
      if (iVar12 == 0x119) {
        uVar27 = *(undefined8 *)(param_2 + 0xa8);
                    /* try { // try from 00863ca0 to 00863cb7 has its CatchHandler @ 008644f0 */
        FUN_00858f2c(param_2);
      }
      else {
        FUN_0086e040(param_2,0);
        uVar27 = *(undefined8 *)(param_2 + 0x138);
      }
      iVar12 = *(int *)(param_2 + 0x90);
      bVar2 = (bool)(bVar2 | iVar12 == 0x106);
      if (bVar2) {
        if (iVar12 == 0x106) {
          uVar28 = *(undefined8 *)(param_2 + 0x94);
                    /* try { // try from 00863cdc to 00863ce3 has its CatchHandler @ 008644e8 */
          FUN_00858f2c(param_2);
        }
        else {
                    /* try { // try from 00863e68 to 00863e7b has its CatchHandler @ 008644e8 */
          FUN_00860ecc(param_2,puVar26,"Generic types come before generic type packs");
          uVar28 = 0xffffffffffffffff;
        }
        if (((param_3 & 1) == 0) || (*(int *)(param_2 + 0x90) != 0x3d)) {
          if (bVar5) {
                    /* try { // try from 00863f30 to 00863f43 has its CatchHandler @ 008644e8 */
            FUN_00860ecc(param_2,puVar26,"Expected default type pack after type pack name");
          }
                    /* try { // try from 00863f48 to 00863f63 has its CatchHandler @ 008644e0 */
          uVar8 = FUN_0084e938(*(undefined8 *)(param_2 + 0xe8),0x30);
          FUN_0084ea9c(uVar8,&local_a0,uVar27,0);
          local_90 = (int)uVar8;
          uStack_8c = (undefined4)((ulong)uVar8 >> 0x20);
          if (*(char *)(param_2 + 0x68) == '\x01') {
                    /* try { // try from 00863f78 to 00863f8f has its CatchHandler @ 008644cc */
            uVar27 = FUN_0084e938(*(undefined8 *)(param_2 + 0xe8),0x14);
            FUN_00852058(uVar27,uVar28,0xffffffffffffffff);
            local_a8 = CONCAT44(uStack_8c,local_90);
                    /* try { // try from 00863f98 to 00863fa3 has its CatchHandler @ 008644a8 */
            puVar9 = (undefined8 *)FUN_00860fa0(param_2 + 0x4b0,&local_a8);
            *puVar9 = uVar27;
          }
                    /* try { // try from 00863fa8 to 00863fb3 has its CatchHandler @ 008644c8 */
          FUN_00872660(param_2 + 0x420,&local_90);
          uVar25 = uVar25 + 1;
        }
        else {
          uVar8 = *(undefined8 *)(param_2 + 0x94);
                    /* try { // try from 00863e98 to 00863e9f has its CatchHandler @ 008644d0 */
          FUN_00858f2c(param_2);
                    /* try { // try from 00863fc4 to 00863fcf has its CatchHandler @ 008644d0 */
          if ((*(int *)(param_2 + 0x90) == 0x106) ||
             ((*(int *)(param_2 + 0x90) == 0x119 &&
              (FUN_00853d20(&local_90,param_2 + 0x70), local_90 == 0x106)))) {
                    /* try { // try from 00863eac to 00863eb3 has its CatchHandler @ 008644b8 */
            uVar6 = FUN_00866418(param_2);
                    /* try { // try from 00863ebc to 00863f03 has its CatchHandler @ 008644e4 */
            uVar7 = FUN_0084e938(*(undefined8 *)(param_2 + 0xe8),0x30);
            FUN_0084ea9c(uVar7,&local_a0,uVar27,uVar6);
            local_90 = (int)uVar7;
            uStack_8c = (undefined4)((ulong)uVar7 >> 0x20);
            if (*(char *)(param_2 + 0x68) == '\x01') {
              uVar27 = FUN_0084e938(*(undefined8 *)(param_2 + 0xe8),0x14);
              FUN_00852058(uVar27,uVar28,uVar8);
              local_a8 = CONCAT44(uStack_8c,local_90);
                    /* try { // try from 00863f0c to 00863f17 has its CatchHandler @ 008644a0 */
              puVar9 = (undefined8 *)FUN_00860fa0(param_2 + 0x4b0,&local_a8);
              *puVar9 = uVar27;
            }
                    /* try { // try from 00863f1c to 00863f27 has its CatchHandler @ 008644e4 */
            FUN_00872660(param_2 + 0x420,&local_90);
          }
          else {
            uVar1 = *(undefined4 *)(param_2 + 0x124);
            uStack_88 = (undefined4)*(undefined8 *)(param_2 + 0x9c);
            uStack_84 = (undefined4)((ulong)*(undefined8 *)(param_2 + 0x9c) >> 0x20);
            local_90 = (int)*puVar26;
            uStack_8c = (undefined4)((ulong)*puVar26 >> 0x20);
                    /* try { // try from 00863fe8 to 0086402b has its CatchHandler @ 008644b4 */
            auVar29 = FUN_008695d4(param_2,1,0);
            lVar11 = auVar29._8_8_;
            if (lVar11 == 0) {
              *(undefined4 *)(param_2 + 0x124) = uVar1;
              lVar11 = FUN_00867310(param_2,auVar29._0_8_,&local_90);
              if (lVar11 != 0) {
                FUN_00860ecc(param_2,lVar11 + 0xc,"Expected type pack after \'=\', got type");
              }
              lVar11 = 0;
            }
                    /* try { // try from 00864034 to 0086407b has its CatchHandler @ 008644d8 */
            uVar6 = FUN_0084e938(*(undefined8 *)(param_2 + 0xe8),0x30);
            FUN_0084ea9c(uVar6,&local_a0,uVar27,lVar11);
            local_90 = (int)uVar6;
            uStack_8c = (undefined4)((ulong)uVar6 >> 0x20);
            if (*(char *)(param_2 + 0x68) == '\x01') {
              uVar27 = FUN_0084e938(*(undefined8 *)(param_2 + 0xe8),0x14);
              FUN_00852058(uVar27,uVar28,uVar8);
              local_a8 = CONCAT44(uStack_8c,local_90);
                    /* try { // try from 00864084 to 0086408f has its CatchHandler @ 00864488 */
              puVar9 = (undefined8 *)FUN_00860fa0(param_2 + 0x4b0,&local_a8);
              *puVar9 = uVar27;
            }
                    /* try { // try from 00864094 to 0086409f has its CatchHandler @ 008644d8 */
            FUN_00872660(param_2 + 0x420,&local_90);
          }
          uVar25 = uVar25 + 1;
          bVar5 = true;
        }
      }
      else {
        if (((param_3 & 1) == 0) || (iVar12 != 0x3d)) {
          if (bVar5) {
                    /* try { // try from 00863dd8 to 00863deb has its CatchHandler @ 008644f4 */
            FUN_00860ecc(param_2,puVar26,"Expected default type after type name");
          }
                    /* try { // try from 00863df0 to 00863e0b has its CatchHandler @ 008644dc */
          uVar28 = FUN_0084e938(*(undefined8 *)(param_2 + 0xe8),0x30);
          FUN_0084ea10(uVar28,&local_a0,uVar27,0);
          local_90 = (int)uVar28;
          uStack_8c = (undefined4)((ulong)uVar28 >> 0x20);
          if (*(char *)(param_2 + 0x68) == '\x01') {
                    /* try { // try from 00863e20 to 00863e33 has its CatchHandler @ 008644c4 */
            uVar27 = FUN_0084e938(*(undefined8 *)(param_2 + 0xe8),0xc);
            FUN_00852044(uVar27,0xffffffffffffffff);
            local_a8 = CONCAT44(uStack_8c,local_90);
                    /* try { // try from 00863e3c to 00863e47 has its CatchHandler @ 008644b0 */
            puVar9 = (undefined8 *)FUN_00860fa0(param_2 + 0x4b0,&local_a8);
            *puVar9 = uVar27;
          }
                    /* try { // try from 00863e4c to 00863e57 has its CatchHandler @ 008644c0 */
          FUN_00872758(param_2 + 0x408,&local_90);
        }
        else {
          uVar8 = *(undefined8 *)(param_2 + 0x94);
                    /* try { // try from 00863d04 to 00863d0b has its CatchHandler @ 008644bc */
          FUN_00858f2c(param_2);
          uVar28 = 0;
          uVar1 = *(undefined4 *)(param_2 + 0x124);
          uStack_88 = (undefined4)*(undefined8 *)(param_2 + 0x9c);
          uStack_84 = (undefined4)((ulong)*(undefined8 *)(param_2 + 0x9c) >> 0x20);
          local_90 = (int)*puVar26;
          uStack_8c = (undefined4)((ulong)*puVar26 >> 0x20);
          if ((*(int *)(param_2 + 0x90) != 0x26) && (*(int *)(param_2 + 0x90) != 0x7c)) {
                    /* try { // try from 00863d30 to 00863d53 has its CatchHandler @ 008644d4 */
            uVar28 = FUN_008695d4(param_2,0,0);
            *(undefined4 *)(param_2 + 0x124) = uVar1;
          }
          uVar28 = FUN_00867310(param_2,uVar28,&local_90);
          *(undefined4 *)(param_2 + 0x124) = uVar1;
                    /* try { // try from 00863d60 to 00863da3 has its CatchHandler @ 008644ec */
          uVar6 = FUN_0084e938(*(undefined8 *)(param_2 + 0xe8),0x30);
          FUN_0084ea10(uVar6,&local_a0,uVar27,uVar28);
          local_90 = (int)uVar6;
          uStack_8c = (undefined4)((ulong)uVar6 >> 0x20);
          if (*(char *)(param_2 + 0x68) == '\x01') {
            uVar27 = FUN_0084e938(*(undefined8 *)(param_2 + 0xe8),0xc);
            FUN_00852044(uVar27,uVar8);
            local_a8 = CONCAT44(uStack_8c,local_90);
                    /* try { // try from 00863dac to 00863db7 has its CatchHandler @ 008644ac */
            puVar9 = (undefined8 *)FUN_00860fa0(param_2 + 0x4b0,&local_a8);
            *puVar9 = uVar27;
          }
                    /* try { // try from 00863dbc to 00863dc7 has its CatchHandler @ 008644ec */
          FUN_00872758(param_2 + 0x408,&local_90);
          bVar5 = true;
        }
        local_b0 = local_b0 + 1;
      }
      iVar12 = *(int *)(param_2 + 0x90);
      if (iVar12 != 0x2c) goto LAB_008640f8;
      if (param_5 != (long *)0x0) {
                    /* try { // try from 008640bc to 008640d3 has its CatchHandler @ 008644f4 */
        FUN_00870ce4(param_2 + 0x450,puVar26);
        uVar23 = uVar23 + 1;
      }
      FUN_00858f2c(param_2);
      iVar12 = *(int *)(param_2 + 0x90);
    } while (iVar12 != 0x3e);
                    /* try { // try from 008640e0 to 008640f3 has its CatchHandler @ 00864484 */
    FUN_00860ecc(param_2,puVar26,"Expected type after \',\' but got \'>\' instead");
    iVar12 = *(int *)(param_2 + 0x90);
LAB_008640f8:
    local_90 = 0x3c;
    uStack_8c = (undefined4)uVar13;
    uStack_88 = (undefined4)((ulong)uVar13 >> 0x20);
    if (iVar12 == 0x3e) {
                    /* try { // try from 00864118 to 0086416b has its CatchHandler @ 008644a4 */
      FUN_00858f2c(param_2);
      uVar10 = 1;
    }
    else {
      FUN_0086b5f8(param_2,0x3e,&local_90,0);
      uVar10 = FUN_0086e434(param_2,0x3e);
    }
    if ((param_6 != (undefined8 *)0x0) && ((uVar10 & 1) != 0)) {
      *param_6 = *(undefined8 *)(param_2 + 0xb0);
    }
    if (param_5 != (long *)0x0) {
      if (uVar23 == 0) {
        lVar11 = 0;
      }
      else {
        lVar24 = *(long *)(param_2 + 0x450);
                    /* try { // try from 0086419c to 0086419f has its CatchHandler @ 00864480 */
        lVar11 = FUN_0084e938(*(undefined8 *)(param_2 + 0xe8),uVar23 << 3);
        if ((uVar23 < 8) || ((ulong)((lVar22 + lVar11) - (lVar24 + lVar21)) < 0x20)) {
          uVar10 = 0;
        }
        else {
          uVar10 = uVar23 & 0xfffffffffffffffc;
          puVar26 = (undefined8 *)(lVar11 + 0x10);
          puVar9 = (undefined8 *)((lVar21 - lVar22) + lVar24 + 0x10);
          uVar20 = uVar10;
          do {
            puVar4 = puVar9 + -1;
            uVar13 = puVar9[-2];
            uVar28 = puVar9[1];
            uVar27 = *puVar9;
            uVar20 = uVar20 - 4;
            puVar9 = puVar9 + 4;
            puVar26[-1] = *puVar4;
            puVar26[-2] = uVar13;
            puVar26[1] = uVar28;
            *puVar26 = uVar27;
            puVar26 = puVar26 + 4;
          } while (uVar20 != 0);
          if (uVar23 == uVar10) goto LAB_00864204;
        }
        lVar16 = uVar23 - uVar10;
        puVar26 = (undefined8 *)(lVar24 + ((lVar21 + uVar10 * 8) - lVar22));
        puVar9 = (undefined8 *)(lVar11 + uVar10 * 8);
        do {
          lVar16 = lVar16 + -1;
          *puVar9 = *puVar26;
          puVar26 = puVar26 + 1;
          puVar9 = puVar9 + 1;
        } while (lVar16 != 0);
      }
      goto LAB_00864204;
    }
  }
  else {
    uVar23 = 0;
    uVar25 = 0;
    lVar11 = 0;
    lVar24 = 0;
    lVar16 = 0;
    local_b0 = 0;
    if (param_5 == (long *)0x0) goto LAB_008642e4;
LAB_00864204:
    *param_5 = lVar11;
    param_5[1] = uVar23;
  }
  if (local_b0 == 0) {
    lVar24 = 0;
  }
  else {
    lVar11 = *(long *)(param_2 + 0x408);
                    /* try { // try from 0086421c to 0086421f has its CatchHandler @ 00864494 */
    lVar24 = FUN_0084e938(*(undefined8 *)(param_2 + 0xe8),local_b0 << 3);
    if ((local_b0 < 8) || ((ulong)((lVar19 + lVar24) - (lVar11 + lVar18)) < 0x20)) {
      uVar23 = 0;
    }
    else {
      puVar26 = (undefined8 *)(lVar24 + 0x10);
      puVar9 = (undefined8 *)((lVar18 - lVar19) + lVar11 + 0x10);
      uVar23 = local_b0 & 0xfffffffffffffffc;
      uVar10 = uVar23;
      do {
        puVar4 = puVar9 + -1;
        uVar13 = puVar9[-2];
        uVar28 = puVar9[1];
        uVar27 = *puVar9;
        uVar10 = uVar10 - 4;
        puVar9 = puVar9 + 4;
        puVar26[-1] = *puVar4;
        puVar26[-2] = uVar13;
        puVar26[1] = uVar28;
        *puVar26 = uVar27;
        puVar26 = puVar26 + 4;
      } while (uVar10 != 0);
      if (local_b0 == uVar23) goto LAB_0086427c;
    }
    lVar16 = local_b0 - uVar23;
    puVar26 = (undefined8 *)(lVar11 + ((lVar18 + uVar23 * 8) - lVar19));
    puVar9 = (undefined8 *)(lVar24 + uVar23 * 8);
    do {
      lVar16 = lVar16 + -1;
      *puVar9 = *puVar26;
      puVar26 = puVar26 + 1;
      puVar9 = puVar9 + 1;
    } while (lVar16 != 0);
  }
LAB_0086427c:
  if (uVar25 == 0) {
    lVar16 = 0;
  }
  else {
    lVar11 = *(long *)(param_2 + 0x420);
                    /* try { // try from 0086428c to 0086428f has its CatchHandler @ 00864490 */
    lVar16 = FUN_0084e938(*(undefined8 *)(param_2 + 0xe8),uVar25 << 3);
    if ((uVar25 < 8) || ((ulong)((lVar17 + lVar16) - (lVar11 + lVar15)) < 0x20)) {
      uVar23 = 0;
    }
    else {
      uVar23 = uVar25 & 0xfffffffffffffffc;
      puVar26 = (undefined8 *)(lVar16 + 0x10);
      puVar9 = (undefined8 *)((lVar15 - lVar17) + lVar11 + 0x10);
      uVar10 = uVar23;
      do {
        puVar4 = puVar9 + -1;
        uVar13 = puVar9[-2];
        uVar28 = puVar9[1];
        uVar27 = *puVar9;
        uVar10 = uVar10 - 4;
        puVar9 = puVar9 + 4;
        puVar26[-1] = *puVar4;
        puVar26[-2] = uVar13;
        puVar26[1] = uVar28;
        *puVar26 = uVar27;
        puVar26 = puVar26 + 4;
      } while (uVar10 != 0);
      if (uVar25 == uVar23) goto LAB_008642e4;
    }
    lVar14 = uVar25 - uVar23;
    puVar26 = (undefined8 *)(lVar11 + ((lVar15 + uVar23 * 8) - lVar17));
    puVar9 = (undefined8 *)(lVar16 + uVar23 * 8);
    do {
      lVar14 = lVar14 + -1;
      *puVar9 = *puVar26;
      puVar26 = puVar26 + 1;
      puVar9 = puVar9 + 1;
    } while (lVar14 != 0);
  }
LAB_008642e4:
  lVar11 = *(long *)(param_2 + 0x458);
  lVar21 = (lVar21 - lVar22) + *(long *)(param_2 + 0x450);
  param_1[2] = lVar16;
  param_1[3] = uVar25;
  *param_1 = lVar24;
  param_1[1] = local_b0;
  if (lVar21 != lVar11) {
    *(long *)(param_2 + 0x458) = lVar21;
  }
  lVar15 = (lVar15 - lVar17) + *(long *)(param_2 + 0x420);
  if (lVar15 != *(long *)(param_2 + 0x428)) {
    *(long *)(param_2 + 0x428) = lVar15;
  }
  lVar15 = (lVar18 - lVar19) + *(long *)(param_2 + 0x408);
  if (lVar15 != *(long *)(param_2 + 0x410)) {
    *(long *)(param_2 + 0x410) = lVar15;
  }
  if (*(long *)(lVar3 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

