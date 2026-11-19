; FUN_00b60bf4 @ 00b60bf4
00b60bf4	sub sp,sp,#0x50
00b60bf8	stp x24,x23,[sp, #0x10]
00b60bfc	stp x22,x21,[sp, #0x20]
00b60c00	stp x20,x19,[sp, #0x30]
00b60c04	stp x29,x30,[sp, #0x40]
00b60c08	mov x23,x0
00b60c0c	ldr x0,[x0, #0x10]
00b60c10	add x29,sp,#0x40
00b60c14	mov x20,x5
00b60c18	mov x21,x4
00b60c1c	mov x24,x3
00b60c20	mov x19,x2
00b60c24	mov x22,x1
00b60c28	bl 0x00c3a720
00b60c2c	sxtw x8,w0
00b60c30	cbz x22,0x00b60c78
00b60c34	cmp x8,x24
00b60c38	mov w0,wzr
00b60c3c	b.hi 0x00b60c80
00b60c40	ldr x8,[x23, #0x170]
00b60c44	cbz x8,0x00b60c54
00b60c48	cmp x8,x20
00b60c4c	mov w0,wzr
00b60c50	b.ne 0x00b60c80
00b60c54	ldr x4,[x23, #0x10]
00b60c58	add x3,sp,#0xc
00b60c5c	mov x0,x21
00b60c60	mov w1,w20
00b60c64	mov x2,x22
00b60c68	bl 0x00c401b0
00b60c6c	cmp w0,#0x1
00b60c70	b.lt 0x00b60c98
00b60c74	ldr w8,[sp, #0xc]
00b60c78	mov w0,#0x1
00b60c7c	str x8,[x19]
00b60c80	ldp x29,x30,[sp, #0x40]
00b60c84	ldp x20,x19,[sp, #0x30]
00b60c88	ldp x22,x21,[sp, #0x20]
00b60c8c	ldp x24,x23,[sp, #0x10]
00b60c90	add sp,sp,#0x50
00b60c94	ret
00b60c98	mov w0,wzr
00b60c9c	b 0x00b60c80
