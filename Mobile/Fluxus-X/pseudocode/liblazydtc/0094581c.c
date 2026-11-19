/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0094581c
 */

undefined2 FUN_0094581c(void *param_1,ulong param_2,size_t *param_3)

{
  byte bVar1;
  int iVar2;
  char *__s2;
  size_t __n;
  long lVar3;
  
  lVar3 = 0;
  __s2 = "LOGIN";
  do {
    __n = *(size_t *)((long)&DAT_00c50330 + lVar3);
    if ((__n <= param_2) && (iVar2 = memcmp(param_1,__s2,__n), iVar2 == 0)) {
      if (param_3 != (size_t *)0x0) {
        *param_3 = __n;
      }
      if (__n == param_2) {
LAB_009458c8:
        return *(undefined2 *)((long)&DAT_00c50338 + lVar3);
      }
      bVar1 = *(byte *)((long)param_1 + __n);
      if ((((0x19 < bVar1 - 0x41) && (9 < (bVar1 - 0x30 & 0xff))) && (bVar1 != 0x5f)) &&
         (bVar1 != 0x2d)) goto LAB_009458c8;
    }
    __s2 = *(char **)((long)&PTR_s_PLAIN_00c50340 + lVar3);
    lVar3 = lVar3 + 0x18;
    if (lVar3 == 0x108) {
      return 0;
    }
  } while( true );
}

