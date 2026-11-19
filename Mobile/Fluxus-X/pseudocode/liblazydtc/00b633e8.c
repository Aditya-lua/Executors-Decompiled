/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b633e8
 */

undefined8 * FUN_00b633e8(undefined8 param_1,char *param_2,undefined8 param_3)

{
  undefined8 *puVar1;
  char *pcVar2;
  
  puVar1 = (undefined8 *)CRYPTO_zalloc(0x48,"providers/implementations/storemgmt/file_store.c",0x81)
  ;
  if (puVar1 == (undefined8 *)0x0) {
LAB_00b63450:
    FUN_00b634a8(puVar1);
    ERR_new();
    ERR_set_debug("providers/implementations/storemgmt/file_store.c",0x9e,"file_open_stream");
    ERR_set_error(0x39,0xc0100,0);
    FUN_00b634a8(0);
    puVar1 = (undefined8 *)0x0;
  }
  else {
    if (param_2 != (char *)0x0) {
      pcVar2 = CRYPTO_strdup(param_2,"providers/implementations/storemgmt/file_store.c",0x82);
      puVar1[1] = pcVar2;
      if (pcVar2 == (char *)0x0) goto LAB_00b63450;
    }
    *(undefined4 *)(puVar1 + 2) = 0;
    *puVar1 = param_3;
    puVar1[3] = param_1;
  }
  return puVar1;
}

