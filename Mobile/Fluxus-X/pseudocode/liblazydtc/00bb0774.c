/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bb0774
 */

void FUN_00bb0774(long param_1,byte *param_2,long param_3,uint *param_4,ulong param_5,
                 undefined8 param_6,undefined8 param_7,long param_8)

{
  ulong uVar1;
  byte *__src;
  byte *pbVar2;
  byte *pbVar3;
  uint uVar4;
  byte bVar5;
  long lVar6;
  byte bVar7;
  bool bVar8;
  int iVar9;
  uint uVar10;
  undefined4 uVar11;
  ulong uVar12;
  ulong uVar13;
  long lVar14;
  uint *puVar15;
  byte *pbVar16;
  byte *local_f8;
  ulong local_e8;
  undefined8 local_c0;
  undefined8 local_b8;
  undefined8 uStack_b0;
  ulong local_a8;
  long lStack_a0;
  undefined8 local_98;
  undefined8 uStack_90;
  long local_88;
  long local_80;
  
  lVar6 = tpidr_el0;
  local_80 = *(long *)(lVar6 + 0x28);
  if (param_8 != 0) {
    param_6 = ZSTD_DDict_dictContent(param_8);
    param_7 = ZSTD_DDict_dictSize(param_8);
  }
  bVar8 = *(int *)(param_1 + 0x7598) == 0;
  uVar13 = 5;
  if (!bVar8) {
    uVar13 = 1;
  }
  pbVar16 = param_2;
  if (uVar13 <= param_5) {
    bVar7 = 0;
    do {
      while ((!(bool)(param_5 < 4 | bVar8 ^ 1U) && (*param_4 >> 4 == 0x184d2a5))) {
        if (param_5 < 8) goto LAB_00bb0808;
        if (0xfffffff7 < param_4[1]) {
          uVar12 = 0xfffffffffffffff2;
          goto LAB_00bb0cbc;
        }
        uVar1 = (ulong)param_4[1] + 8;
        uVar12 = 0xffffffffffffffb8;
        if (uVar1 <= param_5) {
          uVar12 = uVar1;
        }
        if (0xffffffffffffff88 < uVar12) goto LAB_00bb0cbc;
        param_5 = param_5 - uVar12;
        param_4 = (uint *)((long)param_4 + uVar12);
        if (param_5 < uVar13) goto LAB_00bb0804;
      }
      if (param_8 == 0) {
        uVar12 = ZSTD_decompressBegin_usingDict(param_1,param_6,param_7);
        if (0xffffffffffffff88 < uVar12) goto LAB_00bb0cbc;
      }
      else {
        ZSTD_decompressBegin_usingDDict(param_1,param_8);
      }
      ZSTD_checkContinuity(param_1,pbVar16,param_3);
      uVar13 = 9;
      if (*(int *)(param_1 + 0x7598) != 0) {
        uVar13 = 5;
      }
      if (param_5 < uVar13) {
LAB_00bb08e8:
        uVar12 = 0xffffffffffffffb8;
      }
      else {
        lVar14 = 5;
        if (*(int *)(param_1 + 0x7598) != 0) {
          lVar14 = 1;
        }
        bVar5 = *(byte *)((long)param_4 + lVar14 + -1);
        lVar14 = *(long *)(&DAT_00364d50 + ((ulong)bVar5 & 3) * 8) + lVar14 +
                 *(long *)(&DAT_00364e90 + (ulong)(bVar5 >> 6) * 8);
        if ((bVar5 & 0x20) == 0) {
          lVar14 = lVar14 + 1;
        }
        local_e8 = lVar14 + (ulong)((uint)(bVar5 < 0x40) & (bVar5 & 0x20) >> 5);
        uVar12 = local_e8;
        if (local_e8 < 0xffffffffffffff89) {
          if (param_5 < local_e8 + 3) goto LAB_00bb08e8;
          uVar12 = FUN_00bb14e4(param_1,param_4);
          if (uVar12 < 0xffffffffffffff89) {
            uVar10 = *(uint *)(param_1 + 0x7618);
            if (uVar10 != 0) {
              uVar4 = *(uint *)(param_1 + 0x74f8);
              if (uVar10 <= uVar4) {
                uVar4 = uVar10;
              }
              *(uint *)(param_1 + 0x74f8) = uVar4;
            }
            puVar15 = (uint *)((long)param_4 + local_e8);
            local_e8 = param_5 - local_e8;
            uVar12 = ZSTD_getcBlockSize(puVar15,local_e8,&local_c0);
            if (uVar12 < 0xffffffffffffff89) {
              pbVar2 = pbVar16 + param_3;
              uVar13 = uVar12;
              local_f8 = pbVar16;
              do {
                uVar12 = local_e8 - 3;
                local_e8 = uVar12 - uVar13;
                if (uVar12 < uVar13) goto LAB_00bb08e8;
                __src = (byte *)((long)puVar15 + 3);
                pbVar3 = __src;
                if (pbVar2 <= __src || __src < local_f8) {
                  pbVar3 = pbVar2;
                }
                if ((int)local_c0 == 2) {
                  uVar12 = ZSTD_decompressBlock_internal
                                     (param_1,local_f8,(long)pbVar3 - (long)local_f8,__src,uVar13,0)
                  ;
                  if (0xffffffffffffff88 < uVar12) break;
                }
                else {
                  if ((int)local_c0 != 1) {
                    if ((int)local_c0 == 0) {
                      if ((ulong)((long)pbVar2 - (long)local_f8) < uVar13) goto LAB_00bb0b90;
                      if (local_f8 == (byte *)0x0) {
                        if (uVar13 == 0) goto LAB_00bb0aa0;
                        goto LAB_00bb0bb8;
                      }
                      memmove(local_f8,__src,uVar13);
                      uVar12 = uVar13;
                      goto LAB_00bb0aa4;
                    }
LAB_00bb0b88:
                    uVar12 = 0xffffffffffffffec;
                    break;
                  }
                  uVar12 = local_b8 & 0xffffffff;
                  if ((ulong)((long)pbVar3 - (long)local_f8) < uVar12) {
LAB_00bb0b90:
                    uVar12 = 0xffffffffffffffba;
                    break;
                  }
                  if (local_f8 != (byte *)0x0) {
                    memset(local_f8,(uint)*__src,uVar12);
                    goto LAB_00bb0aa4;
                  }
                  if ((int)local_b8 != 0) {
LAB_00bb0bb8:
                    uVar12 = 0xffffffffffffffb6;
                    break;
                  }
LAB_00bb0aa0:
                  uVar12 = 0;
                }
LAB_00bb0aa4:
                if (*(int *)(param_1 + 0x75a0) != 0) {
                  ZSTD_XXH64_update(param_1 + 0x7538,local_f8,uVar12);
                }
                local_f8 = local_f8 + uVar12;
                puVar15 = (uint *)(__src + uVar13);
                if (local_c0._4_4_ != 0) {
                  uVar12 = (long)local_f8 - (long)pbVar16;
                  if ((*(ulong *)(param_1 + 0x74e8) != 0xffffffffffffffff) &&
                     (uVar12 != *(ulong *)(param_1 + 0x74e8))) goto LAB_00bb0b88;
                  if (*(int *)(param_1 + 0x7508) != 0) {
                    bVar8 = local_e8 < 4;
                    local_e8 = local_e8 - 4;
                    if ((bVar8) ||
                       ((*(int *)(param_1 + 0x759c) == 0 &&
                        (uVar10 = ZSTD_XXH64_digest(param_1 + 0x7538), *puVar15 != uVar10)))) {
                      uVar12 = 0xffffffffffffffea;
                      break;
                    }
                    puVar15 = puVar15 + 1;
                  }
                  lVar14 = *(long *)(param_1 + 0x176e0);
                  param_5 = local_e8;
                  if (lVar14 == 0) {
                    param_4 = puVar15;
                  }
                  else {
                    local_c0 = 0x2968;
                    uStack_90 = 0;
                    local_98 = 0;
                    lStack_a0 = 0;
                    local_a8 = 0;
                    uStack_b0 = 0;
                    local_b8 = 0;
                    if (*(long *)(param_1 + 0x75f0) != 0) {
                      uVar11 = ZSTD_getDictID_fromDDict(*(long *)(param_1 + 0x75f0));
                      local_b8 = CONCAT44(local_b8._4_4_,uVar11);
                      uStack_b0 = ZSTD_DDict_dictSize(*(undefined8 *)(param_1 + 0x75f0));
                      lVar14 = *(long *)(param_1 + 0x176e0);
                      local_b8 = CONCAT44(*(undefined4 *)(param_1 + 0x75fc),(int)local_b8);
                    }
                    lStack_a0 = (long)puVar15 - (long)param_4;
                    local_a8 = uVar12;
                    local_88 = param_1;
                    ZSTD_trace_decompress_end(lVar14,&local_c0);
                    param_4 = puVar15;
                  }
                  break;
                }
                uVar12 = ZSTD_getcBlockSize(puVar15,local_e8,&local_c0);
                uVar13 = uVar12;
              } while (uVar12 < 0xffffffffffffff89);
            }
          }
        }
      }
      iVar9 = ZSTD_getErrorCode();
      if ((bool)(iVar9 == 10 & bVar7)) goto LAB_00bb0808;
      if (0xffffffffffffff88 < uVar12) goto LAB_00bb0cbc;
      pbVar16 = pbVar16 + uVar12;
      param_3 = param_3 - uVar12;
      bVar7 = 1;
      bVar8 = *(int *)(param_1 + 0x7598) == 0;
      uVar13 = 5;
      if (!bVar8) {
        uVar13 = 1;
      }
    } while (uVar13 <= param_5);
  }
LAB_00bb0804:
  if (param_5 == 0) {
    uVar12 = (long)pbVar16 - (long)param_2;
  }
  else {
LAB_00bb0808:
    uVar12 = 0xffffffffffffffb8;
  }
LAB_00bb0cbc:
  if (*(long *)(lVar6 + 0x28) != local_80) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar12);
  }
  return;
}

