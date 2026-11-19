/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bbad38
 */

void FUN_00bbad38(undefined8 *param_1,long *param_2,int param_3,uint param_4,uint param_5,
                 byte *param_6,long param_7,long param_8,long param_9,undefined8 *param_10,
                 int param_11,int param_12,uint param_13,undefined8 param_14)

{
  undefined4 uVar1;
  byte bVar2;
  undefined1 uVar3;
  long lVar4;
  ulong uVar5;
  uint local_bc;
  uint local_b8;
  undefined1 auStack_b2 [106];
  long local_48;
  
  lVar4 = tpidr_el0;
  local_48 = *(long *)(lVar4 + 0x28);
  local_b8 = param_4;
  if (param_3 < 2) {
    if (param_3 == 0) {
      uVar5 = 0;
    }
    else {
      if (param_7 == 0) {
        uVar5 = 0xffffffffffffffb8;
        goto LAB_00bbae80;
      }
      bVar2 = *param_6;
      if (param_4 < bVar2) goto LAB_00bbae74;
      uVar1 = *(undefined4 *)(param_8 + (ulong)(uint)bVar2 * 4);
      uVar3 = *(undefined1 *)(param_9 + (ulong)bVar2);
      *param_1 = 0;
      *(undefined1 *)((long)param_1 + 0xb) = 0;
      *(undefined1 *)((long)param_1 + 10) = uVar3;
      *(undefined2 *)(param_1 + 1) = 0;
      *(undefined4 *)((long)param_1 + 0xc) = uVar1;
      uVar5 = 1;
      param_10 = param_1;
    }
    *param_2 = (long)param_10;
  }
  else {
    if (param_3 == 2) {
      uVar5 = FSE_readNCount(auStack_b2,&local_b8,&local_bc,param_6,param_7);
      if ((uVar5 < 0xffffffffffffff89) && (local_bc <= param_5)) {
        ZSTD_buildFSETable(param_1,auStack_b2,local_b8,param_8,param_9,local_bc,param_14);
        *param_2 = (long)param_1;
        goto LAB_00bbae80;
      }
    }
    else if (param_11 != 0) {
      uVar5 = 0;
      if ((param_12 != 0) && (0x18 < param_13)) {
        uVar5 = 0;
        do {
          Hint_Prefetch(*param_2 + uVar5,0,1,0);
          uVar5 = uVar5 + 0x40;
        } while (uVar5 < (8 << (ulong)(param_5 & 0x1f) | 8));
        uVar5 = 0;
      }
      goto LAB_00bbae80;
    }
LAB_00bbae74:
    uVar5 = 0xffffffffffffffec;
  }
LAB_00bbae80:
  if (*(long *)(lVar4 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar5);
  }
  return;
}

