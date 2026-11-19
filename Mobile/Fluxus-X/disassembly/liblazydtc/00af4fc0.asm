; GENERAL_NAME_cmp @ 00af4fc0
00af4fc0	stp x20,x19,[sp, #-0x20]!
00af4fc4	mov x8,x0
00af4fc8	mov w0,#0xffffffff
00af4fcc	stp x29,x30,[sp, #0x10]
00af4fd0	add x29,sp,#0x10
00af4fd4	cbz x8,0x00af50dc
00af4fd8	cbz x1,0x00af50dc
00af4fdc	ldr w9,[x8]
00af4fe0	ldr w10,[x1]
00af4fe4	cmp w9,w10
00af4fe8	b.ne 0x00af50d8
00af4fec	cmp w9,#0x8
00af4ff0	b.hi 0x00af50d8
00af4ff4	adrp x10,0x77b000
00af4ff8	mov w9,w9
00af4ffc	add x10,x10,#0x3ec
00af5000	ldrsw x9,[x10, x9, LSL #0x2]
00af5004	add x9,x9,x10
00af5008	br x9
00af500c	ldr x0,[x8, #0x8]
00af5010	ldr x1,[x1, #0x8]
00af5014	ldp x29,x30,[sp, #0x10]
00af5018	ldp x20,x19,[sp], #0x20
00af501c	b 0x00c37a20
00af5020	ldr x19,[x8, #0x8]
00af5024	mov w0,#0xffffffff
00af5028	cbz x19,0x00af50dc
00af502c	ldr x20,[x1, #0x8]
00af5030	cbz x20,0x00af50dc
00af5034	ldr x0,[x19]
00af5038	ldr x1,[x20]
00af503c	bl 0x00c37ab0
00af5040	cbnz w0,0x00af50dc
00af5044	ldr x0,[x19, #0x8]
00af5048	ldr x1,[x20, #0x8]
00af504c	ldp x29,x30,[sp, #0x10]
00af5050	ldp x20,x19,[sp], #0x20
00af5054	b 0x00c37a10
00af5058	ldr x0,[x8, #0x8]
00af505c	ldr x1,[x1, #0x8]
00af5060	ldp x29,x30,[sp, #0x10]
00af5064	ldp x20,x19,[sp], #0x20
00af5068	b 0x00c36560
00af506c	ldr x19,[x8, #0x8]
00af5070	mov w0,#0xffffffff
00af5074	cbz x19,0x00af50dc
00af5078	ldr x20,[x1, #0x8]
00af507c	cbz x20,0x00af50dc
00af5080	ldr x0,[x19]
00af5084	ldr x1,[x20]
00af5088	cbz x0,0x00af50c4
00af508c	cbz x1,0x00af50e8
00af5090	bl 0x00c37a20
00af5094	cbnz w0,0x00af50dc
00af5098	b 0x00af50c8
00af509c	ldr x0,[x8, #0x8]
00af50a0	ldr x1,[x1, #0x8]
00af50a4	ldp x29,x30,[sp, #0x10]
00af50a8	ldp x20,x19,[sp], #0x20
00af50ac	b 0x00c37780
00af50b0	ldr x0,[x8, #0x8]
00af50b4	ldr x1,[x1, #0x8]
00af50b8	ldp x29,x30,[sp, #0x10]
00af50bc	ldp x20,x19,[sp], #0x20
00af50c0	b 0x00c37ab0
00af50c4	cbnz x1,0x00af50d8
00af50c8	ldr x0,[x19, #0x8]
00af50cc	cbz x0,0x00af50d8
00af50d0	ldr x1,[x20, #0x8]
00af50d4	cbnz x1,0x00af5014
00af50d8	mov w0,#0xffffffff
00af50dc	ldp x29,x30,[sp, #0x10]
00af50e0	ldp x20,x19,[sp], #0x20
00af50e4	ret
00af50e8	mov w0,#0x1
00af50ec	b 0x00af50dc
