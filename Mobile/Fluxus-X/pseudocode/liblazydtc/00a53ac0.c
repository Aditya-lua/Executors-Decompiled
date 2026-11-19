/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a53ac0
 */

ENGINE * ENGINE_get_pkey_meth_engine(int nid)

{
  ENGINE *pEVar1;
  
  pEVar1 = (ENGINE *)ossl_engine_table_select(&DAT_00d21a00,nid,"crypto/engine/tb_pkmeth.c",0x46);
  return pEVar1;
}

