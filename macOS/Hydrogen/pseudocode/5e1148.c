
void FUN_005e1148(void)

{
  long lVar1;
  ulong uVar2;
  ulong *puVar3;
  long lVar4;
  code *pcVar5;
  int iVar6;
  ulong uVar7;
  long lVar8;
  ulong uVar9;
  ulong unaff_x19;
  ulong uVar10;
  ulong *unaff_x20;
  long unaff_x21;
  ulong unaff_x22;
  ulong unaff_x23;
  ulong unaff_x24;
  long unaff_x26;
  long in_stack_00000008;
  ulong *in_stack_00000010;
  long in_stack_00000018;
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
  
  uVar10 = 1;
LAB_005e114c:
  lVar8 = unaff_x19 - unaff_x24;
  uVar7 = unaff_x24;
  do {
    uVar7 = uVar7 + 1;
    if (uVar7 < unaff_x19) {
      if (-0x41 < *(char *)(unaff_x21 + uVar7)) break;
    }
    else if (lVar8 == 1) {
      uVar9 = unaff_x19;
      goto LAB_005e1198;
    }
    lVar8 = lVar8 + -1;
    if (lVar8 == 0) goto LAB_005e12a4;
  } while( true );
  uVar9 = uVar7;
LAB_005e1198:
  uVar2 = uVar9 - unaff_x24;
  if ((unaff_x24 <= uVar9) && ((unaff_x24 == 0 || (-0x41 < *(char *)(unaff_x21 + unaff_x24))))) {
    if (uVar7 < unaff_x19) {
      if (-0x41 < *(char *)(unaff_x21 + uVar9)) {
LAB_005e11d8:
        lVar8 = unaff_x21 + unaff_x24;
        if ((uVar10 == uVar2) &&
           (iVar6 = _memcmp(unaff_x26,lVar8,uVar10), puVar3 = in_stack_00000010,
           lVar1 = in_stack_00000008, lVar4 = in_stack_00000018, iVar6 == 0)) {
          while (lVar4 != 0) {
            if ((*puVar3 == uVar10) && (iVar6 = _memcmp(puVar3[-1],lVar8,uVar10), iVar6 == 0))
            goto joined_r0x005e1274;
            lVar1 = lVar1 + -0x10;
            puVar3 = puVar3 + 2;
            lVar4 = lVar1;
          }
        }
        if (uStack0000000000000028 - unaff_x23 < uVar2) {
          func_0x007afcf8(&uStack0000000000000028,unaff_x23,uVar2,1,1);
          unaff_x22 = in_stack_00000030;
          unaff_x23 = in_stack_00000038;
        }
        else {
        }
        _memcpy(unaff_x22 + unaff_x23,lVar8,uVar2);
        unaff_x23 = unaff_x23 + uVar2;
        in_stack_00000038 = unaff_x23;
joined_r0x005e1274:
        unaff_x24 = uVar9;
        uVar10 = uVar2;
        unaff_x26 = lVar8;
        if (unaff_x19 <= uVar9) {
LAB_005e12a4:
          uVar10 = uStack0000000000000028;
          func_0x0046b8d0(&uStack0000000000000058,unaff_x22,unaff_x23);
          if ((uStack0000000000000058 & 1) != 0) {
            if (uVar10 != 0x8000000000000000) {
              uStack0000000000000058 = uVar10;
              in_stack_00000078 = in_stack_00000068;
              in_stack_00000070 = in_stack_00000060;
              in_stack_00000060 = unaff_x22;
              in_stack_00000068 = unaff_x23;
              func_0x007a2810(&UNK_008b90e1,0x20,&uStack0000000000000058,&UNK_009f3378,&UNK_009f3438
                             );
code_r0x005e14a4:
                    /* WARNING: Does not return */
              pcVar5 = (code *)SoftwareBreakpoint(1,0x5e14a8);
              (*pcVar5)();
            }
            uVar10 = unaff_x22;
            unaff_x22 = unaff_x23;
            unaff_x23 = in_stack_00000060;
          }
          *unaff_x20 = uVar10;
          unaff_x20[1] = unaff_x22;
          unaff_x20[2] = unaff_x23;
          if (in_stack_00000040 == 0) {
            return;
          }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
          (*(code *)PTR__free_00a24e58)(in_stack_00000048,in_stack_00000040 << 4,8);
          return;
        }
        goto LAB_005e114c;
      }
    }
    else if (uVar9 == unaff_x19) goto LAB_005e11d8;
  }
  func_0x007a297c();
  goto code_r0x005e14a4;
}

