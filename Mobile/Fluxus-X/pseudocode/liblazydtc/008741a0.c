/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008741a0
 */

void FUN_008741a0(long param_1,undefined8 param_2,ulong param_3,uint param_4,ulong param_5)

{
  uint *puVar1;
  undefined4 *puVar2;
  int *piVar3;
  uint *puVar4;
  int iVar5;
  byte bVar6;
  bool bVar7;
  undefined4 *puVar8;
  ulong uVar9;
  int *piVar10;
  long lVar11;
  ulong uVar12;
  long lVar13;
  undefined8 uVar14;
  
  lVar11 = *(long *)(param_1 + 8) + (param_3 & 0xffffffff) * 0x88;
  FUN_00877148(param_2,*(undefined1 *)(lVar11 + 0x18));
  FUN_00877148(param_2,*(undefined1 *)(lVar11 + 0x19));
  FUN_00877148(param_2,*(undefined1 *)(lVar11 + 0x1a));
  FUN_00877148(param_2,*(undefined1 *)(lVar11 + 0x1b));
  FUN_00877148(param_2,param_4);
  bVar6 = *(byte *)(lVar11 + 0x70);
  uVar9 = (ulong)(bVar6 >> 1);
  if ((bVar6 & 1) != 0) {
    uVar9 = *(ulong *)(lVar11 + 0x78);
  }
  if (((uVar9 == 0) && (*(long *)(param_1 + 0x1f0) == *(long *)(param_1 + 0x1f8))) &&
     (*(long *)(param_1 + 0x1d8) == *(long *)(param_1 + 0x1e0))) {
    FUN_00877148(param_2,0);
  }
  else {
    if ((*(byte *)(param_1 + 0x2f8) & 1) == 0) {
      *(undefined2 *)(param_1 + 0x2f8) = 0;
    }
    else {
      **(undefined1 **)(param_1 + 0x308) = 0;
      *(undefined8 *)(param_1 + 0x300) = 0;
    }
    uVar9 = (ulong)(*(byte *)(lVar11 + 0x70) >> 1);
    if ((*(byte *)(lVar11 + 0x70) & 1) != 0) {
      uVar9 = *(ulong *)(lVar11 + 0x78);
    }
    uVar9 = uVar9 & 0xffffffff;
    do {
      FUN_00877148(param_1 + 0x2f8,(uint)uVar9 & 0x7f | (uint)(0x7f < uVar9) << 7);
      bVar7 = 0x7f < uVar9;
      uVar9 = uVar9 >> 7;
    } while (bVar7);
    uVar9 = (ulong)(*(long *)(param_1 + 0x1f8) - *(long *)(param_1 + 0x1f0)) >> 2 & 0xffffffff;
    do {
      FUN_00877148(param_1 + 0x2f8,(uint)uVar9 & 0x7f | (uint)(0x7f < uVar9) << 7);
      bVar7 = 0x7f < uVar9;
      uVar9 = uVar9 >> 7;
    } while (bVar7);
    uVar9 = (ulong)(*(long *)(param_1 + 0x1e0) - *(long *)(param_1 + 0x1d8)) >> 4 & 0xffffffff;
    do {
      FUN_00877148(param_1 + 0x2f8,(uint)uVar9 & 0x7f | (uint)(0x7f < uVar9) << 7);
      bVar7 = 0x7f < uVar9;
      uVar9 = uVar9 >> 7;
    } while (bVar7);
    FUN_0081f6dc(param_1 + 0x2f8,(byte *)(lVar11 + 0x70));
    puVar2 = *(undefined4 **)(param_1 + 0x1f8);
    for (puVar8 = *(undefined4 **)(param_1 + 0x1f0); puVar8 != puVar2; puVar8 = puVar8 + 1) {
      FUN_00877148(param_1 + 0x2f8,*puVar8);
    }
    puVar2 = *(undefined4 **)(param_1 + 0x1e0);
    for (puVar8 = *(undefined4 **)(param_1 + 0x1d8); puVar8 != puVar2; puVar8 = puVar8 + 4) {
      FUN_00877148(param_1 + 0x2f8,*puVar8);
      FUN_00877148(param_1 + 0x2f8,*(undefined1 *)(puVar8 + 1));
      uVar9 = (ulong)(uint)puVar8[2];
      do {
        FUN_00877148(param_1 + 0x2f8,(uint)uVar9 & 0x7f | (uint)(0x7f < uVar9) << 7);
        bVar7 = 0x7f < uVar9;
        uVar9 = uVar9 >> 7;
      } while (bVar7);
      uVar9 = (ulong)(uint)(puVar8[3] - puVar8[2]);
      do {
        FUN_00877148(param_1 + 0x2f8,(uint)uVar9 & 0x7f | (uint)(0x7f < uVar9) << 7);
        bVar7 = 0x7f < uVar9;
        uVar9 = uVar9 >> 7;
      } while (bVar7);
    }
    uVar9 = (ulong)(*(byte *)(param_1 + 0x2f8) >> 1);
    if ((*(byte *)(param_1 + 0x2f8) & 1) != 0) {
      uVar9 = *(ulong *)(param_1 + 0x300);
    }
    uVar9 = uVar9 & 0xffffffff;
    do {
      FUN_00877148(param_2,(uint)uVar9 & 0x7f | (uint)(0x7f < uVar9) << 7);
      bVar7 = 0x7f < uVar9;
      uVar9 = uVar9 >> 7;
    } while (bVar7);
    FUN_0081f6dc(param_2,param_1 + 0x2f8);
  }
  uVar9 = (ulong)(*(long *)(param_1 + 0x38) - *(long *)(param_1 + 0x30)) >> 2 & 0xffffffff;
  do {
    FUN_00877148(param_2,(uint)uVar9 & 0x7f | (uint)(0x7f < uVar9) << 7);
    bVar7 = 0x7f < uVar9;
    uVar9 = uVar9 >> 7;
  } while (bVar7);
  puVar2 = *(undefined4 **)(param_1 + 0x38);
  for (puVar8 = *(undefined4 **)(param_1 + 0x30); puVar8 != puVar2; puVar8 = puVar8 + 1) {
    FUN_00877534(param_2,*puVar8);
  }
  uVar9 = (ulong)(uint)((int)((ulong)(*(long *)(param_1 + 0x68) - *(long *)(param_1 + 0x60)) >> 3) *
                       -0x33333333);
  do {
    FUN_00877148(param_2,(uint)uVar9 & 0x7f | (uint)(0x7f < uVar9) << 7);
    bVar7 = 0x7f < uVar9;
    uVar9 = uVar9 >> 7;
  } while (bVar7);
  piVar10 = *(int **)(param_1 + 0x60);
  piVar3 = *(int **)(param_1 + 0x68);
LAB_0087449c:
  if (piVar10 == piVar3) goto LAB_008747c0;
  iVar5 = *piVar10;
  if (iVar5 < 5) {
    if (1 < iVar5) {
      if (iVar5 == 2) {
        FUN_00877148(param_2,2);
        uVar14 = *(undefined8 *)(piVar10 + 2);
      }
      else {
        if (iVar5 == 3) {
          FUN_00877148(param_2,7);
          FUN_008777ec(piVar10[2],param_2);
          FUN_008777ec(piVar10[3],param_2);
          FUN_008777ec(piVar10[4],param_2);
          FUN_008777ec(piVar10[5],param_2);
          piVar10 = piVar10 + 10;
          goto LAB_0087449c;
        }
        if (iVar5 != 4) goto LAB_00874498;
        FUN_00877148(param_2,0xb);
        FUN_00877690(*(undefined8 *)(piVar10 + 2),param_2);
        FUN_00877690(*(undefined8 *)(piVar10 + 4),param_2);
        FUN_00877690(*(undefined8 *)(piVar10 + 6),param_2);
        uVar14 = *(undefined8 *)(piVar10 + 8);
      }
      FUN_00877690(uVar14,param_2);
      piVar10 = piVar10 + 10;
      goto LAB_0087449c;
    }
    if (iVar5 == 0) {
      FUN_00877148(param_2,0);
      piVar10 = piVar10 + 10;
      goto LAB_0087449c;
    }
    if (iVar5 == 1) {
      FUN_00877148(param_2,1);
      FUN_00877148(param_2,(char)piVar10[2]);
      piVar10 = piVar10 + 10;
      goto LAB_0087449c;
    }
  }
  else {
    if (iVar5 < 7) {
      if (iVar5 == 5) {
        FUN_00877148(param_2,3);
        uVar9 = (ulong)(uint)piVar10[2];
        do {
          FUN_00877148(param_2,(uint)uVar9 & 0x7f | (uint)(0x7f < uVar9) << 7);
          bVar7 = 0x7f < uVar9;
          uVar9 = uVar9 >> 7;
        } while (bVar7);
        goto LAB_00874498;
      }
      if (iVar5 != 6) goto LAB_00874498;
      FUN_00877148(param_2,4);
      FUN_00877534(param_2,piVar10[2]);
      piVar10 = piVar10 + 10;
      goto LAB_0087449c;
    }
    if (iVar5 == 7) {
      lVar13 = *(long *)(param_1 + 0xa8) + (ulong)(uint)piVar10[2] * 0x108;
      if (*(char *)(lVar13 + 0x104) == '\x01') {
        FUN_00877148(param_2,8);
        uVar9 = (ulong)*(uint *)(lVar13 + 0x100);
        do {
          FUN_00877148(param_2,(uint)uVar9 & 0x7f | (uint)(0x7f < uVar9) << 7);
          bVar7 = 0x7f < uVar9;
          uVar9 = uVar9 >> 7;
        } while (bVar7);
        if (*(int *)(lVar13 + 0x100) != 0) {
          uVar9 = 0;
          do {
            uVar12 = (long)*(int *)(lVar13 + uVar9 * 4);
            do {
              FUN_00877148(param_2,(uint)uVar12 & 0x7f | (uint)(0x7f < uVar12) << 7);
              bVar7 = 0x7f < uVar12;
              uVar12 = uVar12 >> 7;
            } while (bVar7);
            FUN_00877534(param_2,*(undefined4 *)(lVar13 + 0x80 + uVar9 * 4));
            uVar9 = uVar9 + 1;
          } while (uVar9 < *(uint *)(lVar13 + 0x100));
        }
      }
      else {
        FUN_00877148(param_2,5);
        uVar9 = (ulong)*(uint *)(lVar13 + 0x100);
        do {
          FUN_00877148(param_2,(uint)uVar9 & 0x7f | (uint)(0x7f < uVar9) << 7);
          bVar7 = 0x7f < uVar9;
          uVar9 = uVar9 >> 7;
        } while (bVar7);
        if (*(int *)(lVar13 + 0x100) != 0) {
          uVar9 = 0;
          do {
            uVar12 = (long)*(int *)(lVar13 + uVar9 * 4);
            do {
              FUN_00877148(param_2,(uint)uVar12 & 0x7f | (uint)(0x7f < uVar12) << 7);
              bVar7 = 0x7f < uVar12;
              uVar12 = uVar12 >> 7;
            } while (bVar7);
            uVar9 = uVar9 + 1;
          } while (uVar9 < *(uint *)(lVar13 + 0x100));
        }
      }
    }
    else {
      if (iVar5 != 8) {
        if (iVar5 != 9) goto LAB_00874498;
        uVar14 = FUN_00877148(param_2,10);
        FUN_00877948(uVar14,param_2,*(long *)(param_1 + 0xc0) + (ulong)(uint)piVar10[2] * 0x38);
        piVar10 = piVar10 + 10;
        goto LAB_0087449c;
      }
      FUN_00877148(param_2,6);
      uVar9 = (ulong)(uint)piVar10[2];
      do {
        FUN_00877148(param_2,(uint)uVar9 & 0x7f | (uint)(0x7f < uVar9) << 7);
        bVar7 = 0x7f < uVar9;
        uVar9 = uVar9 >> 7;
      } while (bVar7);
    }
  }
LAB_00874498:
  piVar10 = piVar10 + 10;
  goto LAB_0087449c;
LAB_008747c0:
  uVar9 = (ulong)(*(long *)(param_1 + 0x80) - *(long *)(param_1 + 0x78)) >> 2 & 0xffffffff;
  do {
    FUN_00877148(param_2,(uint)uVar9 & 0x7f | (uint)(0x7f < uVar9) << 7);
    bVar7 = 0x7f < uVar9;
    uVar9 = uVar9 >> 7;
  } while (bVar7);
  puVar4 = *(uint **)(param_1 + 0x80);
  for (puVar1 = *(uint **)(param_1 + 0x78); puVar1 != puVar4; puVar1 = puVar1 + 1) {
    uVar9 = (ulong)*puVar1;
    do {
      FUN_00877148(param_2,(uint)uVar9 & 0x7f | (uint)(0x7f < uVar9) << 7);
      bVar7 = 0x7f < uVar9;
      uVar9 = uVar9 >> 7;
    } while (bVar7);
  }
  uVar9 = (long)*(int *)(lVar11 + 0x20);
  do {
    FUN_00877148(param_2,(uint)uVar9 & 0x7f | (uint)(0x7f < uVar9) << 7);
    bVar7 = 0x7f < uVar9;
    uVar9 = uVar9 >> 7;
  } while (bVar7);
  uVar9 = (ulong)*(uint *)(lVar11 + 0x1c);
  do {
    FUN_00877148(param_2,(uint)uVar9 & 0x7f | (uint)(0x7f < uVar9) << 7);
    bVar7 = 0x7f < uVar9;
    uVar9 = uVar9 >> 7;
  } while (bVar7);
  piVar10 = *(int **)(param_1 + 0x48);
  do {
    if (piVar10 == *(int **)(param_1 + 0x50)) {
      FUN_00877148(param_2,1);
      FUN_00877aa0(param_1,param_2);
LAB_008748c8:
      if ((*(long *)(param_1 + 0x1a8) == *(long *)(param_1 + 0x1b0)) &&
         (*(long *)(param_1 + 0x1c0) == *(long *)(param_1 + 0x1c8))) {
        FUN_00877148(param_2,0);
      }
      else {
        FUN_00877148(param_2,1);
        uVar9 = (ulong)(*(long *)(param_1 + 0x1b0) - *(long *)(param_1 + 0x1a8)) >> 4 & 0xffffffff;
        do {
          FUN_00877148(param_2,(uint)uVar9 & 0x7f | (uint)(0x7f < uVar9) << 7);
          bVar7 = 0x7f < uVar9;
          uVar9 = uVar9 >> 7;
        } while (bVar7);
        puVar4 = *(uint **)(param_1 + 0x1b0);
        for (puVar1 = *(uint **)(param_1 + 0x1a8); puVar1 != puVar4; puVar1 = puVar1 + 4) {
          uVar9 = (ulong)*puVar1;
          do {
            FUN_00877148(param_2,(uint)uVar9 & 0x7f | (uint)(0x7f < uVar9) << 7);
            bVar7 = 0x7f < uVar9;
            uVar9 = uVar9 >> 7;
          } while (bVar7);
          uVar9 = (ulong)puVar1[2];
          do {
            FUN_00877148(param_2,(uint)uVar9 & 0x7f | (uint)(0x7f < uVar9) << 7);
            bVar7 = 0x7f < uVar9;
            uVar9 = uVar9 >> 7;
          } while (bVar7);
          uVar9 = (ulong)puVar1[3];
          do {
            FUN_00877148(param_2,(uint)uVar9 & 0x7f | (uint)(0x7f < uVar9) << 7);
            bVar7 = 0x7f < uVar9;
            uVar9 = uVar9 >> 7;
          } while (bVar7);
          FUN_00877148(param_2,(char)puVar1[1]);
        }
        uVar9 = (ulong)(*(long *)(param_1 + 0x1c8) - *(long *)(param_1 + 0x1c0)) >> 2 & 0xffffffff;
        do {
          FUN_00877148(param_2,(uint)uVar9 & 0x7f | (uint)(0x7f < uVar9) << 7);
          bVar7 = 0x7f < uVar9;
          uVar9 = uVar9 >> 7;
        } while (bVar7);
        puVar4 = *(uint **)(param_1 + 0x1c8);
        for (puVar1 = *(uint **)(param_1 + 0x1c0); puVar1 != puVar4; puVar1 = puVar1 + 1) {
          uVar9 = (ulong)*puVar1;
          do {
            FUN_00877148(param_2,(uint)uVar9 & 0x7f | (uint)(0x7f < uVar9) << 7);
            bVar7 = 0x7f < uVar9;
            uVar9 = uVar9 >> 7;
          } while (bVar7);
        }
      }
      if (((DAT_00d1eee8 & 1) == 0) && (DAT_00d1ec80 != '\x01')) {
        FUN_00877148(param_2,0);
      }
      else {
        uVar9 = *(long *)(param_1 + 0xe0) - *(long *)(param_1 + 0xd8) >> 3;
        do {
          FUN_00877148(param_2,(uint)uVar9 & 0x7f | (uint)(0x7f < uVar9) << 7);
          bVar7 = 0x7f < uVar9;
          uVar9 = uVar9 >> 7;
        } while (bVar7);
        piVar3 = *(int **)(param_1 + 0xe0);
        for (piVar10 = *(int **)(param_1 + 0xd8); piVar10 != piVar3; piVar10 = piVar10 + 2) {
          FUN_00877148(param_2,*piVar10);
          if (*piVar10 == 1) {
            uVar9 = (ulong)(uint)piVar10[1];
            do {
              FUN_00877148(param_2,(uint)uVar9 & 0x7f | (uint)(0x7f < uVar9) << 7);
              bVar7 = 0x7f < uVar9;
              uVar9 = uVar9 >> 7;
            } while (bVar7);
          }
          else if (*piVar10 == 0) {
            uVar9 = (ulong)(uint)piVar10[1];
            do {
              FUN_00877148(param_2,(uint)uVar9 & 0x7f | (uint)(0x7f < uVar9) << 7);
              bVar7 = 0x7f < uVar9;
              uVar9 = uVar9 >> 7;
            } while (bVar7);
          }
        }
      }
      if ((param_4 >> 3 & 1) != 0) {
        do {
          FUN_00877148(param_2,(uint)param_5 & 0x7f | (uint)(0x7f < param_5) << 7);
          bVar7 = 0x7f < param_5;
          param_5 = param_5 >> 7;
        } while (bVar7);
      }
      return;
    }
    if (*piVar10 == 0) {
      FUN_00877148(param_2,0);
      goto LAB_008748c8;
    }
    piVar10 = piVar10 + 1;
  } while( true );
}

