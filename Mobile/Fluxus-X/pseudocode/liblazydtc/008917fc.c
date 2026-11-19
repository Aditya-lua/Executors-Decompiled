/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008917fc
 */

void FUN_008917fc(undefined8 *param_1,ulong param_2,undefined4 param_3,int param_4,int param_5)

{
  int iVar1;
  int iVar2;
  undefined4 uVar3;
  ulong uVar4;
  undefined8 uVar5;
  
  if (param_1[0x66] != 0) {
    uVar4 = ((ulong)(uint)((int)param_2 << 3) + 8 ^ param_2 >> 0x20) * -0x622015f714c7d297;
    uVar4 = (param_2 >> 0x20 ^ uVar4 >> 0x2f ^ uVar4) * -0x622015f714c7d297;
    uVar4 = (uVar4 ^ uVar4 >> 0x2f) * -0x6b622cb0470b6a63 >>
            ((ulong)*(byte *)(param_1 + 0x67) & 0x3f);
    if ((*(ulong *)(param_1[100] + (uVar4 >> 6) * 8) >> (uVar4 & 0x3f) & 1) != 0) {
      do {
        if (*(ulong *)(param_1[0x61] + uVar4 * 0x10) == param_2) {
          iVar1 = *(int *)(param_1[0x61] + uVar4 * 0x10 + 8);
          if (iVar1 == param_4) {
            return;
          }
          uVar5 = *param_1;
          iVar2 = FUN_008769d0(uVar5);
          uVar3 = FUN_008769d0(*param_1);
          FUN_008760e4(uVar5,iVar1,param_3,iVar2 - param_5,uVar3);
          return;
        }
        uVar4 = uVar4 + 1 & param_1[0x65] - 1;
      } while ((*(ulong *)(param_1[100] + (uVar4 >> 6) * 8) >> (uVar4 & 0x3f) & 1) != 0);
    }
  }
  return;
}

