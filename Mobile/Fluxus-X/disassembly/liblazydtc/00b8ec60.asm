; psa_raw_key_agreement @ 00b8ec60
00b8ec60	sub sp,sp,#0x90
00b8ec64	stp x28,x27,[sp, #0x30]
00b8ec68	stp x26,x25,[sp, #0x40]
00b8ec6c	stp x24,x23,[sp, #0x50]
00b8ec70	stp x22,x21,[sp, #0x60]
00b8ec74	stp x20,x19,[sp, #0x70]
00b8ec78	stp x29,x30,[sp, #0x80]
00b8ec7c	add x29,sp,#0x80
00b8ec80	str x6,[sp, #0x18]
00b8ec84	mrs x20,tpidr_el0
00b8ec88	ldr x8,[x20, #0x28]
00b8ec8c	mov x19,x5
00b8ec90	mov x23,x4
00b8ec94	mov x26,x3
00b8ec98	mov x28,x2
00b8ec9c	mov w24,w1
00b8eca0	mov w27,w0
00b8eca4	str x8,[sp, #0x28]
00b8eca8	str xzr,[sp, #0x20]
00b8ecac	cbz x5,0x00b8ecdc
00b8ecb0	mov w1,#0x1
00b8ecb4	mov x0,x19
00b8ecb8	bl 0x00c30a30
00b8ecbc	mov x21,x0
00b8ecc0	mov x8,x19
00b8ecc4	cbnz x0,0x00b8ece8
00b8ecc8	mov x23,xzr
00b8eccc	str xzr,[sp, #0x10]
00b8ecd0	mov x24,xzr
00b8ecd4	mov w25,#0xffffff73
00b8ecd8	b 0x00b8edb4
00b8ecdc	mov x8,xzr
00b8ece0	mov x21,xzr
00b8ece4	mov x23,xzr
00b8ece8	str x8,[sp, #0x10]
00b8ecec	mov w22,#0x9000000
00b8ecf0	and w8,w27,#0x7f000000
00b8ecf4	cmp w8,w22
00b8ecf8	b.ne 0x00b8ed24
00b8ecfc	add x1,sp,#0x20
00b8ed00	mov w2,#0x4000
00b8ed04	mov w0,w24
00b8ed08	mov w3,w27
00b8ed0c	bl 0x00b86e5c
00b8ed10	mov w25,w0
00b8ed14	cbz w0,0x00b8ee38
00b8ed18	mov x24,xzr
00b8ed1c	cbnz x21,0x00b8ed30
00b8ed20	b 0x00b8edb0
00b8ed24	mov x24,xzr
00b8ed28	mov w25,#0xffffff79
00b8ed2c	cbz x21,0x00b8edb0
00b8ed30	cbz w25,0x00b8edb0
00b8ed34	str x24,[sp, #0x8]
00b8ed38	mov x24,x20
00b8ed3c	mov x20,x23
00b8ed40	cbz x19,0x00b8ed9c
00b8ed44	adrp x8,0xd25000
00b8ed48	add x8,x8,#0xb10
00b8ed4c	ldrb w9,[x8, #0x1]
00b8ed50	cmp w9,#0x2
00b8ed54	b.ne 0x00b8ed9c
00b8ed58	ldrb w9,[x8]
00b8ed5c	cmp w9,#0x7
00b8ed60	b.ne 0x00b8ed9c
00b8ed64	mov w22,#0x400
00b8ed68	add x26,x8,#0x358
00b8ed6c	mov x23,x19
00b8ed70	mov x27,x21
00b8ed74	cmp x23,#0x400
00b8ed78	csel x28,x23,x22,cc
00b8ed7c	mov x0,x26
00b8ed80	mov x1,x27
00b8ed84	mov x2,x28
00b8ed88	bl 0x00c303a0
00b8ed8c	cbnz w0,0x00b8ed9c
00b8ed90	subs x23,x23,x28
00b8ed94	add x27,x27,x28
00b8ed98	b.ne 0x00b8ed74
00b8ed9c	ldr x8,[sp, #0x18]
00b8eda0	mov x23,x20
00b8eda4	mov x20,x24
00b8eda8	ldr x24,[sp, #0x8]
00b8edac	str x19,[x8]
00b8edb0	cbnz x21,0x00b8edc0
00b8edb4	ldr x8,[sp, #0x18]
00b8edb8	mov x21,xzr
00b8edbc	str xzr,[x8]
00b8edc0	ldr x0,[sp, #0x20]
00b8edc4	bl 0x00c431e0
00b8edc8	mov w22,w0
00b8edcc	mov x0,x24
00b8edd0	bl 0x00c30960
00b8edd4	cbz x21,0x00b8edf8
00b8edd8	cbz x23,0x00b8ee04
00b8eddc	ldr x2,[sp, #0x10]
00b8ede0	cbz x2,0x00b8edf0
00b8ede4	mov x0,x23
00b8ede8	mov x1,x21
00b8edec	bl 0x00c2ffd0
00b8edf0	mov x0,x21
00b8edf4	bl 0x00c30960
00b8edf8	cmp w25,#0x0
00b8edfc	csel w0,w22,w25,eq
00b8ee00	b 0x00b8ee08
00b8ee04	mov w0,#0xffffff69
00b8ee08	ldr x8,[x20, #0x28]
00b8ee0c	ldr x9,[sp, #0x28]
00b8ee10	cmp x8,x9
00b8ee14	b.ne 0x00b8ef90
00b8ee18	ldp x29,x30,[sp, #0x80]
00b8ee1c	ldp x20,x19,[sp, #0x70]
00b8ee20	ldp x22,x21,[sp, #0x60]
00b8ee24	ldp x24,x23,[sp, #0x50]
00b8ee28	ldp x26,x25,[sp, #0x40]
00b8ee2c	ldp x28,x27,[sp, #0x30]
00b8ee30	add sp,sp,#0x90
00b8ee34	ret
00b8ee38	ldr x25,[sp, #0x20]
00b8ee3c	ldr w8,[x25, #0x4]
00b8ee40	cmp w8,#0x100
00b8ee44	b.cs 0x00b8ee8c
00b8ee48	ldrh w8,[x25]
00b8ee4c	mov w9,#0x7200
00b8ee50	and w8,w8,#0xff00
00b8ee54	cmp w8,w9
00b8ee58	b.eq 0x00b8ee68
00b8ee5c	mov w9,#0x7100
00b8ee60	cmp w8,w9
00b8ee64	b.ne 0x00b8eea8
00b8ee68	ldrh w8,[x25, #0x2]
00b8ee6c	add x8,x8,#0x7
00b8ee70	lsr x8,x8,#0x3
00b8ee74	cmp x8,x19
00b8ee78	b.ls 0x00b8eea8
00b8ee7c	mov x24,xzr
00b8ee80	mov w25,#0xffffff76
00b8ee84	cbnz x21,0x00b8ed30
00b8ee88	b 0x00b8edb0
00b8ee8c	mov x0,x25
00b8ee90	bl 0x00c431e0
00b8ee94	mov x24,xzr
00b8ee98	str xzr,[sp, #0x20]
00b8ee9c	mov w25,#0xffffff7a
00b8eea0	cbnz x21,0x00b8ed30
00b8eea4	b 0x00b8edb0
00b8eea8	cbz x26,0x00b8eed4
00b8eeac	mov w1,#0x1
00b8eeb0	mov x0,x26
00b8eeb4	bl 0x00c30a30
00b8eeb8	mov x24,x0
00b8eebc	cbz x0,0x00b8ef58
00b8eec0	mov x0,x24
00b8eec4	mov x1,x28
00b8eec8	mov x2,x26
00b8eecc	bl 0x00c2ffd0
00b8eed0	b 0x00b8eed8
00b8eed4	mov x24,xzr
00b8eed8	and w8,w27,#0xfe00ffff
00b8eedc	orr w8,w8,#0x8000000
00b8eee0	mov w9,#0x8000000
00b8eee4	cmp w8,w9
00b8eee8	b.ne 0x00b8ef4c
00b8eeec	ldr w8,[x25, #0x4]
00b8eef0	cmp w8,#0xff
00b8eef4	b.hi 0x00b8ef4c
00b8eef8	ldp x8,x4,[x25, #0x28]
00b8eefc	mov w9,#0x9010000
00b8ef00	cmp w27,w9
00b8ef04	b.eq 0x00b8ef64
00b8ef08	mov w9,#0x9020000
00b8ef0c	cmp w27,w9
00b8ef10	b.ne 0x00b8ef4c
00b8ef14	ldr x9,[sp, #0x18]
00b8ef18	add w3,w22,#0x20, LSL #12
00b8ef1c	mov x0,x25
00b8ef20	mov x1,x8
00b8ef24	mov x2,x4
00b8ef28	mov x4,x24
00b8ef2c	mov x5,x26
00b8ef30	mov x6,x21
00b8ef34	mov x7,x19
00b8ef38	str x9,[sp]
00b8ef3c	bl 0x00c42f90
00b8ef40	mov w25,w0
00b8ef44	cbnz x21,0x00b8ed30
00b8ef48	b 0x00b8edb0
00b8ef4c	mov w25,#0xffffff7a
00b8ef50	cbnz x21,0x00b8ed30
00b8ef54	b 0x00b8edb0
00b8ef58	mov w25,#0xffffff73
00b8ef5c	cbnz x21,0x00b8ed30
00b8ef60	b 0x00b8edb0
00b8ef64	ldr x7,[sp, #0x18]
00b8ef68	mov x0,x25
00b8ef6c	mov x1,x24
00b8ef70	mov x2,x26
00b8ef74	mov x3,x8
00b8ef78	mov x5,x21
00b8ef7c	mov x6,x19
00b8ef80	bl 0x00c42fd0
00b8ef84	mov w25,w0
00b8ef88	cbnz x21,0x00b8ed30
00b8ef8c	b 0x00b8edb0
00b8ef90	bl 0x00c2fec0
