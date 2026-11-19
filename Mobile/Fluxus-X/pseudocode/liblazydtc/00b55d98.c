/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b55d98
 */

undefined8 FUN_00b55d98(long param_1,long param_2)

{
  int iVar1;
  int iVar2;
  long lVar3;
  undefined8 uVar4;
  undefined8 local_28;
  
  if (param_2 != 0) {
    lVar3 = OSSL_PARAM_locate_const(param_2,&DAT_002d7e7d);
    if (lVar3 != 0) {
      uVar4 = OSSL_PARAM_get_size_t(lVar3,&local_28);
      if ((int)uVar4 == 0) {
        return uVar4;
      }
      uVar4 = SipHash_set_hash_size(param_1 + 8,local_28);
      if ((int)uVar4 == 0) {
        return uVar4;
      }
      uVar4 = SipHash_set_hash_size(param_1 + 0x48,local_28);
      if ((int)uVar4 == 0) {
        return uVar4;
      }
    }
    lVar3 = OSSL_PARAM_locate_const(param_2,"c-rounds");
    if ((lVar3 != 0) && (uVar4 = OSSL_PARAM_get_uint(lVar3,param_1 + 0x88), (int)uVar4 == 0)) {
      return uVar4;
    }
    lVar3 = OSSL_PARAM_locate_const(param_2,"d-rounds");
    if ((lVar3 != 0) && (uVar4 = OSSL_PARAM_get_uint(lVar3,param_1 + 0x8c), (int)uVar4 == 0)) {
      return uVar4;
    }
    lVar3 = OSSL_PARAM_locate_const(param_2,&DAT_002c567e);
    if (lVar3 != 0) {
      if (*(int *)(lVar3 + 8) != 5) {
        return 0;
      }
      if (*(long *)(lVar3 + 0x18) != 0x10) {
        return 0;
      }
      iVar1 = 2;
      if (*(int *)(param_1 + 0x88) != 0) {
        iVar1 = *(int *)(param_1 + 0x88);
      }
      iVar2 = 4;
      if (*(int *)(param_1 + 0x8c) != 0) {
        iVar2 = *(int *)(param_1 + 0x8c);
      }
      uVar4 = SipHash_Init((undefined8 *)(param_1 + 8),*(undefined8 *)(lVar3 + 0x10),iVar1,iVar2);
      if ((int)uVar4 == 0) {
        return uVar4;
      }
      *(undefined8 *)(param_1 + 0x80) = *(undefined8 *)(param_1 + 0x40);
      *(undefined8 *)(param_1 + 0x78) = *(undefined8 *)(param_1 + 0x38);
      *(undefined8 *)(param_1 + 0x70) = *(undefined8 *)(param_1 + 0x30);
      *(undefined8 *)(param_1 + 0x68) = *(undefined8 *)(param_1 + 0x28);
      *(undefined8 *)(param_1 + 0x60) = *(undefined8 *)(param_1 + 0x20);
      *(undefined8 *)(param_1 + 0x58) = *(undefined8 *)(param_1 + 0x18);
      *(undefined8 *)(param_1 + 0x50) = *(undefined8 *)(param_1 + 0x10);
      *(undefined8 *)(param_1 + 0x48) = *(undefined8 *)(param_1 + 8);
    }
  }
  return 1;
}

