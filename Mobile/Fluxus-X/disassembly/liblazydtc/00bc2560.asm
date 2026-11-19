; std::__ndk1::chrono::steady_clock::now @ 00bc2560
00bc2560	paciasp
00bc2564	sub sp,sp,#0x20
00bc2568	stp x29,x30,[sp, #0x10]
00bc256c	add x29,sp,#0x10
00bc2570	mov x1,sp
00bc2574	mov w0,#0x1
00bc2578	bl 0x00c308e0
00bc257c	cbnz w0,0x00bc25a0
00bc2580	ldp x8,x10,[sp]
00bc2584	mov w9,#0xca00
00bc2588	movk w9,#0x3b9a, LSL #16
00bc258c	madd x0,x8,x9,x10
00bc2590	ldp x29,x30,[sp, #0x10]
00bc2594	add sp,sp,#0x20
00bc2598	autiasp
00bc259c	ret
00bc25a0	bl 0x00c30710
00bc25a4	ldr w0,[x0]
00bc25a8	adrp x1,0x2a9000
00bc25ac	add x1,x1,#0xf
00bc25b0	bl 0x00c2ffc0
