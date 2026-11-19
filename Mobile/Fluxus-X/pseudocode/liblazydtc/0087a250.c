/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0087a250
 */

undefined8 * FUN_0087a250(long *param_1,undefined8 *param_2)

{
  byte *pbVar1;
  undefined8 *puVar2;
  ulong *puVar3;
  ulong *puVar4;
  undefined4 uVar5;
  undefined1 uVar6;
  void *pvVar7;
  undefined8 uVar8;
  ulong *puVar9;
  ulong uVar10;
  ulong *puVar11;
  ulong uVar12;
  long lVar13;
  ulong *puVar14;
  undefined8 uVar15;
  ulong uVar16;
  undefined8 uVar17;
  
  lVar13 = param_1[1] - *param_1;
  uVar16 = (lVar13 >> 5) + 1;
  if (uVar16 >> 0x3b == 0) {
    uVar10 = param_1[2] - *param_1;
    uVar12 = (long)uVar10 >> 4;
    if (uVar12 <= uVar16) {
      uVar12 = uVar16;
    }
    if (0x7fffffffffffffdf < uVar10) {
      uVar12 = 0x7ffffffffffffff;
    }
    if (uVar12 >> 0x3b == 0) {
      pvVar7 = operator_new(uVar12 * 0x20);
      uVar17 = param_2[1];
      uVar15 = *param_2;
      uVar8 = param_2[2];
      puVar2 = (undefined8 *)((long)pvVar7 + lVar13);
      *param_2 = 0;
      param_2[1] = 0;
      uVar6 = *(undefined1 *)((long)param_2 + 0x1c);
      param_2[2] = 0;
      puVar14 = (ulong *)*param_1;
      puVar4 = (ulong *)param_1[1];
      puVar2[2] = uVar8;
      uVar5 = *(undefined4 *)(param_2 + 3);
      *(undefined1 *)((long)puVar2 + 0x1c) = uVar6;
      puVar2[1] = uVar17;
      *puVar2 = uVar15;
      *(undefined4 *)(puVar2 + 3) = uVar5;
      puVar3 = (ulong *)((long)puVar2 + ((long)puVar14 - (long)puVar4));
      if ((long)puVar14 - (long)puVar4 != 0) {
        puVar9 = puVar14;
        puVar11 = puVar3;
        do {
          uVar10 = puVar9[1];
          uVar16 = *puVar9;
          puVar11[2] = puVar9[2];
          puVar11[1] = uVar10;
          *puVar11 = uVar16;
          pbVar1 = (byte *)((long)puVar9 + 0x1c);
          uVar16 = puVar9[3];
          puVar9[1] = 0;
          puVar9[2] = 0;
          *puVar9 = 0;
          puVar9 = puVar9 + 4;
          *(byte *)((long)puVar11 + 0x1c) = *pbVar1;
          *(int *)(puVar11 + 3) = (int)uVar16;
          puVar11 = puVar11 + 4;
        } while (puVar9 != puVar4);
        do {
          if ((*puVar14 & 1) != 0) {
            operator_delete((void *)puVar14[2],*puVar14 & 0xfffffffffffffffe);
          }
          puVar14 = puVar14 + 4;
        } while (puVar14 != puVar4);
        puVar14 = (ulong *)*param_1;
      }
      lVar13 = param_1[2];
      *param_1 = (long)puVar3;
      param_1[1] = (long)(puVar2 + 4);
      param_1[2] = (long)((long)pvVar7 + uVar12 * 0x20);
      if (puVar14 != (ulong *)0x0) {
        operator_delete(puVar14,lVar13 - (long)puVar14);
      }
      return puVar2 + 4;
    }
  }
  else {
    FUN_0087a3ac();
  }
                    /* WARNING: Subroutine does not return */
  FUN_007fe1b8();
}

