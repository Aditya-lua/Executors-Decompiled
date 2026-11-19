/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9cab8
 */

undefined8 FUN_00a9cab8(long *param_1,long *param_2,int param_3)

{
  long lVar1;
  ulong uVar2;
  int iVar3;
  undefined8 uVar4;
  long lVar5;
  ulong uVar6;
  long lVar7;
  long lVar8;
  ulong uVar9;
  ulong uVar10;
  ulong uVar11;
  byte *local_38;
  
  uVar11 = param_1[3] - param_2[3];
  if (uVar11 == 0) {
    if ((*(uint *)(param_2 + 4) & 1) != 0) {
      return 0;
    }
    if ((*(uint *)(param_2 + 4) >> 1 & 1) == 0) goto LAB_00a9cae8;
    if (param_3 != 0) {
      lVar7 = param_2[2];
      lVar5 = param_1[2] - lVar7;
      if (lVar5 == param_2[1]) {
        param_1[2] = lVar5;
        param_1[3] = param_1[3] - lVar7;
      }
      param_2[1] = 0;
      param_2[2] = 0;
      lVar5 = param_2[2];
      goto joined_r0x00a9cb60;
    }
LAB_00a9cc84:
    uVar4 = 0;
  }
  else {
LAB_00a9cae8:
    lVar5 = param_2[2];
joined_r0x00a9cb60:
    if (lVar5 == 0) {
      if ((((*(byte *)(param_1 + 6) & 1) != 0) && (*param_2 != 0)) &&
         ((uVar11 != 0 || ((*(byte *)(param_2 + 4) >> 1 & 1) == 0)))) {
        uVar10 = 0;
        uVar6 = uVar11;
        do {
          uVar6 = uVar6 >> 8;
          uVar10 = uVar10 + 1;
        } while (uVar6 != 0);
        if ((8 < uVar10) || (iVar3 = WPACKET_reserve_bytes(param_1,uVar10,&local_38), iVar3 == 0))
        goto LAB_00a9cc84;
        param_1[3] = param_1[3] + uVar10;
        param_1[2] = param_1[2] + uVar10;
        if (local_38 != (byte *)0x0) {
          uVar6 = uVar11;
          uVar9 = uVar10;
          do {
            uVar2 = uVar9 - 1;
            local_38[uVar9 - 1] = (byte)uVar6;
            uVar6 = uVar6 >> 8;
            uVar9 = uVar2;
          } while (uVar2 != 0);
          if (uVar6 != 0) {
            return 0;
          }
        }
        if (0x7f < uVar11) {
          uVar4 = WPACKET_reserve_bytes(param_1,1,&local_38);
          if ((int)uVar4 == 0) {
            return uVar4;
          }
          param_1[3] = param_1[3] + 1;
          param_1[2] = param_1[2] + 1;
          if (local_38 != (byte *)0x0) {
            uVar11 = uVar10 & 0x7fffffffffffff00;
            *local_38 = (byte)uVar10 | 0x80;
            goto joined_r0x00a9cb18;
          }
        }
      }
    }
    else {
      lVar7 = param_1[1];
      if ((lVar7 != 0) || ((*param_1 != 0 && (lVar7 = *(long *)(*param_1 + 8), lVar7 != 0)))) {
        lVar8 = param_2[1];
        do {
          lVar1 = lVar7 + lVar8 + lVar5;
          lVar5 = lVar5 + -1;
          *(char *)(lVar1 + -1) = (char)uVar11;
          uVar11 = uVar11 >> 8;
        } while (lVar5 != 0);
joined_r0x00a9cb18:
        if (uVar11 != 0) {
          return 0;
        }
      }
    }
    if (param_3 != 0) {
      param_1[5] = *param_2;
      CRYPTO_free(param_2);
    }
    uVar4 = 1;
  }
  return uVar4;
}

