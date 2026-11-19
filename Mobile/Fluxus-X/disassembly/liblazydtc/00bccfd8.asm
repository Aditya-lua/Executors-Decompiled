; std::__ndk1::recursive_timed_mutex::~recursive_timed_mutex @ 00bccfd8
00bccfd8	paciasp
00bccfdc	stp x29,x30,[sp, #-0x20]!
00bccfe0	str x19,[sp, #0x10]
00bccfe4	mov x29,sp
00bccfe8	mov x19,x0
00bccfec	bl 0x00c31ca0
00bccff0	cbnz w0,0x00bcd018
00bccff4	mov x0,x19
00bccff8	bl 0x00c31cb0
00bccffc	add x0,x19,#0x28
00bcd000	bl 0x00c31600
00bcd004	mov x0,x19
00bcd008	ldr x19,[sp, #0x10]
00bcd00c	ldp x29,x30,[sp], #0x20
00bcd010	autiasp
00bcd014	b 0x00c2fee0
00bcd018	adrp x1,0x2be000
00bcd01c	add x1,x1,#0xc42
00bcd020	bl 0x00c2ffc0
