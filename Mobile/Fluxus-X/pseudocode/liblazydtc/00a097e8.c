/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a097e8
 */

ulong bn_sub_part_words(ulong *param_1,ulong *param_2,ulong *param_3,int param_4,int param_5)

{
  bool bVar1;
  long lVar2;
  ulong uVar3;
  ulong *puVar4;
  ulong uVar5;
  
  uVar3 = bn_sub_words(param_1,param_2,param_3,param_4);
  if (param_5 != 0) {
    puVar4 = param_1 + param_4;
    if (param_5 < 0) {
      lVar2 = param_3[param_4] + uVar3;
      if (param_3[param_4] != 0) {
        uVar3 = 1;
      }
      *puVar4 = -lVar2;
      if (param_5 != -1) {
        param_5 = param_5 + -4;
        param_1 = param_1 + (long)param_4 + 2;
        puVar4 = param_3 + param_4;
        do {
          lVar2 = puVar4[1] + uVar3;
          if (puVar4[1] != 0) {
            uVar3 = 1;
          }
          param_1[-1] = -lVar2;
          if (param_5 == -6) {
            return uVar3;
          }
          lVar2 = puVar4[2] + uVar3;
          if (puVar4[2] != 0) {
            uVar3 = 1;
          }
          *param_1 = -lVar2;
          if (-4 < param_5 + 4) {
            return uVar3;
          }
          lVar2 = puVar4[3] + uVar3;
          if (puVar4[3] != 0) {
            uVar3 = 1;
          }
          param_1[1] = -lVar2;
          if (param_5 == -8) {
            return uVar3;
          }
          uVar5 = puVar4[4];
          param_5 = param_5 + 4;
          lVar2 = uVar5 + uVar3;
          if (uVar5 != 0) {
            uVar3 = 1;
          }
          param_1[2] = -lVar2;
          param_1 = param_1 + 4;
          puVar4 = puVar4 + 4;
        } while (param_5 < -5);
      }
    }
    else {
      param_2 = param_2 + param_4;
      if (uVar3 != 0) {
        do {
          uVar5 = *param_2 - uVar3;
          if (*param_2 != 0) {
            uVar3 = 0;
          }
          *puVar4 = uVar5;
          if (param_5 < 2) {
            param_5 = param_5 + -1;
            goto joined_r0x00a09988;
          }
          uVar5 = param_2[1] - uVar3;
          if (param_2[1] != 0) {
            uVar3 = 0;
          }
          puVar4[1] = uVar5;
          if (param_5 == 2) {
            return uVar3;
          }
          uVar5 = param_2[2] - uVar3;
          if (param_2[2] != 0) {
            uVar3 = 0;
          }
          puVar4[2] = uVar5;
          if (param_5 < 4) {
            return uVar3;
          }
          uVar5 = uVar3;
          if (param_2[3] != 0) {
            uVar5 = 0;
          }
          param_5 = param_5 + -4;
          puVar4[3] = param_2[3] - uVar3;
          if (param_5 == 0) {
            return uVar5;
          }
          param_2 = param_2 + 4;
          puVar4 = puVar4 + 4;
        } while (uVar5 != 0);
        uVar3 = 0;
joined_r0x00a09988:
        if (param_5 < 1) {
          return uVar3;
        }
      }
      *puVar4 = *param_2;
      if (param_5 != 1) {
        puVar4 = puVar4 + 2;
        while( true ) {
          puVar4[-1] = param_2[1];
          if (param_5 == 2) break;
          *puVar4 = param_2[2];
          if (param_5 < 4) {
            return uVar3;
          }
          puVar4[1] = param_2[3];
          if (param_5 + -4 == 0) {
            return uVar3;
          }
          puVar4[2] = param_2[4];
          puVar4 = puVar4 + 4;
          bVar1 = param_5 < 6;
          param_5 = param_5 + -4;
          param_2 = param_2 + 4;
          if (bVar1) {
            return uVar3;
          }
        }
      }
    }
  }
  return uVar3;
}

