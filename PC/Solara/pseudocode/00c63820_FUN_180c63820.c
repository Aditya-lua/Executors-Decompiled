/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_180c63820(longlong param_1,undefined8 param_2,ulonglong param_3,int param_4)

{
  undefined8 *puVar1;
  undefined1 *puVar2;
  undefined8 uVar3;
  ulonglong uVar4;
  int iVar5;
  longlong lVar6;
  longlong lVar7;
  undefined8 unaff_RBX;
  undefined1 *puVar8;
  undefined1 *puVar9;
  undefined8 unaff_RSI;
  undefined8 unaff_RDI;
  undefined8 unaff_R14;
  longlong lStackX_18;
  int aiStackX_20 [2];
  undefined8 uStack_10;
  
  uStack_10 = 0x180c6382c;
  lVar6 = FUN_180e15b20();
  lVar6 = -lVar6;
  puVar8 = &stack0xfffffffffffffff8 + lVar6;
  puVar1 = (undefined8 *)(&stack0x00000028 + lVar6);
  *(undefined8 *)(&stack0x00000048 + lVar6) = unaff_RBX;
  *(undefined8 *)(&stack0x00000050 + lVar6) = unaff_RSI;
  *(undefined8 *)(&stack0x00000058 + lVar6) = unaff_RDI;
  *(undefined8 *)(&stack0x00000060 + lVar6) = unaff_R14;
  *(ulonglong *)(&stack0x00000030 + lVar6) = _DAT_1810c1700 ^ (ulonglong)puVar1;
  *(undefined8 *)((longlong)&uStack_10 + lVar6) = 0x180c63870;
  FUN_180c63110();
  if (param_4 == 0) {
LAB_180c63918:
    *(undefined8 *)(puVar8 + -8) = 0x180c6392d;
    lVar7 = FUN_180c18260(param_2,&UNK_180f8c6a0,0x692);
    puVar9 = puVar8;
    if (lVar7 != 0) {
      uVar3 = *(undefined8 *)(param_1 + 0x18);
      *(undefined8 *)(puVar8 + -8) = 0x180c6394f;
      FUN_180c14420(uVar3,&UNK_180f8c6a0,0x695);
      *(longlong *)(param_1 + 0x18) = lVar7;
      *(int *)(param_1 + 0x20) = (int)param_3;
    }
  }
  else {
    *(undefined4 *)((longlong)aiStackX_20 + lVar6) = 0;
    *(undefined8 *)((longlong)&lStackX_18 + lVar6) = 0;
    *(undefined8 *)((longlong)&uStack_10 + lVar6) = 0x180c63896;
    iVar5 = MultiByteToWideChar(0,0,param_2,0xffffffff);
    puVar9 = &stack0xfffffffffffffff8 + lVar6;
    if (iVar5 != 0) {
      *(undefined8 *)((longlong)&uStack_10 + lVar6) = 0x180c638c1;
      lVar7 = FUN_180e15b20();
      lVar7 = -lVar7;
      puVar8 = &stack0xfffffffffffffff8 + lVar7 + lVar6;
      *(int *)((longlong)aiStackX_20 + lVar7 + lVar6) = iVar5;
      puVar2 = &stack0x00000028 + lVar7 + lVar6;
      *(undefined1 **)((longlong)&lStackX_18 + lVar7 + lVar6) = puVar2;
      *(undefined8 *)((longlong)&uStack_10 + lVar7 + lVar6) = 0x180c638e5;
      MultiByteToWideChar(0,0,param_2,0xffffffff);
      puVar9 = &stack0xfffffffffffffff8 + lVar7 + lVar6;
      if (puVar2 != (undefined1 *)0x0) {
        *(undefined4 *)((longlong)&lStackX_18 + lVar7 + lVar6) = 0xf0000000;
        *(undefined8 *)((longlong)&uStack_10 + lVar7 + lVar6) = 0x180c63908;
        iVar5 = CryptAcquireContextW(puVar1,0,puVar2,param_3 & 0xffffffff);
        puVar9 = &stack0xfffffffffffffff8 + lVar7 + lVar6;
        if (iVar5 != 0) {
          uVar3 = *puVar1;
          *(undefined8 *)((longlong)&uStack_10 + lVar7 + lVar6) = 0x180c63918;
          CryptReleaseContext(uVar3,0);
          goto LAB_180c63918;
        }
      }
    }
    if (_DAT_1810cfa98 == 0) {
      *(undefined8 *)(puVar9 + -8) = 0x180c6398c;
      _DAT_1810cfa98 = FUN_180c153b0();
    }
    *(undefined8 *)(puVar9 + -8) = 0x180c63997;
    FUN_180c14970();
    *(undefined8 *)(puVar9 + -8) = 0x180c639af;
    FUN_180c14a90(&UNK_180f8c650,0x5c,&UNK_180f8c640);
    *(undefined8 *)(puVar9 + -8) = 0x180c639c2;
    FUN_180c14bc0(_DAT_1810cfa98,0x68,0);
    *(undefined8 *)(puVar9 + -8) = 0x180c639d6;
    FUN_180c14a90(&UNK_180f8c6a0,0x68c,0);
    *(undefined8 *)(puVar9 + -8) = 0x180c639db;
    FUN_180c63290();
  }
  uVar4 = *(ulonglong *)(&stack0x00000030 + lVar6);
  *(undefined8 *)(puVar9 + -8) = 0x180c63968;
  FUN_180e155e0(uVar4 ^ (ulonglong)puVar1);
  return;
}


