/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b65a54
 */

undefined8 ossl_cipher_generic_block_final(long param_1,void *param_2,size_t *param_3,ulong param_4)

{
  void *__src;
  byte bVar1;
  int iVar2;
  undefined8 uVar3;
  ulong uVar4;
  size_t *psVar5;
  
  uVar4 = *(ulong *)(param_1 + 0x58);
  uVar3 = ossl_prov_is_running();
  if ((int)uVar3 == 0) {
    return uVar3;
  }
  bVar1 = *(byte *)(param_1 + 0x6c);
  if ((bVar1 >> 3 & 1) == 0) {
    ERR_new();
    ERR_set_debug("providers/implementations/ciphers/ciphercommon.c",0x193,
                  "ossl_cipher_generic_block_final");
    uVar3 = 0x72;
    goto LAB_00b65ae4;
  }
  if (*(int *)(param_1 + 0x70) == 0) {
    if ((bVar1 >> 1 & 1) == 0) {
      psVar5 = (size_t *)(param_1 + 0x60);
      if (*psVar5 != uVar4) {
        if (((bVar1 & 1) == 0) && (*psVar5 == 0)) goto LAB_00b65bbc;
        ERR_new();
        uVar3 = 0x1bb;
LAB_00b65c48:
        ERR_set_debug("providers/implementations/ciphers/ciphercommon.c",uVar3,
                      "ossl_cipher_generic_block_final");
        uVar3 = 0x6b;
        goto LAB_00b65ae4;
      }
      __src = (void *)(param_1 + 0x10);
      iVar2 = (**(code **)(*(long *)(param_1 + 0xa8) + 8))(param_1,__src,__src,uVar4);
      if (iVar2 != 0) {
        if (((*(byte *)(param_1 + 0x6c) & 1) != 0) &&
           (uVar3 = ossl_cipher_unpadblock(__src,psVar5,uVar4), (int)uVar3 == 0)) {
          return uVar3;
        }
        if (*psVar5 <= param_4) {
          memcpy(param_2,__src,*psVar5);
          *param_3 = *psVar5;
          *psVar5 = 0;
          return 1;
        }
        ERR_new();
        uVar3 = 0x1ca;
        goto LAB_00b65bf4;
      }
      ERR_new();
      uVar3 = 0x1c0;
    }
    else {
      if ((bVar1 & 1) == 0) {
        if (*(ulong *)(param_1 + 0x60) == 0) {
LAB_00b65bbc:
          *param_3 = 0;
          return 1;
        }
        if (*(ulong *)(param_1 + 0x60) != uVar4) {
          ERR_new();
          uVar3 = 0x1a4;
          goto LAB_00b65c48;
        }
      }
      else {
        ossl_cipher_padblock(param_1 + 0x10,param_1 + 0x60,uVar4);
      }
      if (param_4 < uVar4) {
        ERR_new();
        uVar3 = 0x1a9;
LAB_00b65bf4:
        ERR_set_debug("providers/implementations/ciphers/ciphercommon.c",uVar3,
                      "ossl_cipher_generic_block_final");
        uVar3 = 0x6a;
        goto LAB_00b65ae4;
      }
      iVar2 = (**(code **)(*(long *)(param_1 + 0xa8) + 8))(param_1,param_2,param_1 + 0x10,uVar4);
      if (iVar2 != 0) {
        *(undefined8 *)(param_1 + 0x60) = 0;
        *param_3 = uVar4;
        return 1;
      }
      ERR_new();
      uVar3 = 0x1ad;
    }
  }
  else {
    ERR_new();
    uVar3 = 0x199;
  }
  ERR_set_debug("providers/implementations/ciphers/ciphercommon.c",uVar3,
                "ossl_cipher_generic_block_final");
  uVar3 = 0x66;
LAB_00b65ae4:
  ERR_set_error(0x39,uVar3,0);
  return 0;
}

