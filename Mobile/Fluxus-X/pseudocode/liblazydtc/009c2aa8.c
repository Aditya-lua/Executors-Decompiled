/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c2aa8
 */

int ssl_get_EC_curve_nid(undefined8 param_1)

{
  int iVar1;
  char acStack_44 [52];
  
  iVar1 = EVP_PKEY_get_group_name(param_1,acStack_44,0x32,0);
  if (iVar1 < 1) {
    iVar1 = 0;
  }
  else {
    iVar1 = OBJ_txt2nid(acStack_44);
  }
  return iVar1;
}

