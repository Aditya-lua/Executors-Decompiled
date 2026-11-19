; X509_self_signed @ 00b0d820
00b0d820	str x21,[sp, #-0x30]!
00b0d824	stp x20,x19,[sp, #0x10]
00b0d828	stp x29,x30,[sp, #0x20]
00b0d82c	add x29,sp,#0x20
00b0d830	mov w20,w1
00b0d834	mov x19,x0
00b0d838	bl 0x00c32cb0
00b0d83c	cbz x0,0x00b0d878
00b0d840	mov x21,x0
00b0d844	mov x0,x19
00b0d848	bl 0x00c40ac0
00b0d84c	cbz w0,0x00b0d8a4
00b0d850	ldrb w8,[x19, #0xe9]
00b0d854	mov w0,wzr
00b0d858	tbz w8,#0x5,0x00b0d8a8
00b0d85c	cbz w20,0x00b0d8b8
00b0d860	mov x0,x19
00b0d864	ldp x29,x30,[sp, #0x20]
00b0d868	ldp x20,x19,[sp, #0x10]
00b0d86c	mov x1,x21
00b0d870	ldr x21,[sp], #0x30
00b0d874	b 0x00c40e70
00b0d878	bl 0x00c342a0
00b0d87c	adrp x0,0x2a0000
00b0d880	adrp x2,0x2a8000
00b0d884	add x0,x0,#0xe02
00b0d888	add x2,x2,#0x9bc
00b0d88c	mov w1,#0x62
00b0d890	bl 0x00c342b0
00b0d894	mov w0,#0xb
00b0d898	mov w1,#0x6c
00b0d89c	mov x2,xzr
00b0d8a0	bl 0x00c342c0
00b0d8a4	mov w0,#0xffffffff
00b0d8a8	ldp x29,x30,[sp, #0x20]
00b0d8ac	ldp x20,x19,[sp, #0x10]
00b0d8b0	ldr x21,[sp], #0x30
00b0d8b4	ret
00b0d8b8	mov w0,#0x1
00b0d8bc	b 0x00b0d8a8
