
/* WARNING: Possible PIC construction at 0x00512150: Changing call to branch */

void FUN_005121e4(ulong param_1,undefined1 param_2 [16],undefined1 param_3 [16],
                 undefined1 param_4 [16],undefined1 param_5 [16],undefined1 param_6 [16],
                 undefined1 param_7 [16])

{
  undefined1 auVar1 [16];
  undefined1 auVar2 [16];
  undefined1 auVar3 [16];
  undefined1 auVar4 [16];
  ulong uVar5;
  undefined1 (*in_x9) [16];
  undefined8 *in_x10;
  long in_x11;
  long unaff_x20;
  ulong unaff_x21;
  ulong unaff_x23;
  char unaff_w24;
  ulong *unaff_x27;
  undefined8 unaff_x29;
  undefined *puVar6;
  char cVar7;
  char cVar8;
  char cVar9;
  char cVar10;
  char cVar11;
  char cVar12;
  char cVar13;
  char cVar14;
  char cVar15;
  char cVar16;
  char cVar17;
  char cVar18;
  char cVar19;
  char cVar20;
  char cVar21;
  char cVar22;
  ulong uVar23;
  char in_b16;
  char in_register_00005201;
  char in_register_00005202;
  char in_register_00005203;
  char in_register_00005204;
  char in_register_00005205;
  char in_register_00005206;
  char in_register_00005207;
  char in_register_00005208;
  char in_register_00005209;
  char in_register_0000520a;
  char in_register_0000520b;
  char in_register_0000520c;
  char in_register_0000520d;
  char in_register_0000520e;
  char in_register_0000520f;
  char in_b17;
  char in_register_00005221;
  char in_register_00005222;
  char in_register_00005223;
  char in_register_00005224;
  char in_register_00005225;
  char in_register_00005226;
  char in_register_00005227;
  char in_register_00005228;
  char in_register_00005229;
  char in_register_0000522a;
  char in_register_0000522b;
  char in_register_0000522c;
  char in_register_0000522d;
  char in_register_0000522e;
  char in_register_0000522f;
  long in_stack_00000008;
  undefined8 in_stack_000000d0;
  undefined *in_stack_000000d8;
  undefined1 uStack00000000000000e0;
  
  while( true ) {
    auVar3[1] = in_register_00005201;
    auVar3[0] = in_b16;
    auVar3[2] = in_register_00005202;
    auVar3[3] = in_register_00005203;
    auVar3[4] = in_register_00005204;
    auVar3[5] = in_register_00005205;
    auVar3[6] = in_register_00005206;
    auVar3[7] = in_register_00005207;
    auVar3[8] = in_register_00005208;
    auVar3[9] = in_register_00005209;
    auVar3[10] = in_register_0000520a;
    auVar3[0xb] = in_register_0000520b;
    auVar3[0xc] = in_register_0000520c;
    auVar3[0xd] = in_register_0000520d;
    auVar3[0xe] = in_register_0000520e;
    auVar3[0xf] = in_register_0000520f;
    param_6 = param_6 ^ (param_6 ^ param_2) & auVar3;
    auVar4[1] = in_register_00005221;
    auVar4[0] = in_b17;
    auVar4[2] = in_register_00005222;
    auVar4[3] = in_register_00005223;
    auVar4[4] = in_register_00005224;
    auVar4[5] = in_register_00005225;
    auVar4[6] = in_register_00005226;
    auVar4[7] = in_register_00005227;
    auVar4[8] = in_register_00005228;
    auVar4[9] = in_register_00005229;
    auVar4[10] = in_register_0000522a;
    auVar4[0xb] = in_register_0000522b;
    auVar4[0xc] = in_register_0000522c;
    auVar4[0xd] = in_register_0000522d;
    auVar4[0xe] = in_register_0000522e;
    auVar4[0xf] = in_register_0000522f;
    param_7 = param_7 ^ (param_7 ^ param_2) & auVar4;
    in_x10[-3] = param_4._8_8_;
    in_x10[-4] = param_4._0_8_;
    in_x10[-1] = param_5._8_8_;
    in_x10[-2] = param_5._0_8_;
    in_x10[1] = param_6._8_8_;
    *in_x10 = param_6._0_8_;
    in_x10[3] = param_7._8_8_;
    in_x10[2] = param_7._0_8_;
    in_x11 = in_x11 + -0x40;
    if (in_x11 == 0) break;
    param_4 = in_x9[-2];
    param_5 = in_x9[-1];
    param_6 = *in_x9;
    param_7 = in_x9[1];
    cVar7 = param_3[0];
    cVar8 = param_3[1];
    cVar9 = param_3[2];
    cVar10 = param_3[3];
    cVar11 = param_3[4];
    cVar12 = param_3[5];
    cVar13 = param_3[6];
    cVar14 = param_3[7];
    cVar15 = param_3[8];
    cVar16 = param_3[9];
    cVar17 = param_3[10];
    cVar18 = param_3[0xb];
    cVar19 = param_3[0xc];
    cVar20 = param_3[0xd];
    cVar21 = param_3[0xe];
    cVar22 = param_3[0xf];
    in_b16 = -(param_6[0] == cVar7);
    in_register_00005201 = -(param_6[1] == cVar8);
    in_register_00005202 = -(param_6[2] == cVar9);
    in_register_00005203 = -(param_6[3] == cVar10);
    in_register_00005204 = -(param_6[4] == cVar11);
    in_register_00005205 = -(param_6[5] == cVar12);
    in_register_00005206 = -(param_6[6] == cVar13);
    in_register_00005207 = -(param_6[7] == cVar14);
    in_register_00005208 = -(param_6[8] == cVar15);
    in_register_00005209 = -(param_6[9] == cVar16);
    in_register_0000520a = -(param_6[10] == cVar17);
    in_register_0000520b = -(param_6[0xb] == cVar18);
    in_register_0000520c = -(param_6[0xc] == cVar19);
    in_register_0000520d = -(param_6[0xd] == cVar20);
    in_register_0000520e = -(param_6[0xe] == cVar21);
    in_register_0000520f = -(param_6[0xf] == cVar22);
    in_b17 = -(param_7[0] == cVar7);
    in_register_00005221 = -(param_7[1] == cVar8);
    in_register_00005222 = -(param_7[2] == cVar9);
    in_register_00005223 = -(param_7[3] == cVar10);
    in_register_00005224 = -(param_7[4] == cVar11);
    in_register_00005225 = -(param_7[5] == cVar12);
    in_register_00005226 = -(param_7[6] == cVar13);
    in_register_00005227 = -(param_7[7] == cVar14);
    in_register_00005228 = -(param_7[8] == cVar15);
    in_register_00005229 = -(param_7[9] == cVar16);
    in_register_0000522a = -(param_7[10] == cVar17);
    in_register_0000522b = -(param_7[0xb] == cVar18);
    in_register_0000522c = -(param_7[0xc] == cVar19);
    in_register_0000522d = -(param_7[0xd] == cVar20);
    in_register_0000522e = -(param_7[0xe] == cVar21);
    in_register_0000522f = -(param_7[0xf] == cVar22);
    auVar1[1] = -(param_4[1] == cVar8);
    auVar1[0] = -(param_4[0] == cVar7);
    auVar1[2] = -(param_4[2] == cVar9);
    auVar1[3] = -(param_4[3] == cVar10);
    auVar1[4] = -(param_4[4] == cVar11);
    auVar1[5] = -(param_4[5] == cVar12);
    auVar1[6] = -(param_4[6] == cVar13);
    auVar1[7] = -(param_4[7] == cVar14);
    auVar1[8] = -(param_4[8] == cVar15);
    auVar1[9] = -(param_4[9] == cVar16);
    auVar1[10] = -(param_4[10] == cVar17);
    auVar1[0xb] = -(param_4[0xb] == cVar18);
    auVar1[0xc] = -(param_4[0xc] == cVar19);
    auVar1[0xd] = -(param_4[0xd] == cVar20);
    auVar1[0xe] = -(param_4[0xe] == cVar21);
    auVar1[0xf] = -(param_4[0xf] == cVar22);
    param_4 = param_4 ^ (param_4 ^ param_2) & auVar1;
    auVar2[1] = -(param_5[1] == cVar8);
    auVar2[0] = -(param_5[0] == cVar7);
    auVar2[2] = -(param_5[2] == cVar9);
    auVar2[3] = -(param_5[3] == cVar10);
    auVar2[4] = -(param_5[4] == cVar11);
    auVar2[5] = -(param_5[5] == cVar12);
    auVar2[6] = -(param_5[6] == cVar13);
    auVar2[7] = -(param_5[7] == cVar14);
    auVar2[8] = -(param_5[8] == cVar15);
    auVar2[9] = -(param_5[9] == cVar16);
    auVar2[10] = -(param_5[10] == cVar17);
    auVar2[0xb] = -(param_5[0xb] == cVar18);
    auVar2[0xc] = -(param_5[0xc] == cVar19);
    auVar2[0xd] = -(param_5[0xd] == cVar20);
    auVar2[0xe] = -(param_5[0xe] == cVar21);
    auVar2[0xf] = -(param_5[0xf] == cVar22);
    param_5 = param_5 ^ (param_5 ^ param_2) & auVar2;
    in_x9 = in_x9 + 4;
    in_x10 = in_x10 + 8;
  }
  if (unaff_x21 != param_1) {
    uVar5 = param_1;
    if ((unaff_x21 & 0x38) != 0) {
      uVar5 = unaff_x21 & 0x7ffffffffffffff8;
      do {
        uVar23 = *(ulong *)(unaff_x20 + param_1);
        *(ulong *)(unaff_x23 + param_1) =
             uVar23 ^ (uVar23 ^ CONCAT17(unaff_w24,
                                         CONCAT16(unaff_w24,
                                                  CONCAT15(unaff_w24,
                                                           CONCAT14(unaff_w24,
                                                                    CONCAT13(unaff_w24,
                                                                             CONCAT12(unaff_w24,
                                                                                      CONCAT11(
                                                  unaff_w24,unaff_w24)))))))) &
                      CONCAT17(-((char)(uVar23 >> 0x38) == '\n'),
                               CONCAT16(-((char)(uVar23 >> 0x30) == '\n'),
                                        CONCAT15(-((char)(uVar23 >> 0x28) == '\n'),
                                                 CONCAT14(-((char)(uVar23 >> 0x20) == '\n'),
                                                          CONCAT13(-((char)(uVar23 >> 0x18) == '\n')
                                                                   ,CONCAT12(-((char)(uVar23 >> 0x10
                                                                                     ) == '\n'),
                                                                             CONCAT11(-((char)(
                                                  uVar23 >> 8) == '\n'),-((char)uVar23 == '\n'))))))
                                       ));
        param_1 = param_1 + 8;
      } while (uVar5 != param_1);
      if (unaff_x21 == uVar5) goto LAB_0051225c;
    }
    do {
      cVar7 = unaff_w24;
      if (*(char *)(unaff_x20 + uVar5) != '\n') {
        cVar7 = *(char *)(unaff_x20 + uVar5);
      }
      *(char *)(unaff_x23 + uVar5) = cVar7;
      uVar5 = uVar5 + 1;
    } while (unaff_x21 != uVar5);
  }
LAB_0051225c:
  if (*unaff_x27 == 0) {
    *unaff_x27 = unaff_x21;
    unaff_x27[1] = unaff_x23;
    unaff_x27[2] = unaff_x21;
    if (in_stack_00000008 == 0) {
      return;
    }
    register0x00000008 = (BADSPACEBASE *)&uStack00000000000000e0;
    unaff_x29 = in_stack_000000d0;
    puVar6 = in_stack_000000d8;
  }
  else {
    puVar6 = &LAB_00512154;
  }
  *(undefined8 *)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined **)((long)register0x00000008 + -8) = puVar6;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}

