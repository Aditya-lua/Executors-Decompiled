/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009458f0
 */

undefined4 FUN_009458f0(long param_1,char *param_2,size_t param_3)

{
  byte bVar1;
  int iVar2;
  char *__s2;
  ushort uVar3;
  size_t __n;
  long lVar4;
  
  if (param_3 != 0) {
    if ((*(byte *)(param_1 + 0x1e) & 1) != 0) {
      *(byte *)(param_1 + 0x1e) = *(byte *)(param_1 + 0x1e) & 0xfe;
      *(undefined2 *)(param_1 + 0x1a) = 0;
    }
    iVar2 = strncmp(param_2,"*",param_3);
    if (iVar2 == 0) {
      uVar3 = 0xffdf;
LAB_009459e8:
      *(ushort *)(param_1 + 0x1a) = uVar3;
      return 0;
    }
    lVar4 = 0;
    __s2 = "LOGIN";
    do {
      __n = *(size_t *)((long)&DAT_00c50330 + lVar4);
      if ((__n <= param_3) && (iVar2 = memcmp(param_2,__s2,__n), iVar2 == 0)) {
        if (__n != param_3) {
          bVar1 = param_2[__n];
          if ((((bVar1 - 0x41 < 0x1a) || ((bVar1 - 0x30 & 0xff) < 10)) || (bVar1 == 0x5f)) ||
             (bVar1 == 0x2d)) goto LAB_00945978;
          if (__n != param_3) {
            return 3;
          }
        }
        uVar3 = *(ushort *)(param_1 + 0x1a) | *(ushort *)((long)&DAT_00c50338 + lVar4);
        goto LAB_009459e8;
      }
LAB_00945978:
      __s2 = *(char **)((long)&PTR_s_PLAIN_00c50340 + lVar4);
      lVar4 = lVar4 + 0x18;
    } while (lVar4 != 0x108);
  }
  return 3;
}

