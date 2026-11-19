/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00891ba0
 */

void FUN_00891ba0(undefined4 *param_1,long param_2,undefined1 param_3,ulong param_4)

{
  uint uVar1;
  uint uVar2;
  bool bVar3;
  bool bVar4;
  bool bVar5;
  bool bVar6;
  int iVar7;
  ulong uVar8;
  ulong *puVar9;
  double dVar10;
  undefined8 uVar11;
  
  if (*(long *)(param_2 + 0x170) != 0) {
    uVar8 = ((ulong)(uint)((int)param_4 << 3) + 8 ^ param_4 >> 0x20) * -0x622015f714c7d297;
    uVar8 = (param_4 >> 0x20 ^ uVar8 >> 0x2f ^ uVar8) * -0x622015f714c7d297;
    uVar8 = (uVar8 ^ uVar8 >> 0x2f) * -0x6b622cb0470b6a63 >>
            ((ulong)*(byte *)(param_2 + 0x178) & 0x3f);
    if ((*(ulong *)(*(long *)(param_2 + 0x160) + (uVar8 >> 6) * 8) >> (uVar8 & 0x3f) & 1) != 0) {
      do {
        puVar9 = (ulong *)(*(long *)(param_2 + 0x148) + uVar8 * 0x30);
        if (*puVar9 == param_4) {
          dVar10 = (double)puVar9[2];
          bVar3 = true;
          bVar6 = false;
          if ((int)puVar9[1] == 3) {
            bVar3 = false;
            bVar6 = true;
            if (!NAN(dVar10)) {
              bVar3 = dVar10 < 1.0;
              bVar6 = false;
            }
          }
          bVar4 = false;
          bVar5 = true;
          if (bVar3 == bVar6) {
            bVar4 = false;
            bVar5 = true;
            if (!NAN(dVar10)) {
              bVar4 = dVar10 == 256.0;
              bVar5 = 256.0 <= dVar10;
            }
          }
          if (bVar5 && !bVar4) {
            if ((int)puVar9[1] == 6) {
              *(undefined8 *)(param_1 + 1) = 0;
              *param_1 = 3;
              uVar1 = *(uint *)((long)puVar9 + 0xc);
              param_1[3] = 0;
              *(undefined1 *)(param_1 + 1) = param_3;
              *(double *)(param_1 + 4) = dVar10;
              *(ulong *)(param_1 + 6) = (ulong)uVar1;
              goto LAB_00891d50;
            }
          }
          else if (dVar10 == (double)(int)dVar10) {
            *(undefined8 *)(param_1 + 1) = 0;
            *param_1 = 4;
            *(undefined8 *)(param_1 + 5) = 0;
            *(undefined8 *)(param_1 + 3) = 0;
            param_1[7] = 0;
            *(undefined1 *)(param_1 + 1) = param_3;
            *(char *)((long)param_1 + 7) = (char)(int)dVar10 + -1;
            goto LAB_00891d50;
          }
          break;
        }
        uVar8 = uVar8 + 1 & *(long *)(param_2 + 0x168) - 1U;
      } while ((*(ulong *)(*(long *)(param_2 + 0x160) + (uVar8 >> 6) * 8) >> (uVar8 & 0x3f) & 1) !=
               0);
    }
  }
  *(undefined8 *)(param_1 + 1) = 0;
  *(undefined1 *)(param_1 + 1) = param_3;
  *param_1 = 5;
  *(undefined8 *)(param_1 + 5) = 0;
  *(undefined8 *)(param_1 + 3) = 0;
  param_1[7] = 0;
  iVar7 = FUN_0088df20(param_2,param_4);
  if (iVar7 < 0) {
    iVar7 = *(int *)(param_2 + 0x64c);
    uVar1 = iVar7 + 1;
    if (0xff < uVar1) {
                    /* WARNING: Subroutine does not return */
      FUN_0087fcd8(param_4 + 0xc,
                   "Out of registers when trying to allocate %d registers: exceeded limit %d",1,0xff
                  );
    }
    *(uint *)(param_2 + 0x64c) = uVar1;
    uVar2 = *(uint *)(param_2 + 0x650);
    if (*(uint *)(param_2 + 0x650) <= uVar1) {
      uVar2 = uVar1;
    }
    *(uint *)(param_2 + 0x650) = uVar2;
    iVar7 = FUN_00891438(param_2,param_4,iVar7,0xff);
  }
  *(char *)((long)param_1 + 6) = (char)iVar7;
LAB_00891d50:
  uVar11 = *(undefined8 *)(param_4 + 0xc);
  *(undefined8 *)(param_1 + 10) = *(undefined8 *)(param_4 + 0x14);
  *(undefined8 *)(param_1 + 8) = uVar11;
  return;
}

