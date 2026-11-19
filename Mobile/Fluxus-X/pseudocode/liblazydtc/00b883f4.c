/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b883f4
 */

ulong psa_mac_abort(uint *param_1)

{
  uint uVar1;
  ulong uVar2;
  
  uVar1 = *param_1;
  uVar2 = (ulong)uVar1;
  if (uVar1 != 0) {
    if (uVar1 == 1) {
      uVar2 = mbedtls_psa_mac_abort(param_1 + 2);
    }
    else {
      uVar2 = 0xffffff79;
    }
    *(undefined1 *)(param_1 + 1) = 0;
    *param_1 = 0;
    *(byte *)((long)param_1 + 5) = *(byte *)((long)param_1 + 5) & 0xfe;
  }
  return uVar2;
}

