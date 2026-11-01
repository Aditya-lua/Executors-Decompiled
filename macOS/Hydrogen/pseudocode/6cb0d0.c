
void FUN_006cb0d0(ulong param_1,long param_2)

{
  ulong uVar1;
  long *plVar2;
  long lVar3;
  undefined8 *in_x9;
  undefined8 *in_x10;
  ulong in_x11;
  undefined8 uVar4;
  long in_x12;
  ulong uVar5;
  undefined8 *puVar6;
  undefined8 *puVar7;
  ulong uVar8;
  ulong *unaff_x19;
  ulong unaff_x20;
  undefined8 *unaff_x21;
  undefined8 *puVar9;
  long *plVar10;
  long unaff_x22;
  long unaff_x23;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  
  if ((in_x9 <= (undefined8 *)((long)unaff_x21 + (-8 - in_x12))) ||
     (puVar9 = unaff_x21, unaff_x21 <= (undefined8 *)((unaff_x23 - in_x12) + param_2 + -8))) {
    uVar1 = (in_x11 >> 3) + 1;
    uVar5 = uVar1 & 0x3ffffffffffffff8;
    in_x9 = in_x9 + -uVar5;
    puVar9 = unaff_x21 + -uVar5;
    puVar6 = (undefined8 *)(param_2 + unaff_x22 * 8 + -0x20);
    puVar7 = unaff_x21 + -4;
    uVar8 = uVar5;
    do {
      uVar13 = puVar7[1];
      uVar12 = *puVar7;
      uVar11 = puVar7[3];
      uVar4 = puVar7[2];
      uVar17 = puVar7[-3];
      uVar16 = puVar7[-4];
      uVar15 = puVar7[-1];
      uVar14 = puVar7[-2];
      puVar7[1] = 0;
      *puVar7 = 0;
      puVar7[3] = 0;
      puVar7[2] = 0;
      puVar6[1] = uVar13;
      *puVar6 = uVar12;
      puVar6[3] = uVar11;
      puVar6[2] = uVar4;
      puVar6[-3] = uVar17;
      puVar6[-4] = uVar16;
      puVar6[-1] = uVar15;
      puVar6[-2] = uVar14;
      puVar6 = puVar6 + -8;
      puVar7[-3] = 0;
      puVar7[-4] = 0;
      puVar7[-1] = 0;
      puVar7[-2] = 0;
      puVar7 = puVar7 + -8;
      uVar8 = uVar8 - 8;
    } while (uVar8 != 0);
    if (uVar1 == uVar5) goto LAB_006cb168;
  }
  do {
    puVar9 = puVar9 + -1;
    uVar4 = *puVar9;
    *puVar9 = 0;
    in_x9 = in_x9 + -1;
    *in_x9 = uVar4;
  } while (puVar9 != in_x10);
LAB_006cb168:
  plVar2 = (long *)*unaff_x19;
  plVar10 = (long *)unaff_x19[1];
  *unaff_x19 = (ulong)in_x9;
  unaff_x19[1] = unaff_x20;
  unaff_x19[2] = param_1;
  if (plVar10 != plVar2) {
    do {
      plVar10 = plVar10 + -1;
      lVar3 = *plVar10;
      *plVar10 = 0;
      if (lVar3 != 0) {
        __ZdaPv();
      }
    } while (plVar10 != plVar2);
    plVar10 = plVar2;
  }
  if (plVar10 != (long *)0x0) {
    __ZdlPv(plVar10);
  }
  return;
}

