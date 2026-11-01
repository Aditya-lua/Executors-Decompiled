
uint FUN_006eb4a8(long param_1)

{
  uint uVar1;
  int iVar2;
  long lVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  long lVar6;
  uint uVar7;
  ulong uVar8;
  undefined8 *puVar9;
  undefined8 uStack0000000000000020;
  undefined8 in_stack_00000028;
  undefined1 uStack0000000000000030;
  undefined8 uStack_8;
  
  puVar9 = &uStack0000000000000020;
  lVar3 = func_0x006e3658(param_1,1);
  if (lVar3 != 0) {
    uVar1 = func_0x006ebadc(param_1,lVar3,
                            (int)((ulong)(*(long *)(param_1 + 8) - *(long *)(param_1 + 0x10)) >> 4)
                            + -1);
    if (uVar1 != 0xfffffffe) {
      if ((int)uVar1 < 0) {
        func_0x006e3c24(param_1,0);
        uVar7 = 2;
        uVar1 = 0xfffffffe;
      }
      else {
        func_0x006e3c24(param_1,1);
        uVar7 = uVar1 + 1;
        uVar1 = ~uVar1;
      }
      func_0x006e1ee0(param_1,uVar1);
      return uVar7;
    }
    lVar6 = *(long *)(*(long *)(param_1 + 0x18) + 0x510);
    if (lVar6 != 0) {
      func_0x007005c4(param_1,lVar6,lVar3);
    }
    register0x00000008 = (BADSPACEBASE *)&uStack0000000000000030;
    puVar9 = uStack0000000000000020;
    uStack_8 = in_stack_00000028;
LAB_006eef80:
    *(undefined8 **)((long)register0x00000008 + -0x10) = puVar9;
    *(undefined8 *)((long)register0x00000008 + -8) = uStack_8;
    if (*(ushort *)(param_1 + 0x50) < *(ushort *)(param_1 + 0x52)) {
      lVar3 = func_0x006eceb0(param_1,"attempt to break across metamethod/C-call boundary");
      return (uint)(*(ushort *)(lVar3 + 0x52) <= *(ushort *)(lVar3 + 0x50));
    }
    *(undefined1 *)(param_1 + 3) = 6;
    return 0xffffffff;
  }
  param_1 = func_0x006e6498(param_1,1,"thread");
  uStack_8 = 0x6eb574;
  lVar3 = func_0x006e3658(param_1,1);
  if (lVar3 == 0) {
    func_0x006e6498(param_1,1,"thread");
code_r0x006eb680:
    uVar4 = func_0x006e644c(param_1,"too many results to resume");
    func_0x006e69bc(uVar4,1,7);
    uVar5 = func_0x006e1a48(uVar4);
    func_0x006e1998(uVar4,uVar5,1);
    return 1;
  }
  if (*(byte *)(lVar3 + 3) == 6) {
    lVar6 = *(long *)(*(long *)(param_1 + 0x18) + 0x510);
    if (lVar6 != 0) {
      func_0x007005c4(param_1,lVar6,lVar3);
    }
    goto LAB_006eef80;
  }
  if (*(byte *)(lVar3 + 3) < 2) {
    uVar8 = (ulong)(*(long *)(lVar3 + 8) - *(long *)(lVar3 + 0x10)) >> 4;
    uVar7 = (uint)uVar8;
    uVar1 = uVar7 + 1;
    iVar2 = func_0x006e17a8(param_1,uVar1);
    if (iVar2 == 0) goto code_r0x006eb680;
    func_0x006e190c(lVar3,param_1,uVar8);
    if (-1 < (int)uVar7) {
      func_0x006e3c24(param_1,1);
      uVar7 = ~uVar7;
      goto code_r0x006eb650;
    }
  }
  else {
    func_0x006e188c(param_1,2);
    func_0x006e190c(lVar3,param_1,1);
  }
  func_0x006e3c24(param_1,0);
  uVar1 = 2;
  uVar7 = 0xfffffffe;
code_r0x006eb650:
  func_0x006e1ee0(param_1,uVar7);
  return uVar1;
}

