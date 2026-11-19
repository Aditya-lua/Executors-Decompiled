/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b837c8
 */

undefined8 mbedtls_mpi_core_read_le(void *param_1,ulong param_2,long param_3,ulong param_4)

{
  byte *pbVar1;
  undefined8 uVar2;
  ulong uVar3;
  ulong uVar4;
  ulong uVar5;
  ulong uVar6;
  
  uVar3 = param_4 >> 3;
  if ((param_4 & 7) != 0) {
    uVar3 = uVar3 + 1;
  }
  if (param_2 < uVar3) {
    uVar2 = 0xfffffff8;
  }
  else {
    if ((param_1 != (void *)0x0) && (memset(param_1,0,param_2 << 3), param_4 != 0)) {
      uVar4 = 0;
      uVar3 = 0;
      do {
        pbVar1 = (byte *)(param_3 + uVar3);
        uVar6 = uVar3 & 0xfffffffffffffff8;
        uVar5 = uVar4 & 0x38;
        uVar3 = uVar3 + 1;
        uVar4 = uVar4 + 8;
        *(ulong *)((long)param_1 + uVar6) =
             (ulong)*pbVar1 << uVar5 | *(ulong *)((long)param_1 + uVar6);
      } while (param_4 != uVar3);
    }
    uVar2 = 0;
  }
  return uVar2;
}

