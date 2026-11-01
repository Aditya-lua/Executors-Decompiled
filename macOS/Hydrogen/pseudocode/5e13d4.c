
void FUN_005e13d4(ulong param_1,long param_2)

{
  ulong uVar1;
  code *pcVar2;
  undefined1 in_ZR;
  int iVar3;
  ulong uVar4;
  long lVar5;
  ulong uVar6;
  ulong unaff_x19;
  ulong *unaff_x20;
  long unaff_x21;
  ulong unaff_x22;
  ulong unaff_x23;
  ulong unaff_x24;
  ulong unaff_x25;
  long unaff_x26;
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
  
code_r0x005e13d4:
  if ((!(bool)in_ZR) || (iVar3 = _memcmp(param_2,unaff_x26,param_1), iVar3 != 0)) {
    if (uStack0000000000000028 - unaff_x23 < unaff_x25) {
      func_0x007afcf8(&uStack0000000000000028,unaff_x23,unaff_x25,1,1);
      unaff_x22 = in_stack_00000030;
      unaff_x23 = in_stack_00000038;
    }
    _memcpy(unaff_x22 + unaff_x23,unaff_x26,unaff_x25);
    unaff_x23 = unaff_x23 + unaff_x25;
    in_stack_00000038 = unaff_x23;
  }
  uVar6 = uStack0000000000000028;
  if (unaff_x24 < unaff_x19) {
    lVar5 = unaff_x19 - unaff_x24;
    uVar4 = unaff_x24;
    do {
      uVar4 = uVar4 + 1;
      if (uVar4 < unaff_x19) {
        if (-0x41 < *(char *)(unaff_x21 + uVar4)) goto code_r0x005e1388;
      }
      else if (lVar5 == 1) {
        uVar6 = unaff_x19;
        goto code_r0x005e1394;
      }
      lVar5 = lVar5 + -1;
      if (lVar5 == 0) break;
    } while( true );
  }
  func_0x0046b8d0(&uStack0000000000000058,unaff_x22,unaff_x23);
  if ((uStack0000000000000058 & 1) != 0) {
    if (uVar6 != 0x8000000000000000) {
      uStack0000000000000058 = uVar6;
      in_stack_00000078 = in_stack_00000068;
      in_stack_00000070 = in_stack_00000060;
      in_stack_00000060 = unaff_x22;
      in_stack_00000068 = unaff_x23;
      func_0x007a2810(&UNK_008b90e1,0x20,&uStack0000000000000058,&UNK_009f3378,&UNK_009f3438);
      goto code_r0x005e14a4;
    }
    uVar6 = unaff_x22;
    unaff_x22 = unaff_x23;
    unaff_x23 = in_stack_00000060;
  }
  *unaff_x20 = uVar6;
  unaff_x20[1] = unaff_x22;
  unaff_x20[2] = unaff_x23;
  if (in_stack_00000040 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(in_stack_00000048,in_stack_00000040 << 4,8);
  return;
code_r0x005e1388:
  uVar6 = uVar4;
code_r0x005e1394:
  uVar1 = uVar6 - unaff_x24;
  if ((uVar6 < unaff_x24) || ((unaff_x24 != 0 && (*(char *)(unaff_x21 + unaff_x24) < -0x40)))) {
code_r0x005e1488:
    func_0x007a297c();
code_r0x005e14a4:
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x5e14a8);
    (*pcVar2)();
  }
  if (uVar4 < unaff_x19) {
    if (*(char *)(unaff_x21 + uVar6) < -0x40) goto code_r0x005e1488;
  }
  else if (uVar6 != unaff_x19) goto code_r0x005e1488;
  lVar5 = unaff_x21 + unaff_x24;
  in_ZR = unaff_x25 == uVar1;
  param_2 = unaff_x26;
  param_1 = unaff_x25;
  unaff_x24 = uVar6;
  unaff_x25 = uVar1;
  unaff_x26 = lVar5;
  goto code_r0x005e13d4;
}

