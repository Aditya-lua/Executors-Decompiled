
void FUN_0051fab4(undefined8 param_1,undefined1 param_2 [16])

{
  long lVar1;
  code *pcVar2;
  int iVar3;
  undefined8 *puVar4;
  long lVar5;
  long lVar6;
  long unaff_x23;
  long unaff_x24;
  long unaff_x25;
  long unaff_x26;
  long unaff_x27;
  long unaff_x28;
  undefined8 uVar7;
  undefined8 uVar8;
  long *in_stack_00000008;
  undefined8 uStack0000000000000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 uStack0000000000000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 uStack0000000000000048;
  undefined *in_stack_00000050;
  undefined8 in_stack_00000058;
  
  uVar8 = param_2._8_8_;
  uVar7 = param_2._0_8_;
  do {
    puVar4 = (undefined8 *)(unaff_x26 + unaff_x23 * 0x18);
    puVar4[1] = uVar8;
    *puVar4 = uVar7;
    puVar4[2] = param_1;
    unaff_x23 = unaff_x23 + 1;
    unaff_x25 = unaff_x25 + 1;
    if (unaff_x25 == unaff_x28) {
      *in_stack_00000008 = unaff_x23;
      return;
    }
    if (*(long *)(unaff_x27 + 0x90) == 0) {
code_r0x0051fb24:
      func_0x007a23bc(&UNK_009ea400);
code_r0x0051fb30:
                    /* WARNING: Does not return */
      pcVar2 = (code *)SoftwareBreakpoint(1,0x51fb34);
      (*pcVar2)();
    }
    lVar5 = *(long *)(unaff_x27 + 0x88);
    puVar4 = (undefined8 *)(unaff_x24 + unaff_x25 * 0x10);
    uVar7 = *puVar4;
    lVar1 = puVar4[1];
    lVar6 = *(long *)(unaff_x27 + 0x90) * 600;
    while ((*(long *)(lVar5 + 0x220) != lVar1 ||
           (iVar3 = _memcmp(*(undefined8 *)(lVar5 + 0x218),uVar7,lVar1), iVar3 != 0))) {
      lVar5 = lVar5 + 600;
      lVar6 = lVar6 + -600;
      if (lVar6 == 0) goto code_r0x0051fb24;
    }
    uStack0000000000000030 = 0;
    in_stack_00000038 = 1;
    in_stack_00000058 = 0xe0000020;
    uStack0000000000000048 = &uStack0000000000000030;
    in_stack_00000040 = 0;
    in_stack_00000050 = &UNK_009ea330;
    iVar3 = func_0x0050f9f0(lVar5,&uStack0000000000000048);
    if (iVar3 != 0) {
      func_0x007a2810(&UNK_008a74c0,0x37,&uStack0000000000000010,&UNK_009ea378,&UNK_009ea360);
      goto code_r0x0051fb30;
    }
    in_stack_00000018 = in_stack_00000038;
    uStack0000000000000010 = uStack0000000000000030;
    in_stack_00000020 = in_stack_00000040;
    param_1 = in_stack_00000040;
    uVar7 = uStack0000000000000030;
    uVar8 = in_stack_00000038;
  } while( true );
}

