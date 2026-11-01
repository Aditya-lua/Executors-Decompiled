
void FUN_004e6474(long param_1,undefined8 param_2)

{
  code *pcVar1;
  int iVar2;
  long *unaff_x19;
  undefined8 *puVar3;
  long unaff_x20;
  long unaff_x21;
  long lVar4;
  long unaff_x22;
  long unaff_x23;
  undefined8 unaff_x24;
  ulong unaff_x25;
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
  
code_r0x004e6474:
  iVar2 = _memcmp(param_1,param_2,unaff_x23);
  param_2 = unaff_x24;
  if (iVar2 != 0) goto LAB_004e644c;
  if (*(ulong *)(unaff_x20 + 0x68) <= unaff_x25) {
    func_0x007a2570(unaff_x25,*(ulong *)(unaff_x20 + 0x68),&UNK_009e9b68);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x4e6594);
    (*pcVar1)();
  }
  if (*(char *)(*(long *)(unaff_x20 + 0x60) + unaff_x22) == '\0') goto LAB_004e6430;
  if (*(long *)(unaff_x28 + 0x90) == 0) goto LAB_004e6430;
  puVar3 = (undefined8 *)(*(long *)(unaff_x28 + 0x88) + 0x218);
  lVar4 = *(long *)(unaff_x28 + 0x90) * 600;
  while ((puVar3[1] != unaff_x23 || (iVar2 = _memcmp(*puVar3,unaff_x24,unaff_x23), iVar2 != 0))) {
    puVar3 = puVar3 + 0x4b;
    lVar4 = lVar4 + -600;
    if (lVar4 == 0) goto LAB_004e6430;
  }
  if ((*(byte *)(puVar3 + 7) >> 2 & 1) != 0) goto LAB_004e6430;
  if (in_stack_00000000 == uStack0000000000000028) {
    func_0x007a5594(&uStack0000000000000028,in_stack_00000000,1,8,0x10);
    in_stack_00000008 = in_stack_00000030;
  }
  puVar3 = (undefined8 *)(in_stack_00000008 + in_stack_00000000 * 0x10);
  *puVar3 = unaff_x24;
  puVar3[1] = unaff_x23;
  in_stack_00000000 = in_stack_00000000 + 1;
  in_stack_00000038 = in_stack_00000000;
  if ((unaff_x27 != unaff_x26) && (*(long *)(unaff_x20 + 0x50) != 0)) {
    in_stack_00000018 = (long *)(*(long *)(unaff_x20 + 0x48) + 8);
    in_stack_00000010 = *(long *)(unaff_x20 + 0x50) << 4;
    puVar3 = unaff_x27;
    do {
      unaff_x25 = 0;
      unaff_x27 = puVar3 + 2;
      param_2 = *puVar3;
      unaff_x23 = puVar3[1];
      unaff_x22 = 0x61;
      unaff_x19 = in_stack_00000018;
      unaff_x21 = in_stack_00000010;
      do {
        if (*unaff_x19 == unaff_x23) {
          param_1 = unaff_x19[-1];
          unaff_x24 = param_2;
          goto code_r0x004e6474;
        }
LAB_004e644c:
        unaff_x19 = unaff_x19 + 2;
        unaff_x22 = unaff_x22 + 0x68;
        unaff_x25 = unaff_x25 + 1;
        unaff_x21 = unaff_x21 + -0x10;
      } while (unaff_x21 != 0);
LAB_004e6430:
      puVar3 = unaff_x27;
    } while (unaff_x27 != unaff_x26);
  }
  in_stack_00000020[1] = in_stack_00000030;
  *in_stack_00000020 = uStack0000000000000028;
  in_stack_00000020[2] = in_stack_00000038;
  return;
}

