; _INIT_17 @ 007fdafc
007fdafc	sub sp,sp,#0x30
007fdb00	stp x29,x30,[sp, #0x10]
007fdb04	stp x20,x19,[sp, #0x20]
007fdb08	add x29,sp,#0x10
007fdb0c	mrs x19,tpidr_el0
007fdb10	nop
007fdb14	adr x1,0x7fdb84
007fdb18	ldr x8,[x19, #0x28]
007fdb1c	mov x0,sp
007fdb20	str x8,[sp, #0x8]
007fdb24	bl 0x007fdc48
007fdb28	mov x0,sp
007fdb2c	bl 0x00c2ff70
007fdb30	mov x0,sp
007fdb34	bl 0x00c2ff80
007fdb38	ldr x8,[x19, #0x28]
007fdb3c	ldr x9,[sp, #0x8]
007fdb40	cmp x8,x9
007fdb44	b.ne 0x007fdb80
007fdb48	ldp x20,x19,[sp, #0x20]
007fdb4c	ldp x29,x30,[sp, #0x10]
007fdb50	add sp,sp,#0x30
007fdb54	ret
007fdb80	bl 0x00c2fec0
