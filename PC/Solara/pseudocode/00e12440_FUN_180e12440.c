undefined8 FUN_180e12440(undefined8 param_1,undefined8 param_2)

{
  int iVar1;
  undefined8 uVar2;
  
  iVar1 = MoveFileExW(param_1,param_2,3);
  if (iVar1 != 0) {
    return 0;
  }
                    /* WARNING: Could not recover jumptable at 0x000180e1245f. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar2 = GetLastError();
  return uVar2;
}


