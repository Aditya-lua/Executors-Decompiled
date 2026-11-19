/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bb04a4
 */

void FUN_00bb04a4(long *param_1,uint *param_2,ulong param_3,int param_4)

{
  ulong uVar1;
  uint uVar2;
  long lVar3;
  bool bVar4;
  ulong uVar5;
  long lVar6;
  long lVar7;
  undefined1 auStack_84 [4];
  int local_80;
  long local_78 [2];
  uint local_68;
  uint local_60;
  int local_58;
  long local_48;
  
  lVar3 = tpidr_el0;
  local_48 = *(long *)(lVar3 + 0x28);
  if (((param_3 < 8) || (param_4 != 0)) || (*param_2 >> 4 != 0x184d2a5)) {
    uVar5 = ZSTD_getFrameHeader_advanced(local_78,param_2,param_3);
    if (uVar5 < 0xffffffffffffff89) {
      if (uVar5 != 0) {
LAB_00bb0540:
        param_1[2] = -2;
        param_1[1] = -0x48;
        goto LAB_00bb05c0;
      }
      lVar6 = (long)param_2 + (ulong)local_60;
      param_3 = param_3 - local_60;
      uVar5 = ZSTD_getcBlockSize(lVar6,param_3,auStack_84);
      if (uVar5 < 0xffffffffffffff89) {
        lVar7 = 1;
        while( true ) {
          uVar5 = uVar5 + 3;
          bVar4 = param_3 < uVar5;
          param_3 = param_3 - uVar5;
          if (bVar4) break;
          lVar6 = lVar6 + uVar5;
          if (local_80 != 0) {
            if (local_58 != 0) {
              if (param_3 < 4) goto LAB_00bb0540;
              lVar6 = lVar6 + 4;
            }
            *param_1 = lVar7;
            param_1[1] = lVar6 - (long)param_2;
            lVar6 = lVar7 * (ulong)local_68;
            if (local_78[0] != -1) {
              lVar6 = local_78[0];
            }
            goto LAB_00bb05bc;
          }
          uVar5 = ZSTD_getcBlockSize(lVar6,param_3,auStack_84);
          lVar7 = lVar7 + 1;
          if (0xffffffffffffff88 < uVar5) goto LAB_00bb05b4;
        }
        uVar5 = 0xffffffffffffffb8;
      }
    }
LAB_00bb05b4:
    lVar6 = -2;
    param_1[1] = uVar5;
LAB_00bb05bc:
    param_1[2] = lVar6;
  }
  else {
    uVar2 = param_2[1];
    param_1[2] = 0;
    uVar5 = (ulong)uVar2 + 8;
    uVar1 = 0xffffffffffffffb8;
    if (uVar5 <= param_3) {
      uVar1 = uVar5;
    }
    uVar5 = 0xfffffffffffffff2;
    if (uVar2 < 0xfffffff8) {
      uVar5 = uVar1;
    }
    *param_1 = 0;
    param_1[1] = uVar5;
  }
LAB_00bb05c0:
  if (*(long *)(lVar3 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

