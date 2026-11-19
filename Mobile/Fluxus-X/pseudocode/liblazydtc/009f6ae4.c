/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f6ae4
 */

int FUN_009f6ae4(undefined8 param_1,uchar **param_2,long param_3,int param_4,int param_5)

{
  int tag;
  bool bVar1;
  int length;
  int constructed;
  int local_54;
  
  local_54 = (int)*(undefined8 *)(param_3 + 8);
  length = FUN_009f6c60(param_1,0,&local_54,param_3);
  if ((0x14 < local_54 + 3U) ||
     (bVar1 = false, (1 << (ulong)(local_54 + 3U & 0x1f) & 0x180001U) == 0)) {
    bVar1 = true;
  }
  if (length == -1) {
    length = 0;
  }
  else {
    constructed = 0;
    if (length == -2) {
      length = 0;
      constructed = 2;
    }
    tag = local_54;
    if (param_4 != -1) {
      tag = param_4;
    }
    if (param_2 != (uchar **)0x0) {
      if (bVar1) {
        ASN1_put_object(param_2,constructed,length,tag,param_5);
      }
      FUN_009f6c60(param_1,*param_2,&local_54,param_3);
      if (constructed == 0) {
        *param_2 = *param_2 + length;
      }
      else {
        ASN1_put_eoc(param_2);
      }
    }
    if (bVar1) {
      length = ASN1_object_size(constructed,length,tag);
    }
  }
  return length;
}

