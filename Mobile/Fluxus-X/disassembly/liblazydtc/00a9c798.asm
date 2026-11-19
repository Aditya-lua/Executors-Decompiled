; WPACKET_init_der @ 00a9c798
00a9c798	str x19,[sp, #-0x20]!
00a9c79c	mov x19,x0
00a9c7a0	mov w0,wzr
00a9c7a4	stp x29,x30,[sp, #0x10]
00a9c7a8	add x29,sp,#0x10
00a9c7ac	cbz x1,0x00a9c824
00a9c7b0	cbz x2,0x00a9c824
00a9c7b4	ldrb w8,[x19, #0x30]
00a9c7b8	stp xzr,x1,[x19]
00a9c7bc	adrp x1,0x2bd000
00a9c7c0	stp xzr,x2,[x19, #0x18]
00a9c7c4	orr w8,w8,#0x1
00a9c7c8	add x1,x1,#0xe31
00a9c7cc	mov w0,#0x28
00a9c7d0	mov w2,#0x6b
00a9c7d4	strb w8,[x19, #0x30]
00a9c7d8	str xzr,[x19, #0x10]
00a9c7dc	bl 0x00c34250
00a9c7e0	str x0,[x19, #0x28]
00a9c7e4	cbz x0,0x00a9c7f0
00a9c7e8	mov w0,#0x1
00a9c7ec	b 0x00a9c824
00a9c7f0	bl 0x00c342a0
00a9c7f4	adrp x0,0x2bd000
00a9c7f8	adrp x2,0x2b0000
00a9c7fc	add x0,x0,#0xe31
00a9c800	add x2,x2,#0x35a
00a9c804	mov w1,#0x6c
00a9c808	bl 0x00c342b0
00a9c80c	mov w1,#0x100
00a9c810	orr w0,wzr,#0xf
00a9c814	movk w1,#0xc, LSL #16
00a9c818	mov x2,xzr
00a9c81c	bl 0x00c342c0
00a9c820	mov w0,wzr
00a9c824	ldp x29,x30,[sp, #0x10]
00a9c828	ldr x19,[sp], #0x20
00a9c82c	ret
