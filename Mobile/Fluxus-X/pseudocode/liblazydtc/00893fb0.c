/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00893fb0
 */

void FUN_00893fb0(undefined8 *param_1,long param_2,undefined4 param_3,uint param_4)

{
  uint uVar1;
  uint uVar2;
  int iVar3;
  undefined4 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  ulong uVar8;
  ulong uVar9;
  ulong *puVar10;
  undefined8 uVar11;
  long lVar12;
  byte bVar13;
  long lVar14;
  
  if (param_1[0x2e] != 0) {
    uVar8 = *(ulong *)(param_2 + 0x20);
    uVar9 = ((ulong)(uint)((int)uVar8 << 3) + 8 ^ uVar8 >> 0x20) * -0x622015f714c7d297;
    uVar9 = (uVar8 >> 0x20 ^ uVar9 >> 0x2f ^ uVar9) * -0x622015f714c7d297;
    uVar9 = (uVar9 ^ uVar9 >> 0x2f) * -0x6b622cb0470b6a63 >>
            ((ulong)*(byte *)(param_1 + 0x2f) & 0x3f);
    if ((*(ulong *)(param_1[0x2c] + (uVar9 >> 6) * 8) >> (uVar9 & 0x3f) & 1) != 0) {
      do {
        puVar10 = (ulong *)(param_1[0x29] + uVar9 * 0x30);
        if (*puVar10 == uVar8) {
          if (1 < (uint)puVar10[1]) {
            if ((uint)puVar10[1] == 2) {
              bVar13 = (byte)puVar10[2];
            }
            else {
              bVar13 = 1;
            }
            goto LAB_00894098;
          }
          break;
        }
        uVar9 = uVar9 + 1 & param_1[0x2d] - 1;
      } while ((*(ulong *)(param_1[0x2c] + (uVar9 >> 6) * 8) >> (uVar9 & 0x3f) & 1) != 0);
    }
  }
  bVar13 = 0;
LAB_00894098:
  iVar3 = *(int *)((long)param_1 + 0x64c);
  uVar1 = iVar3 + 1;
  if (0xff < uVar1) {
                    /* try { // try from 0089420c to 00894223 has its CatchHandler @ 00894234 */
                    /* WARNING: Subroutine does not return */
    FUN_0087fcd8(param_2 + 0xc,
                 "Out of registers when trying to allocate %d registers: exceeded limit %d",1,0xff);
  }
  lVar12 = param_1[0xd1];
  lVar14 = param_1[0xd0];
  *(uint *)((long)param_1 + 0x64c) = uVar1;
  uVar2 = *(uint *)(param_1 + 0xca);
  if (*(uint *)(param_1 + 0xca) <= uVar1) {
    uVar2 = uVar1;
  }
  *(uint *)(param_1 + 0xca) = uVar2;
                    /* try { // try from 008940c8 to 00894157 has its CatchHandler @ 0089423c */
  uVar4 = FUN_008769d0(*param_1);
  FUN_0088d1d0(param_1,*(undefined8 *)(param_2 + 0x20),iVar3,1);
  FUN_00884b7c(param_1,*(undefined8 *)(param_2 + 0x48),iVar3,uVar4);
  if ((bVar13 & 1) == 0) {
    uVar11 = FUN_00875ec8(*param_1);
    FUN_00875cac(*param_1,0x1a,iVar3,0);
  }
  else {
    uVar11 = 0;
  }
  FUN_0088d1d0(param_1,*(undefined8 *)(param_2 + 0x30),param_3,param_4 & 1);
  lVar12 = lVar12 - lVar14 >> 3;
  FUN_008860c8(param_1,lVar12);
  FUN_008862e0(param_1,lVar12);
  *(int *)((long)param_1 + 0x64c) = iVar3;
  if ((bVar13 & 1) == 0) {
    uVar5 = FUN_00875ec8(*param_1);
    FUN_00875cac(*param_1,0x17,0,0);
    uVar6 = FUN_00875ec8(*param_1);
    FUN_0088d1d0(param_1,*(undefined8 *)(param_2 + 0x40),param_3,param_4 & 1);
    uVar7 = FUN_00875ec8(*param_1);
    uVar8 = FUN_00875ed8(*param_1,uVar11,uVar6);
    if (((uVar8 & 1) == 0) || (uVar8 = FUN_00875ed8(*param_1,uVar5,uVar7), (uVar8 & 1) == 0)) {
                    /* WARNING: Subroutine does not return */
      FUN_0087fcd8(param_2 + 0xc,"Exceeded jump distance limit; simplify the code to compile");
    }
  }
  return;
}

