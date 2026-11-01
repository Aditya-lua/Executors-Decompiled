
void FUN_003fec4c(ulong *param_1,undefined1 param_2 [16])

{
  ulong *puVar1;
  code *pcVar2;
  bool bVar3;
  ulong *in_x9;
  ulong *in_x10;
  ulong *in_x11;
  long in_x12;
  ulong *in_x13;
  ulong in_x15;
  ulong in_x16;
  long unaff_x20;
  ulong unaff_x21;
  long unaff_x23;
  ulong uVar4;
  ulong uVar5;
  
  uVar5 = param_2._8_8_;
  uVar4 = param_2._0_8_;
  while( true ) {
    in_x10[1] = uVar5;
    *in_x10 = uVar4;
    param_1 = param_1 + (in_x16 & 0xffffffff) * 2;
    in_x9 = in_x9 + (in_x15 & 0xffffffff) * 2;
    bVar3 = *in_x13 <= *in_x11;
    puVar1 = in_x13;
    if (bVar3) {
      puVar1 = in_x11;
    }
    uVar4 = *puVar1;
    ((ulong *)(unaff_x20 + in_x12))[1] = puVar1[1];
    *(ulong *)(unaff_x20 + in_x12) = uVar4;
    in_x11 = in_x11 + (ulong)bVar3 * -2;
    in_x13 = in_x13 + (ulong)!bVar3 * -2;
    in_x12 = in_x12 + -0x10;
    unaff_x23 = unaff_x23 + -1;
    if (unaff_x23 == 0) break;
    bVar3 = *in_x9 <= *param_1;
    puVar1 = param_1;
    if (bVar3) {
      puVar1 = in_x9;
    }
    in_x15 = (ulong)bVar3;
    in_x16 = (ulong)!bVar3;
    uVar5 = puVar1[1];
    uVar4 = *puVar1;
    in_x10 = in_x10 + 2;
  }
  if ((unaff_x21 & 1) != 0) {
    bVar3 = in_x13 + 2 <= in_x9;
    puVar1 = in_x9;
    if (bVar3) {
      puVar1 = param_1;
    }
    uVar4 = *puVar1;
    in_x10[3] = puVar1[1];
    in_x10[2] = uVar4;
    in_x9 = in_x9 + (ulong)!bVar3 * 2;
    param_1 = param_1 + (ulong)bVar3 * 2;
  }
  if (in_x9 != in_x13 + 2 || param_1 != in_x11 + 2) {
    func_0x007a286c();
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x3fed18);
    (*pcVar2)();
  }
  return;
}

