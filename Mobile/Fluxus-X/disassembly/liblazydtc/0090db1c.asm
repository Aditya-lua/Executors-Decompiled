; FUN_0090db1c @ 0090db1c
0090db1c	sub sp,sp,#0x1e0
0090db20	stp x28,x23,[sp, #0x1a0]
0090db24	stp x22,x21,[sp, #0x1b0]
0090db28	stp x20,x19,[sp, #0x1c0]
0090db2c	stp x29,x30,[sp, #0x1d0]
0090db30	add x29,sp,#0x1d0
0090db34	mrs x21,tpidr_el0
0090db38	ldr x8,[x21, #0x28]
0090db3c	add x22,sp,#0x8
0090db40	mov x19,x1
0090db44	str x8,[x22]
0090db48	ldr x23,[x0, #0x10]
0090db4c	ldr w20,[x23, #0x98]
0090db50	cmn w20,#0x1
0090db54	b.eq 0x0090dc04
0090db58	ldr x8,[x19, #0x20]
0090db5c	ldr x8,[x8, #0x3a8]
0090db60	ldrb w8,[x8, #0x8d]
0090db64	tbnz w8,#0x3,0x0090dc04
0090db68	mov w8,#0x80
0090db6c	add x0,sp,#0x18
0090db70	mov w2,#0x80
0090db74	mov w1,wzr
0090db78	str w8,[sp, #0x14]
0090db7c	bl 0x00c301c0
0090db80	add x1,sp,#0x18
0090db84	add x2,sp,#0x14
0090db88	mov w0,w20
0090db8c	bl 0x00c31c20
0090db90	cbz w0,0x0090dbbc
0090db94	bl 0x00c30710
0090db98	ldr w20,[x0]
0090db9c	add x1,sp,#0x98
0090dba0	mov w2,#0x100
0090dba4	mov w0,w20
0090dba8	bl 0x00941a94
0090dbac	adrp x1,0x29d000
0090dbb0	mov x3,x0
0090dbb4	add x1,x1,#0x694
0090dbb8	b 0x0090dbf8
0090dbbc	ldr w1,[sp, #0x14]
0090dbc0	add x2,x23,#0xca
0090dbc4	add x3,x23,#0xfc
0090dbc8	add x0,sp,#0x18
0090dbcc	bl 0x00908a98
0090dbd0	tbnz w0,#0x0,0x0090dc04
0090dbd4	bl 0x00c30710
0090dbd8	ldr w20,[x0]
0090dbdc	add x1,sp,#0x98
0090dbe0	mov w2,#0x100
0090dbe4	mov w0,w20
0090dbe8	bl 0x00941a94
0090dbec	adrp x1,0x2d5000
0090dbf0	mov x3,x0
0090dbf4	add x1,x1,#0x6b
0090dbf8	mov x0,x19
0090dbfc	mov w2,w20
0090dc00	bl 0x00904b80
0090dc04	ldr x8,[x21, #0x28]
0090dc08	ldr x9,[x22]
0090dc0c	cmp x8,x9
0090dc10	b.ne 0x0090dc2c
0090dc14	ldp x29,x30,[sp, #0x1d0]
0090dc18	ldp x20,x19,[sp, #0x1c0]
0090dc1c	ldp x22,x21,[sp, #0x1b0]
0090dc20	ldp x28,x23,[sp, #0x1a0]
0090dc24	add sp,sp,#0x1e0
0090dc28	ret
0090dc2c	bl 0x00c2fec0
