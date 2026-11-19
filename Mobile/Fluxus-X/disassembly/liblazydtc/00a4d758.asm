; OSSL_DECODER_CTX_add_decoder @ 00a4d758
00a4d758	stp x22,x21,[sp, #-0x30]!
00a4d75c	stp x20,x19,[sp, #0x10]
00a4d760	stp x29,x30,[sp, #0x20]
00a4d764	add x29,sp,#0x20
00a4d768	cbz x0,0x00a4d7d4
00a4d76c	mov x21,x1
00a4d770	cbz x1,0x00a4d7d4
00a4d774	mov x20,x0
00a4d778	mov x0,x21
00a4d77c	bl 0x00c3b3f0
00a4d780	bl 0x00c3b430
00a4d784	ldr x8,[x21, #0x38]
00a4d788	blr x8
00a4d78c	cbz x0,0x00a4d80c
00a4d790	mov x22,x0
00a4d794	mov x0,x21
00a4d798	mov x1,x22
00a4d79c	bl 0x00a4d420
00a4d7a0	cbz x0,0x00a4d81c
00a4d7a4	mov x19,x0
00a4d7a8	ldr x0,[x20, #0x18]
00a4d7ac	cbnz x0,0x00a4d7bc
00a4d7b0	bl 0x00c34780
00a4d7b4	str x0,[x20, #0x18]
00a4d7b8	cbz x0,0x00a4d82c
00a4d7bc	mov x1,x19
00a4d7c0	bl 0x00c347a0
00a4d7c4	cmp w0,#0x0
00a4d7c8	b.le 0x00a4d85c
00a4d7cc	mov w0,#0x1
00a4d7d0	b 0x00a4d80c
00a4d7d4	bl 0x00c342a0
00a4d7d8	adrp x0,0x2bd000
00a4d7dc	adrp x2,0x2c3000
00a4d7e0	add x0,x0,#0x9db
00a4d7e4	add x2,x2,#0x8a1
00a4d7e8	mov w1,#0x13e
00a4d7ec	bl 0x00c342b0
00a4d7f0	mov w8,#0x100
00a4d7f4	movk w8,#0xc, LSL #16
00a4d7f8	add w1,w8,#0x2
00a4d7fc	orr w0,wzr,#0x3c
00a4d800	mov x2,xzr
00a4d804	bl 0x00c342c0
00a4d808	mov w0,wzr
00a4d80c	ldp x29,x30,[sp, #0x20]
00a4d810	ldp x20,x19,[sp, #0x10]
00a4d814	ldp x22,x21,[sp], #0x30
00a4d818	ret
00a4d81c	ldr x8,[x21, #0x40]
00a4d820	mov x0,x22
00a4d824	blr x8
00a4d828	b 0x00a4d808
00a4d82c	bl 0x00c342a0
00a4d830	adrp x0,0x2bd000
00a4d834	adrp x2,0x2bf000
00a4d838	add x0,x0,#0x9db
00a4d83c	add x2,x2,#0xbf9
00a4d840	mov w1,#0x124
00a4d844	bl 0x00c342b0
00a4d848	mov w1,#0x100
00a4d84c	orr w0,wzr,#0x3c
00a4d850	movk w1,#0xc, LSL #16
00a4d854	mov x2,xzr
00a4d858	bl 0x00c342c0
00a4d85c	ldr x8,[x19]
00a4d860	cbz x8,0x00a4d878
00a4d864	ldr x8,[x8, #0x40]
00a4d868	ldr x0,[x19, #0x8]
00a4d86c	blr x8
00a4d870	ldr x0,[x19]
00a4d874	b 0x00a4d87c
00a4d878	mov x0,xzr
00a4d87c	str xzr,[x19, #0x8]
00a4d880	bl 0x00c3b3c0
00a4d884	adrp x1,0x2bd000
00a4d888	add x1,x1,#0x9db
00a4d88c	mov w2,#0x118
00a4d890	mov x0,x19
00a4d894	str xzr,[x19]
00a4d898	bl 0x00c32310
00a4d89c	b 0x00a4d808
