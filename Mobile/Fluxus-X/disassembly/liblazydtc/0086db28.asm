; FUN_0086db28 @ 0086db28
0086db28	sub sp,sp,#0x70
0086db2c	stp x29,x30,[sp, #0x40]
0086db30	str x21,[sp, #0x50]
0086db34	stp x20,x19,[sp, #0x60]
0086db38	add x29,sp,#0x40
0086db3c	mrs x21,tpidr_el0
0086db40	mov x19,x1
0086db44	mov x20,x0
0086db48	ldr x8,[x21, #0x28]
0086db4c	stur x8,[x29, #-0x8]
0086db50	tbz w2,#0x0,0x0086db64
0086db54	ldr w8,[x20, #0x94]
0086db58	ldr w9,[x19, #0x14]
0086db5c	cmp w8,w9
0086db60	b.ne 0x0086dbe8
0086db64	ldur x9,[x19, #0xc]
0086db68	ldur x10,[x20, #0x94]
0086db6c	mov w1,#0x8
0086db70	ldr x0,[x20, #0xe8]
0086db74	stp x9,x10,[x29, #-0x18]
0086db78	bl 0x0084e938
0086db7c	mov w8,#0x1
0086db80	str x19,[x0]
0086db84	mov x19,sp
0086db88	stp x0,x8,[sp, #0x18]
0086db8c	mov x8,sp
0086db90	add x0,x20,#0x90
0086db94	bl 0x008521fc
0086db98	ldrb w8,[sp]
0086db9c	ldr x9,[sp, #0x10]
0086dba0	tst w8,#0x1
0086dba4	csinc x4,x9,x19,ne
0086dba8	adrp x3,0x2d7000
0086dbac	add x3,x3,#0xac
0086dbb0	sub x1,x29,#0x18
0086dbb4	add x2,sp,#0x18
0086dbb8	mov x0,x20
0086dbbc	bl 0x008659e8
0086dbc0	ldrb w8,[sp]
0086dbc4	tbz w8,#0x0,0x0086dc18
0086dbc8	ldr x8,[sp, #0x10]
0086dbcc	ldr x9,[sp]
0086dbd0	mov x19,x0
0086dbd4	and x1,x9,#-0x2
0086dbd8	mov x0,x8
0086dbdc	bl 0x00c2fe80
0086dbe0	mov x0,x19
0086dbe4	b 0x0086dc18
0086dbe8	ldr x0,[x20, #0xe8]
0086dbec	mov w1,#0x8
0086dbf0	bl 0x0084e938
0086dbf4	mov w8,#0x1
0086dbf8	str x19,[x0]
0086dbfc	adrp x3,0x2b1000
0086dc00	add x3,x3,#0x33f
0086dc04	stp x0,x8,[sp]
0086dc08	add x1,x19,#0xc
0086dc0c	mov x2,sp
0086dc10	mov x0,x20
0086dc14	bl 0x008659e8
0086dc18	ldr x8,[x21, #0x28]
0086dc1c	ldur x9,[x29, #-0x8]
0086dc20	cmp x8,x9
0086dc24	b.ne 0x0086dc70
0086dc28	ldp x20,x19,[sp, #0x60]
0086dc2c	ldr x21,[sp, #0x50]
0086dc30	ldp x29,x30,[sp, #0x40]
0086dc34	add sp,sp,#0x70
0086dc38	ret
0086dc70	bl 0x00c2fec0
