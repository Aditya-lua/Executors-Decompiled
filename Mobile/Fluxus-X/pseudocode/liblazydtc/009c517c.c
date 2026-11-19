/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c517c
 */

undefined8 FUN_009c517c(long param_1,undefined8 param_2,int param_3)

{
  int iVar1;
  long lVar2;
  undefined8 uVar3;
  ulong uVar4;
  short *psVar5;
  ulong uVar6;
  short sVar7;
  char acStack_64 [52];
  
  lVar2 = X509_get0_pubkey(param_2);
  if (lVar2 == 0) {
    return 0;
  }
  iVar1 = EVP_PKEY_is_a(lVar2,&DAT_002cf33a);
  if (iVar1 != 0) {
    uVar3 = FUN_009c29d4(param_1,lVar2);
    if ((int)uVar3 == 0) {
      return uVar3;
    }
    iVar1 = EVP_PKEY_get_group_name(lVar2,acStack_64,0x32,0);
    if ((0 < iVar1) && (iVar1 = OBJ_txt2nid(acStack_64), iVar1 != 0)) {
      uVar4 = 0;
      psVar5 = &DAT_0074cc38;
      do {
        if (*(int *)(psVar5 + -2) == iVar1) {
          sVar7 = *psVar5;
          goto LAB_009c5220;
        }
        uVar4 = uVar4 + 1;
        psVar5 = psVar5 + 4;
      } while (uVar4 < 0x2a);
    }
    sVar7 = 0;
LAB_009c5220:
    uVar3 = tls1_check_group_id(param_1,sVar7,*(int *)(param_1 + 0x38) == 0);
    if ((int)uVar3 == 0) {
      return uVar3;
    }
    if ((param_3 != 0) && ((*(byte *)(*(long *)(param_1 + 0x898) + 0x1e) & 3) != 0)) {
      if (sVar7 == 0x17) {
        iVar1 = 0x31a;
        uVar4 = *(ulong *)(param_1 + 0x1db0);
      }
      else {
        if (sVar7 != 0x18) {
          return 0;
        }
        iVar1 = 0x31b;
        uVar4 = *(ulong *)(param_1 + 0x1db0);
      }
      if (uVar4 == 0) {
        return 0;
      }
      uVar6 = 0;
      while (iVar1 != *(int *)(*(long *)(*(long *)(param_1 + 0x1da8) + uVar6 * 8) + 0x1c)) {
        uVar6 = uVar6 + 1;
        if (uVar4 <= uVar6) {
          return 0;
        }
      }
    }
  }
  return 1;
}

