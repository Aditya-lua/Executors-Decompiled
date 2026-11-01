
undefined8 FUN_005f0d98(long param_1)

{
  int iVar1;
  long lVar2;
  long *plVar3;
  undefined8 uVar4;
  long *unaff_x19;
  undefined8 unaff_x20;
  
  lVar2 = (**(code **)(param_1 + 0x160))();
  if (lVar2 != 0) {
    plVar3 = (long *)(**(code **)(*unaff_x19 + 0x160))();
                    /* WARNING: Could not recover jumptable at 0x005f0dd0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    uVar4 = (**(code **)(*plVar3 + 200))();
    return uVar4;
  }
  if (((bRam0000000000a3c0f0 & 1) == 0) && (iVar1 = ___cxa_guard_acquire(0xa3c0f0), iVar1 != 0)) {
    puRam0000000000a3c108 = &UNK_009f5558;
    puRam0000000000a3c110 = &UNK_009f56e8;
    ___cxa_guard_release(0xa3c0f0);
  }
  (**(code **)(*unaff_x19 + 0x118))();
  return unaff_x20;
}

