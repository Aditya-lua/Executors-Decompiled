/* 7ff70c9590e0 FUN_7ff70c9590e0 */

void FUN_7ff70c9590e0(longlong param_1)

{
  longlong *plVar1;
  longlong *plVar2;
  longlong lVar3;
  undefined1 auStack_440 [24];
  undefined1 auStack_428 [1032];
  
  if (*(longlong *)(param_1 + 0x58) != 0) {
    plVar1 = (longlong *)(param_1 + 0x58);
    *(undefined1 **)(*(longlong *)(param_1 + 0x58) + 0xc40) = auStack_428;
    *(undefined4 *)(*(longlong *)(param_1 + 0x58) + 0x6bc) = 0x400;
    FUN_7ff70c992f20(param_1,auStack_440);
    lVar3 = FUN_7ff70c992f40(auStack_440);
    if (lVar3 != 0) {
      do {
        plVar2 = *(longlong **)(*(longlong *)(lVar3 + 0x18) + 0x10);
        if (plVar2 != (longlong *)0x0) {
          lVar3 = *plVar2;
          if (lVar3 != 0) {
            do {
              FUN_7ff70c956760(lVar3,1);
              FUN_7ff70c958b40(*(undefined8 *)(param_1 + 0x58),lVar3,1);
              FUN_7ff70c945f70(*(undefined8 *)(param_1 + 0x58),lVar3,0);
              FUN_7ff70c992f20(param_1,auStack_440);
              do {
                lVar3 = FUN_7ff70c992f40(auStack_440);
                if (lVar3 == 0) goto LAB_7ff70c9591c2;
                plVar2 = *(longlong **)(*(longlong *)(lVar3 + 0x18) + 0x10);
              } while (plVar2 == (longlong *)0x0);
              lVar3 = *plVar2;
            } while (lVar3 != 0);
          }
          break;
        }
        lVar3 = FUN_7ff70c992f40(auStack_440);
      } while (lVar3 != 0);
    }
LAB_7ff70c9591c2:
    *(undefined8 *)(*plVar1 + 0xc40) = 0;
    FUN_7ff70c9849d0(*plVar1,*(undefined8 *)(*plVar1 + 200));
    FUN_7ff70c945730(plVar1);
  }
  return;
}


