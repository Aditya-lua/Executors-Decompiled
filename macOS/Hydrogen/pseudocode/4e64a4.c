
void FUN_004e64a4(long param_1)

{
  code *pcVar1;
  int iVar2;
  long in_x9;
  long *plVar3;
  undefined8 *puVar4;
  long unaff_x20;
  long lVar5;
  long lVar6;
  long unaff_x23;
  undefined8 unaff_x24;
  ulong uVar7;
  undefined8 *unaff_x26;
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
  
code_r0x004e64a4:
  puVar4 = (undefined8 *)(in_x9 + 0x218);
  param_1 = param_1 * 600;
  while ((puVar4[1] != unaff_x23 || (iVar2 = _memcmp(*puVar4,unaff_x24,unaff_x23), iVar2 != 0))) {
    puVar4 = puVar4 + 0x4b;
    param_1 = param_1 + -600;
    if (param_1 == 0) goto LAB_004e6430;
  }
  if ((*(byte *)(puVar4 + 7) >> 2 & 1) != 0) goto LAB_004e6430;
  if (in_stack_00000000 == uStack0000000000000028) {
    func_0x007a5594(&uStack0000000000000028,in_stack_00000000,1,8,0x10);
    in_stack_00000008 = in_stack_00000030;
  }
  puVar4 = (undefined8 *)(in_stack_00000008 + in_stack_00000000 * 0x10);
  *puVar4 = unaff_x24;
  puVar4[1] = unaff_x23;
  in_stack_00000000 = in_stack_00000000 + 1;
  in_stack_00000038 = in_stack_00000000;
  if ((unaff_x27 != unaff_x26) && (*(long *)(unaff_x20 + 0x50) != 0)) {
    in_stack_00000018 = (long *)(*(long *)(unaff_x20 + 0x48) + 8);
    in_stack_00000010 = *(long *)(unaff_x20 + 0x50) << 4;
    puVar4 = unaff_x27;
    do {
      uVar7 = 0;
      unaff_x27 = puVar4 + 2;
      unaff_x24 = *puVar4;
      unaff_x23 = puVar4[1];
      lVar6 = 0x61;
      plVar3 = in_stack_00000018;
      lVar5 = in_stack_00000010;
      do {
        if ((*plVar3 == unaff_x23) && (iVar2 = _memcmp(plVar3[-1],unaff_x24,unaff_x23), iVar2 == 0))
        {
          if (*(ulong *)(unaff_x20 + 0x68) <= uVar7) {
            func_0x007a2570(uVar7,*(ulong *)(unaff_x20 + 0x68),&UNK_009e9b68);
                    /* WARNING: Does not return */
            pcVar1 = (code *)SoftwareBreakpoint(1,0x4e6594);
            (*pcVar1)();
          }
          if ((*(char *)(*(long *)(unaff_x20 + 0x60) + lVar6) != '\0') &&
             (param_1 = *(long *)(unaff_x28 + 0x90), param_1 != 0)) {
            in_x9 = *(long *)(unaff_x28 + 0x88);
            goto code_r0x004e64a4;
          }
          break;
        }
        plVar3 = plVar3 + 2;
        lVar6 = lVar6 + 0x68;
        uVar7 = uVar7 + 1;
        lVar5 = lVar5 + -0x10;
      } while (lVar5 != 0);
LAB_004e6430:
      puVar4 = unaff_x27;
    } while (unaff_x27 != unaff_x26);
  }
  in_stack_00000020[1] = in_stack_00000030;
  *in_stack_00000020 = uStack0000000000000028;
  in_stack_00000020[2] = in_stack_00000038;
  return;
}

