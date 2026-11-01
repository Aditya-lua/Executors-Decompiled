
long FUN_0019bf80(void)

{
  undefined8 *puVar1;
  long lVar2;
  long lVar3;
  undefined *puVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined1 auVar7 [16];
  
  _CFRelease();
  func_0x0019b11c();
  __Unwind_Resume();
  puVar1 = (undefined8 *)func_0x007a2668();
  uVar5 = *(undefined8 *)PTR__kSecValueRef_009b0438;
  uVar6 = *puVar1;
  lVar2 = _CFDictionaryCreateMutable
                    (*(undefined8 *)PTR__kCFAllocatorDefault_009b0238,1,
                     PTR__kCFTypeDictionaryKeyCallBacks_009b0260,
                     PTR__kCFTypeDictionaryValueCallBacks_009b0268);
  if (lVar2 != 0) {
    _CFDictionaryAddValue(lVar2,uVar5,uVar6);
    lVar3 = _SecItemDelete(lVar2);
    _CFRelease(lVar2);
    return lVar3;
  }
  puVar4 = &UNK_009c07c0;
  auVar7 = func_0x007a11c0(&UNK_0081a021,0x22);
  lVar2 = auVar7._0_8_;
  if ((*(ulong *)(lVar2 + 0x20) | 2) == 2) {
    *(long *)(lVar2 + 0x20) = auVar7._8_8_;
    *(undefined **)(lVar2 + 0x28) = puVar4;
    return lVar2;
  }
  _CFRelease(*(undefined8 *)(lVar2 + 0x28));
  *(long *)(lVar2 + 0x20) = auVar7._8_8_;
  *(undefined **)(lVar2 + 0x28) = puVar4;
  return lVar2;
}

