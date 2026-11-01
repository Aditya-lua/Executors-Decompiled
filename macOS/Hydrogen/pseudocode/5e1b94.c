
void FUN_005e1b94(long param_1)

{
  undefined1 auVar1 [16];
  ulong uVar2;
  code *pcVar3;
  long lVar4;
  long *plVar5;
  long unaff_x20;
  ulong unaff_x21;
  ulong uVar6;
  ulong unaff_x22;
  ulong uVar7;
  ulong unaff_x23;
  ulong uVar8;
  long unaff_x24;
  ulong unaff_x25;
  long *unaff_x26;
  ulong unaff_x27;
  ulong unaff_x28;
  ushort uVar9;
  ulong *in_stack_00000000;
  long *in_stack_00000008;
  long *in_stack_00000010;
  long in_stack_00000018;
  undefined8 in_stack_00000020;
  long in_stack_00000028;
  undefined8 uStack0000000000000030;
  ulong in_stack_00000038;
  ulong in_stack_00000040;
  undefined8 uStack0000000000000048;
  ulong in_stack_00000050;
  ulong in_stack_00000058;
  ulong in_stack_00000060;
  ulong in_stack_00000068;
  undefined8 in_stack_000000c0;
  undefined8 in_stack_000000c8;
  
code_r0x005e1b94:
  if (param_1 != 1) {
    if (in_stack_00000010[1] == unaff_x20) goto LAB_005e1ae0;
    if (in_stack_00000018 != 2) {
      if (in_stack_00000010[2] == unaff_x20) goto LAB_005e1ae0;
      if (in_stack_00000018 != 3) {
        if (in_stack_00000010[3] == unaff_x20) goto LAB_005e1ae0;
        if (in_stack_00000018 != 4) {
          if (in_stack_00000010[4] == unaff_x20) goto LAB_005e1ae0;
          if (in_stack_00000018 != 5) {
            if (in_stack_00000010[5] == unaff_x20) goto LAB_005e1ae0;
            if (in_stack_00000018 != 6) {
              if (in_stack_00000010[6] == unaff_x20) goto LAB_005e1ae0;
              if (in_stack_00000018 != 7) goto LAB_005e1ae0;
            }
          }
        }
      }
    }
  }
LAB_005e1b9c:
  uVar8 = unaff_x27 - unaff_x28;
  if ((unaff_x27 < unaff_x28) ||
     ((((unaff_x28 != 0 && (unaff_x28 < unaff_x23)) && (*(char *)(unaff_x24 + unaff_x28) < -0x40))
      || ((unaff_x27 < unaff_x23 && (*(char *)(unaff_x24 + unaff_x27) < -0x40)))))) {
    func_0x007a297c();
LAB_005e1e04:
                    /* WARNING: Does not return */
    pcVar3 = (code *)SoftwareBreakpoint(1,0x5e1e08);
    (*pcVar3)();
  }
  if (uStack0000000000000030 - unaff_x21 < uVar8) {
    func_0x007afcf8(&uStack0000000000000030,unaff_x21,uVar8,1,1);
    unaff_x21 = in_stack_00000040;
    unaff_x22 = in_stack_00000038;
  }
  _memcpy(unaff_x22 + unaff_x21,unaff_x24 + unaff_x28,uVar8);
  in_stack_00000040 = unaff_x21 + uVar8;
  unaff_x28 = unaff_x27;
  do {
    uVar2 = in_stack_00000040;
    uVar8 = uStack0000000000000030;
    unaff_x20 = unaff_x20 + 1;
    unaff_x27 = unaff_x28;
    do {
      if (unaff_x27 == unaff_x23) {
        func_0x0046b8d0(&uStack0000000000000048,unaff_x22,in_stack_00000040);
        uVar6 = uVar2;
        uVar7 = unaff_x22;
        if ((uStack0000000000000048 & 1) != 0) {
          if (uVar8 != 0x8000000000000000) {
            uStack0000000000000048 = uVar8;
            in_stack_00000068 = in_stack_00000058;
            in_stack_00000060 = in_stack_00000050;
            in_stack_00000050 = unaff_x22;
            in_stack_00000058 = uVar2;
            func_0x007a2810(&UNK_008b916f,0x24,&uStack0000000000000048,&UNK_009f3378,&UNK_009f3480);
            goto LAB_005e1e04;
          }
          uVar6 = in_stack_00000050;
          uVar7 = uVar2;
          uVar8 = unaff_x22;
        }
        *in_stack_00000000 = uVar8;
        in_stack_00000000[1] = uVar7;
        in_stack_00000000[2] = uVar6;
        if (*in_stack_00000008 == 0) {
          return;
        }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(code *)PTR__free_00a24e58)(in_stack_00000008[1],*in_stack_00000008 << 3,8);
        return;
      }
      unaff_x27 = unaff_x27 + 1;
    } while ((unaff_x27 < unaff_x23) && (*(char *)(unaff_x24 + unaff_x27) < -0x40));
    lVar4 = in_stack_00000028;
    plVar5 = unaff_x26;
    do {
      lVar4 = lVar4 + 8;
      unaff_x21 = in_stack_00000040;
      if (lVar4 == 0) {
        if (in_stack_00000018 == 0) goto LAB_005e1b9c;
        if (*in_stack_00000010 != unaff_x20) {
          param_1 = in_stack_00000018;
          goto code_r0x005e1b94;
        }
        break;
      }
      auVar1._2_2_ = -(ushort)(plVar5[1] == unaff_x20);
      auVar1._0_2_ = -(ushort)(*plVar5 == unaff_x20);
      auVar1._4_2_ = -(ushort)(plVar5[2] == unaff_x20);
      auVar1._6_2_ = -(ushort)(plVar5[3] == unaff_x20);
      auVar1._8_2_ = -(ushort)(plVar5[4] == unaff_x20);
      auVar1._10_2_ = -(ushort)(plVar5[5] == unaff_x20);
      auVar1._12_2_ = -(ushort)(plVar5[6] == unaff_x20);
      auVar1._14_2_ = -(ushort)(plVar5[7] == unaff_x20);
      uVar9 = NEON_umaxv(auVar1,2);
      plVar5 = plVar5 + 8;
    } while ((uVar9 & 1) == 0);
LAB_005e1ae0:
    if (uStack0000000000000030 - unaff_x21 < unaff_x25) {
      func_0x007afcf8(&uStack0000000000000030,unaff_x21);
      unaff_x21 = in_stack_00000040;
      unaff_x22 = in_stack_00000038;
    }
    _memcpy(unaff_x22 + unaff_x21,in_stack_00000020);
    in_stack_00000040 = unaff_x21 + unaff_x25;
    unaff_x28 = unaff_x27;
  } while( true );
}

