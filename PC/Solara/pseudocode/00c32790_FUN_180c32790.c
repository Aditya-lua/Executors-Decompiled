void FUN_180c32790(undefined8 param_1)

{
  int iVar1;
  longlong lVar2;
  ulonglong uVar3;
  longlong lVar4;
  ulonglong uVar5;
  ulonglong uVar6;
  undefined8 uStack_20;
  
  uStack_20 = 0x180c327a8;
  lVar2 = FUN_180e15b20();
  lVar2 = -lVar2;
  *(undefined8 *)((longlong)&uStack_20 + lVar2) = 0x180c327b8;
  uVar3 = FUN_180c32360();
  *(undefined8 *)((longlong)&uStack_20 + lVar2) = 0x180c327c6;
  lVar4 = FUN_180c32240(param_1,uVar3);
  uVar6 = 0;
  if (lVar4 != 0) {
    *(undefined4 *)(&stack0x00000008 + lVar2) = 0xf0000040;
    *(undefined8 *)((longlong)&uStack_20 + lVar2) = 0x180c327f0;
    iVar1 = CryptAcquireContextW(&stack0x00000040 + lVar2,0,0,1);
    uVar5 = uVar6;
    if (iVar1 != 0) {
      *(undefined8 *)((longlong)&uStack_20 + lVar2) = 0x180c32804;
      iVar1 = CryptGenRandom(*(undefined8 *)(&stack0x00000040 + lVar2),uVar3 & 0xffffffff,lVar4);
      if (iVar1 != 0) {
        uVar5 = uVar3;
      }
      *(undefined8 *)((longlong)&uStack_20 + lVar2) = 0x180c32817;
      CryptReleaseContext(*(undefined8 *)(&stack0x00000040 + lVar2),0);
    }
    *(undefined8 *)((longlong)&uStack_20 + lVar2) = 0x180c3282a;
    FUN_180c322f0(param_1,uVar5,uVar5 * 8);
    *(undefined8 *)((longlong)&uStack_20 + lVar2) = 0x180c32832;
    lVar4 = func_0x000180c324b0(param_1);
    if (lVar4 != 0) {
      return;
    }
  }
  *(undefined8 *)((longlong)&uStack_20 + lVar2) = 0x180c32848;
  uVar3 = FUN_180c32360(param_1,1);
  *(undefined8 *)((longlong)&uStack_20 + lVar2) = 0x180c32856;
  lVar4 = FUN_180c32240(param_1,uVar3);
  if (lVar4 != 0) {
    *(undefined4 *)(&stack0x00000008 + lVar2) = 0xf0000040;
    *(undefined8 *)((longlong)&uStack_20 + lVar2) = 0x180c32880;
    iVar1 = CryptAcquireContextW(&stack0x00000040 + lVar2,0,&UNK_180f85500,0x16);
    if (iVar1 != 0) {
      *(undefined8 *)((longlong)&uStack_20 + lVar2) = 0x180c32894;
      iVar1 = CryptGenRandom(*(undefined8 *)(&stack0x00000040 + lVar2),uVar3 & 0xffffffff,lVar4);
      if (iVar1 != 0) {
        uVar6 = uVar3;
      }
      *(undefined8 *)((longlong)&uStack_20 + lVar2) = 0x180c328a7;
      CryptReleaseContext(*(undefined8 *)(&stack0x00000040 + lVar2),0);
    }
    *(undefined8 *)((longlong)&uStack_20 + lVar2) = 0x180c328ba;
    FUN_180c322f0(param_1,uVar6,uVar6 * 8);
    *(undefined8 *)((longlong)&uStack_20 + lVar2) = 0x180c328c2;
    lVar4 = func_0x000180c324b0(param_1);
    if (lVar4 != 0) {
      return;
    }
  }
  *(undefined8 *)((longlong)&uStack_20 + lVar2) = 0x180c328cf;
  func_0x000180c324b0(param_1);
  return;
}


