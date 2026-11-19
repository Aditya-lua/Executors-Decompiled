; evp_keymgmt_gen_init @ 00a6697c
00a6697c	str x21,[sp, #-0x30]!
00a66980	stp x20,x19,[sp, #0x10]
00a66984	stp x29,x30,[sp, #0x20]
00a66988	mov x21,x0
00a6698c	ldr x0,[x0, #0x18]
00a66990	add x29,sp,#0x20
00a66994	mov x19,x2
00a66998	mov w20,w1
00a6699c	bl 0x00c3b680
00a669a0	ldr x3,[x21, #0x60]
00a669a4	cbz x3,0x00a669c0
00a669a8	mov w1,w20
00a669ac	mov x2,x19
00a669b0	ldp x29,x30,[sp, #0x20]
00a669b4	ldp x20,x19,[sp, #0x10]
00a669b8	ldr x21,[sp], #0x30
00a669bc	br x3
00a669c0	ldp x29,x30,[sp, #0x20]
00a669c4	ldp x20,x19,[sp, #0x10]
00a669c8	mov x0,xzr
00a669cc	ldr x21,[sp], #0x30
00a669d0	ret
