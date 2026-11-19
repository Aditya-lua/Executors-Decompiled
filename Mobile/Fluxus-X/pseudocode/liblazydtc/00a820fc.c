/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a820fc
 */

void ossl_method_construct
               (undefined8 param_1,undefined8 param_2,undefined8 *param_3,undefined4 param_4,
               long param_5,undefined8 param_6)

{
  long lVar1;
  undefined8 uVar2;
  undefined1 auStack_58 [8];
  long local_50;
  undefined4 local_44;
  long local_40;
  undefined8 uStack_38;
  
  uVar2 = 0;
  if (param_3 != (undefined8 *)0x0) {
    uVar2 = *param_3;
  }
  local_50 = 0;
  local_44 = param_4;
  local_40 = param_5;
  uStack_38 = param_6;
  ossl_algorithm_do_all
            (param_1,param_2,uVar2,&LAB_00a821a8,&LAB_00a8223c,FUN_00a82298,&LAB_00a82318,
             FUN_00a82328,auStack_58);
  if ((local_50 == 0) ||
     (lVar1 = (**(code **)(param_5 + 0x18))(local_50,param_3,param_6), lVar1 == 0)) {
    (**(code **)(param_5 + 0x18))(0,param_3,param_6);
  }
  return;
}

