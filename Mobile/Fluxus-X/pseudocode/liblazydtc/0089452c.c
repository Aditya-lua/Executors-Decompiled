/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0089452c
 */

void FUN_0089452c(undefined8 *param_1,long param_2)

{
  uint uVar1;
  uint uVar2;
  undefined4 uVar3;
  int iVar4;
  long lVar5;
  undefined4 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  ulong uVar12;
  ulong uVar13;
  ulong *puVar14;
  long lVar15;
  long lVar16;
  long lVar17;
  long local_80;
  long lStack_78;
  undefined8 local_70;
  long local_68;
  
  lVar5 = tpidr_el0;
  local_68 = *(long *)(lVar5 + 0x28);
  if (param_1[0x2e] != 0) {
    uVar12 = *(ulong *)(param_2 + 0x20);
    uVar13 = ((ulong)(uint)((int)uVar12 << 3) + 8 ^ uVar12 >> 0x20) * -0x622015f714c7d297;
    uVar13 = (uVar12 >> 0x20 ^ uVar13 >> 0x2f ^ uVar13) * -0x622015f714c7d297;
    uVar13 = (uVar13 ^ uVar13 >> 0x2f) * -0x6b622cb0470b6a63 >>
             ((ulong)*(byte *)(param_1 + 0x2f) & 0x3f);
    if ((*(ulong *)(param_1[0x2c] + (uVar13 >> 6) * 8) >> (uVar13 & 0x3f) & 1) != 0) {
      do {
        puVar14 = (ulong *)(param_1[0x29] + uVar13 * 0x30);
        if (*puVar14 == uVar12) {
          if (((int)puVar14[1] == 1) || (((int)puVar14[1] == 2 && ((char)puVar14[2] == '\0'))))
          goto LAB_008947f0;
          break;
        }
        uVar13 = uVar13 + 1 & param_1[0x2d] - 1;
      } while ((*(ulong *)(param_1[0x2c] + (uVar13 >> 6) * 8) >> (uVar13 & 0x3f) & 1) != 0);
    }
  }
  lVar17 = param_1[0xf8];
  lVar16 = param_1[0xf7];
  local_70 = 0;
  lVar15 = (long)(param_1[0xd1] - param_1[0xd0]) >> 3;
  uVar3 = *(undefined4 *)((long)param_1 + 0x64c);
                    /* try { // try from 00894650 to 0089465b has its CatchHandler @ 00894874 */
  local_80 = lVar15;
  lStack_78 = lVar15;
  FUN_008948a4(param_1 + 0xfa,&local_80);
  iVar4 = *(int *)((long)param_1 + 0x64c);
  *(undefined1 *)(param_1 + 0xcc) = 1;
  uVar1 = iVar4 + 1;
  if (uVar1 < 0x100) {
    *(uint *)((long)param_1 + 0x64c) = uVar1;
    uVar2 = *(uint *)(param_1 + 0xca);
    if (*(uint *)(param_1 + 0xca) <= uVar1) {
      uVar2 = uVar1;
    }
    *(uint *)(param_1 + 0xca) = uVar2;
                    /* try { // try from 0089468c to 0089468f has its CatchHandler @ 00894870 */
    uVar6 = FUN_008769d0(*param_1);
                    /* try { // try from 00894698 to 008946c7 has its CatchHandler @ 0089487c */
    uVar7 = FUN_00875ec8(*param_1);
    FUN_0088d1d0(param_1,*(undefined8 *)(param_2 + 0x20),iVar4,1);
    FUN_00884b7c(param_1,*(undefined8 *)(param_2 + 0x48),iVar4,uVar6);
                    /* try { // try from 008946cc to 0089470b has its CatchHandler @ 00894880 */
    uVar8 = FUN_00875ec8(*param_1);
    FUN_00875cac(*param_1,0x1a,iVar4,0);
    FUN_0088506c(param_1,*(undefined8 *)(param_2 + 0x28));
    FUN_008860c8(param_1,lVar15);
    FUN_008862e0(param_1,lVar15);
                    /* try { // try from 00894710 to 00894713 has its CatchHandler @ 00894868 */
    uVar9 = FUN_00875ec8(*param_1);
                    /* try { // try from 0089471c to 00894757 has its CatchHandler @ 00894878 */
    uVar10 = FUN_00875ec8(*param_1);
    if (0 < *(int *)((long)param_1 + 0xc)) {
      FUN_00876644(*param_1,*(int *)(*(long *)(param_2 + 0x20) + 0xc) + 1);
    }
    FUN_00875cac(*param_1,0x18,0,0);
                    /* try { // try from 0089475c to 0089483f has its CatchHandler @ 00894884 */
    uVar11 = FUN_00875ec8(*param_1);
    uVar12 = FUN_00875ed8(*param_1,uVar10,uVar7);
    if (((uVar12 & 1) == 0) || (uVar12 = FUN_00875ed8(*param_1,uVar8,uVar11), (uVar12 & 1) == 0)) {
      if (*(long *)(lVar5 + 0x28) == local_68) {
                    /* WARNING: Subroutine does not return */
        FUN_0087fcd8(param_2 + 0xc,"Exceeded jump distance limit; simplify the code to compile");
      }
    }
    else {
      uVar13 = lVar17 - lVar16 >> 4;
      FUN_008949bc(param_1,param_2,uVar13,uVar11,uVar9);
      uVar12 = (long)(param_1[0xf8] - param_1[0xf7]) >> 4;
      if (uVar13 < uVar12 || uVar13 - uVar12 == 0) {
        if (uVar13 < uVar12) {
          param_1[0xf8] = param_1[0xf7] + (lVar17 - lVar16);
        }
      }
      else {
        FUN_00894a8c(param_1 + 0xf7,uVar13 - uVar12);
      }
      param_1[0xfb] = param_1[0xfb] + -0x18;
      *(undefined4 *)((long)param_1 + 0x64c) = uVar3;
LAB_008947f0:
      if (*(long *)(lVar5 + 0x28) == local_68) {
        return;
      }
    }
  }
  else if (*(long *)(lVar5 + 0x28) == local_68) {
                    /* try { // try from 00894850 to 00894867 has its CatchHandler @ 0089486c */
                    /* WARNING: Subroutine does not return */
    FUN_0087fcd8(param_2 + 0xc,
                 "Out of registers when trying to allocate %d registers: exceeded limit %d",1,0xff);
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

