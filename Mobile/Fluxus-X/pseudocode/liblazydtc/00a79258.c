/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a79258
 */

undefined8 FUN_00a79258(long param_1,int param_2,uint param_3,undefined8 *param_4)

{
  int iVar1;
  undefined8 uVar2;
  uint *puVar3;
  
  puVar3 = *(uint **)(param_1 + 0x98);
  if (param_2 < 0x1001) {
    uVar2 = 1;
    switch(param_2) {
    case 1:
      iVar1 = EVP_MD_get_type(param_4);
      if (((((iVar1 != 0x40) && (iVar1 = EVP_MD_get_type(param_4), iVar1 != 0x74)) &&
           ((iVar1 = EVP_MD_get_type(param_4), iVar1 != 0x42 &&
            ((((iVar1 = EVP_MD_get_type(param_4), iVar1 != 0x2a3 &&
               (iVar1 = EVP_MD_get_type(param_4), iVar1 != 0x2a0)) &&
              (iVar1 = EVP_MD_get_type(param_4), iVar1 != 0x2a1)) &&
             ((iVar1 = EVP_MD_get_type(param_4), iVar1 != 0x2a2 &&
              (iVar1 = EVP_MD_get_type(param_4), iVar1 != 0x448)))))))) &&
          (iVar1 = EVP_MD_get_type(param_4), iVar1 != 0x449)) &&
         ((iVar1 = EVP_MD_get_type(param_4), iVar1 != 0x44a &&
          (iVar1 = EVP_MD_get_type(param_4), iVar1 != 1099)))) {
        ERR_new();
        uVar2 = 0xa2;
LAB_00a79450:
        ERR_set_debug("crypto/dsa/dsa_pmeth.c",uVar2,"pkey_dsa_ctrl");
        ERR_set_error(10,0x6a,0);
        return 0;
      }
      *(undefined8 **)(puVar3 + 6) = param_4;
      goto LAB_00a79428;
    case 2:
      ERR_new(1);
      ERR_set_debug("crypto/dsa/dsa_pmeth.c",0xb2,"pkey_dsa_ctrl");
      ERR_set_error(10,0x96,0);
    default:
switchD_00a79294_caseD_3:
      uVar2 = 0xfffffffe;
      break;
    case 5:
    case 7:
    case 0xb:
      break;
    case 0xd:
      uVar2 = 1;
      *param_4 = *(undefined8 *)(puVar3 + 6);
    }
  }
  else {
    if (param_2 == 0x1003) {
      iVar1 = EVP_MD_get_type(param_4);
      if (((iVar1 != 0x40) && (iVar1 = EVP_MD_get_type(param_4), iVar1 != 0x2a3)) &&
         (iVar1 = EVP_MD_get_type(param_4), iVar1 != 0x2a0)) {
        ERR_new();
        uVar2 = 0x90;
        goto LAB_00a79450;
      }
      *(undefined8 **)(puVar3 + 2) = param_4;
    }
    else if (param_2 == 0x1002) {
      if (8 < (param_3 >> 5 | param_3 << 0x1b)) {
        return 0xfffffffe;
      }
      if ((1 << (ulong)(param_3 >> 5 & 0x1f) & 0x1a1U) == 0) {
        return 0xfffffffe;
      }
      puVar3[1] = param_3;
    }
    else {
      if ((param_2 != 0x1001) || ((int)param_3 < 0x100)) goto switchD_00a79294_caseD_3;
      *puVar3 = param_3;
    }
LAB_00a79428:
    uVar2 = 1;
  }
  return uVar2;
}

