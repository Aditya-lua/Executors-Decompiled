; BN_uadd @ 00a08984
00a08984	stp x24,x23,[sp, #-0x40]!
00a08988	stp x22,x21,[sp, #0x10]
00a0898c	stp x20,x19,[sp, #0x20]
00a08990	stp x29,x30,[sp, #0x30]
00a08994	ldr w8,[x1, #0x8]
00a08998	ldr w9,[x2, #0x8]
00a0899c	add x29,sp,#0x30
00a089a0	mov x19,x0
00a089a4	cmp w8,w9
00a089a8	csel x22,x2,x1,lt
00a089ac	ldr w23,[x22, #0x8]
00a089b0	csel x20,x1,x2,lt
00a089b4	ldrsw x21,[x20, #0x8]
00a089b8	add w1,w23,#0x1
00a089bc	bl 0x00c38e80
00a089c0	cbz x0,0x00a08a40
00a089c4	str w23,[x19, #0x8]
00a089c8	ldr x22,[x22]
00a089cc	ldr x2,[x20]
00a089d0	ldr x20,[x19]
00a089d4	mov w3,w21
00a089d8	mov x1,x22
00a089dc	sub w24,w23,w21
00a089e0	mov x0,x20
00a089e4	bl 0x00c388b0
00a089e8	add x8,x20,x21, LSL #0x3
00a089ec	cbz w24,0x00a08a28
00a089f0	sub w10,w23,#0x1
00a089f4	sub w10,w10,w21
00a089f8	add x10,x21,x10
00a089fc	add x9,x22,x21, LSL #0x3
00a08a00	add x10,x10,#0x1
00a08a04	sub w11,w21,w23
00a08a08	ldr x12,[x9], #0x8
00a08a0c	adds x12,x12,x0
00a08a10	str x12,[x8], #0x8
00a08a14	cset w12,eq
00a08a18	adds w11,w11,#0x1
00a08a1c	and x0,x0,x12
00a08a20	b.ne 0x00a08a08
00a08a24	add x8,x20,x10, LSL #0x3
00a08a28	str x0,[x8]
00a08a2c	ldr w8,[x19, #0x8]
00a08a30	str wzr,[x19, #0x10]
00a08a34	add w8,w8,w0
00a08a38	mov w0,#0x1
00a08a3c	str w8,[x19, #0x8]
00a08a40	ldp x29,x30,[sp, #0x30]
00a08a44	ldp x20,x19,[sp, #0x20]
00a08a48	ldp x22,x21,[sp, #0x10]
00a08a4c	ldp x24,x23,[sp], #0x40
00a08a50	ret
