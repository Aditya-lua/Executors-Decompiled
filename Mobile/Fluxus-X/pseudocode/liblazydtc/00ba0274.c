/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba0274
 */

undefined4 mbedtls_psa_pake_input(int *param_1,int param_2,void *param_3,size_t param_4)

{
  int *piVar1;
  int iVar2;
  long lVar3;
  
  if (*param_1 != 0xa000100) {
    return 0xffffff7a;
  }
  if ((param_2 == 10) && (param_1[6] == 0)) {
    lVar3 = *(long *)(param_1 + 0x5c);
    if (0x150 < lVar3 + 3U) {
      return 0xffffff76;
    }
    *(undefined1 *)((long)param_1 + lVar3 + 0x1e) = 0x17;
    *(undefined2 *)((long)param_1 + lVar3 + 0x1c) = 3;
    *(long *)(param_1 + 0x5c) = *(long *)(param_1 + 0x5c) + 3;
  }
  if (0x150 < param_4 + *(long *)(param_1 + 0x5c) + 1) {
    return 0xffffff76;
  }
  piVar1 = param_1 + 7;
  *(char *)((long)piVar1 + *(long *)(param_1 + 0x5c)) = (char)param_4;
  lVar3 = *(long *)(param_1 + 0x5c);
  *(long *)(param_1 + 0x5c) = lVar3 + 1;
  memcpy((void *)((long)piVar1 + lVar3 + 1),param_3,param_4);
  *(size_t *)(param_1 + 0x5c) = *(long *)(param_1 + 0x5c) + param_4;
  if (param_2 == 0xc) {
    iVar2 = mbedtls_ecjpake_read_round_two(param_1 + 0x60,piVar1);
    mbedtls_platform_zeroize(piVar1,0x150);
    param_1[0x5c] = 0;
    param_1[0x5d] = 0;
    if (iVar2 < -0x4c80) {
LAB_00ba03d4:
      if (iVar2 < -0x4f00) {
        if (iVar2 == -0x5080) {
          return 0xffffff7a;
        }
        if (iVar2 == -0x4f80) {
          return 0xffffff67;
        }
        return 0xffffff7c;
      }
      if (iVar2 == -0x4f00) {
        return 0xffffff76;
      }
      if (iVar2 == -0x4e00) {
        return 0xffffff67;
      }
      return 0xffffff7c;
    }
    if (iVar2 < -8) {
LAB_00ba0414:
      if (iVar2 == -0x4c80) {
        return 0xffffff67;
      }
      if (iVar2 == -0x6e) {
        return 0xffffff69;
      }
      return 0xffffff7c;
    }
    if (iVar2 == 0) {
      return 0;
    }
  }
  else {
    if (param_2 != 6) {
      return 0;
    }
    iVar2 = mbedtls_ecjpake_read_round_one(param_1 + 0x60,piVar1);
    mbedtls_platform_zeroize(piVar1,0x150);
    param_1[0x5c] = 0;
    param_1[0x5d] = 0;
    if (iVar2 < -0x4c80) goto LAB_00ba03d4;
    if (iVar2 < -8) goto LAB_00ba0414;
    if (iVar2 == 0) {
      return 0;
    }
  }
  if (iVar2 == -4) {
    return 0xffffff67;
  }
  if (iVar2 == -8) {
    return 0xffffff76;
  }
  return 0xffffff7c;
}

