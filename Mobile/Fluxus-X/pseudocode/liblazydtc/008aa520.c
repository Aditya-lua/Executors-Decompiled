/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008aa520
 */

void FUN_008aa520(long param_1,int param_2)

{
  ulong uVar1;
  long lVar2;
  int iVar3;
  undefined8 uVar4;
  long lVar5;
  int local_3c;
  long local_38;
  
  lVar2 = tpidr_el0;
  local_38 = *(long *)(lVar2 + 0x28);
  if (param_2 < 0x1f41) {
    lVar5 = *(long *)(param_1 + 0x68);
    if ((long)param_2 + (lVar5 - *(long *)(param_1 + 0x70) >> 4) < 0x1f41) {
      if (0 < param_2) {
        if (*(long *)(param_1 + 0x48) - lVar5 <= (long)(ulong)(uint)(param_2 << 4)) {
          local_3c = param_2;
          iVar3 = FUN_008b3edc(param_1,&LAB_008aa604,&local_3c);
          if (iVar3 != 0) goto LAB_008aa568;
          lVar5 = *(long *)(param_1 + 0x68);
        }
        uVar1 = lVar5 + (long)param_2 * 0x10;
        if (*(ulong *)(*(long *)(param_1 + 0x50) + 0x18) < uVar1) {
          *(ulong *)(*(long *)(param_1 + 0x50) + 0x18) = uVar1;
        }
      }
      uVar4 = 1;
      goto LAB_008aa5cc;
    }
  }
LAB_008aa568:
  uVar4 = 0;
LAB_008aa5cc:
  if (*(long *)(lVar2 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar4);
  }
  return;
}

