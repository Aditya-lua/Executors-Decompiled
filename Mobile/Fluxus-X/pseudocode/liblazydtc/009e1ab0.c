/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e1ab0
 */

undefined8 dtls_get_message_body(int *param_1,undefined8 *param_2)

{
  char *pcVar1;
  undefined8 uVar2;
  char *pcVar3;
  long lVar4;
  
  if (param_1[0xb6] != 0x101) {
    lVar4 = *(long *)(param_1 + 0x26);
    pcVar3 = *(char **)(*(long *)(param_1 + 0x22) + 8);
    if ((*pcVar3 == '\x14') && (uVar2 = ssl3_take_mac(param_1), (int)uVar2 == 0)) {
      return uVar2;
    }
    pcVar1 = pcVar3 + 0xc;
    if (*param_1 != 0x100) {
      lVar4 = lVar4 + 0xc;
      pcVar1 = pcVar3;
    }
    uVar2 = ssl3_finish_mac(param_1,pcVar1,lVar4);
    if ((int)uVar2 == 0) {
      return uVar2;
    }
    if (*(code **)(param_1 + 0x130) != (code *)0x0) {
      (**(code **)(param_1 + 0x130))
                (0,*param_1,0x16,*(undefined8 *)(*(long *)(param_1 + 0x22) + 8),
                 *(long *)(param_1 + 0x26) + 0xc,param_1,*(undefined8 *)(param_1 + 0x132));
    }
  }
  *param_2 = *(undefined8 *)(param_1 + 0x26);
  return 1;
}

