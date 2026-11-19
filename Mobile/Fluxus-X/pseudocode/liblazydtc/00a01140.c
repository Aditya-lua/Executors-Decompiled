/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a01140
 */

ulong FUN_00a01140(BIO *param_1,void *param_2,int param_3)

{
  int iVar1;
  int *piVar2;
  ulong uVar3;
  int iVar4;
  
  uVar3 = 0;
  if (param_2 != (void *)0x0) {
    piVar2 = (int *)__errno();
    *piVar2 = 0;
    uVar3 = read(*(int *)&param_1->next_bio,param_2,(long)param_3);
    BIO_clear_flags(param_1,0xf);
    iVar4 = (int)uVar3;
    if ((iVar4 < 1) && (iVar4 + 1U < 2)) {
      iVar1 = *piVar2;
      if (((iVar1 - 0x47U < 0x2d) &&
          ((1L << ((ulong)(iVar1 - 0x47U) & 0x3f) & 0x181000000001U) != 0)) ||
         ((iVar1 == 0xb || (iVar1 == 4)))) {
        BIO_set_flags(param_1,9);
      }
      else if (iVar4 == 0) {
        *(uint *)&param_1->ptr = *(uint *)&param_1->ptr | 0x800;
      }
      else {
        uVar3 = 0xffffffff;
      }
    }
  }
  return uVar3 & 0xffffffff;
}

