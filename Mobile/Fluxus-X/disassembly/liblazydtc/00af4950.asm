; X509V3_get_string @ 00af4950
00af4950	mov x8,x0
00af4954	ldr x0,[x0, #0x30]
00af4958	cbz x0,0x00af4970
00af495c	ldr x8,[x8, #0x28]
00af4960	cbz x8,0x00af4970
00af4964	ldr x3,[x8]
00af4968	cbz x3,0x00af4970
00af496c	br x3
00af4970	stp x29,x30,[sp, #-0x10]!
00af4974	mov x29,sp
00af4978	bl 0x00c342a0
00af497c	adrp x0,0x2aa000
00af4980	adrp x2,0x2aa000
00af4984	add x0,x0,#0x9f7
00af4988	add x2,x2,#0xa0d
00af498c	orr w1,wzr,#0x180
00af4990	bl 0x00c342b0
00af4994	mov w0,#0x22
00af4998	mov w1,#0x94
00af499c	mov x2,xzr
00af49a0	bl 0x00c342c0
00af49a4	mov x0,xzr
00af49a8	ldp x29,x30,[sp], #0x10
00af49ac	ret
