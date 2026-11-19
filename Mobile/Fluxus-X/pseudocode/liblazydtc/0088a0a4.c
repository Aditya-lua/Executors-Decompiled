/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0088a0a4
 */

void FUN_0088a0a4(undefined8 *param_1,long param_2)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  undefined4 uVar4;
  uint uVar5;
  long lVar6;
  undefined4 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  ulong uVar13;
  long lVar14;
  long lVar15;
  ulong uVar16;
  ulong uVar17;
  ulong uVar18;
  ulong uVar19;
  ulong *puVar20;
  uint uVar21;
  long lVar22;
  long local_80;
  long lStack_78;
  undefined8 local_70;
  long local_68;
  
  lVar6 = tpidr_el0;
  local_68 = *(long *)(lVar6 + 0x28);
  uVar4 = *(undefined4 *)((long)param_1 + 0x64c);
  if ((1 < *(int *)(param_1 + 1)) && (param_1[0x2e] != 0)) {
    uVar18 = *(ulong *)(param_2 + 0x30);
    uVar17 = (ulong)*(byte *)(param_1 + 0x2f);
    uVar13 = ((ulong)(uint)((int)uVar18 << 3) + 8 ^ uVar18 >> 0x20) * -0x622015f714c7d297;
    uVar13 = (uVar18 >> 0x20 ^ uVar13 >> 0x2f ^ uVar13) * -0x622015f714c7d297;
    uVar13 = (uVar13 ^ uVar13 >> 0x2f) * -0x6b622cb0470b6a63 >> (uVar17 & 0x3f);
    lVar14 = param_1[0x2c];
    if ((*(ulong *)(lVar14 + (uVar13 >> 6) * 8) >> (uVar13 & 0x3f) & 1) != 0) {
      lVar15 = param_1[0x29];
      uVar16 = param_1[0x2d] - 1;
      do {
        puVar20 = (ulong *)(lVar15 + uVar13 * 0x30);
        if (*puVar20 == uVar18) {
          if ((int)puVar20[1] != 0) {
            uVar19 = *(ulong *)(param_2 + 0x28);
            uVar13 = ((ulong)(uint)((int)uVar19 << 3) + 8 ^ uVar19 >> 0x20) * -0x622015f714c7d297;
            uVar13 = (uVar19 >> 0x20 ^ uVar13 >> 0x2f ^ uVar13) * -0x622015f714c7d297;
            uVar13 = (uVar13 ^ uVar13 >> 0x2f) * -0x6b622cb0470b6a63 >> (uVar17 & 0x3f);
            uVar18 = *(ulong *)(lVar14 + (uVar13 >> 6) * 8) >> (uVar13 & 0x3f);
            goto joined_r0x0088a1e0;
          }
          break;
        }
        uVar13 = uVar13 + 1 & uVar16;
      } while ((*(ulong *)(lVar14 + (uVar13 >> 6) * 8) >> (uVar13 & 0x3f) & 1) != 0);
    }
  }
