
void FUN_006c1250(long param_1)

{
  code *pcVar1;
  long lVar2;
  undefined8 *puVar3;
  ulong uVar4;
  ulong uVar5;
  undefined8 *puVar6;
  undefined8 *puVar7;
  ulong uVar8;
  long unaff_x19;
  undefined8 *unaff_x20;
  undefined8 unaff_x21;
  long unaff_x22;
  undefined8 *unaff_x23;
  undefined8 *puVar9;
  long unaff_x24;
  undefined8 *puVar10;
  long unaff_x25;
  long unaff_x26;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  
  if (param_1 != 0) {
    func_0x00017514();
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x6c139c);
    (*pcVar1)();
  }
  lVar2 = __Znwm(unaff_x24 << 3);
  puVar3 = (undefined8 *)(lVar2 + unaff_x25 * 8);
  puVar10 = puVar3 + 1;
  *puVar3 = unaff_x21;
  if ((long)unaff_x23 - (long)unaff_x20 != 0) {
    uVar4 = ((long)unaff_x23 - (long)unaff_x20) - 8;
    puVar9 = unaff_x23;
    if ((0x57 < uVar4) && (0x3f < (ulong)((long)unaff_x23 + (-unaff_x26 - lVar2)))) {
      uVar4 = (uVar4 >> 3) + 1;
      uVar5 = uVar4 & 0x3ffffffffffffff8;
      puVar9 = unaff_x23 + -uVar5;
      puVar3 = puVar3 + -uVar5;
      puVar6 = unaff_x23 + -4;
      puVar7 = (undefined8 *)(lVar2 + unaff_x25 * 8 + -0x20);
      uVar8 = uVar5;
      do {
        uVar13 = *puVar6;
        uVar12 = puVar6[3];
        uVar11 = puVar6[2];
        uVar17 = puVar6[-3];
        uVar16 = puVar6[-4];
        uVar15 = puVar6[-1];
        uVar14 = puVar6[-2];
        puVar7[1] = puVar6[1];
        *puVar7 = uVar13;
        puVar7[3] = uVar12;
        puVar7[2] = uVar11;
        puVar7[-3] = uVar17;
        puVar7[-4] = uVar16;
        puVar7[-1] = uVar15;
        puVar7[-2] = uVar14;
        puVar6 = puVar6 + -8;
        puVar7 = puVar7 + -8;
        uVar8 = uVar8 - 8;
      } while (uVar8 != 0);
      if (uVar4 == uVar5) goto LAB_006c1314;
    }
    do {
      puVar9 = puVar9 + -1;
      puVar3 = puVar3 + -1;
      *puVar3 = *puVar9;
    } while (puVar9 != unaff_x20);
  }
LAB_006c1314:
  *(undefined8 **)(unaff_x22 + -0x18) = puVar3;
  *(undefined8 **)(unaff_x22 + -0x10) = puVar10;
  *(long *)(unaff_x22 + -8) = lVar2 + unaff_x24 * 8;
  if (unaff_x20 != (undefined8 *)0x0) {
    __ZdlPv();
  }
  *(undefined8 **)(unaff_x22 + -0x10) = puVar10;
  if (unaff_x19 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR___ZdlPv_009b01b8)();
  return;
}

