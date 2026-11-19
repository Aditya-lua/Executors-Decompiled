/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00916f7c
 */

void FUN_00916f7c(long param_1,long param_2,char *param_3,size_t param_4,undefined4 param_5)

{
  bool bVar1;
  uint uVar2;
  uint uVar3;
  ulong uVar4;
  uint uVar5;
  long lVar6;
  long *plVar7;
  int iVar8;
  long *plVar9;
  ulong uVar10;
  long lVar11;
  long lVar12;
  ulong uVar13;
  uint uVar14;
  undefined1 auStack_178 [264];
  long local_70;
  
  lVar6 = tpidr_el0;
  local_70 = *(long *)(lVar6 + 0x28);
  if ((param_2 == 0) || ((*(ulong *)(param_1 + 0xa82) >> 0x2c & 1) == 0)) {
LAB_00917114:
    if (param_4 == 0) {
      param_4 = strlen(param_3);
    }
    plVar9 = (long *)(*(code *)PTR_calloc_00cc4690)(1,param_4 + 0x20);
    lVar11 = 0;
    if (plVar9 == (long *)0x0) goto LAB_00917218;
    uVar13 = param_4;
    if (param_4 == 0) {
      uVar13 = strlen(param_3);
    }
    if (0xfe < uVar13) {
      uVar13 = 0xff;
    }
    FUN_00941848(auStack_178,param_3,uVar13);
    iVar8 = curl_msnprintf(auStack_178 + uVar13,7,&DAT_002b14f0,param_5);
    *plVar9 = param_2;
    plVar9[2] = 1;
    time(plVar9 + 1);
    if (plVar9[1] == 0) {
      plVar9[1] = 1;
    }
    *(undefined4 *)(plVar9 + 3) = param_5;
    if (param_4 != 0) {
      memcpy((void *)((long)plVar9 + 0x1c),param_3,param_4);
    }
    lVar11 = FUN_009166f4(*(undefined8 *)(param_1 + 0xb0),auStack_178,uVar13 + (long)iVar8 + 1,
                          plVar9);
    if (lVar11 != 0) {
      *(long *)(lVar11 + 0x10) = *(long *)(lVar11 + 0x10) + 1;
      goto LAB_00917218;
    }
  }
  else {
    lVar11 = param_2;
    uVar2 = 0xffffffff;
    do {
      uVar14 = uVar2;
      lVar11 = *(long *)(lVar11 + 0x28);
      uVar2 = uVar14 + 1;
    } while (lVar11 != 0);
    if (uVar2 == 0) goto LAB_00917114;
    uVar14 = uVar14 + 2;
    if (((param_1 != 0) && (((uint)*(ulong *)(param_1 + 0xa82) >> 0x1c & 1) != 0)) &&
       ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
      FUN_00904c98(param_1,"Shuffling %i addresses",uVar14);
    }
    uVar13 = (ulong)uVar14;
    plVar9 = (long *)(*(code *)PTR_malloc_00cc4670)(uVar13 << 3);
    lVar11 = 0;
    if (plVar9 == (long *)0x0) goto LAB_00917218;
    uVar10 = 1;
    *plVar9 = param_2;
    lVar11 = param_2;
    do {
      lVar11 = *(long *)(lVar11 + 0x28);
      plVar9[uVar10] = lVar11;
      uVar10 = uVar10 + 1;
    } while (uVar13 != uVar10);
    lVar11 = (*(code *)PTR_malloc_00cc4670)(uVar13 << 2);
    if (lVar11 != 0) {
      iVar8 = FUN_00932378(param_1,lVar11,uVar13 << 2);
      if (iVar8 == 0) {
        uVar10 = (ulong)uVar2;
        do {
          uVar3 = *(uint *)(lVar11 + uVar10 * 4);
          uVar4 = uVar10 - 1;
          uVar5 = 0;
          if (uVar14 != 0) {
            uVar5 = uVar3 / uVar14;
          }
          uVar3 = uVar3 - uVar5 * uVar14;
          lVar12 = plVar9[uVar3];
          uVar14 = uVar14 - 1;
          plVar9[uVar3] = plVar9[uVar10];
          plVar9[uVar10] = lVar12;
          bVar1 = 0 < (long)uVar10;
          uVar10 = uVar4;
        } while (uVar4 != 0 && bVar1);
        lVar12 = uVar13 - 1;
        plVar7 = plVar9;
        do {
          lVar12 = lVar12 + -1;
          *(long *)(*plVar7 + 0x28) = plVar7[1];
          plVar7 = plVar7 + 1;
        } while (lVar12 != 0);
        *(undefined8 *)(plVar9[uVar2] + 0x28) = 0;
        param_2 = *plVar9;
      }
      (*(code *)PTR_free_00cc4678)(lVar11);
      (*(code *)PTR_free_00cc4678)(plVar9);
      goto LAB_00917114;
    }
  }
  (*(code *)PTR_free_00cc4678)(plVar9);
  lVar11 = 0;
LAB_00917218:
  if (*(long *)(lVar6 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(lVar11);
  }
  return;
}

