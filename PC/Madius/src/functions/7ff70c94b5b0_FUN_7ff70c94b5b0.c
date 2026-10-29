/* 7ff70c94b5b0 FUN_7ff70c94b5b0 */

void FUN_7ff70c94b5b0(longlong param_1)

{
  longlong lVar1;
  
  lVar1 = *(longlong *)(param_1 + 0x20);
  if (lVar1 != 0) {
    FUN_7ff70c955550(lVar1,param_1);
    FUN_7ff70c991030(lVar1 + 0x378,param_1 + 0x40,0);
  }
  *(undefined8 *)(param_1 + 0x20) = 0;
  return;
}


