/* 7ff70c91f630 Catch_All@7ff70c91f630 */

void Catch_All_7ff70c91f630(undefined8 param_1,longlong param_2)

{
  longlong lVar1;
  longlong lVar2;
  undefined4 uVar3;
  undefined4 uVar4;
  undefined4 uVar5;
  undefined4 uVar6;
  undefined4 uVar7;
  undefined4 uVar8;
  undefined4 uVar9;
  undefined8 uVar10;
  undefined8 *puVar11;
  undefined8 *puVar12;
  undefined8 *puVar13;
  
  lVar1 = *(longlong *)(param_2 + 0x28);
  *(undefined8 *)(param_2 + 0x38) = *(undefined8 *)(param_2 + 0x78);
  *(undefined8 *)(param_2 + 0x40) = *(undefined8 *)(param_2 + 0x60);
  *(undefined8 **)(param_2 + 0x48) = *(undefined8 **)(param_2 + 0x70);
  lVar2 = *(longlong *)(param_2 + 0x58);
  puVar12 = *(undefined8 **)(lVar2 + 8);
  if (*(undefined8 **)(param_2 + 0x70) != puVar12) {
    puVar13 = *(undefined8 **)(param_2 + 0x78);
    do {
      uVar10 = (puVar13 + lVar1 * 6)[1];
      *puVar13 = puVar13[lVar1 * 6];
      puVar13[1] = uVar10;
      puVar11 = puVar13 + lVar1 * 6 + 2;
      uVar3 = *(undefined4 *)puVar11;
      uVar4 = *(undefined4 *)((longlong)puVar11 + 4);
      uVar5 = *(undefined4 *)(puVar11 + 1);
      uVar6 = *(undefined4 *)((longlong)puVar11 + 0xc);
      puVar11 = puVar13 + lVar1 * 6 + 4;
      uVar7 = *(undefined4 *)((longlong)puVar11 + 4);
      uVar8 = *(undefined4 *)(puVar11 + 1);
      uVar9 = *(undefined4 *)((longlong)puVar11 + 0xc);
      *(undefined4 *)(puVar13 + 4) = *(undefined4 *)puVar11;
      *(undefined4 *)((longlong)puVar13 + 0x24) = uVar7;
      *(undefined4 *)(puVar13 + 5) = uVar8;
      *(undefined4 *)((longlong)puVar13 + 0x2c) = uVar9;
      *(undefined4 *)(puVar13 + 2) = uVar3;
      *(undefined4 *)((longlong)puVar13 + 0x14) = uVar4;
      *(undefined4 *)(puVar13 + 3) = uVar5;
      *(undefined4 *)((longlong)puVar13 + 0x1c) = uVar6;
      puVar13[lVar1 * 6 + 4] = 0;
      puVar13[lVar1 * 6 + 5] = 0xf;
      *(undefined1 *)(puVar13 + lVar1 * 6 + 2) = 0;
      puVar11 = puVar13 + lVar1 * 6 + 6;
      puVar13 = puVar13 + 6;
    } while (puVar11 != puVar12);
    puVar12 = *(undefined8 **)(lVar2 + 8);
  }
  *(undefined8 *)(param_2 + 0x30) = 0;
  func_0x7ff70c91e2c0(*(undefined8 *)(param_2 + 0x70),puVar12,lVar2);
  *(undefined8 *)(lVar2 + 8) = *(undefined8 *)(param_2 + 0x60);
                    /* WARNING: Subroutine does not return */
  FUN_7ff70cb12a50(0,0);
}


