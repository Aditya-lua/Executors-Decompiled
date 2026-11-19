/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00898c60
 */

undefined8 FUN_00898c60(long param_1,long param_2)

{
  ulong *puVar1;
  undefined8 uVar2;
  ulong uVar3;
  ulong *puVar4;
  ulong *puVar5;
  ulong uVar6;
  
  uVar6 = *(ulong *)(param_2 + 0x28);
  if (uVar6 < *(ulong *)(param_2 + 0x38)) {
LAB_00898c70:
    uVar2 = 0;
  }
  else {
    if (uVar6 == 0) {
      return 1;
    }
    puVar5 = *(ulong **)(param_2 + 0x20);
    puVar1 = puVar5 + uVar6;
    do {
      if (*(long *)(param_1 + 0x138) == 0) goto LAB_00898c70;
      uVar6 = *puVar5;
      uVar3 = ((ulong)(uint)((int)uVar6 << 3) + 8 ^ uVar6 >> 0x20) * -0x622015f714c7d297;
      uVar3 = (uVar6 >> 0x20 ^ uVar3 >> 0x2f ^ uVar3) * -0x622015f714c7d297;
      uVar3 = (uVar3 ^ uVar3 >> 0x2f) * -0x6b622cb0470b6a63 >>
              ((ulong)*(byte *)(param_1 + 0x140) & 0x3f);
      while( true ) {
        if ((*(ulong *)(*(long *)(param_1 + 0x128) + (uVar3 >> 6) * 8) >> (uVar3 & 0x3f) & 1) == 0)
        goto LAB_00898c70;
        puVar4 = (ulong *)(*(long *)(param_1 + 0x110) + uVar3 * 0x28);
        if (*puVar4 == uVar6) break;
        uVar3 = uVar3 + 1 & *(long *)(param_1 + 0x130) - 1U;
      }
      if ((*(char *)((long)puVar4 + 0x21) != '\x01') ||
         (((DAT_00d1ec40 & 1) != 0 &&
          ((DAT_00d1f0a8 & *(int *)(param_1 + 0xcf8) != -1) == 0 &&
           ((*(byte *)(uVar6 + 0x31) ^ 0xff) & 1) == 0)))) goto LAB_00898c70;
      puVar5 = puVar5 + 1;
      uVar2 = 1;
    } while (puVar5 != puVar1);
  }
  return uVar2;
}

