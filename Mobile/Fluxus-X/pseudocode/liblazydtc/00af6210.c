/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af6210
 */

undefined8 FUN_00af6210(undefined8 *param_1,void *param_2,int param_3,int param_4)

{
  long lVar1;
  int iVar2;
  uint uVar3;
  int iVar4;
  ASN1_VALUE *val;
  ASN1_STRING *str;
  
  iVar2 = param_3 + 0xe;
  if (-1 < param_3 + 7) {
    iVar2 = param_3 + 7;
  }
  if (param_3 < 0) {
    return 0;
  }
  if (param_4 * 8 < param_3) {
    return 0;
  }
  val = ASN1_item_new((ASN1_ITEM *)&DAT_00c7e788);
  if (val == (ASN1_VALUE *)0x0) {
    return 0;
  }
  str = *(ASN1_STRING **)(val + 8);
  *(undefined4 *)val = 0;
  if (str == (ASN1_STRING *)0x0) {
    str = ASN1_BIT_STRING_new();
    *(ASN1_STRING **)(val + 8) = str;
    if (str == (ASN1_BIT_STRING *)0x0) goto LAB_00af6314;
  }
  iVar4 = ASN1_BIT_STRING_set(str,param_2,iVar2 >> 3);
  if (iVar4 != 0) {
    *(ulong *)(*(long *)(val + 8) + 0x10) =
         *(ulong *)(*(long *)(val + 8) + 0x10) & 0xfffffffffffffff8;
    uVar3 = param_3 % 8;
    *(ulong *)(*(long *)(val + 8) + 0x10) = *(ulong *)(*(long *)(val + 8) + 0x10) | 8;
    if (0 < (int)uVar3) {
      lVar1 = *(long *)(*(long *)(val + 8) + 8) + (long)(iVar2 >> 3);
      *(byte *)(lVar1 + -1) = *(byte *)(lVar1 + -1) & (byte)(-0x100 >> (uVar3 & 0x1f));
      *(ulong *)(*(long *)(val + 8) + 0x10) =
           *(ulong *)(*(long *)(val + 8) + 0x10) | (long)(int)(8 - uVar3);
    }
    *param_1 = val;
    return 1;
  }
LAB_00af6314:
  ASN1_item_free(val,(ASN1_ITEM *)&DAT_00c7e788);
  return 0;
}

