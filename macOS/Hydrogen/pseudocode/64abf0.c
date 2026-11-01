
void FUN_0064abf0(undefined8 param_1,undefined8 param_2,long param_3)

{
  long lVar1;
  int extraout_w1;
  undefined4 extraout_w1_00;
  undefined4 extraout_var;
  ulong uVar2;
  undefined8 *puVar3;
  long unaff_x29;
  
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x18)) {
    return;
  }
  ___stack_chk_fail();
  if (extraout_w1 == 0) {
    __Unwind_Resume();
  }
  func_0x0001753c();
  puVar3 = *(undefined8 **)(CONCAT44(extraout_var,extraout_w1_00) + 0x20);
  if (puVar3 != *(undefined8 **)(param_3 + 0x20)) {
    do {
      puVar3[6] = &UNK_009f5d60;
      lVar1 = puVar3[10];
      uVar2 = puVar3[8];
      if ((ulong)puVar3[9] <= (ulong)puVar3[8]) {
        uVar2 = puVar3[9];
      }
      if (lVar1 != 0) {
        if (uVar2 != 0) {
          do {
            *(undefined8 *)(lVar1 + -8 + uVar2 * 8) = 0;
            uVar2 = uVar2 - 1;
          } while (uVar2 != 0);
        }
        func_0x00611644();
      }
      *puVar3 = &UNK_009f5d60;
      lVar1 = puVar3[4];
      uVar2 = puVar3[2];
      if ((ulong)puVar3[3] <= (ulong)puVar3[2]) {
        uVar2 = puVar3[3];
      }
      if (lVar1 != 0) {
        if (uVar2 != 0) {
          do {
            *(undefined8 *)(lVar1 + -8 + uVar2 * 8) = 0;
            uVar2 = uVar2 - 1;
          } while (uVar2 != 0);
        }
        func_0x00611644();
      }
      puVar3 = (undefined8 *)(*(long *)(CONCAT44(extraout_var,extraout_w1_00) + 0x20) + 0x70);
      *(undefined8 **)(CONCAT44(extraout_var,extraout_w1_00) + 0x20) = puVar3;
    } while (puVar3 != *(undefined8 **)(param_3 + 0x20));
  }
  return;
}

