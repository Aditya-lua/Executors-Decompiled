/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00886830
 */

ulong * FUN_00886830(long *param_1,ulong *param_2)

{
  ulong *puVar1;
  ulong uVar2;
  ulong uVar3;
  ulong *puVar4;
  
  if (param_1[5] != 0) {
    uVar2 = *param_2;
    uVar3 = ((ulong)(uint)((int)uVar2 << 3) + 8 ^ uVar2 >> 0x20) * -0x622015f714c7d297;
    uVar3 = (uVar2 >> 0x20 ^ uVar3 >> 0x2f ^ uVar3) * -0x622015f714c7d297;
    uVar3 = (uVar3 ^ uVar3 >> 0x2f) * -0x6b622cb0470b6a63 >> ((ulong)*(byte *)(param_1 + 6) & 0x3f);
    if ((*(ulong *)(param_1[3] + (uVar3 >> 6) * 8) >> (uVar3 & 0x3f) & 1) != 0) {
      do {
        puVar4 = (ulong *)(*param_1 + uVar3 * 0x18);
        if (*puVar4 == uVar2) goto LAB_008868dc;
        uVar3 = uVar3 + 1 & param_1[4] - 1U;
      } while ((*(ulong *)(param_1[3] + (uVar3 >> 6) * 8) >> (uVar3 & 0x3f) & 1) != 0);
    }
  }
  puVar4 = (ulong *)0x0;
LAB_008868dc:
  puVar1 = (ulong *)0x0;
  if (puVar4 != (ulong *)0x0) {
    puVar1 = puVar4 + 1;
  }
  return puVar1;
}

