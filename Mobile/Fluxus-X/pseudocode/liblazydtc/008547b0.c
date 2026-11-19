/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008547b0
 */

void FUN_008547b0(undefined4 *param_1,long *param_2,undefined8 *param_3,uint param_4)

{
  undefined4 uVar1;
  long lVar2;
  ulong uVar3;
  byte bVar4;
  long lVar5;
  ulong uVar6;
  uint uVar7;
  int iVar8;
  undefined8 uVar9;
  
  uVar7 = (int)param_2[2] + 1;
  uVar6 = (ulong)uVar7;
  lVar2 = *param_2;
  uVar3 = param_2[1];
  *(uint *)(param_2 + 2) = uVar7;
  if (uVar6 < uVar3) {
    do {
      bVar4 = *(byte *)(lVar2 + uVar6);
      iVar8 = (int)uVar6;
      if (9 < (byte)(bVar4 - 0x30)) {
        if (bVar4 < 0x5f) {
          if (bVar4 != 0x2e) {
            if (bVar4 == 0x45) goto LAB_008548ac;
            break;
          }
        }
        else if (bVar4 != 0x5f) {
          if (bVar4 == 0x65) {
LAB_008548ac:
            uVar6 = (ulong)(iVar8 + 1U);
            *(uint *)(param_2 + 2) = iVar8 + 1U;
            if ((uVar6 < uVar3) &&
               ((*(char *)(lVar2 + uVar6) == '+' || (*(char *)(lVar2 + uVar6) == '-')))) {
              uVar6 = (ulong)(iVar8 + 2U);
              *(uint *)(param_2 + 2) = iVar8 + 2U;
            }
          }
          break;
        }
      }
      uVar6 = (ulong)(iVar8 + 1U);
      *(uint *)(param_2 + 2) = iVar8 + 1U;
    } while (uVar6 < uVar3);
  }
  uVar7 = (uint)uVar6;
  if (uVar6 < uVar3) {
    do {
      uVar7 = (uint)uVar6;
      bVar4 = *(byte *)(lVar2 + uVar6);
      if (((0x19 < (bVar4 | 0x20) - 0x61) && (9 < bVar4 - 0x30)) && (bVar4 != 0x5f)) break;
      uVar7 = uVar7 + 1;
      uVar6 = (ulong)uVar7;
      *(uint *)(param_2 + 2) = uVar7;
    } while (uVar6 < uVar3);
  }
  uVar1 = *(undefined4 *)((long)param_2 + 0x14);
  lVar5 = param_2[3];
  uVar9 = *param_3;
  *param_1 = 0x118;
  param_1[5] = uVar7 - param_4;
  *(undefined8 *)(param_1 + 1) = uVar9;
  *(ulong *)(param_1 + 6) = lVar2 + (ulong)param_4;
  *(ulong *)(param_1 + 3) = CONCAT44(uVar7 - (int)lVar5,uVar1);
  return;
}

