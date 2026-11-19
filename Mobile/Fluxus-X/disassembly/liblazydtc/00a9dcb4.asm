; ossl_param_build_set_utf8_string @ 00a9dcb4
00a9dcb4	str x19,[sp, #-0x20]!
00a9dcb8	mov x19,x3
00a9dcbc	stp x29,x30,[sp, #0x10]
00a9dcc0	add x29,sp,#0x10
00a9dcc4	cbz x0,0x00a9dce0
00a9dcc8	ldp x29,x30,[sp, #0x10]
00a9dccc	mov x1,x2
00a9dcd0	mov x2,x19
00a9dcd4	mov x3,xzr
00a9dcd8	ldr x19,[sp], #0x20
00a9dcdc	b 0x00c3e890
00a9dce0	mov x0,x1
00a9dce4	mov x1,x2
00a9dce8	bl 0x00c3e8c0
00a9dcec	cbz x0,0x00a9dd00
00a9dcf0	ldp x29,x30,[sp, #0x10]
00a9dcf4	mov x1,x19
00a9dcf8	ldr x19,[sp], #0x20
00a9dcfc	b 0x00c3dad0
00a9dd00	ldp x29,x30,[sp, #0x10]
00a9dd04	mov w0,#0x1
00a9dd08	ldr x19,[sp], #0x20
00a9dd0c	ret
