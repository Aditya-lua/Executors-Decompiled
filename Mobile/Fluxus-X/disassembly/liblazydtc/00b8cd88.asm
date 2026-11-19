; psa_aead_verify @ 00b8cd88
00b8cd88	sub sp,sp,#0x80
00b8cd8c	stp x28,x27,[sp, #0x20]
00b8cd90	stp x26,x25,[sp, #0x30]
00b8cd94	stp x24,x23,[sp, #0x40]
00b8cd98	stp x22,x21,[sp, #0x50]
00b8cd9c	stp x20,x19,[sp, #0x60]
00b8cda0	stp x29,x30,[sp, #0x70]
00b8cda4	add x29,sp,#0x70
00b8cda8	mrs x28,tpidr_el0
00b8cdac	ldr x8,[x28, #0x28]
00b8cdb0	mov x25,x5
00b8cdb4	mov x27,x4
00b8cdb8	mov x24,x3
00b8cdbc	mov x26,x2
00b8cdc0	mov x19,x1
00b8cdc4	mov x21,x0
00b8cdc8	str x8,[sp, #0x18]
00b8cdcc	cbz x2,0x00b8ce14
00b8cdd0	mov w1,#0x1
00b8cdd4	mov x0,x26
00b8cdd8	bl 0x00c30a30
00b8cddc	mov x20,x0
00b8cde0	mov x22,x26
00b8cde4	cbz x0,0x00b8cf04
00b8cde8	cbz x25,0x00b8ce24
00b8cdec	mov w1,#0x1
00b8cdf0	mov x0,x25
00b8cdf4	bl 0x00c30a30
00b8cdf8	mov x23,x0
00b8cdfc	cbz x0,0x00b8cf10
00b8ce00	mov x0,x23
00b8ce04	mov x1,x27
00b8ce08	mov x2,x25
00b8ce0c	bl 0x00c2ffd0
00b8ce10	b 0x00b8ce28
00b8ce14	mov x22,xzr
00b8ce18	mov x20,xzr
00b8ce1c	mov x19,xzr
00b8ce20	cbnz x25,0x00b8cdec
00b8ce24	mov x23,xzr
00b8ce28	str xzr,[x24]
00b8ce2c	ldr w8,[x21]
00b8ce30	cbz w8,0x00b8ceb0
00b8ce34	ldrb w9,[x21, #0x20]
00b8ce38	tbz w9,#0x0,0x00b8ceb0
00b8ce3c	tbnz w9,#0x1,0x00b8cf60
00b8ce40	tbnz w9,#0x4,0x00b8ceb0
00b8ce44	cmp w8,#0x1
00b8ce48	b.ne 0x00b8cf70
00b8ce4c	add x0,x21,#0x28
00b8ce50	add x4,sp,#0x8
00b8ce54	mov w5,#0x10
00b8ce58	mov x6,sp
00b8ce5c	mov x1,x20
00b8ce60	mov x2,x26
00b8ce64	mov x3,x24
00b8ce68	bl 0x00c42e00
00b8ce6c	mov w24,w0
00b8ce70	cbnz w0,0x00b8ce98
00b8ce74	ldr x8,[sp]
00b8ce78	cmp x8,x25
00b8ce7c	b.ne 0x00b8ce94
00b8ce80	add x1,sp,#0x8
00b8ce84	mov x0,x23
00b8ce88	mov x2,x25
00b8ce8c	bl 0x00c42190
00b8ce90	cbz w0,0x00b8cf80
00b8ce94	mov w24,#0xffffff6b
00b8ce98	add x0,sp,#0x8
00b8ce9c	mov w1,#0x10
00b8cea0	bl 0x00c42220
00b8cea4	ldr w8,[x21]
00b8cea8	cbnz w8,0x00b8cebc
00b8ceac	b 0x00b8cedc
00b8ceb0	mov w24,#0xffffff77
00b8ceb4	ldr w8,[x21]
00b8ceb8	cbz w8,0x00b8cedc
00b8cebc	cmp w8,#0x1
00b8cec0	b.ne 0x00b8cecc
00b8cec4	add x0,x21,#0x28
00b8cec8	bl 0x00c42db0
00b8cecc	mov w2,#0x1d8
00b8ced0	mov x0,x21
00b8ced4	mov w1,wzr
00b8ced8	bl 0x00c301c0
00b8cedc	cbz x20,0x00b8cf24
00b8cee0	cbz x19,0x00b8cf20
00b8cee4	cbz x22,0x00b8cef8
00b8cee8	mov x0,x19
00b8ceec	mov x1,x20
00b8cef0	mov x2,x22
00b8cef4	bl 0x00c2ffd0
00b8cef8	mov x0,x20
00b8cefc	bl 0x00c30960
00b8cf00	b 0x00b8cf24
00b8cf04	mov x19,xzr
00b8cf08	mov x22,xzr
00b8cf0c	mov x23,xzr
00b8cf10	mov w24,#0xffffff73
00b8cf14	ldr w8,[x21]
00b8cf18	cbnz w8,0x00b8cebc
00b8cf1c	b 0x00b8cedc
00b8cf20	mov w24,#0xffffff69
00b8cf24	mov x0,x23
00b8cf28	bl 0x00c30960
00b8cf2c	ldr x8,[x28, #0x28]
00b8cf30	ldr x9,[sp, #0x18]
00b8cf34	cmp x8,x9
00b8cf38	b.ne 0x00b8cf88
00b8cf3c	mov w0,w24
00b8cf40	ldp x29,x30,[sp, #0x70]
00b8cf44	ldp x20,x19,[sp, #0x60]
00b8cf48	ldp x22,x21,[sp, #0x50]
00b8cf4c	ldp x24,x23,[sp, #0x40]
00b8cf50	ldp x26,x25,[sp, #0x30]
00b8cf54	ldp x28,x27,[sp, #0x20]
00b8cf58	add sp,sp,#0x80
00b8cf5c	ret
00b8cf60	ldr x10,[x21, #0x10]
00b8cf64	cbnz x10,0x00b8cf70
00b8cf68	ldr x10,[x21, #0x18]
00b8cf6c	cbz x10,0x00b8ce40
00b8cf70	mov w24,#0xffffff79
00b8cf74	ldr w8,[x21]
00b8cf78	cbnz w8,0x00b8cebc
00b8cf7c	b 0x00b8cedc
00b8cf80	mov w24,wzr
00b8cf84	b 0x00b8ce98
00b8cf88	bl 0x00c2fec0
