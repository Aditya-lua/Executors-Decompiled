; psa_hash_setup @ 00b87d0c
00b87d0c	str x21,[sp, #-0x30]!
00b87d10	stp x20,x19,[sp, #0x10]
00b87d14	stp x29,x30,[sp, #0x20]
00b87d18	add x29,sp,#0x20
00b87d1c	ldr w8,[x0]
00b87d20	mov x19,x0
00b87d24	mov w20,w1
00b87d28	cbz w8,0x00b87d4c
00b87d2c	mov w20,#0xffffff77
00b87d30	cbz w8,0x00b87da0
00b87d34	cmp w8,#0x1
00b87d38	b.ne 0x00b87d44
00b87d3c	add x0,x19,#0x8
00b87d40	bl 0x00c42fe0
00b87d44	str wzr,[x19]
00b87d48	b 0x00b87da0
00b87d4c	and w8,w20,#0x7f000000
00b87d50	mov w9,#0x2000000
00b87d54	cmp w8,w9
00b87d58	b.ne 0x00b87d90
00b87d5c	add x21,x19,#0x8
00b87d60	orr w2,wzr,#0xe0
00b87d64	mov x0,x21
00b87d68	mov w1,wzr
00b87d6c	bl 0x00c301c0
00b87d70	mov x0,x21
00b87d74	mov w1,w20
00b87d78	bl 0x00c43020
00b87d7c	mov w20,w0
00b87d80	cbz w0,0x00b87d98
00b87d84	ldr w8,[x19]
00b87d88	cbnz w8,0x00b87d34
00b87d8c	b 0x00b87da0
00b87d90	mov w20,#0xffffff79
00b87d94	b 0x00b87da0
00b87d98	mov w8,#0x1
00b87d9c	str w8,[x19]
00b87da0	mov w0,w20
00b87da4	ldp x29,x30,[sp, #0x20]
00b87da8	ldp x20,x19,[sp, #0x10]
00b87dac	ldr x21,[sp], #0x30
00b87db0	ret
