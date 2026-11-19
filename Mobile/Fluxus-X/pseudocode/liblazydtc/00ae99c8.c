/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ae99c8
 */

undefined8 OSSL_STORE_vctrl(long *param_1,int param_2,long *param_3)

{
  int iVar1;
  undefined8 uVar2;
  undefined8 *puVar3;
  code *pcVar4;
  long local_d0;
  long lStack_c8;
  long local_c0;
  long lStack_b8;
  undefined8 local_b0;
  undefined8 uStack_a8;
  undefined8 uStack_a0;
  undefined8 uStack_98;
  undefined8 local_90;
  undefined4 local_84;
  undefined8 local_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  undefined8 uStack_68;
  undefined8 local_60;
  
  if (param_1[1] == 0) {
    if (*(code **)(*param_1 + 0x20) != (code *)0x0) {
      lStack_b8 = param_3[3];
      local_c0 = param_3[2];
      lStack_c8 = param_3[1];
      local_d0 = *param_3;
      uVar2 = (**(code **)(*param_1 + 0x20))(param_1[2],param_2,&local_d0);
      return uVar2;
    }
  }
  else {
    pcVar4 = *(code **)(param_1[1] + 0xa8);
    if (pcVar4 != (code *)0x0) {
      memset(&local_80,0,0x50);
      if (param_2 == 1) {
        iVar1 = (int)param_3[3];
        if ((iVar1 < 0) && (*(int *)(param_3 + 3) = iVar1 + 8, iVar1 + 8 < 1)) {
          puVar3 = (undefined8 *)(param_3[1] + (long)iVar1);
        }
        else {
          puVar3 = (undefined8 *)*param_3;
          *param_3 = (long)(puVar3 + 1);
        }
        local_84 = *(undefined4 *)*puVar3;
        OSSL_PARAM_construct_int(&local_b0,"use_secmem",&local_84);
        local_60 = local_90;
        uStack_78 = uStack_a8;
        local_80 = local_b0;
        uStack_68 = uStack_98;
        uStack_70 = uStack_a0;
        pcVar4 = *(code **)(param_1[1] + 0xa8);
      }
      uVar2 = (*pcVar4)(param_1[2],&local_80);
      return uVar2;
    }
  }
  return 1;
}

