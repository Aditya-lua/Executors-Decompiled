/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aca7a0
 */

ulong ossl_rand_pool_bytes_needed(long param_1,uint param_2)

{
  ulong uVar1;
  int iVar2;
  undefined8 uVar3;
  ulong uVar4;
  ulong uVar5;
  ulong uVar6;
  
  if (param_2 == 0) {
    ERR_new();
    ERR_set_debug("crypto/rand/rand_pool.c",0xfc,"ossl_rand_pool_bytes_needed");
    uVar3 = 0x69;
  }
  else {
    uVar6 = *(ulong *)(param_1 + 0x30);
    uVar4 = *(ulong *)(param_1 + 8);
    uVar5 = *(ulong *)(param_1 + 0x38);
    if (*(ulong *)(param_1 + 0x38) <= uVar6) {
      uVar5 = uVar6;
    }
    uVar5 = (uVar5 - uVar6) * (ulong)param_2 + 7 >> 3;
    if (uVar5 <= *(long *)(param_1 + 0x20) - uVar4) {
      uVar1 = *(ulong *)(param_1 + 0x18) - uVar4;
      uVar6 = uVar5;
      if ((uVar4 <= *(ulong *)(param_1 + 0x18) && uVar1 != 0) && (uVar6 = uVar1, uVar1 <= uVar5)) {
        uVar6 = uVar5;
      }
      iVar2 = FUN_00aca884(param_1,uVar6);
      if (iVar2 == 0) {
        *(undefined8 *)(param_1 + 8) = 0;
        *(undefined8 *)(param_1 + 0x20) = 0;
        return 0;
      }
      return uVar6;
    }
    ERR_new();
    ERR_set_debug("crypto/rand/rand_pool.c",0x104,"ossl_rand_pool_bytes_needed");
    uVar3 = 0x7d;
  }
  ERR_set_error(0x24,uVar3,0);
  return 0;
}

