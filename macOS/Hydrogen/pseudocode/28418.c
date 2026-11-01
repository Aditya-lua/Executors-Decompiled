
undefined8 FUN_00028418(undefined8 param_1)

{
  int iVar1;
  long *plVar2;
  ulong uVar3;
  long lVar4;
  undefined8 uVar5;
  undefined8 *puVar6;
  undefined1 uStack0000000000000007;
  undefined8 uStack0000000000000008;
  undefined1 uStack0000000000000020;
  undefined1 uStack_31;
  undefined1 **ppuStack_30;
  undefined *puStack_28;
  undefined8 uStack_20;
  long *plStack_18;
  undefined1 *puStack_10;
  undefined8 uStack_8;
  
  plVar2 = (long *)func_0x006e33ec(param_1,1);
  uVar3 = func_0x0000b86c();
  if ((((uVar3 & 1) != 0) && (uVar3 = func_0x0000b86c(*plVar2), (uVar3 & 1) != 0)) &&
     (uVar3 = func_0x0000b86c(*(undefined8 *)(*(long *)(*plVar2 + 0x30) + 0x70)), (uVar3 & 1) != 0))
  {
    iVar1 = *(int *)(*(long *)(*(long *)(*plVar2 + 0x30) + 0x70) + 0x14);
    uStack0000000000000008 = plVar2;
    lVar4 = func_0x0002791c(0xa33330,plVar2,&UNK_0080364f,&uStack0000000000000008,
                            &uStack0000000000000007);
    *(long *)(lVar4 + 0x18) = (long)iVar1;
    *(undefined4 *)(*(long *)(*(long *)(*plVar2 + 0x30) + 0x70) + 0x14) = uRam0000000000a33388;
    return 0;
  }
  uVar5 = func_0x006e644c(param_1,"Connection object has been destroyed!");
  uStack_8 = 0x284c8;
  uStack_20 = param_1;
  plStack_18 = plVar2;
  puStack_10 = &uStack0000000000000020;
  puVar6 = (undefined8 *)func_0x006e33ec(uVar5,1);
  uVar3 = func_0x0000b86c();
  if (((uVar3 & 1) == 0) || (uVar3 = func_0x0000b86c(*puVar6), (uVar3 & 1) == 0)) {
    uVar5 = func_0x006e644c(uVar5,"Connection object has been destroyed!");
    puStack_28 = &DAT_00028520;
    ppuStack_30 = &puStack_10;
    uVar5 = func_0x00028544(&uStack_31,uVar5);
    return uVar5;
  }
  *(undefined4 *)*puVar6 = 0;
  return 0;
}

