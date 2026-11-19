/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b80578
 */

undefined8 mbedtls_mpi_mod_int(ulong *param_1,long *param_2,ulong param_3)

{
  int iVar1;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  
  if (param_3 == 0) {
    return 0xfffffff4;
  }
  if ((long)param_3 < 0) {
    return 0xfffffff6;
  }
  if ((param_3 == 1) || (uVar2 = (ulong)*(ushort *)((long)param_2 + 10), uVar2 == 0)) {
    *param_1 = 0;
    return 0;
  }
  if (param_3 == 2) {
    uVar2 = *(ulong *)*param_2 & 1;
  }
  else {
    uVar3 = 0;
    do {
      uVar2 = uVar2 - 1;
      uVar4 = *(ulong *)(*param_2 + uVar2 * 8);
      iVar1 = 0;
      if (param_3 != 0) {
        iVar1 = (int)((uVar4 >> 0x20 | uVar3 << 0x20) / param_3);
      }
      uVar3 = uVar4 & 0xffffffff |
              (ulong)(uint)((int)(uVar4 >> 0x20) - iVar1 * (int)param_3) << 0x20;
      uVar4 = 0;
      if (param_3 != 0) {
        uVar4 = uVar3 / param_3;
      }
      uVar3 = uVar3 - uVar4 * param_3;
    } while (uVar2 != 0);
    uVar2 = param_3 - uVar3;
    if (-1 < (short)param_2[1] || uVar3 == 0) {
      uVar2 = uVar3;
    }
  }
  *param_1 = uVar2;
  return 0;
}

