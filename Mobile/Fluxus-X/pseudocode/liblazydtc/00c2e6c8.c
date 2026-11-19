/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c2e6c8
 */

ulong FUN_00c2e6c8(long *param_1,byte *param_2)

{
  byte bVar1;
  ulong uVar2;
  byte *pbVar3;
  byte *pbVar4;
  
  pbVar3 = (byte *)*param_1;
  if (pbVar3 != param_2) {
    pbVar4 = pbVar3 + 1;
    uVar2 = (ulong)*pbVar3 & 0x7f;
    if (-1 < (char)*pbVar3) {
LAB_00c2e6f8:
      *param_1 = (long)pbVar4;
      return uVar2;
    }
    if (pbVar4 != param_2) {
      uVar2 = uVar2 | (ulong)((int)(char)pbVar3[1] & 0x7f) << 7;
      pbVar4 = pbVar3 + 2;
      if (-1 < (char)pbVar3[1]) goto LAB_00c2e6f8;
      if (pbVar4 != param_2) {
        uVar2 = uVar2 | (ulong)((int)(char)pbVar3[2] & 0x7f) << 0xe;
        pbVar4 = pbVar3 + 3;
        if (-1 < (char)pbVar3[2]) goto LAB_00c2e6f8;
        if (pbVar4 != param_2) {
          uVar2 = uVar2 | (ulong)((int)(char)pbVar3[3] & 0x7f) << 0x15;
          pbVar4 = pbVar3 + 4;
          if (-1 < (char)pbVar3[3]) goto LAB_00c2e6f8;
          if (pbVar4 != param_2) {
            uVar2 = uVar2 | (ulong)((int)(char)pbVar3[4] & 0x7f) << 0x1c;
            pbVar4 = pbVar3 + 5;
            if (-1 < (char)pbVar3[4]) goto LAB_00c2e6f8;
            if (pbVar4 != param_2) {
              uVar2 = uVar2 | (ulong)((int)(char)pbVar3[5] & 0x7f) << 0x23;
              pbVar4 = pbVar3 + 6;
              if (-1 < (char)pbVar3[5]) goto LAB_00c2e6f8;
              if (pbVar4 != param_2) {
                uVar2 = uVar2 | (ulong)((int)(char)pbVar3[6] & 0x7f) << 0x2a;
                pbVar4 = pbVar3 + 7;
                if (-1 < (char)pbVar3[6]) goto LAB_00c2e6f8;
                if (pbVar4 != param_2) {
                  uVar2 = uVar2 | (ulong)((int)(char)pbVar3[7] & 0x7f) << 0x31;
                  pbVar4 = pbVar3 + 8;
                  if (-1 < (char)pbVar3[7]) goto LAB_00c2e6f8;
                  if (pbVar4 != param_2) {
                    uVar2 = uVar2 | (ulong)((int)(char)pbVar3[8] & 0x7f) << 0x38;
                    pbVar4 = pbVar3 + 9;
                    if (-1 < (char)pbVar3[8]) goto LAB_00c2e6f8;
                    if (pbVar4 != param_2) {
                      bVar1 = *pbVar4;
                      if ((bVar1 & 0x7e) == 0) {
                        if (-1 < (char)bVar1) {
                          *param_1 = (long)(pbVar3 + 10);
                          return uVar2 | (ulong)bVar1 << 0x3f;
                        }
                        if (pbVar3 + 10 == param_2) goto LAB_00c2e828;
                      }
                      fprintf((FILE *)sched_yield,"libunwind: %s - %s\n","getULEB128",
                              "malformed uleb128 expression");
                      fflush((FILE *)sched_yield);
                    /* WARNING: Subroutine does not return */
                      abort();
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
LAB_00c2e828:
  fprintf((FILE *)sched_yield,"libunwind: %s - %s\n","getULEB128","truncated uleb128 expression");
  fflush((FILE *)sched_yield);
                    /* WARNING: Subroutine does not return */
  abort();
}

