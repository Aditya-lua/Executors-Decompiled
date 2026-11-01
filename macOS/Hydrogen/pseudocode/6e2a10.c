
undefined1  [16] FUN_006e2a10(ulong param_1)

{
  int iVar1;
  long lVar2;
  ulong *puVar3;
  long in_x9;
  ulong *in_x10;
  undefined4 *unaff_x19;
  undefined1 auVar4 [16];
  
  puVar3 = (ulong *)(in_x9 + (param_1 & 0xffffffff) * 0x10);
  if (puVar3 < in_x10) {
    iVar1 = *(int *)((long)puVar3 + 0xc);
  }
  else {
    lVar2 = __dyld_get_image_header(0);
    puVar3 = (ulong *)(lVar2 + 0x4e8dd08);
    iVar1 = *(int *)(lVar2 + 0x4e8dd14);
  }
  if ((iVar1 == 3) || (puVar3 = (ulong *)func_0x00702288(), puVar3 != (ulong *)0x0)) {
    if (unaff_x19 != (undefined4 *)0x0) {
      *unaff_x19 = 1;
    }
    auVar4._0_8_ = *puVar3;
    auVar4._8_8_ = 0;
    return auVar4;
  }
  if (unaff_x19 != (undefined4 *)0x0) {
    *unaff_x19 = 0;
  }
  return ZEXT816(0);
}

