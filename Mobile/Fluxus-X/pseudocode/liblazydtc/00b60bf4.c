/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b60bf4
 */

undefined8
FUN_00b60bf4(long param_1,long param_2,ulong *param_3,ulong param_4,undefined8 param_5,ulong param_6
            )

{
  int iVar1;
  ulong uVar2;
  uint local_44;
  
  iVar1 = ECDSA_size(*(EC_KEY **)(param_1 + 0x10));
  uVar2 = (ulong)iVar1;
  if (param_2 != 0) {
    if (param_4 < uVar2) {
      return 0;
    }
    if ((*(ulong *)(param_1 + 0x170) != 0) && (*(ulong *)(param_1 + 0x170) != param_6)) {
      return 0;
    }
    iVar1 = ossl_sm2_internal_sign
                      (param_5,param_6 & 0xffffffff,param_2,&local_44,
                       *(undefined8 *)(param_1 + 0x10));
    if (iVar1 < 1) {
      return 0;
    }
    uVar2 = (ulong)local_44;
  }
  *param_3 = uVar2;
  return 1;
}

