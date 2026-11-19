/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aab510
 */

bool CRYPTO_ocb128_init(undefined8 *param_1,undefined8 param_2,undefined8 param_3,code *param_4,
                       undefined8 param_5,undefined8 param_6)

{
  undefined8 *puVar1;
  char cVar2;
  void *pvVar3;
  char *pcVar4;
  long lVar5;
  
  memset(param_1,0,0xb0);
  param_1[6] = 5;
  pvVar3 = CRYPTO_malloc(0x50,"crypto/modes/ocb128.c",0x9e);
  param_1[0xb] = pvVar3;
  if (pvVar3 == (void *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/modes/ocb128.c",0x9f,"CRYPTO_ocb128_init");
    ERR_set_error(0xf,0xc0100,0);
  }
  else {
    param_1[3] = param_3;
    param_1[4] = param_6;
    puVar1 = param_1 + 7;
    *param_1 = param_4;
    param_1[1] = param_5;
    param_1[2] = param_2;
    (*param_4)(puVar1,puVar1,param_2);
    cVar2 = *(char *)(param_1 + 7);
    FUN_00aab930(puVar1,1,param_1 + 9);
    lVar5 = param_1[0xb];
    *(byte *)((long)param_1 + 0x57) =
         *(byte *)((long)param_1 + 0x57) ^ (byte)((ulong)(long)cVar2 >> 7) & 0x87;
    cVar2 = *(char *)(param_1 + 9);
    FUN_00aab930(param_1 + 9,1,lVar5);
    *(byte *)(lVar5 + 0xf) = *(byte *)(lVar5 + 0xf) ^ (byte)((ulong)(long)cVar2 >> 7) & 0x87;
    pcVar4 = (char *)param_1[0xb];
    cVar2 = *pcVar4;
    FUN_00aab930(pcVar4,1,pcVar4 + 0x10);
    pcVar4[0x1f] = pcVar4[0x1f] ^ (byte)((ulong)(long)cVar2 >> 7) & 0x87;
    lVar5 = param_1[0xb];
    cVar2 = *(char *)(lVar5 + 0x10);
    FUN_00aab930((char *)(lVar5 + 0x10),1,lVar5 + 0x20);
    *(byte *)(lVar5 + 0x2f) = *(byte *)(lVar5 + 0x2f) ^ (byte)((ulong)(long)cVar2 >> 7) & 0x87;
    lVar5 = param_1[0xb];
    cVar2 = *(char *)(lVar5 + 0x20);
    FUN_00aab930((char *)(lVar5 + 0x20),1,lVar5 + 0x30);
    *(byte *)(lVar5 + 0x3f) = *(byte *)(lVar5 + 0x3f) ^ (byte)((ulong)(long)cVar2 >> 7) & 0x87;
    lVar5 = param_1[0xb];
    cVar2 = *(char *)(lVar5 + 0x30);
    FUN_00aab930((char *)(lVar5 + 0x30),1,lVar5 + 0x40);
    *(byte *)(lVar5 + 0x4f) = *(byte *)(lVar5 + 0x4f) ^ (byte)((ulong)(long)cVar2 >> 7) & 0x87;
    param_1[5] = 4;
  }
  return pvVar3 != (void *)0x0;
}

