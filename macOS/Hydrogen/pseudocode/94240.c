
void FUN_00094240(ulong param_1,ulong param_2,long param_3)

{
  ulong uVar1;
  ulong in_x5;
  long *plVar2;
  long lVar3;
  long *in_x9;
  long *plVar4;
  ulong *puVar5;
  ulong *in_x10;
  ulong uVar6;
  ulong in_x11;
  ulong in_x12;
  ulong in_x13;
  ulong uVar7;
  ulong in_x14;
  ulong in_x15;
  ulong in_x16;
  long in_x17;
  long unaff_x19;
  ulong unaff_x20;
  long unaff_x21;
  ulong *unaff_x22;
  ulong *unaff_x23;
  long *unaff_x26;
  long unaff_x27;
  ulong unaff_x28;
  long lVar8;
  long lVar9;
  long lVar10;
  long lVar11;
  long lVar12;
  long lVar13;
  long *in_stack_00000000;
  long *in_stack_00000008;
  long *in_stack_00000010;
  long in_stack_00000018;
  ulong in_stack_00000020;
  
  do {
    uVar6 = param_2;
    uVar1 = in_x17 + param_3;
    in_x11 = in_x11 - 1;
    plVar2 = in_x9;
    puVar5 = in_x10;
    if (in_x11 == 0) {
      unaff_x22[4] = uVar6;
      unaff_x22[5] = in_x16;
      unaff_x22[6] = in_x15;
      unaff_x22[7] = param_1;
      *unaff_x22 = uVar1;
      unaff_x22[1] = in_x14;
      unaff_x22[2] = in_x13;
      unaff_x22[3] = in_x12;
      do {
        if (unaff_x28 != 0) {
          if (unaff_x28 < 8) {
            uVar1 = 0;
          }
          else {
            plVar2 = in_stack_00000000;
            plVar4 = in_stack_00000008;
            uVar1 = in_stack_00000020;
            do {
              lVar3 = plVar2[-4];
              lVar9 = plVar2[-1];
              lVar8 = plVar2[-2];
              lVar11 = plVar2[1];
              lVar10 = *plVar2;
              lVar13 = plVar2[3];
              lVar12 = plVar2[2];
              plVar4[-3] = plVar4[-3] + plVar2[-3];
              plVar4[-4] = plVar4[-4] + lVar3;
              plVar4[-1] = plVar4[-1] + lVar9;
              plVar4[-2] = plVar4[-2] + lVar8;
              plVar4[1] = plVar4[1] + lVar11;
              *plVar4 = *plVar4 + lVar10;
              plVar4[3] = plVar4[3] + lVar13;
              plVar4[2] = plVar4[2] + lVar12;
              uVar1 = uVar1 - 8;
              plVar2 = plVar2 + 8;
              plVar4 = plVar4 + 8;
            } while (uVar1 != 0);
            uVar1 = in_stack_00000020;
            if (unaff_x28 == in_stack_00000020) goto LAB_00094130;
          }
          lVar3 = unaff_x28 - uVar1;
          plVar2 = (long *)(unaff_x19 + uVar1 * 8);
          puVar5 = unaff_x22 + uVar1;
          do {
            *plVar2 = *plVar2 + *puVar5;
            lVar3 = lVar3 + -1;
            plVar2 = plVar2 + 1;
            puVar5 = puVar5 + 1;
          } while (lVar3 != 0);
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
        if (0x10 < unaff_x20) {
          plVar2 = in_stack_00000010;
          lVar3 = in_stack_00000018;
          uVar1 = *unaff_x23;
          do {
            uVar6 = plVar2[-0xf];
            uVar7 = plVar2[-2];
            *plVar2 = plVar2[-7] + uVar1 +
                      ((uVar6 >> 1 | uVar6 << 0x3f) ^ (uVar6 >> 8 | uVar6 << 0x38) ^ uVar6 >> 7) +
                      ((uVar7 >> 0x13 | uVar7 << 0x2d) ^ (uVar7 >> 0x3d | uVar7 << 3) ^ uVar7 >> 6);
            lVar3 = lVar3 + -1;
            plVar2 = plVar2 + 1;
            uVar1 = uVar6;
          } while (lVar3 != 0);
        }
        _memcpy();
      } while (unaff_x20 == 0);
      uVar6 = unaff_x22[4];
      in_x16 = unaff_x22[5];
      in_x15 = unaff_x22[6];
      param_1 = unaff_x22[7];
      uVar1 = *unaff_x22;
      in_x14 = unaff_x22[1];
      in_x13 = unaff_x22[2];
      in_x5 = unaff_x22[3];
      plVar2 = unaff_x26;
      puVar5 = unaff_x23;
      in_x11 = unaff_x20;
    }
    in_x9 = plVar2 + 1;
    in_x10 = puVar5 + 1;
    param_3 = (in_x16 & uVar6) + param_1 + (in_x15 & (uVar6 ^ 0xffffffffffffffff)) + *plVar2 +
              *puVar5 + ((uVar6 >> 0xe | uVar6 << 0x32) ^ (uVar6 >> 0x12 | uVar6 << 0x2e) ^
                        (uVar6 >> 0x29 | uVar6 << 0x17));
    in_x17 = ((uVar1 >> 0x1c | uVar1 << 0x24) ^ (uVar1 >> 0x22 | uVar1 << 0x1e) ^
             (uVar1 >> 0x27 | uVar1 << 0x19)) + ((in_x13 ^ in_x14) & uVar1 ^ in_x13 & in_x14);
    param_2 = in_x5 + param_3;
    in_x5 = in_x13;
    param_1 = in_x15;
    in_x12 = in_x13;
    in_x13 = in_x14;
    in_x14 = uVar1;
    in_x15 = in_x16;
    in_x16 = uVar6;
  } while( true );
}

