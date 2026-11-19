/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008a02ac
 */

void FUN_008a02ac(long param_1,ulong param_2,int *param_3)

{
  ulong *puVar1;
  long lVar2;
  undefined8 *puVar3;
  long *plVar4;
  ulong uVar5;
  ulong *puVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  ulong local_78;
  ulong local_70;
  ulong local_68;
  ulong uStack_60;
  ulong local_58;
  ulong uStack_50;
  ulong local_48;
  undefined1 local_40;
  long local_38;
  ulong local_30;
  long local_28;
  
  lVar2 = tpidr_el0;
  local_28 = *(long *)(lVar2 + 0x28);
  plVar4 = *(long **)(param_1 + 0x10);
  if (plVar4[5] != 0) {
    uVar5 = ((ulong)(uint)((int)param_2 << 3) + 8 ^ param_2 >> 0x20) * -0x622015f714c7d297;
    uVar5 = (param_2 >> 0x20 ^ uVar5 >> 0x2f ^ uVar5) * -0x622015f714c7d297;
    uVar5 = (uVar5 ^ uVar5 >> 0x2f) * -0x6b622cb0470b6a63 >> ((ulong)*(byte *)(plVar4 + 6) & 0x3f);
    if ((*(ulong *)(plVar4[3] + (uVar5 >> 6) * 8) >> (uVar5 & 0x3f) & 1) != 0) {
      do {
        puVar6 = (ulong *)(*plVar4 + uVar5 * 0x28);
        if (*puVar6 == param_2) goto LAB_008a0380;
        uVar5 = uVar5 + 1 & plVar4[4] - 1U;
      } while ((*(ulong *)(plVar4[3] + (uVar5 >> 6) * 8) >> (uVar5 & 0x3f) & 1) != 0);
    }
  }
  puVar6 = (ulong *)0x0;
LAB_008a0380:
  puVar1 = (ulong *)0x0;
  if (puVar6 != (ulong *)0x0) {
    puVar1 = puVar6 + 1;
  }
  local_30 = param_2;
  if ((puVar1[3] & 1) == 0) {
    if (*param_3 != 7) {
      plVar4 = *(long **)(param_1 + 0x18);
      *(bool *)((long)puVar1 + 0x19) = *param_3 != 0;
      if (*(long *)(lVar2 + 0x28) == local_28) {
        lVar2 = tpidr_el0;
        local_38 = *(long *)(lVar2 + 0x28);
        local_78 = param_2;
        if (*param_3 == 0) {
          if (((*(byte *)(param_1 + 0x58) & 1) == 0) && (plVar4[5] != 0)) {
            uVar5 = ((ulong)(uint)((int)param_2 << 3) + 8 ^ param_2 >> 0x20) * -0x622015f714c7d297;
            uVar5 = (param_2 >> 0x20 ^ uVar5 >> 0x2f ^ uVar5) * -0x622015f714c7d297;
            uVar5 = (uVar5 ^ uVar5 >> 0x2f) * -0x6b622cb0470b6a63 >>
                    ((ulong)*(byte *)(plVar4 + 6) & 0x3f);
            if ((*(ulong *)(plVar4[3] + (uVar5 >> 6) * 8) >> (uVar5 & 0x3f) & 1) != 0) {
              do {
                puVar6 = (ulong *)(*plVar4 + uVar5 * 0x30);
                if (*puVar6 == param_2) {
                  if (*(long *)(param_1 + 0xc0) != 0) {
                    local_48 = puVar6[5];
                    uStack_50 = puVar6[4];
                    local_58 = puVar6[3];
                    uStack_60 = puVar6[2];
                    local_68 = puVar6[1];
                    local_40 = 0;
                    local_70 = param_2;
                    FUN_008a06c4(*(long *)(param_1 + 0xc0),&local_70);
                  }
                  *(undefined4 *)(puVar6 + 1) = 0;
                  break;
                }
                uVar5 = uVar5 + 1 & plVar4[4] - 1U;
              } while ((*(ulong *)(plVar4[3] + (uVar5 >> 6) * 8) >> (uVar5 & 0x3f) & 1) != 0);
            }
          }
        }
        else if (*param_3 != 7) {
          FUN_008a0588();
          puVar3 = (undefined8 *)FUN_008984e0(plVar4,&local_78);
          uVar8 = *(undefined8 *)(param_3 + 2);
          uVar7 = *(undefined8 *)param_3;
          uVar10 = *(undefined8 *)(param_3 + 6);
          uVar9 = *(undefined8 *)(param_3 + 4);
          puVar3[4] = *(undefined8 *)(param_3 + 8);
          puVar3[1] = uVar8;
          *puVar3 = uVar7;
          puVar3[3] = uVar10;
          puVar3[2] = uVar9;
        }
        if (*(long *)(lVar2 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
          __stack_chk_fail();
        }
        return;
      }
      goto LAB_008a0414;
    }
    *(undefined1 *)((long)puVar1 + 0x19) = 0;
    puVar3 = (undefined8 *)FUN_008984e0(param_1 + 0x80,&local_30);
    uVar8 = *(undefined8 *)(param_3 + 2);
    uVar7 = *(undefined8 *)param_3;
    uVar10 = *(undefined8 *)(param_3 + 6);
    uVar9 = *(undefined8 *)(param_3 + 4);
    puVar3[4] = *(undefined8 *)(param_3 + 8);
    puVar3[1] = uVar8;
    *puVar3 = uVar7;
    puVar3[3] = uVar10;
    puVar3[2] = uVar9;
  }
  if (*(long *)(lVar2 + 0x28) == local_28) {
    return;
  }
LAB_008a0414:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

