/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a106b4
 */

int ASN1_STRING_TABLE_add(int param_1,long param_2,long param_3,ulong param_4,ulong param_5)

{
  int iVar1;
  int *piVar2;
  int *ptr;
  undefined8 uVar3;
  int local_78 [10];
  
  if ((DAT_00d21958 != 0) || (DAT_00d21958 = OPENSSL_sk_new(&LAB_00a108f8), DAT_00d21958 != 0)) {
    OPENSSL_init_crypto(0x40,0);
    local_78[0] = param_1;
    if ((DAT_00d21958 == 0) || (iVar1 = OPENSSL_sk_find(DAT_00d21958,local_78), iVar1 < 0)) {
      piVar2 = OBJ_bsearch_(local_78,&DAT_00752178,0x1c,0x28,(cmp *)&LAB_00a108e8);
    }
    else {
      piVar2 = (int *)OPENSSL_sk_value(DAT_00d21958,iVar1);
    }
    if ((piVar2 != (int *)0x0) && ((*(byte *)(piVar2 + 8) & 1) != 0)) {
joined_r0x00a108a4:
      if (-1 < param_2) {
        *(long *)(piVar2 + 2) = param_2;
      }
      if (-1 < param_3) {
        *(long *)(piVar2 + 4) = param_3;
      }
      if (param_4 != 0) {
        *(ulong *)(piVar2 + 6) = param_4;
      }
      if (param_5 != 0) {
        *(ulong *)(piVar2 + 8) = param_5 | 1;
      }
      return 1;
    }
    ptr = (int *)CRYPTO_zalloc(0x28,"crypto/asn1/a_strnid.c",0xa4);
    if (ptr == (int *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/asn1/a_strnid.c",0xa5,"stable_get");
      ERR_set_error(0xd,0xc0100,0);
    }
    else {
      iVar1 = OPENSSL_sk_push(DAT_00d21958,ptr);
      if (iVar1 != 0) {
        if (piVar2 == (int *)0x0) {
          *ptr = param_1;
          ptr[2] = -1;
          ptr[3] = -1;
          ptr[4] = -1;
          ptr[5] = -1;
          ptr[8] = 1;
          ptr[9] = 0;
          piVar2 = ptr;
        }
        else {
          *ptr = *piVar2;
          uVar3 = *(undefined8 *)(piVar2 + 2);
          *(undefined8 *)(ptr + 4) = *(undefined8 *)(piVar2 + 4);
          *(undefined8 *)(ptr + 2) = uVar3;
          *(undefined8 *)(ptr + 6) = *(undefined8 *)(piVar2 + 6);
          *(ulong *)(ptr + 8) = *(ulong *)(piVar2 + 8) | 1;
          piVar2 = ptr;
        }
        goto joined_r0x00a108a4;
      }
      CRYPTO_free(ptr);
    }
  }
  ERR_new();
  ERR_set_debug("crypto/asn1/a_strnid.c",0xc3,"ASN1_STRING_TABLE_add");
  ERR_set_error(0xd,0xc0100,0);
  return 0;
}

