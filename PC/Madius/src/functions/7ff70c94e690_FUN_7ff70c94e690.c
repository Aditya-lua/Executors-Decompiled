/* 7ff70c94e690 FUN_7ff70c94e690 */

void FUN_7ff70c94e690(longlong param_1,longlong param_2)

{
  longlong lVar1;
  longlong lVar2;
  int iVar3;
  longlong lVar4;
  longlong lStack_30;
  
  if (((param_1 != 0) && (lVar2 = *(longlong *)(param_1 + 0xd8), lVar2 != 0)) && (param_2 != -1)) {
    lVar1 = lVar2 + 0xe0;
    lStack_30 = param_2;
    lVar4 = FUN_7ff70c992c00(lVar1,&lStack_30,8);
    if (lVar4 != 0) {
      if (*(code **)(lVar2 + 0x80) == (code *)0x0) {
        lStack_30 = param_2;
        FUN_7ff70c992c80(lVar4);
        FUN_7ff70c992b70(lVar1,&lStack_30,8);
      }
      else {
        *(undefined1 *)(lVar2 + 0x1b3) = 1;
        iVar3 = (**(code **)(lVar2 + 0x80))
                          (param_1,param_2,4,*(undefined8 *)(lVar2 + 0x88),
                           *(undefined8 *)(lVar4 + 0x38));
        *(undefined1 *)(lVar2 + 0x1b3) = 0;
        lStack_30 = param_2;
        FUN_7ff70c992c80(lVar4);
        FUN_7ff70c992b70(lVar1,&lStack_30,8);
        if (iVar3 == -1) {
          *(undefined1 *)(lVar2 + 0x1b4) = 1;
        }
      }
    }
  }
  return;
}


