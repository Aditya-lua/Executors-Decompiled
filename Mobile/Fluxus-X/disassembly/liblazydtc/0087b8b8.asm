; FUN_0087b8b8 @ 0087b8b8
0087b8b8	ldr x8,[x0, #0x28]
0087b8bc	cbz x8,0x0087b9a4
0087b8c0	stp x29,x30,[sp, #-0x30]!
0087b8c4	str x21,[sp, #0x10]
0087b8c8	stp x20,x19,[sp, #0x20]
0087b8cc	mov x29,sp
0087b8d0	ldr x21,[x0, #0x20]
0087b8d4	mov x20,x0
0087b8d8	mov x19,x1
0087b8dc	bl 0x0087337c
0087b8e0	mov x8,#0x7c15
0087b8e4	ldrb w9,[x20, #0x30]
0087b8e8	movk x8,#0x7f4a, LSL #16
0087b8ec	movk x8,#0x79b9, LSL #32
0087b8f0	movk x8,#0x9e37, LSL #48
0087b8f4	mul x8,x0,x8
0087b8f8	lsr x8,x8,x9
0087b8fc	ldr x9,[x20, #0x18]
0087b900	lsr x10,x8,#0x6
0087b904	ldr x10,[x9, x10, LSL #0x3]
0087b908	lsr x10,x10,x8
0087b90c	tbz w10,#0x0,0x0087b990
0087b910	ldp x12,x13,[x19, #0x8]
0087b914	sub x16,x21,#0x1
0087b918	ldp x14,x15,[x19, #0x18]
0087b91c	mov w17,#0x30
0087b920	ldr x10,[x20]
0087b924	ldr w11,[x19]
0087b928	b 0x0087b944
0087b92c	add x8,x8,#0x1
0087b930	and x8,x8,x16
0087b934	lsr x0,x8,#0x6
0087b938	ldr x0,[x9, x0, LSL #0x3]
0087b93c	lsr x0,x0,x8
0087b940	tbz w0,#0x0,0x0087b990
0087b944	madd x0,x8,x17,x10
0087b948	ldr w1,[x0]
0087b94c	cmp w1,w11
0087b950	b.ne 0x0087b92c
0087b954	ldr x1,[x0, #0x8]
0087b958	cmp x1,x12
0087b95c	b.ne 0x0087b92c
0087b960	ldr x1,[x0, #0x10]
0087b964	cmp x1,x13
0087b968	b.ne 0x0087b92c
0087b96c	ldr x1,[x0, #0x18]
0087b970	cmp x1,x14
0087b974	b.ne 0x0087b92c
0087b978	ldr x0,[x0, #0x20]
0087b97c	cmp x0,x15
0087b980	b.ne 0x0087b92c
0087b984	mov w9,#0x30
0087b988	madd x0,x8,x9,x10
0087b98c	b 0x0087b994
0087b990	mov x0,xzr
0087b994	ldp x20,x19,[sp, #0x20]
0087b998	ldr x21,[sp, #0x10]
0087b99c	ldp x29,x30,[sp], #0x30
0087b9a0	ret
0087b9a4	mov x0,xzr
0087b9a8	ret
