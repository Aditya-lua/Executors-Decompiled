/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a30ed0
 */

size_t EC_GROUP_set_seed(EC_GROUP *param_1,uchar *param_2,size_t len)

{
  void *__dest;
  size_t sVar1;
  EC_GROUP *pEVar2;
  
  pEVar2 = param_1 + 0x30;
  CRYPTO_free(*(void **)pEVar2);
  *(undefined8 *)pEVar2 = 0;
  *(undefined8 *)(param_1 + 0x38) = 0;
  sVar1 = 1;
  if ((param_2 != (uchar *)0x0) && (len != 0)) {
    __dest = CRYPTO_malloc((int)len,"crypto/ec/ec_lib.c",0x217);
    *(void **)pEVar2 = __dest;
    if (__dest == (void *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/ec/ec_lib.c",0x218,"EC_GROUP_set_seed");
      ERR_set_error(0x10,0xc0100,0);
      sVar1 = 0;
    }
    else {
      memcpy(__dest,param_2,len);
      *(size_t *)(param_1 + 0x38) = len;
      sVar1 = len;
    }
  }
  return sVar1;
}

