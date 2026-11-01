
ulong FUN_0019b620(void)

{
  undefined8 *puVar1;
  ulong uVar2;
  long lVar3;
  undefined8 uStack_28;
  undefined1 *puStack_20;
  undefined8 uStack_18;
  
  func_0x0019fb28();
  _CFRelease();
  puVar1 = (undefined8 *)__Unwind_Resume();
  uVar2 = _SecKeyCopyAttributes(*puVar1);
  if (uVar2 == 0) {
    puVar1 = (undefined8 *)func_0x007a11c0(&UNK_0081c6e6,0x22,&UNK_009c1c10);
    uStack_18 = 0x19b674;
    uStack_28 = 0;
    puStack_20 = (undefined1 *)((long)register0x00000008 + -0x10);
    lVar3 = _SecKeyCopyExternalRepresentation(*puVar1,&uStack_28);
    return (ulong)(lVar3 != 0);
  }
  return uVar2;
}

