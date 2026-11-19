/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ae0d50
 */

ulong SHA3_absorb(ulong *param_1,ulong *param_2,ulong param_3,ulong param_4)

{
  ulong *puVar1;
  ulong uVar2;
  ulong *puVar3;
  
  if (param_4 <= param_3) {
    do {
      if (param_4 >> 3 != 0) {
        puVar1 = param_1;
        uVar2 = param_4 >> 3;
        puVar3 = param_2;
        do {
          uVar2 = uVar2 - 1;
          *puVar1 = *puVar3 ^ *puVar1;
          puVar1 = puVar1 + 1;
          puVar3 = puVar3 + 1;
        } while (uVar2 != 0);
        param_2 = (ulong *)((long)param_2 + (param_4 & 0xfffffffffffffff8));
      }
      FUN_00ae0ddc(param_1);
      param_3 = param_3 - param_4;
    } while (param_4 <= param_3);
  }
  return param_3;
}

