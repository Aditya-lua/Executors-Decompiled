
void FUN_0042799c(long param_1)

{
  uint uVar1;
  code *pcVar2;
  int iVar3;
  int iVar4;
  long lVar5;
  uint *puVar6;
  int *unaff_x19;
  long *unaff_x20;
  undefined1 auVar7 [16];
  undefined8 uStack0000000000000008;
  long in_stack_00000010;
  long in_stack_00000018;
  undefined8 uStack0000000000000020;
  long in_stack_00000028;
  long in_stack_00000030;
  undefined8 uStack0000000000000038;
  undefined8 uStack0000000000000040;
  undefined8 in_stack_00000050;
  undefined8 in_stack_00000058;
  undefined8 in_stack_00000060;
  undefined8 in_stack_00000068;
  
  iVar3 = *(int *)(param_1 + 0xc);
  unaff_x19[3] = -1;
  if (iVar3 != -1) {
    _close();
  }
  uStack0000000000000008 = 0;
  in_stack_00000010 = 1;
  in_stack_00000018 = 0;
  uStack0000000000000020 = 0;
  in_stack_00000028 = 1;
  in_stack_00000030 = 0;
  iVar3 = unaff_x19[4];
  iVar4 = unaff_x19[5];
  unaff_x19[4] = -1;
  unaff_x19[5] = -1;
  if (iVar3 == -1) {
    if (iVar4 == -1) goto LAB_00427a64;
    uStack0000000000000038._4_4_ = iVar4;
    auVar7 = func_0x00430c40((long)&uStack0000000000000038 + 4,&uStack0000000000000020);
    iVar3 = iVar4;
    if ((auVar7._0_8_ & 1) != 0) {
      uStack0000000000000040 = auVar7._8_8_;
      func_0x007a2810(&UNK_008851be,0x2b,&uStack0000000000000040,&UNK_009d93d8,&UNK_009dabf0);
      goto code_r0x00427b90;
    }
  }
  else {
    if (iVar4 != -1) {
      lVar5 = func_0x0042f860(iVar3,&uStack0000000000000008,iVar4,&uStack0000000000000020);
      if (lVar5 == 0) goto LAB_00427a64;
      uStack0000000000000040 = lVar5;
      func_0x007a2810(&UNK_008851be,0x2b,&uStack0000000000000040,&UNK_009d93d8,&UNK_009dac20);
code_r0x00427b90:
                    /* WARNING: Does not return */
      pcVar2 = (code *)SoftwareBreakpoint(1,0x427b94);
      (*pcVar2)();
    }
    uStack0000000000000038._4_4_ = iVar3;
    auVar7 = func_0x00430c40((long)&uStack0000000000000038 + 4,&uStack0000000000000008);
    if ((auVar7._0_8_ & 1) != 0) {
      uStack0000000000000040 = auVar7._8_8_;
      func_0x007a2810(&UNK_008851be,0x2b,&uStack0000000000000040,&UNK_009d93d8,&UNK_009dac08);
      goto code_r0x00427b90;
    }
  }
  _close(iVar3);
LAB_00427a64:
  unaff_x19[3] = -1;
  if (*unaff_x19 == 1) {
    uStack0000000000000040._0_4_ = unaff_x19[1];
code_r0x00427afc:
    unaff_x20[1] = in_stack_00000010;
    *unaff_x20 = uStack0000000000000008;
    unaff_x20[3] = uStack0000000000000020;
    unaff_x20[2] = in_stack_00000018;
    unaff_x20[5] = in_stack_00000030;
    unaff_x20[4] = in_stack_00000028;
    *(int *)(unaff_x20 + 6) = (int)uStack0000000000000040;
  }
  else {
    uStack0000000000000040 = uStack0000000000000040 & 0xffffffff00000000;
    iVar3 = unaff_x19[2];
    do {
      iVar4 = _waitpid(iVar3,&uStack0000000000000040,0);
      if (iVar4 != -1) {
        *unaff_x19 = 1;
        unaff_x19[1] = (int)uStack0000000000000040;
        goto code_r0x00427afc;
      }
      puVar6 = (uint *)___error();
      uVar1 = *puVar6;
    } while (uVar1 == 4);
    *unaff_x20 = -0x8000000000000000;
    unaff_x20[1] = (ulong)uVar1 << 0x20 | 2;
    if (uStack0000000000000020 != 0) {
      func_0x00187bd4(in_stack_00000028,uStack0000000000000020,1);
    }
    if (uStack0000000000000008 != 0) {
      func_0x00187bd4(in_stack_00000010,uStack0000000000000008,1);
    }
  }
  return;
}

