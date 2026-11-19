/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0086ab5c
 */

/* WARNING: Removing unreachable block (ram,0x0086af74) */

void FUN_0086ab5c(long param_1,undefined8 *param_2,undefined8 *param_3,undefined8 *param_4)

{
  long *plVar1;
  long lVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 *puVar5;
  ulong uVar6;
  undefined8 *puVar7;
  int iVar8;
  int *piVar9;
  ulong uVar10;
  long lVar11;
  long lVar12;
  undefined8 *puVar13;
  undefined4 uVar14;
  undefined8 uVar15;
  long lVar16;
  undefined1 auVar17 [16];
  undefined8 local_a0;
  ulong uStack_98;
  int local_90;
  undefined4 uStack_8c;
  undefined4 uStack_88;
  undefined4 uStack_84;
  long local_68;
  
  lVar2 = tpidr_el0;
  local_68 = *(long *)(lVar2 + 0x28);
  lVar12 = *(long *)(param_1 + 0x378);
  lVar16 = *(long *)(param_1 + 0x380) - lVar12;
  if (*(int *)(param_1 + 0x90) == 0x3c) {
    puVar13 = (undefined8 *)(param_1 + 0x94);
    uVar15 = *puVar13;
    if (param_2 != (undefined8 *)0x0) {
      *param_2 = uVar15;
    }
                    /* try { // try from 0086abbc to 0086abc3 has its CatchHandler @ 0086afd8 */
    FUN_00858f2c(param_1);
    lVar11 = 0;
    plVar1 = (long *)(param_1 + 0x378);
    do {
      iVar8 = *(int *)(param_1 + 0x90);
      if (iVar8 == 0x106) {
LAB_0086abe4:
                    /* try { // try from 0086abe4 to 0086abeb has its CatchHandler @ 0086aff0 */
        uVar3 = FUN_00866418(param_1);
        local_90 = 0;
        uStack_8c = 0;
        uStack_88 = (undefined4)uVar3;
        uStack_84 = (undefined4)((ulong)uVar3 >> 0x20);
                    /* try { // try from 0086abf0 to 0086abfb has its CatchHandler @ 0086afec */
        FUN_00872850(plVar1,&local_90);
      }
      else {
        if (iVar8 == 0x119) {
                    /* try { // try from 0086ac08 to 0086ac13 has its CatchHandler @ 0086aff8 */
          FUN_00853d20(&local_90,param_1 + 0x70);
          if (local_90 == 0x106) goto LAB_0086abe4;
          iVar8 = *(int *)(param_1 + 0x90);
        }
        if (iVar8 == 0x3e) {
          if (lVar11 == 0) goto LAB_0086aed4;
          uVar14 = *(undefined4 *)(param_1 + 0x124);
          uStack_88 = (undefined4)*(undefined8 *)(param_1 + 0x9c);
          uStack_84 = (undefined4)((ulong)*(undefined8 *)(param_1 + 0x9c) >> 0x20);
          local_90 = (int)*puVar13;
          uStack_8c = (undefined4)((ulong)*puVar13 >> 0x20);
LAB_0086adac:
                    /* try { // try from 0086adac to 0086ade3 has its CatchHandler @ 0086aff4 */
          uVar3 = FUN_008695d4(param_1,0,0);
          *(undefined4 *)(param_1 + 0x124) = uVar14;
        }
        else {
          if (iVar8 == 0x28) {
            uStack_88 = (undefined4)*(undefined8 *)(param_1 + 0x9c);
            uStack_84 = (undefined4)((ulong)*(undefined8 *)(param_1 + 0x9c) >> 0x20);
            local_90 = (int)*puVar13;
            uStack_8c = (undefined4)((ulong)*puVar13 >> 0x20);
                    /* try { // try from 0086ac3c to 0086ac4b has its CatchHandler @ 0086afe8 */
            auVar17 = FUN_008695d4(param_1,1,0);
            uVar6 = auVar17._8_8_;
            if (uVar6 == 0) {
                    /* try { // try from 0086adfc to 0086ae1b has its CatchHandler @ 0086afe4 */
              local_a0 = FUN_00867310(param_1,auVar17._0_8_,&local_90);
              uStack_98 = 0;
              FUN_00872850(plVar1,&local_a0);
            }
            else if ((((*(int *)(uVar6 + 8) == DAT_00d1b310) && (*(long *)(uVar6 + 0x30) == 0)) &&
                     (*(long *)(uVar6 + 0x28) == 1)) &&
                    (((iVar8 = *(int *)(param_1 + 0x90), iVar8 == 0x26 || (iVar8 == 0x7c)) ||
                     (iVar8 == 0x3f)))) {
              lVar12 = **(long **)(uVar6 + 0x20);
                    /* try { // try from 0086aca8 to 0086acc3 has its CatchHandler @ 0086afd0 */
              uVar3 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),0x28);
              FUN_008510d0(uVar3,lVar12 + 0xc,lVar12);
              if ((*(char *)(param_1 + 0x68) == '\x01') && (*(long *)(param_1 + 0x4d8) != 0)) {
                uVar10 = ((ulong)(uint)(auVar17._8_4_ << 3) + 8 ^ uVar6 >> 0x20) *
                         -0x622015f714c7d297;
                uVar10 = (uVar6 >> 0x20 ^ uVar10 >> 0x2f ^ uVar10) * -0x622015f714c7d297;
                uVar10 = (uVar10 ^ uVar10 >> 0x2f) * -0x6b622cb0470b6a63 >>
                         ((ulong)*(byte *)(param_1 + 0x4e0) & 0x3f);
                if ((*(ulong *)(*(long *)(param_1 + 0x4c8) + (uVar10 >> 6) * 8) >> (uVar10 & 0x3f) &
                    1) != 0) {
                  do {
                    if (*(ulong *)(*(long *)(param_1 + 0x4b0) + uVar10 * 0x10) == uVar6) {
                      piVar9 = *(int **)(*(long *)(param_1 + 0x4b0) + uVar10 * 0x10 + 8);
                      if ((piVar9 != (int *)0x0) && (*piVar9 == DAT_00d1eb80)) {
                    /* try { // try from 0086ae70 to 0086ae77 has its CatchHandler @ 0086afc8 */
                        uVar4 = FUN_0086e158(*(undefined8 *)(param_1 + 0xe8),piVar9 + 3);
                    /* try { // try from 0086ae84 to 0086ae8f has its CatchHandler @ 0086afc4 */
                        local_a0 = uVar3;
                        puVar5 = (undefined8 *)FUN_00860fa0(param_1 + 0x4b0,&local_a0);
                        *puVar5 = uVar4;
                      }
                      break;
                    }
                    uVar10 = uVar10 + 1 & *(long *)(param_1 + 0x4d0) - 1U;
                  } while ((*(ulong *)(*(long *)(param_1 + 0x4c8) + (uVar10 >> 6) * 8) >>
                            (uVar10 & 0x3f) & 1) != 0);
                }
              }
                    /* try { // try from 0086ae98 to 0086aeb3 has its CatchHandler @ 0086afcc */
              local_a0 = FUN_00867310(param_1,uVar3,&local_90);
              uStack_98 = 0;
              FUN_00872850(plVar1,&local_a0);
            }
            else {
              local_a0 = 0;
                    /* try { // try from 0086adec to 0086adf7 has its CatchHandler @ 0086afe0 */
              uStack_98 = uVar6;
              FUN_00872850(plVar1,&local_a0);
            }
            goto LAB_0086ae1c;
          }
          uVar14 = *(undefined4 *)(param_1 + 0x124);
          uVar3 = 0;
          uStack_88 = (undefined4)*(undefined8 *)(param_1 + 0x9c);
          uStack_84 = (undefined4)((ulong)*(undefined8 *)(param_1 + 0x9c) >> 0x20);
          local_90 = (int)*puVar13;
          uStack_8c = (undefined4)((ulong)*puVar13 >> 0x20);
          if ((iVar8 != 0x26) && (iVar8 != 0x7c)) goto LAB_0086adac;
        }
        local_a0 = FUN_00867310(param_1,uVar3,&local_90);
        *(undefined4 *)(param_1 + 0x124) = uVar14;
        uStack_98 = 0;
        FUN_00872850(plVar1,&local_a0);
      }
LAB_0086ae1c:
      lVar11 = lVar11 + 1;
      if (*(int *)(param_1 + 0x90) != 0x2c) goto LAB_0086aec0;
      if (param_3 != (undefined8 *)0x0) {
                    /* try { // try from 0086ae34 to 0086ae3b has its CatchHandler @ 0086aff8 */
        FUN_00870ce4(*param_3,puVar13);
        param_3[2] = param_3[2] + 1;
      }
                    /* try { // try from 0086abd0 to 0086abd7 has its CatchHandler @ 0086aff8 */
      FUN_00858f2c(param_1);
    } while( true );
  }
