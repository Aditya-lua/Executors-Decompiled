/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a528d4
 */

void engine_pkey_asn1_meths_free(long param_1)

{
  uint uVar1;
  int iVar2;
  ulong uVar3;
  long local_38;
  EVP_PKEY_ASN1_METHOD *local_28;
  
  if ((*(code **)(param_1 + 0x50) != (code *)0x0) &&
     (uVar1 = (**(code **)(param_1 + 0x50))(param_1,0,&local_38,0), 0 < (int)uVar1)) {
    uVar3 = 0;
    do {
      iVar2 = (**(code **)(param_1 + 0x50))
                        (param_1,&local_28,0,*(undefined4 *)(local_38 + uVar3 * 4));
      if (iVar2 != 0) {
        EVP_PKEY_asn1_free(local_28);
      }
      uVar3 = uVar3 + 1;
    } while (uVar1 != uVar3);
  }
  return;
}

