/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b19b7c
 */

ulong FUN_00b19b7c(BIO *param_1,void *param_2,int param_3)

{
  int iVar1;
  ulong uVar2;
  undefined4 *puVar3;
  int i;
  ulong uVar4;
  
  uVar4 = 0;
  if (*(int *)&param_1->prev_bio->method != 5) {
    uVar2 = FUN_00b1a170(param_1);
    uVar4 = uVar2 & 0xffffffff;
    if ((int)uVar2 < 1) goto LAB_00b19c20;
  }
  if (param_2 != (void *)0x0) {
    puVar3 = (undefined4 *)__errno();
    *puVar3 = 0;
    uVar4 = read(*(int *)&param_1->next_bio,param_2,(long)param_3);
    BIO_clear_flags(param_1,0xf);
    i = (int)uVar4;
    if (i < 1) {
      iVar1 = BIO_sock_should_retry(i);
      if (iVar1 == 0) {
        if (i == 0) {
          *(uint *)&param_1->ptr = *(uint *)&param_1->ptr | 0x800;
        }
      }
      else {
        BIO_set_flags(param_1,9);
      }
    }
  }
LAB_00b19c20:
  return uVar4 & 0xffffffff;
}

