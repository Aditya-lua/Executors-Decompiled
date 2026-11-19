/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00887dd0
 */

void FUN_00887dd0(undefined8 *param_1,long param_2)

{
  undefined4 uVar1;
  long lVar2;
  bool bVar3;
  undefined8 *puVar4;
  undefined8 *puVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  long lVar11;
  long lVar12;
  ulong uVar13;
  long lVar14;
  ulong *puVar15;
  undefined8 *puVar16;
  long lVar17;
  long lVar18;
  ulong uVar19;
  undefined8 *local_80;
  undefined8 *local_78;
  long local_70;
  long local_68;
  
  lVar2 = tpidr_el0;
  local_68 = *(long *)(lVar2 + 0x28);
  local_70 = 0;
  lVar14 = param_1[0xf8];
  puVar16 = (undefined8 *)((long)(param_1[0xd1] - param_1[0xd0]) >> 3);
  lVar12 = param_1[0xf7];
  local_80 = puVar16;
  local_78 = puVar16;
  FUN_008948a4(param_1 + 0xfa,&local_80);
  *(undefined1 *)(param_1 + 0xcc) = 1;
  uVar6 = FUN_00875ec8(*param_1);
  lVar17 = *(long *)(param_2 + 0x28);
  uVar1 = *(undefined4 *)((long)param_1 + 0x64c);
  if (*(long *)(lVar17 + 0x28) != 0) {
    bVar3 = false;
    lVar18 = 0;
    uVar19 = 0;
    do {
      if (DAT_00d1f0e8 == '\x01') {
                    /* try { // try from 00887ea8 to 00887eeb has its CatchHandler @ 0088821c */
        FUN_00884cbc(param_1,lVar17,*(undefined8 *)(*(long *)(lVar17 + 0x20) + uVar19 * 8),puVar16);
      }
      FUN_0088506c(param_1,*(undefined8 *)(*(long *)(lVar17 + 0x20) + uVar19 * 8));
      lVar11 = *(long *)(param_1[0xfb] + -8);
      if (lVar11 == 0) {
        *(long *)(param_1[0xfb] + -0x10) = (long)(param_1[0xd1] - param_1[0xd0]) >> 3;
      }
      else {
        if (!bVar3) {
          FUN_00894bcc(param_1,lVar11,*(undefined8 *)(param_2 + 0x20),lVar17,uVar19 + 1);
          lVar18 = (long)(param_1[0xd1] - param_1[0xd0]) >> 3;
        }
        bVar3 = true;
      }
      uVar19 = uVar19 + 1;
    } while (uVar19 < *(ulong *)(lVar17 + 0x28));
    if (bVar3) {
      if (0 < *(int *)((long)param_1 + 0xc)) {
                    /* try { // try from 00887f2c to 00887f4b has its CatchHandler @ 008881e4 */
        FUN_00876644(*param_1,*(int *)(*(long *)(*(long *)(lVar17 + 0x20) +
                                                 *(ulong *)(lVar17 + 0x28) * 8 + -8) + 0x14) + 1);
      }
      FUN_008860c8(param_1,lVar18);
      FUN_008862e0(param_1,lVar18);
    }
  }
                    /* try { // try from 00887f50 to 00887f53 has its CatchHandler @ 008881e8 */
  uVar7 = FUN_00875ec8(*param_1);
  if (0 < *(int *)((long)param_1 + 0xc)) {
                    /* try { // try from 00887f70 to 00887f77 has its CatchHandler @ 008881f4 */
    FUN_00876644(*param_1,*(int *)(*(long *)(param_2 + 0x20) + 0xc) + 1);
  }
  uVar19 = *(ulong *)(param_2 + 0x20);
  if (param_1[0x2e] != 0) {
    uVar13 = ((ulong)(uint)((int)uVar19 << 3) + 8 ^ uVar19 >> 0x20) * -0x622015f714c7d297;
    uVar13 = (uVar19 >> 0x20 ^ uVar13 >> 0x2f ^ uVar13) * -0x622015f714c7d297;
    uVar13 = (uVar13 ^ uVar13 >> 0x2f) * -0x6b622cb0470b6a63 >>
             ((ulong)*(byte *)(param_1 + 0x2f) & 0x3f);
    if ((*(ulong *)(param_1[0x2c] + (uVar13 >> 6) * 8) >> (uVar13 & 0x3f) & 1) != 0) {
      do {
        puVar15 = (ulong *)(param_1[0x29] + uVar13 * 0x30);
        if (*puVar15 == uVar19) {
          if ((1 < (uint)puVar15[1]) && (((uint)puVar15[1] != 2 || ((char)puVar15[2] != '\0')))) {
            FUN_008860c8(param_1,puVar16);
            uVar10 = FUN_00875ec8(*param_1);
            goto LAB_008880f8;
          }
          break;
        }
        uVar13 = uVar13 + 1 & param_1[0x2d] - 1;
      } while ((*(ulong *)(param_1[0x2c] + (uVar13 >> 6) * 8) >> (uVar13 & 0x3f) & 1) != 0);
    }
  }
  local_80 = (undefined8 *)0x0;
  local_78 = (undefined8 *)0x0;
  local_70 = 0;
                    /* try { // try from 00888038 to 00888057 has its CatchHandler @ 008881f0 */
  FUN_0088cc80(param_1,uVar19,0,&local_80,1);
  FUN_008860c8(param_1,puVar16);
                    /* try { // try from 0088805c to 00888077 has its CatchHandler @ 008881ec */
  uVar8 = FUN_00875ec8(*param_1);
  FUN_00875cac(*param_1,0x18,0,0);
                    /* try { // try from 0088807c to 008880ab has its CatchHandler @ 008881fc */
  uVar9 = FUN_00875ec8(*param_1);
  FUN_008860c8(param_1,puVar16);
  uVar10 = FUN_00875ec8(*param_1);
  uVar19 = FUN_00875ed8(*param_1,uVar8,uVar6);
  puVar5 = local_78;
  puVar4 = local_80;
  if ((uVar19 & 1) == 0) {
LAB_008881c4:
    if (*(long *)(lVar2 + 0x28) == local_68) {
                    /* try { // try from 008881d4 to 008881e3 has its CatchHandler @ 008881fc */
                    /* WARNING: Subroutine does not return */
      FUN_0087fcd8(param_2 + 0xc,"Exceeded jump distance limit; simplify the code to compile");
    }
  }
  else {
    for (; puVar4 != puVar5; puVar4 = puVar4 + 1) {
                    /* try { // try from 008880c4 to 008880cb has its CatchHandler @ 008881f8 */
      uVar19 = FUN_00875ed8(*param_1,*puVar4,uVar9);
      if ((uVar19 & 1) == 0) goto LAB_008881c4;
    }
    if (local_80 != (undefined8 *)0x0) {
      local_78 = local_80;
      operator_delete(local_80,local_70 - (long)local_80);
    }
LAB_008880f8:
                    /* try { // try from 008880f8 to 008881bb has its CatchHandler @ 008881f4 */
    FUN_008862e0(param_1,puVar16);
    uVar13 = lVar14 - lVar12 >> 4;
    FUN_008949bc(param_1,param_2,uVar13,uVar10,uVar7);
    uVar19 = (long)(param_1[0xf8] - param_1[0xf7]) >> 4;
    if (uVar13 < uVar19 || uVar13 - uVar19 == 0) {
      if (uVar13 < uVar19) {
        param_1[0xf8] = param_1[0xf7] + (lVar14 - lVar12);
      }
    }
    else {
      FUN_00894a8c(param_1 + 0xf7,uVar13 - uVar19);
    }
    param_1[0xfb] = param_1[0xfb] + -0x18;
    *(undefined4 *)((long)param_1 + 0x64c) = uVar1;
    if (*(long *)(lVar2 + 0x28) == local_68) {
      return;
    }
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

