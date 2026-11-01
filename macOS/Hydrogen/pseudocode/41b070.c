
undefined1  [16] FUN_0041b070(int param_1)

{
  ulong uVar1;
  undefined8 *unaff_x19;
  long unaff_x23;
  undefined1 auVar2 [16];
  
  auVar2 = func_0x00417e00(unaff_x19 + 2);
  if (param_1 != 0) {
    if (((*(ulong *)(unaff_x23 + 0x548) & 0x7fffffffffffffff) != 0) &&
       (uVar1 = func_0x007a1140(), (uVar1 & 1) == 0)) {
      *(undefined1 *)(unaff_x19 + 1) = 1;
    }
  }
  _pthread_mutex_unlock(*unaff_x19);
  return auVar2;
}

