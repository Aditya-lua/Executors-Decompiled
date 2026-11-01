
void FUN_0073082c(undefined4 param_1,undefined4 *param_2)

{
  int iVar1;
  undefined4 *puVar2;
  undefined1 uStack0000000000000008;
  undefined4 uStack000000000000000c;
  
  _uStack0000000000000008 = 4;
  uStack000000000000000c = 0;
  puVar2 = &uStack000000000000000c;
  iVar1 = _getsockopt(param_1,0xffff,"rks/CoreFoundation.framework/Versions/A/CoreFoundation",
                      &uStack000000000000000c,&uStack0000000000000008);
  if (iVar1 != 0) {
    puVar2 = (undefined4 *)___error();
  }
  if (param_2 != (undefined4 *)0x0) {
    *param_2 = *puVar2;
  }
  return;
}

