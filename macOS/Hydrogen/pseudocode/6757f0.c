
/* WARNING: Removing unreachable block (ram,0x00675860) */

void FUN_006757f0(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined4 *param_4)

{
  ulong uVar1;
  undefined1 auVar2 [16];
  
  auVar2 = __Unwind_Resume();
  if ((*(undefined **)(PTR___ZTIi_009b0170 + 8) == &UNK_008c1a46) &&
     (uVar1 = func_0x0060dff4(param_3,param_4,auVar2._0_8_ + 0x20), (uVar1 & 1) != 0)) {
    return;
  }
  func_0x0003eef0(auVar2._8_8_,&UNK_00a0f060,param_3);
  *param_4 = *(undefined4 *)(auVar2._0_8_ + 0x20);
  return;
}

