
void FUN_00680a58(long param_1,long *param_2)

{
  long lVar1;
  ulong uVar2;
  long in_x9;
  undefined8 *unaff_x19;
  
  param_2[-1] = in_x9;
  *param_2 = param_1 + 0x1c0;
  lVar1 = param_2[0xb];
  uVar2 = unaff_x19[9];
  if ((ulong)unaff_x19[10] <= (ulong)unaff_x19[9]) {
    uVar2 = unaff_x19[10];
  }
  if (lVar1 != 0) {
    if (uVar2 != 0) {
      do {
        *(undefined1 *)(lVar1 + -1 + uVar2) = 0;
        uVar2 = uVar2 - 1;
      } while (uVar2 != 0);
    }
    func_0x00611644();
  }
  unaff_x19[-1] = &UNK_00a0c238;
  *unaff_x19 = &UNK_00a0c3e0;
  if ((long *)unaff_x19[2] != (long *)0x0) {
    (**(code **)(*(long *)unaff_x19[2] + 8))();
  }
  return;
}

