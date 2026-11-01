
void FUN_0013f300(void)

{
  uint uVar1;
  long lVar2;
  int iVar3;
  byte bVar4;
  int iVar5;
  uint uVar6;
  ulong uVar7;
  undefined8 *puVar8;
  uint uVar9;
  long *plVar10;
  int iVar11;
  long unaff_x19;
  int unaff_w20;
  long unaff_x21;
  long *unaff_x22;
  long unaff_x23;
  long unaff_x24;
  int unaff_w25;
  ulong unaff_x26;
  long unaff_x27;
  undefined8 *unaff_x28;
  undefined8 uVar12;
  int *in_stack_00000048;
  undefined8 uStack0000000000000080;
  undefined8 in_stack_00000088;
  undefined8 in_stack_00000090;
  undefined8 in_stack_000000a0;
  undefined8 in_stack_000000a8;
  undefined8 in_stack_000000b8;
  undefined8 in_stack_000000f8;
  
  _memmove();
  *unaff_x22 = unaff_x24 + unaff_x21;
  uVar7 = (*(long *)(unaff_x19 + 0x10) - *(long *)(unaff_x19 + 8) >> 3) * unaff_x23;
  if ((unaff_w20 >= 1 && unaff_x26 <= uVar7) && (unaff_w20 < 1 || uVar7 != unaff_x26)) {
    uVar6 = 0;
    uVar9 = 0;
    plVar10 = (long *)(*(long *)(unaff_x19 + 8) + unaff_x26 * 0x18);
    lVar2 = *plVar10;
    do {
      while( true ) {
        if ((int)((ulong)(plVar10[1] - lVar2) >> 2) * -0x55555555 <= (int)uVar9) goto LAB_0013f33c;
        bVar4 = *(byte *)(lVar2 + (ulong)uVar9 * 0xc);
        iVar11 = 1;
        if ((bVar4 & 0xe0) == 0xc0) {
          iVar11 = 2;
        }
        iVar3 = 3;
        if ((bVar4 & 0xf0) != 0xe0) {
          iVar3 = iVar11;
        }
        iVar11 = 4;
        if ((bVar4 & 0xf8) != 0xf0) {
          iVar11 = iVar3;
        }
        iVar3 = 5;
        if ((bVar4 & 0xfc) != 0xf8) {
          iVar3 = iVar11;
        }
        iVar11 = 6;
        if ((bVar4 & 0xfe) != 0xfc) {
          iVar11 = iVar3;
        }
        if (bVar4 != 9) break;
        iVar3 = *(int *)(unaff_x19 + 0x54);
        iVar5 = 0;
        if (iVar3 != 0) {
          iVar5 = (int)uVar6 / iVar3;
        }
        uVar6 = iVar3 + iVar5 * iVar3;
        uVar9 = iVar11 + uVar9;
        if (unaff_w20 <= (int)uVar9) goto LAB_0013f33c;
      }
      uVar6 = uVar6 + 1;
      uVar9 = iVar11 + uVar9;
    } while ((int)uVar9 < unaff_w20);
  }
  else {
    uVar6 = 0;
  }
LAB_0013f33c:
  if ((*in_stack_00000048 != (int)unaff_x26) || (*(uint *)(unaff_x19 + 0x34) != uVar6)) {
    *(ulong *)(unaff_x19 + 0x30) = unaff_x26 & 0xffffffff | (ulong)uVar6 << 0x20;
    *(undefined1 *)(unaff_x19 + 0x68) = 1;
    func_0x001420d0();
  }
  if (in_stack_00000090._7_1_ < '\0') {
    in_stack_00000088 = 1;
    puVar8 = uStack0000000000000080;
  }
  else {
    in_stack_00000090._7_1_ = '\x01';
    puVar8 = &uStack0000000000000080;
  }
  *(undefined2 *)puVar8 = 10;
  *(undefined1 *)(unaff_x19 + 0x5d) = 1;
  in_stack_000000a0 = func_0x00137dcc();
  uVar12 = *unaff_x28;
  *(undefined8 *)(unaff_x27 + 0x70) = unaff_x28[1];
  *(undefined8 *)(unaff_x27 + 0x68) = uVar12;
  in_stack_000000f8 = unaff_x28[2];
  func_0x00139988();
  uVar9 = (int)((ulong)(*(long *)(unaff_x19 + 0x10) - *(long *)(unaff_x19 + 8)) >> 3) * -0x55555555;
  uVar6 = unaff_w25 + 2U;
  if ((int)uVar9 <= (int)(unaff_w25 + 2U)) {
    uVar6 = uVar9;
  }
  uVar9 = *(uint *)(unaff_x19 + 0x6c);
  if ((int)(unaff_w25 - 1U) <= (int)*(uint *)(unaff_x19 + 0x6c)) {
    uVar9 = unaff_w25 - 1U;
  }
  uVar1 = *(uint *)(unaff_x19 + 0x70);
  if ((int)*(uint *)(unaff_x19 + 0x70) <= (int)uVar6) {
    uVar1 = uVar6;
  }
  uVar9 = uVar9 & ((int)uVar9 >> 0x1f ^ 0xffffffffU);
  uVar6 = uVar9;
  if ((int)uVar9 <= (int)uVar1) {
    uVar6 = uVar1;
  }
  *(uint *)(unaff_x19 + 0x6c) = uVar9;
  *(uint *)(unaff_x19 + 0x70) = uVar6;
  *(undefined1 *)(unaff_x19 + 0x248) = 1;
  func_0x001420d0();
  if (in_stack_000000b8._7_1_ < '\0') {
    __ZdlPv(in_stack_000000a8);
  }
  if (in_stack_00000090._7_1_ < '\0') {
    __ZdlPv(uStack0000000000000080);
  }
  return;
}

