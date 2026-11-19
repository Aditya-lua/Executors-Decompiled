; FUN_00b5a9e4 @ 00b5a9e4
00b5a9e4	str x23,[sp, #-0x40]!
00b5a9e8	stp x22,x21,[sp, #0x10]
00b5a9ec	stp x20,x19,[sp, #0x20]
00b5a9f0	stp x29,x30,[sp, #0x30]
00b5a9f4	mov x19,x0
00b5a9f8	ldr x21,[x0, #0xf8]
00b5a9fc	ldr x0,[x0, #0x8]
00b5aa00	add x29,sp,#0x30
00b5aa04	mov x20,x1
00b5aa08	bl 0x00c41210
00b5aa0c	mov x22,x0
00b5aa10	add x23,x21,#0x8
00b5aa14	mov x0,x23
00b5aa18	mov x1,x20
00b5aa1c	mov x2,x22
00b5aa20	bl 0x00c41150
00b5aa24	cbz w0,0x00b5aaf0
00b5aa28	mov x0,x23
00b5aa2c	bl 0x00c41160
00b5aa30	mov x23,x0
00b5aa34	cbz x0,0x00b5aa44
00b5aa38	mov x0,x23
00b5aa3c	bl 0x00c3cf50
00b5aa40	tbnz w0,#0x1,0x00b5aac4
00b5aa44	mov x0,x21
00b5aa48	mov x1,x20
00b5aa4c	mov x2,xzr
00b5aa50	mov x3,xzr
00b5aa54	mov x4,xzr
00b5aa58	mov x5,x22
00b5aa5c	bl 0x00c41180
00b5aa60	cbz w0,0x00b5aaf0
00b5aa64	ldr x8,[x21]
00b5aa68	cbz x8,0x00b5aaa8
00b5aa6c	mov x0,x23
00b5aa70	bl 0x00c34c20
00b5aa74	lsl w9,w0,#0x3
00b5aa78	and w9,w9,#0xffffffc0
00b5aa7c	sxtw x8,w0
00b5aa80	mov w10,#0x100
00b5aa84	cmp w9,#0x100
00b5aa88	str x8,[x21, #0x20]
00b5aa8c	str x8,[x19, #0xe8]
00b5aa90	csel w8,w9,w10,cc
00b5aa94	str w8,[x19, #0x80]
00b5aa98	lsr w8,w8,#0x3
00b5aa9c	str x8,[x19, #0x90]
00b5aaa0	lsr x8,x8,#0x1
00b5aaa4	str x8,[x19, #0xa0]
00b5aaa8	mov x0,x19
00b5aaac	mov x1,x20
00b5aab0	ldp x29,x30,[sp, #0x30]
00b5aab4	ldp x20,x19,[sp, #0x20]
00b5aab8	ldp x22,x21,[sp, #0x10]
00b5aabc	ldr x23,[sp], #0x40
00b5aac0	b 0x00c417b0
00b5aac4	bl 0x00c342a0
00b5aac8	adrp x0,0x2b4000
00b5aacc	adrp x2,0x2d6000
00b5aad0	add x0,x0,#0xece
00b5aad4	add x2,x2,#0xc52
00b5aad8	mov w1,#0x176
00b5aadc	bl 0x00c342b0
00b5aae0	mov w0,#0x39
00b5aae4	mov w1,#0xb7
00b5aae8	mov x2,xzr
00b5aaec	bl 0x00c342c0
00b5aaf0	ldp x29,x30,[sp, #0x30]
00b5aaf4	ldp x20,x19,[sp, #0x20]
00b5aaf8	ldp x22,x21,[sp, #0x10]
00b5aafc	mov w0,wzr
00b5ab00	ldr x23,[sp], #0x40
00b5ab04	ret
