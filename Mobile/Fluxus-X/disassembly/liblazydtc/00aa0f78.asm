; ossl_pw_set_ui_method @ 00aa0f78
00aa0f78	stp x22,x21,[sp, #-0x30]!
00aa0f7c	stp x20,x19,[sp, #0x10]
00aa0f80	stp x29,x30,[sp, #0x20]
00aa0f84	add x29,sp,#0x20
00aa0f88	cbz x0,0x00aa0fc8
00aa0f8c	mov x21,x1
00aa0f90	cbz x1,0x00aa0fc8
00aa0f94	ldr w8,[x0]
00aa0f98	mov x19,x2
00aa0f9c	mov x20,x0
00aa0fa0	cmp w8,#0x1
00aa0fa4	b.ne 0x00aa1000
00aa0fa8	mov x22,x20
00aa0fac	ldr x1,[x22, #0x10]!
00aa0fb0	adrp x2,0x2b0000
00aa0fb4	add x2,x2,#0x38e
00aa0fb8	mov w3,#0x15
00aa0fbc	ldur x0,[x22, #-0x8]
00aa0fc0	bl 0x00c345e0
00aa0fc4	b 0x00aa1004
00aa0fc8	bl 0x00c342a0
00aa0fcc	adrp x0,0x2b0000
00aa0fd0	adrp x2,0x2d8000
00aa0fd4	add x0,x0,#0x38e
00aa0fd8	add x2,x2,#0x24f
00aa0fdc	mov w1,#0x56
00aa0fe0	bl 0x00c342b0
00aa0fe4	mov w1,#0x102
00aa0fe8	orr w0,wzr,#0xf
00aa0fec	movk w1,#0xc, LSL #16
00aa0ff0	mov x2,xzr
00aa0ff4	bl 0x00c342c0
00aa0ff8	mov w0,wzr
00aa0ffc	b 0x00aa1034
00aa1000	add x22,x20,#0x10
00aa1004	ldp x0,x1,[x20, #0x20]
00aa1008	adrp x2,0x2b0000
00aa100c	add x2,x2,#0x38e
00aa1010	mov w3,#0x1d
00aa1014	bl 0x00c345e0
00aa1018	movi v0.2D,#0x0
00aa101c	mov w8,#0x4
00aa1020	mov w0,#0x1
00aa1024	stp xzr,x21,[x20]
00aa1028	stp q0,q0,[x20, #0x10]
00aa102c	str w8,[x20]
00aa1030	str x19,[x22]
00aa1034	ldp x29,x30,[sp, #0x20]
00aa1038	ldp x20,x19,[sp, #0x10]
00aa103c	ldp x22,x21,[sp], #0x30
00aa1040	ret
