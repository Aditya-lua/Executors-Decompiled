; FUN_00b5b07c @ 00b5b07c
00b5b07c	sub sp,sp,#0x70
00b5b080	stp x28,x27,[sp, #0x10]
00b5b084	stp x26,x25,[sp, #0x20]
00b5b088	stp x24,x23,[sp, #0x30]
00b5b08c	stp x22,x21,[sp, #0x40]
00b5b090	stp x20,x19,[sp, #0x50]
00b5b094	stp x29,x30,[sp, #0x60]
00b5b098	strb w1,[sp, #0xc]
00b5b09c	ldr x19,[x0]
00b5b0a0	mov x28,x2
00b5b0a4	ldr x2,[x0, #0x20]
00b5b0a8	add x22,x0,#0x28
00b5b0ac	mov x27,x3
00b5b0b0	mov x20,x0
00b5b0b4	mov x0,x19
00b5b0b8	mov x1,x22
00b5b0bc	mov x3,xzr
00b5b0c0	add x29,sp,#0x60
00b5b0c4	mov x23,x7
00b5b0c8	mov x24,x6
00b5b0cc	mov x25,x5
00b5b0d0	mov x26,x4
00b5b0d4	bl 0x00c363d0
00b5b0d8	cbz w0,0x00b5b1bc
00b5b0dc	ldr x2,[x20, #0x20]
00b5b0e0	add x21,x20,#0x68
00b5b0e4	mov x0,x19
00b5b0e8	mov x1,x21
00b5b0ec	bl 0x00c363e0
00b5b0f0	cbz w0,0x00b5b1bc
00b5b0f4	add x1,sp,#0xc
00b5b0f8	mov w2,#0x1
00b5b0fc	mov x0,x19
00b5b100	bl 0x00c363e0
00b5b104	cbz w0,0x00b5b1bc
00b5b108	cbz x28,0x00b5b124
00b5b10c	cbz x27,0x00b5b124
00b5b110	mov x0,x19
00b5b114	mov x1,x28
00b5b118	mov x2,x27
00b5b11c	bl 0x00c363e0
00b5b120	cbz w0,0x00b5b1bc
00b5b124	cbz x26,0x00b5b140
00b5b128	cbz x25,0x00b5b140
00b5b12c	mov x0,x19
00b5b130	mov x1,x26
00b5b134	mov x2,x25
00b5b138	bl 0x00c363e0
00b5b13c	cbz w0,0x00b5b1bc
00b5b140	cbz x24,0x00b5b15c
00b5b144	cbz x23,0x00b5b15c
00b5b148	mov x0,x19
00b5b14c	mov x1,x24
00b5b150	mov x2,x23
00b5b154	bl 0x00c363e0
00b5b158	cbz w0,0x00b5b1bc
00b5b15c	mov w3,#0x40
00b5b160	mov x0,x19
00b5b164	mov x1,x22
00b5b168	mov x2,xzr
00b5b16c	bl 0x00c363b0
00b5b170	cbz w0,0x00b5b1bc
00b5b174	ldr x2,[x20, #0x20]
00b5b178	mov x0,x19
00b5b17c	mov x1,x22
00b5b180	mov x3,xzr
00b5b184	bl 0x00c363d0
00b5b188	cbz w0,0x00b5b1bc
00b5b18c	ldr x2,[x20, #0x20]
00b5b190	mov x0,x19
00b5b194	mov x1,x21
00b5b198	bl 0x00c363e0
00b5b19c	cbz w0,0x00b5b1bc
00b5b1a0	mov w3,#0x40
00b5b1a4	mov x0,x19
00b5b1a8	mov x1,x21
00b5b1ac	mov x2,xzr
00b5b1b0	bl 0x00c363b0
00b5b1b4	cmp w0,#0x0
00b5b1b8	cset w0,ne
00b5b1bc	ldp x29,x30,[sp, #0x60]
00b5b1c0	ldp x20,x19,[sp, #0x50]
00b5b1c4	ldp x22,x21,[sp, #0x40]
00b5b1c8	ldp x24,x23,[sp, #0x30]
00b5b1cc	ldp x26,x25,[sp, #0x20]
00b5b1d0	ldp x28,x27,[sp, #0x10]
00b5b1d4	add sp,sp,#0x70
00b5b1d8	ret
