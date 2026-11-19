/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b44044
 */

undefined8 FUN_00b44044(ulong *param_1,long param_2,ulong *param_3,ulong param_4)

{
  int iVar1;
  undefined8 uVar2;
  long lVar3;
  ulong uVar4;
  
  uVar2 = ossl_prov_is_running();
  if ((int)uVar2 == 0) {
    return uVar2;
  }
  if (((param_1[1] == 0) || (lVar3 = *(long *)(param_1[1] + 0x50), lVar3 == 0)) || (param_1[2] == 0)
     ) {
    ERR_new();
    ERR_set_debug("providers/implementations/exchange/ecx_exch.c",0x7f,"ecx_derive");
    uVar2 = 0x80;
  }
  else {
    uVar4 = *param_1;
    if ((uVar4 == 0x20) || (uVar4 == 0x38)) {
      if (param_2 == 0) {
        *param_3 = uVar4;
        return 1;
      }
      if (param_4 < uVar4) {
        ERR_new();
        ERR_set_debug("providers/implementations/exchange/ecx_exch.c",0x8e,"ecx_derive");
        uVar2 = 0x6a;
      }
      else {
        if (uVar4 == 0x20) {
          iVar1 = ossl_x25519();
          if (iVar1 != 0) {
LAB_00b44178:
            *param_3 = *param_1;
            return 1;
          }
          ERR_new();
          uVar2 = 0x9f;
        }
        else {
          iVar1 = ossl_x448(param_2,lVar3,param_1[2] + 0x11);
          if (iVar1 != 0) goto LAB_00b44178;
          ERR_new();
          uVar2 = 0xaf;
        }
        ERR_set_debug("providers/implementations/exchange/ecx_exch.c",uVar2,"ecx_derive");
        uVar2 = 0xa4;
      }
    }
    else {
      ERR_new();
      ERR_set_debug("providers/implementations/exchange/ecx_exch.c",0x85,"ecx_derive");
      uVar2 = 0x69;
    }
  }
  ERR_set_error(0x39,uVar2,0);
  return 0;
}

