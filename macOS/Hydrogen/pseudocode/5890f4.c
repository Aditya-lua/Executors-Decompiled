
long FUN_005890f4(void)

{
  undefined8 uVar1;
  undefined8 uVar2;
  code *pcVar3;
  undefined8 *puVar4;
  undefined8 *unaff_x19;
  undefined8 uVar5;
  ulong unaff_x20;
  long unaff_x21;
  undefined8 unaff_x22;
  long unaff_x23;
  undefined4 unaff_w24;
  long lVar6;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  
  lVar6 = *(long *)(unaff_x21 + 0x10);
  uVar1 = *unaff_x19;
  uVar2 = unaff_x19[1];
  uVar5 = unaff_x19[2];
  if (lVar6 == unaff_x23) {
    func_0x005832d0();
  }
  puVar4 = (undefined8 *)(*(long *)(unaff_x21 + 8) + lVar6 * 0x28);
  *puVar4 = uVar1;
  puVar4[1] = uVar2;
  puVar4[2] = uVar5;
  puVar4[3] = unaff_x22;
  *(undefined4 *)(puVar4 + 4) = unaff_w24;
  *(ulong *)(unaff_x21 + 0x10) = lVar6 + 1U;
  if (lVar6 + 1U <= unaff_x20) {
    func_0x007a2570();
    func_0x007a1f00(in_stack_00000008,in_stack_00000010,&UNK_009f0c90);
                    /* WARNING: Does not return */
    pcVar3 = (code *)SoftwareBreakpoint(1,0x589124);
    (*pcVar3)();
  }
  return *(long *)(unaff_x21 + 8) + unaff_x20 * 0x28;
}

