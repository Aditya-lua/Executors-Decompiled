; FUN_007fe188 @ 007fe188
007fe188	stp x29,x30,[sp, #-0x20]!
007fe18c	str x19,[sp, #0x10]
007fe190	mov x29,sp
007fe194	mov x19,x0
007fe198	bl 0x00c30040
007fe19c	adrp x8,0xcb4000
007fe1a0	ldr x8,[x8, #0x980]
007fe1a4	add x8,x8,#0x10
007fe1a8	str x8,[x19]
007fe1ac	ldr x19,[sp, #0x10]
007fe1b0	ldp x29,x30,[sp], #0x20
007fe1b4	ret
