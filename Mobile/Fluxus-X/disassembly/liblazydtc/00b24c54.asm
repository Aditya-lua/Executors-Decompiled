; FUN_00b24c54 @ 00b24c54
00b24c54	stp x24,x23,[sp, #-0x40]!
00b24c58	stp x22,x21,[sp, #0x10]
00b24c5c	stp x20,x19,[sp, #0x20]
00b24c60	stp x29,x30,[sp, #0x30]
00b24c64	add x29,sp,#0x30
00b24c68	mov x19,x5
00b24c6c	mov x21,x4
00b24c70	mov x24,x3
00b24c74	mov x20,x2
00b24c78	mov x22,x1
00b24c7c	mov x23,x0
00b24c80	bl 0x00c41000
00b24c84	cbz w0,0x00b24d1c
00b24c88	cmp x24,x19
00b24c8c	b.cs 0x00b24cb8
00b24c90	bl 0x00c342a0
00b24c94	adrp x0,0x2b6000
00b24c98	adrp x2,0x2dc000
00b24c9c	add x0,x0,#0x842
00b24ca0	add x2,x2,#0x159
00b24ca4	mov w1,#0x1fd
00b24ca8	bl 0x00c342b0
00b24cac	mov w0,#0x39
00b24cb0	mov w1,#0x6a
00b24cb4	b 0x00b24d10
00b24cb8	ldrb w8,[x23, #0x6c]
00b24cbc	add x0,x23,#0x2b0
00b24cc0	mov x1,x21
00b24cc4	mov x2,x22
00b24cc8	mov x3,x19
00b24ccc	tbnz w8,#0x1,0x00b24ce4
00b24cd0	bl 0x00c3e3f0
00b24cd4	cbz w0,0x00b24cec
00b24cd8	mov w0,#0x1
00b24cdc	str x19,[x20]
00b24ce0	b 0x00b24d1c
00b24ce4	bl 0x00c3e400
00b24ce8	cbnz w0,0x00b24cd8
00b24cec	bl 0x00c342a0
00b24cf0	adrp x0,0x2b6000
00b24cf4	adrp x2,0x2dc000
00b24cf8	add x0,x0,#0x842
00b24cfc	add x2,x2,#0x159
00b24d00	mov w1,#0x202
00b24d04	bl 0x00c342b0
00b24d08	mov w0,#0x39
00b24d0c	mov w1,#0x66
00b24d10	mov x2,xzr
00b24d14	bl 0x00c342c0
00b24d18	mov w0,wzr
00b24d1c	ldp x29,x30,[sp, #0x30]
00b24d20	ldp x20,x19,[sp, #0x20]
00b24d24	ldp x22,x21,[sp, #0x10]
00b24d28	ldp x24,x23,[sp], #0x40
00b24d2c	ret
