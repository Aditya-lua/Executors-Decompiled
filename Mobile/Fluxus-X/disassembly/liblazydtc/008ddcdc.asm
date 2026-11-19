; FUN_008ddcdc @ 008ddcdc
008ddcdc	stp x29,x30,[sp, #-0x60]!
008ddce0	stp x28,x27,[sp, #0x10]
008ddce4	stp x26,x25,[sp, #0x20]
008ddce8	stp x24,x23,[sp, #0x30]
008ddcec	stp x22,x21,[sp, #0x40]
008ddcf0	stp x20,x19,[sp, #0x50]
008ddcf4	mov x29,sp
008ddcf8	sub sp,sp,#0x7d0
008ddcfc	mov x19,x8
008ddd00	mrs x8,tpidr_el0
008ddd04	str x8,[sp, #0x8]
008ddd08	ldr x8,[x8, #0x28]
008ddd0c	stur x8,[x29, #-0x10]
008ddd10	cbz x2,0x008de11c
008ddd14	ldrb w8,[x1]
008ddd18	mov x24,x1
008ddd1c	cbz w8,0x008de138
008ddd20	mov w8,#0x1
008ddd24	mov x23,x2
008ddd28	movk w8,#0x400, LSL #16
008ddd2c	cmp x2,x8
008ddd30	b.cs 0x008de154
008ddd34	mov x27,x0
008ddd38	stp xzr,xzr,[x19]
008ddd3c	str xzr,[x19, #0x10]
008ddd40	cbnz x23,0x008ddd54
008ddd44	mov x8,xzr
008ddd48	mov x22,xzr
008ddd4c	mov x21,xzr
008ddd50	b 0x008ddde8
008ddd54	tbnz x23,#0x3f,0x008de1dc
008ddd58	mov x0,x23
008ddd5c	bl 0x00c2fed0
008ddd60	mov x21,x0
008ddd64	add x8,x0,x23
008ddd68	cmp x23,#0x20
008ddd6c	str x0,[x19]
008ddd70	str x8,[x19, #0x10]
008ddd74	b.cc 0x008dddc8
008ddd78	sub x9,x21,x24
008ddd7c	mov x22,x21
008ddd80	cmp x9,#0x20
008ddd84	mov x9,x24
008ddd88	b.cc 0x008dddd0
008ddd8c	and x10,x23,#0x7ffffe0
008ddd90	add x11,x21,#0x10
008ddd94	add x12,x24,#0x10
008ddd98	add x9,x24,x10
008ddd9c	add x22,x21,x10
008ddda0	mov x13,x10
008ddda4	ldp q0,q1,[x12, #-0x10]
008ddda8	subs x13,x13,#0x20
008dddac	add x12,x12,#0x20
008dddb0	stp q0,q1,[x11, #-0x10]
008dddb4	add x11,x11,#0x20
008dddb8	b.ne 0x008ddda4
008dddbc	cmp x23,x10
008dddc0	b.ne 0x008dddd0
008dddc4	b 0x008ddde4
008dddc8	mov x9,x24
008dddcc	mov x22,x21
008dddd0	add x10,x24,x23
008dddd4	ldrb w11,[x9], #0x1
008dddd8	cmp x9,x10
008ddddc	strb w11,[x22], #0x1
008ddde0	b.ne 0x008dddd4
008ddde4	str x22,[x19, #0x8]
008ddde8	sub x23,x22,x21
008dddec	cmp x23,#0x3ff
008dddf0	b.hi 0x008ddea4
008dddf4	mov w9,#0x400
008dddf8	sub x25,x9,x23
008dddfc	sub x9,x8,x22
008dde00	cmp x9,x25
008dde04	b.cs 0x008dde80
008dde08	sub x24,x8,x21
008dde0c	mov w9,#0x400
008dde10	mov x10,#0x3fffffffffffffff
008dde14	lsl x8,x24,#0x1
008dde18	cmp x8,#0x400
008dde1c	csel x8,x8,x9,hi
008dde20	cmp x24,x10
008dde24	mov x9,#0x7fffffffffffffff
008dde28	csel x22,x8,x9,cc
008dde2c	mov x0,x22
008dde30	bl 0x00c2fed0
008dde34	mov x26,x0
008dde38	add x20,x0,x22
008dde3c	add x0,x0,x23
008dde40	mov w1,wzr
008dde44	mov x2,x25
008dde48	bl 0x00c301c0
008dde4c	mov x0,x26
008dde50	mov x1,x21
008dde54	mov x2,x23
008dde58	add x22,x26,#0x400
008dde5c	bl 0x00c2ffd0
008dde60	stp x26,x22,[x19]
008dde64	str x20,[x19, #0x10]
008dde68	cbz x21,0x008ddea0
008dde6c	mov x0,x21
008dde70	mov x1,x24
008dde74	bl 0x00c2fe80
008dde78	ldp x21,x22,[x19]
008dde7c	b 0x008ddea4
008dde80	mov x0,x22
008dde84	mov w1,wzr
008dde88	mov x2,x25
008dde8c	add x20,x22,x25
008dde90	bl 0x00c301c0
008dde94	str x20,[x19, #0x8]
008dde98	mov x22,x20
008dde9c	b 0x008ddea4
008ddea0	mov x21,x26
008ddea4	add x0,sp,#0x48
008ddea8	bl 0x00c30a40
008ddeac	sub x2,x22,x21
008ddeb0	add x0,sp,#0x48
008ddeb4	mov x1,x21
008ddeb8	bl 0x00c30a50
008ddebc	movi v0.2D,#0x0
008ddec0	stp q0,q0,[sp, #0x20]
008ddec4	add x0,sp,#0x48
008ddec8	add x1,sp,#0x20
008ddecc	mov w2,#0x20
008dded0	bl 0x00c30a60
008dded4	ldur x1,[sp, #0x24]
008dded8	ldr x0,[x27]
008ddedc	ldr w2,[sp, #0x2c]
008ddee0	bl 0x008dfafc
008ddee4	ldr x8,[x19, #0x8]
008ddee8	add x21,sp,#0x10
008ddeec	stp x0,x1,[sp, #0x10]
008ddef0	add x2,sp,#0x10
008ddef4	add x3,x21,#0x10
008ddef8	mov x0,x19
008ddefc	mov x1,x8
008ddf00	mov w4,#0x10
008ddf04	bl 0x008de49c
008ddf08	ldr x26,[x19, #0x8]
008ddf0c	mov w11,#0x1870
008ddf10	str x27,[sp]
008ddf14	mov w27,wzr
008ddf18	mov x20,xzr
008ddf1c	movk w11,#0x7417, LSL #16
008ddf20	b 0x008ddf3c
008ddf24	strb w28,[x26], #0x1
008ddf28	add x20,x20,#0x1
008ddf2c	add w27,w27,#0x8
008ddf30	str x26,[x19, #0x8]
008ddf34	cmp x20,#0x4
008ddf38	b.eq 0x008ddfe0
008ddf3c	ldr x8,[x19, #0x10]
008ddf40	ldrb w9,[x21, x20]
008ddf44	lsr w10,w11,w27
008ddf48	cmp x26,x8
008ddf4c	eor w28,w9,w10
008ddf50	b.cc 0x008ddf24
008ddf54	ldr x21,[x19]
008ddf58	sub x23,x26,x21
008ddf5c	adds x9,x23,#0x1
008ddf60	b.mi 0x008de0ec
008ddf64	sub x22,x8,x21
008ddf68	lsl x8,x22,#0x1
008ddf6c	cmp x8,x9
008ddf70	csel x8,x8,x9,hi
008ddf74	mov x9,#0x3fffffffffffffff
008ddf78	cmp x22,x9
008ddf7c	mov x9,#0x7fffffffffffffff
008ddf80	csel x24,x8,x9,cc
008ddf84	cbz x24,0x008ddf98
008ddf88	mov x0,x24
008ddf8c	bl 0x00c2fed0
008ddf90	mov x25,x0
008ddf94	b 0x008ddf9c
008ddf98	mov x25,xzr
008ddf9c	add x26,x25,x23
008ddfa0	mov x0,x25
008ddfa4	mov x1,x21
008ddfa8	mov x2,x23
008ddfac	add x24,x25,x24
008ddfb0	strb w28,[x26], #0x1
008ddfb4	bl 0x00c2ffd0
008ddfb8	stp x25,x26,[x19]
008ddfbc	str x24,[x19, #0x10]
008ddfc0	cbz x21,0x008ddfd0
008ddfc4	mov x0,x21
008ddfc8	mov x1,x22
008ddfcc	bl 0x00c2fe80
008ddfd0	mov w11,#0x1870
008ddfd4	add x21,sp,#0x10
008ddfd8	movk w11,#0x7417, LSL #16
008ddfdc	b 0x008ddf28
008ddfe0	mov x20,xzr
008ddfe4	adrp x28,0x364000
008ddfe8	add x28,x28,#0xed0
008ddfec	add x11,sp,#0x10
008ddff0	b 0x008de008
008ddff4	strb w27,[x26], #0x1
008ddff8	add x20,x20,#0x1
008ddffc	str x26,[x19, #0x8]
008de000	cmp x20,#0x4
008de004	b.eq 0x008de0a4
008de008	ldr x8,[x19, #0x10]
008de00c	ldrb w9,[x11, x20]
008de010	ldrb w10,[x28, x20]
008de014	cmp x26,x8
008de018	eor w27,w10,w9
008de01c	b.cc 0x008ddff4
008de020	ldr x21,[x19]
008de024	sub x23,x26,x21
008de028	adds x9,x23,#0x1
008de02c	b.mi 0x008de104
008de030	sub x22,x8,x21
008de034	lsl x8,x22,#0x1
008de038	cmp x8,x9
008de03c	csel x8,x8,x9,hi
008de040	mov x9,#0x3fffffffffffffff
008de044	cmp x22,x9
008de048	mov x9,#0x7fffffffffffffff
008de04c	csel x24,x8,x9,cc
008de050	cbz x24,0x008de064
008de054	mov x0,x24
008de058	bl 0x00c2fed0
008de05c	mov x25,x0
008de060	b 0x008de068
008de064	mov x25,xzr
008de068	add x26,x25,x23
008de06c	mov x0,x25
008de070	mov x1,x21
008de074	mov x2,x23
008de078	add x24,x25,x24
008de07c	strb w27,[x26], #0x1
008de080	bl 0x00c2ffd0
008de084	stp x25,x26,[x19]
008de088	str x24,[x19, #0x10]
008de08c	cbz x21,0x008de09c
008de090	mov x0,x21
008de094	mov x1,x22
008de098	bl 0x00c2fe80
008de09c	add x11,sp,#0x10
008de0a0	b 0x008ddff8
008de0a4	ldr x1,[x19]
008de0a8	sub x2,x26,x1
008de0ac	ldr x0,[sp]
008de0b0	bl 0x008de2cc
008de0b4	tbz w0,#0x0,0x008de198
008de0b8	ldr x8,[sp, #0x8]
008de0bc	ldr x8,[x8, #0x28]
008de0c0	ldur x9,[x29, #-0x10]
008de0c4	cmp x8,x9
008de0c8	b.ne 0x008de298
008de0cc	add sp,sp,#0x7d0
008de0d0	ldp x20,x19,[sp, #0x50]
008de0d4	ldp x22,x21,[sp, #0x40]
008de0d8	ldp x24,x23,[sp, #0x30]
008de0dc	ldp x26,x25,[sp, #0x20]
008de0e0	ldp x28,x27,[sp, #0x10]
008de0e4	ldp x29,x30,[sp], #0x60
008de0e8	ret
008de0ec	ldr x8,[sp, #0x8]
008de0f0	ldr x8,[x8, #0x28]
008de0f4	ldur x9,[x29, #-0x10]
008de0f8	cmp x8,x9
008de0fc	b.ne 0x008de298
008de100	bl 0x0080734c
008de104	ldr x8,[sp, #0x8]
008de108	ldr x8,[x8, #0x28]
008de10c	ldur x9,[x29, #-0x10]
008de110	cmp x8,x9
008de114	b.ne 0x008de298
008de118	bl 0x0080734c
008de11c	mov w0,#0x10
008de120	bl 0x00c30000
008de124	mov x19,x0
008de128	adrp x1,0x2d4000
008de12c	add x1,x1,#0xea3
008de130	bl 0x008de29c
008de134	b 0x008de16c
008de138	mov w0,#0x10
008de13c	bl 0x00c30000
008de140	mov x19,x0
008de144	adrp x1,0x2d0000
008de148	add x1,x1,#0xce6
008de14c	bl 0x008de29c
008de150	b 0x008de16c
008de154	mov w0,#0x10
008de158	bl 0x00c30000
008de15c	mov x19,x0
008de160	adrp x1,0x2d0000
008de164	add x1,x1,#0xd07
008de168	bl 0x008de29c
008de16c	ldr x8,[sp, #0x8]
008de170	ldr x8,[x8, #0x28]
008de174	ldur x9,[x29, #-0x10]
008de178	cmp x8,x9
008de17c	b.ne 0x008de298
008de180	adrp x1,0xcb4000
008de184	adrp x2,0xcb4000
008de188	mov x0,x19
008de18c	ldr x1,[x1, #0xc10]
008de190	ldr x2,[x2, #0xc18]
008de194	bl 0x00c30020
008de198	mov w0,#0x10
008de19c	bl 0x00c30000
008de1a0	mov x21,x0
008de1a4	adrp x1,0x2d8000
008de1a8	add x1,x1,#0xfa4
008de1ac	bl 0x00c30a80
008de1b0	ldr x8,[sp, #0x8]
008de1b4	ldr x8,[x8, #0x28]
008de1b8	ldur x9,[x29, #-0x10]
008de1bc	cmp x8,x9
008de1c0	b.ne 0x008de298
008de1c4	adrp x1,0xcb4000
008de1c8	adrp x2,0xcb4000
008de1cc	mov x0,x21
008de1d0	ldr x1,[x1, #0xc20]
008de1d4	ldr x2,[x2, #0xc28]
008de1d8	bl 0x00c30020
008de1dc	ldr x8,[sp, #0x8]
008de1e0	ldr x8,[x8, #0x28]
008de1e4	ldur x9,[x29, #-0x10]
008de1e8	cmp x8,x9
008de1ec	b.ne 0x008de298
008de1f0	bl 0x0080734c
008de1f4	mov x20,x0
008de1f8	b 0x008de264
008de264	cbz x21,0x008de27c
008de268	ldr x8,[x19, #0x10]
008de26c	str x21,[x19, #0x8]
008de270	mov x0,x21
008de274	sub x1,x8,x21
008de278	bl 0x00c2fe80
008de27c	ldr x8,[sp, #0x8]
008de280	ldr x8,[x8, #0x28]
008de284	ldur x9,[x29, #-0x10]
008de288	cmp x8,x9
008de28c	b.ne 0x008de298
008de290	mov x0,x20
008de294	bl 0x00c2c090
008de298	bl 0x00c2fec0
