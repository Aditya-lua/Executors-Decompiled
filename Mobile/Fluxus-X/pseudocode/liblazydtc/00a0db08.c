/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0db08
 */

void OPENSSL_INIT_new(void)

{
  undefined8 *puVar1;
  
  puVar1 = malloc(0x18);
  if (puVar1 != (undefined8 *)0x0) {
    *puVar1 = 0;
    puVar1[1] = 0;
    puVar1[2] = 0x32;
  }
  return;
}

