; EVP_RAND_CTX_free @ 00ac993c
00ac993c	stp x22,x21,[sp, #-0x30]!
00ac9940	stp x20,x19,[sp, #0x10]
00ac9944	stp x29,x30,[sp, #0x20]
00ac9948	add x29,sp,#0x20
00ac994c	cbz x0,0x00ac9a18
00ac9950	adrp x19,0x2ce000
00ac9954	mov x21,x0
00ac9958	add x19,x19,#0x291
00ac995c	mov x20,x21
00ac9960	add x9,x21,#0x18
00ac9964	ldxr w8,[x9]
00ac9968	subs w10,w8,#0x1
00ac996c	stxr w11,w10,[x9]
00ac9970	cbnz w11,0x00ac9964
00ac9974	b.ne 0x00ac9980
00ac9978	dmb ISHLD
00ac997c	b 0x00ac9988
00ac9980	cmp w8,#0x1
00ac9984	b.gt 0x00ac9a18
00ac9988	ldp x8,x0,[x20]
00ac998c	ldr x21,[x20, #0x10]
00ac9990	ldr x8,[x8, #0x40]
00ac9994	blr x8
00ac9998	ldr x22,[x20]
00ac999c	str xzr,[x20, #0x8]
00ac99a0	cbz x22,0x00ac99fc
00ac99a4	add x9,x22,#0x20
00ac99a8	ldxr w8,[x9]
00ac99ac	subs w10,w8,#0x1
00ac99b0	stxr w11,w10,[x9]
00ac99b4	cbnz w11,0x00ac99a8
00ac99b8	b.ne 0x00ac99c4
00ac99bc	dmb ISHLD
00ac99c0	b 0x00ac99cc
00ac99c4	cmp w8,#0x1
00ac99c8	b.gt 0x00ac99fc
00ac99cc	ldr x0,[x22, #0x10]
00ac99d0	mov w2,#0x48
00ac99d4	mov x1,x19
00ac99d8	bl 0x00c32310
00ac99dc	ldr x0,[x22]
00ac99e0	bl 0x00c3b690
00ac99e4	ldr x0,[x22, #0x28]
00ac99e8	bl 0x00c34d40
00ac99ec	mov w2,#0x4b
00ac99f0	mov x0,x22
00ac99f4	mov x1,x19
00ac99f8	bl 0x00c32310
00ac99fc	ldr x0,[x20, #0x20]
00ac9a00	bl 0x00c34d40
00ac9a04	mov w2,#0x185
00ac9a08	mov x0,x20
00ac9a0c	mov x1,x19
00ac9a10	bl 0x00c32310
00ac9a14	cbnz x21,0x00ac995c
00ac9a18	ldp x29,x30,[sp, #0x20]
00ac9a1c	ldp x20,x19,[sp, #0x10]
00ac9a20	ldp x22,x21,[sp], #0x30
00ac9a24	ret
