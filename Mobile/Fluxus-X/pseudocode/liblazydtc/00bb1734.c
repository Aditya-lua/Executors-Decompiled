/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bb1734
 */

void ZSTD_loadDEntropy(long param_1,long param_2,ulong param_3)

{
  uint *puVar1;
  uint *puVar2;
  uint uVar3;
  long lVar4;
  ulong uVar5;
  long lVar6;
  uint local_cc;
  uint local_c8;
  undefined1 auStack_c2 [106];
  long local_58;
  
  lVar4 = tpidr_el0;
  local_58 = *(long *)(lVar4 + 0x28);
  if (8 < param_3) {
    uVar5 = HUF_readDTableX2_wksp(param_1 + 0x2818,param_2 + 8,param_3 - 8,param_1,0x2818,0);
    if (uVar5 < 0xffffffffffffff89) {
      puVar1 = (uint *)(param_2 + param_3);
      lVar6 = param_2 + 8 + uVar5;
      local_c8 = 0x1f;
      uVar5 = FSE_readNCount(auStack_c2,&local_c8,&local_cc,lVar6,(long)puVar1 - lVar6);
      if (((uVar5 < 0xffffffffffffff89) && (local_c8 < 0x20)) && (local_cc < 9)) {
        ZSTD_buildFSETable(param_1 + 0x1008,auStack_c2,local_c8,&DAT_00788f34,&DAT_00788fb4,local_cc
                           ,param_1 + 0x6828,0x274,0);
        lVar6 = lVar6 + uVar5;
        local_c8 = 0x34;
        uVar5 = FSE_readNCount(auStack_c2,&local_c8,&local_cc,lVar6,(long)puVar1 - lVar6);
        if (((uVar5 < 0xffffffffffffff89) && (local_c8 < 0x35)) && (local_cc < 10)) {
          ZSTD_buildFSETable(param_1 + 0x1810,auStack_c2,local_c8,&DAT_00788fd4,&DAT_007890a8,
                             local_cc,param_1 + 0x6828,0x274,0);
          lVar6 = lVar6 + uVar5;
          local_c8 = 0x23;
          uVar5 = FSE_readNCount(auStack_c2,&local_c8,&local_cc,lVar6,(long)puVar1 - lVar6);
          if (((uVar5 < 0xffffffffffffff89) && (local_c8 < 0x24)) && (local_cc < 10)) {
            ZSTD_buildFSETable(param_1,auStack_c2,local_c8,&DAT_007890e0,&DAT_00789170,local_cc,
                               param_1 + 0x6828,0x274,0);
            puVar2 = (uint *)(lVar6 + uVar5);
            if (puVar2 + 3 <= puVar1) {
              uVar3 = *puVar2;
              lVar6 = -0x1e;
              if ((uVar3 != 0) && (uVar5 = (long)puVar1 - (long)(puVar2 + 3), uVar3 <= uVar5)) {
                *(uint *)(param_1 + 0x681c) = uVar3;
                uVar3 = puVar2[1];
                if ((uVar3 != 0) && (uVar3 <= uVar5)) {
                  *(uint *)(param_1 + 0x6820) = uVar3;
                  uVar3 = puVar2[2];
                  if ((uVar3 != 0) && (uVar3 <= uVar5)) {
                    *(uint *)(param_1 + 0x6824) = uVar3;
                    lVar6 = (long)puVar2 + (0xc - param_2);
                  }
                }
              }
              goto LAB_00bb1910;
            }
          }
        }
      }
    }
  }
  lVar6 = -0x1e;
LAB_00bb1910:
  if (*(long *)(lVar4 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(lVar6);
  }
  return;
}

