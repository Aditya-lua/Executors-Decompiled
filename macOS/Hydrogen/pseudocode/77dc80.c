
/* WARNING: Removing unreachable block (ram,0x0077de9c) */
/* WARNING: Removing unreachable block (ram,0x0077dee8) */
/* WARNING: Removing unreachable block (ram,0x0077dea8) */
/* WARNING: Removing unreachable block (ram,0x0077decc) */

void FUN_0077dc80(undefined8 param_1,undefined8 param_2)

{
  long lVar1;
  byte *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long unaff_x29;
  undefined1 auVar2 [16];
  undefined8 uStack0000000000000000;
  undefined8 uStack0000000000000008;
  
  uStack0000000000000000 = param_1;
  uStack0000000000000008 = param_2;
  func_0x0073c9e4();
  *(undefined4 *)(&UNK_00001440 + unaff_x21) = 0x10;
  *unaff_x19 = *(byte *)(unaff_x20 + 0x24) & 1;
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
    return;
  }
  auVar2 = ___stack_chk_fail(0x61);
  lVar1 = auVar2._0_8_;
  *(byte *)(lVar1 + 0x24) = *(byte *)(lVar1 + 0x24) & 0xfe;
  if (*(long *)(lVar1 + 0x10) != 0) {
    (*pcRam0000000000a2b5f0)();
    *(undefined8 *)(lVar1 + 0x10) = 0;
  }
                    /* WARNING: Could not recover jumptable at 0x0077e07c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(**(long **)(lVar1 + 8) + 0x20))(*(long **)(lVar1 + 8),auVar2._8_8_);
  return;
}

