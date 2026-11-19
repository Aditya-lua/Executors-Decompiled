/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c6f70
 */

bool tls13_setup_key_block(long param_1)

{
  int iVar1;
  long lVar2;
  undefined8 local_28;
  undefined8 local_18;
  
  lVar2 = *(long *)(param_1 + 0x918);
  *(undefined8 *)(lVar2 + 0x2f8) = *(undefined8 *)(param_1 + 0x2e0);
  iVar1 = ssl_cipher_get_evp(*(undefined8 *)(param_1 + 0x9a8),lVar2,&local_18,&local_28,0,0,0,0);
  if (iVar1 == 0) {
    ossl_statem_send_fatal(param_1,0x50);
  }
  else {
    ssl_evp_cipher_free(*(undefined8 *)(param_1 + 800));
    *(undefined8 *)(param_1 + 800) = local_18;
    ssl_evp_md_free(*(undefined8 *)(param_1 + 0x328));
    *(undefined8 *)(param_1 + 0x328) = local_28;
  }
  return iVar1 != 0;
}

