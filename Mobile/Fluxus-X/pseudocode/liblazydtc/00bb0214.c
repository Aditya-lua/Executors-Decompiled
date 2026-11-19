/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bb0214
 */

void ZSTD_findDecompressedSize(uint *param_1,ulong param_2)

{
  long lVar1;
  bool bVar2;
  ulong uVar3;
  long lVar4;
  ulong uVar5;
  ulong uVar6;
  ulong local_78;
  ulong local_70;
  int local_64;
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  if (param_2 < 5) {
    uVar3 = 0;
  }
  else {
    uVar6 = 0;
    do {
      if (*param_1 >> 4 != 0x184d2a5) {
        lVar4 = ZSTD_getFrameHeader_advanced(&local_78,param_1,param_2,0);
        uVar3 = 0;
        if (local_64 != 1) {
          uVar3 = local_78;
        }
        if (lVar4 != 0) {
          uVar3 = 0xfffffffffffffffe;
        }
        if (uVar3 < 0xfffffffffffffffe) {
          bVar2 = CARRY8(uVar3,uVar6);
          uVar6 = uVar3 + uVar6;
          if (!bVar2) {
            FUN_00bb04a4(&local_78,param_1,param_2,0);
            uVar5 = local_70;
            if (local_70 < 0xffffffffffffff89) goto LAB_00bb0270;
          }
LAB_00bb0310:
          uVar3 = 0xfffffffffffffffe;
        }
        goto LAB_00bb0314;
      }
      if (param_2 < 8) goto LAB_00bb0310;
      uVar3 = 0xfffffffffffffffe;
      if ((0xfffffff7 < param_1[1]) || (uVar5 = (ulong)param_1[1] + 8, param_2 < uVar5))
      goto LAB_00bb0314;
LAB_00bb0270:
      param_2 = param_2 - uVar5;
      param_1 = (uint *)((long)param_1 + uVar5);
      uVar3 = uVar6;
    } while (4 < param_2);
  }
  if (param_2 != 0) {
    uVar3 = 0xfffffffffffffffe;
  }
LAB_00bb0314:
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar3);
  }
  return;
}

