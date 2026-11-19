; ossl_cipher_fillblock @ 00b662b8
00b662b8	str x23,[sp, #-0x40]!
00b662bc	stp x22,x21,[sp, #0x10]
00b662c0	stp x20,x19,[sp, #0x20]
00b662c4	stp x29,x30,[sp, #0x30]
00b662c8	ldr x8,[x1]
00b662cc	ldr x9,[x4]
00b662d0	mov x21,x1
00b662d4	ldr x1,[x3]
00b662d8	sub x10,x2,x8
00b662dc	cmp x9,x10
00b662e0	csel x22,x9,x10,cc
00b662e4	neg x23,x2
00b662e8	add x0,x0,x8
00b662ec	mov x2,x22
00b662f0	add x29,sp,#0x30
00b662f4	mov x19,x4
00b662f8	mov x20,x3
00b662fc	bl 0x00c2ffd0
00b66300	ldr x8,[x20]
00b66304	add x8,x8,x22
00b66308	str x8,[x20]
00b6630c	ldr x8,[x19]
00b66310	sub x8,x8,x22
00b66314	str x8,[x19]
00b66318	ldr x8,[x21]
00b6631c	add x8,x8,x22
00b66320	str x8,[x21]
00b66324	ldr x8,[x19]
00b66328	ldp x29,x30,[sp, #0x30]
00b6632c	ldp x20,x19,[sp, #0x20]
00b66330	ldp x22,x21,[sp, #0x10]
00b66334	and x0,x8,x23
00b66338	ldr x23,[sp], #0x40
00b6633c	ret
