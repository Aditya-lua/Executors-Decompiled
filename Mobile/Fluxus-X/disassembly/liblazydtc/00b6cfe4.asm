; mbedtls_chachapoly_starts @ 00b6cfe4
00b6cfe4	sub sp,sp,#0x80
00b6cfe8	stp x22,x21,[sp, #0x50]
00b6cfec	stp x20,x19,[sp, #0x60]
00b6cff0	stp x29,x30,[sp, #0x70]
00b6cff4	add x29,sp,#0x70
00b6cff8	mrs x22,tpidr_el0
00b6cffc	ldr x8,[x22, #0x28]
00b6d000	mov w19,w2
00b6d004	mov w2,wzr
00b6d008	mov x20,x0
00b6d00c	stur x8,[x29, #-0x28]
00b6d010	bl 0x00c420a0
00b6d014	mov w21,w0
00b6d018	cbnz w0,0x00b6d06c
00b6d01c	movi v0.2D,#0x0
00b6d020	mov w1,#0x40
00b6d024	add x2,sp,#0x8
00b6d028	add x3,sp,#0x8
00b6d02c	mov x0,x20
00b6d030	stur q0,[sp, #0x38]
00b6d034	stur q0,[sp, #0x28]
00b6d038	stur q0,[sp, #0x18]
00b6d03c	stur q0,[sp, #0x8]
00b6d040	bl 0x00c420b0
00b6d044	mov w21,w0
00b6d048	cbnz w0,0x00b6d06c
00b6d04c	add x0,x20,#0x88
00b6d050	add x1,sp,#0x8
00b6d054	bl 0x00c42280
00b6d058	mov w21,w0
00b6d05c	cbnz w0,0x00b6d06c
00b6d060	mov w8,#0x1
00b6d064	stp xzr,xzr,[x20, #0xd8]
00b6d068	stp w8,w19,[x20, #0xe8]
00b6d06c	add x0,sp,#0x8
00b6d070	mov w1,#0x40
00b6d074	bl 0x00c42220
00b6d078	ldr x8,[x22, #0x28]
00b6d07c	ldur x9,[x29, #-0x28]
00b6d080	cmp x8,x9
00b6d084	b.ne 0x00b6d0a0
00b6d088	mov w0,w21
00b6d08c	ldp x29,x30,[sp, #0x70]
00b6d090	ldp x20,x19,[sp, #0x60]
00b6d094	ldp x22,x21,[sp, #0x50]
00b6d098	add sp,sp,#0x80
00b6d09c	ret
00b6d0a0	bl 0x00c2fec0
