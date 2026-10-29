/* 7ff70c8f5070 FUN_7ff70c8f5070 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 * FUN_7ff70c8f5070(undefined8 *param_1)

{
  code *pcVar1;
  int iVar2;
  undefined8 uVar3;
  undefined8 *puVar4;
  
  FUN_7ff70cb12b80(param_1,0,0x120);
  iVar2 = FUN_7ff70cb12570(0x7ff70cbebaf8);
  if (iVar2 == 0) {
    if (_DAT_7ff70cbebb44 != 0x7fffffff) {
      uVar3 = FUN_7ff70c8f1dd0();
      *param_1 = uVar3;
      FUN_7ff70cb12580(0x7ff70cbebaf8);
      return param_1;
    }
  }
  else {
    FUN_7ff70cb124d0(5);
  }
  _DAT_7ff70cbebb44 = 0x7ffffffe;
  FUN_7ff70cb124d0(6);
  pcVar1 = (code *)swi(3);
  puVar4 = (undefined8 *)(*pcVar1)();
  return puVar4;
}


