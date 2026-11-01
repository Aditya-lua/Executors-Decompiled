
void FUN_004e64dc(int param_1)

{
  code *pcVar1;
  int iVar2;
  long *plVar3;
  undefined8 *unaff_x19;
  long unaff_x20;
  long lVar4;
  long unaff_x21;
  long lVar5;
  long unaff_x23;
  undefined8 unaff_x24;
  ulong uVar6;
  undefined8 *unaff_x26;
  undefined8 *puVar7;
  undefined8 *unaff_x27;
  long unaff_x28;
  long in_stack_00000000;
  long in_stack_00000008;
  long in_stack_00000010;
  long *in_stack_00000018;
  long *in_stack_00000020;
  undefined8 uStack0000000000000028;
  long in_stack_00000030;
  long in_stack_00000038;
  
code_r0x004e64dc:
  if (param_1 != 0) goto LAB_004e64b4;
  if ((*(byte *)(unaff_x19 + 7) >> 2 & 1) != 0) goto LAB_004e6430;
  if (in_stack_00000000 == uStack0000000000000028) {
    func_0x007a5594(&uStack0000000000000028,in_stack_00000000,1,8,0x10);
    in_stack_00000008 = in_stack_00000030;
  }
  puVar7 = (undefined8 *)(in_stack_00000008 + in_stack_00000000 * 0x10);
  *puVar7 = unaff_x24;
  puVar7[1] = unaff_x23;
  in_stack_00000000 = in_stack_00000000 + 1;
  in_stack_00000038 = in_stack_00000000;
  if ((unaff_x27 == unaff_x26) || (*(long *)(unaff_x20 + 0x50) == 0)) {
code_r0x004e6538:
    in_stack_00000020[1] = in_stack_00000030;
    *in_stack_00000020 = uStack0000000000000028;
    in_stack_00000020[2] = in_stack_00000038;
    return;
  }
  in_stack_00000018 = (long *)(*(long *)(unaff_x20 + 0x48) + 8);
  in_stack_00000010 = *(long *)(unaff_x20 + 0x50) << 4;
  puVar7 = unaff_x27;
code_r0x004e6438:
  uVar6 = 0;
  unaff_x27 = puVar7 + 2;
  unaff_x24 = *puVar7;
  unaff_x23 = puVar7[1];
  lVar5 = 0x61;
  plVar3 = in_stack_00000018;
  lVar4 = in_stack_00000010;
  do {
    if ((*plVar3 == unaff_x23) && (iVar2 = _memcmp(plVar3[-1],unaff_x24,unaff_x23), iVar2 == 0)) {
      if (*(ulong *)(unaff_x20 + 0x68) <= uVar6) {
        func_0x007a2570(uVar6,*(ulong *)(unaff_x20 + 0x68),&UNK_009e9b68);
                    /* WARNING: Does not return */
        pcVar1 = (code *)SoftwareBreakpoint(1,0x4e6594);
        (*pcVar1)();
      }
      if ((*(char *)(*(long *)(unaff_x20 + 0x60) + lVar5) != '\0') &&
         (*(long *)(unaff_x28 + 0x90) != 0)) {
        unaff_x19 = (undefined8 *)(*(long *)(unaff_x28 + 0x88) + 0x218);
        unaff_x21 = *(long *)(unaff_x28 + 0x90) * 600;
        goto code_r0x004e64c0;
      }
      break;
    }
    plVar3 = plVar3 + 2;
    lVar5 = lVar5 + 0x68;
    uVar6 = uVar6 + 1;
    lVar4 = lVar4 + -0x10;
  } while (lVar4 != 0);
  goto LAB_004e6430;
LAB_004e64b4:
  while( true ) {
    unaff_x19 = unaff_x19 + 0x4b;
    unaff_x21 = unaff_x21 + -600;
    if (unaff_x21 == 0) break;
code_r0x004e64c0:
    if (unaff_x19[1] == unaff_x23) {
      param_1 = _memcmp(*unaff_x19,unaff_x24,unaff_x23);
      goto code_r0x004e64dc;
    }
  }
LAB_004e6430:
  puVar7 = unaff_x27;
  if (unaff_x27 == unaff_x26) goto code_r0x004e6538;
  goto code_r0x004e6438;
}

