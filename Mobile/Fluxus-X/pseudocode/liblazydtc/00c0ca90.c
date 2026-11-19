/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c0ca90
 */

int FUN_00c0ca90(char *param_1,__locale_t param_2,char *param_3,undefined8 param_4,
                undefined8 param_5,undefined8 param_6,undefined8 param_7,undefined8 param_8)

{
  int iVar1;
  __locale_t __dataset;
  undefined1 auStack_a0 [8];
  undefined8 local_98;
  undefined8 uStack_90;
  undefined8 local_88;
  undefined8 uStack_80;
  undefined8 local_78;
  undefined1 *local_70;
  undefined1 **ppuStack_68;
  undefined1 *puStack_60;
  undefined8 uStack_58;
  
  local_98 = param_4;
  uStack_90 = param_5;
  local_88 = param_6;
  uStack_80 = param_7;
  local_78 = param_8;
  __dataset = uselocale(param_2);
  uStack_58 = 0xffffff80ffffffd8;
  local_70 = (undefined1 *)register0x00000008;
  ppuStack_68 = &local_70;
  puStack_60 = auStack_a0;
  iVar1 = vsscanf(param_1,param_3,&local_70);
  if (__dataset != (__locale_t)0x0) {
                    /* try { // try from 00c0cb1c to 00c0cb23 has its CatchHandler @ 00c0cb40 */
    uselocale(__dataset);
  }
  return iVar1;
}

