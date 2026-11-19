/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0088a6c0
 */

void FUN_0088a6c0(undefined8 *param_1,long param_2)

{
  uint uVar1;
  undefined4 uVar2;
  int iVar3;
  int iVar4;
  long lVar5;
  undefined4 uVar6;
  int iVar7;
  int iVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  char *__s1;
  char *__s2;
  uint uVar14;
  long lVar15;
  ulong uVar16;
  long lVar17;
  long lVar18;
  ulong uVar19;
  undefined1 auVar20 [16];
  long local_80;
  long lStack_78;
  undefined8 local_70;
  long local_68;
  
  lVar5 = tpidr_el0;
  local_68 = *(long *)(lVar5 + 0x28);
  lVar18 = param_1[0xf8];
  lVar17 = param_1[0xf7];
  local_70 = 0;
  lVar15 = (long)(param_1[0xd1] - param_1[0xd0]) >> 3;
  uVar2 = *(undefined4 *)((long)param_1 + 0x64c);
                    /* try { // try from 0088a720 to 0088a72b has its CatchHandler @ 0088aae8 */
  local_80 = lVar15;
  lStack_78 = lVar15;
  FUN_008948a4(param_1 + 0xfa,&local_80);
  iVar3 = *(int *)((long)param_1 + 0x64c);
  *(undefined1 *)(param_1 + 0xcc) = 1;
  uVar14 = iVar3 + 3;
  if (0xff < uVar14) {
    if (*(long *)(lVar5 + 0x28) == local_68) {
                    /* try { // try from 0088aa94 to 0088aaab has its CatchHandler @ 0088aaf0 */
                    /* WARNING: Subroutine does not return */
      FUN_0087fcd8(param_2 + 0xc,
                   "Out of registers when trying to allocate %d registers: exceeded limit %d",3,0xff
                  );
    }
    goto LAB_0088ab20;
  }
  *(uint *)((long)param_1 + 0x64c) = uVar14;
  uVar1 = *(uint *)(param_1 + 0xca);
  if (*(uint *)(param_1 + 0xca) <= uVar14) {
    uVar1 = uVar14;
  }
  *(uint *)(param_1 + 0xca) = uVar1;
                    /* try { // try from 0088a758 to 0088a76f has its CatchHandler @ 0088aaf0 */
  FUN_00895520(param_1,param_2 + 0x30,iVar3,3,1);
  uVar14 = *(uint *)(param_2 + 0x28);
  iVar4 = *(int *)((long)param_1 + 0x64c);
  if (uVar14 < 3) {
    uVar14 = 2;
  }
  uVar1 = uVar14 + iVar4;
  if (0xff < uVar1) {
    if (*(long *)(lVar5 + 0x28) == local_68) {
                    /* try { // try from 0088aac0 to 0088aad3 has its CatchHandler @ 0088aae0 */
                    /* WARNING: Subroutine does not return */
      FUN_0087fcd8(param_2 + 0xc,
                   "Out of registers when trying to allocate %d registers: exceeded limit %d",uVar14
                   ,0xff);
    }
    goto LAB_0088ab20;
  }
  *(uint *)((long)param_1 + 0x64c) = uVar1;
  uVar14 = *(uint *)(param_1 + 0xca);
  if (*(uint *)(param_1 + 0xca) <= uVar1) {
    uVar14 = uVar1;
  }
  *(uint *)(param_1 + 0xca) = uVar14;
                    /* try { // try from 0088a7a8 to 0088a7ab has its CatchHandler @ 0088aae4 */
  uVar6 = FUN_008769d0(*param_1);
  if ((*(int *)(param_1 + 1) < 1) || (2 < *(ulong *)(param_2 + 0x28))) {
LAB_0088a850:
    iVar7 = 0x4c;
  }
  else if (*(long *)(param_2 + 0x38) == 2) {
    if (((*(byte *)(param_1 + 0xcf) & 1) != 0) || ((*(byte *)((long)param_1 + 0x679) & 1) != 0))
    goto LAB_0088a850;
                    /* try { // try from 0088aa14 to 0088aa1f has its CatchHandler @ 0088aad4 */
    auVar20 = FUN_0087deec(**(undefined8 **)(param_2 + 0x30),param_1 + 0x1b,param_1 + 0x22);
    __s1 = auVar20._8_8_;
    iVar7 = 0x4c;
    if ((auVar20._0_8_ == 0) && (__s1 != (char *)0x0)) {
      __s2 = "next";
LAB_0088aa3c:
      iVar8 = strcmp(__s1,__s2);
      iVar7 = 0x3d;
      if (iVar8 != 0) {
        iVar7 = 0x4c;
      }
    }
  }
  else {
    if ((*(long *)(param_2 + 0x38) != 1) ||
       (*(int *)(**(long **)(param_2 + 0x30) + 8) != DAT_00d1b040)) goto LAB_0088a850;
                    /* try { // try from 0088a800 to 0088a80b has its CatchHandler @ 0088aad8 */
    auVar20 = FUN_0087deec(*(undefined8 *)(**(long **)(param_2 + 0x30) + 0x20),param_1 + 0x1b,
                           param_1 + 0x22);
    __s1 = auVar20._8_8_;
    iVar7 = 0x4c;
    if ((auVar20._0_8_ == 0) && (__s1 != (char *)0x0)) {
      iVar7 = strcmp(__s1,"ipairs");
      if (iVar7 != 0) {
        __s2 = "pairs";
        goto LAB_0088aa3c;
      }
      iVar7 = 0x3b;
    }
  }
                    /* try { // try from 0088a85c to 0088a877 has its CatchHandler @ 0088aaec */
  uVar9 = FUN_00875ec8(*param_1);
  FUN_00875cac(*param_1,iVar7,iVar3,0);
                    /* try { // try from 0088a87c to 0088a87f has its CatchHandler @ 0088aaf8 */
  uVar10 = FUN_00875ec8(*param_1);
  if (*(long *)(param_2 + 0x28) != 0) {
    uVar19 = 0;
    do {
                    /* try { // try from 0088a898 to 0088a8a7 has its CatchHandler @ 0088ab00 */
      FUN_00884b7c(param_1,*(undefined8 *)(*(long *)(param_2 + 0x20) + uVar19 * 8),
                   (int)uVar19 + iVar4,uVar6);
      uVar19 = uVar19 + 1;
    } while (uVar19 < *(ulong *)(param_2 + 0x28));
  }
                    /* try { // try from 0088a8bc to 0088a8f7 has its CatchHandler @ 0088aaf8 */
  FUN_0088506c(param_1,*(undefined8 *)(param_2 + 0x40));
  FUN_008860c8(param_1,lVar15);
  FUN_008862e0(param_1,lVar15);
  if (0 < *(int *)((long)param_1 + 0xc)) {
    FUN_00876644(*param_1,*(int *)(param_2 + 0xc) + 1);
  }
                    /* try { // try from 0088a8fc to 0088a8ff has its CatchHandler @ 0088aadc */
  uVar11 = FUN_00875ec8(*param_1);
                    /* try { // try from 0088a908 to 0088a93b has its CatchHandler @ 0088aaf4 */
  uVar12 = FUN_00875ec8(*param_1);
  FUN_00875cac(*param_1,0x3a,iVar3,0);
  FUN_00875d18(*param_1,*(uint *)(param_2 + 0x28) | (uint)(iVar7 == 0x3b) << 0x1f);
                    /* try { // try from 0088a940 to 0088a9b3 has its CatchHandler @ 0088aafc */
  uVar13 = FUN_00875ec8(*param_1);
  uVar19 = FUN_00875ed8(*param_1,uVar9,uVar12);
  if (((uVar19 & 1) == 0) || (uVar19 = FUN_00875ed8(*param_1,uVar12,uVar10), (uVar19 & 1) == 0)) {
    if (*(long *)(lVar5 + 0x28) == local_68) {
                    /* try { // try from 0088aa70 to 0088aa7f has its CatchHandler @ 0088aafc */
                    /* WARNING: Subroutine does not return */
      FUN_0087fcd8(param_2 + 0xc,"Exceeded jump distance limit; simplify the code to compile");
    }
  }
  else {
    uVar16 = lVar18 - lVar17 >> 4;
    FUN_008949bc(param_1,param_2,uVar16,uVar13,uVar11);
    uVar19 = (long)(param_1[0xf8] - param_1[0xf7]) >> 4;
    if (uVar16 < uVar19 || uVar16 - uVar19 == 0) {
      if (uVar16 < uVar19) {
        param_1[0xf8] = param_1[0xf7] + (lVar18 - lVar17);
      }
    }
    else {
      FUN_00894a8c(param_1 + 0xf7,uVar16 - uVar19);
    }
    param_1[0xfb] = param_1[0xfb] + -0x18;
    *(undefined4 *)((long)param_1 + 0x64c) = uVar2;
    if (*(long *)(lVar5 + 0x28) == local_68) {
      return;
    }
  }
LAB_0088ab20:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

