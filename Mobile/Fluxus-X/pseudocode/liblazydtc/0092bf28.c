/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0092bf28
 */

undefined8
FUN_0092bf28(int *param_1,long param_2,uint param_3,int param_4,int *param_5,uint param_6,
            uint param_7)

{
  ushort uVar1;
  long lVar2;
  uint uVar3;
  int iVar4;
  int iVar5;
  int __fd;
  long lVar6;
  ssize_t sVar7;
  int *piVar8;
  long lVar9;
  ulong uVar10;
  ulong uVar11;
  long lVar12;
  ushort *puVar13;
  ushort *puVar14;
  ulong uVar15;
  undefined8 uVar16;
  long lVar17;
  ulong uVar18;
  undefined1 auVar19 [16];
  long local_138;
  uint local_130;
  undefined1 auStack_120 [64];
  undefined1 auStack_e0 [80];
  undefined8 local_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  
  lVar2 = tpidr_el0;
  lVar9 = *(long *)(lVar2 + 0x28);
  if ((param_1 == (int *)0x0) || (*param_1 != 0xbab1e)) {
    uVar16 = 1;
    goto LAB_0092c000;
  }
  if ((*(byte *)((long)param_1 + 0x231) >> 2 & 1) != 0) {
    uVar16 = 8;
    goto LAB_0092c000;
  }
  if (param_4 < 0) {
    uVar16 = 10;
    goto LAB_0092c000;
  }
  FUN_00934a74(&local_138,auStack_e0,10);
  uStack_88 = 0;
  local_90 = 0;
  uStack_78 = 0;
  uStack_80 = 0;
  for (lVar17 = *(long *)(param_1 + 2); lVar17 != 0; lVar17 = *(long *)(lVar17 + 0x10)) {
    FUN_0092bcf8(lVar17,&local_90);
    iVar4 = FUN_00934ba4(&local_138,&local_90);
    if (iVar4 != 0) goto LAB_0092bfec;
  }
  iVar4 = FUN_00910d9c(param_1 + 0x56,&local_138);
  uVar3 = local_130;
  if (iVar4 == 0) {
    uVar10 = (ulong)local_130;
    uVar11 = (ulong)param_3;
    if (param_3 != 0) {
      uVar18 = 0;
      puVar13 = (ushort *)(param_2 + 4);
      do {
        iVar4 = FUN_00934ad0(&local_138,*(undefined4 *)(puVar13 + -2),*puVar13 & 7);
        if (iVar4 != 0) goto LAB_0092bfec;
        uVar18 = uVar18 + 1;
        puVar13 = puVar13 + 4;
      } while (uVar18 < uVar11);
    }
    if ((((param_7 & 1) != 0) && (param_1[0x88] != -1)) &&
       (iVar4 = FUN_00934ad0(&local_138,param_1[0x88],1), iVar4 != 0)) goto LAB_0092bfec;
    uVar18 = 0;
    if ((*(byte *)((long)param_1 + 0x231) >> 4 & 1) == 0) {
      if (*(long *)(param_1 + 0x34) == 0) {
        uVar18 = 0xffffffffffffffff;
      }
      else {
        auVar19 = FUN_00941cb8();
        lVar17 = auVar19._0_8_;
        lVar6 = FUN_00941308(0,0,*(undefined8 *)(param_1 + 0x34));
        *(long *)(param_1 + 0x34) = lVar6;
        lVar12 = *(long *)(lVar6 + 0x20);
        uVar18 = 0;
        if ((lVar17 <= lVar12) &&
           ((lVar17 < lVar12 || (uVar18 = 0, auVar19._8_4_ < *(int *)(lVar6 + 0x28))))) {
          uVar18 = FUN_00941dc4(lVar12,*(undefined8 *)(lVar6 + 0x28),lVar17,auVar19._8_8_);
        }
      }
    }
    iVar4 = (int)uVar18;
    if ((long)param_4 <= (long)uVar18 || 0x7fffffffffffffff < uVar18) {
      iVar4 = param_4;
    }
    if (local_130 == 0) {
      iVar5 = 0;
joined_r0x0092c250:
      if (param_5 != (int *)0x0) {
        *param_5 = iVar5;
      }
      if (local_130 == 0) {
        uVar16 = 0;
        if ((((param_6 & 1) == 0) || (uVar16 = 0, *param_1 != 0xbab1e)) ||
           (uVar16 = 0, (*(byte *)((long)param_1 + 0x231) & 0x14) != 0)) goto LAB_0092bff0;
        if (*(long *)(param_1 + 0x34) == 0) {
          lVar17 = -1;
        }
        else {
          auVar19 = FUN_00941cb8();
          lVar17 = auVar19._0_8_;
          lVar6 = FUN_00941308(0,0,*(undefined8 *)(param_1 + 0x34));
          *(long *)(param_1 + 0x34) = lVar6;
          lVar12 = *(long *)(lVar6 + 0x20);
          uVar16 = 0;
          if ((lVar12 < lVar17) ||
             ((lVar12 <= lVar17 && (uVar16 = 0, *(int *)(lVar6 + 0x28) <= auVar19._8_4_))))
          goto LAB_0092bff0;
          lVar17 = FUN_00941dc4(lVar12,*(undefined8 *)(lVar6 + 0x28),lVar17,auVar19._8_8_);
          if (lVar17 == 0) goto LAB_0092c314;
        }
        lVar6 = (long)iVar4;
        if (-1 < lVar17 && lVar17 <= iVar4) {
          lVar6 = lVar17;
        }
        FUN_009344cc(lVar6);
      }
LAB_0092c314:
      uVar16 = 0;
    }
    else {
      iVar5 = FUN_0093475c(local_138,local_130,(long)iVar4);
      if (-1 < iVar5) {
        if (iVar5 != 0) {
          if (param_3 != 0) {
            uVar18 = 0;
            if (2 < param_3) {
              uVar18 = uVar11 & 0xfffffffe;
              puVar13 = (ushort *)(local_138 + uVar10 * 8 + 0xe);
              puVar14 = (ushort *)(param_2 + 0xe);
              uVar15 = uVar18;
              do {
                uVar1 = *puVar13;
                uVar15 = uVar15 - 2;
                puVar14[-4] = puVar13[-4] & 7;
                *puVar14 = uVar1 & 7;
                puVar13 = puVar13 + 8;
                puVar14 = puVar14 + 8;
              } while (uVar15 != 0);
              if (uVar18 == uVar11) goto LAB_0092c1ec;
            }
            lVar17 = uVar11 - uVar18;
            puVar13 = (ushort *)(local_138 + (uVar18 + uVar10) * 8 + 6);
            puVar14 = (ushort *)(param_2 + uVar18 * 8 + 6);
            do {
              lVar17 = lVar17 + -1;
              *puVar14 = *puVar13 & 7;
              puVar13 = puVar13 + 4;
              puVar14 = puVar14 + 4;
            } while (lVar17 != 0);
          }
LAB_0092c1ec:
          if ((((param_7 & 1) != 0) && (__fd = param_1[0x88], __fd != -1)) &&
             ((*(byte *)(local_138 + (ulong)(uVar3 + param_3) * 8 + 6) & 1) != 0)) {
            while ((sVar7 = read(__fd,auStack_120,0x40), 0 < sVar7 ||
                   ((sVar7 < 0 && (piVar8 = (int *)__errno(), *piVar8 == 4))))) {
              __fd = param_1[0x88];
            }
            iVar5 = iVar5 + -1;
          }
        }
        goto joined_r0x0092c250;
      }
      uVar16 = 0xc;
    }
  }
  else {
LAB_0092bfec:
    uVar16 = 3;
  }
LAB_0092bff0:
  FUN_00934a90(&local_138);
LAB_0092c000:
  if (*(long *)(lVar2 + 0x28) != lVar9) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return uVar16;
}

