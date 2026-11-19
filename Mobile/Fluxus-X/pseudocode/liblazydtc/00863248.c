/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00863248
 */

/* WARNING: Removing unreachable block (ram,0x00863888) */

undefined1  [16]
FUN_00863248(long param_1,uint param_2,undefined4 *param_3,undefined8 param_4,undefined8 *param_5,
            undefined8 *param_6,byte param_7,undefined8 *param_8)

{
  ulong *puVar1;
  long lVar2;
  long lVar3;
  uint uVar4;
  long lVar5;
  undefined8 *puVar6;
  byte bVar7;
  long lVar8;
  long lVar9;
  undefined8 uVar10;
  undefined8 *puVar11;
  undefined8 *puVar12;
  void *pvVar13;
  long lVar14;
  long *plVar15;
  ulong uVar16;
  long lVar17;
  long lVar18;
  undefined8 uVar19;
  ulong *puVar20;
  ulong uVar21;
  ulong uVar22;
  int iVar23;
  long lVar24;
  size_t __n;
  undefined8 uVar25;
  void *__src;
  undefined1 auVar26 [16];
  undefined1 auVar27 [16];
  undefined8 local_170;
  uint local_144;
  undefined4 local_140;
  undefined4 uStack_13c;
  undefined4 uStack_138;
  undefined4 uStack_134;
  undefined8 local_130;
  undefined8 uStack_128;
  long *local_118;
  long local_110;
  undefined8 uStack_108;
  int local_fc;
  ulong local_f8;
  undefined1 auStack_f0 [16];
  undefined1 auStack_e0 [16];
  undefined8 local_d0;
  undefined8 uStack_c8;
  undefined4 local_c0;
  undefined4 uStack_bc;
  undefined4 uStack_b8;
  undefined4 uStack_b4;
  undefined4 local_b0;
  undefined4 uStack_ac;
  undefined8 local_a8;
  undefined8 uStack_a0;
  byte local_98;
  ulong local_90;
  undefined8 uStack_88;
  undefined1 local_80;
  long local_78;
  
  lVar5 = tpidr_el0;
  local_78 = *(long *)(lVar5 + 0x28);
  uStack_c8 = *(undefined8 *)(param_3 + 3);
  local_d0 = *(undefined8 *)(param_3 + 1);
  if (param_6[1] != 0) {
    uStack_c8 = *(undefined8 *)(*(long *)*param_6 + 0x14);
    local_d0 = *(undefined8 *)(*(long *)*param_6 + 0xc);
  }
  bVar7 = *(byte *)(param_1 + 0x68);
  if ((bVar7 & 1) == 0) {
    FUN_00863bd4(auStack_f0,param_1,0,0,0,0);
    lVar8 = 0;
  }
  else {
    lVar8 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x70);
    FUN_00851e28();
    if (param_8 != (undefined8 *)0x0) {
      uVar21 = param_8[2];
      if (uVar21 == 0) {
        lVar9 = 0;
      }
      else {
        lVar2 = param_8[1];
        lVar24 = *(long *)*param_8;
        lVar9 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),uVar21 << 3);
        if ((uVar21 < 8) || (lVar17 = lVar2 * 8 + lVar24, (ulong)(lVar9 - lVar17) < 0x20)) {
          uVar16 = 0;
        }
        else {
          uVar16 = uVar21 & 0xfffffffffffffffc;
          puVar11 = (undefined8 *)(lVar9 + 0x10);
          puVar12 = (undefined8 *)(lVar17 + 0x10);
          uVar22 = uVar16;
          do {
            puVar6 = puVar12 + -1;
            uVar10 = puVar12[-2];
            uVar25 = puVar12[1];
            uVar19 = *puVar12;
            uVar22 = uVar22 - 4;
            puVar12 = puVar12 + 4;
            puVar11[-1] = *puVar6;
            puVar11[-2] = uVar10;
            puVar11[1] = uVar25;
            *puVar11 = uVar19;
            puVar11 = puVar11 + 4;
          } while (uVar22 != 0);
          if (uVar21 == uVar16) goto LAB_00863360;
        }
        lVar17 = uVar21 - uVar16;
        puVar11 = (undefined8 *)(lVar24 + uVar16 * 8 + lVar2 * 8);
        puVar12 = (undefined8 *)(lVar9 + uVar16 * 8);
        do {
          lVar17 = lVar17 + -1;
          *puVar12 = *puVar11;
          puVar11 = puVar11 + 1;
          puVar12 = puVar12 + 1;
        } while (lVar17 != 0);
      }
