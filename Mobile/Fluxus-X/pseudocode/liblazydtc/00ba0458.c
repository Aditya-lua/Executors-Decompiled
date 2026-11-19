/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba0458
 */

undefined8 mbedtls_psa_pake_get_implicit_key(int *param_1)

{
  int iVar1;
  undefined8 uVar2;
  
  if (*param_1 != 0xa000100) {
    return 0xffffff7a;
  }
  uVar2 = mbedtls_ecjpake_write_shared_key(param_1 + 0x60);
  iVar1 = (int)uVar2;
  if (iVar1 < -0x4c80) {
    if (iVar1 < -0x4f00) {
      if (iVar1 == -0x5080) {
        return 0xffffff7a;
      }
      if (iVar1 != -0x4f80) {
        return 0xffffff7c;
      }
    }
    else {
      if (iVar1 == -0x4f00) {
        return 0xffffff76;
      }
      if (iVar1 != -0x4e00) {
        return 0xffffff7c;
      }
    }
  }
  else if (iVar1 < -8) {
    if (iVar1 != -0x4c80) {
      if (iVar1 == -0x6e) {
        return 0xffffff69;
      }
      return 0xffffff7c;
    }
  }
  else {
    if (iVar1 == 0) {
      return uVar2;
    }
    if (iVar1 != -4) {
      if (iVar1 == -8) {
        return 0xffffff76;
      }
      return 0xffffff7c;
    }
  }
  return 0xffffff67;
}

