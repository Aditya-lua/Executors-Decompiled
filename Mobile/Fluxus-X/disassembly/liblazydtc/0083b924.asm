; FUN_0083b924 @ 0083b924
0083b924	sub sp,sp,#0x40
0083b928	stp x29,x30,[sp, #0x10]
0083b92c	stp x22,x21,[sp, #0x20]
0083b930	stp x20,x19,[sp, #0x30]
0083b934	add x29,sp,#0x10
0083b938	mrs x22,tpidr_el0
0083b93c	mov x21,x2
0083b940	mov x19,x1
0083b944	ldr x8,[x22, #0x28]
0083b948	mov x20,x0
0083b94c	str x8,[sp, #0x8]
0083b950	ldrb w8,[x2, #0xb]
0083b954	cmp w8,#0x1
0083b958	b.ne 0x0083b9a4
0083b95c	adrp x8,0x29b000
0083b960	ldr d0,[x21]
0083b964	ldrb w9,[x21, #0x8]
0083b968	ldrb w10,[x21, #0x9]
0083b96c	ldr d1,[x8, #0x200]
0083b970	mov w11,#0x65
0083b974	mov w8,#0x4f
0083b978	eor w9,w9,w11
0083b97c	strb wzr,[x21, #0xb]
0083b980	eor w8,w10,w8
0083b984	ldrb w10,[x21, #0xa]
0083b988	eor v0.8B,v0.8B,v1.8B
0083b98c	strb w9,[x21, #0x8]
0083b990	mov w9,#0x45
0083b994	eor w9,w10,w9
0083b998	strb w8,[x21, #0x9]
0083b99c	strb w9,[x21, #0xa]
0083b9a0	str d0,[x21]
0083b9a4	mov x0,x20
0083b9a8	mov x1,x19
0083b9ac	mov x2,x21
0083b9b0	mov w3,wzr
0083b9b4	mov x4,xzr
0083b9b8	bl 0x008ac76c
0083b9bc	mov x0,x20
0083b9c0	mov w1,#0xffffffff
0083b9c4	bl 0x008aa2e4
0083b9c8	ldr x8,[x0]
0083b9cc	adrp x0,0xd1e000
0083b9d0	add x0,x0,#0x30
0083b9d4	mov x1,sp
0083b9d8	mov x2,sp
0083b9dc	str x8,[sp]
0083b9e0	bl 0x00807f14
0083b9e4	adrp x0,0xcca000
0083b9e8	add x0,x0,#0x848
0083b9ec	mov x1,sp
0083b9f0	mov x2,sp
0083b9f4	str x19,[sp]
0083b9f8	bl 0x0080837c
0083b9fc	mov x0,x20
0083ba00	mov w1,#0xffffd8ee
0083ba04	mov x2,x21
0083ba08	bl 0x008ad800
0083ba0c	ldr x8,[x22, #0x28]
0083ba10	ldr x9,[sp, #0x8]
0083ba14	cmp x8,x9
0083ba18	b.ne 0x0083ba30
0083ba1c	ldp x20,x19,[sp, #0x30]
0083ba20	ldp x22,x21,[sp, #0x20]
0083ba24	ldp x29,x30,[sp, #0x10]
0083ba28	add sp,sp,#0x40
0083ba2c	ret
0083ba30	bl 0x00c2fec0