LAB_0088a2b8:
  lVar22 = param_1[0xf8];
  lVar14 = param_1[0xf7];
  local_70 = 0;
  lVar15 = (long)(param_1[0xd1] - param_1[0xd0]) >> 3;
                    /* try { // try from 0088a2d8 to 0088a2e3 has its CatchHandler @ 0088a688 */
  local_80 = lVar15;
  lStack_78 = lVar15;
  FUN_008948a4(param_1 + 0xfa,&local_80);
  uVar5 = *(uint *)((long)param_1 + 0x64c);
  *(undefined1 *)(param_1 + 0xcc) = 1;
  uVar1 = uVar5 + 3;
  if (0xff < uVar1) {
    if (*(long *)(lVar6 + 0x28) == local_68) {
                    /* try { // try from 0088a638 to 0088a64f has its CatchHandler @ 0088a684 */
                    /* WARNING: Subroutine does not return */
      FUN_0087fcd8(param_2 + 0xc,
                   "Out of registers when trying to allocate %d registers: exceeded limit %d",3,0xff
                  );
    }
    goto LAB_0088a6bc;
  }
  *(uint *)((long)param_1 + 0x64c) = uVar1;
  uVar2 = *(uint *)(param_1 + 0xca);
  if (*(uint *)(param_1 + 0xca) <= uVar1) {
    uVar2 = uVar1;
  }
  *(uint *)(param_1 + 0xca) = uVar2;
                    /* try { // try from 0088a318 to 0088a467 has its CatchHandler @ 0088a694 */
  uVar7 = FUN_008769d0(*param_1);
  uVar1 = (uVar5 & 0xff) + 2;
  if (param_1[0x27] != 0) {
    uVar13 = *(ulong *)(param_2 + 0x20);
    uVar17 = ((ulong)(uint)((int)uVar13 << 3) + 8 ^ uVar13 >> 0x20) * -0x622015f714c7d297;
    uVar17 = (uVar13 >> 0x20 ^ uVar17 >> 0x2f ^ uVar17) * -0x622015f714c7d297;
    uVar17 = (uVar17 ^ uVar17 >> 0x2f) * -0x6b622cb0470b6a63 >>
             ((ulong)*(byte *)(param_1 + 0x28) & 0x3f);
    if ((*(ulong *)(param_1[0x25] + (uVar17 >> 6) * 8) >> (uVar17 & 0x3f) & 1) != 0) {
      do {
        puVar20 = (ulong *)(param_1[0x22] + uVar17 * 0x28);
        if (*puVar20 == uVar13) {
          if ((char)puVar20[4] == '\x01') {
            uVar21 = *(uint *)((long)param_1 + 0x64c);
            uVar2 = uVar21 + 1;
            if (0xff < uVar2) {
              if (*(long *)(lVar6 + 0x28) == local_68) {
                    /* try { // try from 0088a660 to 0088a677 has its CatchHandler @ 0088a67c */
                    /* WARNING: Subroutine does not return */
                FUN_0087fcd8(param_2 + 0xc,
                             "Out of registers when trying to allocate %d registers: exceeded limit %d"
                             ,1,0xff);
              }
              goto LAB_0088a6bc;
            }
            *(uint *)((long)param_1 + 0x64c) = uVar2;
            uVar3 = *(uint *)(param_1 + 0xca);
            if (*(uint *)(param_1 + 0xca) <= uVar2) {
              uVar3 = uVar2;
            }
            *(uint *)(param_1 + 0xca) = uVar3;
            goto LAB_0088a40c;
          }
          break;
        }
        uVar17 = uVar17 + 1 & param_1[0x26] - 1;
      } while ((*(ulong *)(param_1[0x25] + (uVar17 >> 6) * 8) >> (uVar17 & 0x3f) & 1) != 0);
    }
  }
  uVar21 = uVar1;
