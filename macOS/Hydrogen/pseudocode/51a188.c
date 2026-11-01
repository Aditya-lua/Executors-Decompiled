
void FUN_0051a188(void)

{
  long lVar1;
  undefined8 *puVar2;
  
  func_0x00187bd4();
  __Unwind_Resume();
  lVar1 = func_0x00187bd0(0x228,8);
  if (lVar1 != 0) {
    return;
  }
  func_0x007a1f18(8,0x228);
  lVar1 = func_0x00187bd0(0x1c8,8);
  if (lVar1 != 0) {
    return;
  }
  func_0x007a1f18(8,0x1c8);
  lVar1 = func_0x00187bd0(0x170,8);
  if (lVar1 != 0) {
    return;
  }
  func_0x007a1f18(8,0x170);
  lVar1 = func_0x00187bd0(0x1d0,8);
  if (lVar1 == 0) {
    puVar2 = (undefined8 *)func_0x007a1f18(8,0x1d0);
                    /* WARNING: Could not recover jumptable at 0x0051a28c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (**(code **)(puVar2[1] + 0x18))(*puVar2);
    return;
  }
  return;
}

