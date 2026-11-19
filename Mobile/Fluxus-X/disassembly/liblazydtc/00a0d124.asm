; CONF_get_string @ 00a0d124
00a0d124	sub sp,sp,#0x60
00a0d128	stp x20,x19,[sp, #0x40]
00a0d12c	mov x19,x2
00a0d130	mov x20,x1
00a0d134	stp x22,x21,[sp, #0x30]
00a0d138	stp x29,x30,[sp, #0x50]
00a0d13c	add x29,sp,#0x50
00a0d140	cbz x0,0x00a0d1bc
00a0d144	adrp x22,0xd21000
00a0d148	mov x21,x0
00a0d14c	ldr x0,[x22, #0x950]
00a0d150	cbnz x0,0x00a0d15c
00a0d154	bl 0x00c39420
00a0d158	str x0,[x22, #0x950]
00a0d15c	ldr x8,[x0, #0x10]
00a0d160	mov x0,sp
00a0d164	blr x8
00a0d168	mov x0,sp
00a0d16c	mov x1,x20
00a0d170	mov x2,x19
00a0d174	str x21,[sp, #0x10]
00a0d178	bl 0x00c393f0
00a0d17c	cbnz x0,0x00a0d1fc
00a0d180	bl 0x00c342a0
00a0d184	adrp x0,0x2af000
00a0d188	adrp x2,0x2cd000
00a0d18c	add x0,x0,#0xd73
00a0d190	add x2,x2,#0x8b3
00a0d194	mov w1,#0x13b
00a0d198	bl 0x00c342b0
00a0d19c	adrp x2,0x2bd000
00a0d1a0	add x2,x2,#0x829
00a0d1a4	orr w0,wzr,#0xe
00a0d1a8	mov w1,#0x6c
00a0d1ac	mov x3,x20
00a0d1b0	mov x4,x19
00a0d1b4	bl 0x00c342c0
00a0d1b8	b 0x00a0d1f8
00a0d1bc	mov x1,x20
00a0d1c0	mov x2,x19
00a0d1c4	bl 0x00c393f0
00a0d1c8	cbnz x0,0x00a0d1fc
00a0d1cc	bl 0x00c342a0
00a0d1d0	adrp x0,0x2af000
00a0d1d4	adrp x2,0x2cd000
00a0d1d8	add x0,x0,#0xd73
00a0d1dc	add x2,x2,#0x8b3
00a0d1e0	mov w1,#0x138
00a0d1e4	bl 0x00c342b0
00a0d1e8	orr w0,wzr,#0xe
00a0d1ec	mov w1,#0x6a
00a0d1f0	mov x2,xzr
00a0d1f4	bl 0x00c342c0
00a0d1f8	mov x0,xzr
00a0d1fc	ldp x29,x30,[sp, #0x50]
00a0d200	ldp x20,x19,[sp, #0x40]
00a0d204	ldp x22,x21,[sp, #0x30]
00a0d208	add sp,sp,#0x60
00a0d20c	ret
