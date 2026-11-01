undefined8 FUN_180e93660(undefined8 param_1,undefined8 param_2)

{
  undefined8 uVar1;
  undefined8 uVar2;
  int iVar3;
  undefined8 *puVar4;
  longlong lVar5;
  longlong lVar6;
  undefined4 *puVar7;
  ulonglong uVar8;
  undefined8 uStack_48;
  undefined8 uStack_40;
  undefined4 uStack_38;
  undefined4 uStack_34;
  undefined4 uStack_30;
  undefined4 uStack_2c;
  undefined1 auStack_28 [32];
  
  puVar4 = (undefined8 *)FUN_180e77ac0(&uStack_38);
  uVar1 = *puVar4;
  uVar2 = puVar4[1];
  lVar5 = FUN_180e62c90(param_1);
  lVar6 = FUN_180e62c90(param_2);
  iVar3 = MoveFileExW(lVar5,lVar6,1);
  while( true ) {
    if (iVar3 != 0) {
      if (lVar5 != 0) {
        func_0x000180e1d9d0(lVar5);
      }
      if (lVar6 != 0) {
        func_0x000180e1d9d0(lVar6);
      }
      return 0;
    }
    uStack_48 = uVar1;
    uStack_40 = uVar2;
    puVar7 = (undefined4 *)FUN_180e77ac0(auStack_28);
    uStack_38 = *puVar7;
    uStack_34 = puVar7[1];
    uStack_30 = puVar7[2];
    uStack_2c = puVar7[3];
    uVar8 = func_0x000180e77b50(&uStack_38,&uStack_48);
    if (1000 < uVar8) break;
    Sleep(1);
    iVar3 = MoveFileExW(lVar5,lVar6,1);
  }
  if (lVar5 != 0) {
    func_0x000180e1d9d0(lVar5);
  }
  if (lVar6 != 0) {
    func_0x000180e1d9d0(lVar6);
  }
  return 1;
}


