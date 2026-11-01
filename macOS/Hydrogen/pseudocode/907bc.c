
undefined8 FUN_000907bc(undefined8 param_1,undefined8 *param_2)

{
  undefined8 *puVar1;
  long lVar2;
  long lVar3;
  undefined8 uVar4;
  undefined8 *puVar5;
  undefined8 *puVar6;
  ulong uVar7;
  ulong uVar8;
  ulong uVar9;
  undefined8 *puVar10;
  undefined8 *puVar11;
  undefined8 *puVar12;
  undefined8 unaff_x20;
  long lVar13;
  long lVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  
  *param_2 = &UNK_009ba370;
  param_2[4] = 0;
  param_2[5] = param_1;
  param_2[6] = 0x42c8000042c80000;
  param_2[7] = 0;
  *(undefined1 *)(param_2 + 8) = 0;
  func_0x006e3d18();
  func_0x006e4a40();
  func_0x006e1c18();
  func_0x00092830(0xa339e0);
  puVar10 = puRam0000000000a334a8;
  puVar5 = puRam0000000000a334a0;
  if (puRam0000000000a334a8 < puRam0000000000a334b0) {
    *puRam0000000000a334a8 = unaff_x20;
    puRam0000000000a334a8 = puRam0000000000a334a8 + 1;
    return 1;
  }
  lVar14 = (long)puRam0000000000a334a8 - (long)puRam0000000000a334a0;
  lVar13 = lVar14 >> 3;
  uVar7 = lVar13 + 1;
  if (uVar7 >> 0x3d != 0) {
    func_0x00017f90(0xa334a0);
LAB_00090a60:
    func_0x00017514();
    uVar4 = func_0x006e644c(puVar10,"Invalid drawing type");
    puVar5 = (undefined8 *)func_0x006e33ec(uVar4,1);
                    /* WARNING: Could not recover jumptable at 0x00090aa0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    uVar4 = (**(code **)*puVar5)(puVar5,uVar4);
    return uVar4;
  }
  uVar8 = (long)puRam0000000000a334b0 - (long)puRam0000000000a334a0 >> 2;
  if (uVar8 <= uVar7) {
    uVar8 = uVar7;
  }
  if (0x7ffffffffffffff7 < (ulong)((long)puRam0000000000a334b0 - (long)puRam0000000000a334a0)) {
    uVar8 = 0x1fffffffffffffff;
  }
  if (uVar8 == 0) {
    lVar3 = 0;
    puVar6 = (undefined8 *)(lVar13 * 8);
    puRam0000000000a334b0 = (undefined8 *)0x0;
    *puVar6 = unaff_x20;
  }
  else {
    if (uVar8 >> 0x3d != 0) goto LAB_00090a60;
    lVar3 = __Znwm(uVar8 << 3);
    puVar6 = (undefined8 *)(lVar3 + lVar13 * 8);
    puRam0000000000a334b0 = (undefined8 *)(lVar3 + uVar8 * 8);
    *puVar6 = unaff_x20;
  }
  lVar2 = (long)puVar10 - (long)puVar5;
  puVar1 = puVar6 + 1;
  if (lVar2 == 0) goto LAB_00090a1c;
  uVar7 = lVar2 - 8;
  puVar12 = puVar10;
  if ((uVar7 < 0x58) || ((ulong)((long)puVar10 - (lVar14 + lVar3)) < 0x40)) {
code_r0x00090a08:
    do {
      puVar12 = puVar12 + -1;
      puVar6 = puVar6 + -1;
      *puVar6 = *puVar12;
    } while (puVar12 != puVar5);
  }
  else {
    uVar7 = (uVar7 >> 3) + 1;
    uVar9 = uVar7 & 0x3ffffffffffffff8;
    puVar12 = puVar10 + -uVar9;
    puVar6 = puVar6 + -uVar9;
    puVar10 = puVar10 + -4;
    puVar11 = (undefined8 *)(lVar3 + lVar13 * 8 + -0x20);
    uVar8 = uVar9;
    do {
      uVar16 = *puVar10;
      uVar15 = puVar10[3];
      uVar4 = puVar10[2];
      uVar20 = puVar10[-3];
      uVar19 = puVar10[-4];
      uVar18 = puVar10[-1];
      uVar17 = puVar10[-2];
      puVar11[1] = puVar10[1];
      *puVar11 = uVar16;
      puVar11[3] = uVar15;
      puVar11[2] = uVar4;
      puVar11[-3] = uVar20;
      puVar11[-4] = uVar19;
      puVar11[-1] = uVar18;
      puVar11[-2] = uVar17;
      puVar10 = puVar10 + -8;
      puVar11 = puVar11 + -8;
      uVar8 = uVar8 - 8;
    } while (uVar8 != 0);
    if (uVar7 != uVar9) goto code_r0x00090a08;
  }
  puVar10 = puRam0000000000a334a0;
LAB_00090a1c:
  puRam0000000000a334a0 = puVar6;
  if (puVar10 != (undefined8 *)0x0) {
    puRam0000000000a334a8 = puVar1;
    __ZdlPv(puVar10);
  }
  puRam0000000000a334a8 = puVar1;
  return 1;
}