LAB_00863360:
      *(long *)(lVar8 + 8) = lVar9;
      *(ulong *)(lVar8 + 0x10) = uVar21;
    }
    FUN_00863bd4(auStack_f0,param_1,0,lVar8 + 0x20,lVar8 + 0x28,lVar8 + 0x38);
  }
  iVar23 = *(int *)(param_1 + 0x90);
  local_f8 = *(ulong *)(param_1 + 0x94);
  local_fc = iVar23;
  if (iVar23 == 0x28) {
    FUN_00858f2c(param_1);
  }
  else {
    FUN_0086e3b4(param_1,0x28,"function");
  }
  local_130 = 0;
  uStack_128 = 0;
  *(int *)(*(long *)(param_1 + 0x1e8) + 0xa4) = *(int *)(*(long *)(param_1 + 0x1e8) + 0xa4) + 1;
  local_110 = (*(long *)(param_1 + 0x308) - *(long *)(param_1 + 0x300) >> 4) * -0x5555555555555555;
  local_118 = (long *)(param_1 + 0x300);
  uStack_108 = 0;
  if (*(int *)(param_1 + 0x90) == 0x29) {
    local_144 = 0;
    local_170 = 0;
  }
  else {
    if (bVar7 == 0) {
                    /* try { // try from 00863450 to 00863473 has its CatchHandler @ 0086393c */
      FUN_008614c0(&local_c0,param_1,&local_118,1,0,0,0,0);
      uStack_128 = CONCAT44(local_b0,uStack_b4);
      local_130 = CONCAT44(uStack_b8,uStack_bc);
    }
    else {
                    /* try { // try from 00863418 to 0086343f has its CatchHandler @ 00863940 */
      FUN_008614c0(&local_c0,param_1,&local_118,1,lVar8 + 0x50,0,lVar8 + 0x60,0);
      uStack_128 = CONCAT44(local_b0,uStack_b4);
      local_130 = CONCAT44(uStack_b8,uStack_bc);
      iVar23 = local_fc;
    }
    local_144 = (uint)(byte)local_c0;
    local_170 = local_a8;
  }
  local_90 = local_90 & 0xffffffffffffff00;
  local_80 = 0;
  if ((iVar23 == 0x28) && (*(int *)(param_1 + 0x90) == 0x29)) {
    uStack_88 = *(undefined8 *)(param_1 + 0x9c);
    local_90 = local_f8;
    local_80 = 1;
LAB_008634c8:
                    /* try { // try from 008634c8 to 008634f7 has its CatchHandler @ 00863958 */
    FUN_00858f2c(param_1);
  }
  else {
    if (*(int *)(param_1 + 0x90) == 0x29) goto LAB_008634c8;
    FUN_0086b5f8(param_1,0x29,&local_fc,0);
    FUN_0086e434(param_1,0x29);
  }
  lVar9 = lVar8 + 0x68;
  if (bVar7 == 0) {
    lVar9 = 0;
  }
  *(int *)(*(long *)(param_1 + 0x1e8) + 0xa4) = *(int *)(*(long *)(param_1 + 0x1e8) + 0xa4) + -1;
                    /* try { // try from 00863518 to 0086351f has its CatchHandler @ 00863954 */
  uVar10 = FUN_008652f4(param_1,lVar9);
  if (param_5 == (undefined8 *)0x0) {
    uVar19 = 0;
  }
  else {
    local_a8 = 0;
    uStack_a0 = 0;
    local_b0 = (undefined4)param_5[2];
    uStack_ac = (undefined4)((ulong)param_5[2] >> 0x20);
    local_98 = param_7 & 1;
    uStack_b8 = (undefined4)param_5[1];
    uStack_b4 = (undefined4)((ulong)param_5[1] >> 0x20);
    local_c0 = (undefined4)*param_5;
    uStack_bc = (undefined4)((ulong)*param_5 >> 0x20);
                    /* try { // try from 00863544 to 008635b3 has its CatchHandler @ 00863960 */
    puVar11 = (undefined8 *)FUN_0086e18c(param_1 + 0x180,&local_c0);
    lVar9 = *(long *)(param_1 + 0x158);
    lVar2 = *(long *)(param_1 + 0x160);
    puVar12 = (undefined8 *)FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x40);
    uVar19 = *puVar11;
    uVar4 = *(uint *)(lVar2 + -4);
    *puVar12 = CONCAT44(uStack_bc,local_c0);
    puVar12[3] = uVar19;
    puVar12[4] = (lVar2 - lVar9 >> 3) + -1;
    puVar12[5] = (ulong)uVar4;
    *(byte *)(puVar12 + 6) = local_98;
    puVar12[2] = CONCAT44(uStack_ac,local_b0);
    puVar12[1] = CONCAT44(uStack_b4,uStack_b8);
    *(undefined1 *)((long)puVar12 + 0x31) = 0;
    puVar12[7] = local_a8;
    *puVar11 = puVar12;
    FUN_0086e2d0(param_1 + 0x1b8,puVar11);
    uVar19 = *puVar11;
  }
  puVar1 = *(ulong **)(param_1 + 0x160);
  lVar9 = *(long *)(param_1 + 0x1b8);
  lVar2 = *(long *)(param_1 + 0x1c0);
  if (puVar1 < *(ulong **)(param_1 + 0x168)) {
    puVar20 = puVar1 + 1;
    *puVar1 = (ulong)local_144;
LAB_0086366c:
    *(ulong **)(param_1 + 0x160) = puVar20;
                    /* try { // try from 00863670 to 0086368b has its CatchHandler @ 00863950 */
    FUN_00865c74(&local_c0,param_1,&local_d0,param_2 & 1,&local_118);
    lVar17 = *(long *)(param_1 + 0x1b8);
    lVar3 = *(long *)(param_1 + 0x1c0);
                    /* try { // try from 00863690 to 00863697 has its CatchHandler @ 00863968 */
    lVar14 = FUN_00859498(param_1);
    lVar18 = *(long *)(param_1 + 0x1b8);
    lVar24 = *(long *)(param_1 + 0x1c0);
    uVar16 = (ulong)(lVar3 - lVar17) >> 3 & 0xffffffff;
    uVar21 = lVar24 - lVar18 >> 3;
    if (uVar16 < uVar21) {
      do {
        uVar25 = *(undefined8 *)(*(long *)(*(long *)(param_1 + 0x1b8) + uVar21 * 8 + -8) + 0x18);
                    /* try { // try from 008636c8 to 008636cf has its CatchHandler @ 00863970 */
        puVar11 = (undefined8 *)FUN_0086e18c(param_1 + 0x180);
        uVar21 = uVar21 - 1;
        *puVar11 = uVar25;
      } while (uVar16 < uVar21);
      lVar18 = *(long *)(param_1 + 0x1b8);
      lVar24 = *(long *)(param_1 + 0x1c0);
      uVar21 = lVar24 - lVar18 >> 3;
    }
    if (uVar16 < uVar21 || uVar16 - uVar21 == 0) {
      if (uVar16 < uVar21) {
        lVar24 = lVar18 + uVar16 * 8;
        *(long *)(param_1 + 0x1c0) = lVar24;
      }
    }
    else {
                    /* try { // try from 008636f4 to 008636fb has its CatchHandler @ 00863968 */
      FUN_00870174(param_1 + 0x1b8,uVar16 - uVar21);
      lVar18 = *(long *)(param_1 + 0x1b8);
      lVar24 = *(long *)(param_1 + 0x1c0);
    }
    uVar21 = lVar24 - lVar18 >> 3;
    uVar16 = (ulong)(lVar2 - lVar9) >> 3 & 0xffffffff;
    *(long *)(param_1 + 0x160) = *(long *)(param_1 + 0x160) + -8;
    if (uVar16 < uVar21) {
      do {
        uVar25 = *(undefined8 *)(*(long *)(*(long *)(param_1 + 0x1b8) + uVar21 * 8 + -8) + 0x18);
                    /* try { // try from 00863744 to 0086374b has its CatchHandler @ 0086396c */
        puVar11 = (undefined8 *)FUN_0086e18c(param_1 + 0x180);
        uVar21 = uVar21 - 1;
        *puVar11 = uVar25;
      } while (uVar16 < uVar21);
      lVar18 = *(long *)(param_1 + 0x1b8);
      uVar21 = *(long *)(param_1 + 0x1c0) - lVar18 >> 3;
    }
    if (uVar16 < uVar21 || uVar16 - uVar21 == 0) {
      if (uVar16 < uVar21) {
        *(ulong *)(param_1 + 0x1c0) = lVar18 + uVar16 * 8;
      }
    }
    else {
                    /* try { // try from 00863770 to 00863777 has its CatchHandler @ 00863968 */
      FUN_00870174(param_1 + 0x1b8,uVar16 - uVar21);
    }
    uVar25 = *(undefined8 *)(param_1 + 0x9c);
    local_140 = *param_3;
    uStack_13c = (undefined4)*(undefined8 *)(param_3 + 1);
    uStack_138 = (undefined4)((ulong)*(undefined8 *)(param_3 + 1) >> 0x20);
                    /* try { // try from 008637a0 to 008637af has its CatchHandler @ 0086394c */
    bVar7 = FUN_00861094(param_1,0x128,&local_140);
    *(byte *)(lVar14 + 0x30) = bVar7 & 1;
    lVar9 = *(long *)(param_1 + 0x158);
    lVar2 = *(long *)(param_1 + 0x160);
    local_140 = (undefined4)local_d0;
    uStack_13c = (undefined4)((ulong)local_d0 >> 0x20);
    uStack_138 = (undefined4)uVar25;
    uStack_134 = (undefined4)((ulong)uVar25 >> 0x20);
                    /* try { // try from 008637c8 to 0086381f has its CatchHandler @ 00863964 */
    auVar27._0_8_ = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0xc0);
    FUN_0084efe4(auVar27._0_8_,&local_140,param_6,auStack_f0,auStack_e0,CONCAT44(uStack_bc,local_c0)
                 ,&uStack_b8,local_144,&local_130,lVar14,lVar2 - lVar9 >> 3,param_4,uVar10,local_170
                 ,&local_90);
    if (*(char *)(param_1 + 0x68) == '\x01') {
      *(undefined8 *)(lVar8 + 0x18) = *(undefined8 *)(param_3 + 1);
                    /* try { // try from 00863838 to 00863843 has its CatchHandler @ 00863948 */
      auVar26 = FUN_0086191c(param_1,&local_118);
      *(undefined1 (*) [16])(lVar8 + 0x40) = auVar26;
      local_140 = (undefined4)auVar27._0_8_;
      uStack_13c = (undefined4)((ulong)auVar27._0_8_ >> 0x20);
                    /* try { // try from 0086384c to 00863857 has its CatchHandler @ 00863944 */
      plVar15 = (long *)FUN_00860fa0(param_1 + 0x4b0,&local_140);
      *plVar15 = lVar8;
    }
    lVar8 = *local_118 + local_110 * 0x30;
    if (lVar8 != local_118[1]) {
      local_118[1] = lVar8;
    }
    if (*(long *)(lVar5 + 0x28) == local_78) {
      auVar27._8_8_ = uVar19;
      return auVar27;
    }
  }
  else {
    __src = *(void **)(param_1 + 0x158);
    __n = (long)puVar1 - (long)__src;
    uVar21 = ((long)__n >> 3) + 1;
    if (uVar21 >> 0x3d == 0) {
      uVar22 = (long)*(ulong **)(param_1 + 0x168) - (long)__src;
      uVar16 = (long)uVar22 >> 2;
      if ((ulong)((long)uVar22 >> 2) <= uVar21) {
        uVar16 = uVar21;
      }
      if (0x7ffffffffffffff7 < uVar22) {
        uVar16 = 0x1fffffffffffffff;
      }
      if (uVar16 >> 0x3d == 0) {
                    /* try { // try from 00863628 to 0086362b has its CatchHandler @ 0086395c */
        pvVar13 = operator_new(uVar16 << 3);
        puVar1 = (ulong *)((long)pvVar13 + __n);
        puVar20 = puVar1 + 1;
        *puVar1 = (ulong)local_144;
        memcpy(puVar1 + -((long)__n >> 3),__src,__n);
        *(ulong **)(param_1 + 0x158) = puVar1 + -((long)__n >> 3);
        *(ulong **)(param_1 + 0x160) = puVar20;
        *(void **)(param_1 + 0x168) = (void *)((long)pvVar13 + uVar16 * 8);
        if (__src != (void *)0x0) {
          operator_delete(__src,uVar22);
        }
        goto LAB_0086366c;
      }
    }
    else {
      if (*(long *)(lVar5 + 0x28) != local_78) goto LAB_008639d0;
                    /* try { // try from 00863920 to 0086393b has its CatchHandler @ 0086395c */
      FUN_0086f7a0();
    }
    if (*(long *)(lVar5 + 0x28) == local_78) {
                    /* WARNING: Subroutine does not return */
      FUN_007fe1b8();
    }
  }
LAB_008639d0:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

