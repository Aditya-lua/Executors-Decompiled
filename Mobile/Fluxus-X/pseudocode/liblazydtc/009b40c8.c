/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b40c8
 */

undefined8 SSL_get0_peer_certificate(long param_1)

{
  undefined8 uVar1;
  
  uVar1 = 0;
  if (param_1 != 0) {
    if (*(long *)(param_1 + 0x918) == 0) {
      return 0;
    }
    uVar1 = *(undefined8 *)(*(long *)(param_1 + 0x918) + 0x2b8);
  }
  return uVar1;
}

