/* 7ff70c9412d0 FUN_7ff70c9412d0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c9412d0(longlong param_1,undefined8 param_2)

{
  code *pcVar1;
  int iVar2;
  undefined4 uVar3;
  longlong lVar4;
  undefined2 auStack_128 [136];
  
  if ((*(char *)(param_1 + 0xa37) != '\0') || (*(longlong *)(param_1 + 0x1e8) != 0)) {
    iVar2 = FUN_7ff70c95afa0(auStack_128,0x100,param_2);
    if ((*(longlong *)(param_1 + 0x1e8) != 0) && (*(char *)(param_1 + 0x12bf) == '\0')) {
      FUN_7ff70cb12e70(*(longlong *)(param_1 + 0x1e8),auStack_128);
      *(undefined1 *)(param_1 + 0x12bf) = 1;
    }
    pcVar1 = _DAT_7ff70cb96448;
    *(undefined2 *)((longlong)auStack_128 + (longlong)iVar2) = 10;
    if (*(char *)(param_1 + 0xa37) == '\x01') {
      lVar4 = (longlong)iVar2 + 1;
      if (*(longlong *)(param_1 + 0x268) == 0) {
        (*_DAT_7ff70cb96448)(&UNK_7ff70cb4fc10,2,1,*(undefined8 *)(param_1 + 0x1d8));
        (*pcVar1)(auStack_128,lVar4,1,*(undefined8 *)(param_1 + 0x1d8));
      }
      else {
        uVar3 = FUN_7ff70c94f050(param_1);
        FUN_7ff70c94f020(param_1,1);
        (**(code **)(param_1 + 0x268))(param_1,0,auStack_128,lVar4,*(undefined8 *)(param_1 + 0x1e0))
        ;
        FUN_7ff70c94f020(param_1,uVar3);
      }
    }
  }
  return;
}


