
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_0042cfa0(undefined8 param_1)

{
  undefined8 uVar1;
  byte *pbVar2;
  long *plVar3;
  undefined1 *puVar4;
  undefined1 extraout_w8;
  undefined8 extraout_x9;
  code *extraout_x10;
  long unaff_x27;
  
  if (*(long *)(unaff_x27 + 8) != 0) {
    func_0x00187bd4();
  }
  func_0x00187bd4();
  uVar1 = __Unwind_Resume(param_1);
  if (___ZN3std9panicking11panic_count18GLOBAL_PANIC_COUNT17h44f8b48277a7bf95E < 0) {
    uVar1 = 0;
    ___ZN3std9panicking11panic_count18GLOBAL_PANIC_COUNT17h44f8b48277a7bf95E =
         ___ZN3std9panicking11panic_count18GLOBAL_PANIC_COUNT17h44f8b48277a7bf95E + 1;
  }
  else {
    ___ZN3std9panicking11panic_count18GLOBAL_PANIC_COUNT17h44f8b48277a7bf95E =
         ___ZN3std9panicking11panic_count18GLOBAL_PANIC_COUNT17h44f8b48277a7bf95E + 1;
    pbVar2 = (byte *)(*pcRam0000000000a2bcd0)(uVar1,0xa2bcd0);
    if ((*pbVar2 & 1) == 0) {
      plVar3 = (long *)(*pcRam0000000000a2bcb8)();
      *plVar3 = *plVar3 + 1;
      puVar4 = (undefined1 *)(*extraout_x10)(extraout_x9);
      *puVar4 = extraout_w8;
      uVar1 = 2;
    }
    else {
      uVar1 = 1;
    }
  }
  return uVar1;
}

