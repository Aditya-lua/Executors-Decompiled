
void FUN_005e1a8c(undefined8 param_1)

{
  long *plVar1;
  undefined1 auVar2 [16];
  code *pcVar3;
  ulong uVar4;
  ulong uVar5;
  ulong uVar6;
  ulong uVar7;
  long *plVar8;
  long lVar9;
  ulong uVar10;
  ulong unaff_x23;
  long unaff_x24;
  ulong unaff_x25;
  long *unaff_x26;
  long *plVar11;
  ulong uVar12;
  ulong uVar13;
  ushort uVar14;
  ulong *in_stack_00000000;
  undefined8 in_stack_00000020;
  undefined8 uStack0000000000000030;
  ulong uStack0000000000000040;
  undefined8 uStack0000000000000048;
  ulong in_stack_00000050;
  ulong in_stack_00000058;
  ulong in_stack_00000060;
  ulong in_stack_00000068;
  undefined8 in_stack_000000c0;
  undefined8 in_stack_000000c8;
  
  uVar4 = func_0x00187bd0(param_1,1);
  if (uVar4 == 0) {
    func_0x007a1f00();
LAB_005e1e04:
                    /* WARNING: Does not return */
    pcVar3 = (code *)SoftwareBreakpoint(1,0x5e1e08);
    (*pcVar3)();
  }
  uVar10 = 0;
  uVar13 = 0;
  uVar12 = 0;
  lVar9 = 0;
  uStack0000000000000040 = 0;
  plVar11 = (long *)unaff_x26[1];
  uVar7 = unaff_x26[2] & 0xfffffffffffffff8;
  plVar1 = plVar11 + uVar7;
  uVar5 = unaff_x26[2] & 7;
  uStack0000000000000030 = unaff_x23;
  do {
    uVar12 = uVar12 + 1;
    if ((unaff_x23 <= uVar12) || (-0x41 < *(char *)(unaff_x24 + uVar12))) {
      uVar6 = uVar7 ^ 0xfffffffffffffff8;
      plVar8 = plVar11;
      do {
        uVar6 = uVar6 + 8;
        if (uVar6 == 0) {
          if ((uVar5 == 0) ||
             ((*plVar1 != lVar9 &&
              ((uVar5 == 1 ||
               ((plVar1[1] != lVar9 &&
                ((uVar5 == 2 ||
                 ((plVar1[2] != lVar9 &&
                  ((uVar5 == 3 ||
                   ((plVar1[3] != lVar9 &&
                    ((uVar5 == 4 ||
                     ((plVar1[4] != lVar9 &&
                      ((uVar5 == 5 ||
                       ((plVar1[5] != lVar9 &&
                        ((uVar5 == 6 || ((plVar1[6] != lVar9 && (uVar5 == 7)))))))))))))))))))))))))
              ))) {
            uVar6 = uVar12 - uVar13;
            if ((uVar12 < uVar13) ||
               ((((uVar13 != 0 && (uVar13 < unaff_x23)) && (*(char *)(unaff_x24 + uVar13) < -0x40))
                || ((uVar12 < unaff_x23 && (*(char *)(unaff_x24 + uVar12) < -0x40)))))) {
              func_0x007a297c();
              goto LAB_005e1e04;
            }
            if (uStack0000000000000030 - uVar10 < uVar6) {
              func_0x007afcf8(&uStack0000000000000030,uVar10,uVar6,1,1);
              uVar10 = uStack0000000000000040;
            }
            _memcpy(uVar4 + uVar10,unaff_x24 + uVar13,uVar6);
            uStack0000000000000040 = uVar10 + uVar6;
            goto LAB_005e1b0c;
          }
          break;
        }
        auVar2._2_2_ = -(ushort)(plVar8[1] == lVar9);
        auVar2._0_2_ = -(ushort)(*plVar8 == lVar9);
        auVar2._4_2_ = -(ushort)(plVar8[2] == lVar9);
        auVar2._6_2_ = -(ushort)(plVar8[3] == lVar9);
        auVar2._8_2_ = -(ushort)(plVar8[4] == lVar9);
        auVar2._10_2_ = -(ushort)(plVar8[5] == lVar9);
        auVar2._12_2_ = -(ushort)(plVar8[6] == lVar9);
        auVar2._14_2_ = -(ushort)(plVar8[7] == lVar9);
        uVar14 = NEON_umaxv(auVar2,2);
        plVar8 = plVar8 + 8;
      } while ((uVar14 & 1) == 0);
      if (uStack0000000000000030 - uVar10 < unaff_x25) {
        func_0x007afcf8(&uStack0000000000000030,uVar10);
        uVar10 = uStack0000000000000040;
      }
      _memcpy(uVar4 + uVar10,in_stack_00000020);
      uStack0000000000000040 = uVar10 + unaff_x25;
LAB_005e1b0c:
      lVar9 = lVar9 + 1;
      uVar10 = uStack0000000000000040;
      uVar13 = uVar12;
    }
    uVar6 = uStack0000000000000030;
  } while (uVar12 != unaff_x23);
  func_0x0046b8d0(&uStack0000000000000048,uVar4,uVar10);
  uVar12 = uVar10;
  uVar13 = uVar4;
  if ((uStack0000000000000048 & 1) != 0) {
    if (uVar6 != 0x8000000000000000) {
      uStack0000000000000048 = uVar6;
      in_stack_00000068 = in_stack_00000058;
      in_stack_00000060 = in_stack_00000050;
      in_stack_00000050 = uVar4;
      in_stack_00000058 = uVar10;
      func_0x007a2810(&UNK_008b916f,0x24,&uStack0000000000000048,&UNK_009f3378,&UNK_009f3480);
      goto LAB_005e1e04;
    }
    uVar12 = in_stack_00000050;
    uVar13 = uVar10;
    uVar6 = uVar4;
  }
  *in_stack_00000000 = uVar6;
  in_stack_00000000[1] = uVar13;
  in_stack_00000000[2] = uVar12;
  if (*unaff_x26 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(unaff_x26[1],*unaff_x26 << 3,8);
  return;
}

