; CONF_load_bio @ 00a0ce70
00a0ce70	sub sp,sp,#0x60
00a0ce74	stp x22,x21,[sp, #0x30]
00a0ce78	adrp x22,0xd21000
00a0ce7c	ldr x8,[x22, #0x950]
00a0ce80	stp x20,x19,[sp, #0x40]
00a0ce84	mov x19,x2
00a0ce88	mov x20,x1
00a0ce8c	mov x21,x0
00a0ce90	stp x29,x30,[sp, #0x50]
00a0ce94	add x29,sp,#0x50
00a0ce98	cbnz x8,0x00a0cea8
00a0ce9c	bl 0x00c39420
00a0cea0	mov x8,x0
00a0cea4	str x0,[x22, #0x950]
00a0cea8	ldr x8,[x8, #0x10]
00a0ceac	mov x0,sp
00a0ceb0	blr x8
00a0ceb4	ldr x8,[sp]
00a0ceb8	str x21,[sp, #0x10]
00a0cebc	mov x0,sp
00a0cec0	mov x1,x20
00a0cec4	ldr x8,[x8, #0x28]
00a0cec8	mov x2,x19
00a0cecc	blr x8
00a0ced0	ldr x8,[sp, #0x10]
00a0ced4	ldp x29,x30,[sp, #0x50]
00a0ced8	ldp x20,x19,[sp, #0x40]
00a0cedc	ldp x22,x21,[sp, #0x30]
00a0cee0	cmp w0,#0x0
00a0cee4	csel x0,xzr,x8,eq
00a0cee8	add sp,sp,#0x60
00a0ceec	ret
