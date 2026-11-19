; FUN_008bdb7c @ 008bdb7c
008bdb7c	sub sp,sp,#0xe0
008bdb80	stp x29,x30,[sp, #0x80]
008bdb84	stp x28,x27,[sp, #0x90]
008bdb88	stp x26,x25,[sp, #0xa0]
008bdb8c	stp x24,x23,[sp, #0xb0]
008bdb90	stp x22,x21,[sp, #0xc0]
008bdb94	stp x20,x19,[sp, #0xd0]
008bdb98	add x29,sp,#0x80
008bdb9c	mrs x24,tpidr_el0
008bdba0	movi v0.2D,#0x0
008bdba4	mov w21,w2
008bdba8	ldr x8,[x24, #0x28]
008bdbac	mov x19,x1
008bdbb0	mov x20,x0
008bdbb4	stur x8,[x29, #-0x8]
008bdbb8	ldr w8,[x1, #0x8]
008bdbbc	stur q0,[sp, #0x5c]
008bdbc0	stp q0,q0,[sp]
008bdbc4	stp q0,q0,[sp, #0x20]
008bdbc8	stp q0,q0,[sp, #0x40]
008bdbcc	cbz w8,0x008bdd00
008bdbd0	mov x9,xzr
008bdbd4	mov w23,wzr
008bdbd8	mov w13,#0x1
008bdbdc	mov x10,sp
008bdbe0	mov w11,#0x1
008bdbe4	b 0x008bdc0c
008bdbe8	mov w15,wzr
008bdbec	ldr w12,[x10, x9, LSL #0x2]
008bdbf0	lsl w11,w11,#0x1
008bdbf4	add w23,w15,w23
008bdbf8	add w12,w12,w15
008bdbfc	str w12,[x10, x9, LSL #0x2]
008bdc00	add x9,x9,#0x1
008bdc04	cmp x9,#0x1b
008bdc08	b.eq 0x008bdd04
008bdc0c	cmp w11,w8
008bdc10	mov w12,w11
008bdc14	b.le 0x008bdc24
008bdc18	cmp w13,w8
008bdc1c	mov w12,w8
008bdc20	b.gt 0x008bdd04
008bdc24	cmp w13,w12
008bdc28	b.gt 0x008bdbe8
008bdc2c	sxtw x16,w13
008bdc30	sxtw x13,w12
008bdc34	sub x14,x13,x16
008bdc38	add x15,x14,#0x1
008bdc3c	ldr x14,[x19, #0x20]
008bdc40	cmp x15,#0x8
008bdc44	b.cs 0x008bdc50
008bdc48	mov w15,wzr
008bdc4c	b 0x008bdcd4
008bdc50	movi v0.2D,#0x0
008bdc54	movi v1.2D,#0x0
008bdc58	add x0,x14,x16, LSL #0x4
008bdc5c	and x17,x15,#-0x8
008bdc60	add x16,x17,x16
008bdc64	add x0,x0,#0x3c
008bdc68	mov x1,x17
008bdc6c	ldur s2,[x0, #-0x40]
008bdc70	ldr s3,[x0]
008bdc74	sub x2,x0,#0x30
008bdc78	add x3,x0,#0x10
008bdc7c	subs x1,x1,#0x8
008bdc80	ld1 {v2.S}[1],[x2]
008bdc84	ld1 {v3.S}[1],[x3]
008bdc88	sub x2,x0,#0x20
008bdc8c	add x3,x0,#0x20
008bdc90	ld1 {v2.S}[2],[x2]
008bdc94	ld1 {v3.S}[2],[x3]
008bdc98	sub x2,x0,#0x10
008bdc9c	add x3,x0,#0x30
008bdca0	add x0,x0,#0x80
008bdca4	ld1 {v2.S}[3],[x2]
008bdca8	ld1 {v3.S}[3],[x3]
008bdcac	cmtst v2.4S,v2.4S,v2.4S
008bdcb0	cmtst v3.4S,v3.4S,v3.4S
008bdcb4	sub v0.4S,v0.4S,v2.4S
008bdcb8	sub v1.4S,v1.4S,v3.4S
008bdcbc	b.ne 0x008bdc6c
008bdcc0	add v0.4S,v1.4S,v0.4S
008bdcc4	cmp x15,x17
008bdcc8	addv s0,v0.4S
008bdccc	fmov w15,s0
008bdcd0	b.eq 0x008bdcf8
008bdcd4	add x14,x14,x16, LSL #0x4
008bdcd8	sub x13,x13,x16
008bdcdc	add x13,x13,#0x1
008bdce0	sub x14,x14,#0x4
008bdce4	ldr w16,[x14], #0x10
008bdce8	cmp w16,#0x0
008bdcec	cinc w15,w15,ne
008bdcf0	subs x13,x13,#0x1
008bdcf4	b.ne 0x008bdce4
008bdcf8	add w13,w12,#0x1
008bdcfc	b 0x008bdbec
008bdd00	mov w23,wzr
008bdd04	adrp x8,0xd1f000
008bdd08	add x8,x8,#0xc90
008bdd0c	ldr x22,[x19, #0x28]
008bdd10	ldarb w8,[x8]
008bdd14	adrp x25,0xd1f000
008bdd18	tbz w8,#0x0,0x008bdef0
008bdd1c	ldr x8,[x25, #0xc88]
008bdd20	add x8,x8,#0x7f3, LSL #12
008bdd24	add x8,x8,#0x700
008bdd28	cmp x22,x8
008bdd2c	b.eq 0x008bdde0
008bdd30	ldrb w8,[x19, #0x5]
008bdd34	mov w9,#0xffffffff
008bdd38	mov w22,wzr
008bdd3c	mov w25,wzr
008bdd40	mov w28,#0xfffffffe
008bdd44	lsl w8,w9,w8
008bdd48	mov x9,sp
008bdd4c	orr x27,x9,#0x4
008bdd50	mvn w8,w8
008bdd54	ubfiz x26,x8,#0x5,#0x20
008bdd58	b 0x008bdd84
008bdd5c	bl 0x008b91dc
008bdd60	ldr w9,[x27, w0, SXTW #0x2]
008bdd64	mov w8,#0x1
008bdd68	add w9,w9,#0x1
008bdd6c	str w9,[x27, w0, SXTW #0x2]
008bdd70	add w25,w8,w25
008bdd74	add w22,w22,#0x1
008bdd78	sub x26,x26,#0x20
008bdd7c	cmn x26,#0x20
008bdd80	b.eq 0x008bddd0
008bdd84	ldr x8,[x19, #0x28]
008bdd88	add x9,x8,x26
008bdd8c	ldr w10,[x9, #0xc]
008bdd90	cbz w10,0x008bdd78
008bdd94	ldr w9,[x9, #0x1c]
008bdd98	and w9,w9,#0xf
008bdd9c	cmp w9,#0x3
008bdda0	b.ne 0x008bdd74
008bdda4	add x8,x8,x26
008bdda8	ldr d0,[x8, #0x10]
008bddac	fcvtzs w8,d0
008bddb0	scvtf d1,w8
008bddb4	sub w8,w8,#0x1
008bddb8	fcmp d0,d1
008bddbc	csel w0,w8,w28,eq
008bddc0	lsr w8,w0,#0x1a
008bddc4	cbz w8,0x008bdd5c
008bddc8	mov w8,wzr
008bddcc	b 0x008bdd70
008bddd0	add w8,w25,w23
008bddd4	add w22,w22,w23
008bddd8	mov w23,w8
008bdddc	b 0x008bdde4
008bdde0	mov w22,w23
008bdde4	sub w0,w21,#0x1
008bdde8	lsr w8,w0,#0x1a
008bddec	cbnz w8,0x008bde0c
008bddf0	bl 0x008b91dc
008bddf4	mov x8,sp
008bddf8	add w23,w23,#0x1
008bddfc	add x8,x8,w0, SXTW  #0x2
008bde00	ldr w9,[x8, #0x4]
008bde04	add w9,w9,#0x1
008bde08	str w9,[x8, #0x4]
008bde0c	cmp w23,#0x1
008bde10	add w8,w22,#0x1
008bde14	b.lt 0x008bde74
008bde18	mov w13,wzr
008bde1c	mov w22,wzr
008bde20	mov w9,wzr
008bde24	mov w10,wzr
008bde28	mov w12,#0x1
008bde2c	mov x11,sp
008bde30	ldr w14,[x11], #0x4
008bde34	add w15,w14,w10
008bde38	cmp w15,w13
008bde3c	cset w13,gt
008bde40	cmp w14,#0x0
008bde44	cset w14,gt
008bde48	csel w10,w15,w10,gt
008bde4c	tst w14,w13
008bde50	csel w9,w15,w9,ne
008bde54	csel w22,w12,w22,ne
008bde58	cmp w10,w23
008bde5c	b.eq 0x008bde7c
008bde60	and w13,w12,#0x7fffffff
008bde64	lsl w12,w12,#0x1
008bde68	cmp w13,w23
008bde6c	b.cc 0x008bde30
008bde70	b 0x008bde7c
008bde74	mov w9,wzr
008bde78	mov w22,wzr
008bde7c	mov x0,x19
008bde80	mov w1,w22
008bde84	mov w2,w21
008bde88	sub w23,w8,w9
008bde8c	bl 0x008ba870
008bde90	subs w8,w0,w22
008bde94	b.eq 0x008bdeb0
008bde98	add w1,w8,w0
008bde9c	mov x0,x19
008bdea0	mov w2,w21
008bdea4	sub w23,w23,w8
008bdea8	bl 0x008ba870
008bdeac	mov w22,w0
008bdeb0	ldr x8,[x24, #0x28]
008bdeb4	ldur x9,[x29, #-0x8]
008bdeb8	cmp x8,x9
008bdebc	b.ne 0x008bdf48
008bdec0	mov x0,x20
008bdec4	mov x1,x19
008bdec8	mov w2,w22
008bdecc	mov w3,w23
008bded0	ldp x20,x19,[sp, #0xd0]
008bded4	ldp x22,x21,[sp, #0xc0]
008bded8	ldp x24,x23,[sp, #0xb0]
008bdedc	ldp x26,x25,[sp, #0xa0]
008bdee0	ldp x28,x27,[sp, #0x90]
008bdee4	ldp x29,x30,[sp, #0x80]
008bdee8	add sp,sp,#0xe0
008bdeec	b 0x008ba968
008bdef0	adrp x0,0xd1f000
008bdef4	add x0,x0,#0xc90
008bdef8	bl 0x00c2fe90
008bdefc	cbz w0,0x008bdd1c
008bdf00	adrp x8,0xcca000
008bdf04	ldr x0,[x8, #0x8c8]
008bdf08	bl 0x007fe1ec
008bdf0c	str x0,[x25, #0xc88]
008bdf10	adrp x0,0xd1f000
008bdf14	add x0,x0,#0xc90
008bdf18	bl 0x00c2fea0
008bdf1c	b 0x008bdd1c
008bdf48	bl 0x00c2fec0
