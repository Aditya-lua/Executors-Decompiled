/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c120c
 */

uint tls1_shared_group(int *param_1,uint param_2)

{
  int iVar1;
  int iVar2;
  int iVar3;
  ushort uVar4;
  int iVar5;
  undefined4 uVar6;
  ulong uVar7;
  ushort *puVar8;
  ushort *puVar9;
  int *piVar10;
  uint uVar11;
  ulong uVar12;
  uint uVar13;
  long lVar14;
  undefined2 *puVar15;
  ulong uVar16;
  undefined2 *puVar17;
  ulong uVar18;
  ulong uVar19;
  undefined1 local_64;
  undefined1 local_63;
  
  if (param_1[0xe] == 0) {
    return 0;
  }
  lVar14 = *(long *)(param_1 + 0x26a);
  if (param_2 == 0xfffffffe) {
    if ((*(byte *)(*(long *)(param_1 + 0x226) + 0x1e) & 3) != 0) {
      uVar11 = 0x18;
      if (*(int *)(*(long *)(param_1 + 0xb8) + 0x18) != 0x300c02c) {
        uVar11 = 0;
      }
      uVar13 = 0x17;
      if (*(int *)(*(long *)(param_1 + 0xb8) + 0x18) != 0x300c02b) {
        uVar13 = uVar11;
      }
      return uVar13;
    }
    param_2 = 0;
  }
  if ((*(byte *)((long)param_1 + 0x9ea) >> 6 & 1) != 0) {
    puVar15 = &DAT_0074cd84;
    uVar11 = *(uint *)(*(long *)(param_1 + 0x226) + 0x1c) & 0x30000;
    if (uVar11 == 0x30000) {
      uVar16 = 2;
    }
    else if (uVar11 == 0x20000) {
      puVar15 = &DAT_0074cd86;
      uVar16 = 1;
    }
    else if (uVar11 == 0x10000) {
      puVar15 = &DAT_0074cd84;
      uVar16 = 1;
    }
    else {
      puVar15 = *(undefined2 **)(param_1 + 0x2b2);
      if (puVar15 == (undefined2 *)0x0) {
        puVar15 = *(undefined2 **)(lVar14 + 0x288);
        uVar16 = *(ulong *)(lVar14 + 0x290);
      }
      else {
        uVar16 = *(ulong *)(param_1 + 0x2b0);
      }
    }
    puVar17 = *(undefined2 **)(param_1 + 0x2b6);
    uVar18 = *(ulong *)(param_1 + 0x2b4);
    goto joined_r0x009c1390;
  }
  puVar15 = *(undefined2 **)(param_1 + 0x2b6);
  uVar16 = *(ulong *)(param_1 + 0x2b4);
  uVar11 = *(uint *)(*(long *)(param_1 + 0x226) + 0x1c) & 0x30000;
  if (uVar11 == 0x30000) {
    uVar18 = 2;
  }
  else {
    if (uVar11 == 0x20000) {
      puVar17 = &DAT_0074cd86;
      uVar18 = 1;
      goto joined_r0x009c1390;
    }
    if (uVar11 != 0x10000) {
      puVar17 = *(undefined2 **)(param_1 + 0x2b2);
      if (puVar17 == (undefined2 *)0x0) {
        puVar17 = *(undefined2 **)(lVar14 + 0x288);
        uVar18 = *(ulong *)(lVar14 + 0x290);
      }
      else {
        uVar18 = *(ulong *)(param_1 + 0x2b0);
      }
      goto joined_r0x009c1390;
    }
    uVar18 = 1;
  }
  puVar17 = &DAT_0074cd84;
joined_r0x009c1390:
  if (uVar16 == 0) {
    uVar11 = 0;
LAB_009c1558:
    if (param_2 != 0xffffffff) {
      uVar11 = 0;
    }
    return uVar11;
  }
  uVar19 = 0;
  uVar11 = 0;
LAB_009c139c:
  if (uVar18 != 0) {
    uVar4 = puVar15[uVar19];
    uVar13 = (uint)uVar4;
    uVar7 = 0;
    do {
      if ((ushort)puVar17[uVar7] == uVar13) {
        uVar7 = *(ulong *)(*(long *)(param_1 + 0x26a) + 0x630);
        if (uVar7 != 0) {
          uVar12 = 0;
          puVar8 = (ushort *)(*(long *)(*(long *)(param_1 + 0x26a) + 0x628) + 0x1c);
          goto LAB_009c13dc;
        }
        break;
      }
      uVar7 = uVar7 + 1;
    } while (uVar7 < uVar18);
  }
  goto LAB_009c154c;
  while( true ) {
    uVar12 = uVar12 + 1;
    puVar8 = puVar8 + 0x1c;
    if (uVar7 <= uVar12) break;
LAB_009c13dc:
    if (*puVar8 == uVar13) {
      if (puVar8 != (ushort *)0x1c) {
        local_64 = (undefined1)(uVar4 >> 8);
        local_63 = (undefined1)uVar4;
        if (uVar13 == 0) goto LAB_009c1444;
        uVar7 = 0;
        puVar9 = &DAT_0074cc38;
        goto LAB_009c1428;
      }
      break;
    }
  }
  goto LAB_009c154c;
  while( true ) {
    uVar7 = uVar7 + 1;
    puVar9 = puVar9 + 4;
    if (0x29 < uVar7) break;
LAB_009c1428:
    if (*puVar9 == uVar13) {
      uVar6 = *(undefined4 *)(puVar9 + -2);
      goto LAB_009c1450;
    }
  }
LAB_009c1444:
  uVar6 = 0;
LAB_009c1450:
  iVar5 = ssl_security(param_1,0x20005,*(undefined4 *)(puVar8 + -2),uVar6,&local_64);
  if (iVar5 != 0) {
    if (*(ulong *)(lVar14 + 0x630) == 0) {
      return 0;
    }
    uVar7 = 0;
    piVar10 = (int *)(*(long *)(lVar14 + 0x628) + 0x2c);
    while (*(ushort *)(piVar10 + -4) != uVar13) {
      uVar7 = uVar7 + 1;
      piVar10 = piVar10 + 0xe;
      if (*(ulong *)(lVar14 + 0x630) <= uVar7) {
        return 0;
      }
    }
    if (piVar10 == (int *)0x2c) {
      return 0;
    }
    if ((*(byte *)(*(long *)(*(long *)(param_1 + 2) + 0xc0) + 0x60) >> 3 & 1) == 0) {
      iVar5 = piVar10[-2];
      if (((iVar5 == -1) || ((piVar10[-3] != 0 && (*param_1 < piVar10[-3])))) ||
         ((iVar5 != 0 && (iVar5 < *param_1)))) goto LAB_009c154c;
    }
    else {
      iVar5 = *piVar10;
      if (iVar5 == -1) goto LAB_009c154c;
      iVar3 = piVar10[-1];
      if (iVar3 != 0) {
        iVar2 = 0xff00;
        if (*param_1 != 0x100) {
          iVar2 = *param_1;
        }
        iVar1 = 0xff00;
        if (iVar3 != 0x100) {
          iVar1 = iVar3;
        }
        if (iVar1 < iVar2) goto LAB_009c154c;
      }
      if (iVar5 != 0) {
        iVar3 = 0xff00;
        if (*param_1 != 0x100) {
          iVar3 = *param_1;
        }
        iVar2 = 0xff00;
        if (iVar5 != 0x100) {
          iVar2 = iVar5;
        }
        if (iVar3 < iVar2) goto LAB_009c154c;
      }
    }
    if (param_2 == uVar11) {
      return uVar13;
    }
    uVar11 = uVar11 + 1;
  }
LAB_009c154c:
  uVar19 = uVar19 + 1;
  if (uVar16 <= uVar19) goto LAB_009c1558;
  goto LAB_009c139c;
}

