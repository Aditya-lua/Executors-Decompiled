/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00abcd74
 */

int PKCS8_add_keyusage(PKCS8_PRIV_KEY_INFO *p8,int usage)

{
  int iVar1;
  undefined1 local_14 [4];
  
  local_14[0] = (undefined1)usage;
  iVar1 = PKCS8_pkey_add1_attr_by_NID((int)p8,0x53,3,local_14,1);
  return iVar1;
}

