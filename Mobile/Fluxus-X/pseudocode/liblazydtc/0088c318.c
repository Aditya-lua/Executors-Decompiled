/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0088c318
 */

uint FUN_0088c318(undefined8 *param_1,long param_2)

{
  uint uVar1;
  undefined8 *puVar2;
  uint uVar3;
  uint uVar4;
  undefined4 uVar5;
  ulong uVar6;
  ulong *puVar7;
  
  puVar2 = param_1 + 0x186;
  if (param_1[0x19] != 0) {
    uVar6 = ((((ulong)puVar2 >> 3 & 0x3ffffff) << 6 | 8) ^ (ulong)puVar2 >> 0x20) *
            -0x622015f714c7d297;
    uVar6 = ((ulong)puVar2 >> 0x20 ^ uVar6 >> 0x2f ^ uVar6) * -0x622015f714c7d297;
    uVar6 = (uVar6 ^ uVar6 >> 0x2f) * -0x6b622cb0470b6a63 >>
            ((ulong)*(byte *)(param_1 + 0x1a) & 0x3f);
    if ((*(ulong *)(param_1[0x17] + (uVar6 >> 6) * 8) >> (uVar6 & 0x3f) & 1) != 0) {
      do {
        puVar7 = (ulong *)(param_1[0x14] + uVar6 * 0x18);
        if ((undefined8 *)*puVar7 == puVar2) {
          if (*(char *)((long)puVar7 + 9) == '\x01') {
            return (uint)(byte)puVar7[1];
          }
          break;
        }
        uVar6 = uVar6 + 1 & param_1[0x18] - 1;
      } while ((*(ulong *)(param_1[0x17] + (uVar6 >> 6) * 8) >> (uVar6 & 0x3f) & 1) != 0);
    }
  }
  uVar5 = FUN_0088dd6c(param_1);
  uVar4 = *(uint *)((long)param_1 + 0x64c);
  uVar1 = uVar4 + 1;
  if (0xff < uVar1) {
                    /* WARNING: Subroutine does not return */
    FUN_0087fcd8(param_2 + 0xc,
                 "Out of registers when trying to allocate %d registers: exceeded limit %d",1,0xff);
  }
  *(uint *)((long)param_1 + 0x64c) = uVar1;
  uVar3 = *(uint *)(param_1 + 0xca);
  if (*(uint *)(param_1 + 0xca) <= uVar1) {
    uVar3 = uVar1;
  }
  *(uint *)(param_1 + 0xca) = uVar3;
  FUN_00875b54(*param_1,9,uVar4,uVar5,0);
  return uVar4;
}

