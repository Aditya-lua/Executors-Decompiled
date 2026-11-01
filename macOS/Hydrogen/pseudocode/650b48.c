
/* WARNING: Possible PIC construction at 0x00650bb0: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00650bb4) */
/* WARNING: Removing unreachable block (ram,0x00650bc8) */
/* WARNING: Removing unreachable block (ram,0x00650be8) */
/* WARNING: Removing unreachable block (ram,0x00650c08) */
/* WARNING: Removing unreachable block (ram,0x00650c18) */
/* WARNING: Removing unreachable block (ram,0x00650c1c) */
/* WARNING: Removing unreachable block (ram,0x00650c24) */
/* WARNING: Removing unreachable block (ram,0x00650bd4) */

undefined8 * FUN_00650b48(long param_1,undefined8 param_2,long param_3)

{
  undefined8 uVar1;
  undefined8 *puVar2;
  ulong in_x9;
  long in_x10;
  ulong uVar3;
  long unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long lVar4;
  undefined1 auVar5 [16];
  undefined8 uStack0000000000000018;
  undefined8 *in_stack_00000020;
  undefined8 *in_stack_00000028;
  long in_stack_00000030;
  long *in_stack_00000038;
  
  if (in_x10 == 0) {
    in_stack_00000038 = (long *)(unaff_x19 + 0x10);
    uVar3 = *in_stack_00000038 - param_1 >> 6;
    if (uVar3 <= in_x9) {
      uVar3 = in_x9;
    }
    if (0x7fffffffffffff7f < (ulong)(*in_stack_00000038 - param_1)) {
      uVar3 = 0x1ffffffffffffff;
    }
    if (uVar3 == 0) {
      uStack0000000000000018 = 0;
    }
    else {
      unaff_x20 = param_3;
      if (uVar3 >> 0x39 != 0) goto LAB_00650c4c;
      uStack0000000000000018 = __Znwm(uVar3 << 7);
    }
    puVar2 = (undefined8 *)(uStack0000000000000018 + unaff_x21 * 0x80);
    in_stack_00000030 = uStack0000000000000018 + uVar3 * 0x80;
    in_stack_00000020 = puVar2;
    in_stack_00000028 = puVar2;
  }
  else {
    func_0x00017f90();
LAB_00650c4c:
    uVar1 = func_0x00017514();
    func_0x006509ac(&uStack0000000000000018);
    uVar1 = __Unwind_Resume(uVar1);
    if (unaff_x21 != -0x80) {
      lVar4 = unaff_x21 + 0x80;
      do {
        func_0x00650db0(unaff_x20 + lVar4);
        lVar4 = lVar4 + 0x80;
      } while (lVar4 != 0);
    }
    func_0x006509ac(&uStack0000000000000018);
    auVar5 = __Unwind_Resume(uVar1);
    param_3 = auVar5._8_8_;
    puVar2 = auVar5._0_8_;
  }
  *puVar2 = &UNK_00a09a70;
  func_0x00675bac(puVar2 + 1,param_3 + 8);
  func_0x00675bac(puVar2 + 5,param_3 + 0x28);
  *(undefined1 *)(puVar2 + 9) = *(undefined1 *)(param_3 + 0x48);
  func_0x005fe0b4(puVar2 + 10,param_3 + 0x50);
  return puVar2;
}

