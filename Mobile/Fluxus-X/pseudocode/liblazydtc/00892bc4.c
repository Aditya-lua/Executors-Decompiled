/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00892bc4
 */

bool FUN_00892bc4(long param_1,ulong param_2)

{
  int iVar1;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  ulong *puVar5;
  
  if ((param_2 == 0) || (*(int *)(param_2 + 8) != DAT_00d1b040)) {
    return *(int *)(param_2 + 8) == DAT_00d1b030;
  }
  if (*(int *)(param_1 + 8) < 2) {
    return true;
  }
  uVar2 = param_2 >> 0x20;
  uVar3 = (ulong)(uint)((int)param_2 << 3);
  if (*(long *)(param_1 + 0x170) != 0) {
    uVar4 = (uVar3 + 8 ^ uVar2) * -0x622015f714c7d297;
    uVar4 = (uVar2 ^ uVar4 >> 0x2f ^ uVar4) * -0x622015f714c7d297;
    uVar4 = (uVar4 ^ uVar4 >> 0x2f) * -0x6b622cb0470b6a63 >>
            ((ulong)*(byte *)(param_1 + 0x178) & 0x3f);
    if ((*(ulong *)(*(long *)(param_1 + 0x160) + (uVar4 >> 6) * 8) >> (uVar4 & 0x3f) & 1) != 0) {
      do {
        puVar5 = (ulong *)(*(long *)(param_1 + 0x148) + uVar4 * 0x30);
        if (*puVar5 == param_2) {
          if ((int)puVar5[1] != 0) {
            return false;
          }
          break;
        }
        uVar4 = uVar4 + 1 & *(long *)(param_1 + 0x168) - 1U;
      } while ((*(ulong *)(*(long *)(param_1 + 0x160) + (uVar4 >> 6) * 8) >> (uVar4 & 0x3f) & 1) !=
               0);
    }
  }
  if (*(long *)(param_1 + 0x250) != 0) {
    uVar3 = (uVar3 + 8 ^ uVar2) * -0x622015f714c7d297;
    uVar2 = (uVar2 ^ uVar3 >> 0x2f ^ uVar3) * -0x622015f714c7d297;
    uVar2 = (uVar2 ^ uVar2 >> 0x2f) * -0x6b622cb0470b6a63 >>
            ((ulong)*(byte *)(param_1 + 600) & 0x3f);
    if ((*(ulong *)(*(long *)(param_1 + 0x240) + (uVar2 >> 6) * 8) >> (uVar2 & 0x3f) & 1) != 0) {
      do {
        if (*(ulong *)(*(long *)(param_1 + 0x228) + uVar2 * 0x10) == param_2) {
          iVar1 = *(int *)(*(long *)(param_1 + 0x228) + uVar2 * 0x10 + 8);
          if (iVar1 != 0) {
            uVar2 = FUN_0087e5cc(iVar1);
            return uVar2 >> 0x20 != 1;
          }
          break;
        }
        uVar2 = uVar2 + 1 & *(long *)(param_1 + 0x248) - 1U;
      } while ((*(ulong *)(*(long *)(param_1 + 0x240) + (uVar2 >> 6) * 8) >> (uVar2 & 0x3f) & 1) !=
               0);
    }
  }
  uVar2 = FUN_00892e20(param_1,*(undefined8 *)(param_2 + 0x20));
  if ((uVar2 != 0) && (*(long *)(param_1 + 0x90) != 0)) {
    uVar3 = ((ulong)(uint)((int)uVar2 << 3) + 8 ^ uVar2 >> 0x20) * -0x622015f714c7d297;
    uVar3 = (uVar2 >> 0x20 ^ uVar3 >> 0x2f ^ uVar3) * -0x622015f714c7d297;
    uVar3 = (uVar3 ^ uVar3 >> 0x2f) * -0x6b622cb0470b6a63 >>
            ((ulong)*(byte *)(param_1 + 0x98) & 0x3f);
    if ((*(ulong *)(*(long *)(param_1 + 0x80) + (uVar3 >> 6) * 8) >> (uVar3 & 0x3f) & 1) != 0) {
      do {
        puVar5 = (ulong *)(*(long *)(param_1 + 0x68) + uVar3 * 0x50);
        if (*puVar5 == uVar2) {
          if ((*(byte *)((long)puVar5 + 0x35) & 1) == 0) {
            return true;
          }
          return false;
        }
        uVar3 = uVar3 + 1 & *(long *)(param_1 + 0x88) - 1U;
      } while ((*(ulong *)(*(long *)(param_1 + 0x80) + (uVar3 >> 6) * 8) >> (uVar3 & 0x3f) & 1) != 0
              );
    }
  }
  return true;
}

