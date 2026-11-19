/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00979fe8
 */

/* std::__ndk1::function<void (std::__ndk1::shared_ptr<ix::HttpResponse>
   const&)>::swap(std::__ndk1::function<void (std::__ndk1::shared_ptr<ix::HttpResponse> const&)>&)
    */

void __thiscall
std::__ndk1::function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)>::swap
          (function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)> *this,function *param_1)

{
  long lVar1;
  function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)> *pfVar2;
  function *pfVar3;
  long local_60 [5];
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  if (param_1 != (function *)this) {
    pfVar2 = *(function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)> **)(this + 0x20);
    if (pfVar2 == this) {
      if (*(function **)(param_1 + 0x20) == param_1) {
                    /* try { // try from 0097a0b0 to 0097a0b7 has its CatchHandler @ 0097a148 */
        (**(code **)(*(long *)pfVar2 + 0x18))(pfVar2,local_60);
        (**(code **)(**(long **)(this + 0x20) + 0x20))();
        *(undefined8 *)(this + 0x20) = 0;
                    /* try { // try from 0097a0d8 to 0097a0df has its CatchHandler @ 0097a148 */
        (**(code **)(**(long **)(param_1 + 0x20) + 0x18))(*(long **)(param_1 + 0x20),this);
        (**(code **)(**(long **)(param_1 + 0x20) + 0x20))();
        *(undefined8 *)(param_1 + 0x20) = 0;
        *(function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)> **)(this + 0x20) = this;
                    /* try { // try from 0097a100 to 0097a10b has its CatchHandler @ 0097a148 */
        (**(code **)(local_60[0] + 0x18))(local_60,param_1);
        (**(code **)(local_60[0] + 0x20))(local_60);
      }
      else {
                    /* try { // try from 0097a050 to 0097a057 has its CatchHandler @ 0097a14c */
        (**(code **)(*(long *)pfVar2 + 0x18))(pfVar2,param_1);
        (**(code **)(**(long **)(this + 0x20) + 0x20))();
        *(undefined8 *)(this + 0x20) = *(undefined8 *)(param_1 + 0x20);
      }
      *(function **)(param_1 + 0x20) = param_1;
    }
    else {
      pfVar3 = *(function **)(param_1 + 0x20);
      if (param_1 == pfVar3) {
                    /* try { // try from 0097a07c to 0097a087 has its CatchHandler @ 0097a14c */
        (**(code **)(*(long *)pfVar3 + 0x18))(pfVar3,this);
        (**(code **)(**(long **)(param_1 + 0x20) + 0x20))();
        *(undefined8 *)(param_1 + 0x20) = *(undefined8 *)(this + 0x20);
        *(function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)> **)(this + 0x20) = this;
      }
      else {
        *(function **)(this + 0x20) = pfVar3;
        *(function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)> **)(param_1 + 0x20) =
             pfVar2;
      }
    }
  }
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

