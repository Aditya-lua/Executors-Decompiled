/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a35be8
 */

undefined8 ossl_ecdsa_sign_sig(void)

{
  undefined8 uVar1;
  long in_x4;
  code *UNRECOVERED_JUMPTABLE;
  
  UNRECOVERED_JUMPTABLE = *(code **)(**(long **)(in_x4 + 0x18) + 0x180);
  if (UNRECOVERED_JUMPTABLE == (code *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/ec/ecdsa_ossl.c",0x30,"ossl_ecdsa_sign_sig");
    ERR_set_error(0x10,0xaa,0);
    return 0;
  }
                    /* WARNING: Could not recover jumptable at 0x00a35bf8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar1 = (*UNRECOVERED_JUMPTABLE)();
  return uVar1;
}

