/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00887138
 */

void FUN_00887138(undefined8 *param_1,undefined8 *param_2,undefined1 *param_3,ulong param_4,
                 undefined4 param_5)

{
  size_t sVar1;
  undefined4 uVar2;
  ulong uVar3;
  undefined8 uVar4;
  char *__s;
  
  if (1 < *(int *)((long)param_1 + 0xc)) {
    __s = (char *)*param_2;
    uVar4 = *param_1;
    sVar1 = strlen(__s);
    FUN_0087664c(uVar4,__s,sVar1,*param_3,*(undefined4 *)(param_3 + 4),param_5);
  }
  if (((param_4 & 1) != 0) || (*(int *)(param_1 + 2) < 1)) {
    return;
  }
  if (param_1[0x5f] != 0) {
    uVar3 = ((ulong)(uint)((int)param_2 << 3) + 8 ^ (ulong)param_2 >> 0x20) * -0x622015f714c7d297;
    uVar3 = ((ulong)param_2 >> 0x20 ^ uVar3 >> 0x2f ^ uVar3) * -0x622015f714c7d297;
    uVar3 = (uVar3 ^ uVar3 >> 0x2f) * -0x6b622cb0470b6a63 >>
            ((ulong)*(byte *)(param_1 + 0x60) & 0x3f);
    if ((*(ulong *)(param_1[0x5d] + (uVar3 >> 6) * 8) >> (uVar3 & 0x3f) & 1) != 0) {
      do {
        if (*(undefined8 **)(param_1[0x5a] + uVar3 * 0x10) == param_2) {
          uVar2 = *(undefined4 *)(param_1[0x5a] + uVar3 * 0x10 + 8);
          goto LAB_00887250;
        }
        uVar3 = uVar3 + 1 & param_1[0x5e] - 1;
      } while ((*(ulong *)(param_1[0x5d] + (uVar3 >> 6) * 8) >> (uVar3 & 0x3f) & 1) != 0);
    }
  }
  uVar2 = 0xf;
LAB_00887250:
  FUN_008760e4(*param_1,uVar2,*param_3,*(undefined4 *)(param_3 + 8),param_5);
  return;
}

