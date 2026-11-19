/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a00a14
 */

int FUN_00a00a14(BIO *param_1,void *param_2,int param_3)

{
  int iVar1;
  ulong uVar2;
  size_t __n;
  BIO_METHOD *pBVar3;
  
  pBVar3 = (&param_1->prev_bio->method)[((ulong)param_1->ptr & 0x200) == 0];
  BIO_clear_flags(param_1,0xf);
  if (param_3 < 0) {
    uVar2 = *(ulong *)pBVar3;
  }
  else {
    uVar2 = *(ulong *)pBVar3;
    iVar1 = (int)uVar2;
    if ((ulong)(long)param_3 <= uVar2) {
      iVar1 = param_3;
    }
    param_3 = iVar1;
    if ((param_2 != (void *)0x0) && (0 < iVar1)) {
      __n = (size_t)iVar1;
      memcpy(param_2,pBVar3->name,__n);
      *(size_t *)pBVar3 = *(long *)pBVar3 - __n;
      pBVar3->name = pBVar3->name + __n;
      pBVar3->bwrite = pBVar3->bwrite + -__n;
      return iVar1;
    }
  }
  if ((uVar2 == 0) && (param_3 = *(int *)&param_1->next_bio, param_3 != 0)) {
    BIO_set_flags(param_1,9);
  }
  return param_3;
}

