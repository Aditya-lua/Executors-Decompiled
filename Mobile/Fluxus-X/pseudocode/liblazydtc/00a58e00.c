/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a58e00
 */

undefined8 EVP_MD_CTX_ctrl(long param_1,int param_2,int param_3,undefined8 param_4)

{
  int iVar1;
  undefined8 uVar2;
  long lVar3;
  int *piVar4;
  code *pcVar5;
  undefined8 local_b8;
  undefined8 uStack_b0;
  undefined8 local_a8;
  undefined8 uStack_a0;
  undefined8 local_98;
  undefined8 local_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined8 local_70;
  long local_38;
  
  memset(&local_90,0,0x50);
  if (param_1 == 0) {
    ERR_new();
    ERR_set_debug("crypto/evp/digest.c",0x32f,"EVP_MD_CTX_ctrl");
    uVar2 = 0xc0102;
LAB_00a58ea8:
    ERR_set_error(6,uVar2,0);
  }
  else {
    lVar3 = *(long *)(param_1 + 8);
    if ((lVar3 == 0) || (*(long *)(lVar3 + 0x70) != 0)) {
      if (param_2 == 2) {
        lVar3 = 9999;
        if (param_3 != 0) {
          lVar3 = (long)param_3;
        }
        OSSL_PARAM_construct_utf8_string(&local_b8,"micalg",param_4,lVar3);
        local_70 = local_98;
        uStack_88 = uStack_b0;
        local_90 = local_b8;
        uStack_78 = uStack_a0;
        uStack_80 = local_a8;
        piVar4 = *(int **)(param_1 + 0x28);
        if (((piVar4 == (int *)0x0) ||
            (((*piVar4 != 0x100 && (*piVar4 != 0x80)) ||
             (lVar3 = *(long *)(piVar4 + 0xc), lVar3 == 0)))) ||
           (pcVar5 = *(code **)(*(long *)(piVar4 + 10) + 0xd8), pcVar5 == (code *)0x0)) {
          if (*(long *)(param_1 + 8) == 0) {
            return 0;
          }
          pcVar5 = *(code **)(*(long *)(param_1 + 8) + 0xd0);
          goto joined_r0x00a58f64;
        }
      }
      else {
        if (param_2 == 0x1d) {
          OSSL_PARAM_construct_octet_string(&local_b8,"ssl3-ms",param_4,(long)param_3);
        }
        else {
          if (param_2 != 3) {
            return 0;
          }
          local_38 = (long)param_3;
          OSSL_PARAM_construct_size_t(&local_b8,"xoflen",&local_38);
        }
        local_70 = local_98;
        uStack_88 = uStack_b0;
        local_90 = local_b8;
        uStack_78 = uStack_a0;
        uStack_80 = local_a8;
        piVar4 = *(int **)(param_1 + 0x28);
        if (((piVar4 == (int *)0x0) || ((*piVar4 != 0x100 && (*piVar4 != 0x80)))) ||
           ((lVar3 = *(long *)(piVar4 + 0xc), lVar3 == 0 ||
            (pcVar5 = *(code **)(*(long *)(piVar4 + 10) + 0xe8), pcVar5 == (code *)0x0)))) {
          if (*(long *)(param_1 + 8) == 0) {
            return 0;
          }
          pcVar5 = *(code **)(*(long *)(param_1 + 8) + 200);
joined_r0x00a58f64:
          if (pcVar5 == (code *)0x0) {
            return 0;
          }
          lVar3 = *(long *)(param_1 + 0x38);
        }
      }
      uVar2 = (*pcVar5)(lVar3,&local_90);
      iVar1 = (int)uVar2;
    }
    else {
      if (*(code **)(lVar3 + 0x50) == (code *)0x0) {
        ERR_new();
        ERR_set_debug("crypto/evp/digest.c",0x352,"EVP_MD_CTX_ctrl");
        uVar2 = 0x84;
        goto LAB_00a58ea8;
      }
      uVar2 = (**(code **)(lVar3 + 0x50))(param_1,param_2,param_3,param_4);
      iVar1 = (int)uVar2;
    }
    if (0 < iVar1) {
      return uVar2;
    }
  }
  return 0;
}

