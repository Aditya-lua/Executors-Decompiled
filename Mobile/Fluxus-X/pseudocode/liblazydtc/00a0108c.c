/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0108c
 */

ulong FUN_00a0108c(BIO *param_1,void *param_2,int param_3)

{
  int iVar1;
  int *piVar2;
  ulong uVar3;
  
  piVar2 = (int *)__errno();
  *piVar2 = 0;
  uVar3 = write(*(int *)&param_1->next_bio,param_2,(long)param_3);
  BIO_clear_flags(param_1,0xf);
  if (((int)uVar3 < 1) && ((int)uVar3 + 1U < 2)) {
    iVar1 = *piVar2;
    if (((iVar1 - 0x47U < 0x2d) && ((1L << ((ulong)(iVar1 - 0x47U) & 0x3f) & 0x181000000001U) != 0))
       || ((iVar1 == 0xb || (iVar1 == 4)))) {
      BIO_set_flags(param_1,10);
    }
  }
  return uVar3 & 0xffffffff;
}

