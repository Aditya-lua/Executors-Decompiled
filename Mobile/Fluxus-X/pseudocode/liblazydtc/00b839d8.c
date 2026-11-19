/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b839d8
 */

undefined8 mbedtls_mpi_core_write_be(long param_1,long param_2,void *param_3,ulong param_4)

{
  long lVar1;
  ulong uVar2;
  undefined1 *puVar3;
  ulong uVar4;
  ulong uVar5;
  
  uVar5 = param_2 * 8;
  if (uVar5 < param_4) {
    lVar1 = param_2 * -8 + param_4;
    memset(param_3,0,param_4 + param_2 * -8);
    param_4 = uVar5;
    param_3 = (void *)((long)param_3 + lVar1);
  }
  else if (uVar5 != param_4) {
    uVar4 = param_4 << 3;
    uVar2 = param_4;
    do {
      if ((*(ulong *)(param_1 + (uVar2 & 0xfffffffffffffff8)) & 0xffL << (uVar4 & 0x38)) != 0) {
        return 0xfffffff8;
      }
      uVar2 = uVar2 + 1;
      uVar4 = uVar4 + 8;
    } while (uVar2 < uVar5);
  }
  if (param_4 != 0) {
    puVar3 = (undefined1 *)((long)param_3 + param_4);
    uVar2 = 0;
    uVar5 = 0;
    do {
      puVar3 = puVar3 + -1;
      uVar4 = uVar5 & 0xfffffffffffffff8;
      uVar5 = uVar5 + 1;
      *puVar3 = (char)(*(ulong *)(param_1 + uVar4) >> (uVar2 & 0x38));
      uVar2 = uVar2 + 8;
    } while (param_4 != uVar5);
  }
  return 0;
}

