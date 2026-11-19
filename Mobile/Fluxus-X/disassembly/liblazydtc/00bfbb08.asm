; std::__ndk1::collate_byname<char>::do_compare @ 00bfbb08
00bfbb08	paciasp
00bfbb0c	sub sp,sp,#0x80
00bfbb10	stp x29,x30,[sp, #0x30]
00bfbb14	str x25,[sp, #0x40]
00bfbb18	stp x24,x23,[sp, #0x50]
00bfbb1c	stp x22,x21,[sp, #0x60]
00bfbb20	stp x20,x19,[sp, #0x70]
00bfbb24	add x29,sp,#0x30
00bfbb28	sub x23,x2,x1
00bfbb2c	cmn x23,#0x8
00bfbb30	b.cs 0x00bfbcac
00bfbb34	mov x21,x4
00bfbb38	mov x20,x3
00bfbb3c	mov x22,x2
00bfbb40	mov x19,x0
00bfbb44	cmp x23,#0x16
00bfbb48	b.hi 0x00bfbb68
00bfbb4c	lsl w8,w23,#0x1
00bfbb50	add x9,sp,#0x18
00bfbb54	orr x24,x9,#0x1
00bfbb58	strb w8,[sp, #0x18]
00bfbb5c	cmp x22,x1
00bfbb60	b.ne 0x00bfbba0
00bfbb64	b 0x00bfbbac
00bfbb68	orr x8,x23,#0x7
00bfbb6c	mov w9,#0x1a
00bfbb70	mov x24,x1
00bfbb74	cmp x8,#0x17
00bfbb78	csinc x25,x9,x8,eq
00bfbb7c	mov x0,x25
00bfbb80	bl 0x00c2fed0
00bfbb84	mov x1,x24
00bfbb88	mov x24,x0
00bfbb8c	orr x8,x25,#0x1
00bfbb90	stp x23,x0,[sp, #0x20]
00bfbb94	str x8,[sp, #0x18]
00bfbb98	cmp x22,x1
00bfbb9c	b.eq 0x00bfbbac
00bfbba0	mov x0,x24
00bfbba4	mov x2,x23
00bfbba8	bl 0x00c2ffd0
00bfbbac	sub x22,x21,x20
00bfbbb0	strb wzr,[x24, x23]
00bfbbb4	cmn x22,#0x8
00bfbbb8	b.cs 0x00bfbcb0
00bfbbbc	cmp x22,#0x16
00bfbbc0	b.hi 0x00bfbc78
00bfbbc4	lsl w8,w22,#0x1
00bfbbc8	mov x9,sp
00bfbbcc	orr x23,x9,#0x1
00bfbbd0	strb w8,[sp]
00bfbbd4	cmp x21,x20
00bfbbd8	b.eq 0x00bfbbec
00bfbbdc	mov x0,x23
00bfbbe0	mov x1,x20
00bfbbe4	mov x2,x22
00bfbbe8	bl 0x00c2ffd0
00bfbbec	ldrb w24,[sp, #0x18]
00bfbbf0	strb wzr,[x23, x22]
00bfbbf4	add x8,sp,#0x18
00bfbbf8	ldr x20,[sp, #0x28]
00bfbbfc	ldrb w22,[sp]
00bfbc00	ldr x21,[sp, #0x10]
00bfbc04	tst w24,#0x1
00bfbc08	ldr x2,[x19, #0x10]
00bfbc0c	csinc x0,x20,x8,ne
00bfbc10	tst w22,#0x1
00bfbc14	mov x8,sp
00bfbc18	csinc x1,x21,x8,ne
00bfbc1c	bl 0x00c43aa0
00bfbc20	mov w19,w0
00bfbc24	tbz w22,#0x0,0x00bfbc38
00bfbc28	ldr x8,[sp]
00bfbc2c	mov x0,x21
00bfbc30	and x1,x8,#-0x2
00bfbc34	bl 0x00c2fe80
00bfbc38	tbz w24,#0x0,0x00bfbc4c
00bfbc3c	ldr x8,[sp, #0x18]
00bfbc40	mov x0,x20
00bfbc44	and x1,x8,#-0x2
00bfbc48	bl 0x00c2fe80
00bfbc4c	cmp w19,#0x0
00bfbc50	cset w8,ne
00bfbc54	csinv w0,w8,wzr,ge
00bfbc58	ldp x20,x19,[sp, #0x70]
00bfbc5c	ldr x25,[sp, #0x40]
00bfbc60	ldp x22,x21,[sp, #0x60]
00bfbc64	ldp x24,x23,[sp, #0x50]
00bfbc68	ldp x29,x30,[sp, #0x30]
00bfbc6c	add sp,sp,#0x80
00bfbc70	autiasp
00bfbc74	ret
00bfbc78	orr x8,x22,#0x7
00bfbc7c	mov w9,#0x1a
00bfbc80	cmp x8,#0x17
00bfbc84	csinc x24,x9,x8,eq
00bfbc88	mov x0,x24
00bfbc8c	bl 0x00c2fed0
00bfbc90	mov x23,x0
00bfbc94	orr x8,x24,#0x1
00bfbc98	stp x22,x0,[sp, #0x8]
00bfbc9c	str x8,[sp]
00bfbca0	cmp x21,x20
00bfbca4	b.ne 0x00bfbbdc
00bfbca8	b 0x00bfbbec
00bfbcac	bl 0x007fe124
00bfbcb0	bl 0x007fe124
