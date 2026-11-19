/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00993340
 */

/* std::__ndk1::set<std::__ndk1::shared_ptr<ix::WebSocket>,
   std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket> >,
   std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket> > >::~set() */

void __thiscall
std::__ndk1::
set<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>
::~set(set<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>
       *this)

{
  __tree<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>
  ::destroy((__tree<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>
             *)this,*(__tree_node **)(this + 8));
  return;
}

