/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a60184
 */

int ASN1_TYPE_set_int_octetstring(ASN1_TYPE *a,long num,uchar *data,int len)

{
  long lVar1;
  int local_40 [2];
  uchar *local_38;
  undefined8 uStack_30;
  undefined4 local_28 [2];
  undefined1 *local_20;
  ASN1_TYPE *local_18;
  
  local_20 = (undefined1 *)local_40;
  local_28[0] = (undefined4)num;
  uStack_30 = 0;
  local_40[1] = 4;
  local_40[0] = len;
  local_38 = data;
  local_18 = a;
  lVar1 = ASN1_TYPE_pack_sequence(&DAT_00c5d6d0,local_28,&local_18);
  return (int)(lVar1 != 0);
}

