; psa_aead_update_ad @ 00b8c888
00b8c888	stp x22,x21,[sp, #-0x30]!
00b8c88c	stp x20,x19,[sp, #0x10]
00b8c890	stp x29,x30,[sp, #0x20]
00b8c894	add x29,sp,#0x20
00b8c898	mov x21,x2
00b8c89c	mov x22,x1
00b8c8a0	mov x20,x0
00b8c8a4	cbz x2,0x00b8c934
00b8c8a8	mov w1,#0x1
00b8c8ac	mov x0,x21
00b8c8b0	bl 0x00c30a30
00b8c8b4	mov x19,x0
00b8c8b8	cbz x0,0x00b8c948
00b8c8bc	mov x0,x19
00b8c8c0	mov x1,x22
00b8c8c4	mov x2,x21
00b8c8c8	bl 0x00c2ffd0
00b8c8cc	ldr w8,[x20]
00b8c8d0	cbz w8,0x00b8c940
00b8c8d4	ldrb w9,[x20, #0x20]
00b8c8d8	mov w10,#0x9
00b8c8dc	and w10,w9,w10
00b8c8e0	cmp w10,#0x1
00b8c8e4	b.ne 0x00b8c904
00b8c8e8	cbz x21,0x00b8c98c
00b8c8ec	tbnz w9,#0x1,0x00b8c958
00b8c8f0	ldr w9,[x20, #0x4]
00b8c8f4	mov w10,#0x100
00b8c8f8	movk w10,#0x550, LSL #16
00b8c8fc	cmp w9,w10
00b8c900	b.ne 0x00b8c968
00b8c904	mov w21,#0xffffff77
00b8c908	ldr w8,[x20]
00b8c90c	cbz w8,0x00b8c9a8
00b8c910	cmp w8,#0x1
00b8c914	b.ne 0x00b8c920
00b8c918	add x0,x20,#0x28
00b8c91c	bl 0x00c42db0
00b8c920	mov w2,#0x1d8
00b8c924	mov x0,x20
00b8c928	mov w1,wzr
00b8c92c	bl 0x00c301c0
00b8c930	b 0x00b8c9a8
00b8c934	mov x19,xzr
00b8c938	ldr w8,[x20]
00b8c93c	cbnz w8,0x00b8c8d4
00b8c940	mov w21,#0xffffff77
00b8c944	b 0x00b8c9a8
00b8c948	mov w21,#0xffffff73
00b8c94c	ldr w8,[x20]
00b8c950	cbnz w8,0x00b8c910
00b8c954	b 0x00b8c9a8
00b8c958	ldr x9,[x20, #0x10]
00b8c95c	subs x9,x9,x21
00b8c960	b.cc 0x00b8c99c
00b8c964	str x9,[x20, #0x10]
00b8c968	cmp w8,#0x1
00b8c96c	b.ne 0x00b8c99c
00b8c970	add x0,x20,#0x28
00b8c974	mov x1,x19
00b8c978	mov x2,x21
00b8c97c	bl 0x00c42e40
00b8c980	mov w21,w0
00b8c984	cbnz w0,0x00b8c94c
00b8c988	ldrb w9,[x20, #0x20]
00b8c98c	mov w21,wzr
00b8c990	orr w8,w9,#0x4
00b8c994	strb w8,[x20, #0x20]
00b8c998	b 0x00b8c9a8
00b8c99c	mov w21,#0xffffff79
00b8c9a0	ldr w8,[x20]
00b8c9a4	cbnz w8,0x00b8c910
00b8c9a8	mov x0,x19
00b8c9ac	bl 0x00c30960
00b8c9b0	ldp x29,x30,[sp, #0x20]
00b8c9b4	ldp x20,x19,[sp, #0x10]
00b8c9b8	mov w0,w21
00b8c9bc	ldp x22,x21,[sp], #0x30
00b8c9c0	ret
