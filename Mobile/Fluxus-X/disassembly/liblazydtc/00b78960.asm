; mbedtls_md_clone @ 00b78960
00b78960	stp x29,x30,[sp, #-0x10]!
00b78964	mov x29,sp
00b78968	mov x8,x0
00b7896c	cbz x0,0x00b789cc
00b78970	mov w0,#0xffffaf00
00b78974	cbz x1,0x00b78a28
00b78978	ldr x9,[x8]
00b7897c	cbz x9,0x00b78a28
00b78980	ldr x10,[x1]
00b78984	mov w0,#0xffffaf00
00b78988	cbz x10,0x00b78a28
00b7898c	cmp x9,x10
00b78990	b.ne 0x00b78a28
00b78994	ldr w9,[x9]
00b78998	mov w0,#0xffffaf00
00b7899c	sub w9,w9,#0x3
00b789a0	cmp w9,#0x10
00b789a4	b.hi 0x00b78a28
00b789a8	adrp x10,0x77f000
00b789ac	add x10,x10,#0xa74
00b789b0	ldrsw x9,[x10, x9, LSL #0x2]
00b789b4	add x9,x9,x10
00b789b8	br x9
00b789bc	ldr x0,[x8, #0x8]
00b789c0	ldr x1,[x1, #0x8]
00b789c4	bl 0x00c42ae0
00b789c8	b 0x00b78a24
00b789cc	mov w0,#0xffffaf00
00b789d0	ldp x29,x30,[sp], #0x10
00b789d4	ret
00b789d8	ldr x0,[x8, #0x8]
00b789dc	ldr x1,[x1, #0x8]
00b789e0	bl 0x00c42a80
00b789e4	b 0x00b78a24
00b789e8	ldr x0,[x8, #0x8]
00b789ec	ldr x1,[x1, #0x8]
00b789f0	bl 0x00c42b50
00b789f4	b 0x00b78a24
00b789f8	ldr x0,[x8, #0x8]
00b789fc	ldr x1,[x1, #0x8]
00b78a00	bl 0x00c428f0
00b78a04	b 0x00b78a24
00b78a08	ldr x0,[x8, #0x8]
00b78a0c	ldr x1,[x1, #0x8]
00b78a10	bl 0x00c429a0
00b78a14	b 0x00b78a24
00b78a18	ldr x0,[x8, #0x8]
00b78a1c	ldr x1,[x1, #0x8]
00b78a20	bl 0x00c42a10
00b78a24	mov w0,wzr
00b78a28	ldp x29,x30,[sp], #0x10
00b78a2c	ret
