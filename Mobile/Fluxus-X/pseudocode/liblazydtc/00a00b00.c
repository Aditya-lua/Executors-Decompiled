/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a00b00
 */

ulong FUN_00a00b00(BIO *param_1,undefined1 *param_2,int param_3)

{
  char *pcVar1;
  uint uVar2;
  int iVar3;
  ulong uVar4;
  uint uVar5;
  ulong uVar6;
  size_t __n;
  BIO_METHOD *pBVar7;
  
  pBVar7 = (&param_1->prev_bio->method)[((ulong)param_1->ptr & 0x200) == 0];
  BIO_clear_flags(param_1,0xf);
  iVar3 = pBVar7->type;
  if (param_3 <= iVar3) {
    iVar3 = param_3 + -1;
  }
  if (iVar3 < 1) {
    uVar6 = 0;
    *param_2 = 0;
    goto LAB_00a00c28;
  }
  uVar6 = 0;
  do {
    if ((long)iVar3 <= (long)uVar6) break;
    pcVar1 = pBVar7->name + uVar6;
    uVar6 = uVar6 + 1;
  } while (*pcVar1 != '\n');
  pBVar7 = (&param_1->prev_bio->method)[((ulong)param_1->ptr & 0x200) == 0];
  BIO_clear_flags(param_1,0xf);
  uVar5 = (uint)uVar6;
  if ((int)uVar5 < 0) {
    uVar4 = *(ulong *)pBVar7;
LAB_00a00bf4:
    if (uVar4 == 0) {
      uVar5 = *(uint *)&param_1->next_bio;
      uVar6 = (ulong)uVar5;
      if (uVar5 == 0) goto LAB_00a00c28;
      BIO_set_flags(param_1,9);
    }
    else {
      uVar5 = (uint)uVar6;
    }
    if ((int)uVar5 < 1) goto LAB_00a00c28;
    __n = (size_t)(int)uVar6;
  }
  else {
    uVar4 = *(ulong *)pBVar7;
    uVar2 = (uint)uVar4;
    if ((ulong)(long)(int)uVar5 <= uVar4) {
      uVar2 = uVar5;
    }
    uVar6 = (ulong)uVar2;
    if ((param_2 == (undefined1 *)0x0) || ((int)uVar2 < 1)) goto LAB_00a00bf4;
    __n = (size_t)(int)uVar2;
    memcpy(param_2,pBVar7->name,__n);
    *(size_t *)pBVar7 = *(long *)pBVar7 - __n;
    pBVar7->name = pBVar7->name + __n;
    pBVar7->bwrite = pBVar7->bwrite + -__n;
  }
  param_2[__n] = 0;
LAB_00a00c28:
  return uVar6 & 0xffffffff;
}

