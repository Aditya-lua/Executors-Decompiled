; FUN_007ff3d4 @ 007ff3d4
007ff3d4	ldp x9,x8,[x0, #0x8]
007ff3d8	subs x9,x9,x8
007ff3dc	b.eq 0x007ff3f0
007ff3e0	add x9,x9,#0x7
007ff3e4	and x9,x9,#-0x8
007ff3e8	add x8,x8,x9
007ff3ec	str x8,[x0, #0x10]
007ff3f0	ldr x8,[x0]
007ff3f4	cbz x8,0x007ff408
007ff3f8	ldr x9,[x0, #0x18]
007ff3fc	mov x0,x8
007ff400	sub x1,x9,x8
007ff404	b 0x00c2fe80
007ff408	ret
