/* 7ff70c941400 FUN_7ff70c941400 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c941400(longlong param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  code *pcVar1;
  int iVar2;
  undefined4 uVar3;
  longlong lVar4;
  undefined8 uStackX_18;
  undefined8 uStackX_20;
  undefined8 *puVar5;
  undefined2 auStack_828 [1032];
  
  if ((param_1 != 0) && (*(char *)(param_1 + 0xa37) == '\x01')) {
    puVar5 = &uStackX_18;
    uStackX_18 = param_3;
    uStackX_20 = param_4;
    iVar2 = FUN_7ff70c95afa0(auStack_828,0x800,param_2);
    pcVar1 = _DAT_7ff70cb96448;
    *(undefined2 *)((longlong)auStack_828 + (longlong)iVar2) = 10;
    if (*(char *)(param_1 + 0xa37) == '\x01') {
      lVar4 = (longlong)iVar2 + 1;
      if (*(longlong *)(param_1 + 0x268) == 0) {
        (*_DAT_7ff70cb96448)(&UNK_7ff70cb4fc10,2,1,*(undefined8 *)(param_1 + 0x1d8));
        (*pcVar1)(auStack_828,lVar4,1,*(undefined8 *)(param_1 + 0x1d8));
      }
      else {
        uVar3 = FUN_7ff70c94f050(param_1);
        FUN_7ff70c94f020(param_1,1);
        (**(code **)(param_1 + 0x268))
                  (param_1,0,auStack_828,lVar4,*(undefined8 *)(param_1 + 0x1e0),puVar5);
        FUN_7ff70c94f020(param_1,uVar3);
      }
    }
  }
  return;
}


