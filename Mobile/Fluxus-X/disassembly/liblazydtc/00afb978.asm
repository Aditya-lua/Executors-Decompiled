; X509_POLICY_NODE_print @ 00afb978
00afb978	stp x22,x21,[sp, #-0x30]!
00afb97c	stp x20,x19,[sp, #0x10]
00afb980	stp x29,x30,[sp, #0x20]
00afb984	ldr x22,[x1]
00afb988	adrp x21,0x2ab000
00afb98c	adrp x1,0x2ba000
00afb990	add x21,x21,#0x32c
00afb994	add x1,x1,#0x7a1
00afb998	mov x3,x21
00afb99c	add x29,sp,#0x20
00afb9a0	mov w20,w2
00afb9a4	mov x19,x0
00afb9a8	bl 0x00c32250
00afb9ac	ldr x1,[x22, #0x8]
00afb9b0	mov x0,x19
00afb9b4	bl 0x00c32da0
00afb9b8	adrp x1,0x2c4000
00afb9bc	add x1,x1,#0xdae
00afb9c0	mov x0,x19
00afb9c4	bl 0x00c32260
00afb9c8	ldr w8,[x22]
00afb9cc	adrp x9,0x2b8000
00afb9d0	adrp x10,0x2ca000
00afb9d4	add w20,w20,#0x2
00afb9d8	add x9,x9,#0x71a
00afb9dc	add x10,x10,#0x45c
00afb9e0	tst w8,#0x10
00afb9e4	adrp x1,0x2c2000
00afb9e8	csel x4,x10,x9,eq
00afb9ec	add x1,x1,#0x4ea
00afb9f0	mov x0,x19
00afb9f4	mov w2,w20
00afb9f8	mov x3,x21
00afb9fc	bl 0x00c32250
00afba00	ldr x1,[x22, #0x10]
00afba04	cbz x1,0x00afba30
00afba08	mov x0,x19
00afba0c	mov w2,w20
00afba10	bl 0x00afba58
00afba14	mov x0,x19
00afba18	ldp x29,x30,[sp, #0x20]
00afba1c	ldp x20,x19,[sp, #0x10]
00afba20	adrp x1,0x2c4000
00afba24	add x1,x1,#0xdae
00afba28	ldp x22,x21,[sp], #0x30
00afba2c	b 0x00c32260
00afba30	mov x0,x19
00afba34	mov w2,w20
00afba38	ldp x29,x30,[sp, #0x20]
00afba3c	ldp x20,x19,[sp, #0x10]
00afba40	adrp x1,0x2da000
00afba44	adrp x3,0x2ab000
00afba48	add x1,x1,#0x690
00afba4c	add x3,x3,#0x32c
00afba50	ldp x22,x21,[sp], #0x30
00afba54	b 0x00c32250
