/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b4db0
 */

undefined8 SSL_sendfile(long param_1)

{
  undefined8 uVar1;
  
  if (*(long *)(param_1 + 0x30) == 0) {
    ERR_new();
    uVar1 = 0x829;
  }
  else {
    if ((*(byte *)(param_1 + 0x44) & 1) != 0) {
      *(undefined4 *)(param_1 + 0x28) = 1;
      ERR_new();
      ERR_set_debug("ssl/ssl_lib.c",0x82f,"SSL_sendfile");
      uVar1 = 0xcf;
      goto LAB_009b4e38;
    }
    ERR_new();
    uVar1 = 0x834;
  }
  ERR_set_debug("ssl/ssl_lib.c",uVar1,"SSL_sendfile");
  uVar1 = 0x114;
LAB_009b4e38:
  ERR_set_error(0x14,uVar1,0);
  return 0xffffffffffffffff;
}

