/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abdbec
 */

undefined8
ASN1_item_d2i_bio_ex
          (undefined8 param_1,long param_2,undefined8 param_3,undefined8 param_4,undefined8 param_5)

{
  BUF_MEM *a;
  int iVar1;
  undefined8 uVar2;
  char *local_48;
  BUF_MEM *local_38;
  
  local_38 = (BUF_MEM *)0x0;
  if (param_2 == 0) {
    uVar2 = 0;
  }
  else {
    iVar1 = asn1_d2i_read_bio(param_2,&local_38);
    a = local_38;
    if (iVar1 < 0) {
      uVar2 = 0;
    }
    else {
      local_48 = local_38->data;
      uVar2 = ASN1_item_d2i_ex(param_3,&local_48,(long)iVar1,param_1,param_4,param_5);
    }
    BUF_MEM_free(a);
  }
  return uVar2;
}

