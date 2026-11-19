; FUN_008b8010 @ 008b8010
008b8010	stp x29,x30,[sp, #-0x30]!
008b8014	str x21,[sp, #0x10]
008b8018	stp x20,x19,[sp, #0x20]
008b801c	mov x29,sp
008b8020	ldr x8,[x0, #0x60]
008b8024	mov x19,x0
008b8028	mov x20,x2
008b802c	cbz x1,0x008b8058
008b8030	ldp x10,x9,[x20]
008b8034	cbz x9,0x008b803c
008b8038	str x10,[x9]
008b803c	cbz x10,0x008b8048
008b8040	str x9,[x10, #0x8]
008b8044	b 0x008b8058
008b8048	ldr x10,[x1]
008b804c	cmp x10,x20
008b8050	b.ne 0x008b8058
008b8054	str x9,[x1]
008b8058	adrp x21,0xd1f000
008b805c	ldrsw x2,[x20, #0x20]
008b8060	ldrb w9,[x21, #0x618]
008b8064	cmp w9,#0x1
008b8068	b.ne 0x008b80f8
008b806c	ldrsw x9,[x20, #0x24]
008b8070	sub x10,x2,#0x40
008b8074	ldr x0,[x8, #0x608]
008b8078	ldr x1,[x20, #0x40]
008b807c	mov x3,xzr
008b8080	mov w4,#0xa
008b8084	udiv x10,x10,x9
008b8088	smull x2,w9,w10
008b808c	ldr x9,[x8, #0x4b0]
008b8090	blr x9
008b8094	ldr x1,[x20, #-0x8]!
008b8098	adrp x8,0xd1f000
008b809c	ldrsb x9,[x8, #0x720]
008b80a0	ldr x10,[x19, #0x60]
008b80a4	ldrb w8,[x21, #0x618]
008b80a8	ldr x11,[x1, #0x28]
008b80ac	cbnz x11,0x008b80d0
008b80b0	ldr w12,[x1, #0x30]
008b80b4	tbz w12,#0x1f,0x008b80d0
008b80b8	add x12,x10,#0x70
008b80bc	ldr x13,[x12, x9, LSL #0x3]
008b80c0	str x13,[x1, #0x18]
008b80c4	cbz x13,0x008b80cc
008b80c8	str x1,[x13, #0x10]
008b80cc	str x1,[x12, x9, LSL #0x3]
008b80d0	ldr w12,[x1, #0x34]
008b80d4	str x11,[x20]
008b80d8	str x20,[x1, #0x28]
008b80dc	subs w11,w12,#0x1
008b80e0	str w11,[x1, #0x34]
008b80e4	b.eq 0x008b811c
008b80e8	ldp x20,x19,[sp, #0x20]
008b80ec	ldr x21,[sp, #0x10]
008b80f0	ldp x29,x30,[sp], #0x30
008b80f4	ret
008b80f8	ldr x0,[x8, #0x608]
008b80fc	ldr x5,[x8, #0x4b0]
008b8100	mov x1,x20
008b8104	mov x3,xzr
008b8108	mov w4,#0xa
008b810c	ldp x20,x19,[sp, #0x20]
008b8110	ldr x21,[sp, #0x10]
008b8114	ldp x29,x30,[sp], #0x30
008b8118	br x5
008b811c	ldp x12,x11,[x1, #0x10]
008b8120	cbz x11,0x008b8128
008b8124	str x12,[x11, #0x10]
008b8128	cbz x12,0x008b8134
008b812c	str x11,[x12, #0x18]
008b8130	b 0x008b814c
008b8134	add x10,x10,#0x70
008b8138	and x9,x9,#0xff
008b813c	ldr x12,[x10, x9, LSL #0x3]
008b8140	cmp x12,x1
008b8144	b.ne 0x008b814c
008b8148	str x11,[x10, x9, LSL #0x3]
008b814c	ldr x9,[x19, #0x60]
008b8150	ldrsw x2,[x1, #0x20]
008b8154	ldp x4,x0,[x9, #0x48]
008b8158	mov x3,xzr
008b815c	ldp x20,x19,[sp, #0x20]
008b8160	ldr x21,[sp, #0x10]
008b8164	ldp x29,x30,[sp], #0x30
008b8168	br x4
