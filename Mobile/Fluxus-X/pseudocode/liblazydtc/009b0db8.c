/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b0db8
 */

int * ssl_get_cipher_by_char(long param_1,undefined8 param_2,int param_3)

{
  int *piVar1;
  
  piVar1 = (int *)(**(code **)(*(long *)(param_1 + 8) + 0x90))(param_2);
  if (((piVar1 != (int *)0x0) && (param_3 == 0)) && (*piVar1 == 0)) {
    piVar1 = (int *)0x0;
  }
  return piVar1;
}

