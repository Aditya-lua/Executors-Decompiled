/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b19adc
 */

ulong FUN_00b19adc(BIO *param_1,void *param_2,int param_3)

{
  int iVar1;
  ulong uVar2;
  undefined4 *puVar3;
  ulong uVar4;
  
  if (*(int *)&param_1->prev_bio->method != 5) {
    uVar2 = FUN_00b1a170(param_1,param_1->prev_bio);
    uVar4 = uVar2 & 0xffffffff;
    if ((int)uVar2 < 1) goto LAB_00b19b68;
  }
  puVar3 = (undefined4 *)__errno();
  *puVar3 = 0;
  uVar4 = write(*(int *)&param_1->next_bio,param_2,(long)param_3);
  BIO_clear_flags(param_1,0xf);
  if (((int)uVar4 < 1) && (iVar1 = BIO_sock_should_retry((int)uVar4), iVar1 != 0)) {
    BIO_set_flags(param_1,10);
  }
LAB_00b19b68:
  return uVar4 & 0xffffffff;
}

