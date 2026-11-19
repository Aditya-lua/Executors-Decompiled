/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c2bcc
 */

void ssl_set_sig_mask(uint *param_1,long param_2,undefined4 param_3)

{
  int iVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  undefined2 *puVar5;
  uint uVar6;
  
  lVar4 = *(long *)(param_2 + 0x898);
  puVar5 = &DAT_0074cd8c;
  uVar6 = *(uint *)(lVar4 + 0x1c) & 0x30000;
  if (uVar6 == 0x30000) {
    lVar4 = 2;
  }
  else {
    if (uVar6 == 0x20000) {
      puVar5 = &DAT_0074cd8e;
    }
    else {
      if (uVar6 != 0x10000) {
        if ((*(int *)(param_2 + 0x38) == 1) &&
           (puVar5 = *(undefined2 **)(lVar4 + 0x1a8), puVar5 != (undefined2 *)0x0)) {
          lVar4 = *(long *)(lVar4 + 0x1b0);
        }
        else {
          puVar5 = *(undefined2 **)(lVar4 + 0x198);
          if (puVar5 == (undefined2 *)0x0) {
            puVar5 = &DAT_0074cd90;
            lVar4 = 0x1c;
            goto LAB_009c2c38;
          }
          lVar4 = *(long *)(lVar4 + 0x1a0);
        }
        if (lVar4 == 0) {
          uVar6 = 0xb;
          goto LAB_009c2c94;
        }
        goto LAB_009c2c38;
      }
      puVar5 = &DAT_0074cd8c;
    }
    lVar4 = 1;
  }
LAB_009c2c38:
  uVar6 = 0xb;
  do {
    lVar2 = FUN_009c21e4(param_2,*puVar5);
    if ((((lVar2 != 0) && (lVar3 = ssl_cert_lookup_by_idx((long)*(int *)(lVar2 + 0x18)), lVar3 != 0)
         ) && ((*(uint *)(lVar3 + 4) & uVar6) != 0)) &&
       (iVar1 = FUN_009c3c60(param_2,param_3,lVar2), iVar1 != 0)) {
      uVar6 = uVar6 & (*(uint *)(lVar3 + 4) ^ 0xffffffff);
    }
    lVar4 = lVar4 + -1;
    puVar5 = puVar5 + 1;
  } while (lVar4 != 0);
LAB_009c2c94:
  *param_1 = *param_1 | uVar6;
  return;
}

