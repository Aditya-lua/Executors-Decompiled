/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0af28
 */

undefined8 X509_OBJECT_get0_X509_CRL(int *param_1)

{
  undefined8 uVar1;
  
  if (param_1 == (int *)0x0) {
    return 0;
  }
  uVar1 = 0;
  if (*param_1 == 2) {
    uVar1 = *(undefined8 *)(param_1 + 2);
  }
  return uVar1;
}

