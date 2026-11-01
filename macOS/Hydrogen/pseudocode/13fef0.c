
void FUN_0013fef0(long param_1)

{
  uint uVar1;
  int iVar2;
  char cVar3;
  byte bVar4;
  uint uVar5;
  int iVar6;
  long lVar7;
  int iVar8;
  uint uVar9;
  long *plVar10;
  int iVar11;
  long unaff_x19;
  int unaff_w21;
  char *pcVar12;
  undefined8 *unaff_x22;
  long *unaff_x23;
  uint unaff_w24;
  long lVar13;
  long *unaff_x26;
  int unaff_w27;
  ulong unaff_x28;
  int in_stack_00000028;
  undefined8 in_stack_00000040;
  int *in_stack_00000048;
  undefined1 uStack0000000000000078;
  char cStack0000000000000079;
  undefined8 uStack0000000000000080;
  undefined8 in_stack_00000090;
  undefined8 in_stack_000000a0;
  undefined8 in_stack_000000a8;
  undefined8 in_stack_000000b8;
  undefined8 in_stack_000000e8;
  undefined8 in_stack_000000f0;
  undefined8 in_stack_000000f8;
  
  param_1 = param_1 + (long)unaff_w21 * 0xc;
  lVar7 = *unaff_x26 - (param_1 + 0xc);
  if (lVar7 != 0) {
    _memmove(param_1,param_1 + 0xc,lVar7 + -3);
  }
  *unaff_x26 = param_1 + lVar7;
  if ((5 < unaff_w24) &&
     (unaff_w27 < (int)((ulong)((param_1 + lVar7) - *unaff_x23) >> 2) * -0x55555555)) {
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9push_backEc
              (in_stack_00000040,(long)*(char *)(*unaff_x23 + (long)unaff_w21 * 0xc));
    lVar13 = *unaff_x23 + (long)unaff_w21 * 0xc;
    lVar7 = *unaff_x26 - (lVar13 + 0xc);
    if (lVar7 != 0) {
      _memmove(lVar13,lVar13 + 0xc,lVar7 + -3);
    }
    *unaff_x26 = lVar13 + lVar7;
  }
  if (uStack0000000000000078 != '\0') {
    pcVar12 = &cStack0000000000000079;
    do {
      func_0x001396dc();
      cVar3 = *pcVar12;
      unaff_w27 = unaff_w27 + 1;
      pcVar12 = pcVar12 + 1;
    } while (cVar3 != '\0');
  }
  func_0x0002a730(&uStack0000000000000080,&uStack0000000000000078);
  iVar8 = 0;
  if ((0 < unaff_w27) &&
     (unaff_x28 <
      (ulong)((*(long *)(unaff_x19 + 0x10) - *(long *)(unaff_x19 + 8) >> 3) * -0x5555555555555555)))
  {
    iVar8 = 0;
    uVar9 = 0;
    plVar10 = (long *)(*(long *)(unaff_x19 + 8) + (long)(int)unaff_x28 * 0x18);
    lVar7 = *plVar10;
    do {
      while( true ) {
        if ((int)((ulong)(plVar10[1] - lVar7) >> 2) * -0x55555555 <= (int)uVar9) goto LAB_001400e4;
        bVar4 = *(byte *)(lVar7 + (ulong)uVar9 * 0xc);
        iVar11 = 1;
        if ((bVar4 & 0xe0) == 0xc0) {
          iVar11 = 2;
        }
        iVar2 = 3;
        if ((bVar4 & 0xf0) != 0xe0) {
          iVar2 = iVar11;
        }
        iVar11 = 4;
        if ((bVar4 & 0xf8) != 0xf0) {
          iVar11 = iVar2;
        }
        iVar2 = 5;
        if ((bVar4 & 0xfc) != 0xf8) {
          iVar2 = iVar11;
        }
        iVar11 = 6;
        if ((bVar4 & 0xfe) != 0xfc) {
          iVar11 = iVar2;
        }
        if (bVar4 != 9) break;
        iVar2 = *(int *)(unaff_x19 + 0x54);
        iVar6 = 0;
        if (iVar2 != 0) {
          iVar6 = iVar8 / iVar2;
        }
        iVar8 = iVar2 + iVar6 * iVar2;
        uVar9 = iVar11 + uVar9;
        if (unaff_w27 <= (int)uVar9) goto LAB_001400e4;
      }
      iVar8 = iVar8 + 1;
      uVar9 = iVar11 + uVar9;
    } while ((int)uVar9 < unaff_w27);
  }
LAB_001400e4:
  if ((*in_stack_00000048 != in_stack_00000028) || (*(int *)(unaff_x19 + 0x34) != iVar8)) {
    *(ulong *)(unaff_x19 + 0x30) = CONCAT44(iVar8,in_stack_00000028);
    *(undefined1 *)(unaff_x19 + 0x68) = 1;
    func_0x001420d0();
  }
  *(undefined1 *)(unaff_x19 + 0x5d) = 1;
  in_stack_000000a0 = func_0x00137dcc();
  in_stack_000000f0 = unaff_x22[1];
  in_stack_000000e8 = *unaff_x22;
  in_stack_000000f8 = unaff_x22[2];
  func_0x00139988();
  uVar5 = (int)((ulong)(*(long *)(unaff_x19 + 0x10) - *(long *)(unaff_x19 + 8)) >> 3) * -0x55555555;
  uVar9 = in_stack_00000028 + 2U;
  if ((int)uVar5 <= (int)(in_stack_00000028 + 2U)) {
    uVar9 = uVar5;
  }
  uVar5 = *(uint *)(unaff_x19 + 0x6c);
  if ((int)(in_stack_00000028 - 1U) <= (int)*(uint *)(unaff_x19 + 0x6c)) {
    uVar5 = in_stack_00000028 - 1U;
  }
  uVar1 = *(uint *)(unaff_x19 + 0x70);
  if ((int)*(uint *)(unaff_x19 + 0x70) <= (int)uVar9) {
    uVar1 = uVar9;
  }
  uVar5 = uVar5 & ((int)uVar5 >> 0x1f ^ 0xffffffffU);
  uVar9 = uVar5;
  if ((int)uVar5 <= (int)uVar1) {
    uVar9 = uVar1;
  }
  *(uint *)(unaff_x19 + 0x6c) = uVar5;
  *(uint *)(unaff_x19 + 0x70) = uVar9;
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

