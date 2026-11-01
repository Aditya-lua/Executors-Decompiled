
/* WARNING: Possible PIC construction at 0x006d666c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x006d6734: Changing call to branch */
/* WARNING: Possible PIC construction at 0x006d6828: Changing call to branch */
/* WARNING: Possible PIC construction at 0x006d6874: Changing call to branch */
/* WARNING: Possible PIC construction at 0x006d694c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x006d6a78: Changing call to branch */
/* WARNING: Possible PIC construction at 0x006d6aa0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x006d6ae0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x006d6b4c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x006d6b70: Changing call to branch */
/* WARNING: Possible PIC construction at 0x006d6c3c: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x006d6b74) */
/* WARNING: Removing unreachable block (ram,0x006d6b7c) */
/* WARNING: Removing unreachable block (ram,0x006d6b84) */
/* WARNING: Removing unreachable block (ram,0x006d6b8c) */
/* WARNING: Removing unreachable block (ram,0x006d6c4c) */
/* WARNING: Removing unreachable block (ram,0x006d6b94) */
/* WARNING: Removing unreachable block (ram,0x006d6c50) */
/* WARNING: Removing unreachable block (ram,0x006d6b50) */
/* WARNING: Removing unreachable block (ram,0x006d6ae4) */
/* WARNING: Removing unreachable block (ram,0x006d6afc) */
/* WARNING: Removing unreachable block (ram,0x006d6aa4) */
/* WARNING: Removing unreachable block (ram,0x006d6aac) */
/* WARNING: Removing unreachable block (ram,0x006d6a7c) */
/* WARNING: Removing unreachable block (ram,0x006d6950) */
/* WARNING: Removing unreachable block (ram,0x006d6878) */
/* WARNING: Removing unreachable block (ram,0x006d688c) */
/* WARNING: Removing unreachable block (ram,0x006d682c) */
/* WARNING: Removing unreachable block (ram,0x006d67f8) */
/* WARNING: Removing unreachable block (ram,0x006d6834) */
/* WARNING: Removing unreachable block (ram,0x006d684c) */
/* WARNING: Removing unreachable block (ram,0x006d6850) */
/* WARNING: Removing unreachable block (ram,0x006d6738) */
/* WARNING: Removing unreachable block (ram,0x006d673c) */
/* WARNING: Removing unreachable block (ram,0x006d6670) */
/* WARNING: Removing unreachable block (ram,0x006d667c) */
/* WARNING: Removing unreachable block (ram,0x006d6c40) */
/* WARNING: Removing unreachable block (ram,0x006d6c48) */
/* WARNING: Removing unreachable block (ram,0x006d6cdc) */
/* WARNING: Removing unreachable block (ram,0x006d6cc8) */

long FUN_006d6518(undefined8 param_1,undefined8 param_2,ulong param_3)

