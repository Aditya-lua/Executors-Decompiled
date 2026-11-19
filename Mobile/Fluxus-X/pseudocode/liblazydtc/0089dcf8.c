/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0089dcf8
 */

ulong * FUN_0089dcf8(long *param_1,ulong *param_2)

{
  ulong *puVar1;
  ulong uVar2;
  ulong uVar3;
  ulong *puVar4;
  
  if (param_1[5] != 0) {
    uVar2 = *param_2;
    uVar3 = (uVar2 >> 4 ^ uVar2 >> 9) * -0x61c8864680b583eb >>
            ((ulong)*(byte *)(param_1 + 6) & 0x3f);
    if ((*(ulong *)(param_1[3] + (uVar3 >> 6) * 8) >> (uVar3 & 0x3f) & 1) != 0) {
      do {
        puVar4 = (ulong *)(*param_1 + uVar3 * 0x30);
        if (*puVar4 == uVar2) goto LAB_0089dd78;
        uVar3 = uVar3 + 1 & param_1[4] - 1U;
      } while ((*(ulong *)(param_1[3] + (uVar3 >> 6) * 8) >> (uVar3 & 0x3f) & 1) != 0);
    }
  }
  puVar4 = (ulong *)0x0;
LAB_0089dd78:
  puVar1 = (ulong *)0x0;
  if (puVar4 != (ulong *)0x0) {
    puVar1 = puVar4 + 1;
  }
  return puVar1;
}