LAB_0086af50:
  puVar7 = (undefined8 *)0x0;
LAB_0086af54:
  lVar16 = lVar16 + lVar12;
  if (lVar16 != *(long *)(param_1 + 0x380)) {
    *(long *)(param_1 + 0x380) = lVar16;
  }
  if (*(long *)(lVar2 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(puVar7);
  }
  return;
LAB_0086aec0:
  uStack_8c = (undefined4)uVar15;
  uStack_88 = (undefined4)((ulong)uVar15 >> 0x20);
  local_90 = 0x3c;
  if (*(int *)(param_1 + 0x90) == 0x3e) {
LAB_0086aed4:
                    /* try { // try from 0086aed4 to 0086af07 has its CatchHandler @ 0086afdc */
    FUN_00858f2c(param_1);
    uVar6 = 1;
  }
  else {
    FUN_0086b5f8(param_1,0x3e,&local_90,0);
    uVar6 = FUN_0086e434(param_1,0x3e);
  }
  if ((param_4 != (undefined8 *)0x0) && ((uVar6 & 1) != 0)) {
    *param_4 = *(undefined8 *)(param_1 + 0xb0);
  }
  lVar12 = *plVar1;
  if (lVar11 != 0) {
                    /* try { // try from 0086af28 to 0086af2b has its CatchHandler @ 0086afd4 */
    puVar7 = (undefined8 *)FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),lVar11 << 4);
    puVar13 = (undefined8 *)(lVar12 + lVar16);
    puVar5 = puVar7;
    do {
      uVar15 = *puVar13;
      lVar11 = lVar11 + -1;
      puVar5[1] = puVar13[1];
      *puVar5 = uVar15;
      puVar13 = puVar13 + 2;
      puVar5 = puVar5 + 2;
    } while (lVar11 != 0);
    lVar12 = *plVar1;
    goto LAB_0086af54;
  }
  goto LAB_0086af50;
}

