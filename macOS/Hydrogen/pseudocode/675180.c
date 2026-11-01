
void FUN_00675180(void)

{
  long lVar1;
  ulong uVar2;
  undefined8 *unaff_x19;
  
  lVar1 = unaff_x19[10];
  uVar2 = unaff_x19[8];
  if ((ulong)unaff_x19[9] <= (ulong)unaff_x19[8]) {
    uVar2 = unaff_x19[9];
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
  *unaff_x19 = &UNK_00a0c238;
  unaff_x19[1] = &UNK_00a0c3e0;
  if ((long *)unaff_x19[3] != (long *)0x0) {
    (**(code **)(*(long *)unaff_x19[3] + 8))();
  }
  return;
}

