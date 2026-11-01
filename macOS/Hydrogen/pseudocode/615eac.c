
void FUN_00615eac(long param_1)

{
  undefined4 *puVar1;
  bool in_ZR;
  bool in_CY;
  long lVar2;
  ulong uVar3;
  ulong uVar4;
  ulong uVar5;
  undefined8 *puVar6;
  undefined8 *puVar7;
  ulong uVar8;
  long *unaff_x19;
  undefined8 *unaff_x20;
  undefined8 *puVar9;
  undefined4 *puVar10;
  long unaff_x23;
  long unaff_x26;
  long lVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  
  if (!in_CY || in_ZR) {
    if (unaff_x23 != 0) {
      _bzero();
      unaff_x20 = (undefined8 *)(unaff_x26 + unaff_x23 * 4);
    }
    unaff_x19[1] = (long)unaff_x20;
    return;
  }
  puVar9 = (undefined8 *)*unaff_x19;
  lVar11 = unaff_x26 - (long)puVar9 >> 2;
  uVar3 = lVar11 + unaff_x23;
  if (uVar3 >> 0x3e != 0) {
    func_0x00017f90();
LAB_00616018:
    puVar9 = (undefined8 *)func_0x00017514();
    *puVar9 = &UNK_009f7578;
    func_0x00698f0c(puVar9[1]);
    goto __ZdlPv;
  }
  uVar5 = param_1 - (long)puVar9 >> 1;
  if (uVar5 <= uVar3) {
    uVar5 = uVar3;
  }
  if (0x7ffffffffffffffb < (ulong)(param_1 - (long)puVar9)) {
    uVar5 = 0x3fffffffffffffff;
  }
  if (uVar5 == 0) {
    lVar2 = 0;
  }
  else {
    if (uVar5 >> 0x3e != 0) goto LAB_00616018;
    lVar2 = __Znwm(uVar5 << 2);
  }
  puVar10 = (undefined4 *)(lVar2 + lVar11 * 4);
  _bzero(puVar10,unaff_x23 * 4);
  puVar1 = puVar10 + unaff_x23;
  if (unaff_x26 - (long)puVar9 != 0) {
    uVar3 = (unaff_x26 - (long)puVar9) - 4;
    if ((0x3b < uVar3) && (0x3f < (ulong)((unaff_x26 - lVar2) - (unaff_x26 - (long)puVar9)))) {
      uVar3 = (uVar3 >> 2) + 1;
      uVar4 = uVar3 & 0x7ffffffffffffff0;
      unaff_x20 = (undefined8 *)(unaff_x26 + uVar4 * -4);
      puVar10 = puVar10 + -uVar4;
      puVar6 = (undefined8 *)(unaff_x26 + -0x20);
      puVar7 = (undefined8 *)(lVar2 + lVar11 * 4 + -0x20);
      uVar8 = uVar4;
      do {
        uVar14 = *puVar6;
        uVar13 = puVar6[3];
        uVar12 = puVar6[2];
        uVar18 = puVar6[-3];
        uVar17 = puVar6[-4];
        uVar16 = puVar6[-1];
        uVar15 = puVar6[-2];
        puVar7[1] = puVar6[1];
        *puVar7 = uVar14;
        puVar7[3] = uVar13;
        puVar7[2] = uVar12;
        puVar7[-3] = uVar18;
        puVar7[-4] = uVar17;
        puVar7[-1] = uVar16;
        puVar7[-2] = uVar15;
        puVar6 = puVar6 + -8;
        puVar7 = puVar7 + -8;
        uVar8 = uVar8 - 0x10;
      } while (uVar8 != 0);
      if (uVar3 == uVar4) goto LAB_00615fc8;
    }
    do {
      unaff_x20 = (undefined8 *)((long)unaff_x20 + -4);
      puVar10 = puVar10 + -1;
      *puVar10 = *(undefined4 *)unaff_x20;
    } while (unaff_x20 != puVar9);
  }
LAB_00615fc8:
  *unaff_x19 = (long)puVar10;
  unaff_x19[1] = (long)puVar1;
  unaff_x19[2] = lVar2 + uVar5 * 4;
  if (puVar9 == (undefined8 *)0x0) {
    return;
  }
__ZdlPv:
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR___ZdlPv_009b01b8)(puVar9);
  return;
}

