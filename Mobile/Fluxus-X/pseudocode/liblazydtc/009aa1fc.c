/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009aa1fc
 */

ulong ssl_gensecret(long param_1,undefined8 param_2,undefined8 param_3)

{
  int iVar1;
  undefined8 uVar2;
  ulong uVar3;
  
  if ((((*(byte *)(*(long *)(*(int **)(param_1 + 8) + 0x30) + 0x60) >> 3 & 1) != 0) ||
      (iVar1 = **(int **)(param_1 + 8), iVar1 < 0x304)) || (iVar1 == 0x10000)) {
    uVar3 = ssl_generate_master_secret(param_1,param_2,param_3,0);
    return uVar3;
  }
  if (*(int *)(param_1 + 0x4d0) == 0) {
    uVar2 = ssl_handshake_md(param_1);
    uVar3 = tls13_generate_secret(param_1,uVar2,0,0,0,param_1 + 0x544);
    if ((int)uVar3 == 0) {
      return uVar3;
    }
  }
  iVar1 = tls13_generate_handshake_secret(param_1,param_2,param_3);
  return (ulong)(iVar1 != 0);
}

