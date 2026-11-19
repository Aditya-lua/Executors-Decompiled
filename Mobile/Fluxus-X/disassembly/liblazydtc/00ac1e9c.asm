; FUN_00ac1e9c @ 00ac1e9c
00ac1e9c	stp x24,x23,[sp, #-0x40]!
00ac1ea0	stp x20,x19,[sp, #0x20]
00ac1ea4	mov w20,wzr
00ac1ea8	stp x22,x21,[sp, #0x10]
00ac1eac	stp x29,x30,[sp, #0x30]
00ac1eb0	add x29,sp,#0x30
00ac1eb4	cbz x1,0x00ac1f54
00ac1eb8	mov w24,w2
00ac1ebc	cmp w2,#0x1
00ac1ec0	b.lt 0x00ac1f54
00ac1ec4	mov x21,x1
00ac1ec8	mov x19,x0
00ac1ecc	bl 0x00c321b0
00ac1ed0	mov x23,x0
00ac1ed4	mov x0,x19
00ac1ed8	bl 0x00c35620
00ac1edc	mov x22,x0
00ac1ee0	mov w20,wzr
00ac1ee4	cbz x23,0x00ac1f00
00ac1ee8	cbz x22,0x00ac1f00
00ac1eec	mov x0,x22
00ac1ef0	mov x1,x21
00ac1ef4	mov w2,w24
00ac1ef8	bl 0x00c34240
00ac1efc	mov w20,w0
00ac1f00	mov x0,x19
00ac1f04	bl 0x00c38620
00ac1f08	cmp w20,#0x1
00ac1f0c	b.lt 0x00ac1f28
00ac1f10	cbz w0,0x00ac1f28
00ac1f14	mov w2,w20
00ac1f18	mov x0,x23
00ac1f1c	mov x1,x21
00ac1f20	bl 0x00c31f80
00ac1f24	cbz w0,0x00ac1f44
00ac1f28	cbz x22,0x00ac1f54
00ac1f2c	orr w1,wzr,#0xf
00ac1f30	mov x0,x19
00ac1f34	bl 0x00c32190
00ac1f38	mov x0,x19
00ac1f3c	bl 0x00c38460
00ac1f40	b 0x00ac1f54
00ac1f44	orr w1,wzr,#0xf
00ac1f48	mov x0,x19
00ac1f4c	bl 0x00c32190
00ac1f50	mov w20,wzr
00ac1f54	mov w0,w20
00ac1f58	ldp x29,x30,[sp, #0x30]
00ac1f5c	ldp x20,x19,[sp, #0x20]
00ac1f60	ldp x22,x21,[sp, #0x10]
00ac1f64	ldp x24,x23,[sp], #0x40
00ac1f68	ret
