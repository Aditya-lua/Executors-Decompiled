; FUN_00bad834 @ 00bad834
00bad834	sub sp,sp,#0x140
00bad838	stp x28,x27,[sp, #0xe0]
00bad83c	stp x26,x25,[sp, #0xf0]
00bad840	stp x24,x23,[sp, #0x100]
00bad844	stp x22,x21,[sp, #0x110]
00bad848	stp x20,x19,[sp, #0x120]
00bad84c	stp x29,x30,[sp, #0x130]
00bad850	add x29,sp,#0x130
00bad854	mrs x23,tpidr_el0
00bad858	ldr x8,[x23, #0x28]
00bad85c	adrp x9,0x788000
00bad860	adrp x10,0x788000
00bad864	mov w21,w1
00bad868	mov w20,w0
00bad86c	add x9,x9,#0x5e0
00bad870	add x10,x10,#0x640
00bad874	cmp w1,#0x0
00bad878	mov w0,#0x400
00bad87c	mov w1,#0x1
00bad880	stur x8,[x29, #-0x60]
00bad884	csel x22,x10,x9,eq
00bad888	bl 0x00c30a30
00bad88c	mov x19,x0
00bad890	cbz x0,0x00badbe4
00bad894	add x0,sp,#0x40
00bad898	mov w2,#0x6c
00bad89c	mov w1,wzr
00bad8a0	str x23,[sp, #0x20]
00bad8a4	bl 0x00c301c0
00bad8a8	mov w9,#0x9ed8
00bad8ac	mov w10,#0xe667
00bad8b0	mov w13,#0xdd17
00bad8b4	mov w14,#0xf372
00bad8b8	cmp w21,#0x0
00bad8bc	movk w9,#0xc105, LSL #16
00bad8c0	movk w10,#0x6a09, LSL #16
00bad8c4	movk w13,#0x3070, LSL #16
00bad8c8	movk w14,#0x3c6e, LSL #16
00bad8cc	mov w15,#0x5939
00bad8d0	mov w16,#0xf53a
00bad8d4	movk w15,#0xf70e, LSL #16
00bad8d8	movk w16,#0xa54f, LSL #16
00bad8dc	mov w17,#0xb31
00bad8e0	mov w18,#0x527f
00bad8e4	csel w24,w10,w9,eq
00bad8e8	csel w10,w14,w13,eq
00bad8ec	movk w17,#0xffc0, LSL #16
00bad8f0	movk w18,#0x510e, LSL #16
00bad8f4	mov w0,#0x1511
00bad8f8	mov w1,#0x688c
00bad8fc	str w10,[sp, #0x3c]
00bad900	csel w10,w16,w15,eq
00bad904	mov w8,#0x100
00bad908	movk w0,#0x6858, LSL #16
00bad90c	movk w1,#0x9b05, LSL #16
00bad910	mov w2,#0x8fa7
00bad914	mov w3,#0xd9ab
00bad918	mov w4,#0x4fa4
00bad91c	mov w5,#0xcd19
00bad920	str w10,[sp, #0x38]
00bad924	csel w10,w18,w17,eq
00bad928	movk w2,#0x64f9, LSL #16
00bad92c	movk w3,#0x1f83, LSL #16
00bad930	movk w4,#0xbefa, LSL #16
00bad934	movk w5,#0x5be0, LSL #16
00bad938	str w10,[sp, #0x34]
00bad93c	csel w10,w1,w0,eq
00bad940	sub w8,w8,w21, LSL #0x5
00bad944	mov w11,#0xd507
00bad948	mov w12,#0xae85
00bad94c	mov w9,#0x20
00bad950	str w10,[sp, #0x30]
00bad954	csel w10,w3,w2,eq
00bad958	str w8,[sp, #0x18]
00bad95c	csel w8,w5,w4,eq
00bad960	movk w11,#0x367c, LSL #16
00bad964	movk w12,#0xbb67, LSL #16
00bad968	stp w8,w10,[sp, #0x28]
00bad96c	sub w8,w9,w21, LSL #0x2
00bad970	mov x25,xzr
00bad974	csel w23,w12,w11,eq
00bad978	sxtw x8,w8
00bad97c	stp x8,x22,[sp, #0x8]
00bad980	cbz w20,0x00bad998
00bad984	ldr w1,[sp, #0x18]
00bad988	adrp x0,0x2d2000
00bad98c	add w2,w25,#0x1
00bad990	add x0,x0,#0x9fc
00bad994	bl 0x00c41af0
00bad998	cmp w21,#0x1
00bad99c	b.hi 0x00badc2c
00bad9a0	ldr w8,[sp, #0x3c]
00bad9a4	cmp x25,#0x2
00bad9a8	str xzr,[sp, #0x80]
00bad9ac	stp w24,w23,[sp, #0x88]
00bad9b0	str w8,[sp, #0x90]
00bad9b4	ldr w8,[sp, #0x38]
00bad9b8	str w8,[sp, #0x94]
00bad9bc	ldr w8,[sp, #0x34]
00bad9c0	str w8,[sp, #0x98]
00bad9c4	ldr w8,[sp, #0x30]
00bad9c8	str w8,[sp, #0x9c]
00bad9cc	ldr w8,[sp, #0x2c]
00bad9d0	str w8,[sp, #0xa0]
00bad9d4	ldr w8,[sp, #0x28]
00bad9d8	stp w8,w21,[sp, #0xa4]
00bad9dc	b.ne 0x00bada00
00bad9e0	mov w1,#0x61
00bad9e4	mov w2,#0x3e8
00bad9e8	mov x0,x19
00bad9ec	str w20,[sp, #0x1c]
00bad9f0	bl 0x00c301c0
00bad9f4	mov w9,wzr
00bad9f8	mov w22,wzr
00bad9fc	b 0x00bada64
00bada00	adrp x8,0x788000
00bada04	add x8,x8,#0x750
00bada08	ldr x26,[x8, x25, LSL #0x3]
00bada0c	adrp x9,0x788000
00bada10	mov w8,#0x39
00bada14	add x9,x9,#0x6a0
00bada18	madd x27,x25,x8,x9
00bada1c	str w26,[sp, #0x80]
00bada20	cmp x26,#0x40
00bada24	b.cc 0x00badb48
00bada28	mov x22,x26
00bada2c	mov x28,x27
00bada30	add x0,sp,#0x40
00bada34	mov x1,x28
00bada38	bl 0x00c434f0
00bada3c	sub x22,x22,#0x40
00bada40	cmp x22,#0x3f
00bada44	add x28,x28,#0x40
00bada48	b.hi 0x00bada30
00bada4c	and x8,x26,#-0x40
00bada50	add x27,x27,x8
00bada54	sub x26,x26,x8
00bada58	cbnz x8,0x00bada20
00bada5c	b 0x00badbb4
00bada60	ldr w9,[sp, #0x80]
00bada64	mov w20,w23
00bada68	and w8,w9,#0x3f
00bada6c	add w10,w9,#0x3e8
00bada70	cmn w9,#0x3e8
00bada74	str w10,[sp, #0x80]
00bada78	b.cc 0x00bada88
00bada7c	ldr w9,[sp, #0x84]
00bada80	add w9,w9,#0x1
00bada84	str w9,[sp, #0x84]
00bada88	mov w23,w24
00bada8c	cbz w8,0x00badad0
00bada90	mov w9,#0x40
00bada94	sub w27,w9,w8
00bada98	add x9,sp,#0x40
00bada9c	add x0,x9,x8
00badaa0	mov x1,x19
00badaa4	mov x2,x27
00badaa8	bl 0x00c2ffd0
00badaac	add x0,sp,#0x40
00badab0	add x1,sp,#0x40
00badab4	bl 0x00c434f0
00badab8	mov w8,#0x3e8
00badabc	add x26,x19,x27
00badac0	sub x24,x8,x27
00badac4	cmp x24,#0x40
00badac8	b.cs 0x00badae0
00badacc	b 0x00badb18
00badad0	mov w24,#0x3e8
00badad4	mov x26,x19
00badad8	cmp x24,#0x40
00badadc	b.cc 0x00badb18
00badae0	mov x27,x24
00badae4	mov x28,x26
00badae8	add x0,sp,#0x40
00badaec	mov x1,x28
00badaf0	bl 0x00c434f0
00badaf4	sub x27,x27,#0x40
00badaf8	cmp x27,#0x3f
00badafc	add x28,x28,#0x40
00badb00	b.hi 0x00badae8
00badb04	and x8,x24,#-0x40
00badb08	add x26,x26,x8
00badb0c	sub x24,x24,x8
00badb10	cbnz x8,0x00badad8
00badb14	b 0x00badbb0
00badb18	cbz x24,0x00badb2c
00badb1c	add x0,sp,#0x40
00badb20	mov x1,x26
00badb24	mov x2,x24
00badb28	bl 0x00c2ffd0
00badb2c	mov w24,w23
00badb30	mov w23,w20
00badb34	ldr w20,[sp, #0x1c]
00badb38	add w22,w22,#0x1
00badb3c	cmp w22,#0x3e7
00badb40	b.ls 0x00bada60
00badb44	b 0x00badb5c
00badb48	cbz x26,0x00badb5c
00badb4c	add x0,sp,#0x40
00badb50	mov x1,x27
00badb54	mov x2,x26
00badb58	bl 0x00c2ffd0
00badb5c	add x0,sp,#0x40
00badb60	sub x1,x29,#0x80
00badb64	bl 0x00c42a90
00badb68	ldp x2,x22,[sp, #0x8]
00badb6c	sub x0,x29,#0x80
00badb70	add x1,x22,x25, LSL #0x5
00badb74	bl 0x00c300b0
00badb78	cbnz w0,0x00badc3c
00badb7c	cbz w20,0x00badb8c
00badb80	adrp x0,0x77c000
00badb84	add x0,x0,#0x87c
00badb88	bl 0x00c30760
00badb8c	add x25,x25,#0x1
00badb90	cmp x25,#0x3
00badb94	b.cc 0x00bad980
00badb98	cbz w20,0x00badba4
00badb9c	mov w0,#0xa
00badba0	bl 0x00c42240
00badba4	ldr x23,[sp, #0x20]
00badba8	mov w21,wzr
00badbac	b 0x00badbcc
00badbb0	ldr w20,[sp, #0x1c]
00badbb4	mov w21,#0xffffffff
00badbb8	ldr x23,[sp, #0x20]
00badbbc	cbz w20,0x00badbcc
00badbc0	adrp x0,0x77c000
00badbc4	add x0,x0,#0x854
00badbc8	bl 0x00c30760
00badbcc	add x0,sp,#0x40
00badbd0	mov w1,#0x6c
00badbd4	bl 0x00c42220
00badbd8	mov x0,x19
00badbdc	bl 0x00c30960
00badbe0	b 0x00badbf8
00badbe4	cbz w20,0x00badbf4
00badbe8	adrp x0,0x746000
00badbec	add x0,x0,#0x3e0
00badbf0	bl 0x00c30760
00badbf4	mov w21,#0x1
00badbf8	ldr x8,[x23, #0x28]
00badbfc	ldur x9,[x29, #-0x60]
00badc00	cmp x8,x9
00badc04	b.ne 0x00badc4c
00badc08	mov w0,w21
00badc0c	ldp x29,x30,[sp, #0x130]
00badc10	ldp x20,x19,[sp, #0x120]
00badc14	ldp x22,x21,[sp, #0x110]
00badc18	ldp x24,x23,[sp, #0x100]
00badc1c	ldp x26,x25,[sp, #0xf0]
00badc20	ldp x28,x27,[sp, #0xe0]
00badc24	add sp,sp,#0x140
00badc28	ret
00badc2c	mov w21,#0xffffff8c
00badc30	ldr x23,[sp, #0x20]
00badc34	cbnz w20,0x00badbc0
00badc38	b 0x00badbcc
00badc3c	mov w21,#0x1
00badc40	ldr x23,[sp, #0x20]
00badc44	cbnz w20,0x00badbc0
00badc48	b 0x00badbcc
00badc4c	bl 0x00c2fec0
