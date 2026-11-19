; dtls1_retrieve_buffered_record @ 009c9540
009c9540	stp x22,x21,[sp, #-0x30]!
009c9544	stp x20,x19,[sp, #0x10]
009c9548	stp x29,x30,[sp, #0x20]
009c954c	ldr x8,[x1, #0x8]
009c9550	mov x20,x0
009c9554	add x29,sp,#0x20
009c9558	mov x0,x8
009c955c	bl 0x00c34460
009c9560	cbz x0,0x009c95f0
009c9564	ldr x22,[x0, #0x8]
009c9568	add x21,x20,#0xc78
009c956c	mov x19,x0
009c9570	mov x0,x21
009c9574	bl 0x00c36b00
009c9578	ldr q0,[x22]
009c957c	mov w8,#0x1ca8
009c9580	add x1,x22,#0x40
009c9584	mov w2,#0x50
009c9588	str q0,[x20,x8]
009c958c	ldr q0,[x22, #0x30]
009c9590	add x8,x20,#0xc98
009c9594	str q0,[x8]
009c9598	ldr q0,[x22, #0x20]
009c959c	add x8,x20,#0xc88
009c95a0	str q0,[x8]
009c95a4	ldr q0,[x22, #0x10]
009c95a8	mov w8,#0x12a8
009c95ac	add x0,x20,x8
009c95b0	str q0,[x21]
009c95b4	bl 0x00c2ffd0
009c95b8	ldr x8,[x22]
009c95bc	mov w10,#0x1cfa
009c95c0	adrp x1,0x2a3000
009c95c4	add x1,x1,#0xcf1
009c95c8	ldur w9,[x8, #0x5]
009c95cc	mov w2,#0xd4
009c95d0	str w9,[x20, x10#0x0]
009c95d4	ldurh w8,[x8, #0x9]
009c95d8	strh w8,[x20, #0x1cfe]
009c95dc	ldr x0,[x19, #0x8]
009c95e0	bl 0x00c32310
009c95e4	mov x0,x19
009c95e8	bl 0x00c34430
009c95ec	mov w0,#0x1
009c95f0	ldp x29,x30,[sp, #0x20]
009c95f4	ldp x20,x19,[sp, #0x10]
009c95f8	ldp x22,x21,[sp], #0x30
009c95fc	ret
