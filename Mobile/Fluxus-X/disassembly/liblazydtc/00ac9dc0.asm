; EVP_RAND_generate @ 00ac9dc0
00ac9dc0	str x25,[sp, #-0x50]!
00ac9dc4	stp x24,x23,[sp, #0x10]
00ac9dc8	stp x22,x21,[sp, #0x20]
00ac9dcc	stp x20,x19,[sp, #0x30]
00ac9dd0	stp x29,x30,[sp, #0x40]
00ac9dd4	ldr x8,[x0]
00ac9dd8	mov x20,x6
00ac9ddc	mov x21,x5
00ac9de0	mov w22,w4
00ac9de4	ldr x8,[x8, #0x78]
00ac9de8	mov w23,w3
00ac9dec	mov x24,x2
00ac9df0	mov x19,x0
00ac9df4	mov x25,x1
00ac9df8	add x29,sp,#0x40
00ac9dfc	cbz x8,0x00ac9e0c
00ac9e00	ldr x0,[x19, #0x8]
00ac9e04	blr x8
00ac9e08	cbz w0,0x00ac9e48
00ac9e0c	mov x0,x19
00ac9e10	mov x1,x25
00ac9e14	mov x2,x24
00ac9e18	mov w3,w23
00ac9e1c	mov w4,w22
00ac9e20	mov x5,x21
00ac9e24	mov x6,x20
00ac9e28	bl 0x00ac9e68
00ac9e2c	ldr x8,[x19]
00ac9e30	mov w20,w0
00ac9e34	ldr x8,[x8, #0x80]
00ac9e38	cbz x8,0x00ac9e4c
00ac9e3c	ldr x0,[x19, #0x8]
00ac9e40	blr x8
00ac9e44	b 0x00ac9e4c
00ac9e48	mov w20,wzr
00ac9e4c	mov w0,w20
00ac9e50	ldp x29,x30,[sp, #0x40]
00ac9e54	ldp x20,x19,[sp, #0x30]
00ac9e58	ldp x22,x21,[sp, #0x20]
00ac9e5c	ldp x24,x23,[sp, #0x10]
00ac9e60	ldr x25,[sp], #0x50
00ac9e64	ret
