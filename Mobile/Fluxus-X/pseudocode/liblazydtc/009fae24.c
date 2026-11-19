/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fae24
 */

undefined8 BIO_ADDR_hostname_string(undefined8 param_1,undefined8 param_2)

{
  undefined8 uVar1;
  int iVar2;
  undefined8 local_18;
  
  local_18 = 0;
  iVar2 = FUN_009fae58(param_1,param_2,&local_18,0);
  uVar1 = 0;
  if (iVar2 != 0) {
    uVar1 = local_18;
  }
  return uVar1;
}

