; std::__ndk1::money_get<char,std::__ndk1::istreambuf_iterator<char,std::__ndk1::char_traits<char>>>::do_get @ 00bee884
00bee884	paciasp
00bee888	sub sp,sp,#0x120
00bee88c	stp x29,x30,[sp, #0xc0]
00bee890	str x28,[sp, #0xd0]
00bee894	stp x26,x25,[sp, #0xe0]
00bee898	stp x24,x23,[sp, #0xf0]
00bee89c	stp x22,x21,[sp, #0x100]
00bee8a0	stp x20,x19,[sp, #0x110]
00bee8a4	add x29,sp,#0xc0
00bee8a8	stur x1,[x29, #-0x18]
00bee8ac	adrp x8,0xcb5000
00bee8b0	mov x21,x6
00bee8b4	ldr x8,[x8, #0xc18]
00bee8b8	mov x19,x5
00bee8bc	mov x24,x4
00bee8c0	mov w23,w3
00bee8c4	mov x20,x2
00bee8c8	add x25,sp,#0x44
00bee8cc	stp x25,x8,[sp, #0x30]
00bee8d0	add x8,sp,#0x20
00bee8d4	mov x0,x4
00bee8d8	bl 0x00c30070
00bee8dc	adrp x26,0xcb4000
00bee8e0	ldr x26,[x26, #0x998]
00bee8e4	ldr x22,[sp, #0x20]
00bee8e8	stur x26,[x29, #-0x10]
00bee8ec	ldar x8,[x26]
00bee8f0	cmn x8,#0x1
00bee8f4	b.eq 0x00bee920
00bee8f8	sub x8,x29,#0x10
00bee8fc	add x9,x29,#0x18
00bee900	str x8,[x29, #0x18]
00bee904	stur x9,[x29, #-0x8]
00bee908	adrp x0,0xcb4000
00bee90c	nop
00bee910	adr x2,0xc0bab0
00bee914	ldr x0,[x0, #0x998]
00bee918	sub x1,x29,#0x8
00bee91c	bl 0x00c305d0
00bee920	ldp x8,x10,[x22, #0x10]
00bee924	ldrsw x9,[x26, #0x8]
00bee928	sub x9,x9,#0x1
00bee92c	sub x10,x10,x8
00bee930	cmp x9,x10, ASR #0x3
00bee934	b.cs 0x00beeaf0
00bee938	ldr x22,[x8, x9, LSL #0x3]
00bee93c	cbz x22,0x00beeaf0
00bee940	ldr w4,[x24, #0x8]
00bee944	add x10,x25,#0x64
00bee948	strb wzr,[x29, #0x18]
00bee94c	add x8,sp,#0x28
00bee950	add x9,sp,#0x30
00bee954	sub x0,x29,#0x18
00bee958	and w2,w23,#0x1
00bee95c	add x3,sp,#0x20
00bee960	add x6,x29,#0x18
00bee964	mov x1,x20
00bee968	mov x5,x19
00bee96c	mov x7,x22
00bee970	stp x8,x10,[sp, #0x8]
00bee974	str x9,[sp]
00bee978	bl 0x00c44200
00bee97c	tbz w0,#0x0,0x00beea10
00bee980	ldrb w8,[x21]
00bee984	tbnz w8,#0x0,0x00bee990
00bee988	strh wzr,[x21]
00bee98c	b 0x00bee99c
00bee990	ldr x8,[x21, #0x10]
00bee994	strb wzr,[x8]
00bee998	str xzr,[x21, #0x8]
00bee99c	ldrb w8,[x29, #0x18]
00bee9a0	cmp w8,#0x1
00bee9a4	b.ne 0x00bee9c8
00bee9a8	ldr x8,[x22]
00bee9ac	ldr x8,[x8, #0x38]
00bee9b0	mov x0,x22
00bee9b4	mov w1,#0x2d
00bee9b8	blr x8
00bee9bc	mov w1,w0
00bee9c0	mov x0,x21
00bee9c4	bl 0x00c30150
00bee9c8	ldr x8,[x22]
00bee9cc	ldr x8,[x8, #0x38]
00bee9d0	mov x0,x22
00bee9d4	mov w1,#0x30
00bee9d8	blr x8
00bee9dc	ldp x2,x1,[sp, #0x28]
00bee9e0	sub x8,x2,#0x1
00bee9e4	cmp x1,x8
00bee9e8	b.cs 0x00beea08
00bee9ec	ldrb w9,[x1]
00bee9f0	cmp w9,w0, UXTB 
00bee9f4	b.ne 0x00beea08
00bee9f8	add x1,x1,#0x1
00bee9fc	cmp x1,x8
00beea00	b.ne 0x00bee9ec
00beea04	mov x1,x8
00beea08	mov x0,x21
00beea0c	bl 0x00beeb40
00beea10	ldur x0,[x29, #-0x18]
00beea14	cbz x0,0x00beea60
00beea18	ldp x8,x9,[x0, #0x18]
00beea1c	cmp x8,x9
00beea20	b.eq 0x00beea30
00beea24	mov w21,wzr
00beea28	cbnz x20,0x00beea68
00beea2c	b 0x00beea54
00beea30	ldr x8,[x0]
00beea34	ldr x8,[x8, #0x48]
00beea38	blr x8
00beea3c	cmn w0,#0x1
00beea40	b.eq 0x00beea5c
00beea44	ldur x8,[x29, #-0x18]
00beea48	cmp x8,#0x0
00beea4c	cset w21,eq
00beea50	cbnz x20,0x00beea68
00beea54	tbnz w21,#0x0,0x00beea78
00beea58	b 0x00beea84
00beea5c	stur xzr,[x29, #-0x18]
00beea60	mov w21,#0x1
00beea64	cbz x20,0x00beea54
00beea68	ldp x8,x9,[x20, #0x18]
00beea6c	cmp x8,x9
00beea70	b.eq 0x00beeacc
00beea74	tbnz w21,#0x0,0x00beea84
00beea78	ldr w8,[x19]
00beea7c	orr w8,w8,#0x2
00beea80	str w8,[x19]
00beea84	ldur x19,[x29, #-0x18]
00beea88	add x0,sp,#0x20
00beea8c	bl 0x00c30090
00beea90	ldr x0,[sp, #0x30]
00beea94	str xzr,[sp, #0x30]
00beea98	cbz x0,0x00beeaa4
00beea9c	ldr x8,[sp, #0x38]
00beeaa0	blr x8
00beeaa4	mov x0,x19
00beeaa8	ldp x20,x19,[sp, #0x110]
00beeaac	ldr x28,[sp, #0xd0]
00beeab0	ldp x22,x21,[sp, #0x100]
00beeab4	ldp x24,x23,[sp, #0xf0]
00beeab8	ldp x26,x25,[sp, #0xe0]
00beeabc	ldp x29,x30,[sp, #0xc0]
00beeac0	add sp,sp,#0x120
00beeac4	autiasp
00beeac8	ret
00beeacc	ldr x8,[x20]
00beead0	ldr x8,[x8, #0x48]
00beead4	mov x0,x20
00beead8	blr x8
00beeadc	cmn w0,#0x1
00beeae0	cset w8,eq
00beeae4	eor w8,w21,w8
00beeae8	tbz w8,#0x0,0x00beea78
00beeaec	b 0x00beea84
00beeaf0	bl 0x00bd8968
