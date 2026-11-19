; X509_OBJECT_set1_X509 @ 00b0af58
00b0af58	str x21,[sp, #-0x30]!
00b0af5c	stp x20,x19,[sp, #0x10]
00b0af60	stp x29,x30,[sp, #0x20]
00b0af64	add x29,sp,#0x20
00b0af68	cbz x0,0x00b0afc4
00b0af6c	mov x20,x0
00b0af70	mov x0,x1
00b0af74	mov x19,x1
00b0af78	bl 0x00c350b0
00b0af7c	cbz w0,0x00b0afc4
00b0af80	ldr w8,[x20]
00b0af84	cmp w8,#0x1
00b0af88	b.eq 0x00b0afa4
00b0af8c	cmp w8,#0x2
00b0af90	b.ne 0x00b0afb4
00b0af94	mov x21,x20
00b0af98	ldr x0,[x21, #0x8]!
00b0af9c	bl 0x00c382b0
00b0afa0	b 0x00b0afb8
00b0afa4	mov x21,x20
00b0afa8	ldr x0,[x21, #0x8]!
00b0afac	bl 0x00c31a90
00b0afb0	b 0x00b0afb8
00b0afb4	add x21,x20,#0x8
00b0afb8	mov w0,#0x1
00b0afbc	str w0,[x20]
00b0afc0	str x19,[x21]
00b0afc4	ldp x29,x30,[sp, #0x20]
00b0afc8	ldp x20,x19,[sp, #0x10]
00b0afcc	ldr x21,[sp], #0x30
00b0afd0	ret
