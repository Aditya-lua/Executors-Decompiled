/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bb2660
 */

void ZSTD_DCtx_refDDict(long param_1,long param_2)

{
  long lVar1;
  int iVar2;
  int iVar3;
  undefined8 uVar4;
  void *pvVar5;
  undefined8 *puVar6;
  ulong uVar7;
  long lVar8;
  void *__ptr;
  long lVar9;
  long *__ptr_00;
  size_t __size;
  long lVar10;
  ulong uVar11;
  ulong uVar12;
  code *pcVar13;
  ulong uVar14;
  code *pcVar15;
  long *plVar16;
  int local_6c;
  long local_68;
  
  lVar1 = tpidr_el0;
  local_68 = *(long *)(lVar1 + 0x28);
  if (*(int *)(param_1 + 0x761c) != 0) {
    uVar4 = 0xffffffffffffffc4;
    goto LAB_00bb273c;
  }
  ZSTD_freeDDict(*(undefined8 *)(param_1 + 0x75e8));
  *(undefined4 *)(param_1 + 0x7600) = 0;
  *(undefined8 *)(param_1 + 0x75f0) = 0;
  *(undefined8 *)(param_1 + 0x75e8) = 0;
  if (param_2 != 0) {
    *(long *)(param_1 + 0x75f0) = param_2;
    *(undefined4 *)(param_1 + 0x7600) = 0xffffffff;
    if (*(int *)(param_1 + 0x7610) == 1) {
      __ptr_00 = *(long **)(param_1 + 0x7608);
      if (__ptr_00 == (long *)0x0) {
        pcVar13 = *(code **)(param_1 + 0x75b0);
        pcVar15 = *(code **)(param_1 + 0x75b8);
        uVar4 = *(undefined8 *)(param_1 + 0x75c0);
        if (pcVar13 == (code *)0x0) {
          __ptr_00 = malloc(0x18);
          if (__ptr_00 != (long *)0x0) {
            pvVar5 = calloc(1,0x200);
            *__ptr_00 = (long)pvVar5;
            if (pvVar5 == (void *)0x0) goto LAB_00bb2924;
LAB_00bb2810:
            plVar16 = __ptr_00 + 2;
            __ptr_00[2] = 0;
            __ptr_00[1] = 0x40;
            *(long **)(param_1 + 0x7608) = __ptr_00;
            goto LAB_00bb2940;
          }
        }
        else {
          __ptr_00 = (long *)(*pcVar13)(uVar4,0x18);
          if (__ptr_00 != (long *)0x0) {
            puVar6 = (undefined8 *)(*pcVar13)(uVar4,0x200);
            if (puVar6 != (undefined8 *)0x0) {
              puVar6[1] = 0;
              *puVar6 = 0;
              puVar6[3] = 0;
              puVar6[2] = 0;
              puVar6[5] = 0;
              puVar6[4] = 0;
              puVar6[7] = 0;
              puVar6[6] = 0;
              puVar6[9] = 0;
              puVar6[8] = 0;
              puVar6[0xb] = 0;
              puVar6[10] = 0;
              puVar6[0xd] = 0;
              puVar6[0xc] = 0;
              puVar6[0xf] = 0;
              puVar6[0xe] = 0;
              puVar6[0x11] = 0;
              puVar6[0x10] = 0;
              puVar6[0x13] = 0;
              puVar6[0x12] = 0;
              puVar6[0x15] = 0;
              puVar6[0x14] = 0;
              puVar6[0x17] = 0;
              puVar6[0x16] = 0;
              puVar6[0x19] = 0;
              puVar6[0x18] = 0;
              puVar6[0x1b] = 0;
              puVar6[0x1a] = 0;
              puVar6[0x1d] = 0;
              puVar6[0x1c] = 0;
              puVar6[0x1f] = 0;
              puVar6[0x1e] = 0;
              puVar6[0x21] = 0;
              puVar6[0x20] = 0;
              puVar6[0x23] = 0;
              puVar6[0x22] = 0;
              puVar6[0x25] = 0;
              puVar6[0x24] = 0;
              puVar6[0x27] = 0;
              puVar6[0x26] = 0;
              puVar6[0x29] = 0;
              puVar6[0x28] = 0;
              puVar6[0x2b] = 0;
              puVar6[0x2a] = 0;
              puVar6[0x2d] = 0;
              puVar6[0x2c] = 0;
              puVar6[0x2f] = 0;
              puVar6[0x2e] = 0;
              puVar6[0x31] = 0;
              puVar6[0x30] = 0;
              puVar6[0x33] = 0;
              puVar6[0x32] = 0;
              puVar6[0x35] = 0;
              puVar6[0x34] = 0;
              puVar6[0x37] = 0;
              puVar6[0x36] = 0;
              puVar6[0x39] = 0;
              puVar6[0x38] = 0;
              puVar6[0x3b] = 0;
              puVar6[0x3a] = 0;
              puVar6[0x3d] = 0;
              puVar6[0x3c] = 0;
              puVar6[0x3f] = 0;
              puVar6[0x3e] = 0;
              *__ptr_00 = (long)puVar6;
              goto LAB_00bb2810;
            }
            *__ptr_00 = 0;
LAB_00bb2924:
            if (pcVar15 == (code *)0x0) {
              free(__ptr_00);
            }
            else {
              (*pcVar15)(uVar4,__ptr_00);
            }
          }
        }
        *(undefined8 *)(param_1 + 0x7608) = 0;
        uVar4 = 0xffffffffffffffc0;
        goto LAB_00bb273c;
      }
      plVar16 = __ptr_00 + 2;
      uVar12 = __ptr_00[1];
      if (uVar12 <= (ulong)(*plVar16 * 4)) {
        pcVar15 = *(code **)(param_1 + 0x75b8);
        __size = uVar12 << 4;
        uVar4 = *(undefined8 *)(param_1 + 0x75c0);
        if (*(code **)(param_1 + 0x75b0) == (code *)0x0) {
          pvVar5 = calloc(1,__size);
          if (pvVar5 == (void *)0x0) goto LAB_00bb2918;
          uVar11 = uVar12;
        }
        else {
          pvVar5 = (void *)(**(code **)(param_1 + 0x75b0))(uVar4,__size);
          if (pvVar5 == (void *)0x0) {
LAB_00bb2918:
            uVar4 = 0xffffffffffffffc0;
            goto LAB_00bb273c;
          }
          memset(pvVar5,0,__size);
          uVar11 = __ptr_00[1];
        }
        __ptr = (void *)*__ptr_00;
        __ptr_00[2] = 0;
        *__ptr_00 = (long)pvVar5;
        __ptr_00[1] = uVar12 << 1;
        if (uVar11 != 0) {
          uVar12 = 0;
          do {
            lVar10 = *(long *)((long)__ptr + uVar12 * 8);
            if (lVar10 != 0) {
              iVar2 = ZSTD_getDictID_fromDDict(lVar10);
              local_6c = iVar2;
              uVar7 = ZSTD_XXH64(&local_6c,4,0);
              lVar9 = __ptr_00[2];
              if (lVar9 == __ptr_00[1]) goto LAB_00bb296c;
              uVar14 = __ptr_00[1] - 1;
              lVar8 = *__ptr_00;
              uVar7 = uVar14 & uVar7;
              if (*(long *)(lVar8 + uVar7 * 8) != 0) {
                do {
                  iVar3 = ZSTD_getDictID_fromDDict();
                  if (iVar3 == iVar2) {
                    *(long *)(*__ptr_00 + uVar7 * 8) = lVar10;
                    goto LAB_00bb2874;
                  }
                  lVar8 = *__ptr_00;
                  uVar7 = (uVar7 & uVar14) + 1;
                } while (*(long *)(lVar8 + uVar7 * 8) != 0);
                lVar9 = *plVar16;
              }
              *(long *)(lVar8 + uVar7 * 8) = lVar10;
              *plVar16 = lVar9 + 1;
            }
LAB_00bb2874:
            uVar12 = uVar12 + 1;
          } while (uVar12 != uVar11);
        }
        if (__ptr != (void *)0x0) {
          if (pcVar15 == (code *)0x0) {
            free(__ptr);
          }
          else {
            (*pcVar15)(uVar4,__ptr);
          }
        }
      }
LAB_00bb2940:
      iVar2 = ZSTD_getDictID_fromDDict(param_2);
      local_6c = iVar2;
      uVar12 = ZSTD_XXH64(&local_6c,4,0);
      lVar10 = __ptr_00[2];
      if (lVar10 == __ptr_00[1]) {
LAB_00bb296c:
        uVar4 = 0xffffffffffffffff;
      }
      else {
        uVar11 = __ptr_00[1] - 1;
        lVar9 = *__ptr_00;
        uVar12 = uVar11 & uVar12;
        if (*(long *)(lVar9 + uVar12 * 8) != 0) {
          do {
            iVar3 = ZSTD_getDictID_fromDDict();
            if (iVar3 == iVar2) {
              uVar4 = 0;
              *(long *)(*__ptr_00 + uVar12 * 8) = param_2;
              goto LAB_00bb273c;
            }
            lVar9 = *__ptr_00;
            uVar12 = (uVar12 & uVar11) + 1;
          } while (*(long *)(lVar9 + uVar12 * 8) != 0);
          lVar10 = *plVar16;
        }
        uVar4 = 0;
        *(long *)(lVar9 + uVar12 * 8) = param_2;
        *plVar16 = lVar10 + 1;
      }
      goto LAB_00bb273c;
    }
  }
  uVar4 = 0;
LAB_00bb273c:
  if (*(long *)(lVar1 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar4);
  }
  return;
}

