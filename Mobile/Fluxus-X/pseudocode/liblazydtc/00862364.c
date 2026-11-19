/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00862364
 */

/* WARNING: Removing unreachable block (ram,0x008627a8) */
/* WARNING: Removing unreachable block (ram,0x00862994) */

void FUN_00862364(long param_1,undefined8 *param_2,undefined8 *param_3)

{
  undefined4 uVar1;
  int iVar2;
  long lVar3;
  undefined8 *puVar4;
  undefined4 uVar5;
  undefined4 uVar6;
  undefined4 uVar7;
  long *plVar8;
  undefined8 uVar9;
  undefined8 *puVar10;
  long lVar11;
  undefined4 uVar12;
  undefined8 *puVar13;
  long **pplVar14;
  ulong uVar15;
  ulong uVar16;
  long lVar17;
  long lVar18;
  long lVar19;
  undefined8 *puVar20;
  ulong uVar21;
  undefined8 uVar22;
  long lVar23;
  undefined8 uVar24;
  undefined8 uVar25;
  long lVar26;
  undefined8 uVar27;
  undefined8 uVar28;
  ulong local_108;
  undefined8 local_f8;
  undefined8 uStack_f0;
  undefined8 local_e8;
  undefined4 local_e0;
  undefined4 uStack_dc;
  undefined4 local_d8;
  undefined4 uStack_d4;
  undefined1 auStack_d0 [8];
  undefined8 local_c8;
  undefined8 local_b0;
  long *local_a8;
  long local_a0;
  ulong local_98;
  undefined8 local_90;
  undefined8 uStack_88;
  undefined8 local_80;
  undefined8 uStack_78;
  long local_70;
  
  lVar3 = tpidr_el0;
  local_70 = *(long *)(lVar3 + 0x28);
  uVar1 = *(undefined4 *)(param_1 + 0x90);
  puVar13 = (undefined8 *)(param_1 + 0x94);
  uVar25 = *puVar13;
  FUN_00858f2c();
  uVar6 = uStack_dc;
  uVar12 = local_e0;
  lVar26 = *(long *)(param_1 + 0x458);
  lVar18 = *(long *)(param_1 + 0x450);
  local_80 = 0;
  uStack_78 = 0;
  local_e0 = (undefined4)uVar25;
  uVar5 = local_e0;
  uStack_dc = (undefined4)((ulong)uVar25 >> 0x20);
  uVar7 = uStack_dc;
  if (*(int *)(param_1 + 0x90) != 0x5d) {
    local_108 = 0;
    local_e0 = uVar12;
    uStack_dc = uVar6;
    if (*(int *)(param_1 + 0x90) == 0x119) goto LAB_008624d4;
LAB_008624b0:
                    /* try { // try from 008624b0 to 008624e7 has its CatchHandler @ 00862a58 */
    FUN_0086e040(param_1,"attribute name");
    uVar27 = *(undefined8 *)(param_1 + 0x94);
    uVar22 = *(undefined8 *)(param_1 + 0x138);
    uVar9 = uVar27;
    uVar24 = uVar27;
    do {
      iVar2 = *(int *)(param_1 + 0x90);
      local_90 = uVar27;
      uStack_88 = uVar9;
      if (iVar2 - 0x116U < 2) {
LAB_00862514:
        uVar24 = 0xffffffffffffffff;
LAB_00862518:
        local_a0 = *(long *)(param_1 + 0x470) - *(long *)(param_1 + 0x468) >> 3;
        local_98 = 0;
        local_b0 = 0xffffffffffffffff;
        pplVar14 = &local_a8;
        puVar10 = &local_b0;
        if (*(char *)(param_1 + 0x68) == '\0') {
          pplVar14 = (long **)0x0;
          puVar10 = (undefined8 *)0x0;
        }
                    /* try { // try from 00862550 to 0086255b has its CatchHandler @ 00862a54 */
        local_a8 = (long *)(param_1 + 0x468);
        FUN_00862b08(&local_e0,param_1,pplVar14,puVar10);
        if (CONCAT44(uStack_d4,local_d8) != 0) {
          puVar10 = (undefined8 *)CONCAT44(uStack_dc,local_e0);
          lVar11 = CONCAT44(uStack_d4,local_d8) << 3;
          do {
            uVar9 = *puVar10;
                    /* try { // try from 00862580 to 008625a7 has its CatchHandler @ 00862a68 */
            uVar16 = FUN_008513a8(uVar9);
            if (((uVar16 & 1) == 0) && (uVar16 = FUN_008513f0(uVar9), (uVar16 & 1) == 0)) {
              FUN_00860ecc(param_1,auStack_d0,
                           "Only literals can be passed as arguments for attributes");
            }
            lVar11 = lVar11 + -8;
            puVar10 = puVar10 + 1;
          } while (lVar11 != 0);
        }
                    /* try { // try from 008625b0 to 008625c3 has its CatchHandler @ 00862a50 */
        uVar16 = FUN_00861fcc(param_1,local_90,uStack_88,uVar22,param_2,&local_e0);
        local_f8 = local_90;
        uStack_f0 = local_c8;
                    /* try { // try from 008625d8 to 00862603 has its CatchHandler @ 00862a64 */
        uVar9 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x38);
        uVar12 = 4;
        if (uVar16 >> 0x20 != 0) {
          uVar12 = (undefined4)uVar16;
        }
        FUN_0084e9bc(uVar9,&local_f8,uVar12,CONCAT44(uStack_dc,local_e0),
                     CONCAT44(uStack_d4,local_d8),uVar22);
        uVar16 = local_98;
        lVar11 = local_a0;
        local_e8 = uVar9;
        if (*(char *)(param_1 + 0x68) == '\x01') {
          uVar9 = *(undefined8 *)(param_1 + 0xe8);
          if (local_98 == 0) {
            lVar23 = 0;
          }
          else {
            lVar17 = *local_a8;
                    /* try { // try from 0086262c to 00862633 has its CatchHandler @ 00862a5c */
            lVar23 = FUN_0084e938(uVar9,local_98 << 3);
            if ((uVar16 < 4) || (lVar19 = lVar11 * 8, (ulong)(lVar23 - (lVar19 + lVar17)) < 0x20)) {
              uVar15 = 0;
            }
            else {
              uVar15 = uVar16 & 0xfffffffffffffffc;
              puVar10 = (undefined8 *)(lVar23 + 0x10);
              puVar20 = (undefined8 *)(lVar17 + lVar19 + 0x10);
              uVar21 = uVar15;
              do {
                puVar4 = puVar20 + -1;
                uVar22 = puVar20[-2];
                uVar28 = puVar20[1];
                uVar27 = *puVar20;
                uVar21 = uVar21 - 4;
                puVar20 = puVar20 + 4;
                puVar10[-1] = *puVar4;
                puVar10[-2] = uVar22;
                puVar10[1] = uVar28;
                *puVar10 = uVar27;
                puVar10 = puVar10 + 4;
              } while (uVar21 != 0);
              if (uVar16 == uVar15) goto LAB_00862730;
            }
            lVar19 = uVar16 - uVar15;
            puVar10 = (undefined8 *)(lVar17 + uVar15 * 8 + lVar11 * 8);
            puVar20 = (undefined8 *)(lVar23 + uVar15 * 8);
            do {
              lVar19 = lVar19 + -1;
              *puVar20 = *puVar10;
              puVar10 = puVar10 + 1;
              puVar20 = puVar20 + 1;
            } while (lVar19 != 0);
          }
LAB_00862730:
                    /* try { // try from 00862730 to 00862753 has its CatchHandler @ 00862a5c */
          uVar9 = FUN_0084e938(uVar9,0x28);
          FUN_00851d84(uVar9,uVar24,local_b0,lVar23,uVar16);
          local_f8 = local_e8;
                    /* try { // try from 0086275c to 00862767 has its CatchHandler @ 00862a48 */
          puVar10 = (undefined8 *)FUN_00860fa0(param_1 + 0x4b0,&local_f8);
          *puVar10 = uVar9;
        }
                    /* try { // try from 00862770 to 00862777 has its CatchHandler @ 00862a4c */
        FUN_00870bec(*param_2,&local_e8);
        param_2[2] = param_2[2] + 1;
        lVar11 = *local_a8 + local_a0 * 8;
        if (lVar11 != local_a8[1]) {
          local_a8[1] = lVar11;
        }
      }
      else {
        if (iVar2 == 0x28) goto LAB_00862518;
        if (iVar2 == 0x7b) goto LAB_00862514;
                    /* try { // try from 00862680 to 0086269b has its CatchHandler @ 00862a40 */
        uVar16 = FUN_00861fcc(param_1,uVar27,uVar9,uVar22,param_2,&local_80);
                    /* try { // try from 008626a4 to 008626cf has its CatchHandler @ 00862a44 */
        uVar9 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x38);
        uVar12 = 4;
        if (uVar16 >> 0x20 != 0) {
          uVar12 = (undefined4)uVar16;
        }
        FUN_0084e9bc(uVar9,&local_90,uVar12,local_80,uStack_78,uVar22);
        local_e0 = (undefined4)uVar9;
        uStack_dc = (undefined4)((ulong)uVar9 >> 0x20);
        if (*(char *)(param_1 + 0x68) == '\x01') {
                    /* try { // try from 008626e4 to 008626f7 has its CatchHandler @ 00862a3c */
          uVar9 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),8);
          FUN_00851d70(uVar9,0);
          local_a8 = (long *)CONCAT44(uStack_dc,local_e0);
                    /* try { // try from 00862700 to 0086270b has its CatchHandler @ 00862a30 */
          puVar10 = (undefined8 *)FUN_00860fa0(param_1 + 0x4b0,&local_a8);
          *puVar10 = uVar9;
        }
                    /* try { // try from 00862714 to 0086271b has its CatchHandler @ 00862a38 */
        FUN_00870bec(*param_2,&local_e0);
        param_2[2] = param_2[2] + 1;
      }
      iVar2 = *(int *)(param_1 + 0x90);
      if (iVar2 != 0x2c) goto LAB_0086284c;
      if (*(char *)(param_1 + 0x68) == '\x01') {
                    /* try { // try from 008627d4 to 008627f3 has its CatchHandler @ 00862a60 */
        FUN_00870ce4((long *)(param_1 + 0x450),puVar13);
        local_108 = local_108 + 1;
      }
      FUN_00858f2c(param_1);
      if (*(int *)(param_1 + 0x90) != 0x119) goto LAB_008624b0;
