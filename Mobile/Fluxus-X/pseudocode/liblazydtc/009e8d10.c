/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e8d10
 */

bool FUN_009e8d10(undefined8 param_1,undefined8 param_2)

{
  int iVar1;
  
  iVar1 = tls_construct_extensions(param_1,param_2,0x400,0,0);
  return iVar1 != 0;
}

