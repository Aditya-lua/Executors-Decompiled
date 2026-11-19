; FUN_007fdf5c @ 007fdf5c
007fdf5c	stp x29,x30,[sp, #-0x40]!
007fdf60	str x23,[sp, #0x10]
007fdf64	stp x22,x21,[sp, #0x20]
007fdf68	stp x20,x19,[sp, #0x30]
007fdf6c	mov x29,sp
007fdf70	mov x19,x2
007fdf74	cmp x2,#0x16
007fdf78	mov x20,x0
007fdf7c	b.hi 0x007fdfa0
007fdf80	lsl w8,w19,#0x1
007fdf84	mov x21,x20
007fdf88	strb w8,[x21], #0x1
007fdf8c	cbz x19,0x007fdfe4
007fdf90	mov x0,x21
007fdf94	mov x2,x19
007fdf98	bl 0x00c2ff60
007fdf9c	b 0x007fdfe4
007fdfa0	add x8,x19,#0x9
007fdfa4	cmp x8,#0x1e
007fdfa8	b.ls 0x007fe000
007fdfac	cmp x19,#0x2c
007fdfb0	mov w8,#0x2c
007fdfb4	mov x22,x1
007fdfb8	csel x8,x19,x8,hi
007fdfbc	orr x23,x8,#0x7
007fdfc0	add x0,x23,#0x1
007fdfc4	bl 0x00c2fed0
007fdfc8	mov x1,x22
007fdfcc	mov x2,x19
007fdfd0	mov x21,x0
007fdfd4	bl 0x00c2ffd0
007fdfd8	add x8,x23,#0x2
007fdfdc	stp x19,x21,[x20, #0x8]
007fdfe0	str x8,[x20]
007fdfe4	mov x0,x20
007fdfe8	strb wzr,[x21, x19]
007fdfec	ldp x20,x19,[sp, #0x30]
007fdff0	ldr x23,[sp, #0x10]
007fdff4	ldp x22,x21,[sp, #0x20]
007fdff8	ldp x29,x30,[sp], #0x40
007fdffc	ret
007fe000	bl 0x007fe124
