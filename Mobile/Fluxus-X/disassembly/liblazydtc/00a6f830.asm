; EVP_PKEY_set_utf8_string_param @ 00a6f830
00a6f830	sub sp,sp,#0xa0
00a6f834	str x19,[sp, #0x80]
00a6f838	stp x29,x30,[sp, #0x90]
00a6f83c	add x29,sp,#0x90
00a6f840	cbz x1,0x00a6f8e0
00a6f844	mov x19,x0
00a6f848	add x8,sp,#0x8
00a6f84c	mov x0,x1
00a6f850	mov x1,x2
00a6f854	mov x2,xzr
00a6f858	bl 0x00c36280
00a6f85c	ldr x8,[sp, #0x28]
00a6f860	ldur q0,[sp, #0x18]
00a6f864	ldur q1,[sp, #0x8]
00a6f868	str x8,[sp, #0x50]
00a6f86c	add x8,sp,#0x8
00a6f870	stp q1,q0,[sp, #0x30]
00a6f874	bl 0x00c34c40
00a6f878	ldr x8,[sp, #0x28]
00a6f87c	ldur q0,[sp, #0x18]
00a6f880	ldur q1,[sp, #0x8]
00a6f884	str x8,[sp, #0x78]
00a6f888	stur q0,[sp, #0x68]
00a6f88c	stur q1,[sp, #0x58]
00a6f890	cbz x19,0x00a6f8b4
00a6f894	ldr x0,[x19, #0x60]
00a6f898	cbz x0,0x00a6f8b4
00a6f89c	ldp x1,x8,[x19, #0x68]
00a6f8a0	add x2,sp,#0x30
00a6f8a4	add x8,x8,#0x1
00a6f8a8	str x8,[x19, #0x70]
00a6f8ac	bl 0x00c3d440
00a6f8b0	b 0x00a6f8e4
00a6f8b4	bl 0x00c342a0
00a6f8b8	adrp x0,0x2c1000
00a6f8bc	adrp x2,0x2dc000
00a6f8c0	add x0,x0,#0xcf9
00a6f8c4	add x2,x2,#0x96
00a6f8c8	mov w1,#0x94c
00a6f8cc	bl 0x00c342b0
00a6f8d0	orr w0,wzr,#0x6
00a6f8d4	mov w1,#0xa3
00a6f8d8	mov x2,xzr
00a6f8dc	bl 0x00c342c0
00a6f8e0	mov w0,wzr
00a6f8e4	ldp x29,x30,[sp, #0x90]
00a6f8e8	ldr x19,[sp, #0x80]
00a6f8ec	add sp,sp,#0xa0
00a6f8f0	ret
