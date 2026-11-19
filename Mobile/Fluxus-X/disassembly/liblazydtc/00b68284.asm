; ossl_cipher_hw_generic_ecb @ 00b68284
00b68284	stp x24,x23,[sp, #-0x40]!
00b68288	stp x22,x21,[sp, #0x10]
00b6828c	stp x20,x19,[sp, #0x20]
00b68290	stp x29,x30,[sp, #0x30]
00b68294	ldr x22,[x0, #0x58]
00b68298	add x29,sp,#0x30
00b6829c	cmp x22,x3
00b682a0	b.hi 0x00b68304
00b682a4	ldr x9,[x0, #0x38]
00b682a8	mov x19,x2
00b682ac	mov x21,x0
00b682b0	mov x20,x1
00b682b4	cbz x9,0x00b682dc
00b682b8	ldrb w10,[x21, #0x6c]
00b682bc	ldr x8,[x21, #0xb0]
00b682c0	mov x0,x19
00b682c4	mov x1,x20
00b682c8	ubfx w4,w10,#0x1,#0x1
00b682cc	mov x2,x3
00b682d0	mov x3,x8
00b682d4	blr x9
00b682d8	b 0x00b68304
00b682dc	mov x23,xzr
00b682e0	sub x24,x3,x22
00b682e4	ldr x8,[x21, #0x30]
00b682e8	ldr x2,[x21, #0xb0]
00b682ec	add x0,x19,x23
00b682f0	add x1,x20,x23
00b682f4	blr x8
00b682f8	add x23,x23,x22
00b682fc	cmp x23,x24
00b68300	b.ls 0x00b682e4
00b68304	ldp x29,x30,[sp, #0x30]
00b68308	ldp x20,x19,[sp, #0x20]
00b6830c	ldp x22,x21,[sp, #0x10]
00b68310	mov w0,#0x1
00b68314	ldp x24,x23,[sp], #0x40
00b68318	ret
