; UI_dup_info_string @ 00aee1ac
00aee1ac	str x21,[sp, #-0x30]!
00aee1b0	stp x20,x19,[sp, #0x10]
00aee1b4	stp x29,x30,[sp, #0x20]
00aee1b8	add x29,sp,#0x20
00aee1bc	cbz x1,0x00aee25c
00aee1c0	adrp x8,0x2a0000
00aee1c4	add x8,x8,#0xc2f
00aee1c8	mov x19,x0
00aee1cc	mov w2,#0x144
00aee1d0	mov x0,x1
00aee1d4	mov x1,x8
00aee1d8	bl 0x00c34600
00aee1dc	cbz x0,0x00aee28c
00aee1e0	adrp x1,0x2a0000
00aee1e4	mov x21,x0
00aee1e8	add x1,x1,#0xc2f
00aee1ec	mov w0,#0x48
00aee1f0	mov w2,#0x6d
00aee1f4	bl 0x00c34250
00aee1f8	cbz x0,0x00aee2bc
00aee1fc	mov w8,#0x1
00aee200	mov w9,#0x4
00aee204	str x21,[x0, #0x8]
00aee208	str wzr,[x0, #0x10]
00aee20c	str w8,[x0, #0x40]
00aee210	str w9,[x0]
00aee214	str xzr,[x0, #0x18]
00aee218	ldr x8,[x19, #0x8]!
00aee21c	mov x20,x0
00aee220	cbnz x8,0x00aee230
00aee224	bl 0x00c34780
00aee228	str x0,[x19]
00aee22c	cbz x0,0x00aee2d4
00aee230	stp xzr,xzr,[x20, #0x28]
00aee234	ldr x0,[x19]
00aee238	mov x1,x20
00aee23c	bl 0x00c347a0
00aee240	mov w19,w0
00aee244	cmp w0,#0x0
00aee248	b.gt 0x00aee2c0
00aee24c	mov x0,x20
00aee250	sub w19,w19,#0x1
00aee254	bl 0x00aed930
00aee258	b 0x00aee2c0
00aee25c	bl 0x00c342a0
00aee260	adrp x0,0x2a0000
00aee264	adrp x2,0x2bc000
00aee268	add x0,x0,#0xc2f
00aee26c	add x2,x2,#0x531
00aee270	mov w1,#0x69
00aee274	bl 0x00c342b0
00aee278	mov w8,#0x100
00aee27c	movk w8,#0xc, LSL #16
00aee280	add w1,w8,#0x2
00aee284	mov w0,#0x28
00aee288	b 0x00aee2b4
00aee28c	bl 0x00c342a0
00aee290	adrp x0,0x2a0000
00aee294	adrp x2,0x2b2000
00aee298	add x0,x0,#0xc2f
00aee29c	add x2,x2,#0xbab
00aee2a0	mov w1,#0x146
00aee2a4	bl 0x00c342b0
00aee2a8	mov w1,#0x100
00aee2ac	mov w0,#0x28
00aee2b0	movk w1,#0xc, LSL #16
00aee2b4	mov x2,xzr
00aee2b8	bl 0x00c342c0
00aee2bc	mov w19,#0xffffffff
00aee2c0	mov w0,w19
00aee2c4	ldp x29,x30,[sp, #0x20]
00aee2c8	ldp x20,x19,[sp, #0x10]
00aee2cc	ldr x21,[sp], #0x30
00aee2d0	ret
00aee2d4	mov x0,x20
00aee2d8	bl 0x00aed930
00aee2dc	b 0x00aee2bc
