; FUN_0092bb60 @ 0092bb60
0092bb60	stp x20,x19,[sp, #-0x20]!
0092bb64	stp x29,x30,[sp, #0x10]
0092bb68	add x29,sp,#0x10
0092bb6c	mov x19,x0
0092bb70	mov x20,x1
0092bb74	str x1,[x0, #0x20]
0092bb78	add x0,x1,#0x3d0
0092bb7c	add x2,x19,#0x40
0092bb80	mov x1,x19
0092bb84	bl 0x00925d10
0092bb88	ldr x8,[x20, #0x3a8]
0092bb8c	cbz x8,0x0092bba4
0092bb90	ldr x8,[x8, #0x80]
0092bb94	cbz x8,0x0092bba4
0092bb98	mov x0,x19
0092bb9c	mov x1,x20
0092bba0	blr x8
0092bba4	ldp x29,x30,[sp, #0x10]
0092bba8	mov x0,x20
0092bbac	mov x1,x19
0092bbb0	ldp x20,x19,[sp], #0x20
0092bbb4	b 0x00907d84
