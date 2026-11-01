
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_00607b88(long param_1)

{
  undefined8 uVar1;
  undefined8 *puVar2;
  long unaff_x20;
  
  uVar1 = _UNK_008baa70;
  *(undefined8 *)(param_1 + 0x18) = _UNK_008baa78;
  *(undefined8 *)(param_1 + 0x10) = uVar1;
  puVar2 = (undefined8 *)func_0x006115d0(0x10);
  *(undefined8 **)(unaff_x20 + 0x38) = puVar2;
  *(undefined4 *)(unaff_x20 + 0x40) = 0;
  *puVar2 = 0;
  puVar2[1] = 0;
  ___cxa_atexit(&SUB_00087574,unaff_x20 + 0x18,0);
  ___cxa_guard_release();
  func_0x005ffccc();
  return;
}

