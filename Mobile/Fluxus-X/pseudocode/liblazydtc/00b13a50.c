/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b13a50
 */

long * ossl_policy_level_add_node(long param_1,long param_2,long param_3,ulong *param_4,int param_5)

{
  int iVar1;
  long *ptr;
  long lVar2;
  ulong uVar3;
  undefined8 uVar4;
  
  if ((param_4[1] != 0) && (param_4[1] <= *param_4)) {
    return (long *)0x0;
  }
  ptr = (long *)CRYPTO_zalloc(0x18,"crypto/x509/pcy_node.c",0x47);
  if (ptr == (long *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/x509/pcy_node.c",0x49,"ossl_policy_level_add_node");
    ERR_set_error(0x22,0xc0100,0);
    return (long *)0x0;
  }
  *ptr = param_2;
  ptr[1] = param_3;
  if (param_1 != 0) {
    iVar1 = OBJ_obj2nid(*(ASN1_OBJECT **)(param_2 + 8));
    if (iVar1 != 0x2ea) {
      lVar2 = *(long *)(param_1 + 8);
      if (lVar2 == 0) {
        lVar2 = OPENSSL_sk_new(&LAB_00b1395c);
        *(long *)(param_1 + 8) = lVar2;
        if (lVar2 != 0) goto LAB_00b13b28;
        ERR_new();
        uVar4 = 0x58;
      }
      else {
LAB_00b13b28:
        iVar1 = OPENSSL_sk_push(lVar2,ptr);
        if (iVar1 != 0) goto joined_r0x00b13b34;
        ERR_new();
        uVar4 = 0x5c;
      }
      ERR_set_debug("crypto/x509/pcy_node.c",uVar4,"ossl_policy_level_add_node");
      ERR_set_error(0x22,0xc0100,0);
      goto LAB_00b13c34;
    }
    if (*(long *)(param_1 + 0x10) != 0) goto LAB_00b13c34;
    *(long **)(param_1 + 0x10) = ptr;
  }
joined_r0x00b13b34:
  if (param_5 == 0) goto LAB_00b13b58;
  uVar3 = param_4[4];
  if (uVar3 == 0) {
    uVar3 = OPENSSL_sk_new_null();
    param_4[4] = uVar3;
    if (uVar3 != 0) goto LAB_00b13b4c;
    ERR_new();
    uVar4 = 0x66;
  }
  else {
LAB_00b13b4c:
    iVar1 = OPENSSL_sk_push(uVar3,param_2);
    if (iVar1 != 0) {
LAB_00b13b58:
      *param_4 = *param_4 + 1;
      if (param_3 == 0) {
        return ptr;
      }
      *(int *)(param_3 + 0x10) = *(int *)(param_3 + 0x10) + 1;
      return ptr;
    }
    ERR_new();
    uVar4 = 0x6a;
  }
  ERR_set_debug("crypto/x509/pcy_node.c",uVar4,"ossl_policy_level_add_node");
  ERR_set_error(0x22,0xc0100,0);
  if (param_1 != 0) {
    if (*(long **)(param_1 + 0x10) == ptr) {
      *(undefined8 *)(param_1 + 0x10) = 0;
    }
    else {
      OPENSSL_sk_pop(*(undefined8 *)(param_1 + 8));
    }
  }
LAB_00b13c34:
  CRYPTO_free(ptr);
  return (long *)0x0;
}

