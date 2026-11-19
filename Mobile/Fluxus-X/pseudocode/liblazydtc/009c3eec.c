/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c3eec
 */

int tls12_copy_sigalgs(long param_1,undefined8 param_2,long param_3,ulong param_4)

{
  int iVar1;
  long lVar2;
  int iVar3;
  ulong uVar4;
  
  if (param_4 != 0) {
    iVar3 = 0;
    uVar4 = 0;
    do {
      lVar2 = FUN_009c21e4(param_1,*(undefined2 *)(param_3 + uVar4 * 2));
      if ((lVar2 != 0) && (iVar1 = FUN_009c3c60(param_1,0x5000b,lVar2), iVar1 != 0)) {
        iVar1 = WPACKET_put_bytes__(param_2,*(undefined2 *)(param_3 + uVar4 * 2),2);
        if (iVar1 == 0) {
          return 0;
        }
        if (iVar3 == 0) {
          if ((((*(byte *)(*(long *)(*(int **)(param_1 + 8) + 0x30) + 0x60) >> 3 & 1) == 0) &&
              (iVar3 = **(int **)(param_1 + 8), 0x303 < iVar3)) && (iVar3 != 0x10000)) {
            iVar3 = 0;
            if (*(int *)(lVar2 + 0x14) != 6) {
              if (*(int *)(lVar2 + 0xc) == 0x40) {
                iVar3 = 0;
              }
              else {
                iVar3 = 0;
                if (*(int *)(lVar2 + 0xc) != 0x2a3) goto LAB_009c3fbc;
              }
            }
          }
          else {
LAB_009c3fbc:
            iVar3 = 1;
          }
        }
      }
      uVar4 = uVar4 + 1;
    } while (uVar4 < param_4);
    if (iVar3 != 0) {
      return iVar3;
    }
  }
  ERR_new();
  ERR_set_debug("ssl/t1_lib.c",0x899,"tls12_copy_sigalgs");
  ERR_set_error(0x14,0x76,0);
  return 0;
}

