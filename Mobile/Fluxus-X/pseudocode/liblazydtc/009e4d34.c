/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e4d34
 */

undefined8 ssl_allow_compression(long param_1)

{
  undefined8 uVar1;
  
  if ((*(byte *)(param_1 + 0x9ea) >> 1 & 1) == 0) {
    uVar1 = ssl_security(param_1,0xf,0,0,0);
    return uVar1;
  }
  return 0;
}

