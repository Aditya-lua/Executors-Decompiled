/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a357c0
 */

undefined8 ossl_ecdh_compute_key(void)

{
  undefined8 uVar1;
  long in_x3;
  code *UNRECOVERED_JUMPTABLE;
  
  UNRECOVERED_JUMPTABLE = *(code **)(**(long **)(in_x3 + 0x18) + 0x170);
  if (UNRECOVERED_JUMPTABLE == (code *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/ec/ecdh_ossl.c",0x20,"ossl_ecdh_compute_key");
    ERR_set_error(0x10,0xa0,0);
    return 0;
  }
                    /* WARNING: Could not recover jumptable at 0x00a357d0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar1 = (*UNRECOVERED_JUMPTABLE)();
  return uVar1;
}

