; FUN_0090ec74 @ 0090ec74
0090ec74	stp x22,x21,[sp, #-0x30]!
0090ec78	stp x20,x19,[sp, #0x10]
0090ec7c	stp x29,x30,[sp, #0x20]
0090ec80	add x29,sp,#0x20
0090ec84	ldr x21,[x0, #0xda0]
0090ec88	mov x19,x0
0090ec8c	mov x20,x1
0090ec90	str xzr,[x1]
0090ec94	cbz x21,0x0090ecec
0090ec98	ldr x0,[x21, #0x18]
0090ec9c	bl 0x00c31ca0
0090eca0	ldr x0,[x21, #0x18]
0090eca4	ldr w22,[x21, #0x20]
0090eca8	bl 0x00c31cb0
0090ecac	cbz w22,0x0090ecf4
0090ecb0	ldr x22,[x19, #0xda0]
0090ecb4	mov x0,x19
0090ecb8	add x21,x19,#0xd90
0090ecbc	ldr w1,[x22, #0x40]
0090ecc0	ldr x2,[x22, #0x48]
0090ecc4	bl 0x00916af4
0090ecc8	str xzr,[x22, #0x48]
0090eccc	ldr x8,[x19, #0xd98]
0090ecd0	cbz x8,0x0090ed3c
0090ecd4	mov x0,x21
0090ecd8	bl 0x0090ea5c
0090ecdc	ldr x8,[x19, #0xd98]
0090ece0	mov w0,wzr
0090ece4	str x8,[x20]
0090ece8	b 0x0090ed80
0090ecec	orr w0,wzr,#0x6
0090ecf0	b 0x0090ed80
0090ecf4	bl 0x00941cb8
0090ecf8	ldr x2,[x19, #0xb40]
0090ecfc	ldr x3,[x19, #0xb48]
0090ed00	bl 0x00941d54
0090ed04	ldr w9,[x21, #0x8]
0090ed08	bic x8,x0,x0, ASR #0x3f
0090ed0c	cbz w9,0x0090ed58
0090ed10	mov x10,x21
0090ed14	ldr x11,[x10, #0x10]!
0090ed18	cmp x8,x11
0090ed1c	b.lt 0x0090ed28
0090ed20	lsl w9,w9,#0x1
0090ed24	str w9,[x21, #0x8]
0090ed28	cmp w9,#0xfb
0090ed2c	b.cc 0x0090ed64
0090ed30	mov w9,#0xfa
0090ed34	str w9,[x21, #0x8]
0090ed38	b 0x0090ed64
0090ed3c	mov x0,x19
0090ed40	bl 0x0091829c
0090ed44	mov w19,w0
0090ed48	mov x0,x21
0090ed4c	bl 0x0090ea5c
0090ed50	mov w0,w19
0090ed54	b 0x0090ed80
0090ed58	mov w9,#0x1
0090ed5c	str w9,[x21, #0x8]
0090ed60	add x10,x21,#0x10
0090ed64	mov w1,w9
0090ed68	add x8,x8,x1
0090ed6c	mov w2,#0x1
0090ed70	mov x0,x19
0090ed74	str x8,[x10]
0090ed78	bl 0x0092aff8
0090ed7c	mov w0,wzr
0090ed80	ldp x29,x30,[sp, #0x20]
0090ed84	ldp x20,x19,[sp, #0x10]
0090ed88	ldp x22,x21,[sp], #0x30
0090ed8c	ret
