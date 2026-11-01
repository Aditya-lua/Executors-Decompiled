
undefined8 FUN_002aa6b0(int param_1)

{
  undefined8 uVar1;
  uint uVar2;
  ulong uVar3;
  long lVar4;
  int iVar5;
  long unaff_x19;
  undefined8 *unaff_x20;
  long *unaff_x21;
  
  if (param_1 == 0) {
    func_0x0028f83c(3,0,0x44,"/aws-lc/crypto/fipsmodule/bn/montgomery.c",0xdb);
    return 0;
  }
  uVar3 = (ulong)*(int *)(unaff_x20 + 1);
  if (*(int *)(unaff_x20 + 1) != 0) {
    _memcpy(*unaff_x21,*unaff_x20,uVar3 << 3);
    uVar3 = (ulong)*(uint *)(unaff_x20 + 1);
  }
  *(undefined4 *)(unaff_x19 + 0x28) = *(undefined4 *)(unaff_x20 + 2);
  uVar2 = (uint)uVar3;
  lVar4 = (uVar3 & 0xffffffff) * 8;
  do {
    lVar4 = lVar4 + -8;
    iVar5 = (int)uVar3;
    uVar3 = (ulong)(iVar5 - 1);
    if (iVar5 < 1) {
      *(uint *)(unaff_x19 + 0x20) = uVar2 & (int)uVar2 >> 0x1f;
      if (-1 < (int)uVar2) {
        *(undefined4 *)(unaff_x19 + 0x28) = 0;
      }
      goto LAB_002aa720;
    }
  } while (*(long *)(*unaff_x21 + lVar4) == 0);
  *(int *)(unaff_x19 + 0x20) = iVar5;
LAB_002aa720:
  uVar1 = func_0x002ab5dc();
  *(undefined8 *)(unaff_x19 + 0x30) = uVar1;
  *(undefined8 *)(unaff_x19 + 0x38) = 0;
  return 1;
}

