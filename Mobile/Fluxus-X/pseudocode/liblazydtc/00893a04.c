/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00893a04
 */

void FUN_00893a04(undefined8 *param_1,long param_2,uint param_3,uint param_4)

{
  uint uVar1;
  undefined8 *puVar2;
  uint uVar3;
  int iVar4;
  undefined4 uVar5;
  long lVar6;
  undefined8 *puVar7;
  int iVar8;
  int iVar9;
  uint uVar10;
  undefined8 uVar11;
  ulong uVar12;
  char cVar13;
  undefined4 uVar14;
  ulong uVar15;
  ulong *puVar16;
  long lVar17;
  undefined8 *local_78;
  undefined8 *local_70;
  long local_68;
  byte local_5c [4];
  long local_58;
  
  lVar6 = tpidr_el0;
  local_58 = *(long *)(lVar6 + 0x28);
  iVar4 = *(int *)(param_2 + 0x1c);
  uVar5 = *(undefined4 *)((long)param_1 + 0x64c);
  uVar12 = *(ulong *)(param_2 + 0x20);
  if (param_1[0x2e] != 0) {
    uVar15 = ((ulong)(uint)((int)uVar12 << 3) + 8 ^ uVar12 >> 0x20) * -0x622015f714c7d297;
    uVar15 = (uVar12 >> 0x20 ^ uVar15 >> 0x2f ^ uVar15) * -0x622015f714c7d297;
    uVar15 = (uVar15 ^ uVar15 >> 0x2f) * -0x6b622cb0470b6a63 >>
             ((ulong)*(byte *)(param_1 + 0x2f) & 0x3f);
    if ((*(ulong *)(param_1[0x2c] + (uVar15 >> 6) * 8) >> (uVar15 & 0x3f) & 1) != 0) {
      do {
        puVar16 = (ulong *)(param_1[0x29] + uVar15 * 0x30);
        if (*puVar16 == uVar12) {
          iVar8 = (int)puVar16[1];
          if (iVar8 != 0) {
            if (iVar8 == 1) {
              cVar13 = '\0';
            }
            else if (iVar8 == 2) {
              cVar13 = (char)puVar16[2];
            }
            else {
              cVar13 = '\x01';
            }
            lVar17 = 0x20;
            if ((iVar4 == 0xe) == (bool)cVar13) {
              lVar17 = 0x28;
            }
                    /* try { // try from 00893d30 to 00893d3f has its CatchHandler @ 00893e08 */
            FUN_0088d1d0(param_1,*(undefined8 *)(param_2 + lVar17),param_3,param_4 & 1);
            goto LAB_00893d40;
          }
          break;
        }
        uVar15 = uVar15 + 1 & param_1[0x2d] - 1;
      } while ((*(ulong *)(param_1[0x2c] + (uVar15 >> 6) * 8) >> (uVar15 & 0x3f) & 1) != 0);
    }
  }
                    /* try { // try from 00893b10 to 00893b17 has its CatchHandler @ 00893e40 */
  uVar12 = FUN_00893e8c(param_1);
  if ((uVar12 & 1) == 0) {
                    /* try { // try from 00893bfc to 00893c03 has its CatchHandler @ 00893e30 */
    iVar8 = FUN_0088df20(param_1,*(undefined8 *)(param_2 + 0x28));
    if (iVar8 < 0) {
                    /* try { // try from 00893c80 to 00893c87 has its CatchHandler @ 00893e10 */
      uVar10 = FUN_008868ec(param_1,*(undefined8 *)(param_2 + 0x28));
      if (0xff < uVar10) goto LAB_00893b1c;
      lVar17 = *(long *)(param_2 + 0x20);
                    /* try { // try from 00893c98 to 00893cff has its CatchHandler @ 00893e18 */
      iVar8 = FUN_0088df20(param_1,lVar17);
      if (iVar8 < 0) {
        iVar8 = *(int *)((long)param_1 + 0x64c);
        uVar1 = iVar8 + 1;
        if (0xff < uVar1) {
          if (*(long *)(lVar6 + 0x28) == local_58) {
                    /* try { // try from 00893df0 to 00893e07 has its CatchHandler @ 00893e18 */
                    /* WARNING: Subroutine does not return */
            FUN_0087fcd8(lVar17 + 0xc,
                         "Out of registers when trying to allocate %d registers: exceeded limit %d",
                         1,0xff);
          }
          goto LAB_00893e88;
        }
        *(uint *)((long)param_1 + 0x64c) = uVar1;
        uVar3 = *(uint *)(param_1 + 0xca);
        if (*(uint *)(param_1 + 0xca) <= uVar1) {
          uVar3 = uVar1;
        }
        *(uint *)(param_1 + 0xca) = uVar3;
        iVar8 = FUN_00891438(param_1,lVar17,iVar8,0xff);
      }
      uVar14 = 0x2f;
      if (iVar4 != 0xe) {
        uVar14 = 0x30;
      }
      FUN_00875b54(*param_1,uVar14,param_3,iVar8,uVar10);
    }
    else {
      lVar17 = *(long *)(param_2 + 0x20);
                    /* try { // try from 00893c10 to 00893c57 has its CatchHandler @ 00893e38 */
      iVar9 = FUN_0088df20(param_1,lVar17);
      if (iVar9 < 0) {
        iVar9 = *(int *)((long)param_1 + 0x64c);
        uVar10 = iVar9 + 1;
        if (0xff < uVar10) {
          if (*(long *)(lVar6 + 0x28) == local_58) {
                    /* try { // try from 00893dc8 to 00893ddf has its CatchHandler @ 00893e38 */
                    /* WARNING: Subroutine does not return */
            FUN_0087fcd8(lVar17 + 0xc,
                         "Out of registers when trying to allocate %d registers: exceeded limit %d",
                         1,0xff);
          }
          goto LAB_00893e88;
        }
        *(uint *)((long)param_1 + 0x64c) = uVar10;
        uVar1 = *(uint *)(param_1 + 0xca);
        if (*(uint *)(param_1 + 0xca) <= uVar10) {
          uVar1 = uVar10;
        }
        *(uint *)(param_1 + 0xca) = uVar1;
        iVar9 = FUN_00891438(param_1,lVar17,iVar9,0xff);
      }
      uVar14 = 0x2d;
      if (iVar4 != 0xe) {
        uVar14 = 0x2e;
      }
                    /* try { // try from 00893c6c to 00893c77 has its CatchHandler @ 00893e28 */
      FUN_00875b54(*param_1,uVar14,param_3,iVar9,iVar8);
    }
  }
  else {
LAB_00893b1c:
    uVar10 = param_3;
    if ((param_4 & 1) == 0) {
      uVar10 = *(uint *)((long)param_1 + 0x64c);
      uVar1 = uVar10 + 1;
      if (0xff < uVar1) {
        if (*(long *)(lVar6 + 0x28) == local_58) {
                    /* try { // try from 00893da0 to 00893db7 has its CatchHandler @ 00893e20 */
                    /* WARNING: Subroutine does not return */
          FUN_0087fcd8(param_2 + 0xc,
                       "Out of registers when trying to allocate %d registers: exceeded limit %d",1,
                       0xff);
        }
        goto LAB_00893e88;
      }
      *(uint *)((long)param_1 + 0x64c) = uVar1;
      uVar3 = *(uint *)(param_1 + 0xca);
      if (*(uint *)(param_1 + 0xca) <= uVar1) {
        uVar3 = uVar1;
      }
      *(uint *)(param_1 + 0xca) = uVar3;
    }
    local_5c[0] = (byte)uVar10;
    local_78 = (undefined8 *)0x0;
    local_70 = (undefined8 *)0x0;
    local_68 = 0;
                    /* try { // try from 00893b60 to 00893b83 has its CatchHandler @ 00893e48 */
    FUN_0088cc80(param_1,*(undefined8 *)(param_2 + 0x20),local_5c,&local_78,iVar4 != 0xe);
    FUN_0088d1d0(param_1,*(undefined8 *)(param_2 + 0x28),local_5c[0],1);
                    /* try { // try from 00893b88 to 00893b8b has its CatchHandler @ 00893e50 */
    uVar11 = FUN_00875ec8(*param_1);
    puVar7 = local_70;
    for (puVar2 = local_78; puVar2 != puVar7; puVar2 = puVar2 + 1) {
                    /* try { // try from 00893ba4 to 00893bab has its CatchHandler @ 00893e4c */
      uVar12 = FUN_00875ed8(*param_1,*puVar2,uVar11);
      if ((uVar12 & 1) == 0) {
        if (*(long *)(lVar6 + 0x28) == local_58) {
                    /* try { // try from 00893d80 to 00893d8f has its CatchHandler @ 00893e50 */
                    /* WARNING: Subroutine does not return */
          FUN_0087fcd8(param_2 + 0xc,"Exceeded jump distance limit; simplify the code to compile");
        }
        goto LAB_00893e88;
      }
    }
    if ((uint)local_5c[0] != (param_3 & 0xff)) {
                    /* try { // try from 00893bcc to 00893bdb has its CatchHandler @ 00893e50 */
      FUN_00875b54(*param_1,6,param_3,local_5c[0],0);
    }
    if (local_78 != (undefined8 *)0x0) {
      local_70 = local_78;
      operator_delete(local_78,local_68 - (long)local_78);
    }
  }
LAB_00893d40:
  *(undefined4 *)((long)param_1 + 0x64c) = uVar5;
  if (*(long *)(lVar6 + 0x28) == local_58) {
    return;
  }
LAB_00893e88:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

