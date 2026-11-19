/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b80fec
 */

undefined8
mbedtls_mpi_random(undefined8 *param_1,ulong param_2,long *param_3,undefined8 param_4,
                  undefined8 param_5)

{
  undefined8 uVar1;
  ulong uVar2;
  ulong uVar3;
  int iVar4;
  
  if (-1 < (long)param_2) {
    uVar2 = (ulong)*(ushort *)((long)param_3 + 10);
    do {
      uVar3 = uVar2;
      uVar2 = uVar3 - 1;
      if (uVar2 == 0xffffffffffffffff) {
        uVar3 = 0;
        break;
      }
    } while (*(long *)(*param_3 + uVar2 * 8) == 0);
    uVar2 = 2;
    do {
      uVar2 = uVar2 - 1;
      if (uVar2 == 0) break;
    } while (param_2 == 0);
    if (uVar2 != 0 || uVar3 != 0) {
      if (uVar2 < uVar3) {
        iVar4 = (int)(short)param_3[1];
      }
      else {
        if (uVar3 < uVar2) {
          return 0xfffffffc;
        }
        iVar4 = (int)(short)param_3[1];
        if (iVar4 < 0) {
          return 0xfffffffc;
        }
        do {
          uVar3 = uVar3 - 1;
          if (uVar3 == 0xffffffffffffffff) {
            return 0xfffffffc;
          }
          uVar2 = *(ulong *)(*param_3 + uVar3 * 8);
          if (param_2 < uVar2) goto joined_r0x00b810e8;
        } while (param_2 <= uVar2);
        iVar4 = -iVar4;
      }
joined_r0x00b810e8:
      if (0 < iVar4) {
        uVar1 = FUN_00b7ea70(param_1);
        if ((int)uVar1 == 0) {
          uVar1 = mbedtls_mpi_core_random
                            (*param_1,param_2,*param_3,*(undefined2 *)((long)param_1 + 10),param_4,
                             param_5);
          return uVar1;
        }
        return uVar1;
      }
    }
  }
  return 0xfffffffc;
}

