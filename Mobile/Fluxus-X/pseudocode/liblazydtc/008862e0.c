/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008862e0
 */

void FUN_008862e0(undefined8 *param_1,ulong param_2)

{
  ulong *puVar1;
  byte *__dest;
  int iVar2;
  byte bVar3;
  undefined4 uVar4;
  size_t sVar5;
  undefined4 uVar6;
  long lVar7;
  ulong uVar8;
  ulong uVar9;
  ulong *puVar10;
  byte *pbVar11;
  undefined8 uVar12;
  char *__s;
  undefined8 uVar13;
  ulong uVar14;
  
  lVar7 = param_1[0xd0];
  uVar8 = param_1[0xd1] - lVar7 >> 3;
  if (param_2 < uVar8) {
    uVar14 = param_2;
    do {
      if (param_1[0x19] != 0) {
        uVar8 = *(ulong *)(lVar7 + uVar14 * 8);
        uVar9 = ((ulong)(uint)((int)uVar8 << 3) + 8 ^ uVar8 >> 0x20) * -0x622015f714c7d297;
        uVar9 = (uVar8 >> 0x20 ^ uVar9 >> 0x2f ^ uVar9) * -0x622015f714c7d297;
        uVar9 = (uVar9 ^ uVar9 >> 0x2f) * -0x6b622cb0470b6a63 >>
                ((ulong)*(byte *)(param_1 + 0x1a) & 0x3f);
        if ((*(ulong *)(param_1[0x17] + (uVar9 >> 6) * 8) >> (uVar9 & 0x3f) & 1) != 0) {
          do {
            puVar10 = (ulong *)(param_1[0x14] + uVar9 * 0x18);
            if (*puVar10 == uVar8) goto LAB_0088641c;
            uVar9 = uVar9 + 1 & param_1[0x18] - 1;
          } while ((*(ulong *)(param_1[0x17] + (uVar9 >> 6) * 8) >> (uVar9 & 0x3f) & 1) != 0);
        }
      }
      puVar10 = (ulong *)0x0;
LAB_0088641c:
      puVar1 = (ulong *)0x0;
      if (puVar10 != (ulong *)0x0) {
        puVar1 = puVar10 + 1;
      }
      if (DAT_00d1f0e8 == '\x01') {
        if (*(byte *)((long)puVar1 + 3) == 1) {
          lVar7 = (long)param_1[0x184] - (long)param_1[0x183];
          if (lVar7 != 0) {
            uVar8 = lVar7 >> 5;
            pbVar11 = (byte *)param_1[0x183];
            do {
              uVar9 = uVar8 >> 1;
              __dest = pbVar11 + uVar9 * 0x20 + 0x20;
              uVar8 = uVar8 + ~uVar9;
              if ((byte)*puVar1 <= pbVar11[uVar9 * 0x20]) {
                __dest = pbVar11;
                uVar8 = uVar9;
              }
              pbVar11 = __dest;
            } while (uVar8 != 0);
            if (((byte *)param_1[0x184] != __dest) && (*__dest == (byte)*puVar1)) {
              uVar13 = *(undefined8 *)(__dest + 0x10);
              bVar3 = __dest[0x18];
              uVar4 = FUN_008769d0(*param_1);
              FUN_00887138(param_1,uVar13,__dest + 4,bVar3,uVar4);
              lVar7 = param_1[0x184] - (long)(__dest + 0x20);
              if (lVar7 != 0) {
                memmove(__dest,__dest + 0x20,lVar7 - 7);
              }
              param_1[0x184] = __dest + lVar7;
            }
          }
          *(byte *)((long)puVar1 + 1) = 0;
          *(byte *)((long)puVar1 + 3) = 0;
        }
        else if (*(byte *)((long)puVar1 + 1) == 1) {
          *(byte *)((long)puVar1 + 1) = 0;
          if (DAT_00d1f088 == '\x01') {
            param_1[0xf3] = param_1[0xf3] + -1;
          }
          uVar8 = (ulong)(byte)*puVar1;
          uVar9 = param_1[0xcb];
          uVar13 = *param_1;
          uVar12 = *(undefined8 *)(lVar7 + uVar14 * 8);
          iVar2 = *(int *)((long)param_1 + uVar8 * 4 + 0x818);
          *(undefined1 *)((long)param_1 + uVar8 + 0x698) = 0;
          *(int *)((long)param_1 + uVar8 * 4 + 0x818) = iVar2 + -1;
          uVar4 = FUN_008769d0(uVar13);
          FUN_00887138(param_1,uVar12,puVar1,uVar14 < uVar9,uVar4);
        }
      }
      else {
        *(byte *)((long)puVar1 + 1) = 0;
        if (DAT_00d1f088 == '\x01') {
          param_1[0xf3] = param_1[0xf3] + -1;
        }
        iVar2 = *(int *)((long)param_1 + 0xc);
        *(undefined1 *)((long)param_1 + (ulong)(byte)*puVar1 + 0x698) = 0;
        if (1 < iVar2) {
          uVar4 = FUN_008769d0(*param_1);
          uVar13 = *param_1;
          __s = (char *)**(undefined8 **)(param_1[0xd0] + uVar14 * 8);
          sVar5 = strlen(__s);
          FUN_0087664c(uVar13,__s,sVar5,(byte)*puVar1,*(undefined4 *)((long)puVar1 + 4),uVar4);
        }
        if ((0 < *(int *)(param_1 + 2)) && ((ulong)param_1[0xcb] <= uVar14)) {
          uVar4 = FUN_008769d0(*param_1);
          if (param_1[0x5f] != 0) {
            uVar8 = *(ulong *)(param_1[0xd0] + uVar14 * 8);
            uVar9 = ((ulong)(uint)((int)uVar8 << 3) + 8 ^ uVar8 >> 0x20) * -0x622015f714c7d297;
            uVar9 = (uVar8 >> 0x20 ^ uVar9 >> 0x2f ^ uVar9) * -0x622015f714c7d297;
            uVar9 = (uVar9 ^ uVar9 >> 0x2f) * -0x6b622cb0470b6a63 >>
                    ((ulong)*(byte *)(param_1 + 0x60) & 0x3f);
            if ((*(ulong *)(param_1[0x5d] + (uVar9 >> 6) * 8) >> (uVar9 & 0x3f) & 1) != 0) {
              do {
                if (*(ulong *)(param_1[0x5a] + uVar9 * 0x10) == uVar8) {
                  uVar6 = *(undefined4 *)(param_1[0x5a] + uVar9 * 0x10 + 8);
                  goto LAB_008865bc;
                }
                uVar9 = uVar9 + 1 & param_1[0x5e] - 1;
              } while ((*(ulong *)(param_1[0x5d] + (uVar9 >> 6) * 8) >> (uVar9 & 0x3f) & 1) != 0);
            }
          }
          uVar6 = 0xf;
LAB_008865bc:
          FUN_008760e4(*param_1,uVar6,(byte)*puVar1,(int)puVar1[1],uVar4);
        }
      }
      lVar7 = param_1[0xd0];
      uVar14 = uVar14 + 1;
      uVar8 = param_1[0xd1] - lVar7 >> 3;
    } while (uVar14 < uVar8);
  }
  if (param_2 >= uVar8 && param_2 - uVar8 != 0) {
    FUN_00870174(param_1 + 0xd0,param_2 - uVar8);
    return;
  }
  if (param_2 < uVar8) {
    param_1[0xd1] = lVar7 + param_2 * 8;
  }
  return;
}

