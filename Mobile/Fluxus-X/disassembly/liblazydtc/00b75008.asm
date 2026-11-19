; mbedtls_des3_set3key_dec @ 00b75008
00b75008	sub sp,sp,#0x1d0
00b7500c	str x28,[sp, #0x190]
00b75010	stp x22,x21,[sp, #0x1a0]
00b75014	stp x20,x19,[sp, #0x1b0]
00b75018	stp x29,x30,[sp, #0x1c0]
00b7501c	add x29,sp,#0x1c0
00b75020	mrs x21,tpidr_el0
00b75024	ldr x8,[x21, #0x28]
00b75028	mov x19,x0
00b7502c	add x0,sp,#0x8
00b75030	mov x20,x1
00b75034	stur x8,[x29, #-0x38]
00b75038	add x22,sp,#0x8
00b7503c	bl 0x00c424b0
00b75040	add x0,x19,#0x80
00b75044	add x1,x20,#0x8
00b75048	bl 0x00c424b0
00b7504c	add x0,x22,#0x100
00b75050	add x1,x20,#0x10
00b75054	bl 0x00c424b0
00b75058	mov x8,xzr
00b7505c	mov x9,xzr
00b75060	mov w10,#0x178
00b75064	add x11,x22,x10
00b75068	ldr x12,[x11]
00b7506c	add x13,x19,x8
00b75070	add x14,x19,x10
00b75074	add x9,x9,#0x2
00b75078	str x12,[x13]
00b7507c	ldur x12,[x14, #-0x80]
00b75080	add x14,x22,x8
00b75084	sub x10,x10,#0x8
00b75088	cmp x9,#0x20
00b7508c	str x12,[x14, #0x80]
00b75090	ldur x11,[x11, #-0x100]
00b75094	add x8,x8,#0x8
00b75098	str x11,[x13, #0x100]
00b7509c	b.cc 0x00b75064
00b750a0	add x0,sp,#0x8
00b750a4	orr w1,wzr,#0x180
00b750a8	bl 0x00c42220
00b750ac	ldr x8,[x21, #0x28]
00b750b0	ldur x9,[x29, #-0x38]
00b750b4	cmp x8,x9
00b750b8	b.ne 0x00b750d8
00b750bc	ldp x29,x30,[sp, #0x1c0]
00b750c0	ldp x20,x19,[sp, #0x1b0]
00b750c4	ldp x22,x21,[sp, #0x1a0]
00b750c8	ldr x28,[sp, #0x190]
00b750cc	mov w0,wzr
00b750d0	add sp,sp,#0x1d0
00b750d4	ret
00b750d8	bl 0x00c2fec0
