; FUN_00a2ae1c @ 00a2ae1c
00a2ae1c	stp x24,x23,[sp, #-0x40]!
00a2ae20	stp x22,x21,[sp, #0x10]
00a2ae24	stp x20,x19,[sp, #0x20]
00a2ae28	stp x29,x30,[sp, #0x30]
00a2ae2c	ldr w8,[x3, #0x28]
00a2ae30	add x29,sp,#0x30
00a2ae34	cbz w8,0x00a2affc
00a2ae38	mov x21,x4
00a2ae3c	mov x23,x3
00a2ae40	mov x20,x2
00a2ae44	mov x19,x1
00a2ae48	mov x22,x0
00a2ae4c	ldr x0,[x22, #0x40]
00a2ae50	ldr x24,[x20, #0x20]
00a2ae54	bl 0x00c322f0
00a2ae58	sub w1,w0,#0x1
00a2ae5c	mov w2,#0xffffffff
00a2ae60	mov x0,x24
00a2ae64	mov w3,wzr
00a2ae68	mov w4,wzr
00a2ae6c	mov x5,x21
00a2ae70	bl 0x00c39150
00a2ae74	cbz w0,0x00a2afcc
00a2ae78	ldr x0,[x20, #0x20]
00a2ae7c	bl 0x00c369b0
00a2ae80	cbnz w0,0x00a2ae4c
00a2ae84	ldr x8,[x22]
00a2ae88	ldr x9,[x8, #0x118]
00a2ae8c	cbz x9,0x00a2aeac
00a2ae90	ldr x1,[x20, #0x20]
00a2ae94	mov x0,x22
00a2ae98	mov x3,x21
00a2ae9c	mov x2,x1
00a2aea0	blr x9
00a2aea4	cbz w0,0x00a2b000
00a2aea8	ldr x8,[x22]
00a2aeac	ldr x8,[x8, #0xf8]
00a2aeb0	ldr x1,[x20, #0x10]
00a2aeb4	ldr x2,[x23, #0x10]
00a2aeb8	ldr x3,[x20, #0x20]
00a2aebc	mov x0,x22
00a2aec0	mov x4,x21
00a2aec4	blr x8
00a2aec8	cbz w0,0x00a2b000
00a2aecc	ldr x0,[x22, #0x40]
00a2aed0	ldr x24,[x19, #0x18]
00a2aed4	bl 0x00c322f0
00a2aed8	sub w1,w0,#0x1
00a2aedc	mov w2,#0xffffffff
00a2aee0	mov x0,x24
00a2aee4	mov w3,wzr
00a2aee8	mov w4,wzr
00a2aeec	mov x5,x21
00a2aef0	bl 0x00c39150
00a2aef4	cbz w0,0x00a2b014
00a2aef8	ldr x0,[x19, #0x18]
00a2aefc	bl 0x00c369b0
00a2af00	cbnz w0,0x00a2aecc
00a2af04	ldr x8,[x22]
00a2af08	ldr x9,[x8, #0x118]
00a2af0c	cbz x9,0x00a2af2c
00a2af10	ldr x1,[x19, #0x18]
00a2af14	mov x0,x22
00a2af18	mov x3,x21
00a2af1c	mov x2,x1
00a2af20	blr x9
00a2af24	cbz w0,0x00a2b000
00a2af28	ldr x8,[x22]
00a2af2c	ldr x8,[x8, #0x100]
00a2af30	ldr x1,[x19, #0x20]
00a2af34	ldr x2,[x23, #0x10]
00a2af38	mov x0,x22
00a2af3c	mov x3,x21
00a2af40	blr x8
00a2af44	cbz w0,0x00a2b000
00a2af48	ldr x8,[x22]
00a2af4c	ldr x1,[x19, #0x10]
00a2af50	ldr x2,[x19, #0x20]
00a2af54	mov x0,x22
00a2af58	ldr x8,[x8, #0x100]
00a2af5c	mov x3,x21
00a2af60	blr x8
00a2af64	cbz w0,0x00a2b000
00a2af68	ldr x0,[x19, #0x10]
00a2af6c	ldr x2,[x22, #0x68]
00a2af70	mov x1,x0
00a2af74	bl 0x00c38b40
00a2af78	cbz w0,0x00a2b000
00a2af7c	ldr x8,[x22]
00a2af80	ldp x3,x1,[x19, #0x18]
00a2af84	mov x0,x22
00a2af88	mov x4,x21
00a2af8c	ldr x8,[x8, #0xf8]
00a2af90	mov x2,x1
00a2af94	blr x8
00a2af98	cbz w0,0x00a2b000
00a2af9c	ldr x8,[x22]
00a2afa0	ldp x1,x3,[x19, #0x10]
00a2afa4	mov x0,x22
00a2afa8	mov x4,x21
00a2afac	ldr x8,[x8, #0xf8]
00a2afb0	mov x2,x1
00a2afb4	blr x8
00a2afb8	cbz w0,0x00a2b000
00a2afbc	mov w0,#0x1
00a2afc0	str wzr,[x20, #0x28]
00a2afc4	str wzr,[x19, #0x28]
00a2afc8	b 0x00a2b000
00a2afcc	bl 0x00c342a0
00a2afd0	adrp x0,0x29e000
00a2afd4	adrp x2,0x2b4000
00a2afd8	add x0,x0,#0x82
00a2afdc	add x2,x2,#0x144
00a2afe0	mov w1,#0x2de
00a2afe4	bl 0x00c342b0
00a2afe8	mov w1,#0x3
00a2afec	mov w0,#0x10
00a2aff0	movk w1,#0x8, LSL #16
00a2aff4	mov x2,xzr
00a2aff8	bl 0x00c342c0
00a2affc	mov w0,wzr
00a2b000	ldp x29,x30,[sp, #0x30]
00a2b004	ldp x20,x19,[sp, #0x20]
00a2b008	ldp x22,x21,[sp, #0x10]
00a2b00c	ldp x24,x23,[sp], #0x40
00a2b010	ret
00a2b014	bl 0x00c342a0
00a2b018	adrp x0,0x29e000
00a2b01c	adrp x2,0x2b4000
00a2b020	add x0,x0,#0x82
00a2b024	add x2,x2,#0x144
00a2b028	mov w1,#0x2ed
00a2b02c	b 0x00a2afe4
