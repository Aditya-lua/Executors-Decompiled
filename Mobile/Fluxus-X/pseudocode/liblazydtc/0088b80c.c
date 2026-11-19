/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0088b80c
 */

void FUN_0088b80c(undefined8 *param_1,long param_2)

{
  uint uVar1;
  undefined8 *puVar2;
  uint uVar3;
  int iVar4;
  bool bVar5;
  ulong uVar6;
  
  puVar2 = param_1 + 0x186;
  *(undefined1 *)((long)param_1 + 0xcfc) = 1;
  if (param_1[0x19] != 0) {
    uVar6 = ((((ulong)puVar2 >> 3 & 0x3ffffff) << 6 | 8) ^ (ulong)puVar2 >> 0x20) *
            -0x622015f714c7d297;
    uVar6 = ((ulong)puVar2 >> 0x20 ^ uVar6 >> 0x2f ^ uVar6) * -0x622015f714c7d297;
    uVar6 = (uVar6 ^ uVar6 >> 0x2f) * -0x6b622cb0470b6a63 >>
            ((ulong)*(byte *)(param_1 + 0x1a) & 0x3f);
    if ((*(ulong *)(param_1[0x17] + (uVar6 >> 6) * 8) >> (uVar6 & 0x3f) & 1) != 0) {
      do {
        if (*(undefined8 **)(param_1[0x14] + uVar6 * 0x18) == puVar2) {
          return;
        }
        uVar6 = uVar6 + 1 & param_1[0x18] - 1;
      } while ((*(ulong *)(param_1[0x17] + (uVar6 >> 6) * 8) >> (uVar6 & 0x3f) & 1) != 0);
    }
  }
  iVar4 = *(int *)((long)param_1 + 0x64c);
  uVar1 = iVar4 + 1;
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
  bVar5 = DAT_00d1f0a8 == '\x01';
  *(uint *)(param_1 + 0xca) = uVar3;
  if (bVar5) {
    if ((*(int *)(param_1 + 0x19f) != -1) && (*(int *)(param_1 + 0x19f) < 0x8000)) {
      FUN_00875cac(*param_1,0x36,iVar4);
      goto LAB_0088b954;
    }
  }
  FUN_00875b54(*param_1,0x35,iVar4,0,0);
  FUN_00875d18(*param_1,0);
LAB_0088b954:
  FUN_00884b7c(param_1,puVar2,iVar4,0xffffffff);
  return;
}

