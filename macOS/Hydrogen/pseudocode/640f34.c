
void FUN_00640f34(long param_1,undefined8 param_2)

{
  undefined8 uVar1;
  
  uVar1 = (**(code **)(*(long *)(param_1 + -8) + 0x20))();
                    /* WARNING: Could not recover jumptable at 0x00640f74. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*(long *)(param_1 + 0x28) + 0x98))
            ((long *)(param_1 + 0x28),param_2,uVar1,*(undefined1 *)(param_1 + 0x1f8));
  return;
}

