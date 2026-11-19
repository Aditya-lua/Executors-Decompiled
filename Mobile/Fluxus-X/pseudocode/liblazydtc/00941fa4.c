/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00941fa4
 */

int FUN_00941fa4(long param_1)

{
  uint *puVar1;
  byte *pbVar2;
  long lVar3;
  bool bVar4;
  undefined1 auVar5 [16];
  bool bVar6;
  undefined4 uVar7;
  uint uVar8;
  int iVar9;
  uint uVar10;
  ulong uVar11;
  ulong uVar12;
  undefined8 uVar13;
  undefined4 uVar14;
  byte bVar15;
  uint uVar16;
  uint uVar17;
  ulong uVar18;
  long lVar19;
  long lVar20;
  long lVar21;
  int iVar22;
  undefined1 local_90 [16];
  ulong local_80;
  undefined8 local_78;
  char local_6c [4];
  long local_68;
  
  lVar3 = tpidr_el0;
  local_68 = *(long *)(lVar3 + 0x28);
  pbVar2 = (byte *)(param_1 + 0x131b);
  bVar15 = *pbVar2;
  uVar8 = (uint)bVar15;
  if (bVar15 == 0) {
    if ((*(uint *)(param_1 + 0x128) & 0x15) == 1) {
      uVar7 = *(undefined4 *)(*(long *)(param_1 + 0x20) + 0x3c8);
    }
    else {
      uVar7 = 0xffffffff;
    }
    if ((*(uint *)(param_1 + 0x128) & 0x2a) == 2) {
      uVar14 = *(undefined4 *)(*(long *)(param_1 + 0x20) + 0x3cc);
    }
    else {
      uVar14 = 0xffffffff;
    }
    uVar8 = FUN_0093456c(uVar7,0xffffffff,uVar14,0);
    if (uVar8 != 4) {
LAB_0094208c:
      uVar10 = *(uint *)(param_1 + 0x128);
      if ((uVar8 & uVar10 & 1) != 0) {
        lVar20 = *(long *)(param_1 + 0x20);
        iVar9 = FUN_0092f258(param_1,&local_78,&local_80);
        if (iVar9 == 0) {
          bVar4 = false;
          lVar21 = 0;
          uVar10 = 0;
          puVar1 = (uint *)(param_1 + 0x1b1);
          iVar22 = 10;
LAB_009420e8:
          if ((uVar10 & 1) == 0) {
            uVar10 = FUN_00907890(lVar20,0);
            uVar12 = local_80;
            if (local_80 != 0) goto LAB_00942114;
LAB_0094212c:
            uVar13 = local_78;
            if ((((uVar10 & 1) != 0) || ((*(byte *)puVar1 & 1) != 0)) ||
               (*(long *)(param_1 + 0xd8) == -1)) {
              lVar19 = *(long *)(param_1 + 0x20);
              if ((lVar19 == 0) ||
                 (((*(int *)(lVar19 + 0x3c8) == -1 ||
                   (uVar11 = FUN_009089d0(param_1,*(int *)(lVar19 + 0x3c8) ==
                                                  *(int *)(lVar19 + 0x224)), uVar12 == 0)) ||
                  (uVar18 = uVar12, (uVar11 & 1) != 0)))) goto LAB_009421c4;
LAB_009421a0:
              lVar19 = *(long *)(param_1 + 0x20);
              if (lVar19 == 0) {
                iVar9 = 2;
                goto LAB_009423f8;
              }
              if (*(int *)(lVar19 + 0x3c8) == -1) {
                bVar6 = false;
              }
              else {
                bVar6 = *(int *)(lVar19 + 0x3c8) == *(int *)(lVar19 + 0x224);
              }
              uVar16 = *(uint *)(param_1 + 0x6e4);
              uVar12 = (ulong)uVar16;
              if (uVar18 <= uVar16) {
                uVar12 = uVar18;
              }
              if (uVar16 != 0) {
                uVar18 = uVar12;
              }
              iVar9 = FUN_00908350(param_1,bVar6,uVar13,uVar18,local_90);
              if (iVar9 != 0) goto LAB_00942310;
              if (local_90._0_8_ == 0) goto LAB_009421c8;
              if ((long)local_90._0_8_ < 0) goto LAB_009423f4;
LAB_0094221c:
              if (local_90._0_8_ == 0) {
                uVar16 = *puVar1;
                goto LAB_00942234;
              }
              uVar16 = 0;
              lVar19 = local_90._0_8_;
LAB_00942250:
              bVar4 = true;
              iVar9 = FUN_009433b8(param_1,uVar13,lVar19,uVar16);
              if (iVar9 != 0) goto LAB_009423f8;
              if ((*puVar1 >> 1 & 1) != 0) goto LAB_009423f4;
              uVar17 = *(uint *)(param_1 + 0x128);
              if ((uVar16 | ~uVar10 & (*puVar1 & 8) >> 3) == 1) {
                uVar17 = uVar17 & 0xfffffffe;
                *(uint *)(param_1 + 0x128) = uVar17;
              }
              if ((uVar17 & 0x11) != 1) goto LAB_0094231c;
              iVar22 = iVar22 + -1;
              lVar21 = lVar19 + lVar21;
              if (iVar22 == -1) goto LAB_00942364;
              goto LAB_009420e8;
            }
            uVar18 = *(long *)(param_1 + 0xd8) - *(long *)(param_1 + 0xe8);
            if ((0 < (long)uVar18) &&
               (((long)uVar18 < (long)uVar12 || (uVar18 = uVar12, uVar12 != 0)))) goto LAB_009421a0;
LAB_009421c4:
            local_90._0_8_ = 0;
LAB_009421c8:
            uVar16 = *puVar1;
            if ((uVar16 >> 0x12 & 1) == 0) {
LAB_00942234:
              bVar4 = true;
              *(uint *)(param_1 + 0x128) = *(uint *)(param_1 + 0x128) & 0xffffffd4;
              if ((uVar16 >> 4 & 1) == 0) {
                uVar16 = 1;
                lVar19 = 0;
                goto LAB_00942250;
              }
              goto LAB_0094231c;
            }
            lVar19 = *(long *)(param_1 + 0x20);
            if ((lVar19 == 0) || (*(int *)(lVar19 + 0x3c8) == -1)) {
              iVar9 = 2;
            }
            else {
              iVar9 = FUN_00907008(param_1,*(int *)(lVar19 + 0x3c8) == *(int *)(lVar19 + 0x224),
                                   local_6c);
              if (iVar9 == 0) {
                if (local_6c[0] == '\0') goto LAB_0094231c;
                if (-1 < (long)local_90._0_8_) goto LAB_0094221c;
                goto LAB_009423f4;
              }
            }
LAB_00942310:
            if (iVar9 != 0x51) goto LAB_009423f8;
          }
          else {
            uVar10 = 1;
            uVar12 = local_80;
            if (local_80 == 0) goto LAB_0094212c;
LAB_00942114:
            uVar11 = *(ulong *)(param_1 + 0x330);
            uVar12 = local_80;
            if ((long)uVar11 < 1) goto LAB_0094212c;
            if (lVar21 == 0) {
              if ((long)local_80 <= (long)uVar11) {
                uVar11 = local_80;
              }
              uVar12 = uVar11;
              goto LAB_0094212c;
            }
          }
LAB_0094231c:
          if (iVar22 < 1) goto LAB_00942364;
          uVar16 = *(uint *)(*(long *)(*(long *)(param_1 + 0x20) + 0x3a8) + 0x8c);
          if ((uVar16 & 0xc) == 0) {
            if ((uVar16 & 0x30) != 0) goto LAB_00942364;
            uVar12 = FUN_009078cc(param_1,0);
          }
          else {
            uVar12 = FUN_009078cc(param_1,1);
          }
          if ((uVar12 & 1) == 0) goto LAB_00942384;
          goto LAB_00942364;
        }
        bVar4 = false;
        goto LAB_009423f8;
      }
      bVar4 = false;
      goto joined_r0x00942414;
    }
  }
  else {
    uVar10 = *(uint *)(param_1 + 0x128);
    if (((((bVar15 & 1) == 0) || ((uVar10 >> 4 & 1) != 0)) && ((uVar10 & 0x30) != 0)) &&
       (iVar9 = 0, ((uVar10 & 0x20) == 0 & bVar15 >> 1) == 0)) goto LAB_00942490;
    *pbVar2 = 0;
    if (bVar15 != 4) goto LAB_0094208c;
  }
  FUN_00904b80(param_1,"select/poll returned error");
  iVar9 = 0x37;
  goto LAB_00942490;
LAB_00942364:
  bVar15 = 3;
  if ((*(uint *)(param_1 + 0x128) & 0x2a) != 2) {
    bVar15 = 1;
  }
  *pbVar2 = bVar15;
LAB_00942384:
  uVar16 = *(uint *)(param_1 + 0x128);
  if (((uVar16 & 3) == 2) &&
     (((uint)((*(byte *)(lVar20 + 0x3a0) & 0x40) == 0) & (uVar10 ^ 0xffffffff)) == 0)) {
    if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
       ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
      FUN_00904c98(param_1,"we are done reading and this is set to close, stop send");
      uVar16 = *(uint *)(param_1 + 0x128);
    }
    iVar9 = 0;
    *(uint *)(param_1 + 0x128) = uVar16 & 0xffffffdd;
  }
  else {
LAB_009423f4:
    iVar9 = 0;
  }
