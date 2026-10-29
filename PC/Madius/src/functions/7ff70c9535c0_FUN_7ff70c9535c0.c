/* 7ff70c9535c0 FUN_7ff70c9535c0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c9535c0(longlong param_1)

{
  longlong *plVar1;
  longlong lVar2;
  longlong lVar3;
  longlong *plVar4;
  longlong lVar5;
  longlong *plVar6;
  
  lVar3 = (*_DAT_7ff70cb96630)(0);
  if (*(longlong *)(param_1 + 0x1f8) <= lVar3 ||
      *(longlong *)(param_1 + 0x1f8) == 0x7fffffffffffffff) {
    *(undefined8 *)(param_1 + 0x1f8) = 0x7fffffffffffffff;
    lVar5 = 0;
    do {
      plVar6 = *(longlong **)(param_1 + lVar5 * 8);
      if (plVar6 != (longlong *)0x0) {
        plVar4 = (longlong *)0x0;
        do {
          while( true ) {
            plVar1 = (longlong *)*plVar6;
            lVar2 = plVar6[6];
            if (lVar3 <= lVar2 || lVar2 == 0) break;
            if (plVar4 == (longlong *)0x0) {
              *(longlong **)(param_1 + lVar5 * 8) = plVar1;
            }
            else {
              *plVar4 = (longlong)plVar1;
            }
            *(int *)(param_1 + 0x200) = *(int *)(param_1 + 0x200) + -1;
            (*_DAT_7ff70cbebad8)(plVar6[5]);
            (*_DAT_7ff70cbebad8)(plVar6[3]);
            (*_DAT_7ff70cbebad8)(plVar6[4]);
            (*_DAT_7ff70cbebad8)(plVar6[1]);
            (*_DAT_7ff70cbebad8)(plVar6[2]);
            (*_DAT_7ff70cbebad8)(plVar6);
            plVar6 = plVar1;
            if (plVar1 == (longlong *)0x0) goto LAB_7ff70c953610;
          }
          if ((lVar2 != 0) && (lVar2 < *(longlong *)(param_1 + 0x1f8))) {
            *(longlong *)(param_1 + 0x1f8) = lVar2;
          }
          plVar4 = plVar6;
          plVar6 = plVar1;
        } while (plVar1 != (longlong *)0x0);
      }
LAB_7ff70c953610:
      lVar5 = lVar5 + 1;
    } while (lVar5 != 0x3f);
  }
  return;
}


