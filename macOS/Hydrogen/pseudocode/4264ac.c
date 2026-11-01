
void FUN_004264ac(ulong *param_1,undefined8 param_2,long param_3)

{
  long lVar1;
  bool bVar2;
  ulong uVar3;
  undefined1 (*extraout_x8) [16];
  long lVar4;
  long unaff_x20;
  ulong unaff_x22;
  ulong uVar5;
  char *unaff_x23;
  ulong unaff_x24;
  undefined8 uVar6;
  undefined1 auVar7 [16];
  undefined1 uStack0000000000000008;
  short *in_stack_00000010;
  ulong in_stack_00000018;
  undefined2 uStack0000000000000078;
  undefined1 uStack000000000000007a;
  
  if (param_3 == 0) {
    uStack000000000000007a = false;
  }
  else {
    uStack000000000000007a = *unaff_x23 == '/';
  }
  uStack0000000000000078 = 0x200;
  func_0x004248f4(&uStack0000000000000008,(long)register0x00000008 + 0x40);
  if ((uStack0000000000000008 == '\t') &&
     ((in_stack_00000018 != 2 || (*in_stack_00000010 != 0x2e2e)))) {
    lVar4 = 0;
    do {
      if (in_stack_00000018 + lVar4 == 0) goto LAB_00426580;
      lVar1 = lVar4 + (in_stack_00000018 - 1);
      lVar4 = lVar4 + -1;
    } while (*(char *)((long)in_stack_00000010 + lVar1) != '.');
    if (in_stack_00000018 + lVar4 == 0) goto LAB_00426580;
    if ((~in_stack_00000018 + in_stack_00000018) - lVar4 <= unaff_x22) {
      lVar1 = unaff_x20 + unaff_x22 + lVar4;
      uVar5 = unaff_x22 + lVar4 + 1;
      goto LAB_00426588;
    }
    func_0x007a28b0();
  }
  else {
LAB_00426580:
    lVar1 = unaff_x20 + unaff_x22;
    uVar5 = unaff_x22;
LAB_00426588:
    unaff_x24 = lVar1 + 1;
    if (-1 < (long)unaff_x24) {
      if (unaff_x24 == 0) {
        uVar3 = 1;
        if (uVar5 == 0) goto LAB_004265e0;
      }
      else {
        uVar6 = 1;
        uVar3 = func_0x00187bd0(unaff_x24,1);
        if (uVar3 == 0) goto LAB_00426668;
        if (uVar5 <= unaff_x24) goto LAB_004265e0;
      }
      func_0x007a0000((long)register0x00000008 + 0x40,0,uVar5,1,1);
LAB_004265e0:
      _memcpy(uVar3);
      func_0x00425288((long)register0x00000008 + 0x40);
      param_1[1] = uVar3;
      *param_1 = unaff_x24;
      param_1[2] = uVar5;
      return;
    }
  }
  uVar6 = 0;
LAB_00426668:
  uVar6 = func_0x007a1f00(uVar6,unaff_x24,&UNK_009dab28);
  if (unaff_x23 != (char *)0x0) {
    func_0x00187bd4(unaff_x22,unaff_x23,1);
  }
  auVar7 = __Unwind_Resume(uVar6);
  if (auVar7._8_8_ == 0) {
    bVar2 = false;
  }
  else {
    bVar2 = *auVar7._0_8_ == '/';
  }
  *extraout_x8 = auVar7;
  extraout_x8[1][0] = 6;
  extraout_x8[3][10] = bVar2;
  *(undefined2 *)(extraout_x8[3] + 8) = 0x200;
  return;
}

