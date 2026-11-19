; ossl_config_int @ 00a98ce8
00a98ce8	stp x22,x21,[sp, #-0x30]!
00a98cec	adrp x22,0xd22000
00a98cf0	ldrb w8,[x22, #0xd0]
00a98cf4	stp x20,x19,[sp, #0x10]
00a98cf8	stp x29,x30,[sp, #0x20]
00a98cfc	add x29,sp,#0x20
00a98d00	tbz w8,#0x0,0x00a98d0c
00a98d04	mov w0,#0x1
00a98d08	b 0x00a98d44
00a98d0c	cbz x0,0x00a98d1c
00a98d10	ldp x19,x20,[x0]
00a98d14	ldr x21,[x0, #0x10]
00a98d18	b 0x00a98d28
00a98d1c	mov x20,xzr
00a98d20	mov x19,xzr
00a98d24	mov w21,#0x32
00a98d28	bl 0x00c3de60
00a98d2c	mov x1,x19
00a98d30	mov x2,x20
00a98d34	mov x3,x21
00a98d38	bl 0x00c39540
00a98d3c	mov w8,#0x1
00a98d40	strb w8,[x22, #0xd0]
00a98d44	ldp x29,x30,[sp, #0x20]
00a98d48	ldp x20,x19,[sp, #0x10]
00a98d4c	ldp x22,x21,[sp], #0x30
00a98d50	ret
