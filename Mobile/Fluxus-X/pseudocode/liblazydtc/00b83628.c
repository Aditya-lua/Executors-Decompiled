/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b83628
 */

void mbedtls_mpi_core_bigendian_to_host(ulong *param_1,long param_2)

{
  bool bVar1;
  ulong uVar2;
  ulong uVar3;
  ulong *puVar4;
  
  if ((param_2 != 0) && (-1 < param_2 + -1)) {
    puVar4 = param_1 + param_2 + -2;
    do {
      uVar2 = (puVar4[1] & 0xff00ff00ff00ff00) >> 8 | (puVar4[1] & 0xff00ff00ff00ff) << 8;
      uVar2 = (uVar2 & 0xffff0000ffff0000) >> 0x10 | (uVar2 & 0xffff0000ffff) << 0x10;
      uVar3 = (*param_1 & 0xff00ff00ff00ff00) >> 8 | (*param_1 & 0xff00ff00ff00ff) << 8;
      uVar3 = (uVar3 & 0xffff0000ffff0000) >> 0x10 | (uVar3 & 0xffff0000ffff) << 0x10;
      *param_1 = uVar2 >> 0x20 | uVar2 << 0x20;
      puVar4[1] = uVar3 >> 0x20 | uVar3 << 0x20;
      bVar1 = param_1 + 1 <= puVar4;
      param_1 = param_1 + 1;
      puVar4 = puVar4 + -1;
    } while (bVar1);
  }
  return;
}

