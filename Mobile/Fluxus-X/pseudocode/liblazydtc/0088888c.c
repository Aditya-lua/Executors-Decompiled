/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0088888c
 */

void FUN_0088888c(long *param_1,ulong param_2,int param_3,uint param_4,uint param_5,uint param_6)

{
  undefined *puVar1;
  int iVar2;
  uint uVar3;
  byte bVar4;
  bool bVar5;
  int iVar6;
  uint uVar7;
  uint uVar8;
  undefined4 uVar9;
  ulong uVar10;
  size_t sVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  ulong extraout_x1;
  ulong uVar15;
  long lVar16;
  ulong uVar17;
  ulong uVar18;
  ulong uVar19;
  ulong *puVar20;
  ulong uVar21;
  char *pcVar22;
  long lVar23;
  uint uVar24;
  ulong uVar25;
  undefined1 auVar26 [16];
  uint local_84;
  uint local_68;
  uint local_64;
  
  uVar25 = (ulong)param_4;
  if (0 < *(int *)((long)param_1 + 0xc)) {
    FUN_00876644(*param_1,*(int *)(param_2 + 0xc) + 1);
  }
  if (((((DAT_00d1f108 == '\x01') && ((*(byte *)(param_2 + 0x48) & 1) == 0)) &&
       (lVar16 = *(long *)(param_2 + 0x20), lVar16 != 0)) &&
      ((*(int *)(lVar16 + 8) == DAT_00d1b020 && (*(char **)(lVar16 + 0x20) != (char *)0x0)))) &&
     (iVar6 = strcmp(*(char **)(lVar16 + 0x20),"require"), iVar6 == 0)) {
    *(undefined1 *)((long)param_1 + 0x662) = 1;
  }
  if (((1 < (int)param_1[1]) && ((*(byte *)(param_2 + 0x48) & 1) == 0)) &&
     (uVar10 = FUN_00892e20(param_1,*(undefined8 *)(param_2 + 0x20)), uVar10 != 0)) {
    if (param_1[0x12] != 0) {
      uVar15 = ((ulong)(uint)((int)uVar10 << 3) + 8 ^ uVar10 >> 0x20) * -0x622015f714c7d297;
      uVar15 = (uVar10 >> 0x20 ^ uVar15 >> 0x2f ^ uVar15) * -0x622015f714c7d297;
      uVar15 = (uVar15 ^ uVar15 >> 0x2f) * -0x6b622cb0470b6a63 >>
               ((ulong)*(byte *)(param_1 + 0x13) & 0x3f);
      if ((*(ulong *)(param_1[0x10] + (uVar15 >> 6) * 8) >> (uVar15 & 0x3f) & 1) != 0) {
        do {
          puVar20 = (ulong *)(param_1[0xd] + uVar15 * 0x50);
          if (*puVar20 == uVar10) {
            bVar4 = *(byte *)((long)puVar20 + 0x34);
            if (bVar4 == 1) {
              uVar15 = FUN_008957d4(param_1,param_2,uVar10,param_3,uVar25,param_6 & 1,DAT_00d1efa8,
                                    DAT_00d1efc8,DAT_00d1efe8);
              if ((uVar15 & 1) != 0) {
                return;
              }
              bVar4 = *(byte *)((long)puVar20 + 0x34);
            }
            if ((bVar4 & 1) != 0) goto LAB_008889e4;
            if ((*(byte *)(uVar10 + 0x70) & 1) != 0) {
              pcVar22 = "inlining failed: function is variadic";
              goto LAB_008889dc;
            }
            if (((*(byte *)(param_1 + 0xcf) & 1) == 0) &&
               (*(char *)((long)param_1 + 0x679) != '\x01')) goto LAB_008889e4;
            pcVar22 = "inlining failed: module uses getfenv/setfenv";
            goto LAB_008889dc;
          }
          uVar15 = uVar15 + 1 & param_1[0x11] - 1U;
        } while ((*(ulong *)(param_1[0x10] + (uVar15 >> 6) * 8) >> (uVar15 & 0x3f) & 1) != 0);
      }
    }
    pcVar22 = "inlining failed: function is variadic";
    if (*(char *)(uVar10 + 0x70) == '\0') {
      pcVar22 = "inlining failed: can\'t inline recursive calls";
    }
LAB_008889dc:
    FUN_008769e0(*param_1,pcVar22);
  }
LAB_008889e4:
  bVar4 = *(byte *)(param_2 + 0x48);
  uVar3 = *(uint *)((long)param_1 + 0x64c);
  iVar6 = (uint)bVar4 + *(int *)(param_2 + 0x40);
  uVar7 = param_4 & 0xff;
  uVar8 = uVar7;
  if (uVar7 < iVar6 + 1U) {
    uVar8 = iVar6 + 1;
  }
  if ((param_5 & 1) == 0) {
    uVar7 = uVar8 + uVar3;
    if (0xff < uVar7) goto LAB_00889740;
    uVar8 = *(uint *)(param_1 + 0xca);
    *(uint *)((long)param_1 + 0x64c) = uVar7;
    uVar24 = uVar3;
  }
  else {
    uVar8 = uVar8 - uVar7;
    uVar7 = uVar8 + uVar3;
    if (0xff < uVar7) {
LAB_00889740:
                    /* try { // try from 00889740 to 00889753 has its CatchHandler @ 008897d4 */
                    /* WARNING: Subroutine does not return */
      FUN_0087fcd8(param_2 + 0xc,
                   "Out of registers when trying to allocate %d registers: exceeded limit %d",uVar8,
                   0xff);
    }
    uVar8 = *(uint *)(param_1 + 0xca);
    *(uint *)((long)param_1 + 0x64c) = uVar7;
    uVar24 = uVar3 - param_4;
  }
  if (uVar8 <= uVar7) {
    uVar8 = uVar7;
  }
  *(uint *)(param_1 + 0xca) = uVar8;
  local_68 = 0xffffffff;
  if (((0 < (int)param_1[1]) && ((bVar4 & 1) == 0)) && (param_1[0x4a] != 0)) {
    uVar10 = ((ulong)(uint)((int)param_2 << 3) + 8 ^ param_2 >> 0x20) * -0x622015f714c7d297;
    uVar10 = (param_2 >> 0x20 ^ uVar10 >> 0x2f ^ uVar10) * -0x622015f714c7d297;
    uVar10 = (uVar10 ^ uVar10 >> 0x2f) * -0x6b622cb0470b6a63 >>
             ((ulong)*(byte *)(param_1 + 0x4b) & 0x3f);
    if ((*(ulong *)(param_1[0x48] + (uVar10 >> 6) * 8) >> (uVar10 & 0x3f) & 1) != 0) {
      do {
        if (*(ulong *)(param_1[0x45] + uVar10 * 0x10) == param_2) {
          local_68 = *(uint *)(param_1[0x45] + uVar10 * 0x10 + 8);
          if (local_68 != 0) {
            if ((int)local_68 < 0) goto LAB_00888ba4;
            if ((*(byte *)(*param_1 + 0x2c0) >> 4 & 1) != 0) {
                    /* try { // try from 00888b6c to 00888b77 has its CatchHandler @ 00889794 */
              auVar26 = FUN_0087deec(*(undefined8 *)(param_2 + 0x20),param_1 + 0x1b,param_1 + 0x22);
              lVar16 = auVar26._8_8_;
              if (*(long *)(param_2 + 0x40) == 0) {
                uVar10 = 0;
              }
              else {
                    /* try { // try from 00888b94 to 00888b9b has its CatchHandler @ 00889798 */
                uVar10 = FUN_00892bc4(param_1,*(undefined8 *)
                                               (*(long *)(param_2 + 0x38) +
                                                *(long *)(param_2 + 0x40) * 8 + -8));
              }
              if (auVar26._0_8_ == 0) {
                if (lVar16 != 0) {
                  puVar1 = &DAT_002a3568;
                  if ((uVar10 & 1) == 0) {
                    puVar1 = &DAT_002ab32c;
                  }
                  FUN_008769e0(*param_1,"builtin %s/%d%s",lVar16,*(undefined4 *)(param_2 + 0x40),
                               puVar1);
                }
              }
              else {
                puVar1 = &DAT_002a3568;
                if ((uVar10 & 1) == 0) {
                  puVar1 = &DAT_002ab32c;
                }
                    /* try { // try from 008892fc to 0088934f has its CatchHandler @ 00889798 */
                FUN_008769e0(*param_1,"builtin %s.%s/%d%s",auVar26._0_8_,lVar16,
                             *(undefined4 *)(param_2 + 0x40),puVar1);
              }
            }
            if (local_68 == 0x22) {
              uVar10 = *(ulong *)(param_2 + 0x40);
              if (uVar10 != 3) {
                uVar15 = 2;
                local_68 = 0x22;
                goto LAB_00889584;
              }
              if (param_1[0x2e] == 0) goto LAB_00889548;
              uVar15 = *(ulong *)(*(long *)(param_2 + 0x38) + 8);
              uVar10 = ((ulong)(uint)((int)uVar15 << 3) + 8 ^ uVar15 >> 0x20) * -0x622015f714c7d297;
              uVar10 = (uVar15 >> 0x20 ^ uVar10 >> 0x2f ^ uVar10) * -0x622015f714c7d297;
              uVar10 = (uVar10 ^ uVar10 >> 0x2f) * -0x6b622cb0470b6a63 >>
                       ((ulong)*(byte *)(param_1 + 0x2f) & 0x3f);
              lVar16 = param_1[0x2c];
              if ((*(ulong *)(lVar16 + (uVar10 >> 6) * 8) >> (uVar10 & 0x3f) & 1) == 0)
              goto LAB_00889548;
              lVar23 = param_1[0x29];
              uVar17 = param_1[0x2d] - 1;
              uVar21 = uVar10;
              goto LAB_00889418;
            }
            if (local_68 != 0x39) {
              uVar10 = *(ulong *)(param_2 + 0x40);
              if (uVar10 == 3) goto LAB_00889550;
              uVar15 = 2;
              goto LAB_00889584;
            }
            local_68 = 0xffffffff;
            if (((param_4 & 0xff) != 1) || ((param_6 & 1) != 0)) goto LAB_00888ba4;
                    /* try { // try from 0088937c to 0088939f has its CatchHandler @ 0088978c */
            FUN_00895dd8(param_1,param_2,param_3,1,param_5 & 1,0,uVar24);
            goto LAB_00889214;
          }
          break;
        }
        uVar10 = uVar10 + 1 & param_1[0x49] - 1U;
      } while ((*(ulong *)(param_1[0x48] + (uVar10 >> 6) * 8) >> (uVar10 & 0x3f) & 1) != 0);
    }
    local_68 = 0xffffffff;
  }
  goto LAB_00888ba4;
  while (uVar21 = uVar21 + 1 & uVar17,
        (*(ulong *)(lVar16 + (uVar21 >> 6) * 8) >> (uVar21 & 0x3f) & 1) != 0) {
LAB_00889418:
    puVar20 = (ulong *)(lVar23 + uVar21 * 0x30);
    if (*puVar20 == uVar15) {
      if ((int)puVar20[1] != 0) {
        uVar21 = *(ulong *)(*(long *)(param_2 + 0x38) + 0x10);
        uVar18 = ((ulong)(uint)((int)uVar21 << 3) + 8 ^ uVar21 >> 0x20) * -0x622015f714c7d297;
        uVar18 = (uVar21 >> 0x20 ^ uVar18 >> 0x2f ^ uVar18) * -0x622015f714c7d297;
        uVar18 = (uVar18 ^ uVar18 >> 0x2f) * -0x6b622cb0470b6a63 >>
                 ((ulong)*(byte *)(param_1 + 0x2f) & 0x3f);
        if ((*(ulong *)(lVar16 + (uVar18 >> 6) * 8) >> (uVar18 & 0x3f) & 1) != 0) {
          uVar19 = uVar18;
          goto LAB_008894d8;
        }
      }
      break;
    }
  }
LAB_00889548:
  local_68 = 0x22;
  goto LAB_00889550;
  while( true ) {
    uVar19 = uVar19 + 1 & uVar17;
    local_68 = 0x22;
    if ((*(ulong *)(lVar16 + (uVar19 >> 6) * 8) >> (uVar19 & 0x3f) & 1) == 0) break;
LAB_008894d8:
    puVar20 = (ulong *)(lVar23 + uVar19 * 0x30);
    if (*puVar20 == uVar21) {
      if ((int)puVar20[1] != 0) goto LAB_00889518;
      goto LAB_00889548;
    }
  }
  goto LAB_00889550;
  while (uVar10 = uVar10 + 1 & uVar17,
        (*(ulong *)(lVar16 + (uVar10 >> 6) * 8) >> (uVar10 & 0x3f) & 1) != 0) {
LAB_00889518:
    puVar20 = (ulong *)(lVar23 + uVar10 * 0x30);
    if (*puVar20 == uVar15) {
      uVar7 = (uint)(double)puVar20[2];
      if ((int)puVar20[1] != 3) {
        uVar7 = 0xffffffff;
      }
      goto LAB_00889658;
    }
  }
  uVar7 = 0xffffffff;
LAB_00889658:
  do {
    puVar20 = (ulong *)(lVar23 + uVar18 * 0x30);
    if (*puVar20 == uVar21) {
      if ((((int)puVar20[1] == 3) && (local_68 = 0x22, -1 < (int)uVar7)) &&
         (iVar6 = (int)(double)puVar20[2], 0 < iVar6)) {
        if ((int)(uVar7 + iVar6) < 0x21) {
                    /* try { // try from 008896e8 to 00889723 has its CatchHandler @ 00889784 */
          iVar6 = FUN_00874f18((double)(int)(iVar6 * 0x20 - 0x20U | uVar7),*param_1);
          if (iVar6 < 0) {
                    /* try { // try from 00889774 to 00889783 has its CatchHandler @ 00889784 */
                    /* WARNING: Subroutine does not return */
            FUN_0087fcd8(param_2 + 0xc,"Exceeded constant limit; simplify the code to compile");
          }
          FUN_00895f98(param_1,param_2,param_3,uVar25,param_5 & 1,param_6 & 1,uVar24,0x3b,iVar6);
          goto LAB_00889214;
        }
      }
      else {
        local_68 = 0x22;
      }
      break;
    }
    uVar18 = uVar18 + 1 & uVar17;
    local_68 = 0x22;
  } while ((*(ulong *)(lVar16 + (uVar18 >> 6) * 8) >> (uVar18 & 0x3f) & 1) != 0);
LAB_00889550:
  uVar21 = 0;
  uVar15 = 2;
  do {
                    /* try { // try from 00889560 to 00889567 has its CatchHandler @ 008897b8 */
    iVar6 = FUN_0088df20(param_1,*(undefined8 *)(*(long *)(param_2 + 0x38) + uVar21 * 8));
    uVar10 = *(ulong *)(param_2 + 0x40);
    if (-1 < iVar6) {
      uVar15 = 3;
      break;
    }
    uVar21 = uVar21 + 1;
  } while (uVar21 < uVar10);
LAB_00889584:
  if (uVar10 - 1 < uVar15) {
                    /* try { // try from 0088959c to 008895a3 has its CatchHandler @ 00889790 */
    uVar10 = FUN_00892bc4(param_1,*(undefined8 *)(*(long *)(param_2 + 0x38) + uVar10 * 8 + -8));
    if ((uVar10 & 1) == 0) {
                    /* try { // try from 0088960c to 0088963b has its CatchHandler @ 00889790 */
      FUN_00895f98(param_1,param_2,param_3,uVar25,param_5 & 1,param_6 & 1,uVar24,local_68,0xffffffff
                  );
      goto LAB_00889214;
    }
    iVar6 = (int)param_1[1];
    if (1 < iVar6) {
                    /* try { // try from 008895b8 to 008895ff has its CatchHandler @ 00889788 */
      iVar6 = FUN_0087e5cc(local_68);
      if ((*(int *)(param_2 + 0x40) == iVar6) && ((extraout_x1 & 1) != 0)) {
        FUN_00895f98(param_1,param_2,param_3,uVar25,param_5 & 1,param_6 & 1,uVar24,local_68,
                     0xffffffff);
        goto LAB_00889214;
      }
      goto LAB_00888ba4;
    }
  }
  else {
LAB_00888ba4:
    iVar6 = (int)param_1[1];
  }
  if (iVar6 < 1) {
    if ((*(byte *)(param_2 + 0x48) & 1) == 0) goto LAB_00888cd0;
LAB_00888c98:
    lVar16 = *(long *)(param_2 + 0x20);
    if (*(int *)(lVar16 + 8) != DAT_00d1b050) {
      lVar16 = 0;
    }
                    /* try { // try from 00888cb4 to 00888cbb has its CatchHandler @ 008897bc */
    local_84 = FUN_0088df20(param_1,*(undefined8 *)(lVar16 + 0x20));
    if ((int)local_84 < 0) {
      uVar14 = *(undefined8 *)(lVar16 + 0x20);
      uVar9 = *(undefined4 *)((long)param_1 + 0x64c);
      *(uint *)((long)param_1 + 0x64c) = (uVar24 & 0xff) + 1;
                    /* try { // try from 00888d2c to 00888d3b has its CatchHandler @ 008897a4 */
      FUN_0088d1d0(param_1,uVar14,uVar24,1);
      *(undefined4 *)((long)param_1 + 0x64c) = uVar9;
      local_64 = 0xffffffff;
      local_84 = uVar24;
    }
    else {
      local_64 = 0xffffffff;
    }
  }
  else {
    if ((*(byte *)(param_2 + 0x48) & 1) != 0) goto LAB_00888c98;
    lVar16 = *(long *)(param_2 + 0x20);
    if (lVar16 == 0) {
LAB_00888cd0:
      local_64 = 0xffffffff;
    }
    else {
      local_64 = 0xffffffff;
      if (*(int *)(lVar16 + 8) == DAT_00d1b020) {
        pcVar22 = *(char **)(lVar16 + 0x20);
        if (param_1[0x20] != 0) {
          uVar10 = ((ulong)pcVar22 >> 4 ^ (ulong)pcVar22 >> 9) * -0x61c8864680b583eb >>
                   ((ulong)*(byte *)(param_1 + 0x21) & 0x3f);
          if ((*(ulong *)(param_1[0x1e] + (uVar10 >> 6) * 8) >> (uVar10 & 0x3f) & 1) != 0) {
            do {
              if (*(char **)(param_1[0x1b] + uVar10 * 0x10) == pcVar22) {
                local_64 = 0xffffffff;
                if ((*(int *)(param_1[0x1b] + uVar10 * 0x10 + 8) == 2) || (pcVar22 == (char *)0x0))
                goto LAB_00888cd4;
                goto LAB_00888c58;
              }
              uVar10 = uVar10 + 1 & param_1[0x1f] - 1U;
            } while ((*(ulong *)(param_1[0x1e] + (uVar10 >> 6) * 8) >> (uVar10 & 0x3f) & 1) != 0);
          }
        }
        if (pcVar22 == (char *)0x0) goto LAB_00888cd0;
LAB_00888c58:
        iVar6 = strcmp(pcVar22,"pcall");
        if ((iVar6 == 0) && (*(long *)(param_2 + 0x40) != 0)) {
          local_64 = 0;
        }
        else {
          iVar6 = strcmp(pcVar22,"xpcall");
          if (iVar6 != 0) goto LAB_00888cd0;
          local_64 = 0xffffffff;
          if (1 < *(ulong *)(param_2 + 0x40)) {
            local_64 = 1;
          }
        }
      }
    }
LAB_00888cd4:
    if ((int)(local_64 & local_68) < 0) {
      uVar14 = *(undefined8 *)(param_2 + 0x20);
      uVar9 = *(undefined4 *)((long)param_1 + 0x64c);
      *(uint *)((long)param_1 + 0x64c) = (uVar24 & 0xff) + 1;
                    /* try { // try from 00888cfc to 00888d0b has its CatchHandler @ 008897ac */
      FUN_0088d1d0(param_1,uVar14,uVar24,1);
      local_84 = 0;
      *(undefined4 *)((long)param_1 + 0x64c) = uVar9;
    }
    else {
      local_84 = 0;
    }
  }
  iVar6 = DAT_00d1b080;
  if ((((DAT_00d1ec80 == '\x01') && ((*(byte *)(param_2 + 0x48) & 1) == 0)) &&
      ((int)(local_64 & local_68) < 0)) && ((*(byte *)(param_2 + 0x49) & 1) != 0)) {
    uVar9 = *(undefined4 *)((long)param_1 + 0x64c);
    lVar16 = **(long **)(param_2 + 0x38);
    *(uint *)((long)param_1 + 0x64c) = (uVar24 + 1 & 0xff) + 1;
    if (*(int *)(lVar16 + 8) != iVar6) {
      lVar16 = 0;
    }
                    /* try { // try from 00888e58 to 00888e67 has its CatchHandler @ 0088979c */
    FUN_0088ebf4(param_1,lVar16,uVar24 + 1,1,uVar24);
    uVar7 = 0;
    *(undefined4 *)((long)param_1 + 0x64c) = uVar9;
    bVar5 = true;
  }
  else {
    uVar10 = *(ulong *)(param_2 + 0x40);
    if (uVar10 == 0) {
      bVar5 = false;
      uVar7 = 0;
    }
    else {
      uVar7 = 0;
      uVar15 = 0;
      do {
        uVar21 = uVar15 + 1;
        uVar14 = *(undefined8 *)(*(long *)(param_2 + 0x38) + uVar15 * 8);
        iVar6 = (uVar24 & 0xff) + 1 + (int)uVar15;
        if (uVar21 == uVar10) {
                    /* try { // try from 00888dc0 to 00888dcb has its CatchHandler @ 008897f0 */
          uVar7 = FUN_00891d80(param_1,uVar14,(uint)*(byte *)(param_2 + 0x48) + iVar6);
        }
        else {
          uVar8 = iVar6 + (uint)*(byte *)(param_2 + 0x48);
          uVar9 = *(undefined4 *)((long)param_1 + 0x64c);
          *(uint *)((long)param_1 + 0x64c) = (uVar8 & 0xff) + 1;
                    /* try { // try from 00888de8 to 00888df3 has its CatchHandler @ 008897e8 */
          FUN_0088d1d0(param_1,uVar14,uVar8,1);
          *(undefined4 *)((long)param_1 + 0x64c) = uVar9;
        }
        uVar10 = *(ulong *)(param_2 + 0x40);
        uVar15 = uVar21;
      } while (uVar21 < uVar10);
      bVar5 = false;
    }
  }
  if (0 < *(int *)((long)param_1 + 0xc)) {
                    /* try { // try from 00888e90 to 00888e97 has its CatchHandler @ 008897c0 */
    FUN_00876644(*param_1,*(int *)(*(long *)(param_2 + 0x20) + 0x14) + 1);
  }
  if (*(char *)(param_2 + 0x48) == '\x01') {
    lVar16 = *(long *)(param_2 + 0x20);
    if (*(int *)(lVar16 + 8) != DAT_00d1b050) {
      lVar16 = 0;
    }
    if (0 < *(int *)((long)param_1 + 0xc)) {
                    /* try { // try from 00888ed0 to 00888f33 has its CatchHandler @ 008897c4 */
      FUN_00876644(*param_1,*(int *)(lVar16 + 0x30) + 1);
    }
    if ((DAT_00d1ec80 == '\x01') && (*(char *)(lVar16 + 0x49) == '\x01')) {
      uVar8 = FUN_008915e8(param_1,lVar16 + 0x28,lVar16 + 0xc);
      FUN_00875b54(*param_1,0x5d,uVar24,local_84,uVar8 >> 8 & 0xffff);
      FUN_00875d18(*param_1,uVar8 >> 8 & 0x100 | uVar8 & 0xff | 0x200);
    }
    else {
      pcVar22 = *(char **)(lVar16 + 0x28);
      sVar11 = strlen(pcVar22);
                    /* try { // try from 00888f8c to 00888fd7 has its CatchHandler @ 008897e0 */
      iVar6 = FUN_00875070(*param_1,pcVar22,sVar11);
      if (iVar6 < 0) {
                    /* try { // try from 00889764 to 00889773 has its CatchHandler @ 008897e0 */
                    /* WARNING: Subroutine does not return */
        FUN_0087fcd8(lVar16 + 0xc,"Exceeded constant limit; simplify the code to compile");
      }
      lVar23 = *param_1;
      uVar9 = FUN_00877e08(pcVar22,sVar11);
      FUN_00875b54(lVar23,0x14,uVar24,local_84,uVar9);
      FUN_00875d18(*param_1,iVar6);
      lVar16 = *(long *)(lVar16 + 0x20);
      iVar6 = *(int *)(lVar16 + 8);
      if ((lVar16 == 0) || (iVar6 != DAT_00d1b010)) {
        lVar23 = lVar16;
        do {
          if ((iVar6 != DAT_00d1afc0) && (iVar6 != DAT_00d1b0b0)) {
                    /* try { // try from 0088908c to 008890a3 has its CatchHandler @ 008897e0 */
            FUN_008917fc(param_1,lVar16,local_84 & 0xff,4,2);
            break;
          }
          lVar23 = *(long *)(lVar23 + 0x20);
          iVar6 = *(int *)(lVar23 + 8);
        } while ((lVar23 == 0) || (iVar6 != DAT_00d1b010));
      }
    }
  }
  else if (-1 < (int)(local_64 & local_68)) {
                    /* try { // try from 00888f48 to 00888f4b has its CatchHandler @ 008897c8 */
    uVar14 = FUN_00875ec8(*param_1);
    if ((int)local_64 < 0) {
                    /* try { // try from 00889034 to 0088905b has its CatchHandler @ 008897c8 */
      FUN_00875b54(*param_1,0x44,local_68,0,0);
    }
    else {
                    /* try { // try from 00888f68 to 00888f73 has its CatchHandler @ 008897b4 */
      FUN_00875b54(*param_1,0x59,local_64,*(int *)(param_2 + 0x40) - (uVar7 & 1),0);
    }
    FUN_0088d1d0(param_1,*(undefined8 *)(param_2 + 0x20),uVar24,1);
                    /* try { // try from 00889060 to 0088908b has its CatchHandler @ 008897cc */
    uVar12 = FUN_00875ec8(*param_1);
    uVar10 = FUN_00876054(*param_1,uVar14,uVar12);
    if ((uVar10 & 1) == 0) {
                    /* WARNING: Subroutine does not return */
      FUN_0087fcd8(*(long *)(param_2 + 0x20) + 0xc,
                   "Exceeded jump distance limit; simplify the code to compile");
    }
  }
                    /* try { // try from 008890a8 to 008890cb has its CatchHandler @ 008897dc */
  uVar14 = FUN_00875ec8(*param_1);
  if (bVar5) {
    FUN_00875b54(*param_1,0x5c,uVar24 + 1,0,0);
  }
                    /* try { // try from 008890d0 to 008890d3 has its CatchHandler @ 008897d0 */
  uVar12 = FUN_00875ec8(*param_1);
  lVar16 = *param_1;
  if (bVar5 || ((((uint)(-1 < (int)(local_64 & local_68)) | DAT_00d1eee8 ^ 0xffffffff |
                 param_6 | uVar7) & 1) != 0 || *(long *)(param_1[0xcd] + 0x98) == 0)) {
    if ((uVar7 & 1) == 0) {
      iVar6 = (uint)*(byte *)(param_2 + 0x48) + (uint)*(byte *)(param_2 + 0x40) + 1;
    }
    else {
      iVar6 = 0;
    }
    iVar2 = 0;
    if ((param_6 & 1) == 0) {
      iVar2 = param_4 + 1;
    }
                    /* try { // try from 008891b0 to 008891d3 has its CatchHandler @ 008897d8 */
    FUN_00875b54(lVar16,0x15,uVar24,iVar6,iVar2);
  }
  else {
                    /* try { // try from 00889130 to 00889183 has its CatchHandler @ 008897e4 */
    uVar13 = FUN_008769c0(lVar16);
    uVar9 = FUN_00875524(lVar16,uVar13);
    FUN_00875b54(*param_1,0x57,uVar24,
                 (uint)*(byte *)(param_2 + 0x48) + (uint)*(byte *)(param_2 + 0x40) + 1,param_4 + 1);
    FUN_00875d18(*param_1,uVar9);
  }
  if ((bVar5) && (uVar10 = FUN_00876054(*param_1,uVar14,uVar12), (uVar10 & 1) == 0)) {
                    /* try { // try from 00889754 to 00889763 has its CatchHandler @ 008897d8 */
                    /* WARNING: Subroutine does not return */
    FUN_0087fcd8(param_2 + 0xc,"Exceeded jump distance limit; simplify the code to compile");
  }
  if (((param_5 & 1) == 0) && ((param_4 & 0xff) != 0)) {
    uVar10 = 0;
    do {
                    /* try { // try from 008891f4 to 00889207 has its CatchHandler @ 008897f4 */
      FUN_00875b54(*param_1,6,param_3 + (int)uVar10,uVar24 + (int)uVar10,0);
      uVar10 = uVar10 + 1;
    } while ((uVar25 & 0xff) != uVar10);
  }
LAB_00889214:
  *(uint *)((long)param_1 + 0x64c) = uVar3;
  return;
}

