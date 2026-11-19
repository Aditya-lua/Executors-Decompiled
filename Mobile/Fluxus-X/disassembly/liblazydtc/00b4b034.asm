; FUN_00b4b034 @ 00b4b034
00b4b034	stp x24,x23,[sp, #-0x40]!
00b4b038	stp x22,x21,[sp, #0x10]
00b4b03c	stp x20,x19,[sp, #0x20]
00b4b040	mov x24,x7
00b4b044	mov x22,x6
00b4b048	mov x23,x5
00b4b04c	mov x20,x4
00b4b050	mov x21,x3
00b4b054	mov x19,x0
00b4b058	stp x29,x30,[sp, #0x30]
00b4b05c	add x29,sp,#0x30
00b4b060	cbz x1,0x00b4b070
00b4b064	bl 0x00c3e870
00b4b068	cbnz w0,0x00b4b078
00b4b06c	b 0x00b4b1b0
00b4b070	bl 0x00c3e880
00b4b074	cbz w0,0x00b4b1b0
00b4b078	mov w1,#0xffffffff
00b4b07c	mov x0,x19
00b4b080	bl 0x00c3e050
00b4b084	cbz w0,0x00b4b1b0
00b4b088	ldr x2,[x29, #0x38]
00b4b08c	cbz x2,0x00b4b0a4
00b4b090	ldr x3,[x29, #0x40]
00b4b094	orr w1,wzr,#0x3
00b4b098	mov x0,x19
00b4b09c	bl 0x00c3e080
00b4b0a0	cbz w0,0x00b4b1b0
00b4b0a4	ldr x2,[x29, #0x28]
00b4b0a8	cbz x2,0x00b4b0c0
00b4b0ac	ldr x3,[x29, #0x30]
00b4b0b0	mov w1,#0x2
00b4b0b4	mov x0,x19
00b4b0b8	bl 0x00c3e080
00b4b0bc	cbz w0,0x00b4b1b0
00b4b0c0	ldr w2,[x29, #0x48]
00b4b0c4	cbz w2,0x00b4b0d8
00b4b0c8	mov w1,#0x2
00b4b0cc	mov x0,x19
00b4b0d0	bl 0x00c3e090
00b4b0d4	cbz w0,0x00b4b1b0
00b4b0d8	ldr x2,[x29, #0x18]
00b4b0dc	cbz x2,0x00b4b0f4
00b4b0e0	ldr x3,[x29, #0x20]
00b4b0e4	mov w1,#0x1
00b4b0e8	mov x0,x19
00b4b0ec	bl 0x00c3e080
00b4b0f0	cbz w0,0x00b4b1b0
00b4b0f4	cbz x24,0x00b4b110
00b4b0f8	ldr x3,[x29, #0x10]
00b4b0fc	mov x0,x19
00b4b100	mov w1,wzr
00b4b104	mov x2,x24
00b4b108	bl 0x00c3e080
00b4b10c	cbz w0,0x00b4b1b0
00b4b110	cbz x23,0x00b4b12c
00b4b114	mov w1,#0xffffffff
00b4b118	mov x0,x19
00b4b11c	mov x2,x23
00b4b120	mov x3,x22
00b4b124	bl 0x00c3e0a0
00b4b128	cbz w0,0x00b4b1b0
00b4b12c	mov w1,#0xffffffff
00b4b130	mov x0,x19
00b4b134	bl 0x00c3e050
00b4b138	cbz w0,0x00b4b1b0
00b4b13c	mov w1,#0xffffffff
00b4b140	mov w2,#0x1
00b4b144	mov x0,x19
00b4b148	bl 0x00c3e090
00b4b14c	cbz w0,0x00b4b1b0
00b4b150	ldr x22,[x29, #0x50]
00b4b154	cbz x22,0x00b4b168
00b4b158	mov x0,x19
00b4b15c	bl 0x00c36c50
00b4b160	str x0,[x22]
00b4b164	cbz x0,0x00b4b1b0
00b4b168	mov w1,#0xffffffff
00b4b16c	mov x0,x19
00b4b170	mov x2,x21
00b4b174	mov x3,x20
00b4b178	bl 0x00c3e0a0
00b4b17c	cbz w0,0x00b4b1b0
00b4b180	mov w1,#0xffffffff
00b4b184	mov x0,x19
00b4b188	bl 0x00c3e060
00b4b18c	cbz w0,0x00b4b1b0
00b4b190	mov w1,#0xffffffff
00b4b194	mov x0,x19
00b4b198	bl 0x00c3e060
00b4b19c	cbz w0,0x00b4b1b0
00b4b1a0	mov x0,x19
00b4b1a4	bl 0x00c34360
00b4b1a8	cmp w0,#0x0
00b4b1ac	cset w0,ne
00b4b1b0	ldp x29,x30,[sp, #0x30]
00b4b1b4	ldp x20,x19,[sp, #0x20]
00b4b1b8	ldp x22,x21,[sp, #0x10]
00b4b1bc	ldp x24,x23,[sp], #0x40
00b4b1c0	ret
