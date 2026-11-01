
char * FUN_0077eaa0(undefined8 param_1,char *param_2)

{
  int iVar1;
  int iVar2;
  int *piVar3;
  undefined1 *puVar4;
  long unaff_x20;
  
  piVar3 = (int *)___error();
  if (unaff_x20 == 0) {
    return (char *)0x0;
  }
  iVar1 = *piVar3;
  *param_2 = '\0';
  iVar2 = _strerror_r(param_1,param_2);
  if ((iVar2 != 0) && (*param_2 == '\0')) {
    func_0x00764560(param_2);
  }
  puVar4 = (undefined1 *)_strrchr(param_2,10);
  if ((puVar4 != (undefined1 *)0x0) && (1 < (long)puVar4 - (long)param_2)) {
    *puVar4 = 0;
  }
  puVar4 = (undefined1 *)_strrchr(param_2,0xd);
  if ((puVar4 != (undefined1 *)0x0) && (0 < (long)puVar4 - (long)param_2)) {
    *puVar4 = 0;
  }
  piVar3 = (int *)___error();
  if (*piVar3 != iVar1) {
    piVar3 = (int *)___error();
    *piVar3 = iVar1;
  }
  return param_2;
}

