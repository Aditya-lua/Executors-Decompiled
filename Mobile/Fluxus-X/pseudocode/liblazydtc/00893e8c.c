/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00893e8c
 */

bool FUN_00893e8c(long param_1,ulong param_2)

{
  int iVar1;
  int iVar2;
  bool bVar3;
  byte bVar4;
  ulong uVar5;
  ulong *puVar6;
  
  iVar2 = DAT_00d1afc0;
  if (*(long *)(param_1 + 0x170) != 0) {
    uVar5 = ((ulong)(uint)((int)param_2 << 3) + 8 ^ param_2 >> 0x20) * -0x622015f714c7d297;
    uVar5 = (param_2 >> 0x20 ^ uVar5 >> 0x2f ^ uVar5) * -0x622015f714c7d297;
    uVar5 = (uVar5 ^ uVar5 >> 0x2f) * -0x6b622cb0470b6a63 >>
            ((ulong)*(byte *)(param_1 + 0x178) & 0x3f);
    if ((*(ulong *)(*(long *)(param_1 + 0x160) + (uVar5 >> 6) * 8) >> (uVar5 & 0x3f) & 1) != 0) {
      do {
        puVar6 = (ulong *)(*(long *)(param_1 + 0x148) + uVar5 * 0x30);
        if (*puVar6 == param_2) {
          if ((int)puVar6[1] != 0) {
            return true;
          }
          break;
        }
        uVar5 = uVar5 + 1 & *(long *)(param_1 + 0x168) - 1U;
      } while ((*(ulong *)(*(long *)(param_1 + 0x160) + (uVar5 >> 6) * 8) >> (uVar5 & 0x3f) & 1) !=
               0);
    }
  }
  iVar1 = *(int *)(param_2 + 8);
  if ((param_2 == 0) || (iVar1 != DAT_00d1b0a0)) {
    bVar4 = 0;
    if (iVar1 == DAT_00d1afc0) {
      bVar4 = FUN_00893e8c(param_1,*(undefined8 *)(param_2 + 0x20));
    }
    bVar3 = (bool)(iVar1 == iVar2 & bVar4);
  }
  else {
    bVar3 = (*(uint *)(param_2 + 0x1c) & 0xfffffff8) == 8;
  }
  return bVar3;
}

