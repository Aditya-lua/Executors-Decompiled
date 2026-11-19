/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b83920
 */

undefined8 mbedtls_mpi_core_write_le(long param_1,long param_2,long param_3,ulong param_4)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  ulong uVar5;
  
  uVar1 = param_2 * 8;
  uVar3 = uVar1;
  if ((param_4 <= uVar1) && (uVar3 = param_4, param_4 < uVar1)) {
    uVar2 = param_4 << 3;
    uVar4 = param_4;
    do {
      if ((*(ulong *)(param_1 + (uVar4 & 0xfffffffffffffff8)) & 0xffL << (uVar2 & 0x38)) != 0) {
        return 0xfffffff8;
      }
      uVar4 = uVar4 + 1;
      uVar2 = uVar2 + 8;
    } while (uVar4 < uVar1);
  }
  if (uVar3 != 0) {
    uVar4 = 0;
    uVar2 = 0;
    do {
      uVar5 = uVar4 & 0x38;
      uVar4 = uVar4 + 8;
      *(char *)(param_3 + uVar2) =
           (char)(*(ulong *)(param_1 + (uVar2 & 0xfffffffffffffff8)) >> uVar5);
      uVar2 = uVar2 + 1;
    } while (uVar3 != uVar2);
  }
  if (uVar1 < param_4) {
    memset((void *)(param_3 + uVar1),0,param_4 + param_2 * -8);
  }
  return 0;
}

