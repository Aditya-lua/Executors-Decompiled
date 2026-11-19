/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00984ba4
 */

/* ix::Socket::readByte(void*, std::__ndk1::function<bool ()> const&) */

byte __thiscall ix::Socket::readByte(Socket *this,void *param_1,function *param_2)

{
  int iVar1;
  ulong uVar2;
  long lVar3;
  int *piVar4;
  byte unaff_w19;
  
  do {
    if ((*(long **)(param_2 + 0x20) != (long *)0x0) &&
       (uVar2 = (**(code **)(**(long **)(param_2 + 0x20) + 0x30))(), (uVar2 & 1) != 0)) {
      return 0;
    }
    lVar3 = (**(code **)(*(long *)this + 0x30))(this,param_1,1);
    if (lVar3 == 1) {
      return 1;
    }
    if (-1 < lVar3) {
      return 0;
    }
    piVar4 = (int *)__errno();
    if ((*piVar4 != 0x73) && (*piVar4 != 0xb)) {
      return 0;
    }
    if (*(int *)(this + 8) == -1) {
      return 0;
    }
    iVar1 = poll(true,1,*(int *)(this + 8),this + 0x38);
    unaff_w19 = unaff_w19 & iVar1 != 3;
  } while (iVar1 != 3);
  return unaff_w19;
}

