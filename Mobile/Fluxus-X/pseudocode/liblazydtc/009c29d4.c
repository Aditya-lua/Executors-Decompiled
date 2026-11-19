/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c29d4
 */

undefined8 FUN_009c29d4(long param_1,undefined8 param_2)

{
  int iVar1;
  undefined8 uVar2;
  char cVar3;
  long lVar4;
  ulong uVar5;
  
  iVar1 = EVP_PKEY_is_a(param_2,&DAT_002cf33a);
  if (iVar1 == 0) {
    return 1;
  }
  uVar2 = EVP_PKEY_get_ec_point_conv_form(param_2);
  if ((int)uVar2 == 0) {
    return uVar2;
  }
  cVar3 = '\0';
  if ((int)uVar2 != 4) {
    if ((((*(byte *)(*(long *)(*(int **)(param_1 + 8) + 0x30) + 0x60) >> 3 & 1) == 0) &&
        (iVar1 = **(int **)(param_1 + 8), 0x303 < iVar1)) && (iVar1 != 0x10000)) {
      return 1;
    }
    iVar1 = EVP_PKEY_get_field_type(param_2);
    if (iVar1 == 0x196) {
      cVar3 = '\x01';
      lVar4 = *(long *)(param_1 + 0xab8);
      goto joined_r0x009c2a94;
    }
    if (iVar1 != 0x197) {
      return 0;
    }
    cVar3 = '\x02';
  }
  lVar4 = *(long *)(param_1 + 0xab8);
joined_r0x009c2a94:
  if (lVar4 == 0) {
    return 1;
  }
  if (*(ulong *)(param_1 + 0xab0) != 0) {
    uVar5 = 0;
    do {
      if (*(char *)(lVar4 + uVar5) == cVar3) {
        return 1;
      }
      uVar5 = uVar5 + 1;
    } while (uVar5 < *(ulong *)(param_1 + 0xab0));
  }
  return 0;
}

