; std::__ndk1::locale::locale @ 00bfadec
00bfadec	bti c
00bfadf0	ldr x8,[x1]
00bfadf4	adrp x9,0xd27000
00bfadf8	add x9,x9,#0x100
00bfadfc	cmp x8,x9
00bfae00	str x8,[x0]
00bfae04	b.eq 0x00bfae28
00bfae08	paciasp
00bfae0c	stp x29,x30,[sp, #-0x10]!
00bfae10	mov x29,sp
00bfae14	add x1,x8,#0x8
00bfae18	mov w0,#0x1
00bfae1c	bl 0x00c2bce0
00bfae20	ldp x29,x30,[sp], #0x10
00bfae24	autiasp
00bfae28	ret
