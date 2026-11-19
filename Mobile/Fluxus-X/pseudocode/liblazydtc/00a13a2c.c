/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a13a2c
 */

long CT_POLICY_EVAL_CTX_new(void)

{
  long lVar1;
  time_t tVar2;
  
  lVar1 = CRYPTO_zalloc(0x30,"crypto/ct/ct_policy.c",0x1f);
  if (lVar1 == 0) {
    ERR_new();
    ERR_set_debug("crypto/ct/ct_policy.c",0x22,"CT_POLICY_EVAL_CTX_new_ex");
    ERR_set_error(0x32,0xc0100,0);
  }
  else {
    *(undefined8 *)(lVar1 + 0x20) = 0;
    tVar2 = time((time_t *)0x0);
    *(time_t *)(lVar1 + 0x18) = tVar2 * 1000 + 300000;
  }
  return lVar1;
}

