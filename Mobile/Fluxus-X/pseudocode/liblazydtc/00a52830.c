/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a52830
 */

ENGINE * ENGINE_get_pkey_asn1_meth_engine(int nid)

{
  ENGINE *pEVar1;
  
  pEVar1 = (ENGINE *)ossl_engine_table_select(&DAT_00d219c8,nid,"crypto/engine/tb_asnmth.c",0x50);
  return pEVar1;
}

