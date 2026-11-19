/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0089be8c
 */

void FUN_0089be8c(long *param_1,long *param_2)

{
  ulong *puVar1;
  ulong uVar2;
  ulong uVar3;
  ulong *puVar4;
  ulong *puVar5;
  ulong uVar6;
  ulong uVar7;
  
  puVar1 = (ulong *)*param_2;
  puVar4 = (ulong *)param_2[1];
  if (puVar4 != puVar1) {
    do {
      puVar5 = puVar4 + -7;
      if ((char)puVar4[-1] == '\x01') {
        if (param_1[5] != 0) {
          uVar2 = *puVar5;
          uVar3 = ((ulong)(uint)((int)uVar2 << 3) + 8 ^ uVar2 >> 0x20) * -0x622015f714c7d297;
          uVar3 = (uVar2 >> 0x20 ^ uVar3 >> 0x2f ^ uVar3) * -0x622015f714c7d297;
          uVar3 = (uVar3 ^ uVar3 >> 0x2f) * -0x6b622cb0470b6a63 >>
                  ((ulong)*(byte *)(param_1 + 6) & 0x3f);
          if ((*(ulong *)(param_1[3] + (uVar3 >> 6) * 8) >> (uVar3 & 0x3f) & 1) != 0) {
            do {
              puVar4 = (ulong *)(*param_1 + uVar3 * 0x30);
              if (*puVar4 == uVar2) {
                *(undefined4 *)(puVar4 + 1) = 0;
                break;
              }
              uVar3 = uVar3 + 1 & param_1[4] - 1U;
            } while ((*(ulong *)(param_1[3] + (uVar3 >> 6) * 8) >> (uVar3 & 0x3f) & 1) != 0);
          }
        }
      }
      else {
        puVar1 = (ulong *)FUN_0089bfc4(param_1,puVar5);
        uVar7 = puVar4[-5];
        uVar6 = puVar4[-6];
        uVar3 = puVar4[-3];
        uVar2 = puVar4[-4];
        puVar1[4] = puVar4[-2];
        puVar1[1] = uVar7;
        *puVar1 = uVar6;
        puVar1[3] = uVar3;
        puVar1[2] = uVar2;
        puVar1 = (ulong *)*param_2;
      }
      puVar4 = puVar5;
    } while (puVar5 != puVar1);
  }
  return;
}

