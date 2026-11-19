/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ef648
 */

int ASN1_TIME_compare(undefined8 param_1,undefined8 param_2)

{
  int iVar1;
  uint local_18;
  uint local_14;
  
  iVar1 = ASN1_TIME_diff(&local_14,&local_18,param_2,param_1);
  if (iVar1 == 0) {
    iVar1 = -2;
  }
  else {
    iVar1 = 1;
    if (((int)local_14 < 1) && ((int)local_18 < 1)) {
      iVar1 = (int)(local_18 | local_14) >> 0x1f;
    }
  }
  return iVar1;
}

