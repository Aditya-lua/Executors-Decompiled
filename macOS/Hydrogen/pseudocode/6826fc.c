
void FUN_006826fc(long param_1,undefined8 param_2,long param_3)

{
  ulong uVar1;
  long in_x9;
  ulong *puVar2;
  long *unaff_x19;
  
  param_1 = param_1 - in_x9;
  puVar2 = (ulong *)(param_3 + in_x9 * 8);
  do {
    uVar1 = (*puVar2 & 0xff00ff00ff00ff00) >> 8 | (*puVar2 & 0xff00ff00ff00ff) << 8;
    uVar1 = (uVar1 & 0xffff0000ffff0000) >> 0x10 | (uVar1 & 0xffff0000ffff) << 0x10;
    *puVar2 = uVar1 >> 0x20 | uVar1 << 0x20;
    param_1 = param_1 + -1;
    puVar2 = puVar2 + 1;
  } while (param_1 != 0);
  _memcpy();
                    /* WARNING: Could not recover jumptable at 0x00682820. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*unaff_x19 + 0xa0))();
  return;
}

