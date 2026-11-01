
undefined8 FUN_00730f7c(undefined8 param_1,long param_2,int param_3)

{
  long *plVar1;
  undefined8 uVar2;
  undefined4 *unaff_x19;
  
  plVar1 = *(long **)(*(long *)(param_2 + 0x18) + (long)param_3 * 8 + 0x260);
  while( true ) {
    if (plVar1 == (long *)0x0) {
      func_0x0073c9e4(param_1,"send: no filter connected");
      *unaff_x19 = 2;
      return 0xffffffffffffffff;
    }
    if ((*(byte *)((long)plVar1 + 0x24) & 1) != 0) break;
    plVar1 = (long *)plVar1[1];
  }
                    /* WARNING: Could not recover jumptable at 0x00730fdc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar2 = (**(code **)(*plVar1 + 0x48))(plVar1,param_1);
  return uVar2;
}

