/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b848a4
 */

undefined8
mbedtls_mpi_core_fill_random
          (ulong *param_1,ulong param_2,ulong param_3,code *param_4,undefined8 param_5)

{
  ulong uVar1;
  bool bVar2;
  undefined8 uVar3;
  ulong *puVar4;
  size_t __n;
  ulong uVar5;
  
  uVar5 = param_3 >> 3;
  bVar2 = (param_3 & 7) != 0;
  uVar1 = uVar5;
  if (bVar2) {
    uVar1 = uVar5 + 1;
  }
  if (param_2 < uVar1) {
    uVar3 = 0xfffffffc;
  }
  else {
    __n = uVar1 * 8 - param_3;
    memset(param_1,0,__n);
    memset(param_1 + uVar1,0,(param_2 - uVar1) * 8);
    uVar3 = (*param_4)(param_5,(long)param_1 + __n,param_3);
    if ((int)uVar3 == 0) {
      if (uVar1 != 0) {
        puVar4 = param_1 + uVar5 + bVar2 + -2;
        do {
          uVar1 = (puVar4[1] & 0xff00ff00ff00ff00) >> 8 | (puVar4[1] & 0xff00ff00ff00ff) << 8;
          uVar1 = (uVar1 & 0xffff0000ffff0000) >> 0x10 | (uVar1 & 0xffff0000ffff) << 0x10;
          uVar5 = (*param_1 & 0xff00ff00ff00ff00) >> 8 | (*param_1 & 0xff00ff00ff00ff) << 8;
          uVar5 = (uVar5 & 0xffff0000ffff0000) >> 0x10 | (uVar5 & 0xffff0000ffff) << 0x10;
          *param_1 = uVar1 >> 0x20 | uVar1 << 0x20;
          puVar4[1] = uVar5 >> 0x20 | uVar5 << 0x20;
          bVar2 = param_1 + 1 <= puVar4;
          puVar4 = puVar4 + -1;
          param_1 = param_1 + 1;
        } while (bVar2);
      }
      uVar3 = 0;
    }
  }
  return uVar3;
}

