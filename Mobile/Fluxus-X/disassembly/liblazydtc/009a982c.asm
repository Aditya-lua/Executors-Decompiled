; ssl3_shutdown @ 009a982c
009a982c	str x19,[sp, #-0x20]!
009a9830	stp x29,x30,[sp, #0x10]
009a9834	ldr w8,[x0, #0x40]
009a9838	mov x19,x0
009a983c	add x29,sp,#0x10
009a9840	cbnz w8,0x009a9850
009a9844	mov x0,x19
009a9848	bl 0x00c347f0
009a984c	cbz w0,0x009a9868
009a9850	orr w8,wzr,#0x3
009a9854	str w8,[x19, #0x44]
009a9858	mov w0,#0x1
009a985c	ldp x29,x30,[sp, #0x10]
009a9860	ldr x19,[sp], #0x20
009a9864	ret
009a9868	ldr w8,[x19, #0x44]
009a986c	tbnz w8,#0x0,0x009a9898
009a9870	orr w8,w8,#0x1
009a9874	mov w1,#0x1
009a9878	mov x0,x19
009a987c	mov w2,wzr
009a9880	str w8,[x19, #0x44]
009a9884	bl 0x00c34890
009a9888	ldr w8,[x19, #0x1a4]
009a988c	cbz w8,0x009a98f4
009a9890	mov w0,#0xffffffff
009a9894	b 0x009a985c
009a9898	ldr w9,[x19, #0x1a4]
009a989c	cbz w9,0x009a98bc
009a98a0	ldr x8,[x19, #0x8]
009a98a4	mov x0,x19
009a98a8	ldr x8,[x8, #0x78]
009a98ac	blr x8
009a98b0	cmn w0,#0x1
009a98b4	b.ne 0x009a98f4
009a98b8	b 0x009a985c
009a98bc	tbnz w8,#0x1,0x009a98f4
009a98c0	ldr x8,[x19, #0x8]
009a98c4	add x6,sp,#0x8
009a98c8	mov x0,x19
009a98cc	mov w1,wzr
009a98d0	ldr x8,[x8, #0x68]
009a98d4	mov x2,xzr
009a98d8	mov x3,xzr
009a98dc	mov x4,xzr
009a98e0	mov w5,wzr
009a98e4	blr x8
009a98e8	ldr w8,[x19, #0x44]
009a98ec	tbz w8,#0x1,0x009a9890
009a98f0	b 0x009a98f8
009a98f4	ldr w8,[x19, #0x44]
009a98f8	cmp w8,#0x3
009a98fc	b.ne 0x009a9908
009a9900	ldr w8,[x19, #0x1a4]
009a9904	cbz w8,0x009a9858
009a9908	mov w0,wzr
009a990c	b 0x009a985c
