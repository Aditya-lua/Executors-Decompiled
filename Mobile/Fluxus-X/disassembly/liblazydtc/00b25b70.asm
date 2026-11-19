; FUN_00b25b70 @ 00b25b70
00b25b70	stp x20,x19,[sp, #-0x20]!
00b25b74	stp x29,x30,[sp, #0x10]
00b25b78	add x29,sp,#0x10
00b25b7c	mov x19,x0
00b25b80	bl 0x00c41000
00b25b84	cbz w0,0x00b25bd8
00b25b88	adrp x1,0x2c2000
00b25b8c	add x1,x1,#0x99e
00b25b90	orr w0,wzr,#0x78
00b25b94	mov w2,#0x26
00b25b98	bl 0x00c34250
00b25b9c	mov x20,x0
00b25ba0	cbz x0,0x00b25bdc
00b25ba4	adrp x8,0x29b000
00b25ba8	ldr q0,[x8, #0xfc0]
00b25bac	mov w8,#0x4
00b25bb0	movk w8,#0x1, LSL #16
00b25bb4	orr w0,wzr,#0x180
00b25bb8	str w8,[x20]
00b25bbc	stur q0,[x20, #0x8]
00b25bc0	bl 0x00c413a0
00b25bc4	str x0,[x20, #0x68]
00b25bc8	mov x0,x19
00b25bcc	bl 0x00c41210
00b25bd0	str x0,[x20, #0x70]
00b25bd4	b 0x00b25bdc
00b25bd8	mov x20,xzr
00b25bdc	ldp x29,x30,[sp, #0x10]
00b25be0	mov x0,x20
00b25be4	ldp x20,x19,[sp], #0x20
00b25be8	ret
