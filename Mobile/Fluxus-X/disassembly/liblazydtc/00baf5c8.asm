; FUN_00baf5c8 @ 00baf5c8
00baf5c8	sub sp,sp,#0x180
00baf5cc	str x28,[sp, #0x120]
00baf5d0	stp x26,x25,[sp, #0x130]
00baf5d4	stp x24,x23,[sp, #0x140]
00baf5d8	stp x22,x21,[sp, #0x150]
00baf5dc	stp x20,x19,[sp, #0x160]
00baf5e0	stp x29,x30,[sp, #0x170]
00baf5e4	add x29,sp,#0x170
00baf5e8	mrs x24,tpidr_el0
00baf5ec	ldr x8,[x24, #0x28]
00baf5f0	mov w19,w3
00baf5f4	mov w22,w2
00baf5f8	mov x20,x1
00baf5fc	mov w21,w0
00baf600	add x0,sp,#0x48
00baf604	mov w2,#0xd0
00baf608	mov w1,wzr
00baf60c	stur x8,[x29, #-0x58]
00baf610	sxtw x25,w19
00baf614	bl 0x00c301c0
00baf618	sub w26,w22,#0x1
00baf61c	cmp w26,#0x3
00baf620	b.hi 0x00baf6ac
00baf624	adrp x8,0x29c000
00baf628	mov x11,#0x1c
00baf62c	mov x12,#0x90
00baf630	add x8,x8,#0x740
00baf634	movk x11,#0x20, LSL #16
00baf638	movk x12,#0x88, LSL #16
00baf63c	adrp x9,0x788000
00baf640	mov w10,w26
00baf644	movk x11,#0x30, LSL #32
00baf648	movk x12,#0x68, LSL #32
00baf64c	ldr x22,[x8, w19, SXTW #0x3]
00baf650	add x9,x9,#0xd28
00baf654	movk x11,#0x40, LSL #48
00baf658	movk x12,#0x48, LSL #48
00baf65c	lsl x8,x10,#0x4
00baf660	add x23,x9,x25, LSL #0x2
00baf664	lsr x9,x11,x8
00baf668	lsr x8,x12,x8
00baf66c	add x0,sp,#0x48
00baf670	mov w2,#0xcc
00baf674	mov w1,wzr
00baf678	strh w9,[sp, #0x114]
00baf67c	strh w8,[sp, #0x116]
00baf680	bl 0x00c301c0
00baf684	add x0,sp,#0x48
00baf688	mov x1,x23
00baf68c	mov x2,x22
00baf690	bl 0x00c42b30
00baf694	add x0,sp,#0x48
00baf698	add x1,sp,#0x8
00baf69c	mov w2,#0x40
00baf6a0	bl 0x00c42af0
00baf6a4	mov w22,w0
00baf6a8	b 0x00baf6b0
00baf6ac	mov w22,#0xffffff8a
00baf6b0	add x0,sp,#0x48
00baf6b4	mov w1,#0xd0
00baf6b8	bl 0x00c42220
00baf6bc	cbz w22,0x00baf6e0
00baf6c0	cbz w21,0x00baf798
00baf6c4	adrp x0,0x29f000
00baf6c8	add x0,x0,#0x75
00baf6cc	mov x1,x20
00baf6d0	mov w2,w19
00baf6d4	mov w3,w22
00baf6d8	bl 0x00c41af0
00baf6dc	b 0x00baf798
00baf6e0	cmp w26,#0x3
00baf6e4	b.hi 0x00baf77c
00baf6e8	adrp x8,0x788000
00baf6ec	add x8,x8,#0xcd8
00baf6f0	ldrsw x9,[x8, x26, LSL #0x2]
00baf6f4	add x8,x9,x8
00baf6f8	br x8
00baf6fc	adrp x9,0x788000
00baf700	orr w8,wzr,#0x1c
00baf704	add x9,x9,#0xd30
00baf708	madd x1,x25,x8,x9
00baf70c	add x0,sp,#0x8
00baf710	orr w2,wzr,#0x1c
00baf714	bl 0x00c300b0
00baf718	cbnz w0,0x00baf740
00baf71c	b 0x00baf77c
00baf720	adrp x9,0x788000
00baf724	orr w8,wzr,#0x30
00baf728	add x9,x9,#0xda8
00baf72c	madd x1,x25,x8,x9
00baf730	add x0,sp,#0x8
00baf734	orr w2,wzr,#0x30
00baf738	bl 0x00c300b0
00baf73c	cbz w0,0x00baf77c
00baf740	cbz w21,0x00baf758
00baf744	adrp x0,0x2a8000
00baf748	add x0,x0,#0xf96
00baf74c	mov x1,x20
00baf750	mov w2,w19
00baf754	bl 0x00c41af0
00baf758	mov w22,#0xffffffff
00baf75c	b 0x00baf798
00baf760	adrp x8,0x788000
00baf764	add x8,x8,#0xe08
00baf768	add x1,x8,x25, LSL #0x6
00baf76c	add x0,sp,#0x8
00baf770	mov w2,#0x40
00baf774	bl 0x00c300b0
00baf778	cbnz w0,0x00baf740
00baf77c	cbz w21,0x00baf794
00baf780	adrp x0,0x2d4000
00baf784	add x0,x0,#0xb23
00baf788	mov x1,x20
00baf78c	mov w2,w19
00baf790	bl 0x00c41af0
00baf794	mov w22,wzr
00baf798	ldr x8,[x24, #0x28]
00baf79c	ldur x9,[x29, #-0x58]
00baf7a0	cmp x8,x9
00baf7a4	b.ne 0x00baf7ec
00baf7a8	mov w0,w22
00baf7ac	ldp x29,x30,[sp, #0x170]
00baf7b0	ldp x20,x19,[sp, #0x160]
00baf7b4	ldp x22,x21,[sp, #0x150]
00baf7b8	ldp x24,x23,[sp, #0x140]
00baf7bc	ldp x26,x25,[sp, #0x130]
00baf7c0	ldr x28,[sp, #0x120]
00baf7c4	add sp,sp,#0x180
00baf7c8	ret
00baf7cc	adrp x8,0x788000
00baf7d0	add x8,x8,#0xd68
00baf7d4	add x1,x8,x25, LSL #0x5
00baf7d8	add x0,sp,#0x8
00baf7dc	mov w2,#0x20
00baf7e0	bl 0x00c300b0
00baf7e4	cbnz w0,0x00baf740
00baf7e8	b 0x00baf77c
00baf7ec	bl 0x00c2fec0
