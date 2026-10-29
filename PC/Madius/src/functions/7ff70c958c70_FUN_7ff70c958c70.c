/* 7ff70c958c70 FUN_7ff70c958c70 */

undefined8 FUN_7ff70c958c70(longlong param_1,longlong param_2,undefined8 param_3,code *param_4)

{
  longlong lVar1;
  undefined8 uVar2;
  int iVar3;
  longlong lVar4;
  undefined8 uVar5;
  undefined8 *puVar6;
  undefined1 auStack_48 [24];
  
  if (param_2 == 0) {
    uVar5 = 0;
  }
  else {
    if (*(longlong *)(param_1 + 0xe8) != 0) {
      FUN_7ff70c959850(param_1,5,2);
    }
    FUN_7ff70c992f20(param_2,auStack_48);
    lVar4 = FUN_7ff70c992f40(auStack_48);
    if (lVar4 != 0) {
      do {
        lVar1 = *(longlong *)(lVar4 + 0x18);
        lVar4 = FUN_7ff70c992f40(auStack_48);
        puVar6 = *(undefined8 **)(lVar1 + 0x10);
        while (puVar6 != (undefined8 *)0x0) {
          uVar5 = *puVar6;
          puVar6 = (undefined8 *)puVar6[2];
          iVar3 = (*param_4)(param_1,uVar5,param_3);
          if (iVar3 == 1) {
            uVar2 = 1;
            if (*(longlong *)(param_1 + 0xe8) == 0) {
              return 1;
            }
            goto LAB_7ff70c958d37;
          }
        }
      } while (lVar4 != 0);
    }
    uVar5 = 0;
    uVar2 = 0;
    if (*(longlong *)(param_1 + 0xe8) != 0) {
LAB_7ff70c958d37:
      uVar5 = uVar2;
      FUN_7ff70c959890(param_1,5);
    }
  }
  return uVar5;
}


