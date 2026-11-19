; ossl_encoder_fetch_by_number @ 00a60cf0
00a60cf0	sub sp,sp,#0x50
00a60cf4	mov x3,x2
00a60cf8	str x0,[sp]
00a60cfc	mov x0,sp
00a60d00	mov x2,xzr
00a60d04	str x19,[sp, #0x30]
00a60d08	stp x29,x30,[sp, #0x40]
00a60d0c	add x29,sp,#0x40
00a60d10	str xzr,[sp, #0x20]
00a60d14	bl 0x00a60a68
00a60d18	ldr x8,[sp, #0x20]
00a60d1c	mov x19,x0
00a60d20	cbz x8,0x00a60d2c
00a60d24	mov x0,x8
00a60d28	bl 0x00c3b5c0
00a60d2c	mov x0,x19
00a60d30	ldp x29,x30,[sp, #0x40]
00a60d34	ldr x19,[sp, #0x30]
00a60d38	add sp,sp,#0x50
00a60d3c	ret
