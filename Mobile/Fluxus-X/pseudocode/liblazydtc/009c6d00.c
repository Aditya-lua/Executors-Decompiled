/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c6d00
 */

void tls13_generate_handshake_secret(long param_1,undefined8 param_2,undefined8 param_3)

{
  undefined8 uVar1;
  
  uVar1 = ssl_handshake_md();
  tls13_generate_secret(param_1,uVar1,param_1 + 0x544,param_2,param_3,param_1 + 0x584);
  return;
}

