/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b86a54
 */

undefined8 psa_allocate_buffer_to_slot(long param_1,size_t param_2)

{
  undefined8 uVar1;
  void *pvVar2;
  
  if (*(long *)(param_1 + 0x28) == 0) {
    pvVar2 = calloc(1,param_2);
    *(void **)(param_1 + 0x28) = pvVar2;
    if (pvVar2 == (void *)0x0) {
      uVar1 = 0xffffff73;
    }
    else {
      uVar1 = 0;
      *(size_t *)(param_1 + 0x30) = param_2;
    }
  }
  else {
    uVar1 = 0xffffff75;
  }
  return uVar1;
}

