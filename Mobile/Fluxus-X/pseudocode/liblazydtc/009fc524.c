/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fc524
 */

bool BIO_write_ex(long param_1,undefined8 param_2,long param_3)

{
  int iVar1;
  
  iVar1 = FUN_009fc30c();
  return 0 < iVar1 || param_1 != 0 && param_3 == 0;
}

