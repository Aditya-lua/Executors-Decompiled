/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c0cdd4
 */

int FUN_00c0cdd4(char **param_1,__locale_t param_2,char *param_3,undefined8 param_4,
                undefined8 param_5,undefined8 param_6,undefined8 param_7,undefined8 param_8)

{
  int iVar1;
  __locale_t __dataset;
  undefined1 auStack_b0 [8];
  undefined8 local_a8;
  undefined8 uStack_a0;
  undefined8 local_98;
  undefined8 uStack_90;
  undefined8 local_88;
  undefined1 *local_80;
  undefined1 **ppuStack_78;
  undefined1 *puStack_70;
  undefined8 uStack_68;
  __locale_t local_58;
  
  local_a8 = param_4;
  uStack_a0 = param_5;
  local_98 = param_6;
  uStack_90 = param_7;
  local_88 = param_8;
  __dataset = uselocale(param_2);
  uStack_68 = 0xffffff80ffffffd8;
                    /* try { // try from 00c0ce4c to 00c0ce5b has its CatchHandler @ 00c0ce8c */
  local_80 = (undefined1 *)register0x00000008;
  ppuStack_78 = &local_80;
  puStack_70 = auStack_b0;
  local_58 = __dataset;
  iVar1 = vasprintf(param_1,param_3,&local_80);
  if (__dataset != (__locale_t)0x0) {
                    /* try { // try from 00c0ce64 to 00c0ce6b has its CatchHandler @ 00c0ce88 */
    uselocale(__dataset);
  }
  return iVar1;
}

