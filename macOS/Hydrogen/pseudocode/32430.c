
void FUN_00032430(long param_1)

{
  byte bVar1;
  ulong uVar2;
  undefined8 *puVar3;
  undefined8 *puVar4;
  long in_x9;
  undefined1 *puVar5;
  ulong uVar6;
  undefined8 *puVar7;
  ulong uVar8;
  undefined8 *unaff_x19;
  long unaff_x20;
  undefined1 *unaff_x21;
  undefined1 *unaff_x22;
  ulong unaff_x24;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uStack0000000000000008;
  
  if (in_x9 != 0x17) {
    param_1 = in_x9;
  }
  uStack0000000000000008 = (undefined8 *)__Znwm(param_1 + 1U);
  uVar2 = param_1 + 1U | 0x8000000000000000;
  if (unaff_x22 == unaff_x21) {
    puVar4 = uStack0000000000000008;
  }
  else {
    if ((unaff_x24 < 0x40) || ((ulong)((long)uStack0000000000000008 - (long)unaff_x22) < 0x40)) {
      puVar3 = uStack0000000000000008;
    }
    else {
      uVar6 = unaff_x24 & 0xffffffffffffffc0;
      puVar4 = (undefined8 *)((long)uStack0000000000000008 + uVar6);
      puVar3 = uStack0000000000000008 + 4;
      puVar7 = (undefined8 *)(unaff_x22 + 0x20);
      uVar8 = uVar6;
      do {
        uVar9 = puVar7[-4];
        uVar11 = puVar7[-1];
        uVar10 = puVar7[-2];
        uVar13 = puVar7[1];
        uVar12 = *puVar7;
        uVar15 = puVar7[3];
        uVar14 = puVar7[2];
        puVar3[-3] = puVar7[-3];
        puVar3[-4] = uVar9;
        puVar3[-1] = uVar11;
        puVar3[-2] = uVar10;
        puVar3[1] = uVar13;
        *puVar3 = uVar12;
        puVar3[3] = uVar15;
        puVar3[2] = uVar14;
        uVar8 = uVar8 - 0x40;
        puVar3 = puVar3 + 8;
        puVar7 = puVar7 + 8;
      } while (uVar8 != 0);
      puVar3 = puVar4;
      unaff_x22 = unaff_x22 + uVar6;
      if (unaff_x24 == uVar6) goto LAB_00032478;
    }
    do {
      puVar5 = unaff_x22 + 1;
      puVar4 = (undefined8 *)((long)puVar3 + 1);
      *(undefined1 *)puVar3 = *unaff_x22;
      puVar3 = puVar4;
      unaff_x22 = puVar5;
    } while (puVar5 != unaff_x21);
  }
LAB_00032478:
  *(undefined1 *)puVar4 = 0;
  puVar3 = uStack0000000000000008;
  if (-1 < (long)uVar2) {
    unaff_x24 = uVar2 >> 0x38;
    puVar3 = &uStack0000000000000008;
  }
  (**(code **)(**(long **)(unaff_x20 + 0x10) + 0x20))
            (*(long **)(unaff_x20 + 0x10),puVar3,(undefined1 *)((long)puVar3 + unaff_x24));
  bVar1 = *(byte *)((long)unaff_x19 + 0x17);
  uVar8 = unaff_x19[1];
  if (-1 < (char)bVar1) {
    uVar8 = (ulong)bVar1;
  }
  if (uVar8 != 1) {
    if (uVar8 == 0xc) {
      puVar3 = (undefined8 *)*unaff_x19;
      if (-1 < (char)bVar1) {
        puVar3 = unaff_x19;
      }
      *(undefined1 *)((long)puVar3 + 0xb) = *(undefined1 *)((long)puVar3 + 3);
    }
    else if ((char)bVar1 < '\0') {
      *(undefined1 *)*unaff_x19 = 0;
      unaff_x19[1] = 0;
    }
    else {
      *(undefined1 *)unaff_x19 = 0;
      *(undefined1 *)((long)unaff_x19 + 0x17) = 0;
    }
  }
  if ((long)uVar2 < 0) {
    __ZdlPv(uStack0000000000000008);
    return;
  }
  return;
}

