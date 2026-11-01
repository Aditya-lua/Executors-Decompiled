
/* WARNING: Removing unreachable block (ram,0x00054268) */

void FUN_000541f4(long param_1)

{
  bool in_ZR;
  undefined8 uVar1;
  undefined1 uStack0000000000000040;
  undefined1 uStack_11;
  
  if (in_ZR && param_1 != 0) {
    do {
      *(undefined8 *)(&uStack0000000000000040 + param_1 * 8) = 0;
      param_1 = param_1 + -1;
    } while (param_1 != 0);
  }
  uVar1 = __Unwind_Resume();
  func_0x0005429c(&uStack_11,uVar1);
  return;
}

