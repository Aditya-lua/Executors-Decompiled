/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0095e42c
 */

void FUN_0095e42c(long param_1,int param_2)

{
  ssize_t sVar1;
  undefined4 *puVar2;
  long lVar3;
  long lVar4;
  
  if (param_2 == 0x1f) {
    lVar3 = *(long *)(param_1 + 0x1a0);
    lVar4 = *(long *)(param_1 + 0x20);
    *(undefined2 *)(lVar3 + 0x1cd8) = 0xfaff;
    *(undefined1 *)(lVar3 + 0x1cda) = 0x1f;
    *(undefined1 *)(lVar3 + 0x1cdb) = (char)((ushort)*(undefined2 *)(lVar3 + 0x1ca8) >> 8);
    *(char *)(lVar3 + 0x1cdc) = (char)*(undefined2 *)(lVar3 + 0x1ca8);
    *(char *)(lVar3 + 0x1cdd) = (char)((ushort)*(undefined2 *)(lVar3 + 0x1caa) >> 8);
    *(char *)(lVar3 + 0x1cde) = (char)*(undefined2 *)(lVar3 + 0x1caa);
    *(undefined2 *)(lVar3 + 0x1cdf) = 0xf0ff;
    *(long *)(lVar3 + 0x1ee0) = lVar3 + 0x1ce1;
    *(void **)(lVar3 + 0x1ed8) = (void *)(lVar3 + 0x1cd8);
    FUN_0095e584(param_1,0x3e,(undefined1 *)(lVar3 + 0x1cda),(-0x1cda - lVar3) + lVar3 + 0x1ce1);
    sVar1 = send(*(int *)(lVar4 + 0x220),(void *)(lVar3 + 0x1cd8),3,0x4000);
    if (sVar1 < 0) {
      puVar2 = (undefined4 *)__errno();
      FUN_00904b80(param_1,"Sending data failed (%d)",*puVar2);
    }
    FUN_0095dfd8(param_1,(undefined1 *)(lVar3 + 0x1cdb),4);
    sVar1 = send(*(int *)(lVar4 + 0x220),(void *)(lVar3 + 0x1cdf),2,0x4000);
    if (sVar1 < 0) {
      puVar2 = (undefined4 *)__errno();
      FUN_00904b80(param_1,"Sending data failed (%d)",*puVar2);
      return;
    }
  }
  return;
}

