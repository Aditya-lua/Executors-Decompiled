/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a2fee8
 */

int ECDH_compute_key(void *out,size_t outlen,EC_POINT *pub_key,EC_KEY *ecdh,KDF *KDF)

{
  int iVar1;
  undefined8 uVar2;
  void *pvVar3;
  ulong local_48;
  void *local_40;
  size_t local_38;
  
  local_40 = (void *)0x0;
  local_38 = outlen;
  if (*(code **)(*(long *)ecdh + 0x48) == (code *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/ec/ec_kmeth.c",0xa2,"ECDH_compute_key");
    uVar2 = 0x98;
  }
  else {
    if (outlen >> 0x1f == 0) {
      iVar1 = (**(code **)(*(long *)ecdh + 0x48))(&local_40,&local_48);
      pvVar3 = local_40;
      if (iVar1 == 0) {
        return 0;
      }
      if (KDF == (KDF *)0x0) {
        if (local_48 < outlen) {
          local_38 = local_48;
          outlen = local_48;
        }
        memcpy(out,local_40,outlen);
      }
      else {
        (*KDF)(local_40,local_48,out,&local_38);
        pvVar3 = local_40;
      }
      CRYPTO_clear_free(pvVar3,local_48,"crypto/ec/ec_kmeth.c",0xb2);
      return (int)local_38;
    }
    ERR_new();
    ERR_set_debug("crypto/ec/ec_kmeth.c",0xa6,"ECDH_compute_key");
    uVar2 = 0xa1;
  }
  ERR_set_error(0x10,uVar2,0);
  return 0;
}

