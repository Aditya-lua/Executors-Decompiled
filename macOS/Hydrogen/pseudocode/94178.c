
void FUN_00094178(long *param_1)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  ulong uVar5;
  ulong uVar6;
  ulong uVar7;
  ulong uVar8;
  ulong uVar9;
  long *plVar10;
  long lVar11;
  long in_x9;
  long *plVar12;
  ulong in_x10;
  ulong *puVar13;
  ulong uVar14;
  ulong in_x11;
  ulong uVar15;
  ulong in_x12;
  long in_x13;
  ulong in_x14;
  ulong uVar16;
  long unaff_x19;
  ulong unaff_x20;
  long unaff_x21;
  ulong *unaff_x22;
  ulong *unaff_x23;
  long *unaff_x26;
  long unaff_x27;
  ulong unaff_x28;
  long lVar17;
  long lVar18;
  long lVar19;
  long lVar20;
  long lVar21;
  long lVar22;
  long *in_stack_00000000;
  long *in_stack_00000008;
  long *in_stack_00000010;
  long in_stack_00000018;
  ulong in_stack_00000020;
  
  do {
    *param_1 = in_x13 + in_x10 + in_x12 +
               ((in_x14 >> 0x13 | in_x14 << 0x2d) ^ (in_x14 >> 0x3d | in_x14 << 3) ^ in_x14 >> 6);
    in_x9 = in_x9 + -1;
    param_1 = param_1 + 1;
    if (in_x9 == 0) {
      do {
        _memcpy();
        if (unaff_x20 != 0) {
          uVar14 = unaff_x22[4];
          uVar1 = *unaff_x22;
          uVar4 = unaff_x22[1];
          uVar2 = unaff_x22[6];
          uVar3 = unaff_x22[5];
          uVar5 = unaff_x22[2];
          uVar9 = unaff_x22[7];
          plVar10 = unaff_x26;
          puVar13 = unaff_x23;
          uVar15 = unaff_x20;
          uVar16 = unaff_x22[3];
          do {
            uVar8 = uVar5;
            uVar7 = uVar3;
            uVar6 = uVar2;
            uVar5 = uVar4;
            uVar4 = uVar1;
            uVar3 = uVar14;
            lVar11 = (uVar7 & uVar3) + uVar9 + (uVar6 & (uVar3 ^ 0xffffffffffffffff)) + *plVar10 +
                     *puVar13 +
                     ((uVar3 >> 0xe | uVar3 << 0x32) ^ (uVar3 >> 0x12 | uVar3 << 0x2e) ^
                     (uVar3 >> 0x29 | uVar3 << 0x17));
            uVar14 = uVar16 + lVar11;
            uVar1 = ((uVar4 >> 0x1c | uVar4 << 0x24) ^ (uVar4 >> 0x22 | uVar4 << 0x1e) ^
                    (uVar4 >> 0x27 | uVar4 << 0x19)) + ((uVar8 ^ uVar5) & uVar4 ^ uVar8 & uVar5) +
                    lVar11;
            uVar15 = uVar15 - 1;
            uVar2 = uVar7;
            uVar9 = uVar6;
            plVar10 = plVar10 + 1;
            puVar13 = puVar13 + 1;
            uVar16 = uVar8;
          } while (uVar15 != 0);
          unaff_x22[4] = uVar14;
          unaff_x22[5] = uVar3;
          unaff_x22[6] = uVar7;
          unaff_x22[7] = uVar6;
          *unaff_x22 = uVar1;
          unaff_x22[1] = uVar4;
          unaff_x22[2] = uVar5;
          unaff_x22[3] = uVar8;
        }
        if (unaff_x28 != 0) {
          if (unaff_x28 < 8) {
            uVar14 = 0;
          }
          else {
            plVar10 = in_stack_00000000;
            plVar12 = in_stack_00000008;
            uVar14 = in_stack_00000020;
            do {
              lVar11 = plVar10[-4];
              lVar18 = plVar10[-1];
              lVar17 = plVar10[-2];
              lVar20 = plVar10[1];
              lVar19 = *plVar10;
              lVar22 = plVar10[3];
              lVar21 = plVar10[2];
              plVar12[-3] = plVar12[-3] + plVar10[-3];
              plVar12[-4] = plVar12[-4] + lVar11;
              plVar12[-1] = plVar12[-1] + lVar18;
              plVar12[-2] = plVar12[-2] + lVar17;
              plVar12[1] = plVar12[1] + lVar20;
              *plVar12 = *plVar12 + lVar19;
              plVar12[3] = plVar12[3] + lVar22;
              plVar12[2] = plVar12[2] + lVar21;
              uVar14 = uVar14 - 8;
              plVar10 = plVar10 + 8;
              plVar12 = plVar12 + 8;
            } while (uVar14 != 0);
            uVar14 = in_stack_00000020;
            if (unaff_x28 == in_stack_00000020) goto LAB_00094130;
          }
          lVar11 = unaff_x28 - uVar14;
          plVar10 = (long *)(unaff_x19 + uVar14 * 8);
          puVar13 = unaff_x22 + uVar14;
          do {
            *plVar10 = *plVar10 + *puVar13;
            lVar11 = lVar11 + -1;
            plVar10 = plVar10 + 1;
            puVar13 = puVar13 + 1;
          } while (lVar11 != 0);
        }
LAB_00094130:
        unaff_x27 = unaff_x27 + 1;
        if (unaff_x27 == unaff_x21) {
          __ZdaPv();
                    /* WARNING: Could not recover jumptable at 0x007b2f5c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          (*(code *)PTR___ZdaPv_009b01b0)();
          return;
        }
        _memcpy();
      } while (unaff_x20 < 0x11);
      in_x11 = *unaff_x23;
      param_1 = in_stack_00000010;
      in_x9 = in_stack_00000018;
    }
    uVar14 = param_1[-0xf];
    in_x12 = (uVar14 >> 1 | uVar14 << 0x3f) ^ (uVar14 >> 8 | uVar14 << 0x38) ^ uVar14 >> 7;
    in_x13 = param_1[-7];
    in_x14 = param_1[-2];
    in_x10 = in_x11;
    in_x11 = uVar14;
  } while( true );
}

