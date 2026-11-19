/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a53b64
 */

void engine_pkey_meths_free(long param_1)

{
  uint uVar1;
  int iVar2;
  ulong uVar3;
  long local_38;
  EVP_PKEY_METHOD *local_28;
  
  if ((*(code **)(param_1 + 0x48) != (code *)0x0) &&
     (uVar1 = (**(code **)(param_1 + 0x48))(param_1,0,&local_38,0), 0 < (int)uVar1)) {
    uVar3 = 0;
    do {
      iVar2 = (**(code **)(param_1 + 0x48))
                        (param_1,&local_28,0,*(undefined4 *)(local_38 + uVar3 * 4));
      if (iVar2 != 0) {
        EVP_PKEY_meth_free(local_28);
      }
      uVar3 = uVar3 + 1;
    } while (uVar1 != uVar3);
  }
  return;
}

