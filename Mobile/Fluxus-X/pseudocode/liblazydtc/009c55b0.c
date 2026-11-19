/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c55b0
 */

undefined4
ssl_security_cert(long param_1,undefined8 param_2,undefined8 param_3,int param_4,int param_5)

{
  undefined4 uVar1;
  int iVar2;
  uint uVar3;
  long lVar4;
  uint uVar5;
  int local_4c;
  int local_48;
  undefined4 local_44;
  
  uVar5 = 0;
  if (param_4 != 0) {
    uVar5 = 0x1000;
  }
  if (param_5 != 0) {
    lVar4 = X509_get0_pubkey(param_3);
    if (lVar4 == 0) {
      uVar1 = 0xffffffff;
      if (param_1 != 0) goto LAB_009c5608;
LAB_009c5668:
      iVar2 = ssl_ctx_security(param_2,uVar5 | 0x60010,uVar1,0,param_3);
    }
    else {
      uVar1 = EVP_PKEY_get_security_bits();
      if (param_1 == 0) goto LAB_009c5668;
LAB_009c5608:
      iVar2 = ssl_security(param_1,uVar5 | 0x60010,uVar1,0,param_3);
    }
    if (iVar2 == 0) {
      return 399;
    }
    goto LAB_009c56a8;
  }
  lVar4 = X509_get0_pubkey(param_3);
  if (lVar4 == 0) {
    uVar1 = 0xffffffff;
    if (param_1 != 0) goto LAB_009c5644;
LAB_009c5690:
    iVar2 = ssl_ctx_security(param_2,uVar5 | 0x60011,uVar1,0,param_3);
  }
  else {
    uVar1 = EVP_PKEY_get_security_bits();
    if (param_1 == 0) goto LAB_009c5690;
LAB_009c5644:
    iVar2 = ssl_security(param_1,uVar5 | 0x60011,uVar1,0,param_3);
  }
  if (iVar2 == 0) {
    return 0x18d;
  }
LAB_009c56a8:
  uVar3 = X509_get_extension_flags(param_3);
  if ((uVar3 >> 0xd & 1) == 0) {
    iVar2 = X509_get_signature_info(param_3,&local_48,&local_4c,&local_44,0);
    if (iVar2 == 0) {
      local_44 = 0xffffffff;
    }
    if (local_48 == 0) {
      local_48 = local_4c;
    }
    if (param_1 == 0) {
      iVar2 = ssl_ctx_security(param_2,uVar5 | 0x60012,local_44,local_48,param_3);
    }
    else {
      iVar2 = ssl_security(param_1);
    }
  }
  else {
    iVar2 = 1;
  }
  uVar1 = 0x18e;
  if (iVar2 != 0) {
    uVar1 = 1;
  }
  return uVar1;
}

