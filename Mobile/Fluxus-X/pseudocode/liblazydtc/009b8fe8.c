/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b8fe8
 */

undefined8
SSL_bytes_to_cipher_list
          (undefined8 param_1,undefined8 param_2,long param_3,undefined4 param_4,undefined8 param_5,
          undefined8 param_6)

{
  undefined8 uVar1;
  undefined8 local_20;
  long lStack_18;
  
  if (param_3 < 0) {
    return 0;
  }
  local_20 = param_2;
  lStack_18 = param_3;
  uVar1 = bytes_to_cipher_list(param_1,&local_20,param_5,param_6,param_4,0);
  return uVar1;
}

