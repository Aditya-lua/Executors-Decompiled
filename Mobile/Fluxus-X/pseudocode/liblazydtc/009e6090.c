/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e6090
 */

long construct_key_exchange_tbs(long param_1,undefined8 *param_2,void *param_3,size_t param_4)

{
  undefined8 *puVar1;
  long lVar2;
  undefined8 uVar3;
  
  lVar2 = param_4 + 0x40;
  puVar1 = CRYPTO_malloc((int)lVar2,"ssl/statem/statem_lib.c",0x932);
  if (puVar1 == (undefined8 *)0x0) {
    ERR_new();
    ERR_set_debug("ssl/statem/statem_lib.c",0x935,"construct_key_exchange_tbs");
    ossl_statem_fatal(param_1,0x50,0xc0100,0);
    lVar2 = 0;
  }
  else {
    uVar3 = *(undefined8 *)(param_1 + 0x170);
    puVar1[3] = *(undefined8 *)(param_1 + 0x178);
    puVar1[2] = uVar3;
    uVar3 = *(undefined8 *)(param_1 + 0x160);
    puVar1[1] = *(undefined8 *)(param_1 + 0x168);
    *puVar1 = uVar3;
    uVar3 = *(undefined8 *)(param_1 + 0x140);
    puVar1[5] = *(undefined8 *)(param_1 + 0x148);
    puVar1[4] = uVar3;
    uVar3 = *(undefined8 *)(param_1 + 0x150);
    puVar1[7] = *(undefined8 *)(param_1 + 0x158);
    puVar1[6] = uVar3;
    memcpy(puVar1 + 8,param_3,param_4);
    *param_2 = puVar1;
  }
  return lVar2;
}

