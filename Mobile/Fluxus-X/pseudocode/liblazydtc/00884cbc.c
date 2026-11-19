/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00884cbc
 */

void FUN_00884cbc(undefined8 *param_1,ulong param_2,long param_3,ulong param_4)

{
  ulong *puVar1;
  int iVar2;
  long lVar3;
  char cVar4;
  undefined4 uVar5;
  long lVar6;
  byte *pbVar7;
  ulong uVar8;
  byte *pbVar9;
  ulong uVar10;
  ulong *puVar11;
  ulong *puVar12;
  byte local_88 [16];
  undefined8 local_78;
  undefined1 local_70;
  long local_68;
  
  lVar3 = tpidr_el0;
  local_68 = *(long *)(lVar3 + 0x28);
  if ((*(int *)(param_1 + 1) != 0) &&
     (lVar6 = param_1[0xd0], param_4 < (ulong)(param_1[0xd1] - lVar6 >> 3))) {
    puVar12 = (ulong *)((ulong)local_88 | 4);
    do {
      cVar4 = DAT_00d1f088;
      if (param_1[0x19] != 0) {
        uVar8 = *(ulong *)(lVar6 + param_4 * 8);
        uVar10 = ((ulong)(uint)((int)uVar8 << 3) + 8 ^ uVar8 >> 0x20) * -0x622015f714c7d297;
        uVar10 = (uVar8 >> 0x20 ^ uVar10 >> 0x2f ^ uVar10) * -0x622015f714c7d297;
        uVar10 = (uVar10 ^ uVar10 >> 0x2f) * -0x6b622cb0470b6a63 >>
                 ((ulong)*(byte *)(param_1 + 0x1a) & 0x3f);
        if ((*(ulong *)(param_1[0x17] + (uVar10 >> 6) * 8) >> (uVar10 & 0x3f) & 1) != 0) {
          do {
            puVar11 = (ulong *)(param_1[0x14] + uVar10 * 0x18);
            if (*puVar11 == uVar8) goto LAB_00884df0;
            uVar10 = uVar10 + 1 & param_1[0x18] - 1;
          } while ((*(ulong *)(param_1[0x17] + (uVar10 >> 6) * 8) >> (uVar10 & 0x3f) & 1) != 0);
        }
      }
      puVar11 = (ulong *)0x0;
LAB_00884df0:
      puVar1 = (ulong *)0x0;
      if (puVar11 != (ulong *)0x0) {
        puVar1 = puVar11 + 1;
      }
      if ((((*(byte *)((long)puVar1 + 1) == 1) && ((*puVar1 & 0x1000000) == 0)) &&
          ((*puVar1 & 0x10000) == 0)) && (param_1[0x27] != 0)) {
        uVar10 = *(ulong *)(lVar6 + param_4 * 8);
        uVar8 = ((ulong)(uint)((int)uVar10 << 3) + 8 ^ uVar10 >> 0x20) * -0x622015f714c7d297;
        uVar8 = (uVar10 >> 0x20 ^ uVar8 >> 0x2f ^ uVar8) * -0x622015f714c7d297;
        uVar8 = (uVar8 ^ uVar8 >> 0x2f) * -0x6b622cb0470b6a63 >>
                ((ulong)*(byte *)(param_1 + 0x28) & 0x3f);
        if ((*(ulong *)(param_1[0x25] + (uVar8 >> 6) * 8) >> (uVar8 & 0x3f) & 1) != 0) {
          do {
            puVar11 = (ulong *)(param_1[0x22] + uVar8 * 0x28);
            if (*puVar11 == uVar10) {
              if ((puVar11[2] != param_2) || ((*(byte *)((long)puVar11 + 0x22) & 1) != 0)) break;
              uVar8 = puVar11[3];
              if (uVar8 != 0) {
                if ((*(uint *)(param_3 + 0xc) <= *(uint *)(uVar8 + 0x14)) &&
                   ((*(uint *)(param_3 + 0xc) != *(uint *)(uVar8 + 0x14) ||
                    (*(uint *)(param_3 + 0x10) <= *(uint *)(uVar8 + 0x18))))) break;
              }
              *(byte *)((long)puVar1 + 1) = 0;
              if (cVar4 == '\x01') {
                param_1[0xf3] = param_1[0xf3] + -1;
              }
              uVar8 = (ulong)(byte)*puVar1;
              iVar2 = *(int *)((long)param_1 + uVar8 * 4 + 0x818);
              *(undefined1 *)((long)param_1 + uVar8 + 0x698) = 0;
              iVar2 = iVar2 + -1;
              *(int *)((long)param_1 + uVar8 * 4 + 0x818) = iVar2;
              if (iVar2 == 0) {
                *puVar12 = 0;
                puVar12[1] = 0;
                *(undefined8 *)((long)puVar12 + 0xd) = 0;
                uVar8 = puVar1[1];
                local_88[0] = (byte)*puVar1;
                *puVar12 = *puVar1;
                pbVar9 = (byte *)param_1[0x183];
                *(int *)(puVar12 + 1) = (int)uVar8;
                local_78 = *(undefined8 *)(lVar6 + param_4 * 8);
                pbVar7 = (byte *)param_1[0x184];
                local_70 = param_4 < (ulong)param_1[0xcb];
                lVar6 = (long)pbVar7 - (long)pbVar9;
                if (lVar6 != 0) {
                  uVar8 = lVar6 >> 5;
                  do {
                    uVar10 = uVar8 >> 1;
                    pbVar7 = pbVar9 + uVar10 * 0x20 + 0x20;
                    uVar8 = uVar8 + ~uVar10;
                    if ((byte)*puVar1 <= pbVar9[uVar10 * 0x20]) {
                      pbVar7 = pbVar9;
                      uVar8 = uVar10;
                    }
                    pbVar9 = pbVar7;
                  } while (uVar8 != 0);
                }
                FUN_00886f0c(param_1 + 0x183,pbVar7,local_88);
                *(byte *)((long)puVar1 + 3) = 1;
              }
              else {
                uVar8 = param_1[0xcb];
                uVar5 = FUN_008769d0(*param_1);
                FUN_00887138(param_1,uVar10,puVar1,param_4 < uVar8,uVar5);
              }
              break;
            }
            uVar8 = uVar8 + 1 & param_1[0x26] - 1;
          } while ((*(ulong *)(param_1[0x25] + (uVar8 >> 6) * 8) >> (uVar8 & 0x3f) & 1) != 0);
        }
      }
      lVar6 = param_1[0xd0];
      param_4 = param_4 + 1;
    } while (param_4 < (ulong)(param_1[0xd1] - lVar6 >> 3));
  }
  if (*(long *)(lVar3 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

