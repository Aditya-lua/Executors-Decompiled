
ulong FUN_006b2b84(ulong param_1)

{
  undefined4 *puVar1;
  ulong uVar2;
  long lVar3;
  ulong in_x9;
  undefined4 *puVar4;
  ulong in_x10;
  ulong uVar5;
  ulong uVar6;
  undefined8 *puVar7;
  undefined8 *puVar8;
  ulong uVar9;
  long unaff_x19;
  undefined4 *unaff_x20;
  undefined4 unaff_w21;
  undefined4 *unaff_x22;
  long unaff_x24;
  long unaff_x25;
  long unaff_x26;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uStack_40;
  undefined8 uStack_38;
  undefined5 uStack_30;
  undefined2 uStack_2b;
  char cStack_29;
  undefined4 uStack_28;
  undefined1 uStack_24;
  
  if (in_x10 <= param_1) {
    in_x9 = 0x3fffffffffffffff;
  }
  if (in_x9 == 0) {
    uVar2 = 0;
    puVar4 = (undefined4 *)(unaff_x25 * 4);
    lVar3 = 0;
    *puVar4 = unaff_w21;
  }
  else {
    if (in_x9 >> 0x3e != 0) {
      lVar3 = func_0x00017514();
      uStack_40 = 0;
      uStack_38 = 0;
      uStack_28 = 0;
      uStack_24 = 0;
      uStack_30 = 0;
      uStack_2b = 0;
      cStack_29 = '\0';
      func_0x0002a730(&uStack_40);
      puVar7 = *(undefined8 **)(lVar3 + 0x228);
      if (puVar7 < *(undefined8 **)(lVar3 + 0x230)) {
        puVar7[2] = CONCAT17(cStack_29,CONCAT25(uStack_2b,uStack_30));
        puVar7[1] = uStack_38;
        *puVar7 = uStack_40;
        *(undefined1 *)((long)puVar7 + 0x1c) = uStack_24;
        *(undefined4 *)(puVar7 + 3) = uStack_28;
        puVar7 = puVar7 + 4;
        *(undefined8 **)(lVar3 + 0x228) = puVar7;
        lVar3 = *(long *)(lVar3 + 0x220);
      }
      else {
        puVar7 = (undefined8 *)func_0x006b7730(lVar3 + 0x220,&uStack_40);
        *(undefined8 **)(lVar3 + 0x228) = puVar7;
        lVar3 = *(long *)(lVar3 + 0x220);
        if (cStack_29 < '\0') {
          __ZdlPv(uStack_40);
        }
      }
      return (ulong)((int)((ulong)((long)puVar7 - lVar3) >> 5) - 1);
    }
    uVar2 = __Znwm(in_x9 << 2);
    puVar4 = (undefined4 *)(uVar2 + unaff_x25 * 4);
    lVar3 = uVar2 + in_x9 * 4;
    *puVar4 = unaff_w21;
  }
  puVar1 = puVar4 + 1;
  if (unaff_x24 - (long)unaff_x20 != 0) {
    uVar5 = (unaff_x24 - (long)unaff_x20) - 4;
    if ((0x3b < uVar5) && (0x3f < (unaff_x24 - uVar2) - unaff_x26)) {
      uVar5 = (uVar5 >> 2) + 1;
      uVar6 = uVar5 & 0x7ffffffffffffff0;
      unaff_x22 = (undefined4 *)(unaff_x24 + uVar6 * -4);
      puVar4 = puVar4 + -uVar6;
      puVar7 = (undefined8 *)(unaff_x24 + -0x20);
      puVar8 = (undefined8 *)(uVar2 + unaff_x25 * 4 + -0x20);
      uVar9 = uVar6;
      do {
        uVar12 = *puVar7;
        uVar11 = puVar7[3];
        uVar10 = puVar7[2];
        uVar16 = puVar7[-3];
        uVar15 = puVar7[-4];
        uVar14 = puVar7[-1];
        uVar13 = puVar7[-2];
        puVar8[1] = puVar7[1];
        *puVar8 = uVar12;
        puVar8[3] = uVar11;
        puVar8[2] = uVar10;
        puVar8[-3] = uVar16;
        puVar8[-4] = uVar15;
        puVar8[-1] = uVar14;
        puVar8[-2] = uVar13;
        puVar7 = puVar7 + -8;
        puVar8 = puVar8 + -8;
        uVar9 = uVar9 - 0x10;
      } while (uVar9 != 0);
      if (uVar5 == uVar6) goto LAB_006b2c58;
    }
    do {
      unaff_x22 = unaff_x22 + -1;
      puVar4 = puVar4 + -1;
      *puVar4 = *unaff_x22;
    } while (unaff_x22 != unaff_x20);
  }
LAB_006b2c58:
  *(undefined4 **)(unaff_x19 + 0x208) = puVar4;
  *(undefined4 **)(unaff_x19 + 0x210) = puVar1;
  *(long *)(unaff_x19 + 0x218) = lVar3;
  if (unaff_x20 != (undefined4 *)0x0) {
    uVar2 = __ZdlPv();
  }
  *(undefined4 **)(unaff_x19 + 0x210) = puVar1;
  return uVar2;
}

