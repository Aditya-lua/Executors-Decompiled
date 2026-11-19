; std::__ndk1::locale::operator= @ 00bfae8c
00bfae8c	paciasp
00bfae90	stp x29,x30,[sp, #-0x30]!
00bfae94	stp x22,x21,[sp, #0x10]
00bfae98	stp x20,x19,[sp, #0x20]
00bfae9c	mov x29,sp
00bfaea0	ldr x8,[x1]
00bfaea4	adrp x22,0xd27000
00bfaea8	add x22,x22,#0x100
00bfaeac	mov x19,x1
00bfaeb0	mov x20,x0
00bfaeb4	cmp x8,x22
00bfaeb8	b.eq 0x00bfaec8
00bfaebc	add x1,x8,#0x8
00bfaec0	mov w0,#0x1
00bfaec4	bl 0x00c2bce0
00bfaec8	ldr x21,[x20]
00bfaecc	cmp x21,x22
00bfaed0	b.eq 0x00bfaef4
00bfaed4	add x1,x21,#0x8
00bfaed8	mov x0,#-0x1
00bfaedc	bl 0x00c2bd10
00bfaee0	cbnz x0,0x00bfaef4
00bfaee4	ldr x8,[x21]
00bfaee8	mov x0,x21
00bfaeec	ldr x8,[x8, #0x10]
00bfaef0	blr x8
00bfaef4	ldr x8,[x19]
00bfaef8	mov x0,x20
00bfaefc	str x8,[x20]
00bfaf00	ldp x20,x19,[sp, #0x20]
00bfaf04	ldp x22,x21,[sp, #0x10]
00bfaf08	ldp x29,x30,[sp], #0x30
00bfaf0c	autiasp
00bfaf10	ret
