/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008aa66c
 */

void FUN_008aa66c(long param_1,long param_2,uint param_3)

{
  ulong uVar1;
  long lVar2;
  int iVar3;
  long lVar4;
  long lVar5;
  ulong uVar6;
  long lVar7;
  long lVar8;
  undefined8 uVar9;
  uint local_4c;
  long local_48;
  
  lVar2 = tpidr_el0;
  local_48 = *(long *)(lVar2 + 0x28);
  if (param_1 != param_2) {
    if ((*(byte *)(param_2 + 2) >> 2 & 1) != 0) {
      FUN_008b63a4(param_2,param_2,param_2 + 0x38);
    }
    lVar4 = *(long *)(param_2 + 0x68);
    lVar5 = *(long *)(param_2 + 0x50);
    lVar8 = (long)(int)param_3;
    uVar6 = *(ulong *)(lVar5 + 0x18);
    if (uVar6 < (ulong)(lVar4 + (long)(int)param_3 * 0x10)) {
      if ((8000 < (int)param_3) || (8000 < lVar8 + (lVar4 - *(long *)(param_2 + 0x70) >> 4))) {
LAB_008aa7c8:
        FUN_008b9568(param_1,"stack overflow");
        if (*(long *)(lVar2 + 0x28) == local_48) {
          FUN_008aa5f4(param_1);
        }
        goto LAB_008aa7f0;
      }
      if (0 < (int)param_3) {
        if (*(long *)(param_2 + 0x48) - lVar4 <= (long)(ulong)(param_3 << 4)) {
          local_4c = param_3;
          iVar3 = FUN_008b3edc(param_2,&LAB_008aa604,&local_4c);
          if (iVar3 != 0) goto LAB_008aa7c8;
          lVar5 = *(long *)(param_2 + 0x50);
          lVar4 = *(long *)(param_2 + 0x68);
          uVar6 = *(ulong *)(lVar5 + 0x18);
        }
        uVar1 = lVar4 + lVar8 * 0x10;
        if (uVar6 < uVar1) {
          *(ulong *)(lVar5 + 0x18) = uVar1;
        }
        lVar5 = *(long *)(param_1 + 0x68) + lVar8 * -0x10;
        goto LAB_008aa76c;
      }
      lVar5 = *(long *)(param_1 + 0x68) + lVar8 * -0x10;
    }
    else {
      lVar5 = *(long *)(param_1 + 0x68) + lVar8 * -0x10;
      if (0 < (int)param_3) {
LAB_008aa76c:
        lVar7 = 0;
        uVar6 = (ulong)param_3;
        do {
          uVar9 = *(undefined8 *)(lVar5 + lVar7);
          uVar6 = uVar6 - 1;
          ((undefined8 *)(lVar4 + lVar7))[1] = ((undefined8 *)(lVar5 + lVar7))[1];
          *(undefined8 *)(lVar4 + lVar7) = uVar9;
          lVar7 = lVar7 + 0x10;
        } while (uVar6 != 0);
      }
    }
    *(long *)(param_1 + 0x68) = lVar5;
    *(long *)(param_2 + 0x68) = lVar4 + lVar8 * 0x10;
  }
  if (*(long *)(lVar2 + 0x28) == local_48) {
    return;
  }
LAB_008aa7f0:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

