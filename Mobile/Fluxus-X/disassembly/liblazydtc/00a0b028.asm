; bn_sqr_fixed_top @ 00a0b028
00a0b028	sub sp,sp,#0x150
00a0b02c	stp x28,x25,[sp, #0x100]
00a0b030	stp x24,x23,[sp, #0x110]
00a0b034	stp x22,x21,[sp, #0x120]
00a0b038	stp x20,x19,[sp, #0x130]
00a0b03c	stp x29,x30,[sp, #0x140]
00a0b040	ldrsw x22,[x1, #0x8]
00a0b044	mov x20,x0
00a0b048	add x29,sp,#0x140
00a0b04c	cmp w22,#0x0
00a0b050	b.le 0x00a0b0c8
00a0b054	mov x0,x2
00a0b058	mov x19,x2
00a0b05c	mov x24,x1
00a0b060	bl 0x00c38a90
00a0b064	cmp x24,x20
00a0b068	mov x21,x20
00a0b06c	b.ne 0x00a0b07c
00a0b070	mov x0,x19
00a0b074	bl 0x00c38a40
00a0b078	mov x21,x0
00a0b07c	mov x0,x19
00a0b080	bl 0x00c38a40
00a0b084	cbz x21,0x00a0b190
00a0b088	mov x25,x0
00a0b08c	mov w23,wzr
00a0b090	cbz x0,0x00a0b194
00a0b094	lsl w23,w22,#0x1
00a0b098	mov x0,x21
00a0b09c	mov w1,w23
00a0b0a0	bl 0x00c38e80
00a0b0a4	cbz x0,0x00a0b190
00a0b0a8	cmp w22,#0x8
00a0b0ac	b.eq 0x00a0b0d8
00a0b0b0	cmp w22,#0x4
00a0b0b4	b.ne 0x00a0b0e8
00a0b0b8	ldr x0,[x21]
00a0b0bc	ldr x1,[x24]
00a0b0c0	bl 0x00c38910
00a0b0c4	b 0x00a0b168
00a0b0c8	str wzr,[x20, #0x8]
00a0b0cc	str wzr,[x20, #0x10]
00a0b0d0	mov w23,#0x1
00a0b0d4	b 0x00a0b19c
00a0b0d8	ldr x0,[x21]
00a0b0dc	ldr x1,[x24]
00a0b0e0	bl 0x00c38920
00a0b0e4	b 0x00a0b168
00a0b0e8	cmp w22,#0xf
00a0b0ec	b.gt 0x00a0b100
00a0b0f0	ldr x0,[x21]
00a0b0f4	ldr x1,[x24]
00a0b0f8	mov x3,sp
00a0b0fc	b 0x00a0b160
00a0b100	mov x0,x22
00a0b104	bl 0x00c38d80
00a0b108	sub w8,w0,#0x1
00a0b10c	mov w9,#0x1
00a0b110	lsl w8,w9,w8
00a0b114	cmp w22,w8
00a0b118	b.ne 0x00a0b144
00a0b11c	lsl w1,w22,#0x2
00a0b120	mov x0,x25
00a0b124	bl 0x00c38e80
00a0b128	cbz x0,0x00a0b190
00a0b12c	ldr x0,[x21]
00a0b130	ldr x1,[x24]
00a0b134	ldr x3,[x25]
00a0b138	mov w2,w22
00a0b13c	bl 0x00a0b2b4
00a0b140	b 0x00a0b168
00a0b144	mov x0,x25
00a0b148	mov w1,w23
00a0b14c	bl 0x00c38e80
00a0b150	cbz x0,0x00a0b190
00a0b154	ldr x0,[x21]
00a0b158	ldr x1,[x24]
00a0b15c	ldr x3,[x25]
00a0b160	mov w2,w22
00a0b164	bl 0x00a0b1bc
00a0b168	cmp x21,x20
00a0b16c	str wzr,[x21, #0x10]
00a0b170	str w23,[x21, #0x8]
00a0b174	b.eq 0x00a0b188
00a0b178	mov x0,x20
00a0b17c	mov x1,x21
00a0b180	bl 0x00c36990
00a0b184	cbz x0,0x00a0b190
00a0b188	mov w23,#0x1
00a0b18c	b 0x00a0b194
00a0b190	mov w23,wzr
00a0b194	mov x0,x19
00a0b198	bl 0x00c38a20
00a0b19c	mov w0,w23
00a0b1a0	ldp x29,x30,[sp, #0x140]
00a0b1a4	ldp x20,x19,[sp, #0x130]
00a0b1a8	ldp x22,x21,[sp, #0x120]
00a0b1ac	ldp x24,x23,[sp, #0x110]
00a0b1b0	ldp x28,x25,[sp, #0x100]
00a0b1b4	add sp,sp,#0x150
00a0b1b8	ret
