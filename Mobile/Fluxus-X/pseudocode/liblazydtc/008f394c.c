/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008f394c
 */

/* std::__ndk1::function<bool (long, long, long, long, long)>::swap(std::__ndk1::function<bool
   (long, long, long, long, long)>&) */

void __thiscall
std::__ndk1::function<bool(long,long,long,long,long)>::swap
          (function<bool(long,long,long,long,long)> *this,function *param_1)

{
  long lVar1;
  function<bool(long,long,long,long,long)> *pfVar2;
  function *pfVar3;
  long local_60 [5];
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  if (param_1 != (function *)this) {
    pfVar2 = *(function<bool(long,long,long,long,long)> **)(this + 0x20);
    if (pfVar2 == this) {
      if (*(function **)(param_1 + 0x20) == param_1) {
                    /* try { // try from 008f3a14 to 008f3a1b has its CatchHandler @ 008f3aac */
        (**(code **)(*(long *)pfVar2 + 0x18))(pfVar2,local_60);
        (**(code **)(**(long **)(this + 0x20) + 0x20))();
        *(undefined8 *)(this + 0x20) = 0;
                    /* try { // try from 008f3a3c to 008f3a43 has its CatchHandler @ 008f3aac */
        (**(code **)(**(long **)(param_1 + 0x20) + 0x18))(*(long **)(param_1 + 0x20),this);
        (**(code **)(**(long **)(param_1 + 0x20) + 0x20))();
        *(undefined8 *)(param_1 + 0x20) = 0;
        *(function<bool(long,long,long,long,long)> **)(this + 0x20) = this;
                    /* try { // try from 008f3a64 to 008f3a6f has its CatchHandler @ 008f3aac */
        (**(code **)(local_60[0] + 0x18))(local_60,param_1);
        (**(code **)(local_60[0] + 0x20))(local_60);
      }
      else {
                    /* try { // try from 008f39b4 to 008f39bb has its CatchHandler @ 008f3ab0 */
        (**(code **)(*(long *)pfVar2 + 0x18))(pfVar2,param_1);
        (**(code **)(**(long **)(this + 0x20) + 0x20))();
        *(undefined8 *)(this + 0x20) = *(undefined8 *)(param_1 + 0x20);
      }
      *(function **)(param_1 + 0x20) = param_1;
    }
    else {
      pfVar3 = *(function **)(param_1 + 0x20);
      if (param_1 == pfVar3) {
                    /* try { // try from 008f39e0 to 008f39eb has its CatchHandler @ 008f3ab0 */
        (**(code **)(*(long *)pfVar3 + 0x18))(pfVar3,this);
        (**(code **)(**(long **)(param_1 + 0x20) + 0x20))();
        *(undefined8 *)(param_1 + 0x20) = *(undefined8 *)(this + 0x20);
        *(function<bool(long,long,long,long,long)> **)(this + 0x20) = this;
      }
      else {
        *(function **)(this + 0x20) = pfVar3;
        *(function<bool(long,long,long,long,long)> **)(param_1 + 0x20) = pfVar2;
      }
    }
  }
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