LAB_009423f8:
  FUN_0092f374(param_1,local_78);
  auVar5._8_8_ = local_90._8_8_;
  auVar5._0_8_ = local_90._0_8_;
  if ((iVar9 != 0) || (local_90 = auVar5, (*(byte *)(param_1 + 0x1b1) >> 1 & 1) != 0))
  goto LAB_00942490;
  uVar10 = *(uint *)(param_1 + 0x128);
joined_r0x00942414:
  if ((((uVar10 >> 5 & 1) == 0) && (((uVar8 & 2 | 0x40) & uVar10) != 0)) &&
     (uVar12 = FUN_00932e0c(param_1), (uVar12 & 1) == 0)) {
    iVar9 = FUN_00932d38(param_1);
    if (iVar9 != 0) goto LAB_00942490;
    bVar4 = true;
  }
  local_90 = FUN_00941cb8();
  if (!bVar4) {
    iVar9 = FUN_00907f88(param_1);
    if (iVar9 != 0) goto LAB_00942490;
  }
  iVar9 = FUN_009314dc(param_1);
  if (iVar9 == 0) {
    iVar9 = FUN_00941244(param_1,local_90._0_8_,local_90._8_8_);
    if (iVar9 != 0) goto LAB_00942490;
    if (*(int *)(param_1 + 0x128) == 0) {
      if ((-1 < *(char *)(param_1 + 0x1b2)) && (lVar20 = *(long *)(param_1 + 0xd8), lVar20 != -1)) {
        lVar21 = lVar20 - *(long *)(param_1 + 0xe8);
        if ((lVar21 != 0) &&
           ((*(long *)(param_1 + 0xe8) != *(long *)(param_1 + 0x1108) + lVar20 &&
            (*(long *)(param_1 + 0x198) == 0)))) {
          FUN_00904b80(param_1,"transfer closed with %ld bytes remaining to read",lVar21);
          iVar9 = 0x12;
          goto LAB_00942490;
        }
      }
      iVar9 = FUN_009314dc(param_1);
      if (iVar9 != 0) goto LAB_00942460;
    }
    else {
      lVar20 = FUN_009086d4(param_1,local_90,0);
      if (lVar20 < 0) {
        lVar20 = *(long *)(param_1 + 0xd8);
        uVar13 = FUN_00941d54(local_90._0_8_,local_90._8_8_,*(undefined8 *)(param_1 + 0xb40),
                              *(undefined8 *)(param_1 + 0xb48));
        if (lVar20 == -1) {
          FUN_00904b80(param_1,"Operation timed out after %ld milliseconds with %ld bytes received",
                       uVar13,*(undefined8 *)(param_1 + 0xe8));
          iVar9 = 0x1c;
        }
        else {
          FUN_00904b80(param_1,
                       "Operation timed out after %ld milliseconds with %ld out of %ld bytes received"
                       ,uVar13,*(undefined8 *)(param_1 + 0xe8),*(undefined8 *)(param_1 + 0xd8));
          iVar9 = 0x1c;
        }
        goto LAB_00942490;
      }
    }
    iVar9 = 0;
    if ((*(byte *)(param_1 + 0x128) & 0x3f) == 0) {
      iVar9 = 0;
      *(uint *)(param_1 + 0x1b1) = *(uint *)(param_1 + 0x1b1) | 2;
    }
  }
  else {
LAB_00942460:
    iVar9 = 0x2a;
  }
LAB_00942490:
  if (*(long *)(lVar3 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar9;
}

