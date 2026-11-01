
/* WARNING: Removing unreachable block (ram,0x00056294) */
/* WARNING: Removing unreachable block (ram,0x00056290) */
/* WARNING: Removing unreachable block (ram,0x000562a4) */

undefined8 * FUN_00056080(ulong param_1,undefined8 param_2,undefined8 *param_3)

{
  ulong uVar1;
  long lVar2;
  undefined1 uVar3;
  char cVar4;
  undefined8 *puVar5;
  undefined8 *puVar6;
  long in_x9;
  long lVar7;
  long lVar8;
  long in_x10;
  ulong uVar9;
  long lVar10;
  long *plVar11;
  long *plVar12;
  long lVar13;
  long lVar14;
  long *unaff_x19;
  long lVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined1 auVar18 [16];
  
  uVar1 = in_x10 * 0x4ec4ec4ec4ec4ec5 + 1;
  if (param_1 < uVar1) {
    func_0x00017f90();
LAB_000562ec:
    auVar18 = func_0x00017514();
    puVar5 = auVar18._8_8_;
    puVar6 = auVar18._0_8_;
    if (*(char *)((long)puVar5 + 0x17) < '\0') {
      func_0x00017634(puVar6,*puVar5,puVar5[1]);
      cVar4 = *(char *)((long)puVar5 + 0x2f);
    }
    else {
      uVar17 = puVar5[1];
      uVar16 = *puVar5;
      puVar6[2] = puVar5[2];
      puVar6[1] = uVar17;
      *puVar6 = uVar16;
      cVar4 = *(char *)((long)puVar5 + 0x2f);
    }
    if (cVar4 < '\0') {
      func_0x00017634(puVar6 + 3,puVar5[3],puVar5[4]);
    }
    else {
      uVar17 = puVar5[4];
      uVar16 = puVar5[3];
      puVar6[5] = puVar5[5];
      puVar6[4] = uVar17;
      puVar6[3] = uVar16;
    }
    if (*(char *)((long)puVar5 + 0x47) < '\0') {
      func_0x00017634(puVar6 + 6,puVar5[6],puVar5[7]);
    }
    else {
      uVar17 = puVar5[7];
      uVar16 = puVar5[6];
      puVar6[8] = puVar5[8];
      puVar6[7] = uVar17;
      puVar6[6] = uVar16;
    }
    puVar6[10] = 0;
    puVar6[9] = puVar6 + 10;
    puVar6[0xb] = 0;
    func_0x00056498(puVar6 + 9,puVar5[9],puVar5 + 10);
    puVar6[0xd] = 0;
    puVar6[0xc] = puVar6 + 0xd;
    puVar6[0xe] = 0;
    func_0x00056498(puVar6 + 0xc,puVar5[0xc],puVar5 + 0xd);
    return puVar6;
  }
  lVar7 = unaff_x19[2] - in_x9 >> 3;
  uVar9 = lVar7 * -0x6276276276276276;
  if (uVar9 <= uVar1) {
    uVar9 = uVar1;
  }
  if (0x13b13b13b13b13a < (ulong)(lVar7 * 0x4ec4ec4ec4ec4ec5)) {
    uVar9 = param_1;
  }
  if (uVar9 == 0) {
    lVar7 = 0;
  }
  else {
    if (param_1 < uVar9) goto LAB_000562ec;
    lVar7 = __Znwm(uVar9 * 0x68);
  }
  puVar6 = (undefined8 *)(lVar7 + in_x10 * 8);
  *puVar6 = *param_3;
  uVar16 = param_3[1];
  puVar6[2] = param_3[2];
  puVar6[1] = uVar16;
  param_3[1] = 0;
  param_3[2] = 0;
  uVar16 = param_3[3];
  uVar17 = param_3[4];
  param_3[3] = 0;
  puVar6[3] = uVar16;
  puVar6[4] = uVar17;
  uVar16 = param_3[5];
  puVar6[6] = param_3[6];
  puVar6[5] = uVar16;
  puVar6[7] = param_3[7];
  param_3[6] = 0;
  param_3[7] = 0;
  param_3[5] = 0;
  uVar3 = *(undefined1 *)(param_3 + 8);
  puVar6[9] = param_3[9];
  plVar11 = param_3 + 10;
  lVar2 = *plVar11;
  lVar8 = param_3[0xb];
  *(undefined1 *)(puVar6 + 8) = uVar3;
  plVar12 = puVar6 + 10;
  *plVar12 = lVar2;
  puVar6[0xb] = lVar8;
  if (lVar8 == 0) {
    puVar6[9] = plVar12;
  }
  else {
    *(long **)(lVar2 + 0x10) = plVar12;
    param_3[9] = plVar11;
    *plVar11 = 0;
    param_3[0xb] = 0;
  }
  lVar8 = lVar7 + uVar9 * 0x68;
  *(undefined8 *)(lVar7 + in_x10 * 8 + 0x60) = param_3[0xc];
  puVar5 = puVar6 + 0xd;
  lVar7 = *unaff_x19;
  lVar2 = unaff_x19[1];
  if (lVar2 == lVar7) {
    *unaff_x19 = (long)puVar6;
    unaff_x19[1] = (long)puVar5;
    unaff_x19[2] = lVar8;
  }
  else {
    lVar10 = 0;
    do {
      lVar15 = lVar2 + lVar10;
      *(undefined8 *)((long)puVar6 + lVar10 + -0x68) = *(undefined8 *)(lVar15 + -0x68);
      uVar17 = *(undefined8 *)(lVar15 + -0x58);
      uVar16 = *(undefined8 *)(lVar15 + -0x60);
      *(undefined8 *)((long)puVar6 + lVar10 + -0x50) = *(undefined8 *)(lVar15 + -0x50);
      *(undefined8 *)((long)puVar6 + lVar10 + -0x58) = uVar17;
      *(undefined8 *)((long)puVar6 + lVar10 + -0x60) = uVar16;
      *(undefined8 *)(lVar15 + -0x58) = 0;
      *(undefined8 *)(lVar15 + -0x50) = 0;
      *(undefined8 *)(lVar15 + -0x60) = 0;
      *(undefined8 *)((long)puVar6 + lVar10 + -0x48) = *(undefined8 *)(lVar15 + -0x48);
      uVar17 = *(undefined8 *)(lVar15 + -0x38);
      uVar16 = *(undefined8 *)(lVar15 + -0x40);
      *(undefined8 *)((long)puVar6 + lVar10 + -0x30) = *(undefined8 *)(lVar15 + -0x30);
      *(undefined8 *)((long)puVar6 + lVar10 + -0x38) = uVar17;
      *(undefined8 *)((long)puVar6 + lVar10 + -0x40) = uVar16;
      *(undefined8 *)(lVar15 + -0x38) = 0;
      *(undefined8 *)(lVar15 + -0x30) = 0;
      *(undefined8 *)(lVar15 + -0x40) = 0;
      *(undefined1 *)((long)puVar6 + lVar10 + -0x28) = *(undefined1 *)(lVar15 + -0x28);
      *(undefined8 *)((long)puVar6 + lVar10 + -0x20) = *(undefined8 *)(lVar15 + -0x20);
      plVar11 = (long *)(lVar15 + -0x18);
      lVar13 = *plVar11;
      plVar12 = (long *)((long)puVar6 + lVar10 + -0x18);
      *plVar12 = lVar13;
      lVar14 = *(long *)(lVar15 + -0x10);
      *(long *)((long)puVar6 + lVar10 + -0x10) = lVar14;
      if (lVar14 == 0) {
        *(long **)((long)puVar6 + lVar10 + -0x20) = plVar12;
      }
      else {
        *(long **)(lVar13 + 0x10) = plVar12;
        *(long **)(lVar15 + -0x20) = plVar11;
        *plVar11 = 0;
        *(undefined8 *)(lVar15 + -0x10) = 0;
      }
      *(undefined8 *)((long)puVar6 + lVar10 + -8) = *(undefined8 *)(lVar2 + lVar10 + -8);
      lVar10 = lVar10 + -0x68;
    } while (lVar2 + lVar10 != lVar7);
    lVar7 = *unaff_x19;
    lVar15 = unaff_x19[1];
    *unaff_x19 = (long)puVar6 + lVar10;
    unaff_x19[1] = (long)puVar5;
    unaff_x19[2] = lVar8;
    lVar2 = lVar15;
    for (; lVar15 != lVar7; lVar15 = lVar15 + -0x68) {
      func_0x00056a34(lVar15 + -0x20,*(undefined8 *)(lVar15 + -0x18));
      lVar2 = lVar7;
    }
  }
  if (lVar2 != 0) {
    __ZdlPv(lVar2);
  }
  return puVar5;
}

