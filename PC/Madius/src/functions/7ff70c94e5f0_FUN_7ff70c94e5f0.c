/* 7ff70c94e5f0 FUN_7ff70c94e5f0 */

longlong FUN_7ff70c94e5f0(int *param_1,undefined4 *param_2)

{
  undefined4 uVar1;
  longlong lVar2;
  undefined8 uVar3;
  
  *param_2 = 0;
  if (((param_1 != (int *)0x0) && (*param_1 == 0xbab1e)) &&
     (*(char *)((longlong)param_1 + 0x1b3) == '\0')) {
    param_1 = param_1 + 8;
    lVar2 = FUN_7ff70c991170();
    if (lVar2 != 0) {
      lVar2 = **(longlong **)param_1;
      FUN_7ff70c991030(param_1,*(longlong **)param_1,0);
      uVar3 = FUN_7ff70c991170(param_1);
      uVar1 = FUN_7ff70c94fb00(uVar3);
      *param_2 = uVar1;
      return lVar2 + 0x18;
    }
  }
  return 0;
}


