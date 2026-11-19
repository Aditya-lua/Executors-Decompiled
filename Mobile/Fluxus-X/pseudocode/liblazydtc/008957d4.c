/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008957d4
 */

void FUN_008957d4(undefined8 *param_1,long param_2,ulong param_3,ulong param_4,ulong param_5,
                 ulong param_6,int param_7,int param_8,int param_9)

{
  ulong *puVar1;
  ulong uVar2;
  void *__s1;
  long lVar3;
  byte bVar4;
  long lVar5;
  int iVar6;
  int iVar7;
  int iVar8;
  undefined8 uVar9;
  char *pcVar10;
  ulong uVar11;
  ulong uVar12;
  long lVar13;
  undefined8 *puVar14;
  size_t __n;
  ulong uVar15;
  ulong *puVar16;
  long lVar17;
  long lVar18;
  ulong uVar19;
  bool bVar20;
  ulong uVar21;
  undefined8 local_70;
  long local_68;
  
  lVar5 = tpidr_el0;
  local_68 = *(long *)(lVar5 + 0x28);
  if (param_1[0x12] != 0) {
    uVar11 = ((ulong)(uint)((int)param_3 << 3) + 8 ^ param_3 >> 0x20) * -0x622015f714c7d297;
    uVar11 = (param_3 >> 0x20 ^ uVar11 >> 0x2f ^ uVar11) * -0x622015f714c7d297;
    uVar11 = (uVar11 ^ uVar11 >> 0x2f) * -0x6b622cb0470b6a63 >>
             ((ulong)*(byte *)(param_1 + 0x13) & 0x3f);
    if ((*(ulong *)(param_1[0x10] + (uVar11 >> 6) * 8) >> (uVar11 & 0x3f) & 1) != 0) {
      do {
        puVar16 = (ulong *)(param_1[0xd] + uVar11 * 0x50);
        if (*puVar16 == param_3) goto LAB_008958a8;
        uVar11 = uVar11 + 1 & param_1[0x11] - 1;
      } while ((*(ulong *)(param_1[0x10] + (uVar11 >> 6) * 8) >> (uVar11 & 0x3f) & 1) != 0);
    }
  }
  puVar16 = (ulong *)0x0;
LAB_008958a8:
  puVar1 = (ulong *)0x0;
  if (puVar16 != (ulong *)0x0) {
    puVar1 = puVar16 + 1;
  }
  if ((*(uint *)((long)param_1 + 0x64c) < 0x81) && ((uint)puVar1[5] < 0x21)) {
    puVar16 = (ulong *)param_1[0xfd];
    if ((int)((ulong)((long)param_1[0xfe] - (long)puVar16) >> 3) * -0x49249249 < param_9) {
      for (; puVar16 != (ulong *)param_1[0xfe]; puVar16 = puVar16 + 7) {
        if (*puVar16 == param_3) {
          uVar9 = *param_1;
          pcVar10 = "inlining failed: can\'t inline recursive calls";
          goto LAB_008958d8;
        }
      }
      if ((DAT_00d1ec80 == '\x01') && (param_1[0x1a5] != 0)) {
        uVar11 = ((ulong)(uint)((int)param_3 << 3) + 8 ^ param_3 >> 0x20) * -0x622015f714c7d297;
        uVar11 = (param_3 >> 0x20 ^ uVar11 >> 0x2f ^ uVar11) * -0x622015f714c7d297;
        uVar11 = (uVar11 ^ uVar11 >> 0x2f) * -0x6b622cb0470b6a63 >>
                 ((ulong)*(byte *)(param_1 + 0x1a6) & 0x3f);
        if ((*(ulong *)(param_1[0x1a3] + (uVar11 >> 6) * 8) >> (uVar11 & 0x3f) & 1) != 0) {
          do {
            if (*(ulong *)(param_1[0x1a0] + uVar11 * 0x20) == param_3) {
              puVar14 = (undefined8 *)param_1[0x1ae];
              if (puVar14 != (undefined8 *)0x0) {
                lVar13 = param_1[0x1a0] + uVar11 * 0x20;
                __s1 = *(void **)(lVar13 + 8);
                __n = *(long *)(lVar13 + 0x10) - (long)__s1;
                if (__n <= (ulong)(puVar14[1] - (long)*puVar14)) {
                  param_5 = param_5 & 0xffffffff;
                  param_4 = param_4 & 0xffffffff;
                  param_6 = param_6 & 0xffffffff;
                  iVar8 = memcmp(__s1,(void *)*puVar14,__n);
                  if (iVar8 == 0) break;
                }
              }
              uVar9 = *param_1;
              pcVar10 = "inlining failed: mismatched enclosing classes";
              goto LAB_008958d8;
            }
            uVar11 = uVar11 + 1 & param_1[0x1a4] - 1;
          } while ((*(ulong *)(param_1[0x1a3] + (uVar11 >> 6) * 8) >> (uVar11 & 0x3f) & 1) != 0);
        }
      }
      if ((param_6 & 1) == 0) {
        uVar12 = *(ulong *)(param_3 + 0x60);
        uVar11 = *(ulong *)(param_2 + 0x40);
        bVar20 = false;
        local_70 = 0;
        if (uVar12 != 0) {
          lVar13 = param_1[0x2d];
          lVar3 = param_1[0x2e];
          bVar4 = *(byte *)(param_1 + 0x2f);
          lVar17 = param_1[0x2c];
          lVar18 = param_1[0x29];
          uVar15 = 0;
          uVar2 = uVar11;
          if (7 < uVar11) {
            uVar2 = 8;
          }
          do {
            if (uVar15 == uVar2) break;
            if (lVar3 != 0) {
              uVar19 = *(ulong *)(*(long *)(param_2 + 0x38) + uVar15 * 8);
              uVar21 = ((ulong)(uint)((int)uVar19 << 3) + 8 ^ uVar19 >> 0x20) * -0x622015f714c7d297;
              uVar21 = (uVar19 >> 0x20 ^ uVar21 >> 0x2f ^ uVar21) * -0x622015f714c7d297;
              for (uVar21 = (uVar21 ^ uVar21 >> 0x2f) * -0x6b622cb0470b6a63 >> ((ulong)bVar4 & 0x3f)
                  ; (*(ulong *)(lVar17 + (uVar21 >> 6) * 8) >> (uVar21 & 0x3f) & 1) != 0;
                  uVar21 = uVar21 + 1 & lVar13 - 1U) {
                puVar16 = (ulong *)(lVar18 + uVar21 * 0x30);
                if (*puVar16 == uVar19) {
                  if ((int)puVar16[1] != 0) {
                    bVar20 = true;
                    *(undefined1 *)((long)&local_70 + uVar15) = 1;
                  }
                  break;
                }
              }
            }
            uVar15 = uVar15 + 1;
          } while (uVar15 != uVar12);
        }
        if ((uVar11 == 0) ||
           (uVar11 = FUN_00892bc4(param_1,*(undefined8 *)
                                           (*(long *)(param_2 + 0x38) + uVar11 * 8 + -8),param_3,
                                  param_4,param_5), (uVar11 & 1) != 0)) {
LAB_00895bbc:
          uVar11 = puVar1[4];
          if (bVar20) goto LAB_00895bc4;
        }
        else {
          uVar11 = *(ulong *)(param_3 + 0x60);
          uVar12 = *(ulong *)(param_2 + 0x40);
          if (7 < uVar11) {
            uVar11 = 8;
          }
          if (uVar11 < uVar12 || uVar11 - uVar12 == 0) goto LAB_00895bbc;
          memset((void *)((long)&local_70 + uVar12),1,uVar11 - uVar12);
LAB_00895bc4:
          uVar11 = FUN_0089648c();
        }
        iVar8 = *(int *)(param_3 + 0x60);
        if (7 < iVar8) {
          iVar8 = 8;
        }
        iVar6 = FUN_008a11e8(uVar11,&local_70,(long)iVar8);
        iVar7 = FUN_008a11e8(puVar1[4],0,0);
        iVar8 = param_8;
        if (iVar6 != 0) {
          iVar8 = 0;
          if (iVar6 != 0) {
            iVar8 = (iVar7 * 100 + 300) / iVar6;
          }
          if (param_8 <= iVar8) {
            iVar8 = param_8;
          }
        }
        lVar13 = *(long *)(param_2 + 0x20);
        iVar7 = *(int *)(lVar13 + 8);
        if ((lVar13 == 0) || (iVar7 != DAT_00d1b070)) {
          do {
            if ((iVar7 != DAT_00d1afc0) && (iVar7 != DAT_00d1b0b0)) {
              if ((iVar8 * param_7) / 100 < iVar6) {
                FUN_008769e0((double)iVar8 / 100.0,*param_1,
                             "inlining failed: too expensive (cost %d, profit %.2fx)",iVar6);
                goto LAB_008958dc;
              }
              break;
            }
            lVar13 = *(long *)(lVar13 + 0x20);
            iVar7 = *(int *)(lVar13 + 8);
          } while ((lVar13 == 0) || (iVar7 != DAT_00d1b070));
        }
        FUN_008769e0((double)iVar8 / 100.0,*param_1,
                     "inlining succeeded (cost %d, profit %.2fx, depth %d)",iVar6,
                     (int)((ulong)(param_1[0xfe] - param_1[0xfd]) >> 3) * -0x49249249);
        FUN_0089682c(param_1,param_2,param_3,param_4 & 0xffffffff,param_5 & 0xffffffff);
        uVar9 = 1;
        goto LAB_008958e0;
      }
      uVar9 = *param_1;
      pcVar10 = "inlining failed: can\'t convert fixed returns to multret";
    }
    else {
      uVar9 = *param_1;
      pcVar10 = "inlining failed: too many inlined frames";
    }
  }
  else {
    uVar9 = *param_1;
    pcVar10 = "inlining failed: high register pressure";
  }
LAB_008958d8:
  FUN_008769e0(uVar9,pcVar10);
LAB_008958dc:
  uVar9 = 0;
LAB_008958e0:
  if (*(long *)(lVar5 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar9);
  }
  return;
}

