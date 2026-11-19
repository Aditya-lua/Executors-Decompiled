/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba0068
 */

undefined8
mbedtls_psa_pake_output(int *param_1,int param_2,void *param_3,ulong param_4,ulong *param_5)

{
  int iVar1;
  undefined8 uVar2;
  long lVar3;
  ulong __n;
  
  if (*param_1 != 0xa000100) {
    return 0xffffff7a;
  }
  if (param_2 == 1) {
    iVar1 = mbedtls_ecjpake_write_round_one
                      (param_1 + 0x60,param_1 + 7,0x150,param_1 + 0x5c,mbedtls_psa_get_random,0);
    if (iVar1 < -0x4c80) {
LAB_00ba018c:
      if (iVar1 < -0x4f00) {
        if (iVar1 == -0x5080) {
          return 0xffffff7a;
        }
        if (iVar1 == -0x4f80) {
          return 0xffffff67;
        }
      }
      else {
        if (iVar1 == -0x4f00) goto LAB_00ba0260;
        if (iVar1 == -0x4e00) {
          return 0xffffff67;
        }
      }
    }
    else if (iVar1 < -8) {
LAB_00ba0224:
      if (iVar1 == -0x4c80) {
        return 0xffffff67;
      }
      if (iVar1 == -0x6e) {
        return 0xffffff69;
      }
    }
    else {
      if (iVar1 == 0) {
        lVar3 = 0;
        param_1[0x5e] = 0;
        param_1[0x5f] = 0;
        goto LAB_00ba0164;
      }
LAB_00ba014c:
      if (iVar1 == -4) {
        return 0xffffff67;
      }
      if (iVar1 == -8) goto LAB_00ba0260;
    }
    uVar2 = 0xffffff7c;
  }
  else {
    if (param_2 == 7) {
      iVar1 = mbedtls_ecjpake_write_round_two
                        (param_1 + 0x60,param_1 + 7,0x150,param_1 + 0x5c,mbedtls_psa_get_random,0);
      if (iVar1 < -0x4c80) goto LAB_00ba018c;
      if (iVar1 < -8) goto LAB_00ba0224;
      if (iVar1 != 0) goto LAB_00ba014c;
      lVar3 = 3;
      if (param_1[6] != 1) {
        lVar3 = 0;
      }
      *(long *)(param_1 + 0x5e) = lVar3;
    }
    else {
      lVar3 = *(long *)(param_1 + 0x5e);
    }
LAB_00ba0164:
    __n = (ulong)*(byte *)((long)param_1 + lVar3 + 0x1c);
    *(long *)(param_1 + 0x5e) = lVar3 + 1;
    if (*(ulong *)(param_1 + 0x5c) < lVar3 + 1 + __n) {
      return 0xffffff68;
    }
    if (__n <= param_4) {
      memcpy(param_3,(void *)((long)param_1 + lVar3 + 0x1d),__n);
      *param_5 = __n;
      *(ulong *)(param_1 + 0x5e) = *(long *)(param_1 + 0x5e) + __n;
      if ((param_2 == 9) || (param_2 == 6)) {
        mbedtls_platform_zeroize(param_1 + 7,0x150);
        param_1[0x5c] = 0;
        param_1[0x5d] = 0;
        param_1[0x5e] = 0;
        param_1[0x5f] = 0;
        return 0;
      }
      return 0;
    }
LAB_00ba0260:
    uVar2 = 0xffffff76;
  }
  return uVar2;
}

