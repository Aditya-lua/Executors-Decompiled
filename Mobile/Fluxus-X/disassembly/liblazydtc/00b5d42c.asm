; FUN_00b5d42c @ 00b5d42c
00b5d42c	stp x22,x21,[sp, #-0x30]!
00b5d430	stp x20,x19,[sp, #0x10]
00b5d434	stp x29,x30,[sp, #0x20]
00b5d438	add x29,sp,#0x20
00b5d43c	mov w20,w3
00b5d440	mov x19,x2
00b5d444	mov x22,x1
00b5d448	mov x21,x0
00b5d44c	bl 0x00c41000
00b5d450	mov w8,w0
00b5d454	mov w0,wzr
00b5d458	cbz x21,0x00b5d4ec
00b5d45c	cbz w8,0x00b5d4ec
00b5d460	cbz x22,0x00b5d498
00b5d464	ldr x0,[x21]
00b5d468	cmp w20,#0x10
00b5d46c	cset w2,eq
00b5d470	mov x1,x22
00b5d474	bl 0x00c411e0
00b5d478	cbz w0,0x00b5d4ec
00b5d47c	mov x0,x22
00b5d480	bl 0x00c3afa0
00b5d484	cbz w0,0x00b5d4ec
00b5d488	ldr x0,[x21, #0x10]
00b5d48c	bl 0x00c3a7c0
00b5d490	str x22,[x21, #0x10]
00b5d494	b 0x00b5d4a0
00b5d498	ldr x8,[x21, #0x10]
00b5d49c	cbz x8,0x00b5d4bc
00b5d4a0	mov x0,x21
00b5d4a4	mov x1,x19
00b5d4a8	str w20,[x21, #0x168]
00b5d4ac	bl 0x00b5d2a0
00b5d4b0	cmp w0,#0x0
00b5d4b4	cset w0,ne
00b5d4b8	b 0x00b5d4ec
00b5d4bc	bl 0x00c342a0
00b5d4c0	adrp x0,0x2aa000
00b5d4c4	adrp x2,0x2be000
00b5d4c8	add x0,x0,#0xfdb
00b5d4cc	add x2,x2,#0xb07
00b5d4d0	mov w1,#0x8a
00b5d4d4	bl 0x00c342b0
00b5d4d8	mov w0,#0x39
00b5d4dc	mov w1,#0x72
00b5d4e0	mov x2,xzr
00b5d4e4	bl 0x00c342c0
00b5d4e8	mov w0,wzr
00b5d4ec	ldp x29,x30,[sp, #0x20]
00b5d4f0	ldp x20,x19,[sp, #0x10]
00b5d4f4	ldp x22,x21,[sp], #0x30
00b5d4f8	ret
