/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0afd4
 */

undefined8 X509_OBJECT_set1_X509_CRL(int *param_1,undefined8 param_2)

{
  undefined8 uVar1;
  
  uVar1 = 0;
  if ((param_1 != (int *)0x0) && (uVar1 = X509_CRL_up_ref(param_2), (int)uVar1 != 0)) {
    if (*param_1 == 1) {
      X509_free(*(X509 **)(param_1 + 2));
    }
    else if (*param_1 == 2) {
      X509_CRL_free(*(X509_CRL **)(param_1 + 2));
    }
    uVar1 = 1;
    *param_1 = 2;
    *(undefined8 *)(param_1 + 2) = param_2;
  }
  return uVar1;
}

