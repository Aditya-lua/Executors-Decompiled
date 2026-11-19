/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7d038
 */

/* WARNING: Removing unreachable block (ram,0x00b7d084) */

void mbedtls_asn1_get_alg_null(void)

{
  long lVar1;
  undefined8 uVar2;
  long lVar3;
  
  lVar1 = tpidr_el0;
  lVar3 = *(long *)(lVar1 + 0x28);
  uVar2 = mbedtls_asn1_get_alg();
  if ((int)uVar2 == 0) {
    uVar2 = 0;
  }
  if (*(long *)(lVar1 + 0x28) != lVar3) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar2);
  }
  return;
}

