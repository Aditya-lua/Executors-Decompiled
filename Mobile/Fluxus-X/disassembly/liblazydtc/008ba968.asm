; FUN_008ba968 @ 008ba968
008ba968	sub sp,sp,#0xa0
008ba96c	stp x29,x30,[sp, #0x40]
008ba970	stp x28,x27,[sp, #0x50]
008ba974	stp x26,x25,[sp, #0x60]
008ba978	stp x24,x23,[sp, #0x70]
008ba97c	stp x22,x21,[sp, #0x80]
008ba980	stp x20,x19,[sp, #0x90]
008ba984	add x29,sp,#0x40
008ba988	mrs x21,tpidr_el0
008ba98c	mov w9,#0x4000000
008ba990	mov x19,x0
008ba994	ldr x8,[x21, #0x28]
008ba998	cmp w2,w9
008ba99c	stur x8,[x29, #-0x8]
008ba9a0	b.gt 0x008bad70
008ba9a4	mov w8,#0x1
008ba9a8	movk w8,#0x400, LSL #16
008ba9ac	cmp w3,w8
008ba9b0	b.ge 0x008bad70
008ba9b4	mov w22,w2
008ba9b8	mov x20,x1
008ba9bc	str x21,[sp, #0x20]
008ba9c0	cbz w3,0x008ba9e4
008ba9c4	sub w0,w3,#0x1
008ba9c8	bl 0x008b91dc
008ba9cc	cmp w0,#0x1a
008ba9d0	b.ge 0x008bad70
008ba9d4	add w21,w0,#0x1
008ba9d8	mov w8,#0x1
008ba9dc	lsl w26,w8,w21
008ba9e0	b 0x008ba9ec
008ba9e4	mov w21,wzr
008ba9e8	mov w26,wzr
008ba9ec	ldp x23,x28,[x20, #0x20]
008ba9f0	ldrsw x27,[x20, #0x8]
008ba9f4	ldrb w8,[x20, #0x5]
008ba9f8	cmp w22,w27
008ba9fc	mov x24,x23
008baa00	str x8,[sp, #0x10]
008baa04	b.eq 0x008baabc
008baa08	tbnz w22,#0x1f,0x008badf4
008baa0c	ubfiz x25,x22,#0x4,#0x20
008baa10	ldrb w2,[x20, #0x1]
008baa14	mov x0,x19
008baa18	mov x1,x25
008baa1c	bl 0x008b7610
008baa20	cmp w22,w27
008baa24	mov x24,x0
008baa28	b.ge 0x008baa44
008baa2c	cbz w22,0x008baabc
008baa30	mov x0,x24
008baa34	mov x1,x23
008baa38	mov x2,x25
008baa3c	bl 0x00c2ffd0
008baa40	b 0x008baabc
008baa44	cbz w27,0x008baa58
008baa48	lsl x2,x27,#0x4
008baa4c	mov x0,x24
008baa50	mov x1,x23
008baa54	bl 0x00c2ffd0
008baa58	cmp w27,w22
008baa5c	b.ge 0x008baabc
008baa60	mov w8,w22
008baa64	mov x10,x27
008baa68	sub x9,x8,x27
008baa6c	cmp x9,#0x2
008baa70	b.cc 0x008baaa0
008baa74	add x12,x24,x27, LSL #0x4
008baa78	and x11,x9,#-0x2
008baa7c	add x10,x11,x27
008baa80	mov x13,x11
008baa84	add x12,x12,#0x1c
008baa88	subs x13,x13,#0x2
008baa8c	stur wzr,[x12, #-0x10]
008baa90	str wzr,[x12], #0x20
008baa94	b.ne 0x008baa88
008baa98	cmp x9,x11
008baa9c	b.eq 0x008baabc
008baaa0	mov w9,#0xc
008baaa4	sub x8,x8,x10
008baaa8	orr x9,x9,x10, LSL #0x4
008baaac	subs x8,x8,#0x1
008baab0	str wzr,[x24, x9#0x0]
008baab4	add x9,x9,#0x10
008baab8	b.ne 0x008baaac
008baabc	adrp x8,0xd1f000
008baac0	add x8,x8,#0xc90
008baac4	adrp x25,0xd1f000
008baac8	ldarb w8,[x8]
008baacc	str x28,[sp, #0x18]
008baad0	tbz w8,#0x0,0x008bad90
008baad4	mov w9,#0x3700
008baad8	str x23,[sp, #0x8]
008baadc	movk w9,#0x7f, LSL #16
008baae0	cbz w26,0x008bab34
008baae4	ubfiz x1,x26,#0x5,#0x20
008baae8	ldrb w2,[x20, #0x1]
008baaec	mov x0,x19
008baaf0	cmp x23,x24
008baaf4	b.eq 0x008bab44
008baaf8	bl 0x008b777c
008baafc	cbnz x0,0x008bab48
008bab00	ldr x8,[sp, #0x20]
008bab04	ldrb w3,[x20, #0x1]
008bab08	ldr x8,[x8, #0x28]
008bab0c	ldur x9,[x29, #-0x8]
008bab10	cmp x8,x9
008bab14	b.ne 0x008bae40
008bab18	sbfiz x2,x22,#0x4,#0x20
008bab1c	mov x0,x19
008bab20	mov x1,x24
008bab24	bl 0x008b7a9c
008bab28	mov x0,x19
008bab2c	mov w1,#0x4
008bab30	bl 0x008b3f9c
008bab34	ldr x8,[x25, #0xc88]
008bab38	mov x23,x25
008bab3c	add x0,x8,x9
008bab40	b 0x008babac
008bab44	bl 0x008b7610
008bab48	cmp w26,#0x1
008bab4c	mov w8,w26
008bab50	b.ne 0x008bab5c
008bab54	mov x9,xzr
008bab58	b 0x008bab88
008bab5c	and x9,x8,#0x7ffffffe
008bab60	add x10,x0,#0x2c
008bab64	mov x11,x9
008bab68	subs x11,x11,#0x2
008bab6c	stur wzr,[x10, #-0x10]
008bab70	str wzr,[x10, #0x10]
008bab74	stur wzr,[x10, #-0x20]
008bab78	str wzr,[x10], #0x40
008bab7c	b.ne 0x008bab68
008bab80	cmp x9,x8
008bab84	b.eq 0x008baba8
008bab88	add x10,x0,x9, LSL #0x5
008bab8c	sub x8,x8,x9
008bab90	add x10,x10,#0x1c
008bab94	str wzr,[x10]
008bab98	subs x8,x8,#0x1
008bab9c	stur wzr,[x10, #-0x10]
008baba0	add x10,x10,#0x20
008baba4	b.ne 0x008bab94
008baba8	mov x23,x25
008babac	mov w8,#0xffffffff
008babb0	strb w21,[x20, #0x5]
008babb4	cmp w22,w27
008babb8	lsl w8,w8,w21
008babbc	mov w21,#0x1
008babc0	stp x24,x0,[x20, #0x20]
008babc4	stp w22,w26,[x20, #0x8]
008babc8	mvn w8,w8
008babcc	strb w8,[x20, #0x4]
008babd0	b.ge 0x008bac44
008babd4	ldr x9,[sp, #0x8]
008babd8	mov w8,w22
008babdc	add w26,w22,#0x1
008babe0	sxtw x8,w8
008babe4	mov w25,#0x3
008babe8	add x24,x9,w22, SXTW  #0x4
008babec	b 0x008bac30
008babf0	scvtf d0,w26
008babf4	sub x2,x29,#0x18
008babf8	mov x0,x19
008babfc	mov x1,x20
008bac00	mov w3,wzr
008bac04	add x28,x8,#0x1
008bac08	stur w25,[x29, #-0xc]
008bac0c	stur d0,[x29, #-0x18]
008bac10	bl 0x008bd898
008bac14	ldr q0,[x24]
008bac18	mov x8,x28
008bac1c	str q0,[x0]
008bac20	cmp w28,w27
008bac24	add x24,x24,#0x10
008bac28	add w26,w26,#0x1
008bac2c	b.eq 0x008bac44
008bac30	ldr w9,[x24, #0xc]
008bac34	cbnz w9,0x008babf0
008bac38	add x8,x8,#0x1
008bac3c	mov w28,w26
008bac40	b 0x008bac20
008bac44	ldp x8,x28,[sp, #0x10]
008bac48	lsl w21,w21,w8
008bac4c	cmp w8,#0x1f
008bac50	b.ne 0x008bacdc
008bac54	cmp w22,w27
008bac58	b.eq 0x008bac70
008bac5c	lsl x2,x27,#0x4
008bac60	ldrb w3,[x20, #0x1]
008bac64	ldr x1,[sp, #0x8]
008bac68	mov x0,x19
008bac6c	bl 0x008b7a9c
008bac70	adrp x8,0xd1f000
008bac74	add x8,x8,#0xc90
008bac78	ldarb w8,[x8]
008bac7c	tbz w8,#0x0,0x008badc0
008bac80	ldr x8,[x23, #0xc88]
008bac84	mov w9,#0x3700
008bac88	movk w9,#0x7f, LSL #16
008bac8c	add x8,x8,x9
008bac90	cmp x28,x8
008bac94	ldr x8,[sp, #0x20]
008bac98	b.eq 0x008bad40
008bac9c	ldrb w3,[x20, #0x1]
008baca0	ldr x8,[x8, #0x28]
008baca4	ldur x9,[x29, #-0x8]
008baca8	cmp x8,x9
008bacac	b.ne 0x008bae40
008bacb0	sbfiz x2,x21,#0x5,#0x20
008bacb4	mov x0,x19
008bacb8	mov x1,x28
008bacbc	ldp x20,x19,[sp, #0x90]
008bacc0	ldp x22,x21,[sp, #0x80]
008bacc4	ldp x24,x23,[sp, #0x70]
008bacc8	ldp x26,x25,[sp, #0x60]
008baccc	ldp x28,x27,[sp, #0x50]
008bacd0	ldp x29,x30,[sp, #0x40]
008bacd4	add sp,sp,#0xa0
008bacd8	b 0x008b7a9c
008bacdc	sub w8,w21,#0x1
008bace0	add w24,w21,#0x1
008bace4	add x8,x28,x8, LSL #0x5
008bace8	add x25,x8,#0x10
008bacec	b 0x008bad00
008bacf0	sub w24,w24,#0x1
008bacf4	sub x25,x25,#0x20
008bacf8	cmp w24,#0x1
008bacfc	b.le 0x008bac54
008bad00	ldur w8,[x25, #-0x4]
008bad04	cbz w8,0x008bacf0
008bad08	ldp w9,w10,[x25, #0x8]
008bad0c	ldr x8,[x25]
008bad10	sub x2,x29,#0x18
008bad14	mov x0,x19
008bad18	mov x1,x20
008bad1c	mov w3,#0x1
008bad20	sub x26,x25,#0x10
008bad24	stur x8,[x29, #-0x18]
008bad28	and w8,w10,#0xf
008bad2c	stp w9,w8,[x29, #-0x10]
008bad30	bl 0x008bd898
008bad34	ldr q0,[x26]
008bad38	str q0,[x0]
008bad3c	b 0x008bacf0
008bad40	ldr x8,[x8, #0x28]
008bad44	ldur x9,[x29, #-0x8]
008bad48	cmp x8,x9
008bad4c	b.ne 0x008bae40
008bad50	ldp x20,x19,[sp, #0x90]
008bad54	ldp x22,x21,[sp, #0x80]
008bad58	ldp x24,x23,[sp, #0x70]
008bad5c	ldp x26,x25,[sp, #0x60]
008bad60	ldp x28,x27,[sp, #0x50]
008bad64	ldp x29,x30,[sp, #0x40]
008bad68	add sp,sp,#0xa0
008bad6c	ret
008bad70	ldr x8,[x21, #0x28]
008bad74	ldur x9,[x29, #-0x8]
008bad78	cmp x8,x9
008bad7c	b.ne 0x008bae40
008bad80	adrp x1,0x2d2000
008bad84	add x1,x1,#0xd52
008bad88	mov x0,x19
008bad8c	bl 0x008b39cc
008bad90	adrp x0,0xd1f000
008bad94	add x0,x0,#0xc90
008bad98	bl 0x00c2fe90
008bad9c	cbz w0,0x008baad4
008bada0	adrp x8,0xcca000
008bada4	ldr x0,[x8, #0x8c8]
008bada8	bl 0x007fe1ec
008badac	str x0,[x25, #0xc88]
008badb0	adrp x0,0xd1f000
008badb4	add x0,x0,#0xc90
008badb8	bl 0x00c2fea0
008badbc	b 0x008baad4
008badc0	adrp x0,0xd1f000
008badc4	add x0,x0,#0xc90
008badc8	bl 0x00c2fe90
008badcc	cbz w0,0x008bac80
008badd0	adrp x8,0xcca000
008badd4	ldr x0,[x8, #0x8c8]
008badd8	bl 0x007fe1ec
008baddc	str x0,[x23, #0xc88]
008bade0	adrp x0,0xd1f000
008bade4	add x0,x0,#0xc90
008bade8	bl 0x00c2fea0
008badec	ldr x28,[sp, #0x18]
008badf0	b 0x008bac80
008badf4	ldr x8,[sp, #0x20]
008badf8	ldr x8,[x8, #0x28]
008badfc	ldur x9,[x29, #-0x8]
008bae00	cmp x8,x9
008bae04	b.ne 0x008bae40
008bae08	mov x0,x19
008bae0c	bl 0x008b75fc
008bae40	bl 0x00c2fec0