LAB_008624d4:
      uVar22 = *(undefined8 *)(param_1 + 0xa8);
      uVar27 = *(undefined8 *)(param_1 + 0x94);
      uVar9 = *(undefined8 *)(param_1 + 0x9c);
      FUN_00858f2c(param_1);
      uVar24 = *puVar13;
    } while( true );
  }
  local_d8 = (undefined4)*(undefined8 *)(param_1 + 0x9c);
  uStack_d4 = (undefined4)((ulong)*(undefined8 *)(param_1 + 0x9c) >> 0x20);
                    /* try { // try from 008623e4 to 008623f7 has its CatchHandler @ 00862a24 */
  FUN_00860ecc(param_1,&local_e0,"Attribute list cannot be empty");
  local_d8 = (undefined4)*(undefined8 *)(param_1 + 0x9c);
  uStack_d4 = (undefined4)((ulong)*(undefined8 *)(param_1 + 0x9c) >> 0x20);
  local_e0 = uVar5;
  uStack_dc = uVar7;
                    /* try { // try from 00862404 to 00862423 has its CatchHandler @ 00862a28 */
  plVar8 = (long *)FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x38);
  FUN_0084e9bc(plVar8,&local_e0,4,local_80,uStack_78,*(undefined8 *)(param_1 + 0x138));
  local_a8 = plVar8;
  if (*(char *)(param_1 + 0x68) == '\x01') {
                    /* try { // try from 00862438 to 0086244b has its CatchHandler @ 00862a20 */
    uVar9 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),8);
    FUN_00851d70(uVar9,0);
    local_e0 = SUB84(local_a8,0);
    uStack_dc = (undefined4)((ulong)local_a8 >> 0x20);
                    /* try { // try from 00862454 to 0086245f has its CatchHandler @ 00862a18 */
    puVar13 = (undefined8 *)FUN_00860fa0(param_1 + 0x4b0,&local_e0);
    *puVar13 = uVar9;
  }
                    /* try { // try from 00862468 to 0086246f has its CatchHandler @ 00862a1c */
  FUN_00870bec(*param_2,&local_a8);
  local_108 = 0;
  param_2[2] = param_2[2] + 1;
  iVar2 = *(int *)(param_1 + 0x90);
