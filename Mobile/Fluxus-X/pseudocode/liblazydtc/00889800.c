/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00889800
 */

void FUN_00889800(undefined8 *param_1,ulong param_2)

{
  uint uVar1;
  uint uVar2;
  undefined4 uVar3;
  int iVar4;
  ulong uVar5;
  ulong *puVar6;
  
  iVar4 = *(int *)(param_2 + 8);
  if ((((iVar4 != DAT_00d1b010) && (iVar4 != DAT_00d1b020)) && (iVar4 != DAT_00d1b030)) &&
     (iVar4 != DAT_00d1b070)) {
    if (param_1[0x2e] != 0) {
      uVar5 = ((ulong)(uint)((int)param_2 << 3) + 8 ^ param_2 >> 0x20) * -0x622015f714c7d297;
      uVar5 = (param_2 >> 0x20 ^ uVar5 >> 0x2f ^ uVar5) * -0x622015f714c7d297;
      uVar5 = (uVar5 ^ uVar5 >> 0x2f) * -0x6b622cb0470b6a63 >>
              ((ulong)*(byte *)(param_1 + 0x2f) & 0x3f);
      if ((*(ulong *)(param_1[0x2c] + (uVar5 >> 6) * 8) >> (uVar5 & 0x3f) & 1) != 0) {
        do {
          puVar6 = (ulong *)(param_1[0x29] + uVar5 * 0x30);
          if (*puVar6 == param_2) {
            if ((int)puVar6[1] != 0) {
              return;
            }
            break;
          }
          uVar5 = uVar5 + 1 & param_1[0x2d] - 1;
        } while ((*(ulong *)(param_1[0x2c] + (uVar5 >> 6) * 8) >> (uVar5 & 0x3f) & 1) != 0);
      }
    }
    if (iVar4 != DAT_00d1b040) {
      FUN_008769e0(*param_1,"expression only compiled for side effects");
    }
    uVar3 = *(undefined4 *)((long)param_1 + 0x64c);
                    /* try { // try from 00889930 to 0088999f has its CatchHandler @ 008899a0 */
    iVar4 = FUN_0088df20(param_1,param_2);
    if (iVar4 < 0) {
      iVar4 = *(int *)((long)param_1 + 0x64c);
      uVar1 = iVar4 + 1;
      if (0xff < uVar1) {
                    /* WARNING: Subroutine does not return */
        FUN_0087fcd8(param_2 + 0xc,
                     "Out of registers when trying to allocate %d registers: exceeded limit %d",1,
                     0xff);
      }
      *(uint *)((long)param_1 + 0x64c) = uVar1;
      uVar2 = *(uint *)(param_1 + 0xca);
      if (*(uint *)(param_1 + 0xca) <= uVar1) {
        uVar2 = uVar1;
      }
      *(uint *)(param_1 + 0xca) = uVar2;
      FUN_00891438(param_1,param_2,iVar4,0xff);
    }
    *(undefined4 *)((long)param_1 + 0x64c) = uVar3;
  }
  return;
}

