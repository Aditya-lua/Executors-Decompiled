; mbedtls_md_starts @ 00b78b8c
00b78b8c	cbz x0,0x00b78bc4
00b78b90	ldr x8,[x0]
00b78b94	cbz x8,0x00b78bc4
00b78b98	ldr w8,[x8]
00b78b9c	sub w8,w8,#0x3
00b78ba0	cmp w8,#0x10
00b78ba4	b.hi 0x00b78bc4
00b78ba8	adrp x9,0x77f000
00b78bac	add x9,x9,#0xafc
00b78bb0	ldrsw x8,[x9, x8, LSL #0x2]
00b78bb4	add x8,x8,x9
00b78bb8	br x8
00b78bbc	ldr x0,[x0, #0x8]
00b78bc0	b 0x00c42930
00b78bc4	mov w0,#0xffffaf00
00b78bc8	ret
00b78bcc	ldr x0,[x0, #0x8]
00b78bd0	b 0x00c429e0
00b78bd4	ldr x0,[x0, #0x8]
00b78bd8	b 0x00c42a50
00b78bdc	ldr x0,[x0, #0x8]
00b78be0	mov w1,#0x1
00b78be4	b 0x00c42ac0
00b78be8	ldr x0,[x0, #0x8]
00b78bec	mov w1,wzr
00b78bf0	b 0x00c42ac0
00b78bf4	ldr x0,[x0, #0x8]
00b78bf8	mov w1,#0x1
00b78bfc	b 0x00c42b90
00b78c00	ldr x0,[x0, #0x8]
00b78c04	mov w1,wzr
00b78c08	b 0x00c42b90
00b78c0c	ldr x0,[x0, #0x8]
00b78c10	mov w1,#0x1
00b78c14	b 0x00c42b20
00b78c18	ldr x0,[x0, #0x8]
00b78c1c	mov w1,#0x2
00b78c20	b 0x00c42b20
00b78c24	ldr x0,[x0, #0x8]
00b78c28	orr w1,wzr,#0x3
00b78c2c	b 0x00c42b20
00b78c30	ldr x0,[x0, #0x8]
00b78c34	mov w1,#0x4
00b78c38	b 0x00c42b20
