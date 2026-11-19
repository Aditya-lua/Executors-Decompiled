/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ccf94
 */

undefined8 early_data_count_ok(long param_1,long param_2,int param_3,int param_4)

{
  ulong uVar1;
  uint uVar2;
  undefined8 uVar3;
  uint uVar4;
  undefined4 uVar5;
  
  if (*(int *)(param_1 + 0x38) == 0) {
    uVar4 = *(uint *)(*(long *)(param_1 + 0x918) + 0x354);
    if ((uVar4 == 0) &&
       ((*(long *)(param_1 + 0x920) == 0 ||
        (uVar4 = *(uint *)(*(long *)(param_1 + 0x920) + 0x354), uVar4 == 0)))) {
      ERR_new();
      ERR_set_debug("ssl/record/ssl3_record.c",0x76,"early_data_count_ok");
      uVar5 = 0x50;
      uVar3 = 0xc0103;
      goto LAB_009cd03c;
    }
LAB_009ccff8:
    uVar1 = (ulong)*(uint *)(param_1 + 0x1d48) + param_2;
    if (uVar1 <= uVar4 + param_3) {
      *(int *)(param_1 + 0x1d48) = (int)uVar1;
      return 1;
    }
    ERR_new();
    uVar3 = 0x8f;
  }
  else {
    uVar4 = *(uint *)(param_1 + 0x1d44);
    if ((*(int *)(param_1 + 0xb30) == 2) &&
       (uVar2 = *(uint *)(*(long *)(param_1 + 0x918) + 0x354), uVar2 <= uVar4)) {
      uVar4 = uVar2;
    }
    if (uVar4 != 0) goto LAB_009ccff8;
    ERR_new();
    uVar3 = 0x86;
  }
  ERR_set_debug("ssl/record/ssl3_record.c",uVar3,"early_data_count_ok");
  uVar5 = 10;
  if (param_4 != 0) {
    uVar5 = 0x50;
  }
  uVar3 = 0xa4;
LAB_009cd03c:
  ossl_statem_fatal(param_1,uVar5,uVar3,0);
  return 0;
}

