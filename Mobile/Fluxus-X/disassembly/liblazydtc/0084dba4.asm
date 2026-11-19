; FUN_0084dba4 @ 0084dba4
0084dba4	stp x29,x30,[sp, #-0x20]!
0084dba8	stp x20,x19,[sp, #0x10]
0084dbac	mov x29,sp
0084dbb0	ldr x19,[x0]
0084dbb4	str xzr,[x0]
0084dbb8	cbz x19,0x0084dc0c
0084dbbc	ldrb w8,[x0, #0x10]
0084dbc0	cmp w8,#0x1
0084dbc4	b.ne 0x0084dbf8
0084dbc8	ldr x20,[x19, #0x20]
0084dbcc	cbz x20,0x0084dbf8
0084dbd0	add x1,x20,#0x8
0084dbd4	mov x0,#-0x1
0084dbd8	bl 0x00c2bd10
0084dbdc	cbnz x0,0x0084dbf8
0084dbe0	ldr x8,[x20]
0084dbe4	mov x0,x20
0084dbe8	ldr x8,[x8, #0x10]
0084dbec	blr x8
0084dbf0	mov x0,x20
0084dbf4	bl 0x00c2ff00
0084dbf8	mov x0,x19
0084dbfc	mov w1,#0x28
0084dc00	ldp x20,x19,[sp, #0x10]
0084dc04	ldp x29,x30,[sp], #0x20
0084dc08	b 0x00c2fe80
0084dc0c	ldp x20,x19,[sp, #0x10]
0084dc10	ldp x29,x30,[sp], #0x20
0084dc14	ret
