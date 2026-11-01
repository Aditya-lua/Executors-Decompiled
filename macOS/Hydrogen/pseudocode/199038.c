
ulong FUN_00199038(undefined8 param_1)

{
  uint uVar1;
  undefined8 *puVar2;
  ulong uVar3;
  undefined8 in_stack_00000008;
  char cStack_11;
  
  _CFRelease(in_stack_00000008);
  puVar2 = (undefined8 *)__Unwind_Resume(param_1);
  cStack_11 = '\0';
  uVar1 = _SecTrustGetNetworkFetchAllowed(*puVar2,&cStack_11);
  if (uVar1 == 0) {
    uVar3 = (ulong)(cStack_11 != '\0') << 8;
  }
  else {
    uVar3 = 0;
  }
  return uVar3 | (ulong)uVar1 << 0x20 | (ulong)(uVar1 != 0);
}

