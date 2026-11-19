/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c2e20
 */

undefined8 tls_use_ticket(long param_1)

{
  undefined8 uVar1;
  
  if ((*(byte *)(param_1 + 0x9e9) >> 6 & 1) == 0) {
    uVar1 = ssl_security(param_1,10,0,0,0);
    return uVar1;
  }
  return 0;
}

