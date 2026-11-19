; EVP_PKEY_get0_hmac @ 00a6d80c
00a6d80c	str x19,[sp, #-0x20]!
00a6d810	stp x29,x30,[sp, #0x10]
00a6d814	ldr w8,[x0]
00a6d818	add x29,sp,#0x10
00a6d81c	cmp w8,#0x357
00a6d820	b.ne 0x00a6d840
00a6d824	mov x19,x1
00a6d828	bl 0x00a6d87c
00a6d82c	cbz x0,0x00a6d870
00a6d830	ldrsw x8,[x0]
00a6d834	str x8,[x19]
00a6d838	ldr x0,[x0, #0x8]
00a6d83c	b 0x00a6d870
00a6d840	bl 0x00c342a0
00a6d844	adrp x0,0x2c1000
00a6d848	adrp x2,0x2aa000
00a6d84c	add x0,x0,#0xcf9
00a6d850	add x2,x2,#0x1ee
00a6d854	mov w1,#0x31f
00a6d858	bl 0x00c342b0
00a6d85c	orr w0,wzr,#0x6
00a6d860	mov w1,#0xae
00a6d864	mov x2,xzr
00a6d868	bl 0x00c342c0
00a6d86c	mov x0,xzr
00a6d870	ldp x29,x30,[sp, #0x10]
00a6d874	ldr x19,[sp], #0x20
00a6d878	ret
