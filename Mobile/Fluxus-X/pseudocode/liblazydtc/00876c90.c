/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00876c90
 */

void FUN_00876c90(long param_1)

{
  ulong *puVar1;
  ulong *puVar2;
  ulong *puVar3;
  ulong uVar4;
  byte bVar5;
  long lVar6;
  bool bVar7;
  long lVar8;
  ulong uVar9;
  int iVar10;
  ulong uVar11;
  uint uVar12;
  ulong uVar13;
  undefined1 *puVar14;
  long lVar15;
  undefined1 uVar16;
  ulong uVar17;
  byte *pbVar18;
  ulong uVar19;
  ulong uVar20;
  ulong *puVar21;
  ulong uVar22;
  byte *pbVar23;
  byte *pbVar24;
  byte *local_58;
  ulong uStack_50;
  long local_48;
  
  lVar6 = tpidr_el0;
  local_48 = *(long *)(lVar6 + 0x28);
  pbVar24 = *(byte **)(param_1 + 0x210);
  for (pbVar23 = *(byte **)(param_1 + 0x208); pbVar23 != pbVar24; pbVar23 = pbVar23 + 0x20) {
    if (pbVar23[0x1c] == 1) {
      uStack_50 = *(ulong *)(pbVar23 + 8);
      local_58 = *(byte **)(pbVar23 + 0x10);
      if ((*pbVar23 & 1) == 0) {
        local_58 = pbVar23 + 1;
        uStack_50 = (ulong)(*pbVar23 >> 1);
      }
      if (((ulong)(*(long *)(param_1 + 0x240) * 3) >> 2 <= *(ulong *)(param_1 + 0x248)) &&
         (lVar8 = FUN_0087bef8(param_1 + 0x220,&local_58), lVar8 == 0)) {
        FUN_0087bff0(param_1 + 0x220);
      }
      lVar8 = FUN_0087bdcc(param_1 + 0x220,&local_58);
      iVar10 = *(int *)(lVar8 + 0x10);
      if (iVar10 == 0) {
        iVar10 = *(int *)(param_1 + 0x248);
        *(int *)(lVar8 + 0x10) = iVar10;
        if ((*(byte *)(param_1 + 0x2c0) & 1) != 0) {
          FUN_00874d58(param_1 + 600,&local_58);
          iVar10 = *(int *)(lVar8 + 0x10);
        }
      }
      *(int *)(pbVar23 + 0x18) = iVar10;
    }
  }
  uVar13 = *(ulong *)(param_1 + 0x230);
  if (uVar13 == 0) {
    uVar11 = 0x10;
  }
  else {
    puVar21 = *(ulong **)(param_1 + 0x238);
    uVar20 = *puVar21;
    if (uVar20 == 0) {
      uVar17 = 0;
      uVar11 = 0x10;
      do {
        if (uVar13 - 1 == uVar17) goto LAB_00876d88;
        uVar20 = puVar21[uVar17 + 1];
        uVar17 = uVar17 + 1;
      } while (uVar20 == 0);
    }
    else {
      uVar17 = 0;
    }
    uVar11 = (uVar20 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar20 & 0x5555555555555555) << 1;
    uVar11 = (uVar11 & 0xcccccccccccccccc) >> 2 | (uVar11 & 0x3333333333333333) << 2;
    uVar11 = (uVar11 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar11 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar11 = (uVar11 & 0xff00ff00ff00ff00) >> 8 | (uVar11 & 0xff00ff00ff00ff) << 8;
    uVar22 = (uVar11 & 0xffff0000ffff0000) >> 0x10 | (uVar11 & 0xffff0000ffff) << 0x10;
    uVar11 = 0x10;
    uVar22 = LZCOUNT(uVar22 >> 0x20 | uVar22 << 0x20) | uVar17 << 6;
    do {
      uVar20 = uVar20 - 1 & uVar20;
      if (uVar20 == 0) {
        uVar9 = uVar17;
        uVar19 = uVar13;
        if (uVar13 <= uVar17 + 1) {
          uVar19 = uVar17 + 1;
        }
        do {
          uVar17 = uVar9 + 1;
          if (uVar13 <= uVar17) {
            uVar20 = 0;
            uVar9 = uVar22;
            goto LAB_00876e9c;
          }
          uVar20 = puVar21[uVar9 + 1];
          uVar9 = uVar17;
        } while (uVar20 == 0);
      }
      uVar19 = (uVar20 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar20 & 0x5555555555555555) << 1;
      uVar19 = (uVar19 & 0xcccccccccccccccc) >> 2 | (uVar19 & 0x3333333333333333) << 2;
      uVar19 = (uVar19 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar19 & 0xf0f0f0f0f0f0f0f) << 4;
      uVar19 = (uVar19 & 0xff00ff00ff00ff00) >> 8 | (uVar19 & 0xff00ff00ff00ff) << 8;
      uVar9 = (uVar19 & 0xffff0000ffff0000) >> 0x10 | (uVar19 & 0xffff0000ffff) << 0x10;
      uVar19 = uVar17;
      uVar9 = LZCOUNT(uVar9 >> 0x20 | uVar9 << 0x20) | uVar17 << 6;
LAB_00876e9c:
      uVar11 = uVar11 + *(long *)(*(long *)(param_1 + 0x220) + uVar22 * 0x18 + 8) + 2;
      uVar17 = uVar19;
      uVar22 = uVar9;
    } while ((uVar19 != uVar13) || (uVar20 != 0));
  }
LAB_00876d88:
  pbVar23 = *(byte **)(param_1 + 8);
  pbVar24 = *(byte **)(param_1 + 0x10);
  if (pbVar23 != pbVar24) {
    if ((byte *)0x87 < pbVar24 + (-0x88 - (long)pbVar23)) {
      uVar20 = 0;
      uVar13 = (ulong)(pbVar24 + (-0x88 - (long)pbVar23)) / 0x88 + 1;
      uVar22 = uVar13 & 0x3fffffffffffffe;
      pbVar18 = pbVar23 + uVar22 * 0x88;
      puVar21 = (ulong *)(pbVar23 + 0x90);
      uVar17 = uVar22;
      do {
        puVar1 = puVar21 + -0x12;
        puVar2 = puVar21 + -1;
        puVar3 = puVar21 + -0x11;
        uVar9 = *puVar21;
        puVar21 = puVar21 + 0x22;
        uVar19 = (ulong)(byte)((byte)*puVar1 >> 1);
        if (((byte)*puVar1 & 1) != 0) {
          uVar19 = *puVar3;
        }
        uVar4 = (ulong)(byte)((byte)*puVar2 >> 1);
        if (((byte)*puVar2 & 1) != 0) {
          uVar4 = uVar9;
        }
        uVar17 = uVar17 - 2;
        uVar11 = uVar19 + uVar11;
        uVar20 = uVar4 + uVar20;
      } while (uVar17 != 0);
      bVar7 = uVar13 == uVar22;
      goto LAB_00876ef0;
    }
    pbVar18 = pbVar23;
    do {
      bVar5 = *pbVar18;
      puVar21 = (ulong *)(pbVar18 + 8);
      pbVar18 = pbVar18 + 0x88;
      uVar20 = (ulong)(bVar5 >> 1);
      if ((bVar5 & 1) != 0) {
        uVar20 = *puVar21;
      }
      bVar7 = pbVar18 == pbVar24;
LAB_00876ef0:
      uVar11 = uVar20 + uVar11;
    } while (!bVar7);
  }
  if (uVar11 < 0xfffffffffffffff8) {
    puVar21 = (ulong *)(param_1 + 0x2a8);
    uVar13 = 0x16;
    if ((*(byte *)puVar21 & 1) != 0) {
      uVar13 = (*puVar21 & 0xfffffffffffffffe) - 1;
    }
    if (uVar13 < uVar11) {
      uVar13 = 0x19;
      if ((uVar11 | 7) != 0x17) {
        uVar13 = uVar11 | 7;
      }
      if (uVar11 < 0x17) {
        uVar13 = 0x16;
      }
      FUN_00879ca4(puVar21,uVar13);
      uVar12 = (uint)*(byte *)puVar21;
    }
    else {
      uVar12 = (uint)*puVar21 & 0xff;
    }
    uVar16 = 100;
    if (DAT_00d1ec80 == '\0') {
      uVar16 = 0xe;
    }
    if ((uVar12 & 1) == 0) {
      puVar14 = (undefined1 *)(param_1 + 0x2a9);
      *(undefined1 *)(param_1 + 0x2a8) = 2;
    }
    else {
      puVar14 = *(undefined1 **)(param_1 + 0x2b8);
      *(undefined8 *)(param_1 + 0x2b0) = 1;
    }
    *puVar14 = uVar16;
    puVar14[1] = 0;
    FUN_00877148(puVar21,3);
    FUN_0087726c(param_1,puVar21);
    lVar8 = *(long *)(param_1 + 0x210);
    lVar15 = *(long *)(param_1 + 0x208);
    if ((lVar8 - lVar15 & 0x1fffffffe0U) != 0) {
      uVar13 = 0;
      do {
        if (*(char *)(lVar15 + uVar13 * 0x20 + 0x1c) == '\x01') {
          FUN_00877148(puVar21,(int)uVar13 + 1);
          uVar11 = (ulong)*(uint *)(*(long *)(param_1 + 0x208) + uVar13 * 0x20 + 0x18);
          do {
            FUN_00877148(puVar21,(uint)uVar11 & 0x7f | (uint)(0x7f < uVar11) << 7);
            bVar7 = 0x7f < uVar11;
            uVar11 = uVar11 >> 7;
          } while (bVar7);
          lVar8 = *(long *)(param_1 + 0x210);
          lVar15 = *(long *)(param_1 + 0x208);
        }
        uVar13 = uVar13 + 1;
      } while (uVar13 < ((ulong)(lVar8 - lVar15) >> 5 & 0xffffffff));
    }
    FUN_00877148(puVar21,0);
    uVar13 = (ulong)(uint)((int)((ulong)(*(long *)(param_1 + 0x10) - *(long *)(param_1 + 8)) >> 3) *
                          -0xf0f0f0f);
    do {
      FUN_00877148(puVar21,(uint)uVar13 & 0x7f | (uint)(0x7f < uVar13) << 7);
      bVar7 = 0x7f < uVar13;
      uVar13 = uVar13 >> 7;
    } while (bVar7);
    pbVar24 = *(byte **)(param_1 + 0x10);
    for (pbVar23 = *(byte **)(param_1 + 8); pbVar23 != pbVar24; pbVar23 = pbVar23 + 0x88) {
      uVar13 = (ulong)(*pbVar23 >> 1);
      if ((*pbVar23 & 1) != 0) {
        uVar13 = *(ulong *)(pbVar23 + 8);
      }
      do {
        FUN_00877148(puVar21,(uint)uVar13 & 0x7f | (uint)(0x7f < uVar13) << 7);
        bVar7 = 0x7f < uVar13;
        uVar13 = uVar13 >> 7;
      } while (bVar7);
      FUN_0081f6dc(puVar21,pbVar23);
    }
    uVar13 = (ulong)*(uint *)(param_1 + 0x24);
    do {
      FUN_00877148(puVar21,(uint)uVar13 & 0x7f | (uint)(0x7f < uVar13) << 7);
      bVar7 = 0x7f < uVar13;
      uVar13 = uVar13 >> 7;
    } while (bVar7);
    if (*(long *)(lVar6 + 0x28) == local_48) {
      return;
    }
  }
  else if (*(long *)(lVar6 + 0x28) == local_48) {
                    /* WARNING: Subroutine does not return */
    FUN_007fe124();
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

