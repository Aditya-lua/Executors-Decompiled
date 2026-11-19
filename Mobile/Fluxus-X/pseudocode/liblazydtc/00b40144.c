/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b40144
 */

int FUN_00b40144(long param_1,uchar **param_2)

{
  undefined4 uVar1;
  int iVar2;
  ASN1_OCTET_STRING local_28;
  
  if ((param_1 == 0) || (*(uchar **)(param_1 + 0x50) == (uchar *)0x0)) {
    ERR_new();
    ERR_set_debug("providers/implementations/encode_decode/encode_key2any.c",0x315,
                  "ecx_pki_priv_to_der");
    uVar1 = 0xc0102;
  }
  else {
    local_28.flags = 0;
    local_28.length = (int)*(undefined8 *)(param_1 + 0x58);
    local_28.data = *(uchar **)(param_1 + 0x50);
    iVar2 = i2d_ASN1_OCTET_STRING(&local_28,param_2);
    if (-1 < iVar2) {
      return iVar2;
    }
    ERR_new();
    ERR_set_debug("providers/implementations/encode_decode/encode_key2any.c",799,
                  "ecx_pki_priv_to_der");
    uVar1 = 0xc0100;
  }
  ERR_set_error(0x39,uVar1,0);
  return 0;
}

