; FUN_00967198 @ 00967198
00967198	str x19,[sp, #-0x20]!
0096719c	stp x29,x30,[sp, #0x10]
009671a0	add x29,sp,#0x10
009671a4	adrp x8,0xcc4000
009671a8	add x8,x8,#0x678
009671ac	mov x19,x0
009671b0	ldr x0,[x0, #0x10]
009671b4	ldr x8,[x8]
009671b8	blr x8
009671bc	str xzr,[x19, #0x10]
009671c0	str wzr,[x19, #0xc]
009671c4	ldp x29,x30,[sp, #0x10]
009671c8	ldr x19,[sp], #0x20
009671cc	ret
