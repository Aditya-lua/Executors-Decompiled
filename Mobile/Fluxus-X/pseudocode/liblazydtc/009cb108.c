/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009cb108
 */

int ssl3_write_pending(long param_1,int param_2,long param_3,ulong param_4,undefined8 *param_5)

{
  long *plVar1;
  long *plVar2;
  int iVar3;
  undefined4 *puVar4;
  long lVar5;
  long lVar6;
  long lVar7;
  ulong uVar8;
  
  if ((param_4 < *(ulong *)(param_1 + 0x1cd8)) ||
     ((((*(byte *)(param_1 + 0x9f0) >> 1 & 1) == 0 && (*(long *)(param_1 + 0x1cf0) != param_3)) ||
      (*(int *)(param_1 + 0x1ce0) != param_2)))) {
    ERR_new();
    ERR_set_debug("ssl/record/rec_layer_s3.c",0x4a7,"ssl3_write_pending");
    ossl_statem_fatal(param_1,0x50,0x7f,0);
    return -1;
  }
  uVar8 = 0;
  do {
    lVar5 = param_1 + uVar8 * 0x30;
    lVar7 = *(long *)(lVar5 + 0xcc8);
    plVar1 = (long *)(lVar5 + 0xcc8);
    plVar2 = (long *)(lVar5 + 0xcc0);
    while ((lVar7 != 0 || (*(long *)(param_1 + 0xc70) - 1U <= uVar8))) {
      puVar4 = (undefined4 *)__errno();
      *puVar4 = 0;
      if (*(BIO **)(param_1 + 0x18) == (BIO *)0x0) {
        ERR_new();
        ERR_set_debug("ssl/record/rec_layer_s3.c",0x4c7,"ssl3_write_pending");
        ossl_statem_fatal(param_1,0x50,0x80,0);
        iVar3 = -1;
LAB_009cb2b0:
        if ((*(byte *)(*(long *)(*(long *)(param_1 + 8) + 0xc0) + 0x60) >> 3 & 1) == 0) {
          return iVar3;
        }
        *plVar1 = 0;
        return iVar3;
      }
      *(undefined4 *)(param_1 + 0x28) = 2;
      iVar3 = BIO_write(*(BIO **)(param_1 + 0x18),(void *)(*(long *)(lVar5 + 0xca8) + *plVar2),
                        (int)lVar7);
      lVar6 = (long)iVar3;
      if (iVar3 < 0) goto LAB_009cb2b0;
      lVar7 = *plVar1 - lVar6;
      if (lVar7 == 0) {
        *plVar1 = 0;
        *plVar2 = *plVar2 + lVar6;
        if (*(ulong *)(param_1 + 0xc70) <= uVar8 + 1) {
          *(undefined4 *)(param_1 + 0x28) = 1;
          *param_5 = *(undefined8 *)(param_1 + 0x1ce8);
          return 1;
        }
      }
      else {
        if (iVar3 < 1) {
          iVar3 = 0;
          goto LAB_009cb2b0;
        }
        *plVar2 = *plVar2 + lVar6;
        *plVar1 = lVar7;
      }
    }
    uVar8 = uVar8 + 1;
  } while( true );
}

