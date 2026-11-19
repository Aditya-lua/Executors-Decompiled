/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a7cb9c
 */

undefined8 ossl_ffc_named_group_set(long param_1,long param_2)

{
  undefined4 uVar1;
  undefined8 uVar2;
  
  uVar2 = 0;
  if ((param_1 != 0) && (param_2 != 0)) {
    ossl_ffc_params_set0_pqg
              (param_1,*(undefined8 *)(param_2 + 0x18),*(undefined8 *)(param_2 + 0x20),
               *(undefined8 *)(param_2 + 0x28));
    uVar1 = *(undefined4 *)(param_2 + 0x10);
    uVar2 = 1;
    *(undefined4 *)(param_1 + 0x34) = 0;
    *(undefined4 *)(param_1 + 0x58) = uVar1;
  }
  return uVar2;
}

