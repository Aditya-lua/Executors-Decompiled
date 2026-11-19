/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b64ec
 */

void FUN_008b64ec(long param_1)

{
  ulong uVar1;
  byte bVar2;
  long lVar3;
  bool bVar4;
  long lVar5;
  long *plVar6;
  char *pcVar7;
  char *pcVar8;
  int iVar9;
  ulong uVar10;
  undefined8 uVar11;
  uint uVar12;
  ulong uVar13;
  ulong uVar14;
  ulong uVar15;
  undefined4 *puVar16;
  byte *pbVar17;
  long lVar18;
  byte *pbVar19;
  uint uVar20;
  undefined1 uStack_59;
  long local_58;
  
  lVar3 = tpidr_el0;
  lVar5 = 0;
  local_58 = *(long *)(lVar3 + 0x28);
  pbVar17 = *(byte **)(param_1 + 0x58);
  bVar2 = *pbVar17;
  pbVar17[2] = pbVar17[2] | 4;
  if (10 < bVar2) {
    if (bVar2 == 0xb) {
      lVar5 = *(long *)(pbVar17 + 0x10);
      *(undefined8 *)(param_1 + 0x58) = *(undefined8 *)(pbVar17 + 8);
      if ((*(byte *)(lVar5 + 2) & 3) != 0) {
        FUN_008b61bc(param_1);
      }
      if ((*(long *)(pbVar17 + 0x20) != 0) && ((*(byte *)(*(long *)(pbVar17 + 0x20) + 2) & 3) != 0))
      {
        FUN_008b61bc(param_1);
      }
      if ((*(byte *)(*(long *)(pbVar17 + 0x38) + 2) & 3) != 0) {
        FUN_008b61bc(param_1);
      }
      uVar20 = *(uint *)(pbVar17 + 0x5c);
      uVar12 = (uint)pbVar17[0x68];
      if (uVar20 != pbVar17[0x68]) {
        uVar10 = 0;
        do {
          lVar5 = *(long *)(*(long *)(pbVar17 + 0x40) + uVar10 * 8);
          if ((lVar5 != 0) && ((*(byte *)(lVar5 + 2) & 3) != 0)) {
            FUN_008b61bc(param_1);
            uVar20 = *(uint *)(pbVar17 + 0x5c);
            uVar12 = (uint)pbVar17[0x68];
          }
          uVar10 = uVar10 + 1;
        } while (uVar10 < uVar20 - uVar12);
      }
      uVar12 = *(uint *)(pbVar17 + 0x58);
      if (uVar20 != uVar12) {
        lVar5 = 0;
        uVar10 = 0;
        do {
          if ((4 < *(int *)(*(long *)(pbVar17 + 0x28) + lVar5 + 0xc)) &&
             ((*(byte *)(*(long *)(*(long *)(pbVar17 + 0x28) + lVar5) + 2) & 3) != 0)) {
            FUN_008b61bc(param_1);
            uVar12 = *(uint *)(pbVar17 + 0x58);
            uVar20 = *(uint *)(pbVar17 + 0x5c);
          }
          uVar10 = uVar10 + 1;
          lVar5 = lVar5 + 0x10;
        } while (uVar10 < uVar20 - uVar12);
      }
      if ((*(long *)(pbVar17 + 0x48) != 0) && ((*(byte *)(*(long *)(pbVar17 + 0x48) + 2) & 3) != 0))
      {
        FUN_008b61bc(param_1);
      }
      if ((*(long *)(pbVar17 + 0x50) != 0) && ((*(byte *)(*(long *)(pbVar17 + 0x50) + 2) & 3) != 0))
      {
        FUN_008b61bc(param_1);
      }
      lVar5 = (ulong)(uint)(*(int *)(pbVar17 + 0x5c) - *(int *)(pbVar17 + 0x58)) * 0x10 +
              (ulong)(*(int *)(pbVar17 + 0x5c) - (uint)pbVar17[0x68]) * 8 + 0x70;
    }
    else if (bVar2 == 0xc) {
      lVar5 = *(long *)(pbVar17 + 0x10);
      *(undefined8 *)(param_1 + 0x58) = *(undefined8 *)(pbVar17 + 8);
      if ((*(byte *)(lVar5 + 2) & 3) != 0) {
        FUN_008b61bc(param_1);
      }
      uVar10 = (ulong)*(uint *)(pbVar17 + 0x18);
      if (*(uint *)(pbVar17 + 0x18) == 0) {
        lVar5 = 0x28;
      }
      else {
        lVar5 = 0;
        uVar15 = 0;
        do {
          if ((4 < *(int *)(*(long *)(pbVar17 + 0x20) + lVar5 + 0xc)) &&
             ((*(byte *)(*(long *)(*(long *)(pbVar17 + 0x20) + lVar5) + 2) & 3) != 0)) {
            FUN_008b61bc(param_1);
            uVar10 = (ulong)*(uint *)(pbVar17 + 0x18);
          }
          uVar15 = uVar15 + 1;
          lVar5 = lVar5 + 0x10;
        } while (uVar15 < uVar10);
        lVar5 = uVar10 * 0x10 + 0x28;
      }
    }
    else if (bVar2 == 0xe) {
      lVar5 = *(long *)(pbVar17 + 0x70);
      *(undefined8 *)(param_1 + 0x58) = *(undefined8 *)(pbVar17 + 0x20);
      if (lVar5 != 0) {
        *(byte *)(lVar5 + 2) = *(byte *)(lVar5 + 2) & 0xf8 | 4;
      }
      lVar5 = *(long *)(pbVar17 + 0x88);
      if (lVar5 != 0) {
        *(byte *)(lVar5 + 2) = *(byte *)(lVar5 + 2) & 0xf8 | 4;
      }
      iVar9 = *(int *)(pbVar17 + 0x9c);
      if (0 < iVar9) {
        lVar18 = 0;
        lVar5 = 0;
        do {
          if ((4 < *(int *)(*(long *)(pbVar17 + 0x28) + lVar18 + 0xc)) &&
             ((*(byte *)(*(long *)(*(long *)(pbVar17 + 0x28) + lVar18) + 2) & 3) != 0)) {
            FUN_008b61bc(param_1);
            iVar9 = *(int *)(pbVar17 + 0x9c);
          }
          lVar5 = lVar5 + 1;
          lVar18 = lVar18 + 0x10;
        } while (lVar5 < iVar9);
      }
      uVar10 = (ulong)*(uint *)(pbVar17 + 0xb4);
      if (0 < (int)*(uint *)(pbVar17 + 0xb4)) {
        plVar6 = *(long **)(pbVar17 + 0x10);
        do {
          lVar5 = *plVar6;
          if (lVar5 != 0) {
            *(byte *)(lVar5 + 2) = *(byte *)(lVar5 + 2) & 0xf8 | 4;
          }
          uVar10 = uVar10 - 1;
          plVar6 = plVar6 + 1;
        } while (uVar10 != 0);
      }
      iVar9 = *(int *)(pbVar17 + 0xac);
      if (0 < iVar9) {
        lVar5 = 0;
        do {
          lVar18 = *(long *)(*(long *)(pbVar17 + 0x38) + lVar5 * 8);
          if ((lVar18 != 0) && ((*(byte *)(lVar18 + 2) & 3) != 0)) {
            FUN_008b61bc(param_1);
            iVar9 = *(int *)(pbVar17 + 0xac);
          }
          lVar5 = lVar5 + 1;
        } while (lVar5 < iVar9);
      }
      uVar10 = (ulong)*(uint *)(pbVar17 + 0xa4);
      if (0 < (int)*(uint *)(pbVar17 + 0xa4)) {
        plVar6 = *(long **)(pbVar17 + 0x80);
        do {
          lVar5 = *plVar6;
          if (lVar5 != 0) {
            *(byte *)(lVar5 + 2) = *(byte *)(lVar5 + 2) & 0xf8 | 4;
          }
          uVar10 = uVar10 - 1;
          plVar6 = plVar6 + 3;
        } while (uVar10 != 0);
      }
      if ((*(long *)(pbVar17 + 0xd0) != 0) && ((*(byte *)(*(long *)(pbVar17 + 0xd0) + 2) & 3) != 0))
      {
        FUN_008b61bc(param_1);
      }
      if ((*(long *)(pbVar17 + 0xd8) != 0) && ((*(byte *)(*(long *)(pbVar17 + 0xd8) + 2) & 3) != 0))
      {
        FUN_008b61bc(param_1);
      }
      lVar5 = *(long *)(pbVar17 + 0xe8);
      if (lVar5 != 0) {
        if ((*(byte *)(*(long *)(lVar5 + 0x28) + 2) & 3) != 0) {
          FUN_008b61bc(param_1);
          lVar5 = *(long *)(pbVar17 + 0xe8);
        }
        if ((*(byte *)(*(long *)(lVar5 + 0x30) + 2) & 3) != 0) {
          FUN_008b61bc(param_1);
        }
      }
      if ((((DAT_00d1f4f8 == '\x01') && (*(code **)(param_1 + 0x720) != (code *)0x0)) &&
          (*(long *)(pbVar17 + 0xe8) == 0)) && ((pbVar17[0x78] & 1) == 0)) {
        (**(code **)(param_1 + 0x720))(*(undefined8 *)(param_1 + 0x1e0),pbVar17);
      }
      lVar5 = (long)*(int *)(pbVar17 + 0xb8) * 4 + (long)*(int *)(pbVar17 + 0x9c) * 0x10 +
              (long)*(int *)(pbVar17 + 0xb0) + (long)*(int *)(pbVar17 + 0xa4) * 0x18 +
              (long)*(int *)(pbVar17 + 0xbc) +
              ((long)*(int *)(pbVar17 + 0xb4) + (long)*(int *)(pbVar17 + 0xac)) * 8 + 0xf0;
    }
    goto LAB_008b6db4;
  }
  if (bVar2 != 6) {
    if (bVar2 == 7) {
      lVar5 = *(long *)(pbVar17 + 0x10);
      *(undefined8 *)(param_1 + 0x58) = *(undefined8 *)(pbVar17 + 8);
      if ((*(byte *)(lVar5 + 2) & 3) != 0) {
        FUN_008b61bc(param_1);
      }
      lVar5 = *(long *)(pbVar17 + 0x18);
      if (pbVar17[6] == 0) {
        if ((*(byte *)(lVar5 + 2) & 3) != 0) {
          FUN_008b61bc(param_1);
        }
        uVar10 = (ulong)pbVar17[5];
        if (pbVar17[5] != 0) {
          uVar15 = 0;
          pbVar19 = pbVar17 + 0x20;
          do {
            if ((4 < *(int *)(pbVar19 + 0xc)) && ((*(byte *)(*(long *)pbVar19 + 2) & 3) != 0)) {
              FUN_008b61bc(param_1);
              uVar10 = (ulong)pbVar17[5];
            }
            uVar15 = uVar15 + 1;
            pbVar19 = pbVar19 + 0x10;
          } while (uVar15 < uVar10);
        }
      }
      else {
        if (lVar5 != 0) {
          *(byte *)(lVar5 + 2) = *(byte *)(lVar5 + 2) & 0xf8 | 4;
        }
        uVar10 = (ulong)pbVar17[5];
        if (pbVar17[5] != 0) {
          uVar15 = 0;
          pbVar19 = pbVar17 + 0x30;
          do {
            if ((4 < *(int *)(pbVar19 + 0xc)) && ((*(byte *)(*(long *)pbVar19 + 2) & 3) != 0)) {
              FUN_008b61bc(param_1);
              uVar10 = (ulong)pbVar17[5];
            }
            uVar15 = uVar15 + 1;
            pbVar19 = pbVar19 + 0x10;
          } while (uVar15 < uVar10);
        }
      }
      if (pbVar17[6] == 0) {
        lVar5 = uVar10 * 0x10 + 0x20;
      }
      else {
        lVar5 = uVar10 * 0x10 + 0x30;
      }
      goto LAB_008b6db4;
    }
    if (bVar2 != 9) goto LAB_008b6db4;
    bVar2 = pbVar17[6];
    *(undefined8 *)(param_1 + 0x58) = *(undefined8 *)(pbVar17 + 0x38);
    if ((bVar2 & 1) == 0) {
      pbVar19 = *(byte **)(*(long *)(pbVar17 + 0x60) + 0x1e0);
      FUN_008b6efc(param_1,pbVar17);
      if (pbVar17 == pbVar19) goto LAB_008b6a9c;
LAB_008b6ac0:
      uVar15 = *(ulong *)(pbVar17 + 0x68);
      uVar10 = *(long *)(pbVar17 + 0x58) + (long)*(int *)(pbVar17 + 0x40) * 0x10;
      if (uVar15 < uVar10) {
        uVar1 = uVar10;
        if (uVar10 <= uVar15 + 0x10) {
          uVar1 = uVar15 + 0x10;
        }
        uVar13 = uVar15;
        if (0xf < uVar1 + ~uVar15) {
          uVar1 = (uVar1 + ~uVar15 >> 4) + 1;
          uVar14 = uVar1 & 0x1ffffffffffffffe;
          uVar13 = uVar15 + uVar14 * 0x10;
          puVar16 = (undefined4 *)(uVar15 + 0x1c);
          uVar15 = uVar14;
          do {
            uVar15 = uVar15 - 2;
            puVar16[-4] = 0;
            *puVar16 = 0;
            puVar16 = puVar16 + 8;
          } while (uVar15 != 0);
          if (uVar1 == uVar14) goto LAB_008b6b38;
        }
        do {
          *(undefined4 *)(uVar13 + 0xc) = 0;
          uVar13 = uVar13 + 0x10;
        } while (uVar13 < uVar10);
      }
    }
    else {
      FUN_008b6efc(param_1,pbVar17);
LAB_008b6a9c:
      uVar11 = *(undefined8 *)(param_1 + 0x60);
      *(byte **)(param_1 + 0x60) = pbVar17;
      *(undefined8 *)(pbVar17 + 0x38) = uVar11;
      pbVar17[2] = pbVar17[2] & 0xfb;
      if (*(char *)(param_1 + 1) == '\x03') goto LAB_008b6ac0;
    }
LAB_008b6b38:
    if (*(char *)(param_1 + 1) == '\x01') {
      FUN_008b3edc(pbVar17,FUN_008b7000,&uStack_59);
    }
    lVar5 = (long)*(int *)(pbVar17 + 0x44) * 0x30 + (long)*(int *)(pbVar17 + 0x40) * 0x10 + 0x88;
    goto LAB_008b6db4;
  }
  lVar5 = *(long *)(pbVar17 + 0x10);
  *(undefined8 *)(param_1 + 0x58) = *(undefined8 *)(pbVar17 + 0x18);
  if (lVar5 == 0) {
LAB_008b6c60:
    uVar12 = 0;
LAB_008b6c64:
    uVar20 = uVar12;
    uVar10 = (ulong)*(int *)(pbVar17 + 8);
    if (*(int *)(pbVar17 + 8) != 0) {
      lVar5 = uVar10 << 4;
      uVar15 = uVar10;
      do {
        if ((4 < *(int *)(*(long *)(pbVar17 + 0x20) + lVar5 + -4)) &&
           ((*(byte *)(*(long *)(*(long *)(pbVar17 + 0x20) + lVar5 + -0x10) + 2) & 3) != 0)) {
          FUN_008b61bc(param_1);
        }
        uVar15 = uVar15 - 1;
        lVar5 = lVar5 + -0x10;
        uVar10 = 0;
      } while (uVar15 != 0);
    }
LAB_008b6cb0:
    lVar5 = (ulong)(uint)~(-1 << (ulong)(pbVar17[5] & 0x1f)) << 5;
    do {
      plVar6 = (long *)(*(long *)(pbVar17 + 0x28) + lVar5);
      if (*(int *)((long)plVar6 + 0xc) == 0) {
        if (4 < (*(uint *)((long)plVar6 + 0x1c) & 0xf)) {
          *(uint *)((long)plVar6 + 0x1c) = *(uint *)((long)plVar6 + 0x1c) & 0xfffffff0 | 0xd;
        }
      }
      else {
        if (((uVar20 == 0) &&
            (lVar18 = *(long *)(pbVar17 + 0x28) + lVar5, 4 < (*(uint *)(lVar18 + 0x1c) & 0xf))) &&
           ((*(byte *)(*(long *)(lVar18 + 0x10) + 2) & 3) != 0)) {
          FUN_008b61bc(param_1);
        }
        if ((((uVar10 & 1) == 0) && (4 < *(int *)((long)plVar6 + 0xc))) &&
           ((*(byte *)(*plVar6 + 2) & 3) != 0)) {
          FUN_008b61bc(param_1);
        }
      }
      bVar4 = lVar5 != 0;
      lVar5 = lVar5 + -0x20;
    } while (bVar4);
    if ((uVar20 | (uint)uVar10) == 1) goto LAB_008b6d6c;
  }
  else {
    if ((*(byte *)(lVar5 + 2) & 3) != 0) {
      FUN_008b61bc(param_1);
      lVar5 = *(long *)(pbVar17 + 0x10);
      if (lVar5 == 0) goto LAB_008b6c60;
    }
    if ((*(byte *)(lVar5 + 6) >> 2 & 1) != 0) goto LAB_008b6c60;
    if ((*(byte *)(lVar5 + 7) >> 1 & 1) == 0) {
      plVar6 = (long *)FUN_008bdfe0(lVar5,2,*(undefined8 *)(param_1 + 0x348));
      if (plVar6 == (long *)0x0) goto LAB_008b6c60;
    }
    else {
      plVar6 = (long *)(*(long *)(lVar5 + 0x20) + -0x30);
    }
    if (*(int *)((long)plVar6 + 0xc) != 5) goto LAB_008b6c60;
    lVar5 = *plVar6;
    pcVar7 = strchr((char *)(lVar5 + 0x18),0x76);
    pcVar8 = strchr((char *)(lVar5 + 0x18),0x6b);
    uVar20 = (uint)(pcVar8 != (char *)0x0);
    if (pcVar8 == (char *)0x0 && pcVar7 == (char *)0x0) goto LAB_008b6c60;
    uVar11 = *(undefined8 *)(param_1 + 0x68);
    *(byte **)(param_1 + 0x68) = pbVar17;
    *(undefined8 *)(pbVar17 + 0x18) = uVar11;
    if ((pcVar8 == (char *)0x0) || (pcVar7 == (char *)0x0)) {
      uVar12 = (uint)(pcVar8 != (char *)0x0);
      if (pcVar7 == (char *)0x0) goto LAB_008b6c64;
      uVar10 = 1;
      goto LAB_008b6cb0;
    }
LAB_008b6d6c:
    pbVar17[2] = pbVar17[2] & 0xfb;
  }
  lVar5 = (long)*(int *)(pbVar17 + 8) * 0x10 + 0x30;
  if (*(undefined **)(pbVar17 + 0x28) != &DAT_00364ca0) {
    uVar20 = 1 << (ulong)(pbVar17[5] & 0x1f);
    lVar5 = lVar5 + (-(ulong)(uVar20 >> 0x1f) & 0xffffffe000000000 | (ulong)uVar20 << 5);
  }
LAB_008b6db4:
  if (*(long *)(lVar3 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(lVar5);
  }
  return;
}

