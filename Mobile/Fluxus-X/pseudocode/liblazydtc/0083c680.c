/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0083c680
 */

long * FUN_0083c680(long *param_1,byte *param_2)

{
  size_t __n;
  size_t sVar1;
  void *__s1;
  byte *pbVar2;
  byte bVar3;
  ulong uVar4;
  long lVar5;
  int iVar6;
  ulong uVar7;
  long *plVar8;
  ulong uVar9;
  ulong uVar10;
  ulong uVar11;
  byte bVar12;
  undefined1 uStack_69;
  long local_68;
  
  lVar5 = tpidr_el0;
  local_68 = *(long *)(lVar5 + 0x28);
  uVar7 = *(ulong *)(param_2 + 8);
  pbVar2 = *(byte **)(param_2 + 0x10);
  if ((*param_2 & 1) == 0) {
    pbVar2 = param_2 + 1;
    uVar7 = (ulong)(*param_2 >> 1);
  }
                    /* try { // try from 0083c6cc to 0083c6d3 has its CatchHandler @ 0083c808 */
  uVar7 = FUN_0083ba34(&uStack_69,pbVar2,uVar7);
  uVar10 = param_1[1];
  if (uVar10 != 0) {
    bVar12 = POPCOUNT((char)uVar10) + POPCOUNT((char)(uVar10 >> 8)) +
             POPCOUNT((char)(uVar10 >> 0x10)) + POPCOUNT((char)(uVar10 >> 0x18)) +
             POPCOUNT((char)(uVar10 >> 0x20)) + POPCOUNT((char)(uVar10 >> 0x28)) +
             POPCOUNT((char)(uVar10 >> 0x30)) + POPCOUNT((char)(uVar10 >> 0x38));
    if (bVar12 < 2) {
      uVar11 = uVar10 - 1 & uVar7;
    }
    else {
      uVar11 = uVar7;
      if (uVar10 <= uVar7) {
        uVar11 = 0;
        if (uVar10 != 0) {
          uVar11 = uVar7 / uVar10;
        }
        uVar11 = uVar7 - uVar11 * uVar10;
      }
    }
    plVar8 = *(long **)(*param_1 + uVar11 * 8);
    if (plVar8 != (long *)0x0) {
      plVar8 = (long *)*plVar8;
      if (plVar8 != (long *)0x0) {
        pbVar2 = param_2 + 1;
        __n = (ulong)(*param_2 >> 1);
        if ((*param_2 & 1) != 0) {
          pbVar2 = *(byte **)(param_2 + 0x10);
          __n = *(size_t *)(param_2 + 8);
        }
        do {
          uVar9 = plVar8[1];
          if (uVar9 == uVar7) {
            bVar3 = *(byte *)(plVar8 + 2);
            sVar1 = (ulong)(bVar3 >> 1);
            if ((bVar3 & 1) != 0) {
              sVar1 = plVar8[3];
            }
            if (sVar1 == __n) {
              __s1 = (void *)((long)plVar8 + 0x11);
              if ((bVar3 & 1) != 0) {
                __s1 = (void *)plVar8[4];
              }
              iVar6 = memcmp(__s1,pbVar2,__n);
              if (iVar6 == 0) break;
            }
          }
          else {
            if (bVar12 < 2) {
              uVar9 = uVar9 & uVar10 - 1;
            }
            else if (uVar10 <= uVar9) {
              uVar4 = 0;
              if (uVar10 != 0) {
                uVar4 = uVar9 / uVar10;
              }
              uVar9 = uVar9 - uVar4 * uVar10;
            }
            if (uVar9 != uVar11) goto LAB_0083c7cc;
          }
          plVar8 = (long *)*plVar8;
        } while (plVar8 != (long *)0x0);
      }
      goto LAB_0083c7d0;
    }
  }
LAB_0083c7cc:
  plVar8 = (long *)0x0;
LAB_0083c7d0:
  if (*(long *)(lVar5 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return plVar8;
}

