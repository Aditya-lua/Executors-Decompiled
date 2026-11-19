; EVP_PBE_alg_add @ 00a69cbc
00a69cbc	stp x22,x21,[sp, #-0x30]!
00a69cc0	stp x20,x19,[sp, #0x10]
00a69cc4	mov x19,x3
00a69cc8	mov x22,x2
00a69ccc	mov w20,w0
00a69cd0	stp x29,x30,[sp, #0x20]
00a69cd4	add x29,sp,#0x20
00a69cd8	cbz x1,0x00a69cfc
00a69cdc	mov x0,x1
00a69ce0	bl 0x00c3ccf0
00a69ce4	mov w21,w0
00a69ce8	cbz x22,0x00a69d04
00a69cec	mov x0,x22
00a69cf0	bl 0x00c34c30
00a69cf4	mov w3,w0
00a69cf8	b 0x00a69d08
00a69cfc	mov w21,#0xffffffff
00a69d00	cbnz x22,0x00a69cec
00a69d04	mov w3,#0xffffffff
00a69d08	mov w1,w20
00a69d0c	mov x4,x19
00a69d10	ldp x29,x30,[sp, #0x20]
00a69d14	ldp x20,x19,[sp, #0x10]
00a69d18	mov w0,wzr
00a69d1c	mov w2,w21
00a69d20	ldp x22,x21,[sp], #0x30
00a69d24	b 0x00a69ba4
