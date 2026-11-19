/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0096f9e8
 */

long FUN_0096f9e8(undefined8 param_1,undefined8 param_2)

{
  int iVar1;
  undefined8 uVar2;
  
  uVar2 = OpenSSL_version(6);
  iVar1 = curl_msnprintf(param_1,param_2,"%s/%s","OpenSSL",uVar2);
  return (long)iVar1;
}