LAB_0086284c:
  local_e0 = uVar1;
  uStack_dc = uVar5;
  local_d8 = uVar7;
  if (iVar2 == 0x5d) {
                    /* try { // try from 0086285c to 0086289b has its CatchHandler @ 00862a2c */
    FUN_00858f2c(param_1);
    if (*(char *)(param_1 + 0x68) != '\x01') goto LAB_0086296c;
    uVar9 = *(undefined8 *)(param_1 + 0xe8);
LAB_008628ac:
    uVar24 = *(undefined8 *)(param_1 + 0xb0);
    if (local_108 == 0) goto LAB_00862928;
LAB_008628b4:
    lVar23 = *(long *)(param_1 + 0x450);
                    /* try { // try from 008628c0 to 0086295f has its CatchHandler @ 00862a34 */
    lVar11 = FUN_0084e938(uVar9,local_108 << 3);
    if ((local_108 < 8) || ((ulong)((lVar18 + lVar11) - (lVar23 + lVar26)) < 0x20)) {
      uVar16 = 0;
LAB_008628f0:
      lVar17 = local_108 - uVar16;
      puVar13 = (undefined8 *)(lVar23 + ((lVar26 + uVar16 * 8) - lVar18));
      puVar10 = (undefined8 *)(lVar11 + uVar16 * 8);
      do {
        lVar17 = lVar17 + -1;
        *puVar10 = *puVar13;
        puVar13 = puVar13 + 1;
        puVar10 = puVar10 + 1;
      } while (lVar17 != 0);
    }
    else {
      uVar16 = local_108 & 0xfffffffffffffffc;
      puVar13 = (undefined8 *)(lVar11 + 0x10);
      puVar10 = (undefined8 *)((lVar26 - lVar18) + lVar23 + 0x10);
      uVar15 = uVar16;
      do {
        puVar20 = puVar10 + -1;
        uVar22 = puVar10[-2];
        uVar28 = puVar10[1];
        uVar27 = *puVar10;
        uVar15 = uVar15 - 4;
        puVar10 = puVar10 + 4;
        puVar13[-1] = *puVar20;
        puVar13[-2] = uVar22;
        puVar13[1] = uVar28;
        *puVar13 = uVar27;
        puVar13 = puVar13 + 4;
      } while (uVar15 != 0);
      if (local_108 != uVar16) goto LAB_008628f0;
    }
  }
  else {
    FUN_0086b5f8(param_1,0x5d,&local_e0,0);
    uVar16 = FUN_0086e434(param_1,0x5d);
    if ((*(byte *)(param_1 + 0x68) & 1) == 0) goto LAB_0086296c;
    uVar9 = *(undefined8 *)(param_1 + 0xe8);
    if ((uVar16 & 1) != 0) goto LAB_008628ac;
    uVar24 = 0xffffffffffffffff;
    if (local_108 != 0) goto LAB_008628b4;
LAB_00862928:
    lVar11 = 0;
  }
  uVar9 = FUN_0084e938(uVar9,0x20);
  FUN_00851da0(uVar9,uVar25,uVar24,lVar11,local_108);
  local_e0 = (undefined4)uVar9;
  uStack_dc = (undefined4)((ulong)uVar9 >> 0x20);
  FUN_00870ddc(*param_3,&local_e0);
  param_3[2] = param_3[2] + 1;
LAB_0086296c:
  lVar18 = (lVar26 - lVar18) + *(long *)(param_1 + 0x450);
  if (lVar18 != *(long *)(param_1 + 0x458)) {
    *(long *)(param_1 + 0x458) = lVar18;
  }
  if (*(long *)(lVar3 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

