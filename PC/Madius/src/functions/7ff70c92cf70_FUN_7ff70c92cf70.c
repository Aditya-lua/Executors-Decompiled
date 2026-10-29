/* 7ff70c92cf70 FUN_7ff70c92cf70 */

longlong FUN_7ff70c92cf70(longlong param_1)

{
  longlong lVar1;
  undefined8 *puVar2;
  undefined8 *puVar3;
  longlong lVar4;
  undefined4 uVar5;
  undefined8 uVar6;
  
  uVar6 = 0xfffffffffffffffe;
  puVar2 = (undefined8 *)FUN_7ff70ca8ff40(0x28);
  *(undefined4 *)(puVar2 + 1) = 0xd;
  *(undefined8 *)((longlong)puVar2 + 0xc) = 0;
  *(undefined4 *)((longlong)puVar2 + 0x14) = 0;
  *puVar2 = &UNK_7ff70cb46760;
  *(undefined4 *)(puVar2 + 4) = 0;
  lVar4 = *(longlong *)(param_1 + 0x40);
  puVar2[3] = lVar4;
  lVar1 = *(longlong *)(lVar4 + 0x10);
  if (lVar1 != 0) {
    puVar2[2] = lVar1;
    *(undefined8 **)(lVar1 + 0x18) = puVar2;
    lVar4 = *(longlong *)(param_1 + 0x40);
  }
  *(undefined8 **)(lVar4 + 0x10) = puVar2;
  *(undefined8 **)(param_1 + 0x40) = puVar2;
  FUN_7ff70c92d390();
  uVar5 = 0xe;
  if (*(int *)(puVar2 + 1) - 8U < 4) {
    uVar5 = *(undefined4 *)(&UNK_7ff70cb46304 + (ulonglong)(*(int *)(puVar2 + 1) - 8U) * 4);
  }
  puVar3 = (undefined8 *)FUN_7ff70ca8ff40(0x28);
  *(undefined4 *)(puVar3 + 1) = uVar5;
  *(undefined8 *)((longlong)puVar3 + 0xc) = 0;
  *(undefined4 *)((longlong)puVar3 + 0x14) = 0;
  *puVar3 = &UNK_7ff70cb46a78;
  puVar3[4] = puVar2;
  lVar4 = *(longlong *)(param_1 + 0x40);
  puVar3[3] = lVar4;
  lVar1 = *(longlong *)(lVar4 + 0x10);
  if (lVar1 != 0) {
    puVar3[2] = lVar1;
    *(undefined8 **)(lVar1 + 0x18) = puVar3;
    lVar4 = *(longlong *)(param_1 + 0x40);
  }
  *(undefined8 **)(lVar4 + 0x10) = puVar3;
  *(undefined8 **)(param_1 + 0x40) = puVar3;
  puVar2 = (undefined8 *)FUN_7ff70ca8ff40(0x20);
  *puVar2 = &UNK_7ff70cb46710;
  *(undefined4 *)(puVar2 + 1) = 0x15;
  *(undefined8 *)((longlong)puVar2 + 0xc) = 0;
  *(undefined4 *)((longlong)puVar2 + 0x14) = 0;
  puVar2[3] = puVar3;
  lVar4 = puVar3[2];
  if (lVar4 != 0) {
    puVar2[2] = lVar4;
    *(undefined8 **)(lVar4 + 0x18) = puVar2;
    puVar3 = *(undefined8 **)(param_1 + 0x40);
  }
  puVar3[2] = puVar2;
  *(undefined8 **)(param_1 + 0x40) = puVar2;
  lVar4 = *(longlong *)(param_1 + 0x38);
  *(undefined4 *)(lVar4 + 0x20) = *(undefined4 *)(param_1 + 0x68);
  *(int *)(lVar4 + 0x28) = *(int *)(param_1 + 0x10) + 1;
  FUN_7ff70c92d6f0(param_1,lVar4,0,0,1,param_1,uVar6);
  return lVar4;
}


