/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008859f0
 */

void FUN_008859f0(undefined8 *param_1)

{
  int iVar1;
  undefined4 uVar2;
  uint uVar3;
  uint uVar4;
  uint uVar5;
  size_t sVar6;
  char *__s;
  long lVar7;
  undefined8 *puVar8;
  ulong uVar9;
  ulong uVar10;
  ulong uVar11;
  ulong *puVar12;
  ulong *puVar13;
  uint uVar14;
  ulong uVar15;
  ulong uVar16;
  undefined1 uVar17;
  char *pcVar18;
  long lVar19;
  undefined8 uVar20;
  ulong uVar21;
  
  lVar7 = param_1[0xcd];
  if (((((*(byte *)((long)param_1 + 0xcfc) & 1) == 0) && (param_1[0x193] == 0)) &&
      (param_1[0x19a] == 0)) && (param_1[0x19c] == param_1[0x19d])) {
    uVar14 = *(uint *)((long)param_1 + 0x64c);
    uVar3 = uVar14 + 1;
    if (0xff < uVar3) {
      uVar20 = 1;
      goto LAB_008860a8;
    }
    *(uint *)((long)param_1 + 0x64c) = uVar3;
    uVar4 = *(uint *)(param_1 + 0xca);
    if (*(uint *)(param_1 + 0xca) <= uVar3) {
      uVar4 = uVar3;
    }
    *(uint *)(param_1 + 0xca) = uVar4;
    FUN_00875b54(*param_1,0x35,uVar14,0,0);
    FUN_00875d18(*param_1,0);
  }
  else {
    FUN_0088b80c(param_1);
    if (param_1[0x19] != 0) {
      puVar8 = param_1 + 0x186;
      uVar9 = ((((ulong)puVar8 >> 3 & 0x3ffffff) << 6 | 8) ^ (ulong)puVar8 >> 0x20) *
              -0x622015f714c7d297;
      uVar9 = ((ulong)puVar8 >> 0x20 ^ uVar9 >> 0x2f ^ uVar9) * -0x622015f714c7d297;
      uVar9 = (uVar9 ^ uVar9 >> 0x2f) * -0x6b622cb0470b6a63 >>
              ((ulong)*(byte *)(param_1 + 0x1a) & 0x3f);
      if ((*(ulong *)(param_1[0x17] + (uVar9 >> 6) * 8) >> (uVar9 & 0x3f) & 1) != 0) {
        do {
          puVar13 = (ulong *)(param_1[0x14] + uVar9 * 0x18);
          if ((undefined8 *)*puVar13 == puVar8) {
            if (*(char *)((long)puVar13 + 9) == '\x01') {
              uVar14 = (uint)(byte)puVar13[1];
              goto LAB_00885b60;
            }
            break;
          }
          uVar9 = uVar9 + 1 & param_1[0x18] - 1;
        } while ((*(ulong *)(param_1[0x17] + (uVar9 >> 6) * 8) >> (uVar9 & 0x3f) & 1) != 0);
      }
    }
    uVar14 = 0xff;
LAB_00885b60:
    if ((DAT_00d1ec80 == '\x01') && (uVar9 = param_1[400], uVar9 != 0)) {
      puVar13 = (ulong *)param_1[0x191];
      uVar21 = *puVar13;
      if (uVar21 == 0) {
        uVar15 = 0;
        do {
          if (uVar9 - 1 == uVar15) goto LAB_00885ca0;
          uVar21 = puVar13[uVar15 + 1];
          uVar15 = uVar15 + 1;
        } while (uVar21 == 0);
      }
      else {
        uVar15 = 0;
      }
      uVar10 = (uVar21 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar21 & 0x5555555555555555) << 1;
      uVar10 = (uVar10 & 0xcccccccccccccccc) >> 2 | (uVar10 & 0x3333333333333333) << 2;
      uVar10 = (uVar10 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar10 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar10 = (uVar10 & 0xff00ff00ff00ff00) >> 8 | (uVar10 & 0xff00ff00ff00ff) << 8;
      uVar10 = (uVar10 & 0xffff0000ffff0000) >> 0x10 | (uVar10 & 0xffff0000ffff) << 0x10;
      uVar10 = LZCOUNT(uVar10 >> 0x20 | uVar10 << 0x20) | uVar15 << 6;
      do {
        puVar8 = (undefined8 *)(param_1[0x18e] + uVar10 * 0x10);
        pcVar18 = *(char **)*puVar8;
        sVar6 = strlen(pcVar18);
        iVar1 = FUN_00875070(*param_1,pcVar18,sVar6);
        if (iVar1 < 0) goto LAB_00886074;
        uVar20 = *param_1;
        uVar17 = *(undefined1 *)(puVar8 + 1);
        uVar2 = FUN_00877e08(pcVar18,sVar6);
        FUN_00875b54(uVar20,0x10,uVar17,uVar14,uVar2);
        FUN_00875d18(*param_1,iVar1);
        uVar21 = uVar21 - 1 & uVar21;
        if (uVar21 == 0) {
          uVar16 = uVar15;
          uVar11 = uVar9;
          if (uVar9 <= uVar15 + 1) {
            uVar11 = uVar15 + 1;
          }
          do {
            uVar15 = uVar16 + 1;
            if (uVar9 <= uVar15) {
              uVar21 = 0;
              goto LAB_00885c7c;
            }
            uVar21 = puVar13[uVar16 + 1];
            uVar16 = uVar15;
          } while (uVar21 == 0);
        }
        uVar10 = (uVar21 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar21 & 0x5555555555555555) << 1;
        uVar10 = (uVar10 & 0xcccccccccccccccc) >> 2 | (uVar10 & 0x3333333333333333) << 2;
        uVar10 = (uVar10 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar10 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar10 = (uVar10 & 0xff00ff00ff00ff00) >> 8 | (uVar10 & 0xff00ff00ff00ff) << 8;
        uVar10 = (uVar10 & 0xffff0000ffff0000) >> 0x10 | (uVar10 & 0xffff0000ffff) << 0x10;
        uVar10 = LZCOUNT(uVar10 >> 0x20 | uVar10 << 0x20) | uVar15 << 6;
        uVar11 = uVar15;
LAB_00885c7c:
        uVar15 = uVar11;
      } while ((uVar11 != uVar9) || (uVar21 != 0));
    }
LAB_00885ca0:
    if ((DAT_00d1f0a8 == '\x01') && (uVar9 = param_1[0x197], uVar9 != 0)) {
      puVar13 = (ulong *)param_1[0x198];
      uVar21 = *puVar13;
      if (uVar21 == 0) {
        uVar15 = 0;
        do {
          if (uVar9 - 1 == uVar15) goto LAB_00885eb0;
          uVar21 = puVar13[uVar15 + 1];
          uVar15 = uVar15 + 1;
        } while (uVar21 == 0);
      }
      else {
        uVar15 = 0;
      }
      uVar10 = (uVar21 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar21 & 0x5555555555555555) << 1;
      uVar10 = (uVar10 & 0xcccccccccccccccc) >> 2 | (uVar10 & 0x3333333333333333) << 2;
      uVar10 = (uVar10 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar10 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar10 = (uVar10 & 0xff00ff00ff00ff00) >> 8 | (uVar10 & 0xff00ff00ff00ff) << 8;
      uVar10 = (uVar10 & 0xffff0000ffff0000) >> 0x10 | (uVar10 & 0xffff0000ffff) << 0x10;
      uVar10 = LZCOUNT(uVar10 >> 0x20 | uVar10 << 0x20) | uVar15 << 6;
      do {
        lVar19 = param_1[0x195];
        uVar20 = *param_1;
        pcVar18 = (char *)**(undefined8 **)(lVar19 + uVar10 * 8);
        sVar6 = strlen(pcVar18);
        iVar1 = FUN_00875070(uVar20,pcVar18,sVar6);
        puVar8 = *(undefined8 **)(lVar19 + uVar10 * 8);
        if (iVar1 < 0) {
                    /* WARNING: Subroutine does not return */
          FUN_0087fcd8(puVar8 + 1,"Exceeded constant limit; simplify the code to compile");
        }
        if (param_1[0x19] != 0) {
          uVar11 = ((ulong)(uint)((int)puVar8 << 3) + 8 ^ (ulong)puVar8 >> 0x20) *
                   -0x622015f714c7d297;
          uVar11 = ((ulong)puVar8 >> 0x20 ^ uVar11 >> 0x2f ^ uVar11) * -0x622015f714c7d297;
          uVar11 = (uVar11 ^ uVar11 >> 0x2f) * -0x6b622cb0470b6a63 >>
                   ((ulong)*(byte *)(param_1 + 0x1a) & 0x3f);
          if ((*(ulong *)(param_1[0x17] + (uVar11 >> 6) * 8) >> (uVar11 & 0x3f) & 1) != 0) {
            do {
              puVar12 = (ulong *)(param_1[0x14] + uVar11 * 0x18);
              if ((undefined8 *)*puVar12 == puVar8) {
                if (*(char *)((long)puVar12 + 9) == '\x01') {
                  uVar17 = (undefined1)puVar12[1];
                  goto LAB_00885e10;
                }
                break;
              }
              uVar11 = uVar11 + 1 & param_1[0x18] - 1;
            } while ((*(ulong *)(param_1[0x17] + (uVar11 >> 6) * 8) >> (uVar11 & 0x3f) & 1) != 0);
          }
        }
        uVar17 = 0xff;
LAB_00885e10:
        pcVar18 = (char *)*puVar8;
        uVar20 = *param_1;
        sVar6 = strlen(pcVar18);
        uVar2 = FUN_00877e08(pcVar18,sVar6);
        FUN_00875b54(uVar20,0x10,uVar17,uVar14,uVar2);
        FUN_00875d18(*param_1,iVar1);
        uVar21 = uVar21 - 1 & uVar21;
        if (uVar21 == 0) {
          uVar16 = uVar15;
          uVar11 = uVar9;
          if (uVar9 <= uVar15 + 1) {
            uVar11 = uVar15 + 1;
          }
          do {
            uVar15 = uVar16 + 1;
            if (uVar9 <= uVar15) {
              uVar21 = 0;
              uVar15 = uVar11;
              goto joined_r0x00885d10;
            }
            uVar21 = puVar13[uVar16 + 1];
            uVar16 = uVar15;
          } while (uVar21 == 0);
        }
        uVar10 = (uVar21 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar21 & 0x5555555555555555) << 1;
        uVar10 = (uVar10 & 0xcccccccccccccccc) >> 2 | (uVar10 & 0x3333333333333333) << 2;
        uVar10 = (uVar10 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar10 & 0xf0f0f0f0f0f0f0f) << 4;
        uVar10 = (uVar10 & 0xff00ff00ff00ff00) >> 8 | (uVar10 & 0xff00ff00ff00ff) << 8;
        uVar10 = (uVar10 & 0xffff0000ffff0000) >> 0x10 | (uVar10 & 0xffff0000ffff) << 0x10;
        uVar10 = LZCOUNT(uVar10 >> 0x20 | uVar10 << 0x20) | uVar15 << 6;
joined_r0x00885d10:
      } while ((uVar15 != uVar9) || (uVar21 != 0));
    }
  }
LAB_00885eb0:
  iVar1 = *(int *)((long)param_1 + 0x64c);
  uVar3 = iVar1 + 2;
  if (0xff < uVar3) {
    uVar20 = 2;
LAB_008860a8:
                    /* WARNING: Subroutine does not return */
    FUN_0087fcd8(lVar7 + 0xc,
                 "Out of registers when trying to allocate %d registers: exceeded limit %d",uVar20,
                 0xff);
  }
  *(uint *)((long)param_1 + 0x64c) = uVar3;
  uVar4 = *(uint *)(param_1 + 0xca);
  if (*(uint *)(param_1 + 0xca) <= uVar3) {
    uVar4 = uVar3;
  }
  *(uint *)(param_1 + 0xca) = uVar4;
  pcVar18 = (char *)FUN_00853198(param_1[199],"freeze");
  uVar20 = *param_1;
  sVar6 = strlen(pcVar18);
  uVar3 = FUN_00875070(uVar20,pcVar18,sVar6);
  if ((int)uVar3 < 0) {
LAB_00886074:
                    /* WARNING: Subroutine does not return */
    FUN_0087fcd8(lVar7 + 0xc,"Exceeded constant limit; simplify the code to compile");
  }
  __s = (char *)FUN_00853198(param_1[199],"table");
  uVar20 = *param_1;
  sVar6 = strlen(__s);
  uVar4 = FUN_00875070(uVar20,__s,sVar6);
  if ((int)uVar4 < 0) goto LAB_00886074;
  if ((uVar4 | uVar3) < 0x400) {
    uVar5 = FUN_00877de4(uVar4,uVar3);
    uVar9 = FUN_0087515c(*param_1,uVar5);
    if ((uVar9 >> 0xf & 0x1ffff) == 0) {
      FUN_00875cac(*param_1,0xc,iVar1,uVar9 & 0xffffffff);
      uVar3 = uVar5;
      goto LAB_00885ff8;
    }
  }
  uVar20 = *param_1;
  sVar6 = strlen(__s);
  uVar2 = FUN_00877e08(__s,sVar6);
  FUN_00875b54(uVar20,7,iVar1,0,uVar2);
  FUN_00875d18(*param_1,uVar4);
  uVar20 = *param_1;
  sVar6 = strlen(pcVar18);
  uVar2 = FUN_00877e08(pcVar18,sVar6);
  FUN_00875b54(uVar20,0xf,iVar1,iVar1,uVar2);
LAB_00885ff8:
  FUN_00875d18(*param_1,uVar3);
  FUN_00875b54(*param_1,6,iVar1 + 1,uVar14,0);
  FUN_00875b54(*param_1,0x15,iVar1,2,2);
  FUN_008860c8(param_1,0);
  FUN_00875b54(*param_1,0x16,iVar1,2,0);
  return;
}

