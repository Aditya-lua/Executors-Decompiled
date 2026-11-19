/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a13924
 */

void * CT_POLICY_EVAL_CTX_new_ex(undefined8 param_1,char *param_2)

{
  void *ptr;
  char *pcVar1;
  time_t tVar2;
  
  ptr = (void *)CRYPTO_zalloc(0x30,"crypto/ct/ct_policy.c",0x1f);
  if (ptr == (void *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/ct/ct_policy.c",0x22,"CT_POLICY_EVAL_CTX_new_ex");
    ERR_set_error(0x32,0xc0100,0);
  }
  else {
    *(undefined8 *)((long)ptr + 0x20) = param_1;
    if (param_2 != (char *)0x0) {
      pcVar1 = CRYPTO_strdup(param_2,"crypto/ct/ct_policy.c",0x28);
      *(char **)((long)ptr + 0x28) = pcVar1;
      if (pcVar1 == (char *)0x0) {
        ERR_new();
        ERR_set_debug("crypto/ct/ct_policy.c",0x2a,"CT_POLICY_EVAL_CTX_new_ex");
        ERR_set_error(0x32,0xc0100,0);
        CRYPTO_free(ptr);
        return (void *)0x0;
      }
    }
    tVar2 = time((time_t *)0x0);
    *(time_t *)((long)ptr + 0x18) = tVar2 * 1000 + 300000;
  }
  return ptr;
}

