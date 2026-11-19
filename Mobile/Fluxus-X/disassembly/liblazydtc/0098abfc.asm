; std::__ndk1::__function::__func<std::__ndk1::shared_ptr<ix::ConnectionState>(*)(),std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::ConnectionState>(*)()>,std::__ndk1::shared_ptr<ix::ConnectionState>()>::__clone @ 0098abfc
0098abfc	str x19,[sp, #-0x20]!
0098ac00	stp x29,x30,[sp, #0x10]
0098ac04	add x29,sp,#0x10
0098ac08	mov x19,x0
0098ac0c	mov w0,#0x10
0098ac10	bl 0x00c2fed0
0098ac14	adrp x8,0xcb4000
0098ac18	ldr x8,[x8, #0xff8]
0098ac1c	ldp x29,x30,[sp, #0x10]
0098ac20	add x8,x8,#0x10
0098ac24	str x8,[x0]
0098ac28	ldr x8,[x19, #0x8]
0098ac2c	str x8,[x0, #0x8]
0098ac30	ldr x19,[sp], #0x20
0098ac34	ret
