/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b853c0
 */

ulong mbedtls_asn1_write_mpi(ulong *param_1,ulong param_2,long param_3)

{
  ulong uVar1;
  uint uVar2;
  ulong uVar3;
  char *pcVar4;
  ulong uVar5;
  
  uVar1 = mbedtls_mpi_size(param_3);
  uVar3 = *param_1;
  if (uVar1 == 0) {
    uVar1 = 1;
  }
  if ((param_2 <= uVar3) && (uVar1 <= uVar3 - param_2)) {
    *param_1 = uVar3 - uVar1;
    uVar3 = mbedtls_mpi_write_binary(param_3,uVar3 - uVar1,uVar1);
    if ((int)uVar3 != 0) {
      return uVar3;
    }
    if ((*(short *)(param_3 + 8) == 1) && (pcVar4 = (char *)*param_1, *pcVar4 < '\0')) {
      if ((long)((long)pcVar4 - param_2) < 1) {
        return 0xffffff94;
      }
      uVar1 = uVar1 + 1;
      *param_1 = (ulong)(pcVar4 + -1);
      pcVar4[-1] = '\0';
    }
    if (uVar1 >> 0x20 != 0) {
      return 0xffffff9c;
    }
    uVar2 = 1;
    if (0x7f < uVar1) {
      uVar3 = uVar1;
      do {
        uVar3 = uVar3 >> 8;
        uVar2 = uVar2 + 1;
      } while (uVar3 != 0);
    }
    uVar3 = *param_1;
    if ((long)(ulong)uVar2 <= (long)(uVar3 - param_2)) {
      *param_1 = uVar3 - 1;
      *(char *)(uVar3 - 1) = (char)uVar1;
      uVar3 = uVar1;
      while (uVar3 >> 8 != 0) {
        uVar5 = *param_1;
        *param_1 = uVar5 - 1;
        *(char *)(uVar5 - 1) = (char)(uVar3 >> 8);
        uVar3 = uVar3 >> 8;
      }
      if (1 < uVar2) {
        uVar3 = *param_1;
        *param_1 = uVar3 - 1;
        *(char *)(uVar3 - 1) = (char)uVar2 + '\x7f';
      }
      uVar3 = *param_1;
      if (0 < (long)(uVar3 - param_2)) {
        *param_1 = uVar3 - 1;
        *(undefined1 *)(uVar3 - 1) = 2;
        return (ulong)((int)uVar1 + uVar2 + 1);
      }
    }
  }
  return 0xffffff94;
}

