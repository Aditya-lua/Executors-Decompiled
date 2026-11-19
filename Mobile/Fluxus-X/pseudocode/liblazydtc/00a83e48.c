/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a83e48
 */

int CRYPTO_set_ex_data(CRYPTO_EX_DATA *ad,int idx,void *val)

{
  undefined4 uVar1;
  int iVar2;
  int iVar3;
  long lVar4;
  void *pvVar5;
  undefined8 uVar6;
  int *piVar7;
  
  piVar7 = &ad->dummy;
  if (*(long *)piVar7 == 0) {
    lVar4 = OPENSSL_sk_new_null();
    *(long *)piVar7 = lVar4;
    if (lVar4 == 0) {
      ERR_new();
      uVar6 = 0x1d9;
LAB_00a83f2c:
      ERR_set_debug("crypto/ex_data.c",uVar6,"CRYPTO_set_ex_data");
      uVar1 = 0xc0100;
      goto LAB_00a83f3c;
    }
  }
  iVar2 = OPENSSL_sk_num();
  uVar6 = *(undefined8 *)piVar7;
  if (iVar2 <= idx) {
    iVar2 = iVar2 + -1;
    do {
      iVar3 = OPENSSL_sk_push(uVar6,0);
      if (iVar3 == 0) {
        ERR_new();
        uVar6 = 0x1e0;
        goto LAB_00a83f2c;
      }
      uVar6 = *(undefined8 *)piVar7;
      iVar2 = iVar2 + 1;
    } while (iVar2 < idx);
  }
  pvVar5 = (void *)OPENSSL_sk_set(uVar6,idx,val);
  if (pvVar5 == val) {
    return 1;
  }
  ERR_new();
  ERR_set_debug("crypto/ex_data.c",0x1e6,"CRYPTO_set_ex_data");
  uVar1 = 0x80106;
LAB_00a83f3c:
  ERR_set_error(0xf,uVar1,0);
  return 0;
}

