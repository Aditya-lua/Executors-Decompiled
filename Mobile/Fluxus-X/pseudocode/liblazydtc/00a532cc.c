/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a532cc
 */

ENGINE * ENGINE_get_cipher_engine(int nid)

{
  ENGINE *pEVar1;
  
  pEVar1 = (ENGINE *)ossl_engine_table_select(&DAT_00d219d8,nid,"crypto/engine/tb_cipher.c",0x45);
  return pEVar1;
}

