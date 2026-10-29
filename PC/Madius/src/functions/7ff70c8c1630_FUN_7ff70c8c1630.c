/* 7ff70c8c1630 FUN_7ff70c8c1630 */

undefined8 * FUN_7ff70c8c1630(undefined8 *param_1,undefined8 *param_2)

{
  ulonglong uVar1;
  longlong lVar2;
  undefined4 uVar3;
  undefined4 uVar4;
  undefined4 uVar5;
  undefined4 uVar6;
  undefined4 uVar7;
  undefined4 uVar8;
  undefined4 uVar9;
  undefined4 uVar10;
  undefined4 uVar11;
  undefined4 uVar12;
  undefined4 uVar13;
  undefined4 uVar14;
  undefined8 uVar15;
  undefined8 *puVar16;
  undefined8 uVar17;
  
  uVar17 = 0xfffffffffffffffe;
  uVar15 = param_2[1];
  uVar3 = *(undefined4 *)(param_2 + 2);
  uVar4 = *(undefined4 *)((longlong)param_2 + 0x14);
  uVar5 = *(undefined4 *)(param_2 + 3);
  uVar6 = *(undefined4 *)((longlong)param_2 + 0x1c);
  uVar7 = *(undefined4 *)(param_2 + 4);
  uVar8 = *(undefined4 *)((longlong)param_2 + 0x24);
  uVar9 = *(undefined4 *)(param_2 + 5);
  uVar10 = *(undefined4 *)((longlong)param_2 + 0x2c);
  uVar11 = *(undefined4 *)(param_2 + 6);
  uVar12 = *(undefined4 *)((longlong)param_2 + 0x34);
  uVar13 = *(undefined4 *)(param_2 + 7);
  uVar14 = *(undefined4 *)((longlong)param_2 + 0x3c);
  *param_1 = *param_2;
  param_1[1] = uVar15;
  uVar15 = param_2[0xb];
  param_1[10] = param_2[10];
  param_1[0xb] = uVar15;
  uVar15 = param_2[9];
  param_1[8] = param_2[8];
  param_1[9] = uVar15;
  *(undefined4 *)(param_1 + 6) = uVar11;
  *(undefined4 *)((longlong)param_1 + 0x34) = uVar12;
  *(undefined4 *)(param_1 + 7) = uVar13;
  *(undefined4 *)((longlong)param_1 + 0x3c) = uVar14;
  *(undefined4 *)(param_1 + 4) = uVar7;
  *(undefined4 *)((longlong)param_1 + 0x24) = uVar8;
  *(undefined4 *)(param_1 + 5) = uVar9;
  *(undefined4 *)((longlong)param_1 + 0x2c) = uVar10;
  *(undefined4 *)(param_1 + 2) = uVar3;
  *(undefined4 *)((longlong)param_1 + 0x14) = uVar4;
  *(undefined4 *)(param_1 + 3) = uVar5;
  *(undefined4 *)((longlong)param_1 + 0x1c) = uVar6;
  puVar16 = param_1 + 0xc;
  param_1[0xc] = 0;
  param_1[0xd] = 0;
  param_1[0xe] = 0;
  param_1[0xf] = 0xf;
  uVar1 = param_1[1];
  if (uVar1 < 0x10) {
    param_1[0xe] = uVar1;
    FUN_7ff70cb12b70(puVar16,*param_1,uVar1);
    *(undefined1 *)((longlong)param_1 + uVar1 + 0x60) = 0;
  }
  else {
    FUN_7ff70ca00b60(puVar16,uVar1,uVar7,*param_1,uVar1,puVar16,0xfffffffffffffffe);
  }
  uVar1 = param_1[0xb];
  lVar2 = param_1[0xe];
  if ((ulonglong)(param_1[0xf] - lVar2) < uVar1) {
    FUN_7ff70ca00b60(param_1 + 0xc,uVar1,uVar1,param_1[10],uVar1,puVar16,uVar17);
    uVar1 = param_1[0xf];
  }
  else {
    param_1[0xe] = lVar2 + uVar1;
    puVar16 = param_1 + 0xc;
    if (0xf < (ulonglong)param_1[0xf]) {
      puVar16 = (undefined8 *)param_1[0xc];
    }
    FUN_7ff70cb12b70(lVar2 + (longlong)puVar16,param_1[10]);
    *(undefined1 *)((longlong)puVar16 + lVar2 + uVar1) = 0;
    uVar1 = param_1[0xf];
  }
  puVar16 = param_1 + 0xc;
  if (0xf < uVar1) {
    puVar16 = (undefined8 *)param_1[0xc];
  }
  *param_1 = puVar16;
  param_1[10] = (longlong)puVar16 + param_1[1];
  return param_1;
}


