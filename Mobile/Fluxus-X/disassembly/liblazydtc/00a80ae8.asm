; ossl_lib_ctx_write_lock @ 00a80ae8
00a80ae8	cbz x0,0x00a80af4
00a80aec	ldr x0,[x0]
00a80af0	b 0x00c356a0
00a80af4	stp x29,x30,[sp, #-0x10]!
00a80af8	adrp x0,0xd21000
00a80afc	adrp x1,0xa81000
00a80b00	add x0,x0,#0xd5c
00a80b04	add x1,x1,#0x348
00a80b08	mov x29,sp
00a80b0c	bl 0x00c34d60
00a80b10	cbz w0,0x00a80b34
00a80b14	adrp x8,0xd21000
00a80b18	ldr w8,[x8, #0xd60]
00a80b1c	mov x0,xzr
00a80b20	cbz w8,0x00a80b38
00a80b24	adrp x0,0xd21000
00a80b28	add x0,x0,#0xd58
00a80b2c	bl 0x00c38360
00a80b30	b 0x00a80b38
00a80b34	mov x0,xzr
00a80b38	adrp x8,0xd21000
00a80b3c	add x8,x8,#0xb90
00a80b40	cmp x0,#0x0
00a80b44	csel x0,x8,x0,eq
00a80b48	ldp x29,x30,[sp], #0x10
00a80b4c	ldr x0,[x0]
00a80b50	b 0x00c356a0
