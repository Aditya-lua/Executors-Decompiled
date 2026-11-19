/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ab17c
 */

void ssl3_cleanup_key_block(long param_1)

{
  CRYPTO_clear_free(*(undefined8 *)(param_1 + 0x318),*(undefined8 *)(param_1 + 0x310),"ssl/s3_enc.c"
                    ,0x13a);
  *(undefined8 *)(param_1 + 0x318) = 0;
  *(undefined8 *)(param_1 + 0x310) = 0;
  return;
}

