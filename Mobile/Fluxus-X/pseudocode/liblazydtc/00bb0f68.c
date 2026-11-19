/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bb0f68
 */

void ZSTD_decompressContinue(long param_1,void *param_2,ulong param_3,uint *param_4,ulong param_5)

{
  int iVar1;
  byte bVar2;
  long lVar3;
  bool bVar4;
  uint uVar5;
  undefined4 uVar6;
  ulong uVar7;
  long lVar8;
  ulong uVar9;
  long lVar10;
  undefined8 uVar11;
  undefined8 local_a8;
  undefined8 local_a0;
  undefined8 uStack_98;
  undefined8 local_90;
  long lStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  long local_70;
  long local_68;
  
  lVar3 = tpidr_el0;
  local_68 = *(long *)(lVar3 + 0x28);
  if (*(int *)(param_1 + 0x752c) - 3U < 2) {
    uVar9 = *(ulong *)(param_1 + 0x74e0);
    uVar7 = uVar9;
    if (*(int *)(param_1 + 0x7528) == 0) {
      uVar7 = param_5;
      if (uVar9 <= param_5) {
        uVar7 = uVar9;
      }
      if (uVar7 < 2) {
        uVar7 = 1;
      }
    }
  }
  else {
    uVar7 = *(ulong *)(param_1 + 0x74e0);
  }
  if (param_5 != uVar7) {
    uVar7 = 0xffffffffffffffb8;
    goto LAB_00bb1064;
  }
  ZSTD_checkContinuity(param_1);
  iVar1 = *(int *)(param_1 + 0x752c);
  uVar7 = 0xffffffffffffffff;
  lVar10 = *(long *)(param_1 + 0x7518) + param_5;
  *(long *)(param_1 + 0x7518) = lVar10;
  if (iVar1 < 3) {
    if (iVar1 == 0) {
      if (*(int *)(param_1 + 0x7598) == 0) {
        if (*param_4 >> 4 == 0x184d2a5) {
          memcpy((void *)(param_1 + 0x176c4),param_4,param_5);
          uVar7 = 0;
          uVar6 = 6;
          param_5 = 8 - param_5;
          goto LAB_00bb1398;
        }
        lVar10 = 5;
        if (param_5 < 5) goto LAB_00bb1210;
      }
      else {
        lVar10 = 1;
        if (param_5 == 0) {
LAB_00bb1210:
          uVar7 = 0xffffffffffffffb8;
          *(undefined8 *)(param_1 + 0x7590) = 0xffffffffffffffb8;
          goto LAB_00bb1064;
        }
      }
      bVar2 = *(byte *)((long)param_4 + lVar10 + -1);
      lVar10 = *(long *)(&DAT_00364d50 + ((ulong)bVar2 & 3) * 8) + lVar10 +
               *(long *)(&DAT_00364e90 + (ulong)(bVar2 >> 6) * 8);
      if ((bVar2 & 0x20) == 0) {
        lVar10 = lVar10 + 1;
      }
      uVar7 = lVar10 + (ulong)((uint)(bVar2 < 0x40) & (bVar2 & 0x20) >> 5);
      *(ulong *)(param_1 + 0x7590) = uVar7;
      if (0xffffffffffffff88 < uVar7) goto LAB_00bb1064;
      memcpy((void *)(param_1 + 0x176c4),param_4,param_5);
      param_5 = uVar7 - param_5;
      uVar6 = 1;
      uVar7 = 0;
    }
    else {
      if (iVar1 != 1) {
        if ((iVar1 != 2) ||
           (uVar7 = ZSTD_getcBlockSize(param_4,3,&local_a8), 0xffffffffffffff88 < uVar7))
        goto LAB_00bb1064;
        if (uVar7 <= *(uint *)(param_1 + 0x74f8)) {
          *(ulong *)(param_1 + 0x74e0) = uVar7;
          *(undefined4 *)(param_1 + 0x7528) = (undefined4)local_a8;
          *(ulong *)(param_1 + 0x75d0) = local_a0 & 0xffffffff;
          if (uVar7 == 0) {
            if (local_a8._4_4_ == 0) {
              *(undefined8 *)(param_1 + 0x74e0) = 3;
              uVar6 = 2;
            }
            else if (*(int *)(param_1 + 0x7508) == 0) {
              *(undefined8 *)(param_1 + 0x74e0) = 0;
              uVar6 = 0;
            }
            else {
              *(undefined8 *)(param_1 + 0x74e0) = 4;
              uVar6 = 5;
            }
          }
          else {
            uVar6 = 3;
            if (local_a8._4_4_ != 0) {
              uVar6 = 4;
            }
          }
          uVar7 = 0;
          *(undefined4 *)(param_1 + 0x752c) = uVar6;
          goto LAB_00bb1064;
        }
        goto LAB_00bb13d0;
      }
      lVar10 = *(long *)(param_1 + 0x7590);
      memcpy((void *)(param_1 + 0x176c4 + (lVar10 - param_5)),param_4,param_5);
      uVar7 = FUN_00bb14e4(param_1,param_1 + 0x176c4,lVar10);
      if (0xffffffffffffff88 < uVar7) goto LAB_00bb1064;
      uVar7 = 0;
      param_5 = 3;
      uVar6 = 2;
    }
LAB_00bb1398:
    *(ulong *)(param_1 + 0x74e0) = param_5;
    *(undefined4 *)(param_1 + 0x752c) = uVar6;
    goto LAB_00bb1064;
  }
  if (iVar1 < 6) {
    if (1 < iVar1 - 3U) {
      if (iVar1 != 5) goto LAB_00bb1064;
      if ((*(int *)(param_1 + 0x75a0) != 0) &&
         (uVar5 = ZSTD_XXH64_digest(param_1 + 0x7538), *param_4 != uVar5)) {
        uVar7 = 0xffffffffffffffea;
        goto LAB_00bb1064;
      }
      lVar8 = *(long *)(param_1 + 0x176e0);
      if (lVar8 != 0) {
        uVar11 = *(undefined8 *)(param_1 + 0x7520);
        local_a8 = 0x100002968;
        lStack_88 = 0;
        local_90 = 0;
        uStack_78 = 0;
        uStack_80 = 0;
        uStack_98 = 0;
        local_a0 = 0;
        if (*(long *)(param_1 + 0x75f0) != 0) {
          uVar6 = ZSTD_getDictID_fromDDict(*(long *)(param_1 + 0x75f0));
          local_a0 = CONCAT44(local_a0._4_4_,uVar6);
          uStack_98 = ZSTD_DDict_dictSize(*(undefined8 *)(param_1 + 0x75f0));
          lVar8 = *(long *)(param_1 + 0x176e0);
          local_a0 = CONCAT44(*(undefined4 *)(param_1 + 0x75fc),(undefined4)local_a0);
        }
        local_90 = uVar11;
        lStack_88 = lVar10;
        local_70 = param_1;
        ZSTD_trace_decompress_end(lVar8,&local_a8);
      }
      goto LAB_00bb11c4;
    }
    iVar1 = *(int *)(param_1 + 0x7528);
    if (iVar1 == 0) {
      if (param_3 < param_5) {
        uVar7 = 0xffffffffffffffba;
        goto LAB_00bb1064;
      }
      uVar7 = param_5;
      if (param_2 == (void *)0x0) {
        if (param_5 != 0) {
          uVar7 = 0xffffffffffffffb6;
          goto LAB_00bb1064;
        }
      }
      else {
        memmove(param_2,param_4,param_5);
        if (0xffffffffffffff88 < param_5) goto LAB_00bb1064;
      }
      lVar10 = *(long *)(param_1 + 0x74e0) - param_5;
      *(long *)(param_1 + 0x74e0) = lVar10;
    }
    else {
      if (iVar1 == 1) {
        uVar7 = *(size_t *)(param_1 + 0x75d0);
        if (param_3 < uVar7) {
          uVar7 = 0xffffffffffffffba;
        }
        else if (param_2 == (void *)0x0) {
          bVar4 = uVar7 != 0;
          uVar7 = 0;
          if (bVar4) {
            uVar7 = 0xffffffffffffffb6;
          }
        }
        else {
          memset(param_2,(uint)(byte)*param_4,uVar7);
        }
      }
      else {
        if (iVar1 != 2) goto LAB_00bb13d0;
        uVar7 = ZSTD_decompressBlock_internal(param_1,param_2,param_3,param_4,param_5,1);
      }
      lVar10 = 0;
      *(undefined8 *)(param_1 + 0x74e0) = 0;
      if (0xffffffffffffff88 < uVar7) goto LAB_00bb1064;
    }
    if (*(uint *)(param_1 + 0x74f8) < uVar7) {
LAB_00bb13d0:
      uVar7 = 0xffffffffffffffec;
      goto LAB_00bb1064;
    }
    *(ulong *)(param_1 + 0x7520) = *(long *)(param_1 + 0x7520) + uVar7;
    if (*(int *)(param_1 + 0x75a0) != 0) {
      ZSTD_XXH64_update(param_1 + 0x7538,param_2,uVar7);
      lVar10 = *(long *)(param_1 + 0x74e0);
    }
    *(ulong *)(param_1 + 0x74c0) = (long)param_2 + uVar7;
    if (lVar10 != 0) goto LAB_00bb1064;
    if (*(int *)(param_1 + 0x752c) != 4) {
      *(undefined4 *)(param_1 + 0x752c) = 2;
      *(undefined8 *)(param_1 + 0x74e0) = 3;
      goto LAB_00bb1064;
    }
    if ((*(long *)(param_1 + 0x74e8) != -1) &&
       (*(long *)(param_1 + 0x7520) != *(long *)(param_1 + 0x74e8))) goto LAB_00bb13d0;
    if (*(int *)(param_1 + 0x7508) != 0) {
      param_5 = 4;
      uVar6 = 5;
      goto LAB_00bb1398;
    }
    FUN_00bb165c(param_1,*(undefined8 *)(param_1 + 0x7520),*(undefined8 *)(param_1 + 0x7518),1);
    *(undefined8 *)(param_1 + 0x74e0) = 0;
  }
  else {
    if (iVar1 == 6) {
      memcpy((void *)((param_1 - param_5) + 0x176cc),param_4,param_5);
      param_5 = (ulong)*(uint *)(param_1 + 0x176c8);
      uVar7 = 0;
      uVar6 = 7;
      goto LAB_00bb1398;
    }
    if (iVar1 != 7) goto LAB_00bb1064;
LAB_00bb11c4:
    uVar7 = 0;
    *(undefined8 *)(param_1 + 0x74e0) = 0;
  }
  *(undefined4 *)(param_1 + 0x752c) = 0;
LAB_00bb1064:
  if (*(long *)(lVar3 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar7);
  }
  return;
}

