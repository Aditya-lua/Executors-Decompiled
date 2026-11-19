/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a135c0
 */

ulong i2o_SCT_LIST(undefined8 param_1,long *param_2)

{
  bool bVar1;
  int iVar2;
  int iVar3;
  void *pvVar4;
  undefined8 uVar5;
  int *piVar6;
  undefined1 *puVar7;
  ulong uVar8;
  undefined1 *local_48;
  
  local_48 = (undefined1 *)0x0;
  if (param_2 == (long *)0x0) {
    bVar1 = false;
LAB_00a13604:
    iVar2 = OPENSSL_sk_num(param_1);
    if (iVar2 < 1) {
      uVar8 = 2;
    }
    else {
      iVar2 = 0;
      uVar8 = 2;
      do {
        puVar7 = local_48;
        if (param_2 == (long *)0x0) {
          piVar6 = (int *)OPENSSL_sk_value(param_1,iVar2);
          iVar3 = SCT_is_complete();
          if (iVar3 == 0) {
            ERR_new();
            ERR_set_debug("crypto/ct/ct_oct.c",0xce,"i2o_SCT");
            ERR_set_error(0x32,0x6a,0);
            CRYPTO_free((void *)0x0);
            goto joined_r0x00a137a0;
          }
          if (*piVar6 == 0) {
            iVar3 = (int)*(undefined8 *)(piVar6 + 0xe) + (int)*(undefined8 *)(piVar6 + 0x14) + 0x2f;
          }
          else {
            iVar3 = (int)*(undefined8 *)(piVar6 + 4);
          }
          if (iVar3 == -1) goto joined_r0x00a137a0;
        }
        else {
          local_48 = local_48 + 2;
          uVar5 = OPENSSL_sk_value(param_1,iVar2);
          iVar3 = i2o_SCT(uVar5,&local_48);
          if (iVar3 == -1) goto joined_r0x00a137a0;
          *puVar7 = (char)((uint)iVar3 >> 8);
          puVar7[1] = (char)iVar3;
        }
        uVar8 = uVar8 + (long)(iVar3 + 2);
        iVar2 = iVar2 + 1;
        iVar3 = OPENSSL_sk_num(param_1);
      } while (iVar2 < iVar3);
      if (uVar8 >> 0x10 != 0) {
joined_r0x00a137a0:
        if (bVar1) {
          CRYPTO_free((void *)*param_2);
          *param_2 = 0;
        }
        goto LAB_00a13800;
      }
    }
    if (param_2 != (long *)0x0) {
      puVar7 = (undefined1 *)*param_2;
      *puVar7 = (char)(uVar8 - 2 >> 8);
      puVar7[1] = (char)(uVar8 - 2);
      if (!bVar1) {
        *param_2 = *param_2 + uVar8;
      }
    }
  }
  else {
    pvVar4 = (void *)*param_2;
    if (pvVar4 != (void *)0x0) {
      bVar1 = false;
LAB_00a135f4:
      local_48 = (undefined1 *)((long)pvVar4 + 2);
      goto LAB_00a13604;
    }
    iVar2 = i2o_SCT_LIST(param_1,0);
    if (iVar2 == -1) {
      ERR_new();
      ERR_set_debug("crypto/ct/ct_oct.c",0x14a,"i2o_SCT_LIST");
      uVar5 = 0x69;
    }
    else {
      pvVar4 = CRYPTO_malloc(iVar2,"crypto/ct/ct_oct.c",0x14d);
      *param_2 = (long)pvVar4;
      if (pvVar4 != (void *)0x0) {
        bVar1 = true;
        goto LAB_00a135f4;
      }
      ERR_new();
      ERR_set_debug("crypto/ct/ct_oct.c",0x14e,"i2o_SCT_LIST");
      uVar5 = 0xc0100;
    }
    ERR_set_error(0x32,uVar5,0);
LAB_00a13800:
    uVar8 = 0xffffffff;
  }
  return uVar8 & 0xffffffff;
}

