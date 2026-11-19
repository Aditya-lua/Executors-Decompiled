/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b433a4
 */

undefined8 FUN_00b433a4(long param_1,uchar *param_2,ulong *param_3,ulong param_4,int param_5)

{
  int iVar1;
  undefined8 uVar2;
  ulong uVar3;
  BIGNUM *local_38;
  
  local_38 = (BIGNUM *)0x0;
  if ((*(DH **)(param_1 + 8) == (DH *)0x0) || (*(long *)(param_1 + 0x10) == 0)) {
    ERR_new();
    ERR_set_debug("providers/implementations/exchange/dh_exch.c",0x98,"dh_plain_derive");
    uVar2 = 0x80;
LAB_00b43440:
    ERR_set_error(0x39,uVar2,0);
    uVar2 = 0;
  }
  else {
    iVar1 = DH_size(*(DH **)(param_1 + 8));
    uVar3 = (ulong)iVar1;
    if (param_2 != (uchar *)0x0) {
      if (param_4 < uVar3) {
        ERR_new();
        ERR_set_debug("providers/implementations/exchange/dh_exch.c",0xa2,"dh_plain_derive");
        uVar2 = 0x6a;
        goto LAB_00b43440;
      }
      DH_get0_key(*(undefined8 *)(param_1 + 0x10),&local_38,0);
      if (param_5 == 0) {
        iVar1 = DH_compute_key(param_2,local_38,*(DH **)(param_1 + 8));
      }
      else {
        iVar1 = DH_compute_key_padded(param_2,local_38,*(DH **)(param_1 + 8));
      }
      if (iVar1 < 1) {
        return 0;
      }
      uVar3 = (ulong)iVar1;
    }
    uVar2 = 1;
    *param_3 = uVar3;
  }
  return uVar2;
}

