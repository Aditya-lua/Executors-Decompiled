/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b83860
 */

undefined8 mbedtls_mpi_core_read_be(ulong *param_1,ulong param_2,void *param_3,ulong param_4)

{
  bool bVar1;
  ulong uVar2;
  undefined8 uVar3;
  ulong uVar4;
  ulong *puVar5;
  
  uVar4 = param_4 >> 3;
  if ((param_4 & 7) != 0) {
    uVar4 = uVar4 + 1;
  }
  if (param_2 < uVar4) {
    uVar3 = 0xfffffff8;
  }
  else {
    if (param_2 != 0) {
      memset(param_1,0,param_2 * 8);
      if (param_4 != 0) {
        memcpy((void *)((long)param_1 + (param_2 * 8 - param_4)),param_3,param_4);
      }
      if (-1 < (long)(param_2 - 1)) {
        puVar5 = param_1 + (param_2 - 2);
        do {
          uVar4 = (puVar5[1] & 0xff00ff00ff00ff00) >> 8 | (puVar5[1] & 0xff00ff00ff00ff) << 8;
          uVar4 = (uVar4 & 0xffff0000ffff0000) >> 0x10 | (uVar4 & 0xffff0000ffff) << 0x10;
          uVar2 = (*param_1 & 0xff00ff00ff00ff00) >> 8 | (*param_1 & 0xff00ff00ff00ff) << 8;
          uVar2 = (uVar2 & 0xffff0000ffff0000) >> 0x10 | (uVar2 & 0xffff0000ffff) << 0x10;
          *param_1 = uVar4 >> 0x20 | uVar4 << 0x20;
          puVar5[1] = uVar2 >> 0x20 | uVar2 << 0x20;
          bVar1 = param_1 + 1 <= puVar5;
          puVar5 = puVar5 + -1;
          param_1 = param_1 + 1;
        } while (bVar1);
      }
    }
    uVar3 = 0;
  }
  return uVar3;
}

