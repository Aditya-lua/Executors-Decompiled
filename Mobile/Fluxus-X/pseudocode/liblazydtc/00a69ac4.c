/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a69ac4
 */

undefined8
EVP_PBE_find_ex(undefined4 param_1,int param_2,undefined4 *param_3,undefined4 *param_4,
               undefined8 *param_5,undefined8 *param_6)

{
  undefined4 uVar1;
  void *pvVar2;
  undefined4 local_60;
  int iStack_5c;
  
  if (param_2 == 0) {
    return 0;
  }
  local_60 = param_1;
  iStack_5c = param_2;
  if (DAT_00d21b40 != 0) {
    uVar1 = OPENSSL_sk_find(DAT_00d21b40,&local_60);
    pvVar2 = (void *)OPENSSL_sk_value(DAT_00d21b40,uVar1);
    if (pvVar2 != (void *)0x0) goto LAB_00a69b44;
  }
  pvVar2 = OBJ_bsearch_(&local_60,&DAT_00c5e550,0x1d,0x20,(cmp *)&LAB_00a69e6c);
  if (pvVar2 == (void *)0x0) {
    return 0;
  }
LAB_00a69b44:
  if (param_3 != (undefined4 *)0x0) {
    *param_3 = *(undefined4 *)((long)pvVar2 + 8);
  }
  if (param_4 != (undefined4 *)0x0) {
    *param_4 = *(undefined4 *)((long)pvVar2 + 0xc);
  }
  if (param_5 != (undefined8 *)0x0) {
    *param_5 = *(undefined8 *)((long)pvVar2 + 0x10);
  }
  if (param_6 != (undefined8 *)0x0) {
    *param_6 = *(undefined8 *)((long)pvVar2 + 0x18);
  }
  return 1;
}

