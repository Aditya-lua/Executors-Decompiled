; std::__ndk1::basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::basic_stringbuf @ 00bd7524
00bd7524	paciasp
00bd7528	stp x29,x30,[sp, #-0x30]!
00bd752c	stp x22,x21,[sp, #0x10]
00bd7530	stp x20,x19,[sp, #0x20]
00bd7534	mov x29,sp
00bd7538	adrp x21,0xcb4000
00bd753c	mov x20,x1
00bd7540	mov x19,x0
00bd7544	ldr x21,[x21, #0xa08]
00bd7548	add x8,x21,#0x10
00bd754c	str x8,[x0], #0x8
00bd7550	bl 0x00c30480
00bd7554	movi v0.2D,#0x0
00bd7558	mov x22,x19
00bd755c	adrp x8,0xcb4000
00bd7560	str xzr,[x22, #0x40]!
00bd7564	stp q0,q0,[x19, #0x20]
00bd7568	str q0,[x19, #0x10]
00bd756c	ldr x8,[x8, #0xa00]
00bd7570	stp xzr,xzr,[x19, #0x48]
00bd7574	ldr w9,[x20, #0x60]
00bd7578	add x8,x8,#0x10
00bd757c	str x8,[x19]
00bd7580	str w9,[x19, #0x60]
00bd7584	mov x0,x19
00bd7588	mov x1,x20
00bd758c	bl 0x00bd75d8
00bd7590	ldp x20,x19,[sp, #0x20]
00bd7594	ldp x22,x21,[sp, #0x10]
00bd7598	ldp x29,x30,[sp], #0x30
00bd759c	autiasp
00bd75a0	ret
