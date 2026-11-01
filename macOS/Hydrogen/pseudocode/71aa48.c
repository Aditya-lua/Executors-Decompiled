
/* WARNING: Removing unreachable block (ram,0x0071ab1c) */
/* WARNING: Removing unreachable block (ram,0x0071ab64) */
/* WARNING: Removing unreachable block (ram,0x0071ab9c) */
/* WARNING: Removing unreachable block (ram,0x0071ab38) */
/* WARNING: Removing unreachable block (ram,0x0071aba0) */
/* WARNING: Removing unreachable block (ram,0x0071ab7c) */
/* WARNING: Removing unreachable block (ram,0x0071ab80) */
/* WARNING: Removing unreachable block (ram,0x0071ab4c) */
/* WARNING: Removing unreachable block (ram,0x0071aba8) */

void FUN_0071aa48(long param_1)

{
  undefined8 *puVar1;
  long *plVar2;
  long lVar3;
  long *plVar4;
  ulong in_x9;
  undefined8 *puVar5;
  undefined8 *puVar6;
  ulong in_x10;
  ulong uVar7;
  long unaff_x19;
  long *unaff_x20;
  long unaff_x21;
  undefined8 *unaff_x22;
  long unaff_x23;
  long unaff_x24;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  
  uVar7 = param_1 - unaff_x23 >> 4;
  if (uVar7 <= in_x9) {
    uVar7 = in_x9;
  }
  if (in_x10 <= (ulong)(param_1 - unaff_x23)) {
    uVar7 = 0x7ffffffffffffff;
  }
  if (uVar7 == 0) {
    lVar3 = 0;
  }
  else {
    if (uVar7 >> 0x3b != 0) {
      plVar4 = (long *)func_0x00017514();
      plVar2 = (long *)*plVar4;
      lVar3 = *plVar2 + plVar4[1] * 0x20;
      if (lVar3 != plVar2[1]) {
        plVar2[1] = lVar3;
      }
      return;
    }
    lVar3 = __Znwm(uVar7 << 5);
  }
  puVar6 = (undefined8 *)(lVar3 + unaff_x24 * 0x20);
  uVar8 = *unaff_x22;
  uVar10 = unaff_x22[3];
  uVar9 = unaff_x22[2];
  puVar6[1] = unaff_x22[1];
  *puVar6 = uVar8;
  puVar6[3] = uVar10;
  puVar6[2] = uVar9;
  puVar1 = puVar6 + 4;
  puVar5 = puVar6;
  if (unaff_x21 != unaff_x23) {
    do {
      uVar8 = *(undefined8 *)(unaff_x21 + -0x20);
      uVar10 = *(undefined8 *)(unaff_x21 + -8);
      uVar9 = *(undefined8 *)(unaff_x21 + -0x10);
      puVar6 = puVar5 + -4;
      puVar5[-3] = *(undefined8 *)(unaff_x21 + -0x18);
      *puVar6 = uVar8;
      puVar5[-1] = uVar10;
      puVar5[-2] = uVar9;
      unaff_x21 = unaff_x21 + -0x20;
      puVar5 = puVar6;
    } while (unaff_x21 != unaff_x23);
    unaff_x21 = *unaff_x20;
  }
  *unaff_x20 = (long)puVar6;
  unaff_x20[1] = (long)puVar1;
  unaff_x20[2] = lVar3 + uVar7 * 0x20;
  if (unaff_x21 != 0) {
    __ZdlPv(unaff_x21);
  }
  unaff_x20[1] = (long)puVar1;
  *(long *)(unaff_x19 + 0x10) = *(long *)(unaff_x19 + 0x10) + 1;
  return;
}

