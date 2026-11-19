/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0092b674
 */

uint FUN_0092b674(long param_1,ulong param_2,uint param_3)

{
  long lVar1;
  uint uVar2;
  int iVar3;
  uint uVar4;
  code *pcVar5;
  ulong uVar6;
  undefined8 *puVar7;
  long lVar8;
  long lVar9;
  undefined8 uVar10;
  long lVar11;
  long lVar12;
  undefined1 auStack_158 [256];
  long local_58;
  
  lVar1 = tpidr_el0;
  local_58 = *(long *)(lVar1 + 0x28);
  uVar2 = (uint)param_2;
  uVar4 = 0;
  if ((*(byte *)(param_1 + 0x131d) >> 2 & 1) != 0) goto LAB_0092b9e4;
  lVar9 = *(long *)(param_1 + 0x20);
  FUN_0090eb78(param_1);
  (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0x198));
  *(undefined8 *)(param_1 + 0x198) = 0;
  (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 400));
  *(undefined8 *)(param_1 + 400) = 0;
  if ((uVar2 < 0x2b) && ((1L << (param_2 & 0x3f) & 0x40004800000U) != 0)) {
    param_3 = 1;
  }
  pcVar5 = *(code **)(*(long *)(lVar9 + 0x3a8) + 0x18);
  if (pcVar5 != (code *)0x0) {
    uVar2 = (*pcVar5)(param_1,param_2 & 0xffffffff,param_3 & 1);
  }
  uVar4 = 0x2a;
  if (uVar2 != 0x2a) {
    iVar3 = FUN_0093148c(param_1);
    uVar4 = 0x2a;
    if (iVar3 == 0 || uVar2 != 0) {
      uVar4 = uVar2;
    }
  }
  uVar2 = thunk_FUN_00937414(param_1,param_3 & 1);
  if (uVar2 != 0 && uVar4 == 0) {
    uVar4 = uVar2;
  }
  FUN_009080e4(param_1,param_3 & 1);
  lVar12 = *(long *)(param_1 + 0xc0);
  if (*(long **)(lVar12 + 0x40) != (long *)0x0) {
    lVar11 = **(long **)(lVar12 + 0x40);
    *(undefined8 *)(lVar11 + 0x10) = 0;
    if (*(long *)(lVar12 + 8) == 0) {
      *(undefined8 *)(lVar11 + 0x18) = 0;
      *(long *)(lVar12 + 8) = lVar11;
    }
    else {
      lVar8 = *(long *)(lVar12 + 0x10);
      *(long *)(lVar8 + 0x10) = lVar11;
      *(long *)(lVar11 + 0x18) = lVar8;
    }
    *(long *)(lVar12 + 0x10) = lVar11;
    if (*(int *)(lVar11 + 0x58) != 3) {
      *(undefined4 *)(lVar11 + 0x58) = 3;
      FUN_009425cc(lVar11);
    }
    FUN_00925d80(lVar12 + 0x40,lVar11 + 0x28,0);
    FUN_0092aff8(lVar11,0,8);
  }
  if (uVar4 == 0) {
    uVar4 = FUN_0093281c(param_1 + 0xd8,param_1,param_3 & 1);
  }
  if (*(long *)(param_1 + 0xd0) != 0) {
    FUN_0093f628(param_1,5,2);
  }
  lVar12 = *(long *)(param_1 + 0x20);
  if (lVar12 != 0) {
    FUN_00907e2c(lVar12,param_1);
    FUN_00925d80(lVar12 + 0x3d0,param_1 + 0x40,0);
  }
  *(undefined8 *)(param_1 + 0x20) = 0;
  if (*(long *)(lVar9 + 1000) != 0) {
    if (*(long *)(param_1 + 0xd0) == 0) {
      uVar4 = 0;
    }
    else {
      FUN_0093f680(param_1,5);
      uVar4 = 0;
    }
    goto LAB_0092b9e4;
  }
  *(uint *)(param_1 + 0x131c) = *(uint *)(param_1 + 0x131c) | 0x400;
  if (*(long *)(lVar9 + 0x30) != 0) {
    FUN_00917b54(param_1);
    *(undefined8 *)(lVar9 + 0x30) = 0;
  }
  FUN_00916bf8(param_1);
  *(undefined8 *)(param_1 + 0xc58) = *(undefined8 *)(lVar9 + 0x28);
  if (((((*(byte *)(param_1 + 0xa85) >> 5 & 1) == 0) || (*(int *)(lVar9 + 0x3f0) == 2)) ||
      (*(int *)(lVar9 + 0x3f4) == 2)) &&
     (uVar6 = *(ulong *)(lVar9 + 0x3a0), ((uint)uVar6 >> 6 & 1) == 0)) {
    if ((param_3 & 1) != 0) {
      uVar6 = FUN_00907890(lVar9,0);
      if ((uVar6 & 1) == 0) goto LAB_0092b8f8;
      uVar6 = *(ulong *)(lVar9 + 0x3a0);
    }
    if (((uint)uVar6 >> 1 & 1) == 0) {
      if ((uVar6 & 1) == 0) {
        if (((uint)uVar6 >> 9 & 1) == 0) {
          puVar7 = (undefined8 *)(lVar9 + 0x58);
        }
        else {
          puVar7 = (undefined8 *)(lVar9 + 0x88);
        }
      }
      else {
        puVar7 = (undefined8 *)(lVar9 + 0xe0);
      }
    }
    else {
      puVar7 = (undefined8 *)(lVar9 + 0xa8);
    }
    uVar10 = *(undefined8 *)(lVar9 + 0x28);
    curl_msnprintf(auStack_158,0x100,"Connection #%ld to host %s left intact",uVar10,*puVar7);
    if (*(long *)(param_1 + 0xd0) != 0) {
      FUN_0093f680(param_1,5);
    }
    uVar6 = FUN_00910110(param_1,lVar9);
    if ((uVar6 & 1) == 0) {
      *(undefined8 *)(param_1 + 0xc50) = 0xffffffffffffffff;
    }
    else {
      *(undefined8 *)(param_1 + 0xc50) = uVar10;
      *(undefined8 *)(param_1 + 0xc58) = uVar10;
      if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
         ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
        FUN_00904c98(param_1,&DAT_002b6c62,auStack_158);
      }
    }
  }
  else {
LAB_0092b8f8:
    FUN_00908c4c(lVar9,1);
    FUN_0090fe90(param_1,lVar9,0);
    if (*(long *)(param_1 + 0xd0) != 0) {
      FUN_0093f680(param_1,5);
    }
    FUN_00946cfc(param_1,lVar9,param_3 & 1);
  }
LAB_0092b9e4:
  if (*(long *)(lVar1 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return uVar4;
}

