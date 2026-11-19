/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b86aa8
 */

undefined8 psa_copy_key_material_into_slot(long param_1,void *param_2,size_t param_3)

{
  undefined8 uVar1;
  void *__dest;
  
  if (*(long *)(param_1 + 0x28) == 0) {
    __dest = calloc(1,param_3);
    *(void **)(param_1 + 0x28) = __dest;
    if (__dest == (void *)0x0) {
      uVar1 = 0xffffff73;
    }
    else {
      *(size_t *)(param_1 + 0x30) = param_3;
      memcpy(__dest,param_2,param_3);
      uVar1 = 0;
    }
  }
  else {
    uVar1 = 0xffffff75;
  }
  return uVar1;
}

