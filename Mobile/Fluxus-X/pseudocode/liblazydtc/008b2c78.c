/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b2c78
 */

undefined8 FUN_008b2c78(long param_1)

{
  int iVar1;
  uint uVar2;
  int iVar3;
  undefined1 uVar4;
  byte bVar5;
  undefined8 *puVar6;
  undefined8 uVar7;
  double *pdVar8;
  undefined8 *puVar9;
  long lVar10;
  ulong uVar11;
  long lVar12;
  undefined8 *puVar13;
  ulong uVar14;
  undefined4 *puVar15;
  ulong uVar16;
  int iVar17;
  long lVar18;
  double dVar19;
  
  lVar18 = **(long **)(param_1 + 0x70);
  puVar6 = (undefined8 *)FUN_008b78d0(param_1,0x28,*(undefined1 *)(param_1 + 4),0xc,0);
  puVar6[4] = 0;
  puVar6[1] = 0;
  *puVar6 = 0;
  puVar6[3] = 0;
  puVar6[2] = 0;
  lVar10 = *(long *)(param_1 + 0x60);
  uVar4 = *(undefined1 *)(param_1 + 4);
  *(undefined1 *)puVar6 = 0xc;
  puVar6[2] = lVar18;
  bVar5 = *(byte *)(lVar10 + 2);
  *(undefined1 *)((long)puVar6 + 1) = uVar4;
  *(byte *)((long)puVar6 + 2) = bVar5 & 3;
  lVar10 = FUN_008b7610(param_1,(ulong)*(uint *)(lVar18 + 0x58) << 4);
  uVar2 = *(uint *)(lVar18 + 0x58);
  uVar11 = (ulong)uVar2;
  puVar6[4] = lVar10;
  *(uint *)(puVar6 + 3) = uVar2;
  if (uVar2 != 0) {
    if (uVar2 == 1) {
      uVar14 = 0;
    }
    else {
      uVar14 = uVar11 & 0xfffffffe;
      puVar15 = (undefined4 *)(lVar10 + 0x1c);
      uVar16 = uVar14;
      do {
        uVar16 = uVar16 - 2;
        puVar15[-4] = 0;
        *puVar15 = 0;
        puVar15 = puVar15 + 8;
      } while (uVar16 != 0);
      if (uVar14 == uVar11) goto LAB_008b2d4c;
    }
    lVar12 = uVar11 - uVar14;
    puVar15 = (undefined4 *)(lVar10 + uVar14 * 0x10 + 0xc);
    do {
      lVar12 = lVar12 + -1;
      *puVar15 = 0;
      puVar15 = puVar15 + 4;
    } while (lVar12 != 0);
  }
LAB_008b2d4c:
  uVar7 = FUN_008b9ff8(param_1,"__init",6);
  pdVar8 = (double *)FUN_008bb440(*(undefined8 *)(lVar18 + 0x38),uVar7);
  puVar9 = *(undefined8 **)(param_1 + 0x68);
  dVar19 = *pdVar8;
  iVar3 = *(int *)(lVar18 + 0x58);
  lVar12 = *(long *)(lVar18 + 0x28);
  uVar11 = (long)puVar9 - *(long *)(param_1 + 0x70);
  *puVar9 = puVar6;
  lVar10 = *(long *)(param_1 + 0x68);
  lVar18 = *(long *)(param_1 + 0x48);
  *(undefined4 *)((long)puVar9 + 0xc) = 0xc;
  iVar17 = (int)(uVar11 >> 4);
  iVar1 = iVar17 + 1;
  puVar9 = (undefined8 *)(lVar10 + 0x10);
  *(undefined8 **)(param_1 + 0x68) = puVar9;
  if (lVar18 - (long)puVar9 <= (long)(iVar1 * 0x10)) {
    FUN_008b41e4(param_1,iVar1);
    puVar9 = *(undefined8 **)(param_1 + 0x68);
  }
  *(undefined8 **)(param_1 + 0x68) = puVar9 + 2;
  puVar13 = (undefined8 *)(lVar12 + (ulong)(uint)((int)dVar19 - iVar3) * 0x10);
  uVar7 = *puVar13;
  puVar9[1] = puVar13[1];
  *puVar9 = uVar7;
  puVar13 = *(undefined8 **)(param_1 + 0x68);
  *(undefined8 **)(param_1 + 0x68) = puVar13 + 2;
  *puVar13 = puVar6;
  *(undefined4 *)((long)puVar13 + 0xc) = 0xc;
  if (1 < iVar17) {
    lVar10 = 0x10;
    lVar18 = (uVar11 >> 4 & 0x7fffffff) - 1;
    do {
      puVar6 = *(undefined8 **)(param_1 + 0x68);
      lVar18 = lVar18 + -1;
      *(undefined8 **)(param_1 + 0x68) = puVar6 + 2;
      puVar13 = (undefined8 *)(*(long *)(param_1 + 0x70) + lVar10);
      uVar7 = *puVar13;
      lVar10 = lVar10 + 0x10;
      puVar6[1] = puVar13[1];
      *puVar6 = uVar7;
    } while (lVar18 != 0);
  }
  FUN_008b465c(param_1,puVar9,0);
  return 1;
}

