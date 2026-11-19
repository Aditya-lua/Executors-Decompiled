; FUN_009083b8 @ 009083b8
009083b8	sub sp,sp,#0x30
009083bc	stp x20,x19,[sp, #0x10]
009083c0	stp x29,x30,[sp, #0x20]
009083c4	add x29,sp,#0x20
009083c8	mrs x20,tpidr_el0
009083cc	ldr x8,[x20, #0x28]
009083d0	mov x19,x4
009083d4	add x4,sp,#0x4
009083d8	str x8,[sp, #0x8]
009083dc	str wzr,[sp, #0x4]
009083e0	ldr x8,[x0, #0x20]
009083e4	add x8,x8,w1, SXTW  #0x3
009083e8	ldr x8,[x8, #0x238]
009083ec	blr x8
009083f0	bic x8,x0,x0, ASR #0x3f
009083f4	str x8,[x19]
009083f8	ldr w0,[sp, #0x4]
009083fc	ldr x8,[x20, #0x28]
00908400	ldr x9,[sp, #0x8]
00908404	cmp x8,x9
00908408	b.ne 0x0090841c
0090840c	ldp x29,x30,[sp, #0x20]
00908410	ldp x20,x19,[sp, #0x10]
00908414	add sp,sp,#0x30
00908418	ret
0090841c	bl 0x00c2fec0
