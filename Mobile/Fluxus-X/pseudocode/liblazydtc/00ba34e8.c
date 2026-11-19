/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba34e8
 */

undefined8 psa_unregister_read(long param_1)

{
  undefined8 uVar1;
  long lVar2;
  
  if (param_1 == 0) {
    return 0;
  }
  if ((*(uint *)(param_1 + 0x18) & 0xfffffffe) != 2) {
    return 0xffffff69;
  }
  lVar2 = *(long *)(param_1 + 0x20);
  if ((*(uint *)(param_1 + 0x18) == 3) && (lVar2 == 1)) {
    uVar1 = psa_wipe_key_slot();
    return uVar1;
  }
  if (lVar2 == 0) {
    return 0xffffff69;
  }
  *(long *)(param_1 + 0x20) = lVar2 + -1;
  return 0;
}

