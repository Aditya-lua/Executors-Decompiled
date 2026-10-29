/* 7ff70c958e50 FUN_7ff70c958e50 */

longlong FUN_7ff70c958e50(longlong param_1)

{
  longlong lVar1;
  longlong lVar2;
  longlong lVar3;
  longlong lVar4;
  longlong *plVar5;
  longlong lVar6;
  longlong lVar7;
  longlong lVar8;
  undefined4 uStack_88;
  undefined4 uStack_84;
  undefined4 uStack_80;
  undefined4 uStack_7c;
  undefined8 uStack_78;
  undefined8 uStack_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  undefined1 auStack_58 [24];
  
  lVar1 = *(longlong *)(param_1 + 0xbf8);
  FUN_7ff70c958630(&uStack_68);
  if (*(longlong *)(param_1 + 0xe8) != 0) {
    FUN_7ff70c959850(param_1,5,2);
  }
  FUN_7ff70c992f20(lVar1,auStack_58);
  lVar3 = FUN_7ff70c992f40(auStack_58);
  if (lVar3 == 0) {
    lVar8 = 0;
  }
  else {
    lVar6 = -1;
    lVar7 = 0;
    lVar8 = 0;
    do {
      lVar3 = *(longlong *)(lVar3 + 0x18);
      for (plVar5 = *(longlong **)(lVar3 + 0x10); plVar5 != (longlong *)0x0;
          plVar5 = (longlong *)plVar5[2]) {
        lVar2 = *plVar5;
        if (((*(longlong *)(lVar2 + 0x390) == 0) && (*(char *)(lVar2 + 0x2ce) == '\0')) &&
           (*(char *)(lVar2 + 0x616) == '\0')) {
          uStack_78 = uStack_68;
          uStack_70 = uStack_60;
          uStack_88 = *(undefined4 *)(lVar2 + 0x198);
          uStack_84 = *(undefined4 *)(lVar2 + 0x19c);
          uStack_80 = *(undefined4 *)(lVar2 + 0x1a0);
          uStack_7c = *(undefined4 *)(lVar2 + 0x1a4);
          lVar4 = FUN_7ff70c9586d0(&uStack_78,&uStack_88);
          if (lVar6 < lVar4) {
            lVar6 = lVar4;
            lVar7 = lVar3;
            lVar8 = lVar2;
          }
        }
      }
      lVar3 = FUN_7ff70c992f40(auStack_58);
    } while (lVar3 != 0);
    if (lVar8 == 0) {
      lVar8 = 0;
    }
    else {
      plVar5 = *(longlong **)(lVar7 + 0x10);
      if (plVar5 != (longlong *)0x0) {
        do {
          if (*plVar5 == lVar8) {
            FUN_7ff70c991030(lVar7 + 0x10,plVar5,0);
            *(longlong *)(lVar7 + 8) = *(longlong *)(lVar7 + 8) + -1;
            *(undefined8 *)(lVar8 + 0x5d8) = 0;
            break;
          }
          plVar5 = (longlong *)plVar5[2];
        } while (plVar5 != (longlong *)0x0);
      }
      plVar5 = (longlong *)(lVar1 + 0x30);
      *plVar5 = *plVar5 + -1;
    }
  }
  if (*(longlong *)(param_1 + 0xe8) != 0) {
    FUN_7ff70c959890(param_1,5);
  }
  return lVar8;
}


