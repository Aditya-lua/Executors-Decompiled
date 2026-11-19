/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0aa34
 */

undefined8 X509_STORE_CTX_get_by_subject(long *param_1,int param_2,undefined8 param_3,int *param_4)

{
  int iVar1;
  int iVar2;
  undefined8 uVar3;
  int *piVar4;
  long lVar5;
  undefined8 *puVar6;
  long lVar7;
  code *pcVar8;
  long lVar9;
  int local_1f0 [2];
  undefined8 local_1e8;
  undefined1 auStack_1e0 [24];
  undefined8 auStack_1c8 [6];
  undefined8 local_198 [39];
  int local_60 [2];
  undefined1 *local_58;
  
  lVar9 = *param_1;
  if (lVar9 == 0) {
    return 0;
  }
  local_1f0[0] = 0;
  local_1e8 = 0;
  uVar3 = CRYPTO_THREAD_write_lock(*(undefined8 *)(lVar9 + 0x98));
  if ((int)uVar3 == 0) {
    return uVar3;
  }
  uVar3 = *(undefined8 *)(lVar9 + 8);
  local_60[0] = param_2;
  if (param_2 == 0) {
LAB_00b0aab4:
    piVar4 = (int *)0x0;
  }
  else {
    if (param_2 == 2) {
      puVar6 = auStack_1c8;
LAB_00b0aac8:
      local_58 = auStack_1e0;
      *puVar6 = param_3;
    }
    else if (param_2 == 1) {
      puVar6 = local_198;
      goto LAB_00b0aac8;
    }
    iVar1 = OPENSSL_sk_find_all(uVar3,local_60,0);
    if (iVar1 == -1) goto LAB_00b0aab4;
    piVar4 = (int *)OPENSSL_sk_value(uVar3);
  }
  CRYPTO_THREAD_unlock(*(undefined8 *)(lVar9 + 0x98));
  if ((param_2 == 2) || (piVar4 == (int *)0x0)) {
    iVar1 = OPENSSL_sk_num(*(undefined8 *)(lVar9 + 0x10));
    if (0 < iVar1) {
      iVar1 = 0;
      do {
        lVar5 = OPENSSL_sk_value(*(undefined8 *)(lVar9 + 0x10),iVar1);
        if ((*(int *)(lVar5 + 4) == 0) && (lVar7 = *(long *)(lVar5 + 8), lVar7 != 0)) {
          pcVar8 = *(code **)(lVar7 + 0x50);
          if (*(code **)(lVar7 + 0x30) != (code *)0x0) {
            if (pcVar8 != (code *)0x0) goto LAB_00b0ab80;
            iVar2 = (**(code **)(lVar7 + 0x30))(lVar5,param_2,param_3,local_1f0);
            if (iVar2 == 0) goto LAB_00b0ab30;
LAB_00b0ab94:
            piVar4 = local_1f0;
            goto LAB_00b0aba0;
          }
          if (pcVar8 != (code *)0x0) {
LAB_00b0ab80:
            iVar2 = (*pcVar8)(lVar5,param_2,param_3,local_1f0,param_1[0x20],param_1[0x21]);
            if (iVar2 != 0) goto LAB_00b0ab94;
          }
        }
LAB_00b0ab30:
        iVar1 = iVar1 + 1;
        iVar2 = OPENSSL_sk_num(*(undefined8 *)(lVar9 + 0x10));
      } while (iVar1 < iVar2);
    }
    if (piVar4 == (int *)0x0) {
      return 0;
    }
  }
LAB_00b0aba0:
  iVar1 = *piVar4;
  if (iVar1 == 2) {
    uVar3 = X509_CRL_up_ref(*(undefined8 *)(piVar4 + 2));
    iVar1 = (int)uVar3;
  }
  else {
    if (iVar1 != 1) goto LAB_00b0abdc;
    uVar3 = X509_up_ref(*(undefined8 *)(piVar4 + 2));
    iVar1 = (int)uVar3;
  }
  if (iVar1 == 0) {
    return uVar3;
  }
  iVar1 = *piVar4;
LAB_00b0abdc:
  *param_4 = iVar1;
  *(undefined8 *)(param_4 + 2) = *(undefined8 *)(piVar4 + 2);
  return 1;
}

