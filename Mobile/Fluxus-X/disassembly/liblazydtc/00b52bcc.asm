; FUN_00b52bcc @ 00b52bcc
00b52bcc	stp x22,x21,[sp, #-0x30]!
00b52bd0	stp x20,x19,[sp, #0x10]
00b52bd4	stp x29,x30,[sp, #0x20]
00b52bd8	add x29,sp,#0x20
00b52bdc	mov x21,x3
00b52be0	mov x20,x2
00b52be4	mov x22,x1
00b52be8	mov x19,x0
00b52bec	bl 0x00c41000
00b52bf0	cbz w0,0x00b52cdc
00b52bf4	mov x0,x19
00b52bf8	mov x1,x21
00b52bfc	bl 0x00b52dd0
00b52c00	cbz w0,0x00b52cdc
00b52c04	cbz x22,0x00b52c3c
00b52c08	sub x8,x20,#0x1
00b52c0c	cmp x8,#0x40
00b52c10	b.cc 0x00b52c50
00b52c14	bl 0x00c342a0
00b52c18	adrp x0,0x2a1000
00b52c1c	adrp x2,0x29e000
00b52c20	add x0,x0,#0x6b
00b52c24	add x2,x2,#0xf45
00b52c28	mov w1,#0x5e
00b52c2c	bl 0x00c342b0
00b52c30	mov w0,#0x39
00b52c34	mov w1,#0x69
00b52c38	b 0x00b52cd4
00b52c3c	ldrb w8,[x19, #0xf1]
00b52c40	cbz w8,0x00b52cb0
00b52c44	add x22,x19,#0xf0
00b52c48	add x21,x19,#0x130
00b52c4c	b 0x00b52c94
00b52c50	add x21,x19,#0x130
00b52c54	mov x0,x21
00b52c58	mov x1,x22
00b52c5c	mov x2,x20
00b52c60	bl 0x00c2ffd0
00b52c64	cmp x20,#0x3f
00b52c68	b.hi 0x00b52c84
00b52c6c	add x8,x19,x20
00b52c70	mov w9,#0x40
00b52c74	add x0,x8,#0x130
00b52c78	sub x2,x9,x20
00b52c7c	mov w1,wzr
00b52c80	bl 0x00c301c0
00b52c84	add x22,x19,#0xf0
00b52c88	mov x0,x22
00b52c8c	mov w1,w20
00b52c90	bl 0x00c41690
00b52c94	mov x0,x19
00b52c98	ldp x29,x30,[sp, #0x20]
00b52c9c	ldp x20,x19,[sp, #0x10]
00b52ca0	mov x1,x22
00b52ca4	mov x2,x21
00b52ca8	ldp x22,x21,[sp], #0x30
00b52cac	b 0x00c41670
00b52cb0	bl 0x00c342a0
00b52cb4	adrp x0,0x2a1000
00b52cb8	adrp x2,0x2d0000
00b52cbc	add x0,x0,#0x6b
00b52cc0	add x2,x2,#0x8df
00b52cc4	mov w1,#0x75
00b52cc8	bl 0x00c342b0
00b52ccc	mov w0,#0x39
00b52cd0	mov w1,#0x72
00b52cd4	mov x2,xzr
00b52cd8	bl 0x00c342c0
00b52cdc	ldp x29,x30,[sp, #0x20]
00b52ce0	ldp x20,x19,[sp, #0x10]
00b52ce4	mov w0,wzr
00b52ce8	ldp x22,x21,[sp], #0x30
00b52cec	ret
