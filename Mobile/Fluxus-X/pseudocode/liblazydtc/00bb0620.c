/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bb0620
 */

void ZSTD_decompressionMargin(long param_1,long param_2)

{
  long lVar1;
  ulong uVar2;
  long lVar3;
  ulong uVar4;
  uint uVar5;
  long lVar6;
  undefined1 auStack_a0 [16];
  uint local_90;
  int local_8c;
  uint local_88;
  int local_80;
  long local_70;
  ulong local_68;
  long lStack_60;
  long local_58;
  
  lVar1 = tpidr_el0;
  local_58 = *(long *)(lVar1 + 0x28);
  if (param_2 == 0) {
    uVar4 = 0;
  }
  else {
    uVar5 = 0;
    lVar6 = 0;
    do {
      FUN_00bb04a4(&local_70,param_1,param_2,0);
      lVar3 = lStack_60;
      uVar2 = local_68;
      uVar4 = ZSTD_getFrameHeader_advanced(auStack_a0,param_1,param_2,0);
      if (((0xffffffffffffff88 < uVar4) || (uVar4 = 0xffffffffffffffec, 0xffffffffffffff88 < uVar2))
         || (lVar3 == -2)) goto LAB_00bb0700;
      if (local_8c == 0) {
        if (uVar5 <= local_90) {
          uVar5 = local_90;
        }
        lVar6 = lVar6 + (ulong)local_88 + (ulong)(local_80 != 0) * 4 + local_70 * 3;
      }
      else {
        lVar6 = uVar2 + lVar6;
      }
      param_2 = param_2 - uVar2;
      param_1 = param_1 + uVar2;
    } while (param_2 != 0);
    uVar4 = lVar6 + (ulong)uVar5;
  }
LAB_00bb0700:
  if (*(long *)(lVar1 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar4);
  }
  return;
}

