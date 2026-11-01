
undefined8 FUN_00465bc8(undefined8 *param_1)

{
  int iVar1;
  undefined8 uVar2;
  undefined *puVar3;
  undefined8 uVar4;
  code *UNRECOVERED_JUMPTABLE;
  undefined8 *puVar5;
  long unaff_x29;
  
  if ((*(byte *)(param_1 + 1) & 1) != 0) {
    return 1;
  }
  puVar5 = (undefined8 *)*param_1;
  if ((*(byte *)((long)param_1 + 9) & 1) == 0) {
    uVar2 = *puVar5;
    UNRECOVERED_JUMPTABLE = *(code **)(puVar5[1] + 0x18);
    puVar3 = &UNK_00893e3b;
    uVar4 = 3;
  }
  else {
    if (*(char *)((long)puVar5 + 0x12) < '\0') {
      *(undefined1 *)(unaff_x29 + -0x11) = 1;
      iVar1 = func_0x004650d8();
      if (iVar1 == 0) {
        uVar2 = (**(code **)(puVar5[1] + 0x18))(*puVar5,&UNK_00893e43,1);
        return uVar2;
      }
      return 1;
    }
    uVar2 = *puVar5;
    UNRECOVERED_JUMPTABLE = *(code **)(puVar5[1] + 0x18);
    puVar3 = &UNK_00893e3e;
    uVar4 = 5;
  }
                    /* WARNING: Could not recover jumptable at 0x00465c30. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar2 = (*UNRECOVERED_JUMPTABLE)(uVar2,puVar3,uVar4);
  return uVar2;
}

