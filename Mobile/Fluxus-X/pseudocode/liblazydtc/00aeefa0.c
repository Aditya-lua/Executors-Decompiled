/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aeefa0
 */

undefined8 UI_set_result_ex(long param_1,int *param_2,byte *param_3,int param_4)

{
  int iVar1;
  int iVar2;
  char *pcVar3;
  undefined8 uVar4;
  char cVar5;
  uint uVar6;
  char *__s;
  size_t __n;
  char *__s_00;
  
  uVar6 = *(uint *)(param_1 + 0x28);
  *(uint *)(param_1 + 0x28) = uVar6 & 0xfffffffe;
  if (*param_2 - 1U < 2) {
    if (param_4 < param_2[10]) {
      *(uint *)(param_1 + 0x28) = uVar6 | 1;
      ERR_new();
      ERR_set_debug("crypto/ui/ui_lib.c",0x378,"UI_set_result_ex");
      iVar1 = param_2[10];
      iVar2 = param_2[0xb];
      uVar4 = 0x65;
    }
    else {
      if (param_4 <= param_2[0xb]) {
        if (*(void **)(param_2 + 6) != (void *)0x0) {
          __n = (size_t)param_4;
          memcpy(*(void **)(param_2 + 6),param_3,__n);
          if (param_4 <= param_2[0xb]) {
            *(undefined1 *)(*(long *)(param_2 + 6) + __n) = 0;
          }
          *(size_t *)(param_2 + 8) = __n;
          return 0;
        }
        ERR_new();
        uVar4 = 0x388;
        goto LAB_00aef13c;
      }
      *(uint *)(param_1 + 0x28) = uVar6 | 1;
      ERR_new();
      ERR_set_debug("crypto/ui/ui_lib.c",0x380,"UI_set_result_ex");
      iVar1 = param_2[10];
      iVar2 = param_2[0xb];
      uVar4 = 100;
    }
    ERR_set_error(0x28,uVar4,"You must type in %d to %d characters",iVar1,iVar2);
  }
  else {
    if (*param_2 != 3) {
      return 0;
    }
    if (*(undefined1 **)(param_2 + 6) != (undefined1 *)0x0) {
      **(undefined1 **)(param_2 + 6) = 0;
      uVar6 = (uint)*param_3;
      if (*param_3 != 0) {
        __s = *(char **)(param_2 + 0xc);
        do {
          param_3 = param_3 + 1;
          pcVar3 = strchr(__s,uVar6);
          if (pcVar3 != (char *)0x0) {
            cVar5 = *__s;
LAB_00aef164:
            **(char **)(param_2 + 6) = cVar5;
            return 0;
          }
          __s_00 = *(char **)(param_2 + 0xe);
          pcVar3 = strchr(__s_00,uVar6);
          if (pcVar3 != (char *)0x0) {
            cVar5 = *__s_00;
            goto LAB_00aef164;
          }
          uVar6 = (uint)*param_3;
        } while (uVar6 != 0);
      }
      return 0;
    }
    ERR_new(0);
    uVar4 = 0x396;
LAB_00aef13c:
    ERR_set_debug("crypto/ui/ui_lib.c",uVar4,"UI_set_result_ex");
    ERR_set_error(0x28,0x69,0);
  }
  return 0xffffffff;
}

