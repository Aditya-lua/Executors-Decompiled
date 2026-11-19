/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00825dfc
 */

void FUN_00825dfc(long *param_1,long *param_2)

{
  long *plVar1;
  long *plVar2;
  long *plVar3;
  long lVar4;
  undefined8 *puVar5;
  long *plVar6;
  
  *(bool *)(param_2 + 3) = param_2 == param_1;
  if (param_2 != param_1) {
    do {
      plVar2 = (long *)param_2[2];
      if ((*(byte *)(plVar2 + 3) & 1) != 0) {
        return;
      }
      plVar1 = (long *)plVar2[2];
      plVar3 = (long *)*plVar1;
      if (plVar2 == plVar3) {
        lVar4 = plVar1[1];
        if ((lVar4 == 0) || ((*(byte *)(lVar4 + 0x18) & 1) != 0)) {
          if (param_2 == (long *)*plVar2) goto LAB_00825f24;
          plVar6 = (long *)plVar2[1];
          lVar4 = *plVar6;
          plVar2[1] = lVar4;
          if (lVar4 == 0) {
            plVar6[2] = (long)plVar1;
LAB_00825f10:
            *plVar1 = (long)plVar6;
          }
          else {
            *(long **)(lVar4 + 0x10) = plVar2;
            plVar1 = (long *)plVar2[2];
            plVar3 = (long *)*plVar1;
            plVar6[2] = (long)plVar1;
            if (plVar2 == plVar3) goto LAB_00825f10;
            plVar1[1] = (long)plVar6;
          }
          plVar2[2] = (long)plVar6;
          plVar1 = (long *)plVar6[2];
          *plVar6 = (long)plVar2;
          plVar3 = (long *)*plVar1;
          plVar2 = plVar6;
LAB_00825f24:
          lVar4 = plVar3[1];
          *(undefined1 *)(plVar2 + 3) = 1;
          *(undefined1 *)(plVar1 + 3) = 0;
          *plVar1 = lVar4;
          if (lVar4 != 0) {
            *(long **)(lVar4 + 0x10) = plVar1;
          }
          puVar5 = (undefined8 *)plVar1[2];
          plVar2 = (long *)*puVar5;
          plVar3[2] = (long)puVar5;
          if (plVar1 == plVar2) {
            *puVar5 = plVar3;
          }
          else {
            puVar5[1] = plVar3;
          }
          plVar3[1] = (long)plVar1;
          plVar1[2] = (long)plVar3;
          return;
        }
        *(undefined1 *)(plVar2 + 3) = 1;
        *(bool *)(plVar1 + 3) = plVar1 == param_1;
        *(undefined1 *)(lVar4 + 0x18) = 1;
      }
      else {
        if ((plVar3 == (long *)0x0) || ((*(byte *)(plVar3 + 3) & 1) != 0)) {
          plVar3 = (long *)*plVar2;
          if (param_2 == plVar3) {
            lVar4 = plVar3[1];
            *plVar2 = lVar4;
            if (lVar4 != 0) {
              *(long **)(lVar4 + 0x10) = plVar2;
              plVar1 = (long *)plVar2[2];
            }
            plVar6 = (long *)*plVar1;
            plVar3[2] = (long)plVar1;
            if (plVar2 == plVar6) {
              *plVar1 = (long)plVar3;
            }
            else {
              plVar1[1] = (long)plVar3;
            }
            plVar2[2] = (long)plVar3;
            plVar1 = (long *)plVar3[2];
            plVar3[1] = (long)plVar2;
          }
          else {
            plVar3 = plVar2;
          }
          plVar2 = (long *)plVar1[1];
          *(undefined1 *)(plVar3 + 3) = 1;
          lVar4 = *plVar2;
          *(undefined1 *)(plVar1 + 3) = 0;
          plVar1[1] = lVar4;
          if (lVar4 != 0) {
            *(long **)(lVar4 + 0x10) = plVar1;
          }
          puVar5 = (undefined8 *)plVar1[2];
          plVar3 = (long *)*puVar5;
          plVar2[2] = (long)puVar5;
          if (plVar1 == plVar3) {
            *puVar5 = plVar2;
          }
          else {
            puVar5[1] = plVar2;
          }
          *plVar2 = (long)plVar1;
          plVar1[2] = (long)plVar2;
          return;
        }
        *(undefined1 *)(plVar2 + 3) = 1;
        *(bool *)(plVar1 + 3) = plVar1 == param_1;
        *(undefined1 *)(plVar3 + 3) = 1;
      }
      param_2 = plVar1;
    } while (plVar1 != param_1);
  }
  return;
}

