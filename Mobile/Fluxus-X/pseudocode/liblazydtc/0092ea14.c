/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0092ea14
 */

undefined8 curl_multi_socket(long param_1,undefined4 param_2,undefined8 param_3)

{
  undefined8 uVar1;
  
  if ((*(byte *)(param_1 + 0x231) >> 2 & 1) == 0) {
    uVar1 = FUN_0092ea6c(param_1,0,param_2,0,param_3);
    if ((int)uVar1 < 1) {
      uVar1 = FUN_0092b1f4(param_1);
      return uVar1;
    }
  }
  else {
    uVar1 = 8;
  }
  return uVar1;
}