{
  bool bVar1;
  ulong *puVar2;
  undefined1 *puVar3;
  int iVar4;
  undefined4 *puVar5;
  long lVar6;
  long *plVar7;
  int *extraout_x8;
  int *piVar8;
  long lVar9;
  ulong uVar10;
  long *in_x10;
  ulong uVar11;
  ulong *puVar12;
  ulong uVar13;
  ulong uVar14;
  long unaff_x19;
  int *unaff_x20;
  long *unaff_x21;
  long *unaff_x22;
  long *plVar15;
  undefined **unaff_x23;
  undefined4 *unaff_x24;
  undefined8 unaff_x25;
  undefined8 unaff_x26;
  undefined1 *unaff_x29;
  undefined *puVar16;
  undefined8 uVar17;
  undefined8 unaff_d8;
  undefined1 auVar18 [16];
  undefined8 in_stack_00000000;
  long in_stack_00000018;
  
  do {
    if ((in_x10[2] != 0) && (in_x10[3] != param_3)) {
      uVar10 = 0;
      uVar11 = param_3 >> 4 ^ param_3 >> 9;
      do {
        uVar11 = uVar11 & in_x10[1] - 1U;
        puVar12 = (ulong *)(*in_x10 + uVar11 * (long)unaff_x24);
        if (*puVar12 == param_3) goto LAB_006d6570;
        if (*puVar12 == in_x10[3]) break;
        uVar10 = uVar10 + 1;
        uVar11 = uVar10 + uVar11;
      } while (uVar10 <= in_x10[1] - 1U);
    }
    puVar12 = (ulong *)0x0;
LAB_006d6570:
    puVar2 = (ulong *)0x0;
    if (puVar12 != (ulong *)0x0) {
      puVar2 = puVar12 + 1;
    }
    if ((char)puVar2[1] == '\0') {
      *(char *)((long)puVar2 + 9) = (char)unaff_x23;
      func_0x006d7e68();
      unaff_x21 = *(long **)(unaff_x19 + 0x28);
    }
    unaff_x22 = (long *)((long)unaff_x22 + 1);
    if (unaff_x21 <= unaff_x22) break;
    param_3 = *(ulong *)(*(long *)(unaff_x19 + 0x20) + (long)unaff_x22 * 8);
    in_x10 = *(long **)(unaff_x20 + 4);
    in_stack_00000000 = unaff_d8;
  } while( true );
  if (*(long *)PTR____stack_chk_guard_009b01e8 == in_stack_00000018) {
    return 0;
  }
  puVar16 = &DAT_006d660c;
  auVar18 = ___stack_chk_fail();
  plVar7 = auVar18._0_8_;
  puVar3 = (undefined1 *)register0x00000008;
  lVar6 = auVar18._8_8_;
  piVar8 = extraout_x8;
code_r0x006d660c:
  *(undefined8 *)(puVar3 + -0x50) = unaff_x26;
  *(undefined8 *)(puVar3 + -0x48) = unaff_x25;
  *(undefined4 **)(puVar3 + -0x40) = unaff_x24;
  *(undefined ***)(puVar3 + -0x38) = unaff_x23;
  *(long **)(puVar3 + -0x30) = unaff_x22;
  *(long **)(puVar3 + -0x28) = unaff_x21;
  *(int **)(puVar3 + -0x20) = unaff_x20;
  *(long *)(puVar3 + -0x18) = unaff_x19;
  *(undefined1 **)(puVar3 + -0x10) = unaff_x29;
  *(undefined **)(puVar3 + -8) = puVar16;
  unaff_x29 = puVar3 + -0x10;
  *(undefined8 *)(puVar3 + -0x58) = *(undefined8 *)PTR____stack_chk_guard_009b01e8;
  piVar8[0] = 0;
  piVar8[1] = 0;
  piVar8[2] = 0;
  piVar8[3] = 0;
  iVar4 = *(int *)(lVar6 + 8);
  unaff_x19 = lVar6;
  unaff_x20 = piVar8;
  unaff_x21 = plVar7;
  if ((lVar6 == 0) || (iVar4 != iRam0000000000a27a48)) {
    if (iVar4 == iRam0000000000a27a58) {
      *piVar8 = 1;
      goto code_r0x006d69cc;
    }
    if ((lVar6 != 0) && (iVar4 == iRam0000000000a27a68)) {
      *piVar8 = 2;
      *(undefined1 *)(piVar8 + 2) = *(undefined1 *)(lVar6 + 0x1c);
      goto code_r0x006d69cc;
    }
    if ((lVar6 != 0) && (iVar4 == iRam0000000000a27a78)) {
      *piVar8 = 3;
      *(undefined8 *)(piVar8 + 2) = *(undefined8 *)(lVar6 + 0x20);
      goto code_r0x006d69cc;
    }
    if ((lVar6 != 0) && (iVar4 == iRam0000000000a27a88)) {
      uVar17 = *(undefined8 *)(lVar6 + 0x28);
      *(undefined8 *)(piVar8 + 2) = *(undefined8 *)(lVar6 + 0x20);
      *piVar8 = 5;
      piVar8[1] = (int)uVar17;
      goto code_r0x006d69cc;
    }
    if ((lVar6 != 0) && (iVar4 == iRam0000000000a27a98)) {
      auVar18._8_8_ = lVar6 + 0x20;
      auVar18._0_8_ = plVar7[3];
      goto code_r0x006d6c64;
    }
    unaff_x23 = &PTR_s_pixelFormat_00a27000;
    if ((iVar4 == iRam0000000000a27aa8) || (iVar4 == iRam0000000000a27ab8)) goto code_r0x006d69cc;
    lVar9 = lVar6;
    if (iVar4 != iRam0000000000a27ac8) {
      lVar9 = 0;
    }
    *(long *)(puVar3 + -0xa8) = lVar9;
    if (lVar9 != 0) {
      func_0x006d660c(puVar3 + -0x70,plVar7,*(undefined8 *)(lVar9 + 0x20));
      if ((plVar7[4] == 0) ||
         (puVar5 = (undefined4 *)func_0x006d6cf8(plVar7[4],puVar3 + -0xa8),
         puVar5 == (undefined4 *)0x0)) {
        plVar15 = (long *)(puVar3 + -0xa8);
        if (*(long *)(*plVar15 + 0x40) == 0) goto code_r0x006d69cc;
        unaff_x22 = (long *)0x0;
        piVar8 = (int *)(puVar3 + -0x70);
        puVar16 = &UNK_006d6878;
        puVar3 = puVar3 + -0xb0;
        lVar6 = **(long **)(*plVar15 + 0x38);
      }
      else {
        unaff_x22 = plVar7 + 9;
        lVar9 = plVar7[10] - *unaff_x22 >> 3;
        unaff_x23 = (undefined **)(lVar9 * -0x5555555555555555);
        func_0x006d6d8c(unaff_x22,(long)unaff_x23 + *(long *)(*(long *)(puVar3 + -0xa8) + 0x40));
        plVar15 = (long *)(puVar3 + -0xa8);
        if (*(long *)(*plVar15 + 0x40) == 0) {
          func_0x006d45b0(puVar3 + -0x70,plVar7[7],*puVar5,plVar7[9] + lVar9 * 8,0);
          uVar17 = *(undefined8 *)(puVar3 + -0x70);
          *(undefined8 *)(piVar8 + 2) = *(undefined8 *)(puVar3 + -0x68);
          *(undefined8 *)piVar8 = uVar17;
          *(undefined8 *)(piVar8 + 4) = *(undefined8 *)(puVar3 + -0x60);
          func_0x006d6fd0(unaff_x22,unaff_x23);
          goto code_r0x006d69cc;
        }
        unaff_x25 = 0;
        unaff_x26 = 1;
        piVar8 = (int *)(puVar3 + -0x70);
        puVar16 = &UNK_006d682c;
        puVar3 = puVar3 + -0xb0;
        lVar6 = **(long **)(*plVar15 + 0x38);
        unaff_x24 = puVar5;
      }
      goto code_r0x006d660c;
    }
    if ((lVar6 != 0) && (iVar4 == iRam0000000000a27ad8)) {
      func_0x006d660c(puVar3 + -0x70,plVar7,*(undefined8 *)(lVar6 + 0x20));
      if (((char)plVar7[5] != '\0') &&
         ((lVar9 = *(long *)(lVar6 + 0x20), lVar9 != 0 &&
          (*(int *)(lVar9 + 8) == iRam0000000000a27aa8)))) {
        if ((*(long *)(lVar9 + 0x20) != 0) &&
           (iVar4 = _strcmp(*(long *)(lVar9 + 0x20),"math"), iVar4 == 0)) {
          func_0x006d5578(puVar3 + -0x70,*(undefined8 *)(lVar6 + 0x28));
          uVar17 = *(undefined8 *)(puVar3 + -0x70);
          *(undefined8 *)(piVar8 + 2) = *(undefined8 *)(puVar3 + -0x68);
          *(undefined8 *)piVar8 = uVar17;
          *(undefined8 *)(piVar8 + 4) = *(undefined8 *)(puVar3 + -0x60);
        }
        if (((code *)plVar7[6] != (code *)0x0) && (*piVar8 == 0)) {
          (*(code *)plVar7[6])(*(undefined8 *)(lVar9 + 0x20),*(undefined8 *)(lVar6 + 0x28),piVar8);
        }
      }
      goto code_r0x006d69cc;
    }
    if ((lVar6 != 0) && (iVar4 == iRam0000000000a27ae8)) {
      piVar8 = (int *)(puVar3 + -0x70);
      puVar16 = &UNK_006d6950;
      puVar3 = puVar3 + -0xb0;
      lVar6 = *(long *)(lVar6 + 0x20);
      goto code_r0x006d660c;
    }
    if ((lVar6 != 0) && (iVar4 == iRam0000000000a27af8)) {
      (**(code **)**(undefined8 **)(lVar6 + 0x90))(*(undefined8 **)(lVar6 + 0x90),plVar7);
      goto code_r0x006d69cc;
    }
    if ((iVar4 == iRam0000000000a27b08) && (lVar6 != 0)) {
      if (*(long *)(lVar6 + 0x28) == 0) goto code_r0x006d69cc;
      unaff_x22 = (long *)0x0;
      unaff_x23 = (undefined **)0x0;
      while( true ) {
        unaff_x24 = (undefined4 *)(*(long *)(lVar6 + 0x20) + (long)unaff_x22);
        if (*(long *)(unaff_x24 + 2) != 0) break;
        func_0x006d660c(puVar3 + -0x70,plVar7,*(undefined8 *)(unaff_x24 + 4));
        unaff_x23 = (undefined **)((long)unaff_x23 + 1);
        unaff_x22 = unaff_x22 + 3;
        if (*(undefined ***)(lVar6 + 0x28) <= unaff_x23) goto code_r0x006d69cc;
      }
      piVar8 = (int *)(puVar3 + -0x70);
      puVar16 = &UNK_006d6a7c;
      puVar3 = puVar3 + -0xb0;
      lVar6 = *(long *)(unaff_x24 + 2);
      goto code_r0x006d660c;
    }
    if ((lVar6 != 0) && (iVar4 == iRam0000000000a27b18)) {
      piVar8 = (int *)(puVar3 + -0x70);
      puVar16 = &UNK_006d6aa4;
      puVar3 = puVar3 + -0xb0;
      lVar6 = *(long *)(lVar6 + 0x20);
      goto code_r0x006d660c;
    }
    if ((lVar6 != 0) && (iVar4 == iRam0000000000a27b28)) {
      piVar8 = (int *)(puVar3 + -0x70);
      puVar16 = &UNK_006d6ae4;
      puVar3 = puVar3 + -0xb0;
      lVar6 = *(long *)(lVar6 + 0x20);
      goto code_r0x006d660c;
    }
    if ((lVar6 != 0) && (iVar4 == iRam0000000000a27b38)) goto code_r0x006d6660;
    if ((lVar6 != 0) && (iVar4 == iRam0000000000a27b48)) {
      piVar8 = (int *)(puVar3 + -0x70);
      puVar16 = &UNK_006d6b50;
      puVar3 = puVar3 + -0xb0;
      lVar6 = *(long *)(lVar6 + 0x20);
      goto code_r0x006d660c;
    }
    if ((lVar6 != 0) && (iVar4 == iRam0000000000a27b58)) {
      plVar15 = *(long **)(lVar6 + 0x30);
      lVar9 = *(long *)(lVar6 + 0x38);
      if (cRam0000000000a336a0 != '\0') {
        if (lVar9 == 0) goto code_r0x006d6bf8;
        lVar9 = lVar9 << 3;
        bVar1 = true;
        do {
          func_0x006d660c(puVar3 + -0x70,plVar7,*plVar15);
          bVar1 = (bool)(*(int *)(puVar3 + -0x70) == 5 & bVar1);
          lVar9 = lVar9 + -8;
          plVar15 = plVar15 + 1;
        } while (lVar9 != 0);
        if (bVar1) {
code_r0x006d6bf8:
          func_0x006d7b9c(piVar8,lVar6,plVar7[1],plVar7[7]);
        }
code_r0x006d69cc:
        lVar6 = func_0x006d7e68(plVar7,plVar7[1],lVar6,piVar8);
        if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(puVar3 + -0x58)) {
          return lVar6;
        }
        auVar18 = ___stack_chk_fail();
code_r0x006d6c64:
        plVar7 = auVar18._0_8_;
        if (plVar7[2] == 0) {
          return 0;
        }
        uVar10 = *auVar18._8_8_;
        if (uVar10 != plVar7[3]) {
          uVar11 = 0;
          uVar13 = uVar10 >> 4 ^ uVar10 >> 9;
          while( true ) {
            uVar13 = uVar13 & plVar7[1] - 1U;
            uVar14 = *(ulong *)(*plVar7 + uVar13 * 0x20);
            if (uVar14 == uVar10) {
              lVar6 = *plVar7 + uVar13 * 0x20;
              lVar9 = 0;
              if (lVar6 != 0) {
                lVar9 = lVar6 + 8;
              }
              return lVar9;
            }
            if (uVar14 == plVar7[3]) break;
            uVar11 = uVar11 + 1;
            uVar13 = uVar11 + uVar13;
            if (plVar7[1] - 1U < uVar11) {
              return 0;
            }
          }
        }
        return 0;
      }
      if (lVar9 == 0) goto code_r0x006d69cc;
      unaff_x23 = (undefined **)(lVar9 << 3);
      unaff_x22 = plVar15 + 1;
      piVar8 = (int *)(puVar3 + -0x70);
      puVar16 = &UNK_006d6c40;
      puVar3 = puVar3 + -0xb0;
      lVar6 = *plVar15;
      goto code_r0x006d660c;
    }
    if ((lVar6 == 0) || (iVar4 != iRam0000000000a27b68)) goto code_r0x006d69cc;
  }
code_r0x006d6660:
  piVar8 = (int *)(puVar3 + -0x70);
  puVar16 = &UNK_006d6670;
  puVar3 = puVar3 + -0xb0;
  lVar6 = *(long *)(lVar6 + 0x20);
  goto code_r0x006d660c;
}

