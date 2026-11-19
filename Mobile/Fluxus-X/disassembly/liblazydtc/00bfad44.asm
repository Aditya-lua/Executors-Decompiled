; std::__ndk1::locale::locale @ 00bfad44
00bfad44	paciasp
00bfad48	stp x29,x30,[sp, #-0x20]!
00bfad4c	str x19,[sp, #0x10]
00bfad50	mov x29,sp
00bfad54	adrp x8,0xd27000
00bfad58	add x8,x8,#0x250
00bfad5c	mov x19,x0
00bfad60	ldarb w8,[x8]
00bfad64	tbz w8,#0x0,0x00bfada0
00bfad68	adrp x8,0xd27000
00bfad6c	adrp x9,0xd27000
00bfad70	add x9,x9,#0x100
00bfad74	ldr x8,[x8, #0x248]
00bfad78	cmp x8,x9
00bfad7c	str x8,[x19]
00bfad80	b.eq 0x00bfad90
00bfad84	add x1,x8,#0x8
00bfad88	mov w0,#0x1
00bfad8c	bl 0x00c2bce0
00bfad90	ldr x19,[sp, #0x10]
00bfad94	ldp x29,x30,[sp], #0x20
00bfad98	autiasp
00bfad9c	ret
00bfada0	adrp x0,0xd27000
00bfada4	add x0,x0,#0x250
00bfada8	bl 0x00c2fe90
00bfadac	cbz w0,0x00bfad68
00bfadb0	bl 0x00c44420
00bfadb4	mov x1,x0
00bfadb8	adrp x0,0xd27000
00bfadbc	add x0,x0,#0x248
00bfadc0	bl 0x00c30660
00bfadc4	adrp x0,0xd27000
00bfadc8	add x0,x0,#0x250
00bfadcc	bl 0x00c2fea0
00bfadd0	b 0x00bfad68
