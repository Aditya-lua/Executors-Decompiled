; ERR_load_strings_const @ 00a5409c
00a5409c	str x21,[sp, #-0x30]!
00a540a0	stp x20,x19,[sp, #0x10]
00a540a4	stp x29,x30,[sp, #0x20]
00a540a8	add x29,sp,#0x20
00a540ac	mov x19,x0
00a540b0	bl 0x00a53eb8
00a540b4	cbz w0,0x00a540f4
00a540b8	adrp x20,0xd21000
00a540bc	ldr x0,[x20, #0xa20]
00a540c0	bl 0x00c356a0
00a540c4	cbz w0,0x00a540f0
00a540c8	ldr x8,[x19]
00a540cc	cbz x8,0x00a540e8
00a540d0	adrp x21,0xd21000
00a540d4	ldr x0,[x21, #0xa28]
00a540d8	mov x1,x19
00a540dc	bl 0x00c34dc0
00a540e0	ldr x8,[x19, #0x10]!
00a540e4	cbnz x8,0x00a540d4
00a540e8	ldr x0,[x20, #0xa20]
00a540ec	bl 0x00c35690
00a540f0	mov w0,#0x1
00a540f4	ldp x29,x30,[sp, #0x20]
00a540f8	ldp x20,x19,[sp, #0x10]
00a540fc	ldr x21,[sp], #0x30
00a54100	ret
