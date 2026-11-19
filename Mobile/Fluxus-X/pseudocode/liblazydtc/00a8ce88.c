/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a8ce88
 */

undefined8 ossl_aria_set_decrypt_key(undefined8 param_1,undefined8 param_2,uint *param_3)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  uint uVar5;
  uint uVar6;
  uint uVar7;
  uint uVar8;
  uint uVar9;
  uint uVar10;
  uint *puVar11;
  undefined8 uVar12;
  uint *puVar13;
  uint *puVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  
  uVar12 = ossl_aria_set_encrypt_key();
  if ((int)uVar12 == 0) {
    uVar16 = *(undefined8 *)(param_3 + 2);
    uVar15 = *(undefined8 *)param_3;
    puVar11 = param_3 + (ulong)param_3[0x44] * 4;
    uVar12 = *(undefined8 *)puVar11;
    *(undefined8 *)(param_3 + 2) = *(undefined8 *)(puVar11 + 2);
    *(undefined8 *)param_3 = uVar12;
    *(undefined8 *)(puVar11 + 2) = uVar16;
    *(undefined8 *)puVar11 = uVar15;
    while( true ) {
      puVar14 = param_3 + 4;
      puVar13 = puVar11 + -4;
      uVar2 = *puVar14;
      uVar5 = param_3[5];
      uVar3 = param_3[6];
      uVar6 = param_3[7];
      uVar9 = uVar2 >> 8 | uVar2 << 0x18;
      uVar2 = uVar9 ^ uVar2;
      uVar9 = uVar9 ^ (uVar2 >> 0x10 | uVar2 << 0x10);
      uVar2 = uVar5 >> 8 | uVar5 << 0x18;
      uVar5 = uVar2 ^ uVar5;
      uVar10 = uVar3 >> 8 | uVar3 << 0x18;
      uVar3 = uVar10 ^ uVar3;
      uVar10 = uVar10 ^ (uVar3 >> 0x10 | uVar3 << 0x10);
      uVar3 = uVar6 >> 8 | uVar6 << 0x18;
      uVar6 = uVar3 ^ uVar6;
      uVar3 = uVar3 ^ (uVar6 >> 0x10 | uVar6 << 0x10);
      uVar2 = uVar2 ^ (uVar5 >> 0x10 | uVar5 << 0x10) ^ uVar10;
      uVar10 = uVar3 ^ uVar10;
      uVar5 = uVar2 ^ uVar9;
      uVar9 = uVar10 ^ uVar9;
      uVar3 = uVar3 ^ uVar2;
      uVar10 = uVar10 ^ uVar5;
      uVar10 = uVar10 >> 0x10 | uVar10 << 0x10;
      uVar2 = (uVar3 & 0xff00ff00) >> 8 | (uVar3 & 0xff00ff) << 8;
      uVar6 = uVar2 >> 0x10 | uVar2 << 0x10;
      uVar3 = ((uVar9 & 0xff00ff) << 8 | uVar9 >> 8 & 0xff00ff) ^ uVar10;
      uVar10 = uVar10 ^ uVar6;
      uVar2 = uVar3 ^ uVar5;
      uVar3 = uVar3 ^ uVar6;
      uVar6 = uVar2 ^ uVar10;
      uVar10 = uVar10 ^ uVar5;
      if (puVar13 <= puVar14) break;
      uVar5 = *puVar13;
      uVar9 = puVar11[-3];
      uVar1 = puVar11[-2];
      uVar4 = puVar11[-1];
      uVar7 = uVar5 >> 8 | uVar5 << 0x18;
      uVar5 = uVar7 ^ uVar5;
      uVar7 = uVar7 ^ (uVar5 >> 0x10 | uVar5 << 0x10);
      uVar5 = uVar9 >> 8 | uVar9 << 0x18;
      uVar9 = uVar5 ^ uVar9;
      uVar8 = uVar1 >> 8 | uVar1 << 0x18;
      uVar1 = uVar8 ^ uVar1;
      uVar8 = uVar8 ^ (uVar1 >> 0x10 | uVar1 << 0x10);
      uVar1 = uVar4 >> 8 | uVar4 << 0x18;
      uVar4 = uVar1 ^ uVar4;
      uVar1 = uVar1 ^ (uVar4 >> 0x10 | uVar4 << 0x10);
      uVar5 = uVar5 ^ (uVar9 >> 0x10 | uVar9 << 0x10) ^ uVar8;
      uVar8 = uVar1 ^ uVar8;
      uVar9 = uVar5 ^ uVar7;
      uVar7 = uVar8 ^ uVar7;
      uVar1 = uVar1 ^ uVar5;
      uVar8 = uVar8 ^ uVar9;
      uVar4 = uVar8 >> 0x10 | uVar8 << 0x10;
      uVar5 = (uVar1 & 0xff00ff00) >> 8 | (uVar1 & 0xff00ff) << 8;
      uVar8 = uVar5 >> 0x10 | uVar5 << 0x10;
      uVar5 = ((uVar7 & 0xff00ff) << 8 | uVar7 >> 8 & 0xff00ff) ^ uVar4;
      uVar4 = uVar4 ^ uVar8;
      uVar1 = uVar5 ^ uVar9;
      *puVar14 = uVar1;
      param_3[5] = uVar4 ^ uVar9;
      param_3[6] = uVar1 ^ uVar4;
      param_3[7] = uVar5 ^ uVar8;
      *puVar13 = uVar2;
      puVar11[-3] = uVar10;
      puVar11[-2] = uVar6;
      puVar11[-1] = uVar3;
      puVar11 = puVar13;
      param_3 = puVar14;
    }
    uVar12 = 0;
    *puVar13 = uVar2;
    puVar11[-3] = uVar10;
    puVar11[-2] = uVar6;
    puVar11[-1] = uVar3;
  }
  return uVar12;
}

