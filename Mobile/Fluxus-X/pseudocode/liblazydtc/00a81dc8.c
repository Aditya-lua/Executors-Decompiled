/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a81dc8
 */

bool FUN_00a81dc8(undefined8 *param_1)

{
  long lVar1;
  code *pcVar2;
  
  lVar1 = ossl_lib_ctx_get_data(*param_1,0x11,&DAT_00c61408);
  if (lVar1 != 0) {
    BIO_set_init(param_1,0);
    pcVar2 = *(code **)(lVar1 + 0x30);
    BIO_get_data(param_1);
    (*pcVar2)();
  }
  return lVar1 != 0;
}

