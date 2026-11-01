
undefined1  [16] FUN_006e2a44(long param_1,int param_2)

{
  int iVar1;
  ulong *puVar2;
  int in_w8;
  undefined4 *unaff_x19;
  undefined1 auVar3 [16];
  
  if (param_2 < in_w8) {
    puVar2 = (ulong *)func_0x006e60a0();
    iVar1 = *(int *)((long)puVar2 + 0xc);
  }
  else {
    puVar2 = (ulong *)(*(long *)(param_1 + 8) + (long)param_2 * 0x10);
    iVar1 = *(int *)((long)puVar2 + 0xc);
  }
  if ((iVar1 == 3) || (puVar2 = (ulong *)func_0x00702288(), puVar2 != (ulong *)0x0)) {
    if (unaff_x19 != (undefined4 *)0x0) {
      *unaff_x19 = 1;
    }
    auVar3._0_8_ = *puVar2;
    auVar3._8_8_ = 0;
    return auVar3;
  }
  if (unaff_x19 != (undefined4 *)0x0) {
    *unaff_x19 = 0;
  }
  return ZEXT816(0);
}

