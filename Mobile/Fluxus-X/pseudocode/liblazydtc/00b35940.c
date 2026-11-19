/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b35940
 */

undefined8 ossl_do_PVK_header(long *param_1,uint param_2,int param_3,uint *param_4,uint *param_5)

{
  int iVar1;
  uint uVar2;
  undefined8 uVar3;
  int *piVar4;
  int *piVar5;
  
  piVar4 = (int *)*param_1;
  if (param_3 == 0) {
    if (0x17 < param_2) {
      piVar5 = piVar4 + 1;
      if (*piVar4 != -0x4f4a0ee2) {
        ERR_new();
        ERR_set_debug("crypto/pem/pvkfmt.c",0x2ff,"ossl_do_PVK_header");
        uVar3 = 0x74;
        goto LAB_00b359a0;
      }
      goto LAB_00b359c4;
    }
    ERR_new();
    uVar3 = 0x2fa;
  }
  else {
    piVar5 = piVar4;
    if (0x13 < param_2) {
LAB_00b359c4:
      iVar1 = piVar5[2];
      *param_4 = piVar5[3];
      uVar2 = piVar5[4];
      *param_5 = uVar2;
      if (0x19000 < uVar2) {
        return 0;
      }
      if (0x2800 < *param_4) {
        return 0;
      }
      if ((iVar1 == 0) || (*param_4 != 0)) {
        *param_1 = (long)(piVar5 + 5);
        return 1;
      }
      ERR_new();
      ERR_set_debug("crypto/pem/pvkfmt.c",0x310,"ossl_do_PVK_header");
      uVar3 = 0x79;
      goto LAB_00b359a0;
    }
    ERR_new();
    uVar3 = 0x2f5;
  }
  ERR_set_debug("crypto/pem/pvkfmt.c",uVar3,"ossl_do_PVK_header");
  uVar3 = 0x7d;
LAB_00b359a0:
  ERR_set_error(9,uVar3,0);
  return 0;
}

