
/* WARNING: Possible PIC construction at 0x00512150: Changing call to branch */

void FUN_00511fb4(ulong param_1)

{
  char cVar1;
  undefined1 auVar2 [16];
  undefined1 auVar3 [16];
  undefined1 auVar4 [16];
  undefined1 auVar5 [16];
  undefined1 auVar6 [16];
  undefined1 auVar7 [16];
  undefined1 auVar8 [16];
  undefined1 auVar9 [16];
  ulong uVar10;
  ulong uVar11;
  undefined1 (*pauVar12) [16];
  undefined8 *puVar13;
  long unaff_x20;
  ulong unaff_x21;
  char unaff_w24;
  ulong *unaff_x27;
  undefined8 unaff_x29;
  undefined *puVar14;
  ulong uVar15;
  undefined1 auVar16 [16];
  undefined1 auVar17 [16];
  undefined1 auVar18 [16];
  undefined1 auVar19 [16];
  long in_stack_00000008;
  undefined8 in_stack_000000d0;
  undefined *in_stack_000000d8;
  undefined1 uStack00000000000000e0;
  
  uVar10 = 0;
  if ((7 < unaff_x21) && (0x3f < param_1 - unaff_x20)) {
    if (unaff_x21 < 0x40) {
      uVar11 = 0;
    }
    else {
      uVar10 = unaff_x21 & 0x7fffffffffffffc0;
      pauVar12 = (undefined1 (*) [16])(unaff_x20 + 0x20);
      puVar13 = (undefined8 *)(param_1 + 0x20);
      uVar11 = uVar10;
      do {
        auVar16 = pauVar12[-2];
        auVar17 = pauVar12[-1];
        auVar18 = *pauVar12;
        auVar19 = pauVar12[1];
        auVar2[1] = unaff_w24;
        auVar2[0] = unaff_w24;
        auVar2[2] = unaff_w24;
        auVar2[3] = unaff_w24;
        auVar2[4] = unaff_w24;
        auVar2[5] = unaff_w24;
        auVar2[6] = unaff_w24;
        auVar2[7] = unaff_w24;
        auVar2[8] = unaff_w24;
        auVar2[9] = unaff_w24;
        auVar2[10] = unaff_w24;
        auVar2[0xb] = unaff_w24;
        auVar2[0xc] = unaff_w24;
        auVar2[0xd] = unaff_w24;
        auVar2[0xe] = unaff_w24;
        auVar2[0xf] = unaff_w24;
        auVar6[1] = -(auVar16[1] == '\n');
        auVar6[0] = -(auVar16[0] == '\n');
        auVar6[2] = -(auVar16[2] == '\n');
        auVar6[3] = -(auVar16[3] == '\n');
        auVar6[4] = -(auVar16[4] == '\n');
        auVar6[5] = -(auVar16[5] == '\n');
        auVar6[6] = -(auVar16[6] == '\n');
        auVar6[7] = -(auVar16[7] == '\n');
        auVar6[8] = -(auVar16[8] == '\n');
        auVar6[9] = -(auVar16[9] == '\n');
        auVar6[10] = -(auVar16[10] == '\n');
        auVar6[0xb] = -(auVar16[0xb] == '\n');
        auVar6[0xc] = -(auVar16[0xc] == '\n');
        auVar6[0xd] = -(auVar16[0xd] == '\n');
        auVar6[0xe] = -(auVar16[0xe] == '\n');
        auVar6[0xf] = -(auVar16[0xf] == '\n');
        auVar16 = auVar16 ^ (auVar16 ^ auVar2) & auVar6;
        auVar3[1] = unaff_w24;
        auVar3[0] = unaff_w24;
        auVar3[2] = unaff_w24;
        auVar3[3] = unaff_w24;
        auVar3[4] = unaff_w24;
        auVar3[5] = unaff_w24;
        auVar3[6] = unaff_w24;
        auVar3[7] = unaff_w24;
        auVar3[8] = unaff_w24;
        auVar3[9] = unaff_w24;
        auVar3[10] = unaff_w24;
        auVar3[0xb] = unaff_w24;
        auVar3[0xc] = unaff_w24;
        auVar3[0xd] = unaff_w24;
        auVar3[0xe] = unaff_w24;
        auVar3[0xf] = unaff_w24;
        auVar7[1] = -(auVar17[1] == '\n');
        auVar7[0] = -(auVar17[0] == '\n');
        auVar7[2] = -(auVar17[2] == '\n');
        auVar7[3] = -(auVar17[3] == '\n');
        auVar7[4] = -(auVar17[4] == '\n');
        auVar7[5] = -(auVar17[5] == '\n');
        auVar7[6] = -(auVar17[6] == '\n');
        auVar7[7] = -(auVar17[7] == '\n');
        auVar7[8] = -(auVar17[8] == '\n');
        auVar7[9] = -(auVar17[9] == '\n');
        auVar7[10] = -(auVar17[10] == '\n');
        auVar7[0xb] = -(auVar17[0xb] == '\n');
        auVar7[0xc] = -(auVar17[0xc] == '\n');
        auVar7[0xd] = -(auVar17[0xd] == '\n');
        auVar7[0xe] = -(auVar17[0xe] == '\n');
        auVar7[0xf] = -(auVar17[0xf] == '\n');
        auVar17 = auVar17 ^ (auVar17 ^ auVar3) & auVar7;
        auVar4[1] = unaff_w24;
        auVar4[0] = unaff_w24;
        auVar4[2] = unaff_w24;
        auVar4[3] = unaff_w24;
        auVar4[4] = unaff_w24;
        auVar4[5] = unaff_w24;
        auVar4[6] = unaff_w24;
        auVar4[7] = unaff_w24;
        auVar4[8] = unaff_w24;
        auVar4[9] = unaff_w24;
        auVar4[10] = unaff_w24;
        auVar4[0xb] = unaff_w24;
        auVar4[0xc] = unaff_w24;
        auVar4[0xd] = unaff_w24;
        auVar4[0xe] = unaff_w24;
        auVar4[0xf] = unaff_w24;
        auVar8[1] = -(auVar18[1] == '\n');
        auVar8[0] = -(auVar18[0] == '\n');
        auVar8[2] = -(auVar18[2] == '\n');
        auVar8[3] = -(auVar18[3] == '\n');
        auVar8[4] = -(auVar18[4] == '\n');
        auVar8[5] = -(auVar18[5] == '\n');
        auVar8[6] = -(auVar18[6] == '\n');
        auVar8[7] = -(auVar18[7] == '\n');
        auVar8[8] = -(auVar18[8] == '\n');
        auVar8[9] = -(auVar18[9] == '\n');
        auVar8[10] = -(auVar18[10] == '\n');
        auVar8[0xb] = -(auVar18[0xb] == '\n');
        auVar8[0xc] = -(auVar18[0xc] == '\n');
        auVar8[0xd] = -(auVar18[0xd] == '\n');
        auVar8[0xe] = -(auVar18[0xe] == '\n');
        auVar8[0xf] = -(auVar18[0xf] == '\n');
        auVar18 = auVar18 ^ (auVar18 ^ auVar4) & auVar8;
        auVar5[1] = unaff_w24;
        auVar5[0] = unaff_w24;
        auVar5[2] = unaff_w24;
        auVar5[3] = unaff_w24;
        auVar5[4] = unaff_w24;
        auVar5[5] = unaff_w24;
        auVar5[6] = unaff_w24;
        auVar5[7] = unaff_w24;
        auVar5[8] = unaff_w24;
        auVar5[9] = unaff_w24;
        auVar5[10] = unaff_w24;
        auVar5[0xb] = unaff_w24;
        auVar5[0xc] = unaff_w24;
        auVar5[0xd] = unaff_w24;
        auVar5[0xe] = unaff_w24;
        auVar5[0xf] = unaff_w24;
        auVar9[1] = -(auVar19[1] == '\n');
        auVar9[0] = -(auVar19[0] == '\n');
        auVar9[2] = -(auVar19[2] == '\n');
        auVar9[3] = -(auVar19[3] == '\n');
        auVar9[4] = -(auVar19[4] == '\n');
        auVar9[5] = -(auVar19[5] == '\n');
        auVar9[6] = -(auVar19[6] == '\n');
        auVar9[7] = -(auVar19[7] == '\n');
        auVar9[8] = -(auVar19[8] == '\n');
        auVar9[9] = -(auVar19[9] == '\n');
        auVar9[10] = -(auVar19[10] == '\n');
        auVar9[0xb] = -(auVar19[0xb] == '\n');
        auVar9[0xc] = -(auVar19[0xc] == '\n');
        auVar9[0xd] = -(auVar19[0xd] == '\n');
        auVar9[0xe] = -(auVar19[0xe] == '\n');
        auVar9[0xf] = -(auVar19[0xf] == '\n');
        auVar19 = auVar19 ^ (auVar19 ^ auVar5) & auVar9;
        puVar13[-3] = auVar16._8_8_;
        puVar13[-4] = auVar16._0_8_;
        puVar13[-1] = auVar17._8_8_;
        puVar13[-2] = auVar17._0_8_;
        puVar13[1] = auVar18._8_8_;
        *puVar13 = auVar18._0_8_;
        puVar13[3] = auVar19._8_8_;
        puVar13[2] = auVar19._0_8_;
        uVar11 = uVar11 - 0x40;
        pauVar12 = pauVar12 + 4;
        puVar13 = puVar13 + 8;
      } while (uVar11 != 0);
      if (unaff_x21 == uVar10) goto code_r0x0051225c;
      uVar11 = uVar10;
      if ((unaff_x21 & 0x38) == 0) goto LAB_00512240;
    }
    uVar10 = unaff_x21 & 0x7ffffffffffffff8;
    do {
      uVar15 = *(ulong *)(unaff_x20 + uVar11);
      *(ulong *)(param_1 + uVar11) =
           uVar15 ^ (uVar15 ^ CONCAT17(unaff_w24,
                                       CONCAT16(unaff_w24,
                                                CONCAT15(unaff_w24,
                                                         CONCAT14(unaff_w24,
                                                                  CONCAT13(unaff_w24,
                                                                           CONCAT12(unaff_w24,
                                                                                    CONCAT11(
                                                  unaff_w24,unaff_w24)))))))) &
                    CONCAT17(-((char)(uVar15 >> 0x38) == '\n'),
                             CONCAT16(-((char)(uVar15 >> 0x30) == '\n'),
                                      CONCAT15(-((char)(uVar15 >> 0x28) == '\n'),
                                               CONCAT14(-((char)(uVar15 >> 0x20) == '\n'),
                                                        CONCAT13(-((char)(uVar15 >> 0x18) == '\n'),
                                                                 CONCAT12(-((char)(uVar15 >> 0x10)
                                                                           == '\n'),
                                                                          CONCAT11(-((char)(uVar15 
                                                  >> 8) == '\n'),-((char)uVar15 == '\n'))))))));
      uVar11 = uVar11 + 8;
    } while (uVar10 != uVar11);
    if (unaff_x21 == uVar10) goto code_r0x0051225c;
  }
LAB_00512240:
  do {
    cVar1 = unaff_w24;
    if (*(char *)(unaff_x20 + uVar10) != '\n') {
      cVar1 = *(char *)(unaff_x20 + uVar10);
    }
    *(char *)(param_1 + uVar10) = cVar1;
    uVar10 = uVar10 + 1;
  } while (unaff_x21 != uVar10);
code_r0x0051225c:
  if (*unaff_x27 == 0) {
    *unaff_x27 = unaff_x21;
    unaff_x27[1] = param_1;
    unaff_x27[2] = unaff_x21;
    if (in_stack_00000008 == 0) {
      return;
    }
    register0x00000008 = (BADSPACEBASE *)&uStack00000000000000e0;
    unaff_x29 = in_stack_000000d0;
    puVar14 = in_stack_000000d8;
  }
  else {
    puVar14 = &UNK_00512154;
  }
  *(undefined8 *)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined **)((long)register0x00000008 + -8) = puVar14;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}

