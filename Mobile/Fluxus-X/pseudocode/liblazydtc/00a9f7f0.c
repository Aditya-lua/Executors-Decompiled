/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9f7f0
 */

undefined8 OSSL_PARAM_set_utf8_ptr(long param_1,char *param_2)

{
  size_t sVar1;
  undefined8 uVar2;
  
  uVar2 = 0;
  if (param_1 != 0) {
    *(undefined8 *)(param_1 + 0x20) = 0;
    if (param_2 == (char *)0x0) {
      sVar1 = 0;
    }
    else {
      sVar1 = strlen(param_2);
    }
    uVar2 = 0;
    *(size_t *)(param_1 + 0x20) = sVar1;
    if (*(int *)(param_1 + 8) == 6) {
      if (*(undefined8 **)(param_1 + 0x10) != (undefined8 *)0x0) {
        **(undefined8 **)(param_1 + 0x10) = param_2;
      }
      uVar2 = 1;
    }
  }
  return uVar2;
}

