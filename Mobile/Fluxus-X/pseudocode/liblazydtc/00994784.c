/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00994784
 */

/* std::__ndk1::function<void (std::__ndk1::shared_ptr<ix::ConnectionState>, ix::WebSocket&,
   std::__ndk1::unique_ptr<ix::WebSocketMessage, std::__ndk1::default_delete<ix::WebSocketMessage> >
   const&)>::swap(std::__ndk1::function<void (std::__ndk1::shared_ptr<ix::ConnectionState>,
   ix::WebSocket&, std::__ndk1::unique_ptr<ix::WebSocketMessage,
   std::__ndk1::default_delete<ix::WebSocketMessage> > const&)>&) */

void __thiscall
std::__ndk1::
function<void(std::__ndk1::shared_ptr<ix::ConnectionState>,ix::WebSocket&,std::__ndk1::unique_ptr<ix::WebSocketMessage,std::__ndk1::default_delete<ix::WebSocketMessage>>const&)>
::swap(function<void(std::__ndk1::shared_ptr<ix::ConnectionState>,ix::WebSocket&,std::__ndk1::unique_ptr<ix::WebSocketMessage,std::__ndk1::default_delete<ix::WebSocketMessage>>const&)>
       *this,function *param_1)

{
  long lVar1;
  function<void(std::__ndk1::shared_ptr<ix::ConnectionState>,ix::WebSocket&,std::__ndk1::unique_ptr<ix::WebSocketMessage,std::__ndk1::default_delete<ix::WebSocketMessage>>const&)>
  *pfVar2;
  function *pfVar3;
  long local_60 [5];
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  if (param_1 != (function *)this) {
    pfVar2 = *(function<void(std::__ndk1::shared_ptr<ix::ConnectionState>,ix::WebSocket&,std::__ndk1::unique_ptr<ix::WebSocketMessage,std::__ndk1::default_delete<ix::WebSocketMessage>>const&)>
               **)(this + 0x20);
    if (pfVar2 == this) {
      if (*(function **)(param_1 + 0x20) == param_1) {
                    /* try { // try from 0099484c to 00994853 has its CatchHandler @ 009948e4 */
        (**(code **)(*(long *)pfVar2 + 0x18))(pfVar2,local_60);
        (**(code **)(**(long **)(this + 0x20) + 0x20))();
        *(undefined8 *)(this + 0x20) = 0;
                    /* try { // try from 00994874 to 0099487b has its CatchHandler @ 009948e4 */
        (**(code **)(**(long **)(param_1 + 0x20) + 0x18))(*(long **)(param_1 + 0x20),this);
        (**(code **)(**(long **)(param_1 + 0x20) + 0x20))();
        *(undefined8 *)(param_1 + 0x20) = 0;
        *(function<void(std::__ndk1::shared_ptr<ix::ConnectionState>,ix::WebSocket&,std::__ndk1::unique_ptr<ix::WebSocketMessage,std::__ndk1::default_delete<ix::WebSocketMessage>>const&)>
          **)(this + 0x20) = this;
                    /* try { // try from 0099489c to 009948a7 has its CatchHandler @ 009948e4 */
        (**(code **)(local_60[0] + 0x18))(local_60,param_1);
        (**(code **)(local_60[0] + 0x20))(local_60);
      }
      else {
                    /* try { // try from 009947ec to 009947f3 has its CatchHandler @ 009948e8 */
        (**(code **)(*(long *)pfVar2 + 0x18))(pfVar2,param_1);
        (**(code **)(**(long **)(this + 0x20) + 0x20))();
        *(undefined8 *)(this + 0x20) = *(undefined8 *)(param_1 + 0x20);
      }
      *(function **)(param_1 + 0x20) = param_1;
    }
    else {
      pfVar3 = *(function **)(param_1 + 0x20);
      if (param_1 == pfVar3) {
                    /* try { // try from 00994818 to 00994823 has its CatchHandler @ 009948e8 */
        (**(code **)(*(long *)pfVar3 + 0x18))(pfVar3,this);
        (**(code **)(**(long **)(param_1 + 0x20) + 0x20))();
        *(undefined8 *)(param_1 + 0x20) = *(undefined8 *)(this + 0x20);
        *(function<void(std::__ndk1::shared_ptr<ix::ConnectionState>,ix::WebSocket&,std::__ndk1::unique_ptr<ix::WebSocketMessage,std::__ndk1::default_delete<ix::WebSocketMessage>>const&)>
          **)(this + 0x20) = this;
      }
      else {
        *(function **)(this + 0x20) = pfVar3;
        *(function<void(std::__ndk1::shared_ptr<ix::ConnectionState>,ix::WebSocket&,std::__ndk1::unique_ptr<ix::WebSocketMessage,std::__ndk1::default_delete<ix::WebSocketMessage>>const&)>
          **)(param_1 + 0x20) = pfVar2;
      }
    }
  }
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

