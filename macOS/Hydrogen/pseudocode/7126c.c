
undefined8 * FUN_0007126c(void)

{
  long *plVar1;
  undefined8 *puVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  long lVar6;
  long lVar7;
  undefined8 uVar8;
  long *plVar9;
  long *plVar10;
  long lVar11;
  long *unaff_x19;
  long *unaff_x20;
  undefined8 *unaff_x22;
  undefined8 *puVar12;
  long unaff_x24;
  long unaff_x25;
  long lVar13;
  long lVar14;
  
  lVar7 = __Znwm();
  puVar12 = (undefined8 *)(lVar7 + unaff_x25 * 0x28);
  uVar8 = *unaff_x22;
  *unaff_x22 = 0;
  *puVar12 = uVar8;
  plVar9 = unaff_x20 + 3;
  plVar10 = (long *)*plVar9;
  if (plVar10 == (long *)0x0) {
    plVar9 = (long *)(lVar7 + unaff_x25 * 0x28 + 0x20);
  }
  else {
    plVar1 = (long *)(lVar7 + unaff_x25 * 0x28 + 0x20);
    if (plVar10 == unaff_x20) {
      *plVar1 = (long)(puVar12 + 1);
      (**(code **)(*unaff_x20 + 0x18))();
      goto code_r0x000712e4;
    }
    *plVar1 = (long)plVar10;
  }
  *plVar9 = 0;
code_r0x000712e4:
  lVar7 = lVar7 + unaff_x24 * 0x28;
  puVar2 = puVar12 + 5;
  lVar5 = *unaff_x19;
  lVar6 = unaff_x19[1];
  if (lVar6 == lVar5) {
    *unaff_x19 = (long)puVar12;
    unaff_x19[1] = (long)puVar2;
    unaff_x19[2] = lVar7;
  }
  else {
    lVar13 = 0;
    lVar14 = lVar6;
    do {
      lVar3 = (long)puVar12 + lVar13;
      lVar4 = lVar6 + lVar13;
      uVar8 = *(undefined8 *)(lVar4 + -0x28);
      *(undefined8 *)(lVar4 + -0x28) = 0;
      *(undefined8 *)(lVar3 + -0x28) = uVar8;
      lVar11 = *(long *)(lVar4 + -8);
      if (lVar11 == 0) {
code_r0x00071308:
        *(undefined8 *)(lVar3 + -8) = 0;
      }
      else {
        if (lVar4 + -0x20 != lVar11) {
          *(long *)(lVar3 + -8) = lVar11;
          lVar3 = lVar14;
          goto code_r0x00071308;
        }
        *(long *)(lVar3 + -8) = lVar3 + -0x20;
        (**(code **)(**(long **)(lVar4 + -8) + 0x18))();
      }
      lVar14 = lVar14 + -0x28;
      lVar13 = lVar13 + -0x28;
    } while (lVar6 + lVar13 != lVar5);
    lVar5 = *unaff_x19;
    lVar14 = unaff_x19[1];
    *unaff_x19 = (long)puVar12 + lVar13;
    unaff_x19[1] = (long)puVar2;
    unaff_x19[2] = lVar7;
    lVar6 = lVar14;
    for (; lVar14 != lVar5; lVar14 = lVar14 + -0x28) {
      plVar9 = (long *)(lVar14 + -0x20);
      plVar10 = *(long **)(lVar14 + -8);
      if (plVar9 == plVar10) {
        lVar7 = 4;
code_r0x000713bc:
        (**(code **)(*plVar9 + lVar7 * 8))();
      }
      else if (plVar10 != (long *)0x0) {
        lVar7 = 5;
        plVar9 = plVar10;
        goto code_r0x000713bc;
      }
      plVar9 = *(long **)(lVar14 + -0x28);
      *(undefined8 *)(lVar14 + -0x28) = 0;
      if (plVar9 != (long *)0x0) {
        (**(code **)(*plVar9 + 8))();
      }
      lVar6 = lVar5;
    }
  }
  if (lVar6 != 0) {
    __ZdlPv(lVar6);
  }
  return puVar2;
}

