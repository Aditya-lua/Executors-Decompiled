
ulong FUN_005f0a20(long *param_1)

{
  long lVar1;
  long *plVar2;
  ulong uVar3;
  undefined1 uStack000000000000000f;
  
  lVar1 = (**(code **)(*param_1 + 0x168))();
  if (lVar1 == 0) {
    lVar1 = (**(code **)(*param_1 + 0xb8))(param_1,&uStack000000000000000f);
    return (ulong)(lVar1 != 0);
  }
  plVar2 = (long *)(**(code **)(*param_1 + 0x168))(param_1);
                    /* WARNING: Could not recover jumptable at 0x005f0a64. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar3 = (**(code **)(*plVar2 + 0xa0))();
  return uVar3;
}

