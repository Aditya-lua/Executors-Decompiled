/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a53910
 */

void ENGINE_get_default_EC(void)

{
  ossl_engine_table_select(&DAT_00d219f8,1,"crypto/engine/tb_eckey.c",0x3e);
  return;
}

