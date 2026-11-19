/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a82f04
 */

void FUN_00a82f04(int param_1,int param_2,char *param_3,long param_4)

{
  int iVar1;
  undefined4 uVar2;
  undefined4 uVar3;
  char *pcVar4;
  size_t sVar5;
  ASN1_OBJECT *a;
  long lVar6;
  char acStack_84 [52];
  
  if (param_1 == 0) {
LAB_00a83010:
    uVar2 = 0;
  }
  else {
    pcVar4 = OBJ_nid2sn(param_1);
    if (pcVar4 == (char *)0x0) {
LAB_00a82fa4:
      uVar2 = 0;
    }
    else {
      sVar5 = strlen(pcVar4);
      if (param_4 == 0) {
        lVar6 = ossl_namemap_stored(0);
        if (sVar5 != 0) goto LAB_00a82f58;
        goto LAB_00a82fa4;
      }
      lVar6 = param_4;
      if (sVar5 == 0) goto LAB_00a82fa4;
LAB_00a82f58:
      uVar2 = 0;
      if (lVar6 != 0) {
        iVar1 = CRYPTO_THREAD_write_lock(*(undefined8 *)(lVar6 + 8));
        if (iVar1 == 0) goto LAB_00a82fa4;
        uVar2 = FUN_00a827e8(lVar6,0,pcVar4,sVar5);
        CRYPTO_THREAD_unlock(*(undefined8 *)(lVar6 + 8));
      }
    }
    pcVar4 = OBJ_nid2ln(param_1);
    if (pcVar4 == (char *)0x0) goto LAB_00a83010;
    sVar5 = strlen(pcVar4);
    if (param_4 == 0) {
      lVar6 = ossl_namemap_stored(0);
      if (sVar5 != 0) goto LAB_00a82fcc;
LAB_00a83084:
      uVar2 = 0;
    }
    else {
      lVar6 = param_4;
      if (sVar5 == 0) goto LAB_00a83084;
LAB_00a82fcc:
      if (lVar6 == 0) goto LAB_00a83010;
      iVar1 = CRYPTO_THREAD_write_lock(*(undefined8 *)(lVar6 + 8));
      if (iVar1 == 0) goto LAB_00a83084;
      uVar2 = FUN_00a827e8(lVar6,uVar2,pcVar4,sVar5);
      CRYPTO_THREAD_unlock(*(undefined8 *)(lVar6 + 8));
    }
  }
  if (param_2 == 0) goto LAB_00a831b0;
  pcVar4 = OBJ_nid2sn(param_2);
  if (pcVar4 == (char *)0x0) {
LAB_00a830a0:
    uVar3 = 0;
  }
  else {
    sVar5 = strlen(pcVar4);
    if (param_4 == 0) {
      lVar6 = ossl_namemap_stored(0);
      if (sVar5 != 0) goto LAB_00a83038;
      goto LAB_00a830a0;
    }
    lVar6 = param_4;
    if (sVar5 == 0) goto LAB_00a830a0;
LAB_00a83038:
    uVar3 = 0;
    if (lVar6 != 0) {
      iVar1 = CRYPTO_THREAD_write_lock(*(undefined8 *)(lVar6 + 8));
      if (iVar1 == 0) goto LAB_00a830a0;
      uVar3 = FUN_00a827e8(lVar6,uVar2,pcVar4,sVar5);
      CRYPTO_THREAD_unlock(*(undefined8 *)(lVar6 + 8));
    }
  }
  pcVar4 = OBJ_nid2ln(param_2);
  if (pcVar4 == (char *)0x0) {
LAB_00a83114:
    uVar2 = 0;
  }
  else {
    sVar5 = strlen(pcVar4);
    if (param_4 == 0) {
      lVar6 = ossl_namemap_stored(0);
      if (sVar5 != 0) goto LAB_00a830c8;
      goto LAB_00a83114;
    }
    lVar6 = param_4;
    if (sVar5 == 0) goto LAB_00a83114;
LAB_00a830c8:
    uVar2 = 0;
    if (lVar6 != 0) {
      iVar1 = CRYPTO_THREAD_write_lock(*(undefined8 *)(lVar6 + 8));
      if (iVar1 == 0) goto LAB_00a83114;
      uVar2 = FUN_00a827e8(lVar6,uVar3,pcVar4,sVar5);
      CRYPTO_THREAD_unlock(*(undefined8 *)(lVar6 + 8));
    }
  }
  a = OBJ_nid2obj(param_2);
  if (a == (ASN1_OBJECT *)0x0) goto LAB_00a831b0;
  iVar1 = OBJ_obj2txt(acStack_84,0x32,a,1);
  if (iVar1 < 1) {
    uVar3 = uVar2;
  }
  else {
    sVar5 = strlen(acStack_84);
    lVar6 = param_4;
    if (param_4 == 0) {
      lVar6 = ossl_namemap_stored(0);
    }
    if (sVar5 == 0) {
LAB_00a831a8:
      uVar3 = 0;
    }
    else {
      uVar3 = 0;
      if (lVar6 != 0) {
        iVar1 = CRYPTO_THREAD_write_lock(*(undefined8 *)(lVar6 + 8));
        if (iVar1 == 0) goto LAB_00a831a8;
        uVar3 = FUN_00a827e8(lVar6,uVar2,acStack_84,sVar5);
        CRYPTO_THREAD_unlock(*(undefined8 *)(lVar6 + 8));
      }
    }
  }
  uVar2 = uVar3;
LAB_00a831b0:
  if (param_3 != (char *)0x0) {
    sVar5 = strlen(param_3);
    if (param_4 == 0) {
      param_4 = ossl_namemap_stored(0);
    }
    if (((sVar5 != 0) && (param_4 != 0)) &&
       (iVar1 = CRYPTO_THREAD_write_lock(*(undefined8 *)(param_4 + 8)), iVar1 != 0)) {
      FUN_00a827e8(param_4,uVar2,param_3,sVar5);
      CRYPTO_THREAD_unlock(*(undefined8 *)(param_4 + 8));
    }
  }
  return;
}

