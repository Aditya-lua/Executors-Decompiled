/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba2cf0
 */

undefined8 psa_initialize_key_slots(void)

{
  DAT_00d260d8 = calloc(0x20,0x38);
  if (DAT_00d260d8 == (void *)0x0) {
    return 0xffffff73;
  }
  DAT_00d26190 = 1;
  return 0;
}

