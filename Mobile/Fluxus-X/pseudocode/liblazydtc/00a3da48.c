/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a3da48
 */

undefined8 ossl_ecx_public_from_private(undefined8 *param_1)

{
  int iVar1;
  undefined8 uVar2;
  
  switch(*(undefined4 *)(param_1 + 0xc)) {
  case 0:
    ossl_x25519_public_from_private((long)param_1 + 0x11,param_1[10]);
    return 1;
  case 1:
    ossl_x448_public_from_private((long)param_1 + 0x11,param_1[10]);
    return 1;
  case 2:
    iVar1 = ossl_ed25519_public_from_private(*param_1,(long)param_1 + 0x11,param_1[10],param_1[1]);
    if (iVar1 != 0) {
      return 1;
    }
    ERR_new();
    uVar2 = 0x25;
    break;
  case 3:
    iVar1 = ossl_ed448_public_from_private(*param_1,(long)param_1 + 0x11,param_1[10],param_1[1]);
    if (iVar1 != 0) {
      return 1;
    }
    ERR_new();
    uVar2 = 0x2f;
    break;
  default:
    return 1;
  }
  ERR_set_debug("crypto/ec/ecx_backend.c",uVar2,"ossl_ecx_public_from_private");
  ERR_set_error(0x10,0xa6,0);
  return 0;
}

