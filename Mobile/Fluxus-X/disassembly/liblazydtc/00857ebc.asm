; FUN_00857ebc @ 00857ebc
00857ebc	stp x29,x30,[sp, #-0x30]!
00857ec0	str x21,[sp, #0x10]
00857ec4	stp x20,x19,[sp, #0x20]
00857ec8	mov x29,sp
00857ecc	ldr x20,[x0]
00857ed0	cbz x20,0x00857f34
00857ed4	ldr x21,[x0, #0x8]
00857ed8	mov x19,x0
00857edc	mov x0,x20
00857ee0	cmp x20,x21
00857ee4	b.ne 0x00857ef8
00857ee8	b 0x00857f18
00857eec	sub x21,x21,#0x30
00857ef0	cmp x21,x20
00857ef4	b.eq 0x00857f14
00857ef8	ldurb w8,[x21, #-0x18]
00857efc	tbz w8,#0x0,0x00857eec
00857f00	ldur x8,[x21, #-0x18]
00857f04	ldur x0,[x21, #-0x8]
00857f08	and x1,x8,#-0x2
00857f0c	bl 0x00c2fe80
00857f10	b 0x00857eec
00857f14	ldr x0,[x19]
00857f18	ldr x8,[x19, #0x10]
00857f1c	str x20,[x19, #0x8]
00857f20	sub x1,x8,x0
00857f24	ldp x20,x19,[sp, #0x20]
00857f28	ldr x21,[sp, #0x10]
00857f2c	ldp x29,x30,[sp], #0x30
00857f30	b 0x00c2fe80
00857f34	ldp x20,x19,[sp, #0x20]
00857f38	ldr x21,[sp, #0x10]
00857f3c	ldp x29,x30,[sp], #0x30
00857f40	ret
