/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008860c8
 */

void FUN_008860c8(undefined8 *param_1,ulong param_2)

{
  ulong *puVar1;
  byte bVar2;
  byte bVar3;
  ulong uVar4;
  ulong uVar5;
  ulong *puVar6;
  ulong uVar7;
  bool bVar8;
  
  uVar7 = (long)(param_1[0xd1] - param_1[0xd0]) >> 3;
  if (param_2 < uVar7) {
    bVar8 = false;
    bVar3 = 0xff;
    do {
      if (param_1[0x19] != 0) {
        uVar4 = *(ulong *)(param_1[0xd0] + param_2 * 8);
        uVar5 = ((ulong)(uint)((int)uVar4 << 3) + 8 ^ uVar4 >> 0x20) * -0x622015f714c7d297;
        uVar5 = (uVar4 >> 0x20 ^ uVar5 >> 0x2f ^ uVar5) * -0x622015f714c7d297;
        for (uVar5 = (uVar5 ^ uVar5 >> 0x2f) * -0x6b622cb0470b6a63 >>
                     ((ulong)*(byte *)(param_1 + 0x1a) & 0x3f);
            (*(ulong *)(param_1[0x17] + (uVar5 >> 6) * 8) >> (uVar5 & 0x3f) & 1) != 0;
            uVar5 = uVar5 + 1 & param_1[0x18] - 1) {
          puVar6 = (ulong *)(param_1[0x14] + uVar5 * 0x18);
          if (*puVar6 == uVar4) goto LAB_00886194;
        }
      }
      puVar6 = (ulong *)0x0;
LAB_00886194:
      puVar1 = (ulong *)0x0;
      if (puVar6 != (ulong *)0x0) {
        puVar1 = puVar6 + 1;
      }
      bVar2 = bVar3;
      if (*(byte *)((long)puVar1 + 2) == 1) {
        bVar2 = (byte)*puVar1;
        if (bVar3 <= (byte)*puVar1) {
          bVar2 = bVar3;
        }
        bVar8 = true;
      }
      param_2 = param_2 + 1;
      bVar3 = bVar2;
    } while (param_2 != uVar7);
    if (bVar8) {
      FUN_00875b54(*param_1,0xb,bVar2,0,0);
      return;
    }
  }
  return;
}

