/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009abb94
 */

int ssl3_dispatch_alert(undefined4 *param_1)

{
  int iVar1;
  code *pcVar2;
  undefined1 auStack_40 [8];
  undefined8 local_38;
  
  param_1[0x69] = 0;
  local_38 = 2;
  iVar1 = do_ssl3_write(param_1,0x15,param_1 + 0x6a,&local_38,1,0,auStack_40);
  if (iVar1 < 1) {
    param_1[0x69] = 1;
  }
  else {
    BIO_ctrl(*(BIO **)(param_1 + 6),0xb,0,(void *)0x0);
    if (*(code **)(param_1 + 0x130) != (code *)0x0) {
      (**(code **)(param_1 + 0x130))
                (1,*param_1,0x15,param_1 + 0x6a,2,param_1,*(undefined8 *)(param_1 + 0x132));
    }
    pcVar2 = *(code **)(param_1 + 0x25e);
    if ((pcVar2 != (code *)0x0) ||
       (pcVar2 = *(code **)(*(long *)(param_1 + 0x26a) + 0x120), pcVar2 != (code *)0x0)) {
      (*pcVar2)(param_1,0x4008,
                CONCAT11(*(undefined1 *)(param_1 + 0x6a),*(undefined1 *)((long)param_1 + 0x1a9)));
    }
  }
  return iVar1;
}

