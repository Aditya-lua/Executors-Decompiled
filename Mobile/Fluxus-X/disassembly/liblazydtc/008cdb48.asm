; LZ4_compress_fast_extState @ 008cdb48
008cdb48	sub sp,sp,#0xd0
008cdb4c	stp x29,x30,[sp, #0x70]
008cdb50	stp x28,x27,[sp, #0x80]
008cdb54	stp x26,x25,[sp, #0x90]
008cdb58	stp x24,x23,[sp, #0xa0]
008cdb5c	stp x22,x21,[sp, #0xb0]
008cdb60	stp x20,x19,[sp, #0xc0]
008cdb64	add x29,sp,#0x70
008cdb68	mov w23,w5
008cdb6c	mov w19,w4
008cdb70	mov w22,w3
008cdb74	mov x27,x2
008cdb78	mov x20,x1
008cdb7c	mov x24,xzr
008cdb80	cbz x0,0x008cdb9c
008cdb84	and x8,x0,#0x7
008cdb88	cbnz x8,0x008cdb9c
008cdb8c	mov w1,wzr
008cdb90	mov w2,#0x4020
008cdb94	mov x24,x0
008cdb98	bl 0x00c301c0
008cdb9c	cmp w23,#0x1
008cdba0	orr w9,wzr,#0x10001
008cdba4	mov w10,#0x7e000000
008cdba8	csinc w8,w23,wzr,gt
008cdbac	cmp w8,#0x10, LSL #12
008cdbb0	csel w16,w8,w9,le
008cdbb4	cmp w22,w10
008cdbb8	b.ls 0x008cdbc4
008cdbbc	mov w8,wzr
008cdbc0	b 0x008cdbdc
008cdbc4	mov w8,#0x8081
008cdbc8	movk w8,#0x8080, LSL #16
008cdbcc	umull x8,w22,w8
008cdbd0	lsr x8,x8,#0x27
008cdbd4	add w8,w22,w8
008cdbd8	add w8,w8,#0x10
008cdbdc	mov w9,#0xa
008cdbe0	cmp w19,w8
008cdbe4	add x8,x24,#0x4, LSL #12
008cdbe8	movk w9,#0x1, LSL #16
008cdbec	b.ge 0x008ce0e0
008cdbf0	cmp w22,w9
008cdbf4	b.gt 0x008ce578
008cdbf8	mov w9,#0x7e000000
008cdbfc	cmp w22,w9
008cdc00	b.hi 0x008cf184
008cdc04	cbz w22,0x008cf0a8
008cdc08	ldr w10,[x8, #0x18]
008cdc0c	ldr w9,[x8, #0x10]
008cdc10	mov w13,w22
008cdc14	add x19,x27,w19, SXTW 
008cdc18	mov w11,#0x3
008cdc1c	cmp w22,#0xd
008cdc20	add w10,w10,w22
008cdc24	add w12,w9,w22
008cdc28	mov x25,x27
008cdc2c	stp w11,w10,[x8, #0x14]
008cdc30	add x10,x20,x13
008cdc34	mov x1,x20
008cdc38	str w12,[x8, #0x10]
008cdc3c	b.cc 0x008cf15c
008cdc40	ldr w8,[x20]
008cdc44	mov w23,#0x79b1
008cdc48	stur x13,[x29, #-0x28]
008cdc4c	movk w23,#0x9e37, LSL #16
008cdc50	sub x26,x10,#0xb
008cdc54	sub x13,x10,#0x5
008cdc58	mul w8,w8,w23
008cdc5c	mov x25,x27
008cdc60	sub x27,x10,#0xc
008cdc64	sub x12,x10,#0x8
008cdc68	stur x10,[x29, #-0x18]
008cdc6c	sub x10,x10,#0x6
008cdc70	mov x11,x20
008cdc74	lsl w15,w16,#0x6
008cdc78	str x10,[sp, #0x28]
008cdc7c	mvn x10,x9
008cdc80	mov w16,#0x8081
008cdc84	lsr w8,w8,#0x13
008cdc88	sub x20,x20,x9
008cdc8c	movk w16,#0x8080, LSL #16
008cdc90	mov w17,#0xffffffff
008cdc94	add x10,x10,x11
008cdc98	mov w2,#0x8081
008cdc9c	mov x1,x11
008cdca0	stp x12,x13,[sp, #0x30]
008cdca4	str x10,[sp, #0x20]
008cdca8	strh w9,[x24, w8, UXTW #0x1]
008cdcac	stur x25,[x29, #-0x20]
008cdcb0	stp x19,x11,[x29, #-0x10]
008cdcb4	stur w15,[x29, #-0x30]
008cdcb8	mov x8,x1
008cdcbc	mov w12,#0x1
008cdcc0	mov w9,w15
008cdcc4	ldr w10,[x8, #0x1]!
008cdcc8	mov x21,x8
008cdccc	add x8,x8,w12, UXTW 
008cdcd0	cmp x8,x26
008cdcd4	b.hi 0x008cf150
008cdcd8	mul w11,w10,w23
008cdcdc	ldr w14,[x8]
008cdce0	lsr w13,w11,#0x13
008cdce4	ldrh w11,[x24, w13, UXTW #0x1]
008cdce8	ldr w12,[x20, x11#0x0]
008cdcec	cmp w12,w10
008cdcf0	lsr w12,w9,#0x6
008cdcf4	sub w10,w21,w20
008cdcf8	add w9,w9,#0x1
008cdcfc	strh w10,[x24, w13, UXTW #0x1]
008cdd00	mov w10,w14
008cdd04	b.ne 0x008cdcc8
008cdd08	ldur x8,[x29, #-0x8]
008cdd0c	add x22,x20,x11
008cdd10	cmp x22,x8
008cdd14	b.ls 0x008cdd28
008cdd18	ldurb w8,[x21, #-0x1]
008cdd1c	ldurb w9,[x22, #-0x1]
008cdd20	cmp w8,w9
008cdd24	b.eq 0x008ce090
008cdd28	mov x8,x21
008cdd2c	sub x9,x8,x1
008cdd30	add x0,x25,#0x1
008cdd34	mov w28,w9
008cdd38	umull x10,w28,w16
008cdd3c	add x11,x0,x28
008cdd40	add x10,x11,x10, LSR #0x27
008cdd44	add x10,x10,#0x8
008cdd48	cmp x10,x19
008cdd4c	b.hi 0x008cf184
008cdd50	subs w10,w9,#0xf
008cdd54	b.cc 0x008cddc4
008cdd58	cmp w10,#0xff
008cdd5c	mov w9,#0xf0
008cdd60	strb w9,[x25]
008cdd64	b.cc 0x008cddbc
008cdd68	sub w8,w8,w1
008cdd6c	str x1,[sp, #0x18]
008cdd70	mov w1,#0xff
008cdd74	sub w8,w8,#0x10e
008cdd78	str w8,[sp, #0x10]
008cdd7c	umull x8,w8,w16
008cdd80	lsr x8,x8,#0x27
008cdd84	add x2,x8,#0x1
008cdd88	str x8,[sp, #0x8]
008cdd8c	bl 0x00c301c0
008cdd90	ldr x9,[sp, #0x8]
008cdd94	ldr w10,[sp, #0x10]
008cdd98	mov w16,#0x8081
008cdd9c	ldr x1,[sp, #0x18]
008cdda0	mov w2,#0x8081
008cdda4	mov w17,#0xffffffff
008cdda8	sub w8,w9,w9, LSL #0x8
008cddac	add x9,x25,x9
008cddb0	movk w16,#0x8080, LSL #16
008cddb4	add x0,x9,#0x2
008cddb8	add w10,w10,w8
008cddbc	strb w10,[x0], #0x1
008cddc0	b 0x008cddcc
008cddc4	lsl w8,w9,#0x4
008cddc8	strb w8,[x25]
008cddcc	cmp x28,#0x8
008cddd0	mov w8,#0x8
008cddd4	csel x9,x28,x8,hi
008cddd8	cmp x28,#0x19
008cdddc	add x8,x0,x28
008cdde0	b.cc 0x008cde3c
008cdde4	sub x10,x0,x1
008cdde8	cmp x10,#0x20
008cddec	b.cc 0x008cde3c
008cddf0	sub x9,x9,#0x1
008cddf4	add x13,x0,#0x10
008cddf8	add x14,x1,#0x10
008cddfc	lsr x9,x9,#0x3
008cde00	add x11,x9,#0x1
008cde04	and x12,x11,#0x3ffffffffffffffc
008cde08	lsl x10,x12,#0x3
008cde0c	mov x15,x12
008cde10	add x9,x1,x10
008cde14	add x10,x0,x10
008cde18	ldp q0,q1,[x14, #-0x10]
008cde1c	subs x15,x15,#0x4
008cde20	add x14,x14,#0x20
008cde24	stp q0,q1,[x13, #-0x10]
008cde28	add x13,x13,#0x20
008cde2c	b.ne 0x008cde18
008cde30	cmp x11,x12
008cde34	b.eq 0x008cde54
008cde38	b 0x008cde44
008cde3c	mov x9,x1
008cde40	mov x10,x0
008cde44	ldr x11,[x9], #0x8
008cde48	str x11,[x10], #0x8
008cde4c	cmp x10,x8
008cde50	b.cc 0x008cde44
008cde54	add x10,x21,#0x4
008cde58	sub w11,w21,w22
008cde5c	mov x9,x8
008cde60	cmp x10,x27
008cde64	add x12,x22,#0x4
008cde68	strh w11,[x9], #0x2
008cde6c	b.cs 0x008ce070
008cde70	ldr x11,[x12]
008cde74	ldr x12,[x10]
008cde78	cmp x11,x12
008cde7c	b.ne 0x008cdf34
008cde80	add x11,x21,#0xc
008cde84	add x12,x22,#0xc
008cde88	cmp x11,x27
008cde8c	b.cs 0x008cdebc
008cde90	sub w13,w11,w21
008cde94	sub w13,w13,#0x4
008cde98	ldr x14,[x12]
008cde9c	ldr x15,[x11]
008cdea0	cmp x14,x15
008cdea4	b.ne 0x008cdf48
008cdea8	add x11,x11,#0x8
008cdeac	add x12,x12,#0x8
008cdeb0	add w13,w13,#0x8
008cdeb4	cmp x11,x27
008cdeb8	b.cc 0x008cde98
008cdebc	ldr x13,[sp, #0x30]
008cdec0	cmp x11,x13
008cdec4	b.cs 0x008cdee4
008cdec8	ldr w13,[x12]
008cdecc	ldr w14,[x11]
008cded0	cmp w13,w14
008cded4	add x13,x11,#0x4
008cded8	add x14,x12,#0x4
008cdedc	csel x12,x12,x14,ne
008cdee0	csel x11,x11,x13,ne
008cdee4	ldr x13,[sp, #0x28]
008cdee8	cmp x11,x13
008cdeec	b.cs 0x008cdf0c
008cdef0	ldrh w13,[x12]
008cdef4	ldrh w14,[x11]
008cdef8	cmp w13,w14
008cdefc	add x13,x11,#0x2
008cdf00	add x14,x12,#0x2
008cdf04	csel x12,x12,x14,ne
008cdf08	csel x11,x11,x13,ne
008cdf0c	ldr x13,[sp, #0x38]
008cdf10	cmp x11,x13
008cdf14	b.cs 0x008cdf2c
008cdf18	mov x13,x11
008cdf1c	ldrb w12,[x12]
008cdf20	ldrb w14,[x13], #0x1
008cdf24	cmp w12,w14
008cdf28	csel x11,x11,x13,ne
008cdf2c	sub w22,w11,w10
008cdf30	b 0x008cdf5c
008cdf34	eor x10,x12,x11
008cdf38	rbit x10,x10
008cdf3c	clz x10,x10
008cdf40	lsr w22,w10,#0x3
008cdf44	b 0x008cdf5c
008cdf48	eor x10,x15,x14
008cdf4c	rbit x10,x10
008cdf50	clz x10,x10
008cdf54	lsr x10,x10,#0x3
008cdf58	add w22,w10,w13
008cdf5c	add w10,w22,#0xf0
008cdf60	umull x10,w10,w16
008cdf64	add x10,x8,x10, LSR #0x27
008cdf68	add x10,x10,#0x8
008cdf6c	cmp x10,x19
008cdf70	b.hi 0x008cf184
008cdf74	ldrb w11,[x25]
008cdf78	subs w10,w22,#0xf
008cdf7c	b.cc 0x008ce00c
008cdf80	add w11,w11,#0xf
008cdf84	cmp w10,#0x3fc
008cdf88	strb w11,[x25]
008cdf8c	str w17,[x9]
008cdf90	b.cc 0x008cdff0
008cdf94	sub w28,w22,#0x40b
008cdf98	mov x23,x20
008cdf9c	mov x20,x26
008cdfa0	umull x9,w28,w16
008cdfa4	add x25,x8,#0x6
008cdfa8	mov w1,#0xff
008cdfac	mov x0,x25
008cdfb0	lsr x26,x9,#0x29
008cdfb4	lsl w19,w26,#0x2
008cdfb8	add x2,x19,#0x4
008cdfbc	bl 0x00c301c0
008cdfc0	mov w8,#0x3fc
008cdfc4	mov w16,#0x8081
008cdfc8	add x9,x25,x19
008cdfcc	msub w10,w26,w8,w28
008cdfd0	mov x26,x20
008cdfd4	mov x20,x23
008cdfd8	ldur x19,[x29, #-0x10]
008cdfdc	mov w23,#0x79b1
008cdfe0	mov w2,#0x8081
008cdfe4	mov w17,#0xffffffff
008cdfe8	movk w16,#0x8080, LSL #16
008cdfec	movk w23,#0x9e37, LSL #16
008cdff0	and w8,w10,#0xffff
008cdff4	mul w8,w8,w2
008cdff8	lsr w8,w8,#0x17
008cdffc	add x9,x9,x8
008ce000	add w8,w10,w8
008ce004	strb w8,[x9], #0x1
008ce008	b 0x008ce014
008ce00c	add w8,w11,w22
008ce010	strb w8,[x25]
008ce014	add x8,x21,w22, UXTW 
008ce018	add x21,x8,#0x4
008ce01c	cmp x21,x26
008ce020	b.cs 0x008cf148
008ce024	ldr w10,[x8, #0x2]!
008ce028	ldur w11,[x8, #0x2]
008ce02c	sub w8,w8,w20
008ce030	mul w10,w10,w23
008ce034	mul w12,w11,w23
008ce038	lsr w10,w10,#0x13
008ce03c	lsr w12,w12,#0x13
008ce040	strh w8,[x24, w10, UXTW #0x1]
008ce044	ldrh w8,[x24, w12, UXTW #0x1]
008ce048	add x22,x20,x8
008ce04c	ldr w8,[x22]
008ce050	cmp w8,w11
008ce054	sub w8,w21,w20
008ce058	strh w8,[x24, w12, UXTW #0x1]
008ce05c	b.ne 0x008ce080
008ce060	mov x8,x9
008ce064	mov x25,x9
008ce068	strb wzr,[x8], #0x1
008ce06c	b 0x008cde54
008ce070	mov x11,x10
008ce074	cmp x11,x27
008ce078	b.cc 0x008cde90
008ce07c	b 0x008cdebc
008ce080	ldur w15,[x29, #-0x30]
008ce084	mov x25,x9
008ce088	mov x1,x21
008ce08c	b 0x008cdcb8
008ce090	ldr x8,[sp, #0x20]
008ce094	sub x12,x21,#0x1
008ce098	mov x9,x12
008ce09c	add x10,x8,x11
008ce0a0	ldur x8,[x29, #-0x8]
008ce0a4	mov x22,x10
008ce0a8	mov x21,x9
008ce0ac	cmp x10,x8
008ce0b0	mov x8,x12
008ce0b4	b.ls 0x008cdd2c
008ce0b8	cmp x21,x1
008ce0bc	b.ls 0x008cdd2c
008ce0c0	mov x9,x21
008ce0c4	mov x10,x22
008ce0c8	ldrb w11,[x9, #-0x1]!
008ce0cc	ldrb w12,[x10, #-0x1]!
008ce0d0	cmp w11,w12
008ce0d4	sub x12,x8,#0x1
008ce0d8	b.eq 0x008ce0a0
008ce0dc	b 0x008cdd2c
008ce0e0	cmp w22,w9
008ce0e4	b.gt 0x008ce640
008ce0e8	mov w9,#0x7e000000
008ce0ec	cmp w22,w9
008ce0f0	b.hi 0x008cf184
008ce0f4	cbz w22,0x008cf0b0
008ce0f8	ldr w10,[x8, #0x18]
008ce0fc	ldr w9,[x8, #0x10]
008ce100	mov w13,w22
008ce104	mov w11,#0x3
008ce108	cmp w22,#0xd
008ce10c	mov x26,x27
008ce110	add w10,w10,w22
008ce114	add w12,w9,w22
008ce118	mov x25,x20
008ce11c	stp w11,w10,[x8, #0x14]
008ce120	add x10,x20,x13
008ce124	str w12,[x8, #0x10]
008ce128	b.cc 0x008cf0d0
008ce12c	ldr w8,[x20]
008ce130	mov x25,x20
008ce134	mov w20,#0x79b1
008ce138	movk w20,#0x9e37, LSL #16
008ce13c	sub x23,x10,#0xb
008ce140	sub x11,x10,#0x5
008ce144	mul w8,w8,w20
008ce148	sub x28,x10,#0xc
008ce14c	sub x12,x10,#0x8
008ce150	stur x10,[x29, #-0x18]
008ce154	sub x10,x10,#0x6
008ce158	sub x22,x25,x9
008ce15c	stur x11,[x29, #-0x30]
008ce160	lsl w11,w16,#0x6
008ce164	mov w16,#0xffffffff
008ce168	str x10,[sp, #0x30]
008ce16c	mvn x10,x9
008ce170	lsr w8,w8,#0x13
008ce174	add x10,x10,x25
008ce178	mov w17,#0x8081
008ce17c	mov x26,x27
008ce180	stur x13,[x29, #-0x10]
008ce184	str x12,[sp, #0x38]
008ce188	str x10,[sp, #0x28]
008ce18c	strh w9,[x24, w8, UXTW #0x1]
008ce190	stur x25,[x29, #-0x8]
008ce194	stur x27,[x29, #-0x20]
008ce198	stur w11,[x29, #-0x28]
008ce19c	mov x8,x25
008ce1a0	mov w12,#0x1
008ce1a4	mov w9,w11
008ce1a8	ldr w10,[x8, #0x1]!
008ce1ac	mov x21,x8
008ce1b0	add x8,x8,w12, UXTW 
008ce1b4	cmp x8,x23
008ce1b8	b.hi 0x008cf0c8
008ce1bc	mul w11,w10,w20
008ce1c0	ldr w14,[x8]
008ce1c4	lsr w13,w11,#0x13
008ce1c8	ldrh w11,[x24, w13, UXTW #0x1]
008ce1cc	ldr w12,[x22, x11#0x0]
008ce1d0	cmp w12,w10
008ce1d4	lsr w12,w9,#0x6
008ce1d8	sub w10,w21,w22
008ce1dc	add w9,w9,#0x1
008ce1e0	strh w10,[x24, w13, UXTW #0x1]
008ce1e4	mov w10,w14
008ce1e8	b.ne 0x008ce1ac
008ce1ec	ldur x8,[x29, #-0x8]
008ce1f0	add x27,x22,x11
008ce1f4	cmp x27,x8
008ce1f8	b.ls 0x008ce20c
008ce1fc	ldurb w8,[x21, #-0x1]
008ce200	ldurb w9,[x27, #-0x1]
008ce204	cmp w8,w9
008ce208	b.eq 0x008ce528
008ce20c	mov x8,x21
008ce210	sub x19,x8,x25
008ce214	add x0,x26,#0x1
008ce218	subs w9,w19,#0xf
008ce21c	b.cc 0x008ce284
008ce220	cmp w9,#0xff
008ce224	mov w10,#0xf0
008ce228	strb w10,[x26]
008ce22c	b.cc 0x008ce27c
008ce230	sub w8,w8,w25
008ce234	mov w1,#0xff
008ce238	sub w9,w8,#0x10e
008ce23c	mov w8,#0x8081
008ce240	movk w8,#0x8080, LSL #16
008ce244	str w9,[sp, #0x20]
008ce248	umull x8,w9,w8
008ce24c	lsr x8,x8,#0x27
008ce250	add x2,x8,#0x1
008ce254	str x8,[sp, #0x18]
008ce258	bl 0x00c301c0
008ce25c	ldr x9,[sp, #0x18]
008ce260	mov w17,#0x8081
008ce264	mov w16,#0xffffffff
008ce268	sub w8,w9,w9, LSL #0x8
008ce26c	add x10,x26,x9
008ce270	ldr w9,[sp, #0x20]
008ce274	add x0,x10,#0x2
008ce278	add w9,w9,w8
008ce27c	strb w9,[x0], #0x1
008ce280	b 0x008ce28c
008ce284	lsl w8,w19,#0x4
008ce288	strb w8,[x26]
008ce28c	mov w8,w19
008ce290	mov w9,#0x8
008ce294	cmp x8,#0x8
008ce298	csel x9,x8,x9,hi
008ce29c	cmp x8,#0x19
008ce2a0	add x8,x0,x8
008ce2a4	b.cc 0x008ce300
008ce2a8	sub x10,x0,x25
008ce2ac	cmp x10,#0x20
008ce2b0	b.cc 0x008ce300
008ce2b4	sub x9,x9,#0x1
008ce2b8	add x13,x0,#0x10
008ce2bc	add x14,x25,#0x10
008ce2c0	lsr x9,x9,#0x3
008ce2c4	add x11,x9,#0x1
008ce2c8	and x12,x11,#0x3ffffffffffffffc
008ce2cc	lsl x10,x12,#0x3
008ce2d0	mov x15,x12
008ce2d4	add x9,x25,x10
008ce2d8	add x10,x0,x10
008ce2dc	ldp q0,q1,[x14, #-0x10]
008ce2e0	subs x15,x15,#0x4
008ce2e4	add x14,x14,#0x20
008ce2e8	stp q0,q1,[x13, #-0x10]
008ce2ec	add x13,x13,#0x20
008ce2f0	b.ne 0x008ce2dc
008ce2f4	cmp x11,x12
008ce2f8	b.eq 0x008ce318
008ce2fc	b 0x008ce308
008ce300	mov x9,x25
008ce304	mov x10,x0
008ce308	ldr x11,[x9], #0x8
008ce30c	str x11,[x10], #0x8
008ce310	cmp x10,x8
008ce314	b.cc 0x008ce308
008ce318	add x10,x21,#0x4
008ce31c	sub w11,w21,w27
008ce320	mov x9,x8
008ce324	cmp x10,x28
008ce328	add x12,x27,#0x4
008ce32c	strh w11,[x9], #0x2
008ce330	b.cs 0x008ce504
008ce334	ldr x11,[x12]
008ce338	ldr x12,[x10]
008ce33c	cmp x11,x12
008ce340	b.ne 0x008ce3e8
008ce344	add x11,x21,#0xc
008ce348	add x12,x27,#0xc
008ce34c	cmp x11,x28
008ce350	b.cs 0x008ce374
008ce354	ldr x13,[x12]
008ce358	ldr x14,[x11]
008ce35c	cmp x13,x14
008ce360	b.ne 0x008ce408
008ce364	add x11,x11,#0x8
008ce368	add x12,x12,#0x8
008ce36c	cmp x11,x28
008ce370	b.cc 0x008ce354
008ce374	ldr x13,[sp, #0x38]
008ce378	cmp x11,x13
008ce37c	b.cs 0x008ce39c
008ce380	ldr w13,[x12]
008ce384	ldr w14,[x11]
008ce388	cmp w13,w14
008ce38c	add x13,x11,#0x4
008ce390	add x14,x12,#0x4
008ce394	csel x12,x12,x14,ne
008ce398	csel x11,x11,x13,ne
008ce39c	ldr x13,[sp, #0x30]
008ce3a0	cmp x11,x13
008ce3a4	b.cs 0x008ce3c4
008ce3a8	ldrh w13,[x12]
008ce3ac	ldrh w14,[x11]
008ce3b0	cmp w13,w14
008ce3b4	add x13,x11,#0x2
008ce3b8	add x14,x12,#0x2
008ce3bc	csel x12,x12,x14,ne
008ce3c0	csel x11,x11,x13,ne
008ce3c4	ldur x13,[x29, #-0x30]
008ce3c8	cmp x11,x13
008ce3cc	b.cs 0x008ce418
008ce3d0	mov x13,x11
008ce3d4	ldrb w12,[x12]
008ce3d8	ldrb w14,[x13], #0x1
008ce3dc	cmp w12,w14
008ce3e0	csel x11,x11,x13,ne
008ce3e4	b 0x008ce418
008ce3e8	eor x8,x12,x11
008ce3ec	rbit x8,x8
008ce3f0	clz x8,x8
008ce3f4	lsr w10,w8,#0x3
008ce3f8	mov w8,w10
008ce3fc	add x8,x21,x8
008ce400	add x21,x8,#0x4
008ce404	b 0x008ce4a0
008ce408	eor x12,x14,x13
008ce40c	rbit x12,x12
008ce410	clz x12,x12
008ce414	add x11,x11,x12, LSR #0x3
008ce418	sub x10,x11,x10
008ce41c	add x12,x21,w10, UXTW 
008ce420	subs w11,w10,#0xf
008ce424	add x21,x12,#0x4
008ce428	b.cc 0x008ce4a0
008ce42c	ldrb w12,[x26]
008ce430	cmp w11,#0x3fc
008ce434	add w12,w12,#0xf
008ce438	strb w12,[x26]
008ce43c	str w16,[x9]
008ce440	b.cc 0x008ce484
008ce444	mov w9,#0x8081
008ce448	sub w19,w10,#0x40b
008ce44c	add x25,x8,#0x6
008ce450	movk w9,#0x8080, LSL #16
008ce454	mov x0,x25
008ce458	mov w1,#0xff
008ce45c	umull x9,w19,w9
008ce460	lsr x26,x9,#0x29
008ce464	lsl w27,w26,#0x2
008ce468	add x2,x27,#0x4
008ce46c	bl 0x00c301c0
008ce470	mov w8,#0x3fc
008ce474	mov w17,#0x8081
008ce478	mov w16,#0xffffffff
008ce47c	msub w11,w26,w8,w19
008ce480	add x9,x25,x27
008ce484	and w8,w11,#0xffff
008ce488	mul w8,w8,w17
008ce48c	lsr w8,w8,#0x17
008ce490	add x9,x9,x8
008ce494	add w8,w11,w8
008ce498	strb w8,[x9], #0x1
008ce49c	b 0x008ce4ac
008ce4a0	ldrb w8,[x26]
008ce4a4	add w8,w8,w10
008ce4a8	strb w8,[x26]
008ce4ac	cmp x21,x23
008ce4b0	b.cs 0x008cf0bc
008ce4b4	mov x8,x21
008ce4b8	ldr w11,[x21]
008ce4bc	ldr w10,[x8, #-0x2]!
008ce4c0	mul w12,w11,w20
008ce4c4	sub w8,w8,w22
008ce4c8	mul w10,w10,w20
008ce4cc	lsr w12,w12,#0x13
008ce4d0	lsr w10,w10,#0x13
008ce4d4	strh w8,[x24, w10, UXTW #0x1]
008ce4d8	ldrh w8,[x24, w12, UXTW #0x1]
008ce4dc	add x27,x22,x8
008ce4e0	ldr w8,[x27]
008ce4e4	cmp w8,w11
008ce4e8	sub w8,w21,w22
008ce4ec	strh w8,[x24, w12, UXTW #0x1]
008ce4f0	b.ne 0x008ce514
008ce4f4	mov x8,x9
008ce4f8	mov x26,x9
008ce4fc	strb wzr,[x8], #0x1
008ce500	b 0x008ce318
008ce504	mov x11,x10
008ce508	cmp x11,x28
008ce50c	b.cc 0x008ce354
008ce510	b 0x008ce374
008ce514	ldur x27,[x29, #-0x20]
008ce518	ldur w11,[x29, #-0x28]
008ce51c	mov x26,x9
008ce520	mov x25,x21
008ce524	b 0x008ce19c
008ce528	ldr x8,[sp, #0x28]
008ce52c	sub x12,x21,#0x1
008ce530	mov x9,x12
008ce534	add x10,x8,x11
008ce538	ldur x8,[x29, #-0x8]
008ce53c	mov x27,x10
008ce540	mov x21,x9
008ce544	cmp x10,x8
008ce548	mov x8,x12
008ce54c	b.ls 0x008ce210
008ce550	cmp x21,x25
008ce554	b.ls 0x008ce210
008ce558	mov x9,x21
008ce55c	mov x10,x27
008ce560	ldrb w11,[x9, #-0x1]!
008ce564	ldrb w12,[x10, #-0x1]!
008ce568	cmp w11,w12
008ce56c	sub x12,x8,#0x1
008ce570	b.eq 0x008ce538
008ce574	b 0x008ce210
008ce578	mov w9,#0x7e000000
008ce57c	cmp w22,w9
008ce580	b.hi 0x008cf184
008ce584	mov x26,#0xbb000000
008ce588	mov x21,x20
008ce58c	ldr w11,[x8, #0x18]
008ce590	movk x26,#0xbcdc, LSL #32
008ce594	ldr x12,[x21], #0x1
008ce598	movk x26,#0xcf1b, LSL #48
008ce59c	mov w15,w22
008ce5a0	ldr w10,[x8, #0x10]
008ce5a4	mul x12,x12,x26
008ce5a8	mov w13,#0x2
008ce5ac	mov w14,#0x1
008ce5b0	add x17,x20,x15
008ce5b4	add w11,w11,w22
008ce5b8	orr w0,w14,w16, LSL #0x6
008ce5bc	sub x14,x17,#0x5
008ce5c0	stp w13,w11,[x8, #0x14]
008ce5c4	add x28,x27,w19, SXTW 
008ce5c8	str x14,[sp, #0x38]
008ce5cc	add w14,w10,w22
008ce5d0	mov w2,#0x8081
008ce5d4	str x15,[sp, #0x8]
008ce5d8	mov x15,x20
008ce5dc	add x9,x20,#0x2
008ce5e0	lsr x11,x12,#0x32
008ce5e4	sub x12,x17,#0x8
008ce5e8	str w14,[x8, #0x10]
008ce5ec	str x12,[sp, #0x30]
008ce5f0	mvn x12,x10
008ce5f4	mov w1,#0xffff
008ce5f8	and x8,x11,#0x3ffc
008ce5fc	sub x11,x17,#0x6
008ce600	movk w2,#0x8080, LSL #16
008ce604	sub x20,x20,x10
008ce608	sub x3,x17,#0xb
008ce60c	sub x19,x17,#0xc
008ce610	str x11,[sp, #0x28]
008ce614	add x11,x12,x15
008ce618	mov x23,x27
008ce61c	mov x27,x15
008ce620	stur x17,[x29, #-0x30]
008ce624	str x11,[sp]
008ce628	str w10,[x24, x8#0x0]
008ce62c	stp x28,x15,[x29, #-0x10]
008ce630	stur x23,[x29, #-0x20]
008ce634	stur w16,[x29, #-0x18]
008ce638	stur w0,[x29, #-0x28]
008ce63c	b 0x008ceb28
008ce640	mov w9,#0x7e000000
008ce644	cmp w22,w9
008ce648	b.hi 0x008cf184
008ce64c	mov x9,x20
008ce650	mov x19,#0xbb000000
008ce654	ldr w12,[x8, #0x18]
008ce658	movk x19,#0xbcdc, LSL #32
008ce65c	ldr x10,[x9], #0x2
008ce660	movk x19,#0xcf1b, LSL #48
008ce664	mov w15,w22
008ce668	ldr w11,[x8, #0x10]
008ce66c	mul x10,x10,x19
008ce670	mov w14,#0x1
008ce674	str x15,[sp, #0x10]
008ce678	add x15,x20,x15
008ce67c	mov w13,#0x2
008ce680	orr w17,w14,w16, LSL #0x6
008ce684	sub x14,x15,#0x5
008ce688	add w12,w12,w22
008ce68c	mov w23,#0xffff
008ce690	stur x14,[x29, #-0x30]
008ce694	add w14,w11,w22
008ce698	sub x28,x20,x11
008ce69c	stp w13,w12,[x8, #0x14]
008ce6a0	sub x12,x15,#0x8
008ce6a4	mov x26,x27
008ce6a8	lsr x10,x10,#0x32
008ce6ac	str x12,[sp, #0x38]
008ce6b0	mvn x12,x11
008ce6b4	str w14,[x8, #0x10]
008ce6b8	sub x27,x15,#0xb
008ce6bc	sub x25,x15,#0xc
008ce6c0	and x8,x10,#0x3ffc
008ce6c4	sub x10,x15,#0x6
008ce6c8	stur x15,[x29, #-0x28]
008ce6cc	str x10,[sp, #0x30]
008ce6d0	add x10,x12,x20
008ce6d4	str x10,[sp, #0x8]
008ce6d8	str w11,[x24, x8#0x0]
008ce6dc	stur x20,[x29, #-0x8]
008ce6e0	stur x26,[x29, #-0x20]
008ce6e4	stur w16,[x29, #-0x18]
008ce6e8	stur w17,[x29, #-0x10]
008ce6ec	b 0x008ce704
008ce6f0	add x9,x20,#0x2
008ce6f4	ldur w16,[x29, #-0x18]
008ce6f8	ldur w17,[x29, #-0x10]
008ce6fc	cmp x9,x27
008ce700	b.hi 0x008cef74
008ce704	mov x21,x20
008ce708	mov w8,w16
008ce70c	mov w10,w17
008ce710	ldr x11,[x21, #0x1]!
008ce714	b 0x008ce730
008ce718	add x9,x13,w8, UXTW 
008ce71c	lsr w8,w10,#0x6
008ce720	add w10,w10,#0x1
008ce724	mov x21,x13
008ce728	cmp x9,x27
008ce72c	b.hi 0x008cef74
008ce730	mul x11,x11,x19
008ce734	mov x13,x9
008ce738	sub w9,w21,w28
008ce73c	lsr x11,x11,#0x32
008ce740	and x14,x11,#0x3ffc
008ce744	ldr x11,[x13]
008ce748	ldr w12,[x24, x14#0x0]
008ce74c	str w9,[x24, x14#0x0]
008ce750	add w15,w12,w23
008ce754	cmp w15,w9
008ce758	b.cc 0x008ce718
008ce75c	ldr w9,[x28, x12#0x0]
008ce760	ldr w14,[x21]
008ce764	cmp w9,w14
008ce768	b.ne 0x008ce718
008ce76c	ldur x8,[x29, #-0x8]
008ce770	add x22,x28,x12
008ce774	cmp x22,x8
008ce778	b.ls 0x008ce78c
008ce77c	ldurb w8,[x21, #-0x1]
008ce780	ldurb w9,[x22, #-0x1]
008ce784	cmp w8,w9
008ce788	b.eq 0x008ceac0
008ce78c	mov x8,x21
008ce790	sub x11,x8,x20
008ce794	add x0,x26,#0x1
008ce798	subs w9,w11,#0xf
008ce79c	b.cc 0x008ce804
008ce7a0	cmp w9,#0xff
008ce7a4	mov w10,#0xf0
008ce7a8	strb w10,[x26]
008ce7ac	b.cc 0x008ce7fc
008ce7b0	sub w8,w8,w20
008ce7b4	mov w1,#0xff
008ce7b8	str x11,[sp, #0x28]
008ce7bc	sub w9,w8,#0x10e
008ce7c0	mov w8,#0x8081
008ce7c4	movk w8,#0x8080, LSL #16
008ce7c8	str w9,[sp, #0x20]
008ce7cc	umull x8,w9,w8
008ce7d0	lsr x8,x8,#0x27
008ce7d4	add x2,x8,#0x1
008ce7d8	str x8,[sp, #0x18]
008ce7dc	bl 0x00c301c0
008ce7e0	ldr x9,[sp, #0x18]
008ce7e4	ldr x11,[sp, #0x28]
008ce7e8	sub w8,w9,w9, LSL #0x8
008ce7ec	add x10,x26,x9
008ce7f0	ldr w9,[sp, #0x20]
008ce7f4	add x0,x10,#0x2
008ce7f8	add w9,w9,w8
008ce7fc	strb w9,[x0], #0x1
008ce800	b 0x008ce80c
008ce804	lsl w8,w11,#0x4
008ce808	strb w8,[x26]
008ce80c	mov w8,w11
008ce810	mov w9,#0x8
008ce814	cmp x8,#0x8
008ce818	csel x9,x8,x9,hi
008ce81c	cmp x8,#0x19
008ce820	add x8,x0,x8
008ce824	b.cc 0x008ce880
008ce828	sub x10,x0,x20
008ce82c	cmp x10,#0x20
008ce830	b.cc 0x008ce880
008ce834	sub x9,x9,#0x1
008ce838	add x13,x0,#0x10
008ce83c	add x14,x20,#0x10
008ce840	lsr x9,x9,#0x3
008ce844	add x11,x9,#0x1
008ce848	and x12,x11,#0x3ffffffffffffffc
008ce84c	lsl x10,x12,#0x3
008ce850	mov x15,x12
008ce854	add x9,x20,x10
008ce858	add x10,x0,x10
008ce85c	ldp q0,q1,[x14, #-0x10]
008ce860	subs x15,x15,#0x4
008ce864	add x14,x14,#0x20
008ce868	stp q0,q1,[x13, #-0x10]
008ce86c	add x13,x13,#0x20
008ce870	b.ne 0x008ce85c
008ce874	cmp x11,x12
008ce878	b.ne 0x008ce888
008ce87c	b 0x008ce898
008ce880	mov x9,x20
008ce884	mov x10,x0
008ce888	ldr x11,[x9], #0x8
008ce88c	str x11,[x10], #0x8
008ce890	cmp x10,x8
008ce894	b.cc 0x008ce888
008ce898	mov x9,x26
008ce89c	mov x20,x21
008ce8a0	add x10,x20,#0x4
008ce8a4	sub w11,w20,w22
008ce8a8	mov x26,x8
008ce8ac	cmp x10,x25
008ce8b0	add x12,x22,#0x4
008ce8b4	strh w11,[x26], #0x2
008ce8b8	b.cs 0x008ceab0
008ce8bc	ldr x11,[x12]
008ce8c0	ldr x12,[x10]
008ce8c4	cmp x11,x12
008ce8c8	b.ne 0x008ce970
008ce8cc	add x11,x20,#0xc
008ce8d0	add x12,x22,#0xc
008ce8d4	cmp x11,x25
008ce8d8	b.cs 0x008ce8fc
008ce8dc	ldr x13,[x12]
008ce8e0	ldr x14,[x11]
008ce8e4	cmp x13,x14
008ce8e8	b.ne 0x008ce990
008ce8ec	add x11,x11,#0x8
008ce8f0	add x12,x12,#0x8
008ce8f4	cmp x11,x25
008ce8f8	b.cc 0x008ce8dc
008ce8fc	ldr x13,[sp, #0x38]
008ce900	cmp x11,x13
008ce904	b.cs 0x008ce924
008ce908	ldr w13,[x12]
008ce90c	ldr w14,[x11]
008ce910	cmp w13,w14
008ce914	add x13,x11,#0x4
008ce918	add x14,x12,#0x4
008ce91c	csel x12,x12,x14,ne
008ce920	csel x11,x11,x13,ne
008ce924	ldr x13,[sp, #0x30]
008ce928	cmp x11,x13
008ce92c	b.cs 0x008ce94c
008ce930	ldrh w13,[x12]
008ce934	ldrh w14,[x11]
008ce938	cmp w13,w14
008ce93c	add x13,x11,#0x2
008ce940	add x14,x12,#0x2
008ce944	csel x12,x12,x14,ne
008ce948	csel x11,x11,x13,ne
008ce94c	ldur x13,[x29, #-0x30]
008ce950	cmp x11,x13
008ce954	b.cs 0x008ce9a0
008ce958	mov x13,x11
008ce95c	ldrb w12,[x12]
008ce960	ldrb w14,[x13], #0x1
008ce964	cmp w12,w14
008ce968	csel x11,x11,x13,ne
008ce96c	b 0x008ce9a0
008ce970	eor x8,x12,x11
008ce974	rbit x8,x8
008ce978	clz x8,x8
008ce97c	lsr w10,w8,#0x3
008ce980	mov w8,w10
008ce984	add x8,x20,x8
008ce988	add x20,x8,#0x4
008ce98c	b 0x008cea34
008ce990	eor x12,x14,x13
008ce994	rbit x12,x12
008ce998	clz x12,x12
008ce99c	add x11,x11,x12, LSR #0x3
008ce9a0	sub x10,x11,x10
008ce9a4	add x12,x20,w10, UXTW 
008ce9a8	subs w11,w10,#0xf
008ce9ac	add x20,x12,#0x4
008ce9b0	b.cc 0x008cea34
008ce9b4	ldrb w12,[x9]
008ce9b8	cmp w11,#0x3fc
008ce9bc	add w12,w12,#0xf
008ce9c0	strb w12,[x9]
008ce9c4	mov w9,#0xffffffff
008ce9c8	str w9,[x26]
008ce9cc	b.cc 0x008cea0c
008ce9d0	mov w9,#0x8081
008ce9d4	sub w21,w10,#0x40b
008ce9d8	add x22,x8,#0x6
008ce9dc	movk w9,#0x8080, LSL #16
008ce9e0	mov x0,x22
008ce9e4	mov w1,#0xff
008ce9e8	umull x9,w21,w9
008ce9ec	lsr x26,x9,#0x29
008ce9f0	lsl w23,w26,#0x2
008ce9f4	add x2,x23,#0x4
008ce9f8	bl 0x00c301c0
008ce9fc	mov w8,#0x3fc
008cea00	msub w11,w26,w8,w21
008cea04	add x26,x22,x23
008cea08	mov w23,#0xffff
008cea0c	and w8,w11,#0xffff
008cea10	mov w9,#0x8081
008cea14	mul w8,w8,w9
008cea18	lsr w8,w8,#0x17
008cea1c	add x26,x26,x8
008cea20	add w8,w11,w8
008cea24	strb w8,[x26], #0x1
008cea28	cmp x20,x27
008cea2c	b.cc 0x008cea48
008cea30	b 0x008cef74
008cea34	ldrb w8,[x9]
008cea38	add w8,w8,w10
008cea3c	strb w8,[x9]
008cea40	cmp x20,x27
008cea44	b.cs 0x008cef74
008cea48	mov x8,x20
008cea4c	ldr x10,[x20]
008cea50	ldr x9,[x8, #-0x2]!
008cea54	mul x10,x10,x19
008cea58	sub w8,w8,w28
008cea5c	mul x9,x9,x19
008cea60	lsr x10,x10,#0x32
008cea64	lsr x9,x9,#0x32
008cea68	and x9,x9,#0x3ffc
008cea6c	str w8,[x24, x9#0x0]
008cea70	and x9,x10,#0x3ffc
008cea74	sub w10,w20,w28
008cea78	ldr w8,[x24, x9#0x0]
008cea7c	str w10,[x24, x9#0x0]
008cea80	add w11,w8,w23
008cea84	cmp w11,w10
008cea88	b.cc 0x008ce6f0
008cea8c	add x22,x28,x8
008cea90	ldr w9,[x20]
008cea94	ldr w8,[x22]
008cea98	cmp w8,w9
008cea9c	b.ne 0x008ce6f0
008ceaa0	mov x8,x26
008ceaa4	mov x9,x26
008ceaa8	strb wzr,[x8], #0x1
008ceaac	b 0x008ce8a0
008ceab0	mov x11,x10
008ceab4	cmp x11,x25
008ceab8	b.cc 0x008ce8dc
008ceabc	b 0x008ce8fc
008ceac0	ldr x8,[sp, #0x8]
008ceac4	sub x11,x21,#0x1
008ceac8	mov x9,x11
008ceacc	add x10,x8,x12
008cead0	ldur x8,[x29, #-0x8]
008cead4	mov x22,x10
008cead8	mov x21,x9
008ceadc	cmp x10,x8
008ceae0	mov x8,x11
008ceae4	b.ls 0x008ce790
008ceae8	cmp x21,x20
008ceaec	b.ls 0x008ce790
008ceaf0	mov x9,x21
008ceaf4	mov x10,x22
008ceaf8	ldrb w11,[x9, #-0x1]!
008ceafc	ldrb w12,[x10, #-0x1]!
008ceb00	cmp w11,w12
008ceb04	sub x11,x8,#0x1
008ceb08	b.eq 0x008cead0
008ceb0c	b 0x008ce790
008ceb10	add x9,x8,#0x6
008ceb14	ldur w16,[x29, #-0x18]
008ceb18	ldur w0,[x29, #-0x28]
008ceb1c	cmp x9,x3
008ceb20	add x21,x8,#0x5
008ceb24	b.hi 0x008cefe8
008ceb28	ldr x11,[x21]
008ceb2c	mov w8,w16
008ceb30	mov w10,w0
008ceb34	b 0x008ceb50
008ceb38	add x9,x13,w8, UXTW 
008ceb3c	lsr w8,w10,#0x6
008ceb40	add w10,w10,#0x1
008ceb44	mov x21,x13
008ceb48	cmp x9,x3
008ceb4c	b.hi 0x008cefe8
008ceb50	mul x11,x11,x26
008ceb54	mov x13,x9
008ceb58	sub w9,w21,w20
008ceb5c	lsr x11,x11,#0x32
008ceb60	and x14,x11,#0x3ffc
008ceb64	ldr x11,[x13]
008ceb68	ldr w12,[x24, x14#0x0]
008ceb6c	str w9,[x24, x14#0x0]
008ceb70	add w15,w12,w1
008ceb74	cmp w15,w9
008ceb78	b.cc 0x008ceb38
008ceb7c	ldr w9,[x20, x12#0x0]
008ceb80	ldr w14,[x21]
008ceb84	cmp w9,w14
008ceb88	b.ne 0x008ceb38
008ceb8c	ldur x8,[x29, #-0x8]
008ceb90	add x22,x20,x12
008ceb94	cmp x22,x8
008ceb98	b.ls 0x008cebac
008ceb9c	ldurb w8,[x21, #-0x1]
008ceba0	ldurb w9,[x22, #-0x1]
008ceba4	cmp w8,w9
008ceba8	b.eq 0x008cef24
008cebac	mov x8,x21
008cebb0	sub x9,x8,x27
008cebb4	add x0,x23,#0x1
008cebb8	mov w25,w9
008cebbc	umull x10,w25,w2
008cebc0	add x11,x0,x25
008cebc4	add x10,x11,x10, LSR #0x27
008cebc8	add x10,x10,#0x8
008cebcc	cmp x10,x28
008cebd0	b.hi 0x008cf184
008cebd4	subs w10,w9,#0xf
008cebd8	b.cc 0x008cec44
008cebdc	cmp w10,#0xff
008cebe0	mov w9,#0xf0
008cebe4	strb w9,[x23]
008cebe8	b.cc 0x008cec3c
008cebec	sub w8,w8,w27
008cebf0	mov w1,#0xff
008cebf4	str x3,[sp, #0x20]
008cebf8	sub w8,w8,#0x10e
008cebfc	str w8,[sp, #0x18]
008cec00	umull x8,w8,w2
008cec04	lsr x8,x8,#0x27
008cec08	add x2,x8,#0x1
008cec0c	str x8,[sp, #0x10]
008cec10	bl 0x00c301c0
008cec14	ldr x9,[sp, #0x10]
008cec18	ldr w10,[sp, #0x18]
008cec1c	mov w2,#0x8081
008cec20	ldr x3,[sp, #0x20]
008cec24	movk w2,#0x8080, LSL #16
008cec28	mov w1,#0xffff
008cec2c	sub w8,w9,w9, LSL #0x8
008cec30	add x9,x23,x9
008cec34	add x0,x9,#0x2
008cec38	add w10,w10,w8
008cec3c	strb w10,[x0], #0x1
008cec40	b 0x008cec4c
008cec44	lsl w8,w9,#0x4
008cec48	strb w8,[x23]
008cec4c	cmp x25,#0x8
008cec50	mov w8,#0x8
008cec54	csel x9,x25,x8,hi
008cec58	cmp x25,#0x19
008cec5c	add x8,x0,x25
008cec60	b.cc 0x008cecbc
008cec64	sub x10,x0,x27
008cec68	cmp x10,#0x20
008cec6c	b.cc 0x008cecbc
008cec70	sub x9,x9,#0x1
008cec74	add x13,x0,#0x10
008cec78	add x14,x27,#0x10
008cec7c	lsr x9,x9,#0x3
008cec80	add x11,x9,#0x1
008cec84	and x12,x11,#0x3ffffffffffffffc
008cec88	lsl x10,x12,#0x3
008cec8c	mov x15,x12
008cec90	add x9,x27,x10
008cec94	add x10,x0,x10
008cec98	ldp q0,q1,[x14, #-0x10]
008cec9c	subs x15,x15,#0x4
008ceca0	add x14,x14,#0x20
008ceca4	stp q0,q1,[x13, #-0x10]
008ceca8	add x13,x13,#0x20
008cecac	b.ne 0x008cec98
008cecb0	cmp x11,x12
008cecb4	b.ne 0x008cecc4
008cecb8	b 0x008cecd4
008cecbc	mov x9,x27
008cecc0	mov x10,x0
008cecc4	ldr x11,[x9], #0x8
008cecc8	str x11,[x10], #0x8
008ceccc	cmp x10,x8
008cecd0	b.cc 0x008cecc4
008cecd4	mov x9,x23
008cecd8	mov x27,x21
008cecdc	add x10,x27,#0x4
008cece0	sub w11,w27,w22
008cece4	mov x23,x8
008cece8	cmp x10,x19
008cecec	add x12,x22,#0x4
008cecf0	strh w11,[x23], #0x2
008cecf4	b.cs 0x008cef14
008cecf8	ldr x11,[x12]
008cecfc	ldr x12,[x10]
008ced00	cmp x11,x12
008ced04	b.ne 0x008cedbc
008ced08	add x11,x27,#0xc
008ced0c	add x12,x22,#0xc
008ced10	cmp x11,x19
008ced14	b.cs 0x008ced44
008ced18	sub w13,w11,w27
008ced1c	sub w13,w13,#0x4
008ced20	ldr x14,[x12]
008ced24	ldr x15,[x11]
008ced28	cmp x14,x15
008ced2c	b.ne 0x008cedd0
008ced30	add x11,x11,#0x8
008ced34	add x12,x12,#0x8
008ced38	add w13,w13,#0x8
008ced3c	cmp x11,x19
008ced40	b.cc 0x008ced20
008ced44	ldr x13,[sp, #0x30]
008ced48	cmp x11,x13
008ced4c	b.cs 0x008ced6c
008ced50	ldr w13,[x12]
008ced54	ldr w14,[x11]
008ced58	cmp w13,w14
008ced5c	add x13,x11,#0x4
008ced60	add x14,x12,#0x4
008ced64	csel x12,x12,x14,ne
008ced68	csel x11,x11,x13,ne
008ced6c	ldr x13,[sp, #0x28]
008ced70	cmp x11,x13
008ced74	b.cs 0x008ced94
008ced78	ldrh w13,[x12]
008ced7c	ldrh w14,[x11]
008ced80	cmp w13,w14
008ced84	add x13,x11,#0x2
008ced88	add x14,x12,#0x2
008ced8c	csel x12,x12,x14,ne
008ced90	csel x11,x11,x13,ne
008ced94	ldr x13,[sp, #0x38]
008ced98	cmp x11,x13
008ced9c	b.cs 0x008cedb4
008ceda0	mov x13,x11
008ceda4	ldrb w12,[x12]
008ceda8	ldrb w14,[x13], #0x1
008cedac	cmp w12,w14
008cedb0	csel x11,x11,x13,ne
008cedb4	sub w21,w11,w10
008cedb8	b 0x008cede4
008cedbc	eor x10,x12,x11
008cedc0	rbit x10,x10
008cedc4	clz x10,x10
008cedc8	lsr w21,w10,#0x3
008cedcc	b 0x008cede4
008cedd0	eor x10,x15,x14
008cedd4	rbit x10,x10
008cedd8	clz x10,x10
008ceddc	lsr x10,x10,#0x3
008cede0	add w21,w10,w13
008cede4	add w10,w21,#0xf0
008cede8	umull x10,w10,w2
008cedec	add x10,x8,x10, LSR #0x27
008cedf0	add x10,x10,#0x8
008cedf4	cmp x10,x28
008cedf8	b.hi 0x008cf184
008cedfc	ldrb w11,[x9]
008cee00	subs w10,w21,#0xf
008cee04	b.cc 0x008cee94
008cee08	add w11,w11,#0xf
008cee0c	cmp w10,#0x3fc
008cee10	strb w11,[x9]
008cee14	mov w9,#0xffffffff
008cee18	str w9,[x23]
008cee1c	b.cc 0x008cee74
008cee20	sub w23,w21,#0x40b
008cee24	add x22,x8,#0x6
008cee28	mov w1,#0xff
008cee2c	umull x9,w23,w2
008cee30	mov x0,x22
008cee34	mov x28,x3
008cee38	lsr x25,x9,#0x29
008cee3c	lsl w26,w25,#0x2
008cee40	add x2,x26,#0x4
008cee44	bl 0x00c301c0
008cee48	mov w8,#0x3fc
008cee4c	mov x3,x28
008cee50	mov w2,#0x8081
008cee54	msub w10,w25,w8,w23
008cee58	add x23,x22,x26
008cee5c	mov x26,#0xbb000000
008cee60	movk x26,#0xbcdc, LSL #32
008cee64	ldur x28,[x29, #-0x10]
008cee68	movk w2,#0x8080, LSL #16
008cee6c	mov w1,#0xffff
008cee70	movk x26,#0xcf1b, LSL #48
008cee74	and w8,w10,#0xffff
008cee78	mov w9,#0x8081
008cee7c	mul w8,w8,w9
008cee80	lsr w8,w8,#0x17
008cee84	add x23,x23,x8
008cee88	add w8,w10,w8
008cee8c	strb w8,[x23], #0x1
008cee90	b 0x008cee9c
008cee94	add w8,w11,w21
008cee98	strb w8,[x9]
008cee9c	add x8,x27,w21, UXTW 
008ceea0	add x27,x8,#0x4
008ceea4	cmp x27,x3
008ceea8	b.cs 0x008cefe8
008ceeac	mov x9,x8
008ceeb0	ldr x10,[x9, #0x2]!
008ceeb4	ldur x11,[x9, #0x2]
008ceeb8	sub w9,w9,w20
008ceebc	mul x10,x10,x26
008ceec0	mul x11,x11,x26
008ceec4	lsr x10,x10,#0x32
008ceec8	lsr x11,x11,#0x32
008ceecc	and x10,x10,#0x3ffc
008ceed0	str w9,[x24, x10#0x0]
008ceed4	and x10,x11,#0x3ffc
008ceed8	sub w11,w27,w20
008ceedc	ldr w9,[x24, x10#0x0]
008ceee0	str w11,[x24, x10#0x0]
008ceee4	add w12,w9,w1
008ceee8	cmp w12,w11
008ceeec	b.cc 0x008ceb10
008ceef0	add x22,x20,x9
008ceef4	ldr w10,[x27]
008ceef8	ldr w9,[x22]
008ceefc	cmp w9,w10
008cef00	b.ne 0x008ceb10
008cef04	mov x8,x23
008cef08	mov x9,x23
008cef0c	strb wzr,[x8], #0x1
008cef10	b 0x008cecdc
008cef14	mov x11,x10
008cef18	cmp x11,x19
008cef1c	b.cc 0x008ced18
008cef20	b 0x008ced44
008cef24	ldr x8,[sp]
008cef28	sub x11,x21,#0x1
008cef2c	mov x9,x11
008cef30	add x10,x8,x12
008cef34	ldur x8,[x29, #-0x8]
008cef38	mov x22,x10
008cef3c	mov x21,x9
008cef40	cmp x10,x8
008cef44	mov x8,x11
008cef48	b.ls 0x008cebb0
008cef4c	cmp x21,x27
008cef50	b.ls 0x008cebb0
008cef54	mov x9,x21
008cef58	mov x10,x22
008cef5c	ldrb w11,[x9, #-0x1]!
008cef60	ldrb w12,[x10, #-0x1]!
008cef64	cmp w11,w12
008cef68	sub x11,x8,#0x1
008cef6c	b.eq 0x008cef34
008cef70	b 0x008cebb0
008cef74	ldur x8,[x29, #-0x28]
008cef78	sub x22,x8,x20
008cef7c	subs x8,x22,#0xf
008cef80	b.cc 0x008cf07c
008cef84	ldur x23,[x29, #-0x20]
008cef88	mov w9,#0xf0
008cef8c	mov x0,x26
008cef90	cmp x8,#0xff
008cef94	strb w9,[x0], #0x1
008cef98	b.cc 0x008cefdc
008cef9c	ldur x8,[x29, #-0x8]
008cefa0	ldr x9,[sp, #0x10]
008cefa4	mov w1,#0xff
008cefa8	add x8,x8,x9
008cefac	sub x8,x8,x20
008cefb0	sub x19,x8,#0x10e
008cefb4	orr x8,xzr,#-0x7f7f7f7f7f7f7f80
008cefb8	movk x8,#0x8081
008cefbc	umulh x8,x19,x8
008cefc0	lsr x21,x8,#0x7
008cefc4	add x2,x21,#0x1
008cefc8	bl 0x00c301c0
008cefcc	sub x8,x21,x21, LSL #0x8
008cefd0	add x9,x26,x21
008cefd4	add x0,x9,#0x2
008cefd8	add x8,x8,x19
008cefdc	strb w8,[x0]
008cefe0	mov x26,x0
008cefe4	b 0x008cf088
008cefe8	ldur x8,[x29, #-0x30]
008cefec	orr x9,xzr,#-0x7f7f7f7f7f7f7f80
008ceff0	movk x9,#0x8081
008ceff4	sub x22,x8,x27
008ceff8	add x8,x22,#0xf0
008ceffc	umulh x8,x8,x9
008cf000	add x9,x23,x22
008cf004	add x8,x9,x8, LSR #0x7
008cf008	add x8,x8,#0x1
008cf00c	cmp x8,x28
008cf010	b.hi 0x008cf184
008cf014	subs x8,x22,#0xf
008cf018	b.cc 0x008cf210
008cf01c	mov w9,#0xf0
008cf020	mov x0,x23
008cf024	cmp x8,#0xff
008cf028	strb w9,[x0], #0x1
008cf02c	b.cc 0x008cf070
008cf030	ldur x8,[x29, #-0x8]
008cf034	ldr x9,[sp, #0x8]
008cf038	mov w1,#0xff
008cf03c	add x8,x8,x9
008cf040	sub x8,x8,x27
008cf044	sub x19,x8,#0x10e
008cf048	orr x8,xzr,#-0x7f7f7f7f7f7f7f80
008cf04c	movk x8,#0x8081
008cf050	umulh x8,x19,x8
008cf054	lsr x20,x8,#0x7
008cf058	add x2,x20,#0x1
008cf05c	bl 0x00c301c0
008cf060	sub x8,x20,x20, LSL #0x8
008cf064	add x9,x23,x20
008cf068	add x0,x9,#0x2
008cf06c	add x8,x8,x19
008cf070	strb w8,[x0]
008cf074	mov x23,x0
008cf078	b 0x008cf218
008cf07c	lsl w8,w22,#0x4
008cf080	ldur x23,[x29, #-0x20]
008cf084	strb w8,[x26]
008cf088	add x19,x26,#0x1
008cf08c	mov x1,x20
008cf090	mov x2,x22
008cf094	mov x0,x19
008cf098	bl 0x00c2ffd0
008cf09c	add w8,w19,w22
008cf0a0	sub w0,w8,w23
008cf0a4	b 0x008cf188
008cf0a8	cmp w19,#0x1
008cf0ac	b.lt 0x008cf184
008cf0b0	strb wzr,[x27]
008cf0b4	mov w0,#0x1
008cf0b8	b 0x008cf188
008cf0bc	ldur x27,[x29, #-0x20]
008cf0c0	mov x26,x9
008cf0c4	mov x25,x21
008cf0c8	ldp x13,x20,[x29, #-0x10]
008cf0cc	ldur x10,[x29, #-0x18]
008cf0d0	sub x22,x10,x25
008cf0d4	subs x8,x22,#0xf
008cf0d8	b.cc 0x008cf134
008cf0dc	mov w9,#0xf0
008cf0e0	mov x0,x26
008cf0e4	cmp x8,#0xff
008cf0e8	strb w9,[x0], #0x1
008cf0ec	b.cc 0x008cf128
008cf0f0	add x8,x20,x13
008cf0f4	mov w1,#0xff
008cf0f8	sub x8,x8,x25
008cf0fc	sub x19,x8,#0x10e
008cf100	orr x8,xzr,#-0x7f7f7f7f7f7f7f80
008cf104	movk x8,#0x8081
008cf108	umulh x8,x19,x8
008cf10c	lsr x20,x8,#0x7
008cf110	add x2,x20,#0x1
008cf114	bl 0x00c301c0
008cf118	sub x8,x20,x20, LSL #0x8
008cf11c	add x9,x26,x20
008cf120	add x0,x9,#0x2
008cf124	add x8,x8,x19
008cf128	strb w8,[x0]
008cf12c	mov x26,x0
008cf130	b 0x008cf13c
008cf134	lsl w8,w22,#0x4
008cf138	strb w8,[x26]
008cf13c	add x20,x26,#0x1
008cf140	mov x1,x25
008cf144	b 0x008cf248
008cf148	mov x25,x9
008cf14c	mov x1,x21
008cf150	ldp x13,x27,[x29, #-0x28]
008cf154	ldur x20,[x29, #-0x8]
008cf158	ldur x10,[x29, #-0x18]
008cf15c	sub x22,x10,x1
008cf160	orr x9,xzr,#-0x7f7f7f7f7f7f7f80
008cf164	add x8,x22,#0xf0
008cf168	movk x9,#0x8081
008cf16c	umulh x8,x8,x9
008cf170	add x9,x25,x22
008cf174	add x8,x9,x8, LSR #0x7
008cf178	add x8,x8,#0x1
008cf17c	cmp x8,x19
008cf180	b.ls 0x008cf1a8
008cf184	mov w0,wzr
008cf188	ldp x20,x19,[sp, #0xc0]
008cf18c	ldp x22,x21,[sp, #0xb0]
008cf190	ldp x24,x23,[sp, #0xa0]
008cf194	ldp x26,x25,[sp, #0x90]
008cf198	ldp x28,x27,[sp, #0x80]
008cf19c	ldp x29,x30,[sp, #0x70]
008cf1a0	add sp,sp,#0xd0
008cf1a4	ret
008cf1a8	subs x8,x22,#0xf
008cf1ac	b.cc 0x008cf23c
008cf1b0	mov w9,#0xf0
008cf1b4	mov x0,x25
008cf1b8	cmp x8,#0xff
008cf1bc	strb w9,[x0], #0x1
008cf1c0	b.cc 0x008cf204
008cf1c4	add x8,x20,x13
008cf1c8	mov x21,x1
008cf1cc	sub x8,x8,x1
008cf1d0	mov w1,#0xff
008cf1d4	sub x19,x8,#0x10e
008cf1d8	orr x8,xzr,#-0x7f7f7f7f7f7f7f80
008cf1dc	movk x8,#0x8081
008cf1e0	umulh x8,x19,x8
008cf1e4	lsr x20,x8,#0x7
008cf1e8	add x2,x20,#0x1
008cf1ec	bl 0x00c301c0
008cf1f0	sub x8,x20,x20, LSL #0x8
008cf1f4	add x9,x25,x20
008cf1f8	mov x1,x21
008cf1fc	add x0,x9,#0x2
008cf200	add x8,x8,x19
008cf204	strb w8,[x0]
008cf208	mov x25,x0
008cf20c	b 0x008cf244
008cf210	lsl w8,w22,#0x4
008cf214	strb w8,[x23]
008cf218	add x20,x23,#0x1
008cf21c	mov x1,x27
008cf220	mov x2,x22
008cf224	mov x0,x20
008cf228	bl 0x00c2ffd0
008cf22c	ldur x9,[x29, #-0x20]
008cf230	add w8,w20,w22
008cf234	sub w0,w8,w9
008cf238	b 0x008cf188
008cf23c	lsl w8,w22,#0x4
008cf240	strb w8,[x25]
008cf244	add x20,x25,#0x1
008cf248	mov x0,x20
008cf24c	mov x2,x22
008cf250	bl 0x00c2ffd0
008cf254	add w8,w20,w22
008cf258	sub w0,w8,w27
008cf25c	b 0x008cf188
