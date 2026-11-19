/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00907508
 */

int FUN_00907508(long param_1,int param_2,uint param_3,byte *param_4)

{
  byte bVar1;
  int iVar2;
  long *plVar3;
  long lVar4;
  undefined1 auVar5 [16];
  
  plVar3 = *(long **)(*(long *)(param_1 + 0x20) + (long)param_2 * 8 + 0x248);
  if (plVar3 == (long *)0x0) {
    *param_4 = 0;
    iVar2 = 2;
  }
  else {
    bVar1 = *(byte *)((long)plVar3 + 0x24);
    iVar2 = 0;
    *param_4 = bVar1 & 1;
    if ((bVar1 & 1) == 0) {
      iVar2 = (**(code **)(*plVar3 + 0x18))(plVar3,param_1,param_3 & 1,param_4);
      if (iVar2 == 0) {
        if (*param_4 == 0) {
          iVar2 = 0;
        }
        else {
          lVar4 = *(long *)(param_1 + 0x20);
          for (plVar3 = *(long **)(lVar4 + 0x248); plVar3 != (long *)0x0; plVar3 = (long *)plVar3[1]
              ) {
            if (*(code **)(*plVar3 + 0x58) != (code *)&LAB_00907bd4) {
              (**(code **)(*plVar3 + 0x58))(plVar3,param_1,0x100,0,0);
            }
          }
          for (plVar3 = *(long **)(lVar4 + 0x250); plVar3 != (long *)0x0; plVar3 = (long *)plVar3[1]
              ) {
            if (*(code **)(*plVar3 + 0x58) != (code *)&LAB_00907bd4) {
              (**(code **)(*plVar3 + 0x58))(plVar3,param_1,0x100,0,0);
            }
          }
          FUN_009076f0(param_1,*(undefined8 *)(param_1 + 0x20));
          lVar4 = *(long *)(param_1 + 0x20);
          auVar5 = FUN_00941cb8();
          iVar2 = 0;
          *(undefined1 (*) [16])(lVar4 + 0x3b8) = auVar5;
        }
      }
      else {
        FUN_009076f0(param_1,*(undefined8 *)(param_1 + 0x20));
      }
    }
  }
  return iVar2;
}

