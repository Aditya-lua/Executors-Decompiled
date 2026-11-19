; FUN_007ff59c @ 007ff59c
007ff59c	stp x29,x30,[sp, #-0x20]!
007ff5a0	str x19,[sp, #0x10]
007ff5a4	mov x29,sp
007ff5a8	ldr x19,[x0]
007ff5ac	str xzr,[x0]
007ff5b0	cbz x19,0x007ff5d0
007ff5b4	mov x0,x19
007ff5b8	bl 0x00c301a0
007ff5bc	mov x0,x19
007ff5c0	mov w1,#0x8
007ff5c4	ldr x19,[sp, #0x10]
007ff5c8	ldp x29,x30,[sp], #0x20
007ff5cc	b 0x00c2fe80
007ff5d0	ldr x19,[sp, #0x10]
007ff5d4	ldp x29,x30,[sp], #0x20
007ff5d8	ret
