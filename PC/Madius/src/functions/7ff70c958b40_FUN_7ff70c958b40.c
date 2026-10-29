/* 7ff70c958b40 FUN_7ff70c958b40 */

void FUN_7ff70c958b40(longlong param_1,longlong param_2,char param_3)

{
  longlong lVar1;
  longlong lVar2;
  longlong lVar3;
  longlong *plVar4;
  undefined1 auStack_48 [24];
  
  lVar1 = *(longlong *)(param_2 + 0x5d8);
  if (lVar1 != 0) {
    lVar2 = *(longlong *)(param_1 + 0xbf8);
    if ((param_3 != '\0') && (*(longlong *)(param_1 + 0xe8) != 0)) {
      FUN_7ff70c959850(param_1,5,2);
    }
    plVar4 = *(longlong **)(lVar1 + 0x10);
    if (plVar4 != (longlong *)0x0) {
      do {
        if (*plVar4 == param_2) {
          FUN_7ff70c991030(lVar1 + 0x10,plVar4,0);
          *(longlong *)(lVar1 + 8) = *(longlong *)(lVar1 + 8) + -1;
          *(undefined8 *)(param_2 + 0x5d8) = 0;
          if (*(longlong *)(lVar1 + 8) != 0) goto LAB_7ff70c958c28;
          goto LAB_7ff70c958bd8;
        }
        plVar4 = (longlong *)plVar4[2];
      } while (plVar4 != (longlong *)0x0);
    }
    if (*(longlong *)(lVar1 + 8) == 0) {
LAB_7ff70c958bd8:
      if (lVar2 != 0) {
        FUN_7ff70c992f20(lVar2,auStack_48);
        lVar3 = FUN_7ff70c992f40(auStack_48);
        if (lVar3 != 0) {
          do {
            if (*(longlong *)(lVar3 + 0x18) == lVar1) {
              FUN_7ff70c992b70(lVar2,lVar3 + 0x28,*(undefined8 *)(lVar3 + 0x20));
              break;
            }
            lVar3 = FUN_7ff70c992f40(auStack_48);
          } while (lVar3 != 0);
        }
      }
    }
LAB_7ff70c958c28:
    *(undefined8 *)(param_2 + 0x5d8) = 0;
    if (lVar2 != 0) {
      *(longlong *)(lVar2 + 0x30) = *(longlong *)(lVar2 + 0x30) + -1;
    }
    if ((param_3 != '\0') && (*(longlong *)(param_1 + 0xe8) != 0)) {
      FUN_7ff70c959890(param_1,5);
    }
  }
  return;
}


