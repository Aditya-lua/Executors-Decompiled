
undefined8
FUN_00180b90(long param_1,undefined8 param_2,undefined1 param_3 [16],undefined1 param_4 [16],
            undefined1 param_5 [16])

{
  code *pcVar1;
  long lVar2;
  undefined8 *puVar3;
  undefined8 uStack0000000000000008;
  undefined1 uStack0000000000000080;
  
  *(long *)(param_1 + 0x18) = param_3._8_8_;
  *(long *)(param_1 + 0x10) = param_3._0_8_;
  *(long *)(param_1 + 0x28) = param_5._8_8_;
  *(long *)(param_1 + 0x20) = param_5._0_8_;
  _uStack0000000000000080 = param_2;
  uStack0000000000000008 = (long *)func_0x00226f70(&uStack0000000000000080);
  if (uStack0000000000000008 != (long *)0x0) {
    lVar2 = *uStack0000000000000008;
    *uStack0000000000000008 = lVar2 + -1;
    LORelease();
    if (lVar2 == 1) {
      DataMemoryBarrier(2,1);
      func_0x001f9f08(&uStack0000000000000008);
    }
  }
  puVar3 = (undefined8 *)func_0x00226f74();
  if (puVar3 == (undefined8 *)0x0) {
    func_0x007a23bc(&UNK_009bfcf8);
  }
  else {
    lVar2 = *(long *)*puVar3;
    *(long *)*puVar3 = lVar2 + 1;
    if (-1 < lVar2) {
      return *puVar3;
    }
  }
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x180c00);
  (*pcVar1)();
}

