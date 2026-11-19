/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a45158
 */

void FUN_00a45158(undefined1 *param_1,int *param_2)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  uint uVar5;
  uint uVar6;
  uint uVar7;
  int iVar8;
  int iVar9;
  int iVar10;
  int iVar11;
  int iVar12;
  int iVar13;
  int iVar14;
  int iVar15;
  
  iVar8 = param_2[8];
  iVar11 = param_2[9];
  iVar12 = param_2[3];
  iVar9 = param_2[4];
  iVar13 = param_2[5];
  iVar10 = param_2[6];
  iVar14 = param_2[7];
  iVar15 = *param_2 +
           (iVar11 + (iVar8 + (iVar14 + (iVar10 + (iVar13 + (iVar9 + (iVar12 + (param_2[2] +
                                                                                (param_2[1] +
                                                                                 (*param_2 +
                                                                                  (iVar11 * 0x13 +
                                                                                   0x1000000 >> 0x19
                                                                                  ) >> 0x1a) >> 0x19
                                                                                ) >> 0x1a) >> 0x19)
                                                            >> 0x1a) >> 0x19) >> 0x1a) >> 0x19) >>
                     0x1a) >> 0x19) * 0x13;
  uVar1 = param_2[1] + (iVar15 >> 0x1a);
  uVar2 = param_2[2] + ((int)uVar1 >> 0x19);
  *param_1 = (char)iVar15;
  uVar3 = iVar12 + ((int)uVar2 >> 0x1a);
  param_1[1] = (char)((uint)iVar15 >> 8);
  param_1[2] = (char)((uint)iVar15 >> 0x10);
  uVar4 = iVar9 + ((int)uVar3 >> 0x19);
  param_1[3] = (byte)((uint)iVar15 >> 0x18) & 3 | (byte)((uVar1 & 0x1ffffff) << 2);
  iVar13 = iVar13 + ((int)uVar4 >> 0x1a);
  param_1[4] = (char)(uVar1 >> 6);
  param_1[5] = (char)(uVar1 >> 0xe);
  param_1[6] = (byte)(uVar1 >> 0x16) & 7 | (byte)((uVar2 & 0x3ffffff) << 3);
  param_1[10] = (char)(uVar3 >> 3);
  uVar1 = iVar10 + (iVar13 >> 0x19);
  param_1[7] = (char)(uVar2 >> 5);
  param_1[0xd] = (char)(uVar4 >> 2);
  param_1[0xe] = (char)(uVar4 >> 10);
  uVar5 = iVar14 + ((int)uVar1 >> 0x1a);
  param_1[9] = (byte)(uVar2 >> 0x15) & 0x1f | (byte)((uVar3 & 0x1ffffff) << 5);
  param_1[0x10] = (char)iVar13;
  param_1[0x11] = (char)((uint)iVar13 >> 8);
  param_1[0x12] = (char)((uint)iVar13 >> 0x10);
  uVar6 = iVar8 + ((int)uVar5 >> 0x19);
  param_1[0xc] = (byte)(uVar3 >> 0x13) & 0x3f | (char)uVar4 * '@';
  param_1[0x14] = (char)(uVar1 >> 7);
  param_1[0x15] = (char)(uVar1 >> 0xf);
  uVar7 = iVar11 + ((int)uVar6 >> 0x1a);
  param_1[0x13] = (byte)((uint)iVar13 >> 0x18) & 1 | (byte)((uVar1 & 0x3ffffff) << 1);
  param_1[0x17] = (char)(uVar5 >> 5);
  param_1[0x18] = (char)(uVar5 >> 0xd);
  param_1[0x16] = (byte)(uVar1 >> 0x17) & 7 | (byte)((uVar5 & 0x1ffffff) << 3);
  param_1[0x1a] = (char)(uVar6 >> 4);
  param_1[8] = (char)(uVar2 >> 0xd);
  param_1[0xb] = (char)(uVar3 >> 0xb);
  param_1[0xf] = (char)(uVar4 >> 0x12);
  param_1[0x1b] = (char)(uVar6 >> 0xc);
  param_1[0x19] = (byte)(uVar5 >> 0x15) & 0xf | (byte)((uVar6 & 0x3ffffff) << 4);
  param_1[0x1d] = (char)(uVar7 >> 2);
  param_1[0x1e] = (char)(uVar7 >> 10);
  param_1[0x1c] = (byte)(uVar6 >> 0x14) & 0x3f | (byte)((uVar7 & 0x1ffffff) << 6);
  param_1[0x1f] = (byte)(uVar7 >> 0x12) & 0x7f;
  return;
}

