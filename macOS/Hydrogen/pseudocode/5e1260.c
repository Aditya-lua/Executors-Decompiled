
void FUN_005e1260(ulong param_1,long param_2,ulong param_3)

{
  ulong uVar1;
  code *pcVar2;
  int iVar3;
  ulong uVar4;
  long lVar5;
  ulong unaff_x19;
  ulong uVar6;
  ulong *unaff_x20;
  long unaff_x21;
  ulong unaff_x22;
  ulong unaff_x23;
  ulong *unaff_x24;
  ulong unaff_x25;
  long unaff_x26;
  ulong unaff_x27;
  long unaff_x28;
  long in_stack_00000008;
  ulong *in_stack_00000010;
  long in_stack_00000018;
  ulong in_stack_00000020;
  undefined8 uStack0000000000000028;
  ulong in_stack_00000030;
  ulong in_stack_00000038;
  long in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined8 uStack0000000000000058;
  ulong in_stack_00000060;
  ulong in_stack_00000068;
  ulong in_stack_00000070;
  ulong in_stack_00000078;
  undefined8 in_stack_000000d0;
  undefined8 in_stack_000000d8;
  
code_r0x005e1260:
  iVar3 = _memcmp(param_1,param_2,param_3);
  param_2 = unaff_x26;
  param_3 = unaff_x27;
  uVar1 = in_stack_00000020;
  uVar6 = uStack0000000000000028;
  if (iVar3 != 0) goto LAB_005e123c;
joined_r0x005e1274:
  param_3 = unaff_x25;
  uStack0000000000000028 = uVar6;
  if (uVar1 < unaff_x19) {
    lVar5 = unaff_x19 - uVar1;
    uVar4 = uVar1;
    do {
      uVar4 = uVar4 + 1;
      if (uVar4 < unaff_x19) {
        if (-0x41 < *(char *)(unaff_x21 + uVar4)) goto code_r0x005e118c;
      }
      else if (lVar5 == 1) {
        in_stack_00000020 = unaff_x19;
        goto code_r0x005e1198;
      }
      lVar5 = lVar5 + -1;
      if (lVar5 == 0) break;
    } while( true );
  }
  func_0x0046b8d0(&uStack0000000000000058,unaff_x22,unaff_x23);
  if ((uStack0000000000000058 & 1) == 0) {
code_r0x005e12dc:
    *unaff_x24 = uVar6;
    unaff_x24[1] = unaff_x22;
    unaff_x24[2] = unaff_x23;
    if (in_stack_00000040 == 0) {
      return;
    }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR__free_00a24e58)(in_stack_00000048,in_stack_00000040 << 4,8);
    return;
  }
  if (uVar6 == 0x8000000000000000) {
    uVar6 = unaff_x22;
    unaff_x22 = unaff_x23;
    unaff_x23 = in_stack_00000060;
    goto code_r0x005e12dc;
  }
  in_stack_00000078 = in_stack_00000068;
  in_stack_00000070 = in_stack_00000060;
  uStack0000000000000058 = uVar6;
  in_stack_00000060 = unaff_x22;
  in_stack_00000068 = unaff_x23;
  func_0x007a2810(&UNK_008b90e1,0x20,&uStack0000000000000058,&UNK_009f3378,&UNK_009f3438);
  goto code_r0x005e14a4;
code_r0x005e118c:
  in_stack_00000020 = uVar4;
code_r0x005e1198:
  unaff_x25 = in_stack_00000020 - uVar1;
  if ((in_stack_00000020 < uVar1) || ((uVar1 != 0 && (*(char *)(unaff_x21 + uVar1) < -0x40)))) {
code_r0x005e148c:
    func_0x007a297c();
code_r0x005e14a4:
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x5e14a8);
    (*pcVar2)();
  }
  if (uVar4 < unaff_x19) {
    if (*(char *)(unaff_x21 + in_stack_00000020) < -0x40) goto code_r0x005e148c;
  }
  else if (in_stack_00000020 != unaff_x19) goto code_r0x005e148c;
  param_2 = unaff_x21 + uVar1;
  if ((param_3 == unaff_x25) &&
     (iVar3 = _memcmp(unaff_x26,param_2,param_3), unaff_x20 = in_stack_00000010,
     unaff_x28 = in_stack_00000008, lVar5 = in_stack_00000018, iVar3 == 0)) {
    while (lVar5 != 0) {
      if (*unaff_x20 == param_3) {
        param_1 = unaff_x20[-1];
        unaff_x26 = param_2;
        unaff_x27 = param_3;
        goto code_r0x005e1260;
      }
LAB_005e123c:
      unaff_x20 = unaff_x20 + 2;
      unaff_x28 = unaff_x28 + -0x10;
      lVar5 = unaff_x28;
    }
  }
  if (uStack0000000000000028 - unaff_x23 < unaff_x25) {
    func_0x007afcf8(&uStack0000000000000028,unaff_x23,unaff_x25,1,1);
    unaff_x22 = in_stack_00000030;
    unaff_x23 = in_stack_00000038;
  }
  else {
  }
  _memcpy(unaff_x22 + unaff_x23,param_2,unaff_x25);
  unaff_x23 = unaff_x23 + unaff_x25;
  unaff_x26 = param_2;
  uVar1 = in_stack_00000020;
  uVar6 = uStack0000000000000028;
  in_stack_00000038 = unaff_x23;
  goto joined_r0x005e1274;
}

