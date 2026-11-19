/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b8e174
 */

undefined4
psa_key_derivation_input_bytes(undefined8 param_1,undefined4 param_2,void *param_3,size_t param_4)

{
  undefined4 uVar1;
  void *__dest;
  
  if (param_4 == 0) {
    __dest = (void *)0x0;
  }
  else {
    __dest = calloc(param_4,1);
    if (__dest == (void *)0x0) {
      uVar1 = 0xffffff73;
      goto LAB_00b8e1ec;
    }
    memcpy(__dest,param_3,param_4);
  }
  uVar1 = FUN_00b8e20c(param_1,param_2,0,__dest,param_4);
LAB_00b8e1ec:
  free(__dest);
  return uVar1;
}

