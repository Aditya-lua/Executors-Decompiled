/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b66fc
 */

long ssl_evp_md_fetch(undefined8 param_1,int param_2,undefined8 param_3)

{
  long lVar1;
  char *pcVar2;
  
  lVar1 = tls_get_digest_from_engine(param_2);
  if (lVar1 == 0) {
    ERR_set_mark();
    pcVar2 = OBJ_nid2sn(param_2);
    lVar1 = EVP_MD_fetch(param_1,pcVar2,param_3);
    ERR_pop_to_mark();
  }
  return lVar1;
}

