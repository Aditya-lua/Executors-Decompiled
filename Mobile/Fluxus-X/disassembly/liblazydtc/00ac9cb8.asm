; EVP_RAND_instantiate @ 00ac9cb8
00ac9cb8	stp x24,x23,[sp, #-0x40]!
00ac9cbc	stp x22,x21,[sp, #0x10]
00ac9cc0	stp x20,x19,[sp, #0x20]
00ac9cc4	stp x29,x30,[sp, #0x30]
00ac9cc8	ldr x8,[x0]
00ac9ccc	mov x20,x5
00ac9cd0	mov x21,x4
00ac9cd4	mov x22,x3
00ac9cd8	ldr x9,[x8, #0x78]
00ac9cdc	mov w23,w2
00ac9ce0	mov x19,x0
00ac9ce4	mov w24,w1
00ac9ce8	add x29,sp,#0x30
00ac9cec	cbz x9,0x00ac9d00
00ac9cf0	ldr x0,[x19, #0x8]
00ac9cf4	blr x9
00ac9cf8	cbz w0,0x00ac9d3c
00ac9cfc	ldr x8,[x19]
00ac9d00	ldr x8,[x8, #0x48]
00ac9d04	ldr x0,[x19, #0x8]
00ac9d08	mov w1,w24
00ac9d0c	mov w2,w23
00ac9d10	mov x3,x22
00ac9d14	mov x4,x21
00ac9d18	mov x5,x20
00ac9d1c	blr x8
00ac9d20	ldr x8,[x19]
00ac9d24	mov w20,w0
00ac9d28	ldr x8,[x8, #0x80]
00ac9d2c	cbz x8,0x00ac9d40
00ac9d30	ldr x0,[x19, #0x8]
00ac9d34	blr x8
00ac9d38	b 0x00ac9d40
00ac9d3c	mov w20,wzr
00ac9d40	mov w0,w20
00ac9d44	ldp x29,x30,[sp, #0x30]
00ac9d48	ldp x20,x19,[sp, #0x20]
00ac9d4c	ldp x22,x21,[sp, #0x10]
00ac9d50	ldp x24,x23,[sp], #0x40
00ac9d54	ret