LAB_0088a40c:
  FUN_0088d1d0(param_1,*(undefined8 *)(param_2 + 0x28),uVar1,1);
  FUN_0088d1d0(param_1,*(undefined8 *)(param_2 + 0x30),uVar5,1);
  if (*(long *)(param_2 + 0x38) == 0) {
    FUN_00875b54(*param_1,4,uVar5 + 1,1,0);
  }
  else {
    FUN_0088d1d0(param_1,*(long *)(param_2 + 0x38),uVar5 + 1,1);
  }
                    /* try { // try from 0088a46c to 0088a487 has its CatchHandler @ 0088a690 */
  uVar8 = FUN_00875ec8(*param_1);
  FUN_00875cac(*param_1,0x38,uVar5,0);
                    /* try { // try from 0088a48c to 0088a507 has its CatchHandler @ 0088a698 */
  uVar9 = FUN_00875ec8(*param_1);
  if (uVar1 != (uVar21 & 0xff)) {
    FUN_00875b54(*param_1,6,uVar21,uVar1,0);
  }
  FUN_00884b7c(param_1,*(undefined8 *)(param_2 + 0x20),uVar21,uVar7);
  FUN_0088506c(param_1,*(undefined8 *)(param_2 + 0x40));
  FUN_008860c8(param_1,lVar15);
  FUN_008862e0(param_1,lVar15);
  if (0 < *(int *)((long)param_1 + 0xc)) {
    FUN_00876644(*param_1,*(int *)(param_2 + 0xc) + 1);
  }
                    /* try { // try from 0088a50c to 0088a50f has its CatchHandler @ 0088a680 */
  uVar10 = FUN_00875ec8(*param_1);
                    /* try { // try from 0088a518 to 0088a533 has its CatchHandler @ 0088a68c */
  uVar11 = FUN_00875ec8(*param_1);
  FUN_00875cac(*param_1,0x39,uVar5,0);
                    /* try { // try from 0088a538 to 0088a627 has its CatchHandler @ 0088a69c */
  uVar12 = FUN_00875ec8(*param_1);
  uVar13 = FUN_00875ed8(*param_1,uVar8,uVar12);
  if (((uVar13 & 1) == 0) || (uVar13 = FUN_00875ed8(*param_1,uVar11,uVar9), (uVar13 & 1) == 0)) {
    if (*(long *)(lVar6 + 0x28) == local_68) {
                    /* WARNING: Subroutine does not return */
      FUN_0087fcd8(param_2 + 0xc,"Exceeded jump distance limit; simplify the code to compile");
    }
    goto LAB_0088a6bc;
  }
  uVar17 = lVar22 - lVar14 >> 4;
  FUN_008949bc(param_1,param_2,uVar17,uVar12,uVar10);
  uVar13 = (long)(param_1[0xf8] - param_1[0xf7]) >> 4;
  if (uVar17 < uVar13 || uVar17 - uVar13 == 0) {
    if (uVar17 < uVar13) {
      param_1[0xf8] = param_1[0xf7] + (lVar22 - lVar14);
    }
  }
  else {
    FUN_00894a8c(param_1 + 0xf7,uVar17 - uVar13);
  }
  param_1[0xfb] = param_1[0xfb] + -0x18;
LAB_0088a5d0:
  *(undefined4 *)((long)param_1 + 0x64c) = uVar4;
  if (*(long *)(lVar6 + 0x28) == local_68) {
    return;
  }
LAB_0088a6bc:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
joined_r0x0088a1e0:
  if ((uVar18 & 1) == 0) goto LAB_0088a2b8;
  puVar20 = (ulong *)(lVar15 + uVar13 * 0x30);
  if (*puVar20 == uVar19) {
    if ((int)puVar20[1] != 0) {
      uVar13 = *(ulong *)(param_2 + 0x38);
      if (uVar13 == 0) goto LAB_0088a298;
      uVar18 = ((ulong)(uint)((int)uVar13 << 3) + 8 ^ uVar13 >> 0x20) * -0x622015f714c7d297;
      uVar18 = (uVar13 >> 0x20 ^ uVar18 >> 0x2f ^ uVar18) * -0x622015f714c7d297;
      uVar17 = (uVar18 ^ uVar18 >> 0x2f) * -0x6b622cb0470b6a63 >> (uVar17 & 0x3f);
      uVar18 = *(ulong *)(lVar14 + (uVar17 >> 6) * 8) >> (uVar17 & 0x3f);
      goto joined_r0x0088a25c;
    }
    goto LAB_0088a2b8;
  }
  uVar13 = uVar13 + 1 & uVar16;
  uVar18 = *(ulong *)(lVar14 + (uVar13 >> 6) * 8) >> (uVar13 & 0x3f);
  goto joined_r0x0088a1e0;
joined_r0x0088a25c:
  if ((uVar18 & 1) == 0) goto LAB_0088a2b8;
  puVar20 = (ulong *)(lVar15 + uVar17 * 0x30);
  if (*puVar20 == uVar13) {
    if ((int)puVar20[1] != 0) goto LAB_0088a298;
    goto LAB_0088a2b8;
  }
  uVar17 = uVar17 + 1 & uVar16;
  uVar18 = *(ulong *)(lVar14 + (uVar17 >> 6) * 8) >> (uVar17 & 0x3f);
  goto joined_r0x0088a25c;
LAB_0088a298:
                    /* try { // try from 0088a2a8 to 0088a2b3 has its CatchHandler @ 0088a678 */
  uVar13 = FUN_00898d78(param_1,param_2,DAT_00d1ef68,DAT_00d1ef88);
  if ((uVar13 & 1) == 0) goto LAB_0088a2b8;
  goto LAB_0088a5d0;
}

