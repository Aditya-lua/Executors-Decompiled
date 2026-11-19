/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b25f4
 */

undefined1 * FUN_008b25f4(long param_1,long param_2,long param_3)

{
  ulong uVar1;
  int iVar2;
  int iVar3;
  undefined1 uVar4;
  undefined1 uVar5;
  byte bVar6;
  uint uVar7;
  undefined8 *puVar8;
  undefined8 *puVar9;
  long lVar10;
  undefined1 *puVar11;
  double *pdVar12;
  undefined8 uVar13;
  int iVar14;
  ulong uVar15;
  undefined8 uVar16;
  long lVar17;
  int iVar18;
  ulong uVar19;
  uint uVar20;
  ulong uVar21;
  
  if ((*(byte *)(param_3 + 0x69) & 1) == 0) {
                    /* WARNING: Subroutine does not return */
    FUN_008b39cc(param_1,"Non-open class \'%s\' cannot be extended",*(long *)(param_3 + 0x10) + 0x18
                );
  }
  uVar15 = (ulong)*(uint *)(param_3 + 0x58);
  if (*(uint *)(param_3 + 0x58) != 0) {
    uVar19 = 0;
    do {
      lVar17 = *(long *)(*(long *)(param_3 + 0x40) + uVar19 * 8);
      if (lVar17 != 0) {
        lVar10 = FUN_008bb440(*(undefined8 *)(param_2 + 0x38),lVar17);
        if (*(int *)(lVar10 + 0xc) != 0) {
                    /* WARNING: Subroutine does not return */
          FUN_008b39cc(param_1,
                       "Cannot override instance member \'%s\' of parent class \'%s\' in child class \'%s\'"
                       ,lVar17 + 0x18,*(long *)(param_3 + 0x10) + 0x18,
                       *(long *)(param_2 + 0x10) + 0x18);
        }
        uVar15 = (ulong)*(uint *)(param_3 + 0x58);
      }
      uVar19 = uVar19 + 1;
    } while (uVar19 < uVar15);
  }
  uVar16 = *(undefined8 *)(param_2 + 0x10);
  uVar4 = *(undefined1 *)(param_2 + 0x69);
  puVar11 = (undefined1 *)FUN_008b78d0(param_1,0x70,*(undefined1 *)(param_1 + 4),0xb,0);
  lVar17 = *(long *)(param_1 + 0x60);
  uVar5 = *(undefined1 *)(param_1 + 4);
  *puVar11 = 0xb;
  bVar6 = *(byte *)(lVar17 + 2);
  iVar3 = *(int *)(lVar17 + 0x558c);
  puVar11[1] = uVar5;
  *(undefined8 *)(puVar11 + 0x10) = uVar16;
  puVar11[2] = bVar6 & 3;
  if (iVar3 != 0) {
    *(int *)(lVar17 + 0x558c) = iVar3 + 1;
  }
  puVar11[0x68] = 0;
  puVar11[0x69] = uVar4;
  iVar18 = 0;
  *(int *)(puVar11 + 0x18) = iVar3;
  puVar11[0x6a] = 0;
  *(undefined8 *)(puVar11 + 0x30) = 0;
  *(undefined8 *)(puVar11 + 0x28) = 0;
  *(undefined8 *)(puVar11 + 0x40) = 0;
  *(undefined8 *)(puVar11 + 0x38) = 0;
  *(undefined8 *)(puVar11 + 0x50) = 0;
  *(undefined8 *)(puVar11 + 0x48) = 0;
  *(undefined8 *)(puVar11 + 0x60) = 0;
  *(undefined8 *)(puVar11 + 0x58) = 0;
  bVar6 = *(byte *)(param_3 + 0x68);
  iVar3 = *(int *)(param_3 + 0x5c);
  uVar20 = *(uint *)(param_3 + 0x58);
  uVar15 = (ulong)uVar20;
  *(long *)(puVar11 + 0x20) = param_3;
  uVar7 = iVar3 - (uint)bVar6;
  if (uVar20 < uVar7) {
    do {
      lVar17 = FUN_008bb440(*(undefined8 *)(param_2 + 0x38),
                            *(undefined8 *)(*(long *)(param_3 + 0x40) + uVar15 * 8));
      uVar15 = uVar15 + 1;
      if (*(int *)(lVar17 + 0xc) == 0) {
        iVar18 = iVar18 + 1;
      }
    } while (uVar15 < uVar7);
    uVar20 = *(uint *)(param_3 + 0x58);
    uVar5 = puVar11[1];
  }
  iVar3 = *(int *)(param_2 + 0x5c) + uVar20 + iVar18;
  uVar16 = FUN_008b7610(param_1,(ulong)(iVar3 - (uint)*(byte *)(param_2 + 0x68)) << 3,uVar5);
  iVar14 = *(int *)(param_2 + 0x60);
  iVar2 = *(int *)(param_3 + 0x60);
  bVar6 = *(byte *)(param_2 + 0x68);
  *(undefined8 *)(puVar11 + 0x40) = uVar16;
  *(int *)(puVar11 + 0x5c) = iVar3;
  uVar16 = FUN_008bae54(param_1,0,iVar3 - (iVar14 + iVar2 + (uint)bVar6));
  uVar4 = *(undefined1 *)(param_3 + 0x6a);
  uVar20 = *(uint *)(param_3 + 0x58);
  uVar15 = (ulong)uVar20;
  *(undefined8 *)(puVar11 + 0x38) = uVar16;
  puVar11[0x6a] = uVar4;
  if (uVar20 == 0) {
    uVar19 = 0;
  }
  else {
    uVar19 = 0;
    do {
      lVar17 = *(long *)(*(long *)(param_3 + 0x40) + uVar19 * 8);
      *(long *)(*(long *)(puVar11 + 0x40) + uVar19 * 8) = lVar17;
      if (lVar17 != 0) {
        pdVar12 = (double *)FUN_008bce4c(param_1,*(undefined8 *)(puVar11 + 0x38));
        *(undefined4 *)((long)pdVar12 + 0xc) = 3;
        *pdVar12 = (double)(uVar19 & 0xffffffff);
        uVar15 = (ulong)*(uint *)(param_3 + 0x58);
      }
      uVar19 = uVar19 + 1;
    } while (uVar19 < uVar15);
  }
  iVar14 = (int)uVar15;
  uVar15 = (ulong)*(uint *)(param_2 + 0x58);
  if (*(uint *)(param_2 + 0x58) != 0) {
    uVar21 = 0;
    do {
      uVar1 = (uVar19 & 0xffffffff) + uVar21;
      lVar17 = *(long *)(*(long *)(param_2 + 0x40) + uVar21 * 8);
      *(long *)(*(long *)(puVar11 + 0x40) + (uVar1 & 0xffffffff) * 8) = lVar17;
      if (lVar17 != 0) {
        pdVar12 = (double *)FUN_008bce4c(param_1,*(undefined8 *)(puVar11 + 0x38));
        *(undefined4 *)((long)pdVar12 + 0xc) = 3;
        *pdVar12 = (double)(uVar1 & 0xffffffff);
        uVar15 = (ulong)*(uint *)(param_2 + 0x58);
      }
      uVar21 = uVar21 + 1;
    } while (uVar21 < uVar15);
    iVar14 = *(int *)(param_3 + 0x58);
    uVar19 = (ulong)(uint)((int)uVar19 + (int)uVar21);
  }
  iVar2 = *(int *)(param_2 + 100);
  *(int *)(puVar11 + 0x60) = *(int *)(param_3 + 0x60) + *(int *)(param_2 + 0x60);
  *(int *)(puVar11 + 100) = iVar14 + iVar2;
  lVar17 = FUN_008b7610(param_1,(ulong)(uint)(iVar3 - (int)uVar19) << 4,puVar11[1]);
  iVar3 = *(int *)(param_2 + 0x58);
  iVar14 = *(int *)(param_2 + 0x5c);
  bVar6 = *(byte *)(param_2 + 0x68);
  *(int *)(puVar11 + 0x58) = (int)uVar19;
  uVar21 = 0;
  uVar20 = *(uint *)(param_3 + 0x58);
  uVar15 = (ulong)uVar20;
  puVar11[0x68] = bVar6;
  *(long *)(puVar11 + 0x28) = lVar17;
  *(ulong *)(puVar11 + 0x30) = lVar17 + (ulong)((iVar14 + iVar18) - (iVar3 + (uint)bVar6)) * 0x10;
  if (uVar20 < uVar7) {
    do {
      uVar16 = *(undefined8 *)(*(long *)(param_3 + 0x40) + uVar15 * 8);
      lVar17 = FUN_008bb440(*(undefined8 *)(param_2 + 0x38),uVar16);
      if (*(int *)(lVar17 + 0xc) == 0) {
        puVar8 = (undefined8 *)
                 (*(long *)(param_3 + 0x28) +
                 (ulong)(uint)((int)uVar15 - *(int *)(param_3 + 0x58)) * 0x10);
        uVar13 = *puVar8;
        puVar9 = (undefined8 *)(*(long *)(puVar11 + 0x28) + uVar21 * 0x10);
        puVar9[1] = puVar8[1];
        *puVar9 = uVar13;
        uVar13 = *(undefined8 *)(puVar11 + 0x38);
        *(undefined8 *)(*(long *)(puVar11 + 0x40) + (uVar19 & 0xffffffff) * 8) = uVar16;
        pdVar12 = (double *)FUN_008bce4c(param_1,uVar13,uVar16);
        uVar1 = uVar19 & 0xffffffff;
        uVar19 = (ulong)((int)uVar19 + 1);
        uVar21 = (ulong)((int)uVar21 + 1);
        *(undefined4 *)((long)pdVar12 + 0xc) = 3;
        *pdVar12 = (double)uVar1;
      }
      uVar15 = uVar15 + 1;
    } while (uVar15 < uVar7);
    iVar14 = *(int *)(param_2 + 0x5c);
    bVar6 = *(byte *)(param_2 + 0x68);
  }
  uVar15 = (ulong)*(uint *)(param_2 + 0x58);
  if (*(uint *)(param_2 + 0x58) < iVar14 - (uint)bVar6) {
    do {
      puVar8 = (undefined8 *)
               (*(long *)(param_2 + 0x28) +
               (ulong)(uint)((int)uVar15 - *(int *)(param_2 + 0x58)) * 0x10);
      uVar16 = *puVar8;
      uVar13 = *(undefined8 *)(*(long *)(param_2 + 0x40) + uVar15 * 8);
      puVar9 = (undefined8 *)(*(long *)(puVar11 + 0x28) + uVar21 * 0x10);
      puVar9[1] = puVar8[1];
      *puVar9 = uVar16;
      uVar16 = *(undefined8 *)(puVar11 + 0x38);
      *(undefined8 *)(*(long *)(puVar11 + 0x40) + (uVar19 & 0xffffffff) * 8) = uVar13;
      pdVar12 = (double *)FUN_008bce4c(param_1,uVar16);
      uVar1 = uVar19 & 0xffffffff;
      uVar15 = uVar15 + 1;
      uVar19 = (ulong)((int)uVar19 + 1);
      uVar21 = (ulong)((int)uVar21 + 1);
      *(undefined4 *)((long)pdVar12 + 0xc) = 3;
      *pdVar12 = (double)uVar1;
    } while (uVar15 < iVar14 - (uint)bVar6);
    bVar6 = *(byte *)(param_2 + 0x68);
  }
  if (bVar6 != 0) {
    lVar17 = 0;
    uVar15 = 0;
    do {
      lVar10 = *(long *)(puVar11 + 0x30);
      uVar15 = uVar15 + 1;
      puVar8 = (undefined8 *)(*(long *)(param_2 + 0x30) + lVar17);
      uVar16 = *puVar8;
      ((undefined8 *)(lVar10 + lVar17))[1] = puVar8[1];
      *(undefined8 *)(lVar10 + lVar17) = uVar16;
      lVar17 = lVar17 + 0x10;
    } while (uVar15 < *(byte *)(param_2 + 0x68));
  }
  if (*(long *)(param_3 + 0x50) != 0) {
    uVar16 = FUN_008bd16c(param_1);
    *(undefined8 *)(puVar11 + 0x50) = uVar16;
  }
  uVar16 = FUN_008aa2b8(param_1);
  FUN_008b24c4(param_1,puVar11,uVar16);
  return puVar11;
}

