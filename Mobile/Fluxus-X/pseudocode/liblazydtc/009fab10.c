/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fab10
 */

undefined8 FUN_009fab10(void)

{
  undefined8 *ptr;
  
  ptr = (undefined8 *)BIO_get_data();
  CRYPTO_free((void *)*ptr);
  CRYPTO_free(ptr);
  return 1;
}

