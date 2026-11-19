/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ae0cb4
 */

undefined8 ossl_sha3_final(undefined8 param_1,long param_2)

{
  long lVar1;
  undefined1 *__s;
  long lVar2;
  
  if (*(long *)(param_2 + 0xd0) != 0) {
    lVar2 = *(long *)(param_2 + 200);
    lVar1 = param_2 + 0xe0;
    __s = (undefined1 *)(lVar1 + *(long *)(param_2 + 0xd8));
    memset(__s,0,lVar2 - *(long *)(param_2 + 0xd8));
    *__s = *(undefined1 *)(param_2 + 0x188);
    *(byte *)(lVar1 + lVar2 + -1) = *(byte *)(lVar1 + lVar2 + -1) | 0x80;
    SHA3_absorb(param_2,lVar1,lVar2,lVar2);
    SHA3_squeeze(param_2,param_1,*(undefined8 *)(param_2 + 0xd0),lVar2);
  }
  return 1;
}

