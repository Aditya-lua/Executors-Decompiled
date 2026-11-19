/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0092ef00
 */

undefined8 curl_multi_socket_all(long param_1,undefined8 param_2)

{
  undefined8 uVar1;
  
  if ((*(byte *)(param_1 + 0x231) >> 2 & 1) == 0) {
    uVar1 = FUN_0092ea6c(param_1,1,0xffffffff,0,param_2);
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

