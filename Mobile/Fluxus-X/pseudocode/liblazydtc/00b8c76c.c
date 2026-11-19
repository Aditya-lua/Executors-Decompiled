/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b8c76c
 */

int psa_aead_set_lengths(int *param_1,ulong param_2,ulong param_3)

{
  int iVar1;
  int iVar2;
  
  iVar1 = *param_1;
  if (iVar1 == 0) {
    return -0x89;
  }
  if ((*(byte *)(param_1 + 8) & 0xe) != 0) {
    iVar2 = -0x89;
    goto joined_r0x00b8c86c;
  }
  if (param_1[1] == 0x5500100) {
    iVar2 = -0x87;
    if (0xff00 < param_2) goto joined_r0x00b8c86c;
LAB_00b8c81c:
    iVar2 = -0x87;
    if (iVar1 != 1) goto joined_r0x00b8c86c;
  }
  else {
    if (param_1[1] == 0x5500200) {
      iVar2 = -0x87;
      if ((param_2 >> 0x3d != 0) || (0xfffffffe0 < param_3)) goto joined_r0x00b8c86c;
      goto LAB_00b8c81c;
    }
    if (iVar1 != 1) {
      iVar2 = -0x87;
      goto joined_r0x00b8c86c;
    }
  }
  iVar2 = mbedtls_psa_aead_set_lengths(param_1 + 10,param_2,param_3);
  if (iVar2 == 0) {
    *(ulong *)(param_1 + 4) = param_2;
    *(ulong *)(param_1 + 6) = param_3;
    *(byte *)(param_1 + 8) = *(byte *)(param_1 + 8) | 2;
    return 0;
  }
  iVar1 = *param_1;
joined_r0x00b8c86c:
  if (iVar1 != 0) {
    if (iVar1 == 1) {
      mbedtls_psa_aead_abort(param_1 + 10);
    }
    memset(param_1,0,0x1d8);
  }
  return iVar2;
}

