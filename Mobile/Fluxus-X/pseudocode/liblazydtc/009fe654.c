/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fe654
 */

undefined8
FUN_009fe654(long *param_1,long *param_2,size_t *param_3,ulong *param_4,undefined1 param_5)

{
  void *pvVar1;
  int num;
  undefined8 uVar2;
  ulong uVar3;
  long lVar4;
  
  if ((param_2 == (long *)0x0) && (*param_1 == 0)) {
    return 0;
  }
  uVar3 = *param_3;
  if (*param_4 < uVar3) {
    return 0;
  }
  if ((param_2 != (long *)0x0) && (uVar3 == *param_4)) {
    if (0x7ffffbff < uVar3) {
      return 0;
    }
    *param_4 = uVar3 + 0x400;
    num = (int)(uVar3 + 0x400);
    if ((void *)*param_2 == (void *)0x0) {
      pvVar1 = CRYPTO_malloc(num,"crypto/bio/bio_print.c",0x352);
      *param_2 = (long)pvVar1;
      if (pvVar1 == (void *)0x0) {
        ERR_new();
        uVar2 = 0x353;
        goto LAB_009fe798;
      }
      if (*param_3 != 0) {
        if ((void *)*param_1 == (void *)0x0) {
          return 0;
        }
        memcpy(pvVar1,(void *)*param_1,*param_3);
      }
      *param_1 = 0;
    }
    else {
      pvVar1 = CRYPTO_realloc((void *)*param_2,num,"crypto/bio/bio_print.c",0x35f);
      if (pvVar1 == (void *)0x0) {
        ERR_new();
        uVar2 = 0x361;
LAB_009fe798:
        ERR_set_debug("crypto/bio/bio_print.c",uVar2,"doapr_outch");
        ERR_set_error(0x20,0xc0100,0);
        return 0;
      }
      *param_2 = (long)pvVar1;
    }
  }
  uVar3 = *param_3;
  if (uVar3 < *param_4) {
    lVar4 = *param_1;
    if (lVar4 == 0) {
      lVar4 = *param_2;
    }
    *param_3 = uVar3 + 1;
    *(undefined1 *)(lVar4 + uVar3) = param_5;
  }
  return 1;
}

