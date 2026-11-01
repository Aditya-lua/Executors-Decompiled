
undefined8 FUN_002aa644(long param_1,ulong param_2,undefined8 param_3,long param_4)

{
  long *plVar1;
  int iVar2;
  undefined8 uVar3;
  uint uVar4;
  ulong *puVar5;
  ulong uVar6;
  long in_x9;
  long in_x10;
  long lVar7;
  long in_x11;
  long unaff_x19;
  long *unaff_x20;
  
  if (in_x10 != in_x11) {
    param_4 = param_4 - in_x9;
    puVar5 = (ulong *)(param_1 + in_x9 * 8);
    do {
      param_2 = *puVar5 | param_2;
      param_4 = param_4 + -1;
      puVar5 = puVar5 + 1;
    } while (param_4 != 0);
  }
  if (param_2 != 0) {
    func_0x0028f83c(3,0,0x66,"/aws-lc/crypto/fipsmodule/bn/montgomery.c",0xd5);
    return 0;
  }
  plVar1 = (long *)(unaff_x19 + 0x18);
  if (plVar1 == unaff_x20) {
    uVar6 = (ulong)*(uint *)(unaff_x19 + 0x20);
  }
  else {
    iVar2 = func_0x0029afb8(plVar1);
    if (iVar2 == 0) {
      func_0x0028f83c(3,0,0x44,"/aws-lc/crypto/fipsmodule/bn/montgomery.c",0xdb);
      return 0;
    }
    uVar6 = (ulong)(int)unaff_x20[1];
    if ((int)unaff_x20[1] != 0) {
      _memcpy(*plVar1,*unaff_x20,uVar6 << 3);
      uVar6 = (ulong)*(uint *)(unaff_x20 + 1);
    }
    *(int *)(unaff_x19 + 0x28) = (int)unaff_x20[2];
  }
  uVar4 = (uint)uVar6;
  lVar7 = (uVar6 & 0xffffffff) * 8;
  do {
    lVar7 = lVar7 + -8;
    iVar2 = (int)uVar6;
    uVar6 = (ulong)(iVar2 - 1);
    if (iVar2 < 1) {
      *(uint *)(unaff_x19 + 0x20) = uVar4 & (int)uVar4 >> 0x1f;
      if (-1 < (int)uVar4) {
        *(undefined4 *)(unaff_x19 + 0x28) = 0;
      }
      goto code_r0x002aa720;
    }
  } while (*(long *)(*plVar1 + lVar7) == 0);
  *(int *)(unaff_x19 + 0x20) = iVar2;
code_r0x002aa720:
  uVar3 = func_0x002ab5dc(plVar1);
  *(undefined8 *)(unaff_x19 + 0x30) = uVar3;
  *(undefined8 *)(unaff_x19 + 0x38) = 0;
  return 1;
}

