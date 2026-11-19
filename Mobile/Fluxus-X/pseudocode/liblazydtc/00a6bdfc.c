/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6bdfc
 */

uint EVP_PKEY_get_security_bits(long param_1)

{
  uint uVar1;
  code *pcVar2;
  
  uVar1 = 0;
  if (param_1 != 0) {
    uVar1 = *(uint *)(param_1 + 0x8c);
    if ((*(long *)(param_1 + 8) != 0) &&
       (pcVar2 = *(code **)(*(long *)(param_1 + 8) + 0x68), pcVar2 != (code *)0x0)) {
      uVar1 = (*pcVar2)();
    }
    uVar1 = uVar1 & ((int)uVar1 >> 0x1f ^ 0xffffffffU);
  }
  return uVar1;
}

