/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0088c8ec
 */

void FUN_0088c8ec(undefined8 *param_1,long param_2)

{
  uint uVar1;
  uint uVar2;
  int iVar3;
  undefined4 uVar4;
  ulong uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  ulong uVar9;
  ulong uVar10;
  ulong *puVar11;
  undefined8 uVar12;
  long lVar13;
  byte bVar14;
  long lVar15;
  
  uVar5 = FUN_0089acdc(param_1 + 0x29,*(undefined8 *)(param_2 + 0x28));
  if (param_1[0x2e] != 0) {
    uVar9 = *(ulong *)(param_2 + 0x20);
    uVar10 = ((ulong)(uint)((int)uVar9 << 3) + 8 ^ uVar9 >> 0x20) * -0x622015f714c7d297;
    uVar10 = (uVar9 >> 0x20 ^ uVar10 >> 0x2f ^ uVar10) * -0x622015f714c7d297;
    uVar10 = (uVar10 ^ uVar10 >> 0x2f) * -0x6b622cb0470b6a63 >>
             ((ulong)*(byte *)(param_1 + 0x2f) & 0x3f);
    if ((*(ulong *)(param_1[0x2c] + (uVar10 >> 6) * 8) >> (uVar10 & 0x3f) & 1) != 0) {
      do {
        puVar11 = (ulong *)(param_1[0x29] + uVar10 * 0x30);
        if (*puVar11 == uVar9) {
          if (1 < (uint)puVar11[1]) {
            if ((uint)puVar11[1] == 2) {
              bVar14 = (byte)puVar11[2];
            }
            else {
              bVar14 = 1;
            }
            goto LAB_0088c9d8;
          }
          break;
        }
        uVar10 = uVar10 + 1 & param_1[0x2d] - 1;
      } while ((*(ulong *)(param_1[0x2c] + (uVar10 >> 6) * 8) >> (uVar10 & 0x3f) & 1) != 0);
    }
  }
  bVar14 = 0;
LAB_0088c9d8:
  iVar3 = *(int *)((long)param_1 + 0x64c);
  uVar1 = iVar3 + 1;
  if (0xff < uVar1) {
                    /* try { // try from 0088cb68 to 0088cb7f has its CatchHandler @ 0088cb90 */
                    /* WARNING: Subroutine does not return */
    FUN_0087fcd8(param_2 + 0xc,
                 "Out of registers when trying to allocate %d registers: exceeded limit %d",1,0xff);
  }
  lVar13 = param_1[0xd1];
  lVar15 = param_1[0xd0];
  *(uint *)((long)param_1 + 0x64c) = uVar1;
  uVar2 = *(uint *)(param_1 + 0xca);
  if (*(uint *)(param_1 + 0xca) <= uVar1) {
    uVar2 = uVar1;
  }
  *(uint *)(param_1 + 0xca) = uVar2;
                    /* try { // try from 0088ca08 to 0088ca93 has its CatchHandler @ 0088cb98 */
  uVar4 = FUN_008769d0(*param_1);
  FUN_0088d1d0(param_1,*(undefined8 *)(param_2 + 0x20),iVar3,1);
  FUN_00884b7c(param_1,*(undefined8 *)(param_2 + 0x60),iVar3,uVar4);
  if ((bVar14 & 1) == 0) {
    uVar12 = FUN_00875ec8(*param_1);
    FUN_00875cac(*param_1,0x1a,iVar3,0);
  }
  else {
    uVar12 = 0;
  }
  FUN_0088506c(param_1,*(undefined8 *)(param_2 + 0x28));
  lVar13 = lVar13 - lVar15 >> 3;
  if ((uVar5 & 1) == 0) {
    FUN_008860c8(param_1,lVar13);
  }
  FUN_008862e0(param_1,lVar13);
  *(int *)((long)param_1 + 0x64c) = iVar3;
  if ((bVar14 & 1) == 0) {
    lVar13 = *(long *)(param_2 + 0x30);
    uVar6 = FUN_00875ec8(*param_1);
    if (lVar13 != 0) {
      if ((uVar5 & 1) == 0) {
        FUN_00875cac(*param_1,0x17,0,0);
        uVar7 = FUN_00875ec8(*param_1);
        FUN_0088506c(param_1,*(undefined8 *)(param_2 + 0x30));
        uVar8 = FUN_00875ec8(*param_1);
        uVar5 = FUN_00875ed8(*param_1,uVar12,uVar7);
        if (((uVar5 & 1) != 0) && (uVar5 = FUN_00875ed8(*param_1,uVar6,uVar8), (uVar5 & 1) != 0)) {
          return;
        }
        goto LAB_0088cb80;
      }
      FUN_0088506c(param_1,*(undefined8 *)(param_2 + 0x30));
    }
    uVar5 = FUN_00875ed8(*param_1,uVar12,uVar6);
    if ((uVar5 & 1) == 0) {
LAB_0088cb80:
                    /* WARNING: Subroutine does not return */
      FUN_0087fcd8(param_2 + 0xc,"Exceeded jump distance limit; simplify the code to compile");
    }
  }
  return;
}

