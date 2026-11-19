/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a68500
 */

undefined8 EVP_MAC_CTX_get_mac_size(long *param_1)

{
  int iVar1;
  code *pcVar2;
  undefined8 local_98;
  undefined8 uStack_90;
  undefined8 local_88;
  undefined8 uStack_80;
  undefined8 local_78;
  undefined8 local_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  undefined8 local_50;
  undefined8 local_18;
  
  local_18 = 0;
  if (param_1[1] != 0) {
    memset(&local_70,0,0x50);
    OSSL_PARAM_construct_size_t(&local_98,&DAT_002d7e7d,&local_18);
    local_50 = local_78;
    uStack_68 = uStack_90;
    local_70 = local_98;
    uStack_58 = uStack_80;
    uStack_60 = local_88;
    pcVar2 = *(code **)(*param_1 + 0x80);
    if (pcVar2 == (code *)0x0) {
      pcVar2 = *(code **)(*param_1 + 0x78);
      if (pcVar2 == (code *)0x0) {
        return 0;
      }
      iVar1 = (*pcVar2)(&local_70);
    }
    else {
      iVar1 = (*pcVar2)(param_1[1],&local_70);
    }
    if (iVar1 != 0) {
      return local_18;
    }
  }
  return 0;
}

