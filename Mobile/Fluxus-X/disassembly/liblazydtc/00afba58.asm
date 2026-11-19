; FUN_00afba58 @ 00afba58
00afba58	sub sp,sp,#0x70
00afba5c	stp x22,x21,[sp, #0x40]
00afba60	mov x21,x0
00afba64	mov x0,x1
00afba68	stp x28,x27,[sp, #0x10]
00afba6c	stp x26,x25,[sp, #0x20]
00afba70	stp x24,x23,[sp, #0x30]
00afba74	stp x20,x19,[sp, #0x50]
00afba78	stp x29,x30,[sp, #0x60]
00afba7c	add x29,sp,#0x60
00afba80	str w2,[sp, #0xc]
00afba84	mov x20,x1
00afba88	bl 0x00c325e0
00afba8c	cmp w0,#0x1
00afba90	b.lt 0x00afbca4
00afba94	ldr w8,[sp, #0xc]
00afba98	adrp x25,0x2ab000
00afba9c	adrp x28,0x2a7000
00afbaa0	mov w22,wzr
00afbaa4	add w23,w8,#0x2
00afbaa8	add x25,x25,#0x32c
00afbaac	add x28,x28,#0x15d
00afbab0	cbz w22,0x00afbac4
00afbab4	adrp x1,0x2c4000
00afbab8	mov x0,x21
00afbabc	add x1,x1,#0xdae
00afbac0	bl 0x00c32260
00afbac4	mov x0,x20
00afbac8	mov w1,w22
00afbacc	bl 0x00c32610
00afbad0	mov x24,x0
00afbad4	ldr x0,[x0]
00afbad8	bl 0x00c37750
00afbadc	cmp w0,#0xa5
00afbae0	b.eq 0x00afbb0c
00afbae4	cmp w0,#0xa4
00afbae8	b.ne 0x00afbc3c
00afbaec	ldr x8,[x24, #0x8]
00afbaf0	ldr w2,[sp, #0xc]
00afbaf4	adrp x1,0x2a2000
00afbaf8	mov x0,x21
00afbafc	ldr w4,[x8]
00afbb00	ldr x5,[x8, #0x8]
00afbb04	add x1,x1,#0xd8a
00afbb08	b 0x00afbc88
00afbb0c	ldr w2,[sp, #0xc]
00afbb10	adrp x1,0x2d0000
00afbb14	mov x0,x21
00afbb18	add x1,x1,#0x49c
00afbb1c	mov x3,x25
00afbb20	bl 0x00c32250
00afbb24	ldr x19,[x24, #0x8]
00afbb28	ldr x27,[x19]
00afbb2c	cbz x27,0x00afbc64
00afbb30	ldr x8,[x27]
00afbb34	adrp x1,0x2ba000
00afbb38	mov x0,x21
00afbb3c	add x1,x1,#0x7b5
00afbb40	ldr w4,[x8]
00afbb44	ldr x5,[x8, #0x8]
00afbb48	mov w2,w23
00afbb4c	mov x3,x25
00afbb50	bl 0x00c32250
00afbb54	ldr x0,[x27, #0x8]
00afbb58	bl 0x00c325e0
00afbb5c	adrp x8,0x2af000
00afbb60	cmp w0,#0x1
00afbb64	add x8,x8,#0x792
00afbb68	adrp x1,0x2ca000
00afbb6c	csel x4,x8,x25,gt
00afbb70	mov x0,x21
00afbb74	add x1,x1,#0x469
00afbb78	mov w2,w23
00afbb7c	mov x3,x25
00afbb80	bl 0x00c32250
00afbb84	ldr x0,[x27, #0x8]
00afbb88	bl 0x00c325e0
00afbb8c	cmp w0,#0x1
00afbb90	b.lt 0x00afbc18
00afbb94	mov w24,wzr
00afbb98	ldr x0,[x27, #0x8]
00afbb9c	mov w1,w24
00afbba0	bl 0x00c32610
00afbba4	mov x26,x0
00afbba8	cbz w24,0x00afbbb8
00afbbac	mov x0,x21
00afbbb0	mov x1,x28
00afbbb4	bl 0x00c32260
00afbbb8	cbz x26,0x00afbbf4
00afbbbc	mov x0,xzr
00afbbc0	mov x1,x26
00afbbc4	bl 0x00c3f730
00afbbc8	cbz x0,0x00afbc90
00afbbcc	mov x26,x0
00afbbd0	mov x0,x21
00afbbd4	mov x1,x26
00afbbd8	bl 0x00c32260
00afbbdc	adrp x1,0x2d0000
00afbbe0	mov w2,#0x1d8
00afbbe4	mov x0,x26
00afbbe8	add x1,x1,#0x485
00afbbec	bl 0x00c32310
00afbbf0	b 0x00afbc04
00afbbf4	adrp x1,0x2dc000
00afbbf8	mov x0,x21
00afbbfc	add x1,x1,#0xa5a
00afbc00	bl 0x00c32260
00afbc04	ldr x0,[x27, #0x8]
00afbc08	add w24,w24,#0x1
00afbc0c	bl 0x00c325e0
00afbc10	cmp w24,w0
00afbc14	b.lt 0x00afbb98
00afbc18	ldr x8,[x19, #0x8]!
00afbc1c	cbz x8,0x00afbc90
00afbc20	adrp x1,0x2c4000
00afbc24	mov x0,x21
00afbc28	add x1,x1,#0xdae
00afbc2c	bl 0x00c32260
00afbc30	ldr x8,[x19]
00afbc34	cbnz x8,0x00afbc70
00afbc38	b 0x00afbc90
00afbc3c	adrp x1,0x2d8000
00afbc40	mov x0,x21
00afbc44	add x1,x1,#0x874
00afbc48	mov w2,w23
00afbc4c	mov x3,x25
00afbc50	bl 0x00c32250
00afbc54	ldr x1,[x24]
00afbc58	mov x0,x21
00afbc5c	bl 0x00c32da0
00afbc60	b 0x00afbc90
00afbc64	add x19,x19,#0x8
00afbc68	ldr x8,[x19]
00afbc6c	cbz x8,0x00afbc90
00afbc70	ldr w4,[x8]
00afbc74	ldr x5,[x8, #0x8]
00afbc78	adrp x1,0x2a8000
00afbc7c	mov x0,x21
00afbc80	add x1,x1,#0x8db
00afbc84	mov w2,w23
00afbc88	mov x3,x25
00afbc8c	bl 0x00c32250
00afbc90	mov x0,x20
00afbc94	add w22,w22,#0x1
00afbc98	bl 0x00c325e0
00afbc9c	cmp w22,w0
00afbca0	b.lt 0x00afbab0
00afbca4	ldp x29,x30,[sp, #0x60]
00afbca8	ldp x20,x19,[sp, #0x50]
00afbcac	ldp x22,x21,[sp, #0x40]
00afbcb0	ldp x24,x23,[sp, #0x30]
00afbcb4	ldp x26,x25,[sp, #0x20]
00afbcb8	ldp x28,x27,[sp, #0x10]
00afbcbc	add sp,sp,#0x70
00afbcc0	ret
