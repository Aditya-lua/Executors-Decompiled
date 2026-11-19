/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b9b8c
 */

void FUN_008b9b8c(long param_1,uint param_2)

{
  int iVar1;
  int iVar2;
  uint uVar3;
  uint uVar4;
  long lVar5;
  int iVar6;
  void *pvVar7;
  long lVar8;
  long lVar9;
  ulong uVar10;
  long lVar11;
  
  uVar10 = (ulong)param_2;
  if (DAT_00d1fbd8 != '\x01') {
    if ((int)param_2 < 0) {
                    /* WARNING: Subroutine does not return */
      FUN_008b75fc();
    }
    pvVar7 = (void *)FUN_008b7610(param_1,uVar10 << 3,0);
    lVar11 = *(long *)(param_1 + 0x60);
    if (param_2 != 0) {
      memset(pvVar7,0,uVar10 << 3);
    }
    uVar3 = *(uint *)(lVar11 + 0x2c);
    lVar8 = *(long *)(lVar11 + 0x38);
    if (0 < (int)uVar3) {
      uVar10 = 0;
      do {
        lVar5 = *(long *)(lVar8 + uVar10 * 8);
        while (lVar5 != 0) {
          lVar9 = *(long *)(lVar5 + 8);
          uVar4 = *(uint *)(lVar5 + 0x10) & param_2 - 1;
          *(undefined8 *)(lVar5 + 8) = *(undefined8 *)((long)pvVar7 + (long)(int)uVar4 * 8);
          *(long *)((long)pvVar7 + (long)(int)uVar4 * 8) = lVar5;
          lVar5 = lVar9;
        }
        uVar10 = uVar10 + 1;
      } while (uVar10 != uVar3);
    }
    FUN_008b7a9c(param_1,lVar8,(long)(int)uVar3 << 3,0);
    *(uint *)(lVar11 + 0x2c) = param_2;
    *(void **)(lVar11 + 0x38) = pvVar7;
    return;
  }
  iVar1 = *(int *)(*(long *)(param_1 + 0x60) + 0x28);
  iVar2 = *(int *)(*(long *)(param_1 + 0x60) + 0x30);
  if ((int)param_2 < 0) {
                    /* WARNING: Subroutine does not return */
    FUN_008b75fc(param_1);
  }
  lVar11 = *(long *)(param_1 + 0x60);
  pvVar7 = (void *)FUN_008b7610(param_1,uVar10 << 3,0);
  iVar6 = FUN_008b91dc(uVar10);
  if (param_2 != 0) {
    memset(pvVar7,0,uVar10 << 3);
  }
  uVar3 = *(uint *)(lVar11 + 0x2c);
  lVar8 = *(long *)(lVar11 + 0x38);
  if (0 < (int)uVar3) {
    uVar10 = 0;
    do {
      lVar5 = *(long *)(lVar8 + uVar10 * 8);
      while (lVar5 != 0) {
        lVar9 = *(long *)(lVar5 + 8);
        uVar4 = (uint)(iVar2 + *(int *)(lVar5 + 0x10) * iVar1) >> (ulong)(0x20U - iVar6 & 0x1f);
        *(undefined8 *)(lVar5 + 8) = *(undefined8 *)((long)pvVar7 + (long)(int)uVar4 * 8);
        *(long *)((long)pvVar7 + (long)(int)uVar4 * 8) = lVar5;
        lVar5 = lVar9;
      }
      uVar10 = uVar10 + 1;
    } while (uVar10 != uVar3);
  }
  FUN_008b7a9c(param_1,lVar8,(long)(int)uVar3 << 3,0);
  *(void **)(lVar11 + 0x38) = pvVar7;
  *(int *)(lVar11 + 0x28) = iVar1;
  *(uint *)(lVar11 + 0x2c) = param_2;
  *(int *)(lVar11 + 0x30) = iVar2;
  *(char *)(lVar11 + 0x44) = (char)(0x20U - iVar6);
  return;
}

