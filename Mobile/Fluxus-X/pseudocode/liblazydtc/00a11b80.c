/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a11b80
 */

undefined8 conf_ssl_name_find(char *param_1,ulong *param_2)

{
  ulong uVar1;
  int iVar2;
  undefined8 *puVar3;
  ulong uVar4;
  
  uVar1 = DAT_00d21970;
  if ((param_1 != (char *)0x0) && (DAT_00d21970 != 0)) {
    uVar4 = 0;
    puVar3 = DAT_00d21968;
    do {
      iVar2 = strcmp((char *)*puVar3,param_1);
      if (iVar2 == 0) {
        *param_2 = uVar4;
        return 1;
      }
      uVar4 = uVar4 + 1;
      puVar3 = puVar3 + 3;
    } while (uVar4 < uVar1);
  }
  return 0;
}

