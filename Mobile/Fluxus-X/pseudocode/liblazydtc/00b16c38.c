/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b16c38
 */

undefined8
d2i_PrivateKey_ex_bio(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  int iVar1;
  undefined8 uVar2;
  char *local_38;
  BUF_MEM *local_28;
  
  local_28 = (BUF_MEM *)0x0;
  iVar1 = asn1_d2i_read_bio(param_1,&local_28);
  if (iVar1 < 0) {
    uVar2 = 0;
  }
  else {
    local_38 = local_28->data;
    uVar2 = d2i_AutoPrivateKey_ex(param_2,&local_38,(long)iVar1,param_3,param_4);
  }
  BUF_MEM_free(local_28);
  return uVar2;
}

