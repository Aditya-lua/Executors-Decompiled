; cpr::ThreadPool::~ThreadPool @ 008fdc78
008fdc78	stp x22,x21,[sp, #-0x30]!
008fdc7c	stp x20,x19,[sp, #0x10]
008fdc80	stp x29,x30,[sp, #0x20]
008fdc84	add x29,sp,#0x20
008fdc88	adrp x8,0xcb4000
008fdc8c	ldr x8,[x8, #0xd68]
008fdc90	mov x19,x0
008fdc94	add x8,x8,#0x10
008fdc98	str x8,[x0]
008fdc9c	bl 0x00c31890
008fdca0	add x0,x19,#0xd0
008fdca4	bl 0x00c31600
008fdca8	add x0,x19,#0xa8
008fdcac	bl 0x00c2fee0
008fdcb0	add x20,x19,#0x78
008fdcb4	mov x0,x20
008fdcb8	bl 0x00c318d0
008fdcbc	ldp x21,x22,[x19, #0x80]
008fdcc0	cmp x21,x22
008fdcc4	b.eq 0x008fdcfc
008fdcc8	ldr x0,[x21], #0x8
008fdccc	bl 0x00c301d0
008fdcd0	cmp x22,x21
008fdcd4	b.ne 0x008fdcc8
008fdcd8	ldp x9,x8,[x19, #0x80]
008fdcdc	cmp x8,x9
008fdce0	b.eq 0x008fdcfc
008fdce4	sub x10,x8,#0x8
008fdce8	sub x9,x10,x9
008fdcec	mvn x9,x9
008fdcf0	and x9,x9,#-0x8
008fdcf4	add x8,x8,x9
008fdcf8	str x8,[x19, #0x88]
008fdcfc	ldr x0,[x20]
008fdd00	cbz x0,0x008fdd08
008fdd04	bl 0x00c301d0
008fdd08	add x0,x19,#0x50
008fdd0c	bl 0x00c2fee0
008fdd10	ldr x8,[x19, #0x48]
008fdd14	cbz x8,0x008fdd90
008fdd18	ldp x8,x20,[x19, #0x38]
008fdd1c	add x21,x19,#0x38
008fdd20	ldr x9,[x8, #0x8]
008fdd24	ldr x10,[x20]
008fdd28	cmp x20,x21
008fdd2c	str x9,[x10, #0x8]
008fdd30	ldr x8,[x8, #0x8]
008fdd34	str x10,[x8]
008fdd38	str xzr,[x19, #0x48]
008fdd3c	b.eq 0x008fdd90
008fdd40	ldr x19,[x20, #0x18]
008fdd44	ldr x22,[x20, #0x8]
008fdd48	cbz x19,0x008fdd7c
008fdd4c	add x8,x19,#0x8
008fdd50	ldaxr x9,[x8]
008fdd54	sub x10,x9,#0x1
008fdd58	stlxr w11,x10,[x8]
008fdd5c	cbnz w11,0x008fdd50
008fdd60	cbnz x9,0x008fdd7c
008fdd64	ldr x8,[x19]
008fdd68	mov x0,x19
008fdd6c	ldr x8,[x8, #0x10]
008fdd70	blr x8
008fdd74	mov x0,x19
008fdd78	bl 0x00c2ff00
008fdd7c	mov x0,x20
008fdd80	bl 0x00c301d0
008fdd84	cmp x22,x21
008fdd88	mov x20,x22
008fdd8c	b.ne 0x008fdd40
008fdd90	ldp x29,x30,[sp, #0x20]
008fdd94	ldp x20,x19,[sp, #0x10]
008fdd98	ldp x22,x21,[sp], #0x30
008fdd9c	ret
