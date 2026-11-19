/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b11eb4
 */

ulong FUN_00b11eb4(long param_1,X509 *param_2,int param_3)

{
  uint uVar1;
  byte bVar2;
  int iVar3;
  uint uVar4;
  int iVar5;
  byte *pbVar6;
  X509_PUBKEY *a;
  undefined8 uVar7;
  EVP_MD *type;
  long *plVar8;
  uint uVar9;
  uchar *ptr;
  int iVar10;
  ulong uVar11;
  size_t count;
  uchar *__s1;
  long *plVar12;
  uint local_bc;
  uint local_b8;
  uint local_ac;
  uchar auStack_a8 [64];
  uchar *local_68;
  
  plVar12 = *(long **)(param_1 + 0xf0);
  uVar4 = 10;
  if (param_3 != 0) {
    uVar4 = 5;
  }
  if (*(int *)(param_1 + 0x94) <= param_3) {
    uVar4 = uVar4 & 3;
  }
  uVar1 = uVar4 & 0xc;
  if (*(int *)((long)plVar12 + 0x2c) < 0) {
    uVar1 = uVar4;
  }
  local_ac = 0;
  if (((uVar1 & *(uint *)(plVar12 + 5)) == 0) || (iVar3 = OPENSSL_sk_num(plVar12[1]), iVar3 < 1)) {
    ptr = (uchar *)0x0;
  }
  else {
    iVar10 = 0;
    __s1 = (uchar *)0x0;
    ptr = (uchar *)0x0;
    count = 0;
    local_b8 = 0x100;
    uVar9 = 0x100;
    uVar4 = 0x100;
    local_bc = 0x100;
    do {
      pbVar6 = (byte *)OPENSSL_sk_value(plVar12[1],iVar10);
      bVar2 = *pbVar6;
      if ((1 << (ulong)(bVar2 & 0x1f) & uVar1) != 0) {
        if (local_b8 != bVar2) {
          uVar9 = 0x100;
          local_bc = (uint)*(byte *)(*(long *)(*plVar12 + 8) + (ulong)pbVar6[2]);
          local_b8 = (uint)bVar2;
        }
        bVar2 = pbVar6[1];
        if (uVar4 == bVar2) {
          uVar11 = (ulong)pbVar6[2];
          if ((uVar11 != 0) && (*(byte *)(*(long *)(*plVar12 + 8) + uVar11) < local_bc))
          goto LAB_00b120c0;
          if (uVar9 != pbVar6[2]) {
            plVar8 = (long *)*plVar12;
            goto LAB_00b12058;
          }
        }
        else {
          CRYPTO_free(ptr);
          local_68 = (uchar *)0x0;
          if (bVar2 == 1) {
            a = (X509_PUBKEY *)X509_get_X509_PUBKEY(param_2);
            uVar4 = i2d_X509_PUBKEY(a,&local_68);
            ptr = local_68;
          }
          else {
            if (bVar2 != 0) {
              ERR_new();
              ERR_set_debug("crypto/x509/x509_vfy.c",0xa6d,"dane_i2d");
              uVar7 = 0x85;
              goto LAB_00b12164;
            }
            uVar4 = i2d_X509(param_2,&local_68);
            ptr = local_68;
          }
          local_68 = ptr;
          if (((int)uVar4 < 0) || (count = (size_t)uVar4, ptr == (uchar *)0x0)) {
            ERR_new();
            ERR_set_debug("crypto/x509/x509_vfy.c",0xa72,"dane_i2d");
            uVar7 = 0xc0100;
LAB_00b12164:
            ERR_set_error(0xb,uVar7,0);
            return 0xffffffff;
          }
          plVar8 = (long *)*plVar12;
          uVar11 = (ulong)pbVar6[2];
          local_bc = (uint)*(byte *)(plVar8[1] + uVar11);
          uVar4 = (uint)bVar2;
LAB_00b12058:
          type = *(EVP_MD **)(*plVar8 + uVar11 * 8);
          local_ac = (uint)count;
          uVar9 = (uint)uVar11;
          if (type == (EVP_MD *)0x0) {
            __s1 = ptr;
          }
          else {
            iVar5 = EVP_Digest(ptr,count,auStack_a8,&local_ac,type,(ENGINE *)0x0);
            if (iVar5 == 0) {
              uVar11 = 0xffffffff;
              goto LAB_00b120dc;
            }
            __s1 = auStack_a8;
          }
        }
        if ((*(ulong *)(pbVar6 + 0x10) == (ulong)local_ac) &&
           (iVar5 = memcmp(__s1,*(void **)(pbVar6 + 8),(ulong)local_ac), iVar5 == 0)) {
          uVar4 = 1 << (ulong)(local_b8 & 0x1f);
          uVar11 = (ulong)((uVar4 & 0xc) != 0);
          if (((uVar4 & 0xc) != 0) || (*(int *)((long)plVar12 + 0x2c) < 0)) {
            *(int *)((long)plVar12 + 0x2c) = param_3;
            plVar12[3] = (long)pbVar6;
            CRYPTO_free((void *)plVar12[4]);
            plVar12[4] = (long)param_2;
            X509_up_ref();
            goto LAB_00b120dc;
          }
          break;
        }
      }
LAB_00b120c0:
      iVar10 = iVar10 + 1;
    } while (iVar10 < iVar3);
  }
  uVar11 = 0;
LAB_00b120dc:
  CRYPTO_free(ptr);
  return uVar11;
}

