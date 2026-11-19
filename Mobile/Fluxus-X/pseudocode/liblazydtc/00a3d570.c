/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a3d570
 */

undefined8 FUN_00a3d570(long param_1,long *param_2,long *param_3)

{
  long lVar1;
  long lVar2;
  undefined8 uVar3;
  
  if ((*(long *)(param_1 + 0x88) == 0) || (*(long *)(param_1 + 0x90) == 0)) {
    ERR_new();
    ERR_set_debug("crypto/ec/ecx_meth.c",0x2dc,"validate_ecx_derive");
    uVar3 = 0x8c;
  }
  else {
    lVar1 = evp_pkey_get_legacy();
    lVar2 = evp_pkey_get_legacy(*(undefined8 *)(param_1 + 0x90));
    if ((lVar1 == 0) || (*(long *)(lVar1 + 0x50) == 0)) {
      ERR_new();
      ERR_set_debug("crypto/ec/ecx_meth.c",0x2e2,"validate_ecx_derive");
      uVar3 = 0x7b;
    }
    else {
      if (lVar2 != 0) {
        *param_2 = *(long *)(lVar1 + 0x50);
        *param_3 = lVar2 + 0x11;
        return 1;
      }
      ERR_new();
      ERR_set_debug("crypto/ec/ecx_meth.c",0x2e6,"validate_ecx_derive");
      uVar3 = 0x85;
    }
  }
  ERR_set_error(0x10,uVar3,0);
  return 0;
}

