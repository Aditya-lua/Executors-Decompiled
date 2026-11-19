/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9c418
 */

int mbedtls_hmac_drbg_reseed(long param_1,void *param_2,ulong param_3)

{
  long lVar1;
  int iVar2;
  long lVar3;
  undefined1 auStack_1d8 [384];
  long local_58;
  
  lVar1 = tpidr_el0;
  local_58 = *(long *)(lVar1 + 0x28);
  iVar2 = -5;
  if ((param_3 < 0x101) && (lVar3 = *(long *)(param_1 + 0x60), lVar3 + param_3 < 0x181)) {
    memset(auStack_1d8,0,0x180);
    iVar2 = (**(code **)(param_1 + 0x70))(*(undefined8 *)(param_1 + 0x78),auStack_1d8,lVar3);
    if (iVar2 == 0) {
      lVar3 = *(long *)(param_1 + 0x60);
      if ((param_2 != (void *)0x0) && (param_3 != 0)) {
        memcpy(auStack_1d8 + lVar3,param_2,param_3);
        lVar3 = lVar3 + param_3;
      }
      iVar2 = mbedtls_hmac_drbg_update(param_1,auStack_1d8,lVar3);
      if (iVar2 == 0) {
        *(undefined4 *)(param_1 + 0x58) = 1;
      }
      mbedtls_platform_zeroize(auStack_1d8,lVar3);
    }
    else {
      iVar2 = -9;
    }
  }
  if (*(long *)(lVar1 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar2;
}

