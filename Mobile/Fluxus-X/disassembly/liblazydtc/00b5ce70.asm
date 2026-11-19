; FUN_00b5ce70 @ 00b5ce70
00b5ce70	sub sp,sp,#0x90
00b5ce74	stp x24,x23,[sp, #0x50]
00b5ce78	stp x22,x21,[sp, #0x60]
00b5ce7c	stp x20,x19,[sp, #0x70]
00b5ce80	stp x29,x30,[sp, #0x80]
00b5ce84	add x29,sp,#0x80
00b5ce88	mov x22,x3
00b5ce8c	mov x19,x2
00b5ce90	mov x20,x1
00b5ce94	mov x21,x0
00b5ce98	str wzr,[sp, #0x8]
00b5ce9c	bl 0x00c41000
00b5cea0	mov w8,w0
00b5cea4	mov w0,wzr
00b5cea8	cbz x21,0x00b5cf54
00b5ceac	cbz w8,0x00b5cf54
00b5ceb0	ldr x0,[x21, #0x178]
00b5ceb4	cbz x0,0x00b5cf54
00b5ceb8	cbz x20,0x00b5ced4
00b5cebc	add x1,sp,#0xc
00b5cec0	add x2,sp,#0x8
00b5cec4	bl 0x00c31f60
00b5cec8	cbz w0,0x00b5cf54
00b5cecc	ldr w24,[sp, #0x8]
00b5ced0	b 0x00b5ced8
00b5ced4	mov w24,wzr
00b5ced8	ldrb w8,[x21, #0x4a]
00b5cedc	ldr x0,[x21, #0x10]
00b5cee0	orr w8,w8,#0x1
00b5cee4	strb w8,[x21, #0x4a]
00b5cee8	bl 0x00c3a720
00b5ceec	mov w23,w0
00b5cef0	bl 0x00c41000
00b5cef4	cbz w0,0x00b5cf54
00b5cef8	sxtw x8,w23
00b5cefc	cbz x20,0x00b5cf4c
00b5cf00	cmp x8,x22
00b5cf04	mov w0,wzr
00b5cf08	b.hi 0x00b5cf54
00b5cf0c	ldr x8,[x21, #0x160]
00b5cf10	mov w2,w24
00b5cf14	cbz x8,0x00b5cf24
00b5cf18	cmp x8,x2
00b5cf1c	mov w0,wzr
00b5cf20	b.ne 0x00b5cf54
00b5cf24	ldp x5,x6,[x21, #0x180]
00b5cf28	ldr x7,[x21, #0x10]
00b5cf2c	add x1,sp,#0xc
00b5cf30	sub x4,x29,#0x34
00b5cf34	mov w0,wzr
00b5cf38	mov x3,x20
00b5cf3c	bl 0x00c3b1b0
00b5cf40	cmp w0,#0x1
00b5cf44	b.lt 0x00b5cf6c
00b5cf48	ldur w8,[x29, #-0x34]
00b5cf4c	mov w0,#0x1
00b5cf50	str x8,[x19]
00b5cf54	ldp x29,x30,[sp, #0x80]
00b5cf58	ldp x20,x19,[sp, #0x70]
00b5cf5c	ldp x22,x21,[sp, #0x60]
00b5cf60	ldp x24,x23,[sp, #0x50]
00b5cf64	add sp,sp,#0x90
00b5cf68	ret
00b5cf6c	mov w0,wzr
00b5cf70	b 0x00b5cf54
