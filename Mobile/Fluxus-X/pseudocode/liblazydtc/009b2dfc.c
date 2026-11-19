/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b2dfc
 */

undefined4 SSL_get0_dane_authority(long param_1,undefined8 *param_2,undefined8 *param_3)

{
  int iVar1;
  undefined4 uVar2;
  undefined8 uVar3;
  
  iVar1 = OPENSSL_sk_num(*(undefined8 *)(param_1 + 0x4e8));
  if ((iVar1 < 1) || (*(long *)(param_1 + 0x9b8) != 0)) {
    uVar2 = 0xffffffff;
  }
  else {
    if (*(long *)(param_1 + 0x4f8) != 0) {
      if (param_2 != (undefined8 *)0x0) {
        *param_2 = *(undefined8 *)(param_1 + 0x500);
      }
      if (param_3 != (undefined8 *)0x0) {
        uVar3 = 0;
        if (*(long *)(param_1 + 0x500) == 0) {
          uVar3 = *(undefined8 *)(*(long *)(param_1 + 0x4f8) + 0x18);
        }
        *param_3 = uVar3;
      }
    }
    uVar2 = *(undefined4 *)(param_1 + 0x50c);
  }
  return uVar2;
}

