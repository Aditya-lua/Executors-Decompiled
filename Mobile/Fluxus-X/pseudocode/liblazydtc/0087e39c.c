/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0087e39c
 */

void FUN_0087e39c(undefined8 *param_1,undefined8 param_2,long *param_3,undefined8 param_4,
                 long param_5,undefined8 param_6)

{
  long lVar1;
  uint uVar2;
  char *pcVar3;
  long lVar4;
  ulong uVar5;
  ulong uVar6;
  long *plVar7;
  long local_78;
  ulong local_70;
  long local_68;
  
  lVar1 = tpidr_el0;
  local_68 = *(long *)(lVar1 + 0x28);
  *param_1 = &PTR_LAB_00c4a770;
  param_1[1] = param_2;
  param_1[0x22] = param_3;
  param_1[0x23] = param_4;
  param_1[0x24] = param_5;
  param_1[0x25] = param_6;
  param_1[5] = 0;
  param_1[4] = 0;
  param_1[7] = 0;
  param_1[6] = 0;
  param_1[9] = 0;
  param_1[8] = 0;
  param_1[0xb] = 0;
  param_1[10] = 0;
  param_1[0xd] = 0;
  param_1[0xc] = 0;
  param_1[0xf] = 0;
  param_1[0xe] = 0;
  param_1[0x11] = 0;
  param_1[0x10] = 0;
  param_1[0x13] = 0;
  param_1[0x12] = 0;
  param_1[0x15] = 0;
  param_1[0x14] = 0;
  param_1[0x17] = 0;
  param_1[0x16] = 0;
  param_1[0x19] = 0;
  param_1[0x18] = 0;
  param_1[0x1b] = 0;
  param_1[0x1a] = 0;
  param_1[0x1d] = 0;
  param_1[0x1c] = 0;
  param_1[0x1f] = 0;
  param_1[0x1e] = 0;
  param_1[0x21] = 0;
  param_1[0x20] = 0;
  param_1[3] = 0;
  param_1[2] = 0;
  plVar7 = *(long **)(param_5 + 0x58);
  if (plVar7 != (long *)0x0) {
    pcVar3 = (char *)*plVar7;
    while (pcVar3 != (char *)0x0) {
      pcVar3 = strchr(pcVar3,0x2e);
      if (pcVar3 == (char *)0x0) {
        uVar5 = FUN_00853270(param_6);
        if (uVar5 != 0) {
          if (param_3[5] != 0) {
            uVar6 = (uVar5 >> 4 ^ uVar5 >> 9) * -0x61c8864680b583eb >>
                    ((ulong)*(byte *)(param_3 + 6) & 0x3f);
            if ((*(ulong *)(param_3[3] + (uVar6 >> 6) * 8) >> (uVar6 & 0x3f) & 1) != 0) {
              do {
                if (*(ulong *)(*param_3 + uVar6 * 0x10) == uVar5) {
                  if (*(int *)(*param_3 + uVar6 * 0x10 + 8) != 0) goto LAB_0087e448;
                  break;
                }
                uVar6 = uVar6 + 1 & param_3[4] - 1U;
              } while ((*(ulong *)(param_3[3] + (uVar6 >> 6) * 8) >> (uVar6 & 0x3f) & 1) != 0);
            }
          }
          local_78 = 0;
          goto LAB_0087e578;
        }
      }
      else {
        lVar4 = FUN_00852f98(param_6,*plVar7,(long)pcVar3 - *plVar7);
        uVar5 = FUN_00853270(param_6,pcVar3 + 1);
        if ((lVar4 != 0) && (uVar5 != 0)) {
          if (param_3[5] != 0) {
            uVar6 = (uVar5 >> 4 ^ uVar5 >> 9) * -0x61c8864680b583eb >>
                    ((ulong)*(byte *)(param_3 + 6) & 0x3f);
            if ((*(ulong *)(param_3[3] + (uVar6 >> 6) * 8) >> (uVar6 & 0x3f) & 1) != 0) {
              do {
                if (*(ulong *)(*param_3 + uVar6 * 0x10) == uVar5) {
                  if (*(int *)(*param_3 + uVar6 * 0x10 + 8) != 0) goto LAB_0087e448;
                  break;
                }
                uVar6 = uVar6 + 1 & param_3[4] - 1U;
              } while ((*(ulong *)(param_3[3] + (uVar6 >> 6) * 8) >> (uVar6 & 0x3f) & 1) != 0);
            }
          }
          local_78 = lVar4;
LAB_0087e578:
          local_70 = uVar5;
          uVar2 = FUN_0087e5f8(&local_78,param_5);
          if (-1 < (int)uVar2) {
            *(undefined1 *)((long)(param_1 + 2) + (ulong)uVar2) = 1;
          }
        }
      }
LAB_0087e448:
      plVar7 = plVar7 + 1;
      pcVar3 = (char *)*plVar7;
    }
  }
  if (*(long *)(lVar1 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

