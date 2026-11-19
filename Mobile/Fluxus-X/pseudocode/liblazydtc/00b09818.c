/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b09818
 */

int X509_chain_check_suiteb(int *param_1,long param_2,long param_3,ulong param_4)

{
  int iVar1;
  int iVar2;
  undefined4 uVar3;
  long lVar4;
  long lVar5;
  int iVar6;
  uint uVar7;
  ulong local_a8;
  char acStack_a0 [80];
  undefined1 auStack_48 [8];
  
  if ((param_4 & 0x30000) == 0) {
    return 0;
  }
  iVar2 = 0;
  uVar7 = (uint)param_4;
  local_a8 = param_4;
  if (param_2 == 0) {
    param_2 = OPENSSL_sk_value(param_3,0);
    iVar2 = 1;
    if (param_2 != 0) goto LAB_00b09870;
    lVar4 = 0;
  }
  else {
LAB_00b09870:
    lVar4 = X509_PUBKEY_get0(*(undefined8 *)(param_2 + 0x50));
  }
  if (param_3 == 0) {
    if ((lVar4 == 0) || (iVar2 = EVP_PKEY_is_a(lVar4,&DAT_002cf33a), iVar2 == 0)) {
      return 0x39;
    }
    iVar2 = EVP_PKEY_get_group_name(lVar4,acStack_a0,0x50,auStack_48);
    if (iVar2 == 0) {
      return 0x3a;
    }
    iVar2 = OBJ_txt2nid(acStack_a0);
    if (iVar2 == 0x19f) {
      uVar7 = uVar7 >> 0x10;
    }
    else {
      if (iVar2 != 0x2cb) {
        return 0x3a;
      }
      uVar7 = uVar7 >> 0x11;
    }
    if ((uVar7 & 1) == 0) {
      return 0x3c;
    }
    return 0;
  }
  lVar5 = X509_get_version(param_2);
  if (lVar5 != 2) {
    iVar2 = 0;
    iVar1 = 0x38;
    goto LAB_00b0998c;
  }
  if ((lVar4 == 0) || (iVar1 = EVP_PKEY_is_a(lVar4,&DAT_002cf33a), iVar1 == 0)) {
    iVar1 = 0x39;
  }
  else {
    iVar1 = EVP_PKEY_get_group_name(lVar4,acStack_a0,0x50,auStack_48);
    if (iVar1 != 0) {
      iVar1 = OBJ_txt2nid(acStack_a0);
      if (iVar1 == 0x19f) {
        if ((uVar7 >> 0x10 & 1) == 0) {
LAB_00b09984:
          iVar1 = 0x3c;
          goto LAB_00b09988;
        }
      }
      else {
        if (iVar1 != 0x2cb) goto LAB_00b0996c;
        if ((uVar7 >> 0x11 & 1) == 0) goto LAB_00b09984;
        local_a8 = param_4 & 0xfffffffffffeffff;
      }
      iVar1 = OPENSSL_sk_num(param_3);
      uVar3 = X509_get_signature_nid(param_2);
      if (iVar2 < iVar1) {
        do {
          lVar5 = OPENSSL_sk_value(param_3,iVar2);
          lVar4 = X509_get_version();
          if (lVar4 != 2) {
            iVar1 = 0x38;
            goto LAB_00b0998c;
          }
          if (lVar5 == 0) {
            lVar4 = 0;
          }
          else {
            lVar4 = X509_PUBKEY_get0(*(undefined8 *)(lVar5 + 0x50));
          }
          iVar1 = FUN_00b09a98(lVar4,uVar3,&local_a8);
          if (iVar1 != 0) goto LAB_00b0998c;
          iVar2 = iVar2 + 1;
          iVar1 = OPENSSL_sk_num(param_3);
          uVar3 = X509_get_signature_nid(lVar5);
        } while (iVar2 < iVar1);
      }
      iVar1 = FUN_00b09a98(lVar4,uVar3,&local_a8);
      if (iVar1 == 0) {
        return 0;
      }
      goto LAB_00b0998c;
    }
LAB_00b0996c:
    iVar1 = 0x3a;
  }
LAB_00b09988:
  iVar2 = 0;
LAB_00b0998c:
  iVar6 = iVar1;
  if (local_a8 != param_4 && iVar1 == 0x3c) {
    iVar6 = 0x3d;
  }
  if (param_1 == (int *)0x0) {
    return iVar6;
  }
  *param_1 = iVar2 - (uint)(iVar2 != 0 && iVar1 - 0x3bU < 2);
  return iVar6;
}

