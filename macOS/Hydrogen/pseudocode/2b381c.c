
undefined8 FUN_002b381c(long param_1,long param_2,long param_3)

{
  byte bVar1;
  uint uVar2;
  long *plVar3;
  undefined8 uVar4;
  uint in_w9;
  ulong uVar5;
  ulong uVar6;
  long lVar7;
  ulong uVar8;
  uint uVar9;
  undefined1 *puVar10;
  undefined8 *puVar11;
  undefined1 *puVar12;
  undefined8 *puVar13;
  uint *unaff_x19;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  
  if ((in_w9 >> 2 & 1) != 0) {
    uVar2 = (**(code **)(param_1 + 0x28))(param_2,param_3,0,0);
    if ((int)uVar2 < 0) {
      return 0;
    }
    *unaff_x19 = uVar2;
    return 1;
  }
  if ((*(byte *)(param_2 + 0x21) >> 3 & 1) != 0) {
    if (*(int *)(param_2 + 100) == 0) {
      return 1;
    }
    func_0x0028f83c(0x1e,0,0x6a,"/aws-lc/crypto/fipsmodule/cipher/cipher.c",0x1fe);
    return 0;
  }
  uVar2 = *(uint *)(param_1 + 4);
  if (uVar2 < 2) {
    return 1;
  }
  if ((*(int *)(param_2 + 100) != 0) || (*(int *)(param_2 + 0x6c) == 0)) {
    func_0x0028f83c(0x1e,0,0x7b,"/aws-lc/crypto/fipsmodule/cipher/cipher.c",0x207);
    return 0;
  }
  if (0x20 < uVar2) {
    plVar3 = (long *)func_0x0079e370();
    if (plVar3 == (long *)0x0) {
      func_0x0028f83c(0xe,0,0x43,"/aws-lc/crypto/fipsmodule/cipher/cipher.c",0x22c);
      return 0;
    }
    if (*plVar3 == 0) {
      func_0x0028f83c(0xe,0,0x43,"/aws-lc/crypto/fipsmodule/cipher/cipher.c",0x22d);
      return 0;
    }
                    /* WARNING: Could not recover jumptable at 0x002b3a90. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    uVar4 = (**(code **)(*plVar3 + 0x28))();
    return uVar4;
  }
  uVar5 = (ulong)(uVar2 - 1);
  bVar1 = *(byte *)(param_2 + uVar5 + 0x70);
  uVar9 = (uint)bVar1;
  if (bVar1 == 0 || uVar2 < bVar1) {
    func_0x0028f83c(0x1e,0,0x65,"/aws-lc/crypto/fipsmodule/cipher/cipher.c",0x210);
    return 0;
  }
  do {
    if ((uint)*(byte *)(param_2 + uVar5 + 0x70) != (uint)bVar1) {
      func_0x0028f83c(0x1e,0,0x65,"/aws-lc/crypto/fipsmodule/cipher/cipher.c",0x216);
      return 0;
    }
    uVar5 = (ulong)((int)uVar5 - 1);
    uVar9 = uVar9 - 1;
  } while (uVar9 != 0);
  uVar2 = uVar2 - bVar1;
  uVar5 = (ulong)uVar2;
  if ((int)uVar2 < 1) goto LAB_002b39b0;
  if ((uVar2 < 8) || ((param_3 - param_2) - 0x70U < 0x40)) {
    uVar6 = 0;
  }
  else {
    if (uVar2 < 0x40) {
      uVar8 = 0;
    }
    else {
      uVar6 = uVar5 & 0xffffffc0;
      puVar11 = (undefined8 *)(param_2 + 0xa0);
      puVar13 = (undefined8 *)(param_3 + 0x20);
      uVar8 = uVar6;
      do {
        uVar4 = puVar11[-6];
        uVar15 = puVar11[-3];
        uVar14 = puVar11[-4];
        uVar17 = puVar11[-1];
        uVar16 = puVar11[-2];
        uVar19 = puVar11[1];
        uVar18 = *puVar11;
        puVar13[-3] = puVar11[-5];
        puVar13[-4] = uVar4;
        puVar13[-1] = uVar15;
        puVar13[-2] = uVar14;
        puVar13[1] = uVar17;
        *puVar13 = uVar16;
        puVar13[3] = uVar19;
        puVar13[2] = uVar18;
        puVar11 = puVar11 + 8;
        uVar8 = uVar8 - 0x40;
        puVar13 = puVar13 + 8;
      } while (uVar8 != 0);
      if (uVar6 == uVar5) goto LAB_002b39b0;
      uVar8 = uVar6;
      if ((uVar2 & 0x38) == 0) goto LAB_002b3990;
    }
    uVar6 = uVar5 & 0xfffffff8;
    lVar7 = uVar8 - uVar6;
    puVar11 = (undefined8 *)(uVar8 + param_2 + 0x70);
    puVar13 = (undefined8 *)(param_3 + uVar8);
    do {
      *puVar13 = *puVar11;
      lVar7 = lVar7 + 8;
      puVar11 = puVar11 + 1;
      puVar13 = puVar13 + 1;
    } while (lVar7 != 0);
    if (uVar6 == uVar5) goto LAB_002b39b0;
  }
LAB_002b3990:
  lVar7 = uVar5 - uVar6;
  puVar10 = (undefined1 *)(param_3 + uVar6);
  puVar12 = (undefined1 *)(uVar6 + param_2 + 0x70);
  do {
    *puVar10 = *puVar12;
    lVar7 = lVar7 + -1;
    puVar10 = puVar10 + 1;
    puVar12 = puVar12 + 1;
  } while (lVar7 != 0);
LAB_002b39b0:
  *unaff_x19 = uVar2;
  return 1;
}

