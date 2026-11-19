/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b06e44
 */

undefined8 X509_check_ip(undefined8 param_1,long param_2)

{
  undefined8 uVar1;
  
  if (param_2 == 0) {
    return 0xfffffffe;
  }
  uVar1 = FUN_00b06b10();
  return uVar1;
}

