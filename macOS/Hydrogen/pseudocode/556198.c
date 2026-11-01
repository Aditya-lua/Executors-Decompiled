
void FUN_00556198(long *param_1,undefined8 *param_2)

{
  long lVar1;
  undefined8 *puVar2;
  undefined8 uVar3;
  long lVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  
  lVar4 = param_2[3];
  lVar1 = param_1[2];
  if ((ulong)(*param_1 - lVar1) < (ulong)(lVar4 != 0x21)) {
    func_0x007abb04();
    lVar1 = param_1[2];
  }
  if (lVar4 != 0x21) {
    puVar2 = (undefined8 *)(param_1[1] + lVar1 * 0x108);
    uVar3 = param_2[2];
    uVar5 = *param_2;
    puVar2[1] = param_2[1];
    *puVar2 = uVar5;
    puVar2[2] = uVar3;
    puVar2[3] = lVar4;
    uVar7 = param_2[7];
    uVar6 = param_2[6];
    uVar5 = param_2[9];
    uVar3 = param_2[8];
    uVar8 = param_2[4];
    puVar2[5] = param_2[5];
    puVar2[4] = uVar8;
    puVar2[7] = uVar7;
    puVar2[6] = uVar6;
    puVar2[9] = uVar5;
    puVar2[8] = uVar3;
    uVar3 = param_2[0xe];
    uVar6 = param_2[0x11];
    uVar5 = param_2[0x10];
    uVar10 = param_2[0xb];
    uVar9 = param_2[10];
    uVar8 = param_2[0xd];
    uVar7 = param_2[0xc];
    puVar2[0xf] = param_2[0xf];
    puVar2[0xe] = uVar3;
    puVar2[0x11] = uVar6;
    puVar2[0x10] = uVar5;
    puVar2[0xb] = uVar10;
    puVar2[10] = uVar9;
    puVar2[0xd] = uVar8;
    puVar2[0xc] = uVar7;
    uVar3 = param_2[0x16];
    uVar6 = param_2[0x19];
    uVar5 = param_2[0x18];
    uVar10 = param_2[0x13];
    uVar9 = param_2[0x12];
    uVar8 = param_2[0x15];
    uVar7 = param_2[0x14];
    puVar2[0x17] = param_2[0x17];
    puVar2[0x16] = uVar3;
    puVar2[0x19] = uVar6;
    puVar2[0x18] = uVar5;
    puVar2[0x13] = uVar10;
    puVar2[0x12] = uVar9;
    puVar2[0x15] = uVar8;
    puVar2[0x14] = uVar7;
    uVar7 = param_2[0x1d];
    uVar6 = param_2[0x1c];
    uVar5 = param_2[0x1f];
    uVar3 = param_2[0x1e];
    uVar9 = param_2[0x1b];
    uVar8 = param_2[0x1a];
    puVar2[0x20] = param_2[0x20];
    puVar2[0x1d] = uVar7;
    puVar2[0x1c] = uVar6;
    puVar2[0x1f] = uVar5;
    puVar2[0x1e] = uVar3;
    puVar2[0x1b] = uVar9;
    puVar2[0x1a] = uVar8;
    lVar1 = lVar1 + 1;
  }
  param_1[2] = lVar1;
  return;
}

