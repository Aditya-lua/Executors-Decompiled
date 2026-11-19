; std::runtime_error::operator= @ 00bc3634
00bc3634	paciasp
00bc3638	stp x29,x30,[sp, #-0x20]!
00bc363c	stp x20,x19,[sp, #0x10]
00bc3640	mov x29,sp
00bc3644	ldr x8,[x1, #0x8]
00bc3648	mov x19,x0
00bc364c	ldr x20,[x0, #0x8]
00bc3650	str x8,[x0, #0x8]
00bc3654	sub x1,x8,#0x8
00bc3658	mov w0,#0x1
00bc365c	bl 0x00c2bcb0
00bc3660	sub x1,x20,#0x8
00bc3664	mov w0,#0xffffffff
00bc3668	bl 0x00c2bcb0
00bc366c	cmp w0,#0x1
00bc3670	b.pl 0x00bc367c
00bc3674	sub x0,x20,#0x18
00bc3678	bl 0x00c301d0
00bc367c	mov x0,x19
00bc3680	ldp x20,x19,[sp, #0x10]
00bc3684	ldp x29,x30,[sp], #0x20
00bc3688	autiasp
00bc368c	ret
