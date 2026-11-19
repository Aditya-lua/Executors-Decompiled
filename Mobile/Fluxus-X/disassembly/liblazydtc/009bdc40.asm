; lookup_sess_in_cache @ 009bdc40
009bdc40	str x28,[sp, #-0x40]!
009bdc44	stp x22,x21,[sp, #0x10]
009bdc48	stp x20,x19,[sp, #0x20]
009bdc4c	stp x29,x30,[sp, #0x30]
009bdc50	add x29,sp,#0x30
009bdc54	sub sp,sp,#0x3a0
009bdc58	ldr x20,[x0, #0xb88]
009bdc5c	mov x21,x2
009bdc60	mov x19,x0
009bdc64	mov x22,x1
009bdc68	ldrb w8,[x20, #0x51]
009bdc6c	tbnz w8,#0x0,0x009bdd08
009bdc70	ldr w8,[x19]
009bdc74	cmp x21,#0x20
009bdc78	str w8,[sp]
009bdc7c	b.hi 0x009bdd4c
009bdc80	mov x8,sp
009bdc84	add x0,x8,#0x258
009bdc88	mov x1,x22
009bdc8c	mov x2,x21
009bdc90	bl 0x00c2ffd0
009bdc94	str x21,[sp, #0x250]
009bdc98	ldr x0,[x20, #0x3c8]
009bdc9c	bl 0x00c35680
009bdca0	cbz w0,0x009bdd4c
009bdca4	ldr x8,[x19, #0xb88]
009bdca8	mov x1,sp
009bdcac	ldr x0,[x8, #0x30]
009bdcb0	bl 0x00c34de0
009bdcb4	cbz x0,0x009bdce0
009bdcb8	mov x20,x0
009bdcbc	add x8,x0,#0x2d0
009bdcc0	ldxr w9,[x8]
009bdcc4	add w9,w9,#0x1
009bdcc8	stxr w10,w9,[x8]
009bdccc	cbnz w10,0x009bdcc0
009bdcd0	ldr x8,[x19, #0xb88]
009bdcd4	ldr x0,[x8, #0x3c8]
009bdcd8	bl 0x00c35690
009bdcdc	b 0x009bdd50
009bdce0	ldr x8,[x19, #0xb88]
009bdce4	ldr x0,[x8, #0x3c8]
009bdce8	bl 0x00c35690
009bdcec	ldr x8,[x19, #0xb88]
009bdcf0	add x8,x8,#0x90
009bdcf4	ldxr w9,[x8]
009bdcf8	add w9,w9,#0x1
009bdcfc	stxr w10,w9,[x8]
009bdd00	cbnz w10,0x009bdcf4
009bdd04	ldr x20,[x19, #0xb88]
009bdd08	ldr x8,[x20, #0x70]
009bdd0c	cbz x8,0x009bdd4c
009bdd10	mov w9,#0x1
009bdd14	mov x3,sp
009bdd18	mov x0,x19
009bdd1c	mov x1,x22
009bdd20	mov w2,w21
009bdd24	str w9,[sp]
009bdd28	blr x8
009bdd2c	mov x20,x0
009bdd30	cbz x0,0x009bdd50
009bdd34	ldr w8,[x20, #0x2b0]
009bdd38	cbz w8,0x009bdd6c
009bdd3c	ldr w8,[sp]
009bdd40	cbnz w8,0x009bdd4c
009bdd44	mov x0,x20
009bdd48	bl 0x009bdb1c
009bdd4c	mov x20,xzr
009bdd50	mov x0,x20
009bdd54	add sp,sp,#0x3a0
009bdd58	ldp x29,x30,[sp, #0x30]
009bdd5c	ldp x20,x19,[sp, #0x20]
009bdd60	ldp x22,x21,[sp, #0x10]
009bdd64	ldr x28,[sp], #0x40
009bdd68	ret
009bdd6c	ldr x8,[x19, #0xb88]
009bdd70	add x8,x8,#0xa0
009bdd74	ldxr w9,[x8]
009bdd78	add w9,w9,#0x1
009bdd7c	stxr w10,w9,[x8]
009bdd80	cbnz w10,0x009bdd74
009bdd84	ldr w8,[sp]
009bdd88	cbz w8,0x009bdda0
009bdd8c	add x8,x20,#0x2d0
009bdd90	ldxr w9,[x8]
009bdd94	add w9,w9,#0x1
009bdd98	stxr w10,w9,[x8]
009bdd9c	cbnz w10,0x009bdd90
009bdda0	ldr x0,[x19, #0xb88]
009bdda4	ldrb w8,[x0, #0x51]
009bdda8	tbnz w8,#0x1,0x009bdd50
009bddac	mov x1,x20
009bddb0	bl 0x009bddb8
009bddb4	b 0x009bdd50
