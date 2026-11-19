; FUN_00c22edc @ 00c22edc
00c22edc	paciasp
00c22ee0	stp x29,x30,[sp, #-0x20]!
00c22ee4	str x19,[sp, #0x10]
00c22ee8	mov x29,sp
00c22eec	add x1,x29,#0x18
00c22ef0	mov x19,x0
00c22ef4	bl 0x00c1441c
00c22ef8	tbnz w0,#0x0,0x00c22f10
00c22efc	ldp x0,x8,[x19]
00c22f00	ldr x1,[x29, #0x18]
00c22f04	sub x8,x8,x0
00c22f08	cmp x8,x1
00c22f0c	b.cs 0x00c22f1c
00c22f10	mov x0,xzr
00c22f14	mov x1,xzr
00c22f18	b 0x00c22f24
00c22f1c	add x8,x0,x1
00c22f20	str x8,[x19]
00c22f24	ldr x19,[sp, #0x10]
00c22f28	ldp x29,x30,[sp], #0x20
00c22f2c	autiasp
00c22f30	ret
