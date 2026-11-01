
void FUN_0051f9e8(long *param_1,undefined8 *param_2)

{
  long lVar1;
  undefined8 uVar2;
  long lVar3;
  long lVar4;
  code *pcVar5;
  int iVar6;
  long lVar7;
  undefined8 *puVar8;
  long lVar9;
  long lVar10;
  ulong uVar11;
  long lVar12;
  long lVar13;
  long *plStack0000000000000008;
  undefined8 uStack0000000000000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 uStack0000000000000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 uStack0000000000000048;
  undefined *in_stack_00000050;
  undefined8 in_stack_00000058;
  
  lVar1 = *param_1;
  lVar3 = param_1[1];
  plStack0000000000000008 = (long *)*param_2;
  lVar10 = param_2[1];
  if (lVar1 != lVar3) {
    uVar11 = 0;
    lVar12 = param_2[2];
    lVar13 = param_1[2];
    do {
      lVar7 = *(long *)(lVar13 + 0x90);
      if (lVar7 == 0) {
LAB_0051fb24:
        func_0x007a23bc(&UNK_009ea400);
code_r0x0051fb30:
                    /* WARNING: Does not return */
        pcVar5 = (code *)SoftwareBreakpoint(1,0x51fb34);
        (*pcVar5)();
      }
      lVar9 = *(long *)(lVar13 + 0x88);
      puVar8 = (undefined8 *)(lVar1 + uVar11 * 0x10);
      uVar2 = *puVar8;
      lVar4 = puVar8[1];
      lVar7 = lVar7 * 600;
      while ((*(long *)(lVar9 + 0x220) != lVar4 ||
             (iVar6 = _memcmp(*(undefined8 *)(lVar9 + 0x218),uVar2,lVar4), iVar6 != 0))) {
        lVar9 = lVar9 + 600;
        lVar7 = lVar7 + -600;
        if (lVar7 == 0) goto LAB_0051fb24;
      }
      uStack0000000000000030 = 0;
      in_stack_00000038 = 1;
      in_stack_00000058 = 0xe0000020;
      uStack0000000000000048 = &uStack0000000000000030;
      in_stack_00000040 = 0;
      in_stack_00000050 = &UNK_009ea330;
      iVar6 = func_0x0050f9f0(lVar9,&uStack0000000000000048);
      if (iVar6 != 0) {
        func_0x007a2810(&UNK_008a74c0,0x37,&uStack0000000000000010,&UNK_009ea378,&UNK_009ea360);
        goto code_r0x0051fb30;
      }
      in_stack_00000018 = in_stack_00000038;
      uStack0000000000000010 = uStack0000000000000030;
      in_stack_00000020 = in_stack_00000040;
      puVar8 = (undefined8 *)(lVar12 + lVar10 * 0x18);
      puVar8[1] = in_stack_00000038;
      *puVar8 = uStack0000000000000030;
      puVar8[2] = in_stack_00000040;
      lVar10 = lVar10 + 1;
      uVar11 = uVar11 + 1;
    } while (uVar11 != (ulong)(lVar3 - lVar1) >> 4);
  }
  *plStack0000000000000008 = lVar10;
  return;
}

