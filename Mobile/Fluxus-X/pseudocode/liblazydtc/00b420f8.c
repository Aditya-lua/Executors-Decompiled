/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b420f8
 */

ulong FUN_00b420f8(BIO *param_1,long param_2,uint param_3)

{
  int iVar1;
  ulong uVar2;
  undefined8 uVar3;
  char *param2;
  
  if ((param_1 == (BIO *)0x0) || (param_2 == 0)) {
    ERR_new();
    ERR_set_debug("providers/implementations/encode_decode/encode_key2text.c",0x23e,"ecx_to_text");
    uVar3 = 0xc0102;
LAB_00b42194:
    ERR_set_error(0x39,uVar3,0);
    return 0;
  }
  param2 = (char *)0x0;
  if (*(uint *)(param_2 + 0x60) < 4) {
    param2 = (&PTR_s_X25519_00c9b880)[(int)*(uint *)(param_2 + 0x60)];
  }
  if ((param_3 & 1) == 0) {
    if ((param_3 >> 1 & 1) != 0) {
      if ((*(byte *)(param_2 + 0x10) & 1) == 0) {
        ERR_new();
        ERR_set_debug("providers/implementations/encode_decode/encode_key2text.c",0x25e,
                      "ecx_to_text");
        uVar3 = 0xdc;
        goto LAB_00b42194;
      }
      iVar1 = BIO_printf(param_1,"%s Public-Key:\n",param2);
      if (iVar1 < 1) {
        return 0;
      }
    }
  }
  else {
    if (*(long *)(param_2 + 0x50) == 0) {
      ERR_new();
      ERR_set_debug("providers/implementations/encode_decode/encode_key2text.c",0x253,"ecx_to_text")
      ;
      uVar3 = 0xdd;
      goto LAB_00b42194;
    }
    iVar1 = BIO_printf(param_1,"%s Private-Key:\n",param2);
    if (iVar1 < 1) {
      return 0;
    }
    uVar2 = FUN_00b41a48(param_1,"priv:",*(undefined8 *)(param_2 + 0x50),
                         *(undefined8 *)(param_2 + 0x58));
    if ((int)uVar2 == 0) {
      return uVar2;
    }
  }
  iVar1 = FUN_00b41a48(param_1,&DAT_002aaf31,param_2 + 0x11,*(undefined8 *)(param_2 + 0x58));
  return (ulong)(iVar1 != 0);
}

