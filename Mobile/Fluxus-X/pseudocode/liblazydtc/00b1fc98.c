/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1fc98
 */

undefined8
ossl_prov_bio_printf
          (undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
          undefined8 param_5,undefined8 param_6,undefined8 param_7,undefined8 param_8)

{
  undefined8 uVar1;
  undefined8 local_b0;
  undefined8 uStack_a8;
  undefined8 local_a0;
  undefined8 uStack_98;
  undefined8 local_90;
  undefined8 uStack_88;
  undefined1 *local_80;
  undefined1 **ppuStack_78;
  undefined8 *puStack_70;
  undefined8 uStack_68;
  undefined1 *local_40;
  undefined1 **ppuStack_38;
  undefined8 *puStack_30;
  undefined8 uStack_28;
  
  puStack_70 = &local_b0;
  ppuStack_78 = &local_80;
  uStack_68 = 0xffffff80ffffffd0;
  if (DAT_00d23800 == (code *)0x0) {
    uVar1 = 0xffffffff;
  }
  else {
    uStack_28 = 0xffffff80ffffffd0;
    local_b0 = param_3;
    uStack_a8 = param_4;
    local_a0 = param_5;
    uStack_98 = param_6;
    local_90 = param_7;
    uStack_88 = param_8;
    local_80 = (undefined1 *)register0x00000008;
    local_40 = (undefined1 *)register0x00000008;
    ppuStack_38 = ppuStack_78;
    puStack_30 = puStack_70;
    uVar1 = (*DAT_00d23800)(param_1,param_2,&local_40);
  }
  return uVar1;
}

