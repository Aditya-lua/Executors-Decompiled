
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_000495ac(void)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  long lVar4;
  undefined8 *puVar5;
  
  lVar4 = __Unwind_Resume();
  uVar3 = _UNK_008c67a8;
  uVar2 = _UNK_008c67a0;
  uVar1 = _UNK_008c6790;
  puVar5 = *(undefined8 **)(lVar4 + 200);
  puVar5[1] = _UNK_008c6798;
  *puVar5 = uVar1;
  puVar5[3] = uVar3;
  puVar5[2] = uVar2;
  return;
}

