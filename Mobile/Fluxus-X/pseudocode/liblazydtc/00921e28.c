/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00921e28
 */

void FUN_00921e28(long param_1,undefined4 param_2,undefined8 param_3)

{
  undefined1 *puVar1;
  undefined1 *puVar2;
  undefined1 *puVar3;
  undefined1 *puVar4;
  int iVar5;
  
  puVar4 = *(undefined1 **)(param_1 + 0x18);
  puVar1 = &DAT_002ab32c;
  if (puVar4 != (undefined1 *)0x0) {
    puVar1 = puVar4;
  }
  puVar2 = &DAT_002ab32c;
  if (puVar4 != (undefined1 *)0x0) {
    puVar2 = &DAT_002c0fba;
  }
  puVar4 = &DAT_002ab32c;
  if (*(undefined1 **)(param_1 + 0x20) != (undefined1 *)0x0) {
    puVar4 = *(undefined1 **)(param_1 + 0x20);
  }
  puVar3 = &DAT_002ab32c;
  if (*(undefined1 **)(param_1 + 0x28) != (undefined1 *)0x0) {
    puVar3 = *(undefined1 **)(param_1 + 0x28);
  }
  iVar5 = FUN_009048cc(param_3,"%s %s%s%s%s HTTP/1.%d\r\n",param_1,puVar1,puVar2,puVar4,puVar3,
                       param_2);
  if ((iVar5 == 0) && (iVar5 = FUN_009202b4(param_1 + 0x30,param_3), iVar5 == 0)) {
    FUN_009045fc(param_3,&DAT_002b917a,2);
    return;
  }
  return;
}

