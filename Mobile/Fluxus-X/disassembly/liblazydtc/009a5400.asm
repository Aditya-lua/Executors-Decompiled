; std::__ndk1::__call_once_proxy<std::__ndk1::tuple<void(ix::SocketOpenSSL::*&&)(),ix::SocketOpenSSL*&&>> @ 009a5400
009a5400	ldr x8,[x0]
009a5404	ldp x8,x9,[x8]
009a5408	ldr x9,[x9]
009a540c	ldp x1,x10,[x8]
009a5410	add x0,x9,x10, ASR #0x1
009a5414	tbz w10,#0x0,0x009a5420
009a5418	ldr x8,[x0]
009a541c	ldr x1,[x8, x1#0x0]
009a5420	br x1
