; NAME_CONSTRAINTS_check @ 00afef6c
00afef6c	sub sp,sp,#0x50
00afef70	stp x24,x23,[sp, #0x10]
00afef74	stp x22,x21,[sp, #0x20]
00afef78	stp x20,x19,[sp, #0x30]
00afef7c	stp x29,x30,[sp, #0x40]
00afef80	add x29,sp,#0x40
00afef84	mov x19,x1
00afef88	mov x20,x0
00afef8c	bl 0x00c32d20
00afef90	mov x21,x0
00afef94	bl 0x00c37860
00afef98	ldr x8,[x20, #0x118]
00afef9c	mov w22,w0
00afefa0	mov x0,x8
00afefa4	bl 0x00c325e0
00afefa8	bic w24,w0,w0, ASR #0x1f
00afefac	bic w23,w22,w22, ASR #0x1f
00afefb0	eor w8,w24,#0x7fffffff
00afefb4	cmp w23,w8
00afefb8	b.gt 0x00aff004
00afefbc	ldr x0,[x19]
00afefc0	bl 0x00c325e0
00afefc4	ldr x8,[x19, #0x8]
00afefc8	mov w22,w0
00afefcc	mov x0,x8
00afefd0	bl 0x00c325e0
00afefd4	bic w9,w0,w0, ASR #0x1f
00afefd8	bic w8,w22,w22, ASR #0x1f
00afefdc	eor w10,w9,#0x7fffffff
00afefe0	cmp w8,w10
00afefe4	b.gt 0x00aff004
00afefe8	add w10,w24,w23
00afefec	cbz w10,0x00aff020
00afeff0	add w8,w9,w8
00afeff4	mov w9,#0x100000
00afeff8	udiv w9,w9,w10
00afeffc	cmp w8,w9
00aff000	b.ls 0x00aff020
00aff004	mov w0,#0x1
00aff008	ldp x29,x30,[sp, #0x40]
00aff00c	ldp x20,x19,[sp, #0x30]
00aff010	ldp x22,x21,[sp, #0x20]
00aff014	ldp x24,x23,[sp, #0x10]
00aff018	add sp,sp,#0x50
00aff01c	ret
00aff020	mov x0,x21
00aff024	bl 0x00c37860
00aff028	cmp w0,#0x1
00aff02c	b.lt 0x00aff0a8
00aff030	mov w8,#0x4
00aff034	mov x0,sp
00aff038	mov x1,x19
00aff03c	str w8,[sp]
00aff040	str x21,[sp, #0x8]
00aff044	bl 0x00aff100
00aff048	cbnz w0,0x00aff008
00aff04c	mov w8,#0x1
00aff050	mov w22,#0xffffffff
00aff054	str w8,[sp]
00aff058	orr w1,wzr,#0x30
00aff05c	mov x0,x21
00aff060	mov w2,w22
00aff064	bl 0x00c32bc0
00aff068	cmn w0,#0x1
00aff06c	b.eq 0x00aff0a8
00aff070	mov w22,w0
00aff074	mov x0,x21
00aff078	mov w1,w22
00aff07c	bl 0x00c32bb0
00aff080	bl 0x00c32ba0
00aff084	str x0,[sp, #0x8]
00aff088	ldr w8,[x0, #0x4]
00aff08c	cmp w8,#0x16
00aff090	b.ne 0x00aff0f8
00aff094	mov x0,sp
00aff098	mov x1,x19
00aff09c	bl 0x00aff100
00aff0a0	cbz w0,0x00aff058
00aff0a4	b 0x00aff008
00aff0a8	ldr x0,[x20, #0x118]
00aff0ac	bl 0x00c325e0
00aff0b0	cmp w0,#0x1
00aff0b4	b.lt 0x00aff0f0
00aff0b8	mov w21,wzr
00aff0bc	ldr x0,[x20, #0x118]
00aff0c0	mov w1,w21
00aff0c4	bl 0x00c32610
00aff0c8	mov x1,x19
00aff0cc	bl 0x00aff100
00aff0d0	cbnz w0,0x00aff008
00aff0d4	ldr x0,[x20, #0x118]
00aff0d8	add w21,w21,#0x1
00aff0dc	bl 0x00c325e0
00aff0e0	cmp w21,w0
00aff0e4	mov w0,wzr
00aff0e8	b.lt 0x00aff0bc
00aff0ec	b 0x00aff008
00aff0f0	mov w0,wzr
00aff0f4	b 0x00aff008
00aff0f8	mov w0,#0x35
00aff0fc	b 0x00aff008
