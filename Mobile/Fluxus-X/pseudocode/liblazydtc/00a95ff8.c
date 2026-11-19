/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a95ff8
 */

void IDEA_cbc_encrypt(byte *param_1,undefined1 *param_2,ulong param_3,undefined8 param_4,
                     byte *param_5,int param_6)

{
  long lVar1;
  ulong uVar2;
  ulong uVar3;
  byte *pbVar4;
  undefined1 *puVar5;
  ulong uVar6;
  long lVar7;
  ulong uVar8;
  ulong uVar9;
  ulong local_70;
  ulong local_68;
  
  local_70 = (ulong)*param_5 << 0x18 | (ulong)param_5[1] << 0x10 | (ulong)param_5[2] << 8 |
             (ulong)param_5[3];
  local_68 = (ulong)param_5[4] << 0x18 | (ulong)param_5[5] << 0x10 | (ulong)param_5[6] << 8 |
             (ulong)param_5[7];
  uVar8 = local_68;
  if (param_6 == 0) {
    uVar2 = local_70;
    if (7 < (long)param_3) {
      uVar8 = 0xfffffffffffffff0;
      if (-0x10 < (long)~param_3) {
        uVar8 = ~param_3;
      }
      uVar3 = uVar8 + param_3 + 8 & 0xfffffffffffffff8;
      lVar1 = uVar3 + 8;
      pbVar4 = param_1 + lVar1;
      lVar7 = param_3 + 8;
      puVar5 = param_2;
      uVar6 = local_68;
      uVar9 = local_70;
      do {
        uVar2 = (ulong)*param_1 << 0x18 | (ulong)param_1[1] << 0x10 | (ulong)param_1[2] << 8 |
                (ulong)param_1[3];
        uVar8 = (ulong)param_1[4] << 0x18 | (ulong)param_1[5] << 0x10 | (ulong)param_1[6] << 8 |
                (ulong)param_1[7];
        local_70 = uVar2;
        local_68 = uVar8;
        IDEA_encrypt(&local_70,param_4);
        lVar7 = lVar7 + -8;
        param_1 = param_1 + 8;
        local_70 = local_70 ^ uVar9;
        local_68 = local_68 ^ uVar6;
        *puVar5 = (char)(local_70 >> 0x18);
        puVar5[3] = (char)local_70;
        puVar5[1] = (char)(local_70 >> 0x10);
        puVar5[2] = (char)(local_70 >> 8);
        puVar5[7] = (char)local_68;
        puVar5[4] = (char)(local_68 >> 0x18);
        puVar5[5] = (char)(local_68 >> 0x10);
        puVar5[6] = (char)(local_68 >> 8);
        puVar5 = puVar5 + 8;
        uVar6 = uVar8;
        uVar9 = uVar2;
      } while (0xf < lVar7);
      param_3 = (param_3 - 8) - uVar3;
      param_2 = param_2 + lVar1;
      param_1 = pbVar4;
    }
    uVar6 = uVar2;
    if (param_3 != 0) {
      uVar6 = (ulong)*param_1 << 0x18 | (ulong)param_1[1] << 0x10 | (ulong)param_1[2] << 8 |
              (ulong)param_1[3];
      uVar9 = (ulong)param_1[4] << 0x18 | (ulong)param_1[5] << 0x10 | (ulong)param_1[6] << 8 |
              (ulong)param_1[7];
      local_70 = uVar6;
      local_68 = uVar9;
      IDEA_encrypt(&local_70,param_4);
      if (param_3 - 1 < 7) {
        local_70 = local_70 ^ uVar2;
        local_68 = local_68 ^ uVar8;
        param_2 = param_2 + param_3;
        switch(param_3) {
        case 7:
          param_2 = param_2 + -1;
          *param_2 = (char)(local_68 >> 8);
        case 6:
          param_2 = param_2 + -1;
          *param_2 = (char)(local_68 >> 0x10);
        case 5:
          param_2 = param_2 + -1;
          *param_2 = (char)(local_68 >> 0x18);
        case 4:
          param_2 = param_2 + -1;
          *param_2 = (char)local_70;
        case 3:
          param_2 = param_2 + -1;
          *param_2 = (char)(local_70 >> 8);
        case 2:
          param_2 = param_2 + -1;
          *param_2 = (char)(local_70 >> 0x10);
        case 1:
          param_2[-1] = (char)(local_70 >> 0x18);
        }
      }
      goto LAB_00a963f4;
    }
  }
  else {
    pbVar4 = param_1;
    if (7 < (long)param_3) {
      uVar8 = 0xfffffffffffffff0;
      if (-0x10 < (long)~param_3) {
        uVar8 = ~param_3;
      }
      uVar8 = uVar8 + param_3 + 8 & 0xfffffffffffffff8;
      lVar1 = uVar8 + 8;
      pbVar4 = param_1 + lVar1;
      lVar7 = param_3 + 8;
      puVar5 = param_2;
      do {
        local_70 = ((ulong)*param_1 << 0x18 | (ulong)param_1[1] << 0x10 | (ulong)param_1[2] << 8 |
                   (ulong)param_1[3]) ^ local_70;
        local_68 = ((ulong)param_1[4] << 0x18 | (ulong)param_1[5] << 0x10 | (ulong)param_1[6] << 8 |
                   (ulong)param_1[7]) ^ local_68;
        IDEA_encrypt(&local_70,param_4);
        lVar7 = lVar7 + -8;
        param_1 = param_1 + 8;
        *puVar5 = (char)(local_70 >> 0x18);
        puVar5[3] = (char)local_70;
        puVar5[1] = (char)(local_70 >> 0x10);
        puVar5[2] = (char)(local_70 >> 8);
        puVar5[4] = (char)(local_68 >> 0x18);
        puVar5[5] = (char)(local_68 >> 0x10);
        puVar5[7] = (char)local_68;
        puVar5[6] = (char)(local_68 >> 8);
        puVar5 = puVar5 + 8;
      } while (0xf < lVar7);
      param_2 = param_2 + lVar1;
      param_3 = (param_3 - 8) - uVar8;
      uVar8 = local_68;
    }
    uVar6 = local_70;
    if (param_3 != 0) {
      uVar2 = 0;
      if (param_3 - 1 < 7) {
        pbVar4 = pbVar4 + param_3;
        local_68 = 0;
        uVar6 = uVar2;
        switch(param_3) {
        case 7:
          pbVar4 = pbVar4 + -1;
          uVar2 = (ulong)*pbVar4 << 8;
        case 6:
          pbVar4 = pbVar4 + -1;
          uVar2 = uVar2 | (ulong)*pbVar4 << 0x10;
        case 5:
          pbVar4 = pbVar4 + -1;
          uVar6 = uVar2 | (ulong)*pbVar4 << 0x18;
        case 4:
          pbVar4 = pbVar4 + -1;
          uVar2 = (ulong)*pbVar4;
          local_68 = uVar6;
        case 3:
          pbVar4 = pbVar4 + -1;
          uVar2 = uVar2 | (ulong)*pbVar4 << 8;
        case 2:
          pbVar4 = pbVar4 + -1;
          uVar2 = uVar2 | (ulong)*pbVar4 << 0x10;
        case 1:
          uVar2 = uVar2 | (ulong)pbVar4[-1] << 0x18;
        }
      }
      else {
        local_68 = 0;
      }
      local_70 = uVar2 ^ local_70;
      local_68 = local_68 ^ uVar8;
      IDEA_encrypt(&local_70,param_4);
      *param_2 = (char)(local_70 >> 0x18);
      param_2[2] = (char)(local_70 >> 8);
      param_2[4] = (char)(local_68 >> 0x18);
      param_2[5] = (char)(local_68 >> 0x10);
      param_2[3] = (char)local_70;
      param_2[1] = (char)(local_70 >> 0x10);
      param_2[6] = (char)(local_68 >> 8);
      param_2[7] = (char)local_68;
      uVar6 = local_70;
      uVar9 = local_68;
      goto LAB_00a963f4;
    }
  }
  uVar9 = uVar8;
LAB_00a963f4:
  param_5[3] = (byte)uVar6;
  *param_5 = (byte)(uVar6 >> 0x18);
  param_5[1] = (byte)(uVar6 >> 0x10);
  param_5[2] = (byte)(uVar6 >> 8);
  param_5[4] = (byte)(uVar9 >> 0x18);
  param_5[5] = (byte)(uVar9 >> 0x10);
  param_5[6] = (byte)(uVar9 >> 8);
  param_5[7] = (byte)uVar9;
  return;
}

