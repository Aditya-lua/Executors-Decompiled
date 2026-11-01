
/* WARNING: Possible PIC construction at 0x0064c098: Changing call to branch */

undefined8 * FUN_0064c048(undefined8 *param_1,undefined8 param_2,undefined1 *param_3)

{
  long lVar1;
  undefined8 *puVar2;
  int extraout_w1;
  long lVar3;
  ulong uVar4;
  undefined8 *puVar5;
  undefined1 auVar6 [16];
  undefined1 uStack0000000000000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined1 uStack0000000000000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000050;
  long lStack0000000000000058;
  
  lStack0000000000000058 = *(long *)PTR____stack_chk_guard_009b01e8;
  if (*(char *)(param_1 + 3) == '\0') {
    in_stack_00000038 = *(undefined8 *)param_1[2];
    in_stack_00000040 = ((undefined8 *)param_1[2])[1];
    in_stack_00000048 = in_stack_00000038;
    in_stack_00000050 = in_stack_00000040;
    in_stack_00000010 = *(undefined8 *)param_1[1];
    in_stack_00000018 = ((undefined8 *)param_1[1])[1];
    in_stack_00000028 = in_stack_00000018;
    auVar6._8_8_ = &uStack0000000000000030;
    auVar6._0_8_ = *param_1;
    param_3 = &uStack0000000000000008;
    in_stack_00000020 = in_stack_00000010;
  }
  else {
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)PTR____stack_chk_guard_009b01e8) {
      return param_1;
    }
    ___stack_chk_fail();
    if (extraout_w1 == 0) {
      __Unwind_Resume();
    }
    auVar6 = func_0x0001753c();
  }
  lVar3 = auVar6._8_8_;
  puVar2 = auVar6._0_8_;
  puVar5 = *(undefined8 **)(lVar3 + 0x20);
  if (puVar5 != *(undefined8 **)(param_3 + 0x20)) {
    do {
      puVar5[6] = &UNK_009f5d60;
      lVar1 = puVar5[10];
      uVar4 = puVar5[8];
      if ((ulong)puVar5[9] <= (ulong)puVar5[8]) {
        uVar4 = puVar5[9];
      }
      if (lVar1 != 0) {
        if (uVar4 != 0) {
          do {
            *(undefined8 *)(lVar1 + -8 + uVar4 * 8) = 0;
            uVar4 = uVar4 - 1;
          } while (uVar4 != 0);
        }
        func_0x00611644();
      }
      *puVar5 = &UNK_009f5d60;
      lVar1 = puVar5[4];
      uVar4 = puVar5[2];
      if ((ulong)puVar5[3] <= (ulong)puVar5[2]) {
        uVar4 = puVar5[3];
      }
      puVar2 = (undefined8 *)0x0;
      if (lVar1 != 0) {
        if (uVar4 != 0) {
          do {
            *(undefined8 *)(lVar1 + -8 + uVar4 * 8) = 0;
            uVar4 = uVar4 - 1;
          } while (uVar4 != 0);
        }
        puVar2 = (undefined8 *)func_0x00611644();
      }
      puVar5 = (undefined8 *)(*(long *)(lVar3 + 0x20) + 0x60);
      *(undefined8 **)(lVar3 + 0x20) = puVar5;
    } while (puVar5 != *(undefined8 **)(param_3 + 0x20));
  }
  return puVar2;
}

