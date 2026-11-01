
void FUN_003fec24(ulong *param_1)

{
  ulong *puVar1;
  code *pcVar2;
  bool bVar3;
  ulong *puVar4;
  ulong *in_x11;
  long in_x12;
  ulong *puVar5;
  ulong *unaff_x19;
  ulong *unaff_x20;
  ulong unaff_x21;
  long unaff_x23;
  ulong uVar6;
  
  puVar5 = param_1 + -2;
  puVar1 = unaff_x20;
  do {
    puVar4 = puVar1;
    bVar3 = *unaff_x19 <= *param_1;
    puVar1 = param_1;
    if (bVar3) {
      puVar1 = unaff_x19;
    }
    uVar6 = *puVar1;
    puVar4[1] = puVar1[1];
    *puVar4 = uVar6;
    param_1 = param_1 + (ulong)!bVar3 * 2;
    unaff_x19 = unaff_x19 + (ulong)bVar3 * 2;
    bVar3 = *puVar5 <= *in_x11;
    puVar1 = puVar5;
    if (bVar3) {
      puVar1 = in_x11;
    }
    uVar6 = *puVar1;
    ((ulong *)((long)unaff_x20 + in_x12))[1] = puVar1[1];
    *(ulong *)((long)unaff_x20 + in_x12) = uVar6;
    in_x11 = in_x11 + (ulong)bVar3 * -2;
    puVar5 = puVar5 + (ulong)!bVar3 * -2;
    in_x12 = in_x12 + -0x10;
    unaff_x23 = unaff_x23 + -1;
    puVar1 = puVar4 + 2;
  } while (unaff_x23 != 0);
  if ((unaff_x21 & 1) != 0) {
    bVar3 = puVar5 + 2 <= unaff_x19;
    puVar1 = unaff_x19;
    if (bVar3) {
      puVar1 = param_1;
    }
    uVar6 = *puVar1;
    puVar4[3] = puVar1[1];
    puVar4[2] = uVar6;
    unaff_x19 = unaff_x19 + (ulong)!bVar3 * 2;
    param_1 = param_1 + (ulong)bVar3 * 2;
  }
  if (unaff_x19 != puVar5 + 2 || param_1 != in_x11 + 2) {
    func_0x007a286c();
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x3fed18);
    (*pcVar2)();
  }
  return;
}

