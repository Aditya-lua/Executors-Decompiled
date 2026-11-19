/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1bf68
 */

undefined8 X509_NAME_get0_der(ASN1_VALUE *param_1,undefined8 *param_2,undefined8 *param_3)

{
  int iVar1;
  undefined8 uVar2;
  
  iVar1 = ASN1_item_i2d(param_1,(uchar **)0x0,(ASN1_ITEM *)&DAT_00c824b0);
  if (iVar1 < 1) {
    uVar2 = 0;
  }
  else {
    if (param_2 != (undefined8 *)0x0) {
      *param_2 = *(undefined8 *)(*(long *)(param_1 + 0x10) + 8);
    }
    if (param_3 != (undefined8 *)0x0) {
      *param_3 = **(undefined8 **)(param_1 + 0x10);
    }
    uVar2 = 1;
  }
  return uVar2;
}

