/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa48fc
 */

undefined8 * FUN_00aa48fc(undefined8 *param_1)

{
  undefined8 *ptr;
  char *pcVar1;
  void *ptr_00;
  
  ptr = (undefined8 *)CRYPTO_zalloc(0x10,"crypto/provider_core.c",0x102);
  if (ptr == (undefined8 *)0x0) {
    return (undefined8 *)0x0;
  }
  if ((char *)*param_1 != (char *)0x0) {
    pcVar1 = CRYPTO_strdup((char *)*param_1,"crypto/provider_core.c",0x107);
    *ptr = pcVar1;
    ptr_00 = (void *)0x0;
    if (pcVar1 == (char *)0x0) goto LAB_00aa496c;
  }
  if ((char *)param_1[1] == (char *)0x0) {
    return ptr;
  }
  pcVar1 = CRYPTO_strdup((char *)param_1[1],"crypto/provider_core.c",0x10c);
  ptr[1] = pcVar1;
  if (pcVar1 != (char *)0x0) {
    return ptr;
  }
  ptr_00 = (void *)*ptr;
LAB_00aa496c:
  CRYPTO_free(ptr_00);
  CRYPTO_free(ptr);
  return (undefined8 *)0x0;
}

