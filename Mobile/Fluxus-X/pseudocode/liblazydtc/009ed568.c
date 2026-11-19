/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ed568
 */

int FUN_009ed568(code *param_1,long param_2,uint param_3,_union_257 param_4)

{
  int iVar1;
  int iVar2;
  int iVar3;
  char *__s;
  size_t sVar4;
  byte *pbVar5;
  long lVar6;
  uint uVar7;
  uint uVar8;
  byte *pbVar9;
  char local_74 [4];
  byte *local_70;
  ASN1_TYPE local_68;
  char local_54;
  char local_53;
  
  local_74[0] = '\0';
  iVar2 = (param_4.asn1_string)->type;
  iVar1 = 0;
  if ((param_3 >> 6 & 1) != 0) {
    __s = ASN1_tag2str(iVar2);
    sVar4 = strlen(__s);
    iVar1 = (*param_1)(param_2,__s,sVar4 & 0xffffffff);
    if (iVar1 == 0) {
      return -1;
    }
    iVar1 = (*param_1)(param_2,&DAT_002bcda4,1);
    if (iVar1 == 0) {
      return -1;
    }
    iVar1 = (int)sVar4 + 1;
  }
  if ((param_3 >> 7 & 1) == 0) {
    if ((param_3 >> 5 & 1) == 0) {
      if (iVar2 - 1U < 0x1e) {
        uVar8 = (uint)(char)(&DAT_0074dd74)[iVar2];
      }
      else {
        uVar8 = 0xffffffff;
      }
      uVar7 = uVar8;
      if (uVar8 == 0xffffffff && (param_3 & 0x100) == 0) {
        uVar7 = 1;
      }
      if (((param_3 >> 8 & 1) != 0) && (uVar8 == 0xffffffff)) goto LAB_009ed6ec;
    }
    else {
      uVar7 = 1;
    }
    uVar8 = uVar7;
    if (((param_3 >> 4 & 1) != 0) && (uVar8 = uVar7 | 8, uVar7 == 0)) {
      uVar8 = 1;
    }
    iVar2 = FUN_009ed950((param_4.asn1_string)->data,(param_4.asn1_string)->length,uVar8,
                         param_3 & 0x40f,local_74,param_1,0);
    if (-1 < iVar2) {
      iVar3 = iVar2 + iVar1;
      if (local_74[0] != '\0') {
        iVar3 = iVar2 + iVar1 + 2;
      }
      if (param_2 == 0) {
        return iVar3;
      }
      if (((local_74[0] == '\0') || (iVar1 = (*param_1)(param_2,&DAT_002c6ec4,1), iVar1 != 0)) &&
         (iVar1 = FUN_009ed950((param_4.asn1_string)->data,(param_4.asn1_string)->length,uVar8,
                               param_3 & 0x40f,0,param_1,param_2), -1 < iVar1)) {
        if (local_74[0] == '\0') {
          return iVar3;
        }
        iVar1 = (*param_1)(param_2,&DAT_002c6ec4,1);
        if (iVar1 != 0) {
          return iVar3;
        }
      }
    }
  }
  else {
LAB_009ed6ec:
    iVar2 = (*param_1)(param_2,&DAT_002ad461,1);
    if (iVar2 != 0) {
      if ((param_3 >> 9 & 1) == 0) {
        iVar2 = (param_4.asn1_string)->length;
        lVar6 = (long)iVar2;
        if (param_2 != 0) {
          if (iVar2 == 0) {
            return iVar1 + 1;
          }
          pbVar5 = (param_4.asn1_string)->data;
          do {
            local_54 = "0123456789ABCDEF"[*pbVar5 >> 4];
            local_53 = "0123456789ABCDEF"[(ulong)*pbVar5 & 0xf];
            iVar3 = (*param_1)(param_2,&local_54,2);
            if (iVar3 == 0) {
              return -1;
            }
            lVar6 = lVar6 + -1;
            pbVar5 = pbVar5 + 1;
          } while (lVar6 != 0);
        }
        if (iVar2 << 1 < 0) {
          return -1;
        }
        uVar7 = iVar2 << 1 | 1;
      }
      else {
        local_68.type = (param_4.asn1_string)->type;
        local_68.value.ptr = param_4.ptr;
        iVar2 = i2d_ASN1_TYPE(&local_68,(uchar **)0x0);
        if (iVar2 < 1) {
          return -1;
        }
        lVar6 = (long)iVar2;
        pbVar5 = CRYPTO_malloc(iVar2,"crypto/asn1/a_strex.c",0x11d);
        if (pbVar5 == (byte *)0x0) {
          ERR_new();
          ERR_set_debug("crypto/asn1/a_strex.c",0x11e,"do_dump");
          ERR_set_error(0xd,0xc0100,0);
          return -1;
        }
        local_70 = pbVar5;
        i2d_ASN1_TYPE(&local_68,&local_70);
        if (param_2 != 0) {
          pbVar9 = pbVar5;
          do {
            local_54 = "0123456789ABCDEF"[*pbVar9 >> 4];
            local_53 = "0123456789ABCDEF"[(ulong)*pbVar9 & 0xf];
            iVar3 = (*param_1)(param_2,&local_54,2);
            if (iVar3 == 0) {
              iVar2 = -1;
              goto LAB_009ed858;
            }
            lVar6 = lVar6 + -1;
            pbVar9 = pbVar9 + 1;
          } while (lVar6 != 0);
        }
        iVar2 = iVar2 << 1;
LAB_009ed858:
        CRYPTO_free(pbVar5);
        if (iVar2 < 0) {
          return -1;
        }
        uVar7 = iVar2 + 1;
      }
      if (-1 < (int)uVar7) {
        return uVar7 + iVar1;
      }
    }
  }
  return -1;
}

