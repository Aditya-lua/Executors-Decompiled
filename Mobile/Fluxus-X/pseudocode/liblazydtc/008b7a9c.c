/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b7a9c
 */

void FUN_008b7a9c(long param_1,long param_2,long param_3,ulong param_4)

{
  long lVar1;
  int iVar2;
  char cVar3;
  long lVar4;
  uint uVar5;
  long lVar6;
  long *plVar7;
  long lVar8;
  long lVar9;
  long lVar10;
  
  lVar10 = *(long *)(param_1 + 0x60);
  if (*(code **)(lVar10 + 0x650) != (code *)0x0) {
    (**(code **)(lVar10 + 0x650))();
  }
  if (param_3 - 1U < 0x400) {
    cVar3 = (&DAT_00d1f6d8)[param_3];
    if (-1 < cVar3) {
      lVar6 = *(long *)(param_1 + 0x60);
      plVar7 = (long *)(param_2 + -8);
      lVar4 = *plVar7;
      lVar8 = *(long *)(lVar4 + 0x28);
      uVar5 = (uint)cVar3;
      if ((lVar8 == 0) && (*(int *)(lVar4 + 0x30) < 0)) {
        lVar1 = lVar6 + 0x70;
        lVar9 = *(long *)(lVar1 + (ulong)(uint)(int)cVar3 * 8);
        *(long *)(lVar4 + 0x18) = lVar9;
        if (lVar9 != 0) {
          *(long *)(lVar9 + 0x10) = lVar4;
        }
        *(long *)(lVar1 + (ulong)uVar5 * 8) = lVar4;
      }
      iVar2 = *(int *)(lVar4 + 0x34);
      *plVar7 = lVar8;
      *(long **)(lVar4 + 0x28) = plVar7;
      iVar2 = iVar2 + -1;
      *(int *)(lVar4 + 0x34) = iVar2;
      if (iVar2 == 0) {
        lVar8 = *(long *)(lVar4 + 0x10);
        lVar1 = *(long *)(lVar4 + 0x18);
        if (lVar1 != 0) {
          *(long *)(lVar1 + 0x10) = lVar8;
        }
        if (lVar8 == 0) {
          lVar6 = lVar6 + 0x70;
          if (*(long *)(lVar6 + (ulong)uVar5 * 8) == lVar4) {
            *(long *)(lVar6 + (ulong)uVar5 * 8) = lVar1;
          }
        }
        else {
          *(long *)(lVar8 + 0x18) = lVar1;
        }
        (**(code **)(*(long *)(param_1 + 0x60) + 0x48))
                  (*(undefined8 *)(*(long *)(param_1 + 0x60) + 0x50),lVar4,
                   (long)*(int *)(lVar4 + 0x20),0);
      }
      goto LAB_008b7b60;
    }
  }
  (**(code **)(lVar10 + 0x48))(*(undefined8 *)(lVar10 + 0x50),param_2,param_3,0);
LAB_008b7b60:
  lVar6 = lVar10 + (param_4 & 0xff) * 8;
  lVar4 = *(long *)(lVar6 + 0x3848);
  *(long *)(lVar10 + 0x10) = *(long *)(lVar10 + 0x10) - param_3;
  *(long *)(lVar6 + 0x3848) = lVar4 - param_3;
  return;
}

