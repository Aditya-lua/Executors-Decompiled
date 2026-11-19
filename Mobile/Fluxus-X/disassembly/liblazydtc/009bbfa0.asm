; SSL_CTX_use_PrivateKey_file @ 009bbfa0
009bbfa0	stp x22,x21,[sp, #-0x30]!
009bbfa4	stp x20,x19,[sp, #0x10]
009bbfa8	stp x29,x30,[sp, #0x20]
009bbfac	add x29,sp,#0x20
009bbfb0	mov w21,w2
009bbfb4	mov x22,x1
009bbfb8	mov x20,x0
009bbfbc	bl 0x00c32270
009bbfc0	bl 0x00c32240
009bbfc4	mov x19,x0
009bbfc8	cbz x0,0x009bc040
009bbfcc	mov w1,#0x6c
009bbfd0	orr w2,wzr,#0x3
009bbfd4	mov x0,x19
009bbfd8	mov x3,x22
009bbfdc	bl 0x00c321a0
009bbfe0	cmp w0,#0x0
009bbfe4	b.le 0x009bc070
009bbfe8	cmp w21,#0x2
009bbfec	b.eq 0x009bc09c
009bbff0	cmp w21,#0x1
009bbff4	b.ne 0x009bc0ec
009bbff8	ldp x2,x3,[x20, #0xb8]
009bbffc	ldr x4,[x20]
009bc000	ldr x5,[x20, #0x440]
009bc004	mov x0,x19
009bc008	mov x1,xzr
009bc00c	bl 0x00c35fa0
009bc010	mov w8,#0x2
009bc014	movk w8,#0x8, LSL #16
009bc018	mov x22,x0
009bc01c	add w21,w8,#0x7
009bc020	cbz x22,0x009bc0c4
009bc024	ldr x0,[x20, #0x158]
009bc028	mov x1,x22
009bc02c	bl 0x009bb8c0
009bc030	mov w20,w0
009bc034	mov x0,x22
009bc038	bl 0x00c32450
009bc03c	b 0x009bc11c
009bc040	bl 0x00c342a0
009bc044	adrp x0,0x2db000
009bc048	adrp x2,0x2a1000
009bc04c	add x0,x0,#0xaec
009bc050	add x2,x2,#0xf9e
009bc054	mov w1,#0x16a
009bc058	bl 0x00c342b0
009bc05c	mov w8,#0x2
009bc060	movk w8,#0x8, LSL #16
009bc064	add w1,w8,#0x5
009bc068	mov w0,#0x14
009bc06c	b 0x009bc110
009bc070	bl 0x00c342a0
009bc074	adrp x0,0x2db000
009bc078	adrp x2,0x2a1000
009bc07c	add x0,x0,#0xaec
009bc080	add x2,x2,#0xf9e
009bc084	mov w1,#0x16f
009bc088	bl 0x00c342b0
009bc08c	mov w1,#0x2
009bc090	mov w0,#0x14
009bc094	movk w1,#0x8, LSL #16
009bc098	b 0x009bc110
009bc09c	ldr x2,[x20]
009bc0a0	ldr x3,[x20, #0x440]
009bc0a4	mov x0,x19
009bc0a8	mov x1,xzr
009bc0ac	bl 0x00c36000
009bc0b0	mov w8,#0x2
009bc0b4	movk w8,#0x8, LSL #16
009bc0b8	mov x22,x0
009bc0bc	add w21,w8,#0xb
009bc0c0	cbnz x22,0x009bc024
009bc0c4	bl 0x00c342a0
009bc0c8	adrp x0,0x2db000
009bc0cc	adrp x2,0x2a1000
009bc0d0	add x0,x0,#0xaec
009bc0d4	add x2,x2,#0xf9e
009bc0d8	orr w1,wzr,#0x180
009bc0dc	bl 0x00c342b0
009bc0e0	mov w0,#0x14
009bc0e4	mov w1,w21
009bc0e8	b 0x009bc110
009bc0ec	bl 0x00c342a0
009bc0f0	adrp x0,0x2db000
009bc0f4	adrp x2,0x2a1000
009bc0f8	add x0,x0,#0xaec
009bc0fc	add x2,x2,#0xf9e
009bc100	mov w1,#0x17c
009bc104	bl 0x00c342b0
009bc108	mov w0,#0x14
009bc10c	orr w1,wzr,#0x7c
009bc110	mov x2,xzr
009bc114	bl 0x00c342c0
009bc118	mov w20,wzr
009bc11c	mov x0,x19
009bc120	bl 0x00c31a40
009bc124	mov w0,w20
009bc128	ldp x29,x30,[sp, #0x20]
009bc12c	ldp x20,x19,[sp, #0x10]
009bc130	ldp x22,x21,[sp], #0x30
009bc134	ret
