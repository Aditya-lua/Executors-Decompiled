/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009bb060
 */

undefined8 FUN_009bb060(char *param_1,int param_2,uint *param_3)

{
  uint uVar1;
  int iVar2;
  ulong *puVar3;
  long lVar4;
  uint uVar5;
  ulong *puVar6;
  ulong uVar7;
  ulong uVar8;
  uint uVar9;
  
  if (param_1 == (char *)0x0) {
    return 0;
  }
  if (param_2 == -1) {
    param_2 = -1;
    uVar8 = *(ulong *)(param_3 + 0x28);
  }
  else {
    if (*param_1 == '-') {
      uVar5 = 0;
      param_1 = param_1 + 1;
      param_2 = param_2 + -1;
      uVar8 = *(ulong *)(param_3 + 0x28);
      goto joined_r0x009bb0e4;
    }
    if (*param_1 == '+') {
      param_1 = param_1 + 1;
      param_2 = param_2 + -1;
    }
    uVar8 = *(ulong *)(param_3 + 0x28);
  }
  uVar5 = 1;
joined_r0x009bb0e4:
  if (uVar8 != 0) {
    uVar7 = 0;
    puVar6 = (ulong *)(*(long *)(param_3 + 0x26) + 0x10);
    do {
      uVar9 = *(uint *)((long)puVar6 + -4);
      if ((*param_3 & uVar9 & 0xc) != 0) {
        if (param_2 == -1) {
          iVar2 = strcmp((char *)puVar6[-2],param_1);
          if (iVar2 == 0) {
LAB_009bb180:
            puVar3 = *(ulong **)(param_3 + 10);
            if (puVar3 != (ulong *)0x0) {
              uVar8 = *puVar6;
              uVar1 = uVar9 & 0xf00;
              uVar5 = uVar9 & 1 ^ uVar5;
              if (uVar1 == 0) {
                if (uVar5 == 0) {
                  uVar8 = *puVar3 & (uVar8 ^ 0xffffffffffffffff);
                }
                else {
                  uVar8 = *puVar3 | uVar8;
                }
                *puVar3 = uVar8;
                return 1;
              }
              if (uVar1 == 0x100) {
                lVar4 = 0x78;
              }
              else {
                if (uVar1 != 0x200) {
                  return 1;
                }
                lVar4 = 0x80;
              }
              uVar1 = **(uint **)((long)param_3 + lVar4);
              uVar9 = uVar1 & ((uint)uVar8 ^ 0xffffffff);
              if (uVar5 != 0) {
                uVar9 = uVar1 | (uint)uVar8;
              }
              **(uint **)((long)param_3 + lVar4) = uVar9;
            }
            return 1;
          }
        }
        else if ((int)puVar6[-1] == param_2) {
          iVar2 = OPENSSL_strncasecmp(puVar6[-2],param_1,(long)param_2);
          if (iVar2 == 0) {
            uVar9 = *(uint *)((long)puVar6 + -4);
            goto LAB_009bb180;
          }
          uVar8 = *(ulong *)(param_3 + 0x28);
        }
      }
      uVar7 = uVar7 + 1;
      puVar6 = puVar6 + 3;
    } while (uVar7 < uVar8);
  }
  return 0;
}

