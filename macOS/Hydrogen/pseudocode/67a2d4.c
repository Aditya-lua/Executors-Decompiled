
/* WARNING: Possible PIC construction at 0x0067a3b4: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0067a3b8) */

undefined8 * FUN_0067a2d4(long param_1)

{
  undefined8 *puVar1;
  ulong uVar2;
  ulong in_x9;
  long unaff_x29;
  undefined1 auVar3 [12];
  undefined1 uStack0000000000000008;
  ulong in_stack_00000030;
  ulong in_stack_00000038;
  long in_stack_00000040;
  undefined8 uStack0000000000000048;
  
  do {
    *(undefined1 *)((in_x9 | 7) + param_1) = 0;
    param_1 = param_1 + -1;
  } while (param_1 != 0);
  uVar2 = in_stack_00000030;
  if (in_stack_00000038 <= in_stack_00000030) {
    uVar2 = in_stack_00000038;
  }
  puVar1 = (undefined8 *)0x0;
  if (in_stack_00000040 != 0) {
    if (uVar2 != 0) {
      do {
        *(undefined8 *)(in_stack_00000040 + -8 + uVar2 * 8) = 0;
        uVar2 = uVar2 - 1;
      } while (uVar2 != 0);
    }
    puVar1 = (undefined8 *)func_0x00611644();
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
    return puVar1;
  }
  auVar3 = ___stack_chk_fail();
  if (auVar3._8_4_ == 0) {
    puVar1 = (undefined8 *)__Unwind_Resume(auVar3._0_8_);
  }
  else {
    func_0x0001753c(auVar3._0_8_);
    func_0x0062a89c(&uStack0000000000000008);
    puVar1 = &uStack0000000000000048;
  }
  *puVar1 = &UNK_00a14f18;
  if ((long *)puVar1[0xf] != (long *)0x0) {
    (**(code **)(*(long *)puVar1[0xf] + 8))();
  }
  uVar2 = puVar1[0xc];
  if ((ulong)puVar1[0xd] <= (ulong)puVar1[0xc]) {
    uVar2 = puVar1[0xd];
  }
  if ((undefined8 *)puVar1[0xe] == puVar1 + 7) {
    *(undefined1 *)((long)puVar1 + 0x59) = 0;
    for (; uVar2 != 0; uVar2 = uVar2 - 1) {
      *(undefined1 *)((long)puVar1 + uVar2 + 0x37) = 0;
    }
  }
  uVar2 = puVar1[4];
  if ((ulong)puVar1[5] <= (ulong)puVar1[4]) {
    uVar2 = puVar1[5];
  }
  if ((undefined8 *)puVar1[6] == puVar1 + 1) {
    *(undefined1 *)((long)puVar1 + 0x19) = 0;
    for (; uVar2 != 0; uVar2 = uVar2 - 1) {
      *(undefined1 *)((long)puVar1 + uVar2 + 7) = 0;
    }
  }
  return puVar1;
}

