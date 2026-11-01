
undefined8 FUN_0057e840(void)

{
  long lVar1;
  long lVar2;
  long lVar3;
  undefined8 *puVar4;
  long lVar5;
  undefined8 *puVar6;
  undefined8 *puVar7;
  undefined8 uVar8;
  long lVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  undefined8 uVar24;
  undefined8 uVar25;
  undefined8 uVar26;
  undefined8 uVar27;
  undefined8 uVar28;
  undefined8 uVar29;
  undefined8 uVar30;
  undefined8 uVar31;
  undefined8 uVar32;
  undefined8 uVar33;
  undefined8 uVar34;
  undefined8 uVar35;
  undefined8 uVar36;
  undefined8 uVar37;
  undefined8 uVar38;
  undefined8 uVar39;
  undefined1 auVar40 [16];
  
  auVar40 = __Unwind_Resume();
  lVar3 = auVar40._8_8_;
  lVar1 = *(long *)(auVar40._0_8_ + 0x10);
  lVar2 = *(long *)(auVar40._0_8_ + 0x18);
  if (*(long *)(lVar1 + 0x10) != lVar2) {
    lVar5 = *(long *)(lVar1 + 8);
    puVar4 = (undefined8 *)(lVar5 + *(long *)(lVar1 + 0x10) * 0x108);
    puVar6 = *(undefined8 **)(lVar3 + 0x18);
    puVar7 = *(undefined8 **)(lVar3 + 8);
    do {
      if (puVar7 == puVar6) {
        return 0;
      }
      *(undefined8 **)(lVar3 + 8) = puVar7 + 0x21;
      lVar9 = puVar7[3];
      if (lVar9 == 0x21) {
        return 0;
      }
      uVar14 = puVar7[0x1b];
      uVar11 = puVar7[0x1a];
      uVar20 = puVar7[0x1d];
      uVar16 = puVar7[0x1c];
      uVar30 = puVar7[0x1f];
      uVar24 = puVar7[0x1e];
      uVar10 = puVar7[0x20];
      uVar21 = puVar7[0x13];
      uVar17 = puVar7[0x12];
      uVar31 = puVar7[0x15];
      uVar25 = puVar7[0x14];
      uVar38 = puVar7[0x17];
      uVar36 = puVar7[0x16];
      uVar32 = puVar7[0x19];
      uVar26 = puVar7[0x18];
      uVar15 = puVar7[0xb];
      uVar12 = puVar7[10];
      uVar33 = puVar7[0xd];
      uVar27 = puVar7[0xc];
      uVar39 = puVar7[0xf];
      uVar37 = puVar7[0xe];
      uVar34 = puVar7[0x11];
      uVar28 = puVar7[0x10];
      uVar22 = puVar7[5];
      uVar18 = puVar7[4];
      uVar35 = puVar7[7];
      uVar29 = puVar7[6];
      uVar23 = puVar7[9];
      uVar19 = puVar7[8];
      uVar13 = *puVar7;
      uVar8 = puVar7[2];
      puVar4[1] = puVar7[1];
      *puVar4 = uVar13;
      puVar4[2] = uVar8;
      puVar4[3] = lVar9;
      puVar4[0x1d] = uVar20;
      puVar4[0x1c] = uVar16;
      puVar4[0x1f] = uVar30;
      puVar4[0x1e] = uVar24;
      puVar4[0x20] = uVar10;
      puVar4[0x15] = uVar31;
      puVar4[0x14] = uVar25;
      puVar4[0x17] = uVar38;
      puVar4[0x16] = uVar36;
      puVar4[0x19] = uVar32;
      puVar4[0x18] = uVar26;
      puVar4[0x1b] = uVar14;
      puVar4[0x1a] = uVar11;
      puVar4[0xd] = uVar33;
      puVar4[0xc] = uVar27;
      puVar4[0xf] = uVar39;
      puVar4[0xe] = uVar37;
      puVar4[0x11] = uVar34;
      puVar4[0x10] = uVar28;
      puVar4[0x13] = uVar21;
      puVar4[0x12] = uVar17;
      puVar4[5] = uVar22;
      puVar4[4] = uVar18;
      puVar4[7] = uVar35;
      puVar4[6] = uVar29;
      puVar4[9] = uVar23;
      puVar4[8] = uVar19;
      puVar4[0xb] = uVar15;
      puVar4[10] = uVar12;
      puVar4 = puVar4 + 0x21;
      *(long *)(lVar1 + 0x10) = *(long *)(lVar1 + 0x10) + 1;
      puVar7 = puVar7 + 0x21;
    } while (puVar4 != (undefined8 *)(lVar5 + lVar2 * 0x108));
  }
  return 1;
}

