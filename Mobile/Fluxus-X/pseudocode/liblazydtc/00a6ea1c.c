/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6ea1c
 */

undefined8 EVP_PKEY_set1_encoded_public_key(long param_1,undefined8 param_2,ulong param_3)

{
  int iVar1;
  undefined8 uVar2;
  code *pcVar3;
  
  if (param_1 != 0) {
    if (*(long *)(param_1 + 0x60) != 0) {
      uVar2 = EVP_PKEY_set_octet_string_param(param_1,"encoded-pub-key",param_2,param_3);
      return uVar2;
    }
    if ((((param_3 >> 0x1f == 0) && (*(long *)(param_1 + 8) != 0)) &&
        (pcVar3 = *(code **)(*(long *)(param_1 + 8) + 0xb0), pcVar3 != (code *)0x0)) &&
       (iVar1 = (*pcVar3)(param_1,9,(long)(int)param_3), 0 < iVar1)) {
      return 1;
    }
  }
  return 0;
}

